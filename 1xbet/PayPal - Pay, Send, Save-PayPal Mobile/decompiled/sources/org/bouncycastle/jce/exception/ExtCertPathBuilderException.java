package org.bouncycastle.jce.exception;

/* loaded from: classes17.dex */
public class ExtCertPathBuilderException extends java.security.cert.CertPathBuilderException implements org.bouncycastle.jce.exception.ExtException {
    private java.lang.Throwable Camera2StreamConfigurationMap;

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public java.lang.Throwable getCause() {
        return this.Camera2StreamConfigurationMap;
    }

    public ExtCertPathBuilderException(java.lang.String str, java.lang.Throwable th, java.security.cert.CertPath certPath, int i) {
        super(str, th);
        this.Camera2StreamConfigurationMap = th;
    }

    public ExtCertPathBuilderException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
    }
}
