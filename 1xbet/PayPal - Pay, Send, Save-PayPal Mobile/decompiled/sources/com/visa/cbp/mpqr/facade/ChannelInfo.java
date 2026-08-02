package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class ChannelInfo {
    private java.lang.String encryptionScheme;

    public void init() {
        this.encryptionScheme = "RSA_PKI";
    }

    public java.lang.String getEncryptionScheme() {
        return this.encryptionScheme;
    }

    public void setEncryptionScheme(java.lang.String str) {
        this.encryptionScheme = str;
    }
}
