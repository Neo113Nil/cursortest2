package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ECParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.math.ec.ECCurve getHighSpeedVideoFpsRanges;
    private org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public byte[] getSeed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getN() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getH() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.math.ec.ECPoint getG() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.math.ec.ECCurve getCurve() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jce.spec.ECParameterSpec)) {
            return false;
        }
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECParameterSpec(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = eCCurve;
        this.getHighSpeedVideoFpsRangesFor = eCPoint.normalize();
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public ECParameterSpec(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.getHighSpeedVideoFpsRanges = eCCurve;
        this.getHighSpeedVideoFpsRangesFor = eCPoint.normalize();
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public ECParameterSpec(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRanges = eCCurve;
        this.getHighSpeedVideoFpsRangesFor = eCPoint.normalize();
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoSizes = java.math.BigInteger.valueOf(1L);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
