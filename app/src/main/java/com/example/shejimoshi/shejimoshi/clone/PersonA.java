package com.example.shejimoshi.shejimoshi.clone;

import java.util.List;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class PersonA implements Cloneable{

    private String name;

    private int age;

    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() {
        PersonA person = null;
        try {
            person = (PersonA) super.clone();
            person.name = this.name;
            person.age = this.age;
            person.hobbies = this.hobbies;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
