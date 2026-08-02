package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class RSAPrivateCrtKeyParameters extends org.bouncycastle.crypto.params.RSAKeyParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private java.math.BigInteger getOutputFormats;

    public java.math.BigInteger getQInv() {
        return this.getOutputFormats;
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.math.BigInteger getPublicExponent() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getDQ() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getDP() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public RSAPrivateCrtKeyParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.math.BigInteger bigInteger6, java.math.BigInteger bigInteger7, java.math.BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.Camera2StreamConfigurationMap = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger4;
        this.getHighSpeedVideoSizesFor = bigInteger5;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger6;
        this.getHighSpeedVideoFpsRanges = bigInteger7;
        this.getOutputFormats = bigInteger8;
    }
}
