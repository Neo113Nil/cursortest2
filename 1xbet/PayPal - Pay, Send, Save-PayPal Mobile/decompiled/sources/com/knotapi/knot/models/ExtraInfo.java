package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class ExtraInfo {
    public java.lang.String interceptedValues;
    public java.lang.String userAgent;
    public java.util.HashMap<java.lang.String, java.lang.String> interceptedHashmap = new java.util.HashMap<>();
    public java.lang.String loggedInPage = "";
    public java.lang.String intentRedirection = "";

    public java.lang.String getIntentRedirection() {
        return this.intentRedirection;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getInterceptedHashmap() {
        return this.interceptedHashmap;
    }

    public java.lang.String getInterceptedValues() {
        return this.interceptedValues;
    }

    public java.lang.String getLoggedInPage() {
        return this.loggedInPage;
    }

    public java.lang.String getUserAgent() {
        return this.userAgent;
    }

    public void setIntentRedirection(java.lang.String str) {
        this.intentRedirection = str;
    }

    public void setInterceptedHashmap(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.interceptedHashmap = hashMap;
    }

    public void setInterceptedValues(java.lang.String str) {
        this.interceptedValues = str;
    }

    public void setLoggedInPage(java.lang.String str) {
        this.loggedInPage = str;
    }

    public void setUserAgent(java.lang.String str) {
        this.userAgent = str;
    }
}
