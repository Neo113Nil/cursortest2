package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class CertException extends java.lang.Exception {
    private java.lang.Throwable getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CertException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRanges = th;
    }

    public CertException(java.lang.String str) {
        super(str);
    }
}
