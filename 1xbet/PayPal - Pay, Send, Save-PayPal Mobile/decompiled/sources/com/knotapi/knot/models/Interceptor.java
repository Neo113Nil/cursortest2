package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class Interceptor {
    java.lang.String interceptType;
    boolean isSendToServer;
    boolean isUrlRegex;
    java.lang.String replaceKey;
    java.lang.String replaceType;
    java.lang.String replaceValue;
    java.lang.String serverKey;
    java.lang.String url;

    public Interceptor(java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.url = str;
        this.isUrlRegex = z;
        this.isSendToServer = z2;
        this.serverKey = str2;
        this.interceptType = str3;
        this.replaceType = str4;
        this.replaceKey = str5;
        this.replaceValue = str6;
    }

    public java.lang.String getInterceptType() {
        return this.interceptType;
    }

    public java.lang.String getReplaceKey() {
        return this.replaceKey;
    }

    public java.lang.String getReplaceType() {
        return this.replaceType;
    }

    public java.lang.String getReplaceValue() {
        return this.replaceValue;
    }

    public java.lang.String getServerKey() {
        return this.serverKey;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public boolean isSendToServer() {
        return this.isSendToServer;
    }

    public boolean isUrlRegex() {
        return this.isUrlRegex;
    }

    public void setInterceptType(java.lang.String str) {
        this.interceptType = str;
    }

    public void setReplaceKey(java.lang.String str) {
        this.replaceKey = str;
    }

    public void setReplaceType(java.lang.String str) {
        this.replaceType = str;
    }

    public void setReplaceValue(java.lang.String str) {
        this.replaceValue = str;
    }

    public void setSendToServer(boolean z) {
        this.isSendToServer = z;
    }

    public void setServerKey(java.lang.String str) {
        this.serverKey = str;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }

    public void setUrlRegex(boolean z) {
        this.isUrlRegex = z;
    }
}
