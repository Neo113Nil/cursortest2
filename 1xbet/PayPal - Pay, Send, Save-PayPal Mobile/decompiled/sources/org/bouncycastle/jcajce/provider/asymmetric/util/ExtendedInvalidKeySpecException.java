package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class ExtendedInvalidKeySpecException extends java.security.spec.InvalidKeySpecException {
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public ExtendedInvalidKeySpecException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = th;
    }
}
