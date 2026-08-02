package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCSIOException extends java.io.IOException {
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public PKCSIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    public PKCSIOException(java.lang.String str) {
        super(str);
    }
}
