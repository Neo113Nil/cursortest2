package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class AnnotatedException extends java.lang.Exception implements org.bouncycastle.jce.exception.ExtException {
    java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public AnnotatedException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    public AnnotatedException(java.lang.String str) {
        this(str, null);
    }
}
