package org.bouncycastle.x509;

/* loaded from: classes17.dex */
class ExtCertificateEncodingException extends java.security.cert.CertificateEncodingException {
    java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    ExtCertificateEncodingException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }
}
