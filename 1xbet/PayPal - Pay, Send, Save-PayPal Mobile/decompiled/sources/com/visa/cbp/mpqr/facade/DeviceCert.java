package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class DeviceCert {
    private java.lang.String certFormat;
    private java.lang.String certUsage;
    private java.lang.String certValue;

    public void init(java.lang.String str, java.lang.String str2) {
        this.certUsage = str;
        this.certFormat = "X509";
        this.certValue = str2;
    }

    public java.lang.String getCertUsage() {
        return this.certUsage;
    }

    public void setCertUsage(java.lang.String str) {
        this.certUsage = str;
    }

    public java.lang.String getCertFormat() {
        return this.certFormat;
    }

    public void setCertFormat(java.lang.String str) {
        this.certFormat = str;
    }

    public java.lang.String getCertValue() {
        return this.certValue;
    }

    public void setCertValue(java.lang.String str) {
        this.certValue = str;
    }
}
