package org.bouncycastle.jce.exception;

/* loaded from: classes17.dex */
public class ExtIOException extends java.io.IOException implements org.bouncycastle.jce.exception.ExtException {
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ExtIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }
}
