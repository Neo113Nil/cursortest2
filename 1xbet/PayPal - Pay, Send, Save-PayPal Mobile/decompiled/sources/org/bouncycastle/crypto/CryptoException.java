package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class CryptoException extends java.lang.Exception {
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public CryptoException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    public CryptoException(java.lang.String str) {
        super(str);
    }

    public CryptoException() {
    }
}
