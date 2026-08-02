package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAttributeTableGenerationException extends org.bouncycastle.cms.CMSRuntimeException {
    java.lang.Exception getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.cms.CMSRuntimeException
    public java.lang.Exception getUnderlyingException() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException, java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CMSAttributeTableGenerationException(java.lang.String str, java.lang.Exception exc) {
        super(str);
        this.getHighSpeedVideoFpsRanges = exc;
    }

    public CMSAttributeTableGenerationException(java.lang.String str) {
        super(str);
    }
}
