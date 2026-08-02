package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class StoreException extends java.lang.RuntimeException {
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public StoreException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = th;
    }
}
