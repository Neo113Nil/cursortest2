package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class VisaPaymentMPQRException extends java.lang.RuntimeException {
    protected int code;
    protected java.lang.String message;

    public VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType mpqrErrorType) {
        this.code = mpqrErrorType.getCode();
        this.message = mpqrErrorType.getMessage();
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }
}
