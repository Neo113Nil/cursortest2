package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class CRMFException extends java.lang.Exception {
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public CRMFException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public CRMFException(java.lang.String str) {
        this(str, null);
    }
}
