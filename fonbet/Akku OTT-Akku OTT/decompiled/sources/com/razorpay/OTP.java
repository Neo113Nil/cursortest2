package com.razorpay;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class OTP {
    String bank;
    String pin;
    String sender;

    public OTP(String str, String str2, String str3) {
        this.pin = str;
        this.bank = str2;
        this.sender = str3;
        l$1_I$l$();
    }

    private void l$1_I$l$() {
        if (!Pattern.compile("^\\d").matcher(this.pin).find()) {
            this.pin = this.pin.substring(1);
        }
        if (Pattern.compile("\\d$").matcher(this.pin).find()) {
            return;
        }
        String str = this.pin;
        this.pin = str.substring(0, str.length() - 1);
    }

    public String getBank() {
        return this.bank;
    }

    public String getPin() {
        return this.pin;
    }

    public String getSender() {
        return this.sender;
    }

    public String toString() {
        return "Pin: " + this.pin + " bank: " + this.bank + " sender: " + this.sender;
    }
}
