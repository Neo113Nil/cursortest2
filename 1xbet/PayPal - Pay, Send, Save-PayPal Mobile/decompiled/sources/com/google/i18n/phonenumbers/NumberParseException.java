package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public class NumberParseException extends java.lang.Exception {
    private com.google.i18n.phonenumbers.NumberParseException.ErrorType errorType;
    private java.lang.String message;

    public enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType errorType, java.lang.String str) {
        super(str);
        this.message = str;
        this.errorType = errorType;
    }

    public com.google.i18n.phonenumbers.NumberParseException.ErrorType getErrorType() {
        return this.errorType;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error type: ");
        sb.append(this.errorType);
        sb.append(". ");
        sb.append(this.message);
        return sb.toString();
    }
}
