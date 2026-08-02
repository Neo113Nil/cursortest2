package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class OCSPException extends java.lang.Exception {
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public OCSPException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    public OCSPException(java.lang.String str) {
        super(str);
    }
}
