package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
public class ImprintDigestInvalidException extends java.lang.Exception {
    private org.bouncycastle.tsp.TimeStampToken getHighSpeedVideoFpsRanges;

    public org.bouncycastle.tsp.TimeStampToken getTimeStampToken() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ImprintDigestInvalidException(java.lang.String str, org.bouncycastle.tsp.TimeStampToken timeStampToken) {
        super(str);
        this.getHighSpeedVideoFpsRanges = timeStampToken;
    }
}
