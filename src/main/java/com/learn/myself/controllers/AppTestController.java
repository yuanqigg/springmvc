package com.learn.myself.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class AppTestController {

    @GetMapping("/get")

    public String getTest(){

        return "HELLO WORD";
    }

}
