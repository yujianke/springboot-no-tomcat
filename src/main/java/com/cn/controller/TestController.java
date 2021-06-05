package com.cn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("abc")
public class TestController {
    @Value("${yjk.name}")
    private  String Stringname;

    @RequestMapping("de")
    public String abc(){
        return Stringname;
    }
}
