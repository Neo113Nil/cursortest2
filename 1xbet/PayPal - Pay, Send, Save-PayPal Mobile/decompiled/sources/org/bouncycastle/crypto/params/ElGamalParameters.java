package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ElGamalParameters implements org.bouncycastle.crypto.CipherParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getP() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getL() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getG() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.ElGamalParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters = (org.bouncycastle.crypto.params.ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.Camera2StreamConfigurationMap) && elGamalParameters.getG().equals(this.getHighResolutionOutputSizeshNQ4ISI) && elGamalParameters.getL() == this.getHighSpeedVideoSizes;
    }

    public ElGamalParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger2;
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoSizes = i;
    }

    public ElGamalParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }
}
