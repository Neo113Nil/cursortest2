package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class GOST3410PublicKeySpec implements java.security.spec.KeySpec {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getA() {
        return this.Camera2StreamConfigurationMap;
    }

    public GOST3410PublicKeySpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighSpeedVideoFpsRanges = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        this.Camera2StreamConfigurationMap = bigInteger4;
    }
}
