package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class EncoderException extends java.lang.IllegalStateException {
    private java.lang.Throwable cause;

    EncoderException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.cause;
    }
}
