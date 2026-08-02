package com.visa.cbp.encryptionutils.exceptions;

/* loaded from: classes16.dex */
public class TokenException extends java.lang.Exception {
    private static final long serialVersionUID = 6036661554944935373L;
    private final com.visa.cbp.encryptionutils.exceptions.ExceptionType getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public TokenException(java.lang.String str, com.visa.cbp.encryptionutils.exceptions.ExceptionType exceptionType) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = exceptionType;
    }

    public TokenException(java.lang.String str, com.visa.cbp.encryptionutils.exceptions.ExceptionType exceptionType, java.lang.String str2) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoFpsRanges = exceptionType;
    }

    public TokenException(java.lang.String str, com.visa.cbp.encryptionutils.exceptions.ExceptionType exceptionType, java.lang.Throwable th) {
        super(str, th);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = exceptionType;
    }

    public java.lang.String getRootCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.visa.cbp.encryptionutils.exceptions.ExceptionType getType() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
