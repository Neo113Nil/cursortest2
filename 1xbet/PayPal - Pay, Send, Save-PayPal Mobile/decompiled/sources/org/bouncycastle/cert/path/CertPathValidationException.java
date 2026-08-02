package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
public class CertPathValidationException extends java.lang.Exception {
    private final java.lang.Exception getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public CertPathValidationException(java.lang.String str, java.lang.Exception exc) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = exc;
    }

    public CertPathValidationException(java.lang.String str) {
        this(str, null);
    }
}
