package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class StreamParsingException extends java.lang.Exception {
    java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public StreamParsingException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }
}
