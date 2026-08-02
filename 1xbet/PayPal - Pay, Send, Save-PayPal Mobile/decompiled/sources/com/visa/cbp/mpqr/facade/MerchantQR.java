package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class MerchantQR {
    private java.lang.String len;

    /* renamed from: name, reason: collision with root package name */
    private java.lang.String f6679name;
    private java.lang.String tag;
    private java.lang.String value;

    public MerchantQR(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.tag = str;
        this.f6679name = str2;
        this.len = str3;
        this.value = str4;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    public java.lang.String getName() {
        return this.f6679name;
    }

    public void setName(java.lang.String str) {
        this.f6679name = str;
    }

    public java.lang.String getLen() {
        return this.len;
    }

    public void setLen(java.lang.String str) {
        this.len = str;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public void setValue(java.lang.String str) {
        this.value = str;
    }
}
