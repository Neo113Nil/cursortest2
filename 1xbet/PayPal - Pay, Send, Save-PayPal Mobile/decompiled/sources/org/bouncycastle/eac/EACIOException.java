package org.bouncycastle.eac;

/* loaded from: classes17.dex */
public class EACIOException extends java.io.IOException {
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public EACIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public EACIOException(java.lang.String str) {
        super(str);
    }
}
