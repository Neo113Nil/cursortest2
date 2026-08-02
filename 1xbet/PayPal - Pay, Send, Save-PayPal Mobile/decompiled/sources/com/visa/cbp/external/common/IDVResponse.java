package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class IDVResponse extends com.visa.cbp.external.common.JsonConverter {
    java.lang.String codeExpiration;
    java.lang.String maxOTPRequestsAllowed;
    java.lang.String maxOTPVerificationAllowed;

    public java.lang.String getMaxOTPVerificationAllowed() {
        return this.maxOTPVerificationAllowed;
    }

    public void setMaxOTPVerificationAllowed(java.lang.String str) {
        this.maxOTPVerificationAllowed = str;
    }

    public java.lang.String getMaxOTPRequestsAllowed() {
        return this.maxOTPRequestsAllowed;
    }

    public void setMaxOTPRequestsAllowed(java.lang.String str) {
        this.maxOTPRequestsAllowed = str;
    }

    public java.lang.String getCodeExpiration() {
        return this.codeExpiration;
    }

    public void setCodeExpiration(java.lang.String str) {
        this.codeExpiration = str;
    }
}
