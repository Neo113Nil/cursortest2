package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class GOST3410PrivateKeySpec implements java.security.spec.KeySpec {
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public java.math.BigInteger getX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public GOST3410PrivateKeySpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        this.getHighSpeedVideoFpsRanges = bigInteger4;
    }
}
