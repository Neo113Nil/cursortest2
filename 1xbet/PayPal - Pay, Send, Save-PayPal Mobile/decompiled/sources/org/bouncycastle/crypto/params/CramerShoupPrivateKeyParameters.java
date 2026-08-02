package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class CramerShoupPrivateKeyParameters extends org.bouncycastle.crypto.params.CramerShoupKeyParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getInputSizeshNQ4ISI;
    private java.math.BigInteger getOutputMinFrameDuration;

    public void setPk(org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = cramerShoupPublicKeyParameters;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ this.Camera2StreamConfigurationMap.hashCode()) ^ this.getHighSpeedVideoFpsRanges.hashCode()) ^ this.getInputSizeshNQ4ISI.hashCode()) ^ this.getOutputMinFrameDuration.hashCode()) ^ super.hashCode();
    }

    public java.math.BigInteger getZ() {
        return this.getOutputMinFrameDuration;
    }

    public java.math.BigInteger getY2() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.math.BigInteger getY1() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getX2() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getX1() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters getPk() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.getHighSpeedVideoFpsRangesFor) && cramerShoupPrivateKeyParameters.getX2().equals(this.Camera2StreamConfigurationMap) && cramerShoupPrivateKeyParameters.getY1().equals(this.getHighSpeedVideoFpsRanges) && cramerShoupPrivateKeyParameters.getY2().equals(this.getInputSizeshNQ4ISI) && cramerShoupPrivateKeyParameters.getZ().equals(this.getOutputMinFrameDuration) && super.equals(obj);
    }

    public CramerShoupPrivateKeyParameters(org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.getHighSpeedVideoFpsRangesFor = bigInteger;
        this.Camera2StreamConfigurationMap = bigInteger2;
        this.getHighSpeedVideoFpsRanges = bigInteger3;
        this.getInputSizeshNQ4ISI = bigInteger4;
        this.getOutputMinFrameDuration = bigInteger5;
    }
}
