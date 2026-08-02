package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHParameters implements org.bouncycastle.crypto.CipherParameters {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.params.DHValidationParameters getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputSizeshNQ4ISI;

    public DHParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, (i == 0 || i >= 160) ? 160 : i, i, null, null);
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public org.bouncycastle.crypto.params.DHValidationParameters getValidationParameters() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.math.BigInteger getQ() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoSizes;
    }

    public int getM() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getL() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getJ() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getG() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.DHParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.DHParameters dHParameters = (org.bouncycastle.crypto.params.DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.getHighSpeedVideoSizes) && dHParameters.getG().equals(this.getHighSpeedVideoFpsRanges);
    }

    public DHParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, org.bouncycastle.crypto.params.DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
    }

    public DHParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i, int i2, java.math.BigInteger bigInteger4, org.bouncycastle.crypto.params.DHValidationParameters dHValidationParameters) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new java.lang.IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new java.lang.IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength() && !org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new java.lang.IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.getHighSpeedVideoFpsRanges = bigInteger2;
        this.getHighSpeedVideoSizes = bigInteger;
        this.getInputSizeshNQ4ISI = bigInteger3;
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger4;
        this.getHighSpeedVideoSizesFor = dHValidationParameters;
    }

    public DHParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i, int i2) {
        this(bigInteger, bigInteger2, bigInteger3, i, i2, null, null);
    }

    public DHParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }
}
