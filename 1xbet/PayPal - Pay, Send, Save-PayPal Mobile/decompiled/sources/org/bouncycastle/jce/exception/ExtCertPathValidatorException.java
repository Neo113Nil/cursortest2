package org.bouncycastle.jce.exception;

/* loaded from: classes17.dex */
public class ExtCertPathValidatorException extends java.security.cert.CertPathValidatorException implements org.bouncycastle.jce.exception.ExtException {
    private java.lang.Throwable getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ExtCertPathValidatorException(java.lang.String str, java.lang.Throwable th, java.security.cert.CertPath certPath, int i) {
        super(str, th, certPath, i);
        this.getHighSpeedVideoFpsRanges = th;
    }

    public ExtCertPathValidatorException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRanges = th;
    }

    public ExtCertPathValidatorException(java.lang.String str) {
        super(str);
    }
}
