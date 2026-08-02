package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class CertIOException extends java.io.IOException {
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public CertIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public CertIOException(java.lang.String str) {
        super(str);
    }
}
