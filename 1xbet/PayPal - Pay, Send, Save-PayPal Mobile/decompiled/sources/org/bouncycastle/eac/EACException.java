package org.bouncycastle.eac;

/* loaded from: classes17.dex */
public class EACException extends java.lang.Exception {
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public EACException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = th;
    }

    public EACException(java.lang.String str) {
        super(str);
    }
}
