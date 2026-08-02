package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1ParsingException extends java.lang.IllegalStateException {
    private java.lang.Throwable getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ASN1ParsingException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRanges = th;
    }

    public ASN1ParsingException(java.lang.String str) {
        super(str);
    }
}
