package com.visa.cbp.encryptionutils.exceptions;

/* loaded from: classes16.dex */
public class VisaSDKMapUtilException extends java.lang.RuntimeException {
    protected int code;

    public VisaSDKMapUtilException(int i, java.lang.String str) {
        super(str);
        this.code = i;
    }

    public VisaSDKMapUtilException(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
