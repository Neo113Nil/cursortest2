package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSException extends java.lang.Exception {
    private final java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public ERSException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public ERSException(java.lang.String str) {
        this(str, null);
    }
}
