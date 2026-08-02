package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAParameters implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.params.DSAValidationParameters getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public org.bouncycastle.crypto.params.DSAValidationParameters getValidationParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getG() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.DSAParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.DSAParameters dSAParameters = (org.bouncycastle.crypto.params.DSAParameters) obj;
        return dSAParameters.getP().equals(this.getHighSpeedVideoFpsRanges) && dSAParameters.getQ().equals(this.getHighSpeedVideoSizes) && dSAParameters.getG().equals(this.getHighSpeedVideoFpsRangesFor);
    }

    public DSAParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, org.bouncycastle.crypto.params.DSAValidationParameters dSAValidationParameters) {
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighResolutionOutputSizeshNQ4ISI = dSAValidationParameters;
    }

    public DSAParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
    }
}
