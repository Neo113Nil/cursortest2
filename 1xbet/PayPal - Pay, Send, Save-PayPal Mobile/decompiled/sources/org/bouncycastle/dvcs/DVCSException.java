package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class DVCSException extends java.lang.Exception {
    private static final long serialVersionUID = 389345256020131488L;
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public DVCSException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = th;
    }

    public DVCSException(java.lang.String str) {
        super(str);
    }
}
