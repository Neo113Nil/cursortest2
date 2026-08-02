package org.bouncycastle.jce.exception;

/* loaded from: classes17.dex */
public class ExtCertificateEncodingException extends java.security.cert.CertificateEncodingException implements org.bouncycastle.jce.exception.ExtException {
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public ExtCertificateEncodingException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = th;
    }
}
