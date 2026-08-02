package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXNameConstraintValidatorException extends java.lang.Exception {
    private java.lang.Throwable getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public PKIXNameConstraintValidatorException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRanges = th;
    }

    public PKIXNameConstraintValidatorException(java.lang.String str) {
        super(str);
    }
}
