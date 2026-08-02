package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class CipherIOException extends java.io.IOException {
    private static final long serialVersionUID = 1;
    private final java.lang.Throwable getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CipherIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRanges = th;
    }
}
