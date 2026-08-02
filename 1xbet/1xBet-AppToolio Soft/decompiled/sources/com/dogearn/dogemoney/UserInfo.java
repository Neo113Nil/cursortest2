package com.dogearn.dogemoney;

/* loaded from: classes.dex */
public class UserInfo {
    public String userEmail;
    public String userName;
    public String userPhone;
    public String userPoints;

    public UserInfo() {
    }

    public UserInfo(String str, String str2, String str3, String str4) {
        this.userPhone = str;
        this.userEmail = str2;
        this.userName = str3;
        this.userPoints = str4;
    }

    public String getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(String str) {
        this.userPhone = str;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String str) {
        this.userEmail = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getUserPoints() {
        return this.userPoints;
    }

    public void setUserPoints(String str) {
        this.userPoints = str;
    }
}
