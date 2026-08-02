package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class GOST3410Parameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.GOST3410ValidationParameters Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public org.bouncycastle.crypto.params.GOST3410ValidationParameters getValidationParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getQ() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.GOST3410Parameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters = (org.bouncycastle.crypto.params.GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.getHighSpeedVideoSizes) && gOST3410Parameters.getQ().equals(this.getHighResolutionOutputSizeshNQ4ISI) && gOST3410Parameters.getA().equals(this.getHighSpeedVideoFpsRangesFor);
    }

    public GOST3410Parameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, org.bouncycastle.crypto.params.GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger2;
        this.Camera2StreamConfigurationMap = gOST3410ValidationParameters;
    }

    public GOST3410Parameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
    }
}
