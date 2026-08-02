package org.bouncycastle.util.io.pem;

/* loaded from: classes17.dex */
public class PemGenerationException extends java.io.IOException {
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public PemGenerationException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public PemGenerationException(java.lang.String str) {
        super(str);
    }
}
