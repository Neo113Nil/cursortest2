package com.adjust.sdk;

/* loaded from: classes7.dex */
public class LicenseData {
    private final int responseCode;
    private final java.lang.String signature;
    private final java.lang.String signedData;

    public LicenseData(java.lang.String str, java.lang.String str2, int i) {
        this.signedData = str;
        this.signature = str2;
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    public java.lang.String getSignedData() {
        return this.signedData;
    }

    public boolean isValid() {
        java.lang.String str = this.signedData;
        return (str == null || this.signature == null || str.isEmpty() || this.signature.isEmpty()) ? false : true;
    }
}
