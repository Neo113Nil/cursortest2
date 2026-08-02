package org.bouncycastle.cmc;

/* loaded from: classes17.dex */
public class CMCException extends java.lang.Exception {
    private final java.lang.Throwable getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CMCException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRanges = th;
    }

    public CMCException(java.lang.String str) {
        this(str, null);
    }
}
