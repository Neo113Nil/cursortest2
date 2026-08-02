package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class GOST3410PublicKeyParameterSetSpec {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() ^ this.Camera2StreamConfigurationMap.hashCode()) ^ this.getHighSpeedVideoSizes.hashCode();
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getP() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec)) {
            return false;
        }
        org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(gOST3410PublicKeyParameterSetSpec.getHighSpeedVideoFpsRangesFor) && this.Camera2StreamConfigurationMap.equals(gOST3410PublicKeyParameterSetSpec.Camera2StreamConfigurationMap) && this.getHighSpeedVideoSizes.equals(gOST3410PublicKeyParameterSetSpec.getHighSpeedVideoSizes);
    }

    public GOST3410PublicKeyParameterSetSpec(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
    }
}
