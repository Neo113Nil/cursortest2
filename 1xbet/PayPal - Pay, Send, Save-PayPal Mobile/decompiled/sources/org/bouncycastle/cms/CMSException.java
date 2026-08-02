package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSException extends java.lang.Exception {
    java.lang.Exception getHighSpeedVideoSizes;

    public java.lang.Exception getUnderlyingException() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoSizes;
    }

    public CMSException(java.lang.String str, java.lang.Exception exc) {
        super(str);
        this.getHighSpeedVideoSizes = exc;
    }

    public CMSException(java.lang.String str) {
        super(str);
    }
}
