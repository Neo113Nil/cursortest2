package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class CramerShoupParameters implements org.bouncycastle.crypto.CipherParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }

    public java.math.BigInteger getP() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.crypto.Digest getH() {
        return (org.bouncycastle.crypto.Digest) ((org.bouncycastle.util.Memoable) this.getHighResolutionOutputSizeshNQ4ISI).copy();
    }

    public java.math.BigInteger getG2() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getG1() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.CramerShoupParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters = (org.bouncycastle.crypto.params.CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.Camera2StreamConfigurationMap) && cramerShoupParameters.getG1().equals(this.getHighSpeedVideoFpsRanges) && cramerShoupParameters.getG2().equals(this.getHighSpeedVideoSizes);
    }

    public CramerShoupParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, org.bouncycastle.crypto.Digest digest) {
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoFpsRanges = bigInteger2;
        this.getHighSpeedVideoSizes = bigInteger3;
        org.bouncycastle.crypto.Digest digest2 = (org.bouncycastle.crypto.Digest) ((org.bouncycastle.util.Memoable) digest).copy();
        this.getHighResolutionOutputSizeshNQ4ISI = digest2;
        digest2.reset();
    }
}
