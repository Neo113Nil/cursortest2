package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TSPIOException extends java.io.IOException {
    java.lang.Throwable getHighSpeedVideoSizes;

    public java.lang.Exception getUnderlyingException() {
        return (java.lang.Exception) this.getHighSpeedVideoSizes;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public TSPIOException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public TSPIOException(java.lang.String str) {
        super(str);
    }
}
