package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
class MpqrError {
    int errorCode;
    java.lang.String errorMessage = "";

    public MpqrError(int i) {
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getErrorMessage() {
        return this.errorMessage;
    }
}
