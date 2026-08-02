package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class CramerShoupPublicKeyParameters extends org.bouncycastle.crypto.params.CramerShoupKeyParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ this.getHighSpeedVideoFpsRanges.hashCode()) ^ this.Camera2StreamConfigurationMap.hashCode()) ^ super.hashCode();
    }

    public java.math.BigInteger getH() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getD() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getC() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.getHighSpeedVideoFpsRangesFor) && cramerShoupPublicKeyParameters.getD().equals(this.getHighSpeedVideoFpsRanges) && cramerShoupPublicKeyParameters.getH().equals(this.Camera2StreamConfigurationMap) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters(org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.getHighSpeedVideoFpsRangesFor = bigInteger;
        this.getHighSpeedVideoFpsRanges = bigInteger2;
        this.Camera2StreamConfigurationMap = bigInteger3;
    }
}
