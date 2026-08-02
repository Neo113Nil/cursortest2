package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECDomainParameters implements org.bouncycastle.math.ec.ECConstants {
    private final java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRanges;
    private final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.math.ec.ECCurve getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;

    public org.bouncycastle.math.ec.ECPoint validatePublicPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        return getHighSpeedVideoSizes(getCurve(), eCPoint);
    }

    public java.math.BigInteger validatePrivateScalar(java.math.BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new java.lang.NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(org.bouncycastle.math.ec.ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new java.lang.IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public int hashCode() {
        return ((((this.getHighSpeedVideoSizes.hashCode() ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA) * 257) ^ this.getHighSpeedVideoFpsRanges.hashCode()) * 257) ^ this.Camera2StreamConfigurationMap.hashCode();
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizesFor);
    }

    public java.math.BigInteger getN() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getHInv() {
        java.math.BigInteger bigInteger;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.BigIntegers.modOddInverseVar(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
            }
            bigInteger = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return bigInteger;
    }

    public java.math.BigInteger getH() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.math.ec.ECPoint getG() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.math.ec.ECCurve getCurve() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.crypto.params.ECDomainParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters = (org.bouncycastle.crypto.params.ECDomainParameters) obj;
        return this.getHighSpeedVideoSizes.equals(eCDomainParameters.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRanges.equals(eCDomainParameters.getHighSpeedVideoFpsRanges) && this.Camera2StreamConfigurationMap.equals(eCDomainParameters.Camera2StreamConfigurationMap);
    }

    private static org.bouncycastle.math.ec.ECPoint getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new java.lang.NullPointerException("Point cannot be null");
        }
        org.bouncycastle.math.ec.ECPoint normalize = org.bouncycastle.math.ec.ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (normalize.isInfinity()) {
            throw new java.lang.IllegalArgumentException("Point at infinity");
        }
        if (normalize.isValid()) {
            return normalize;
        }
        throw new java.lang.IllegalArgumentException("Point not on curve");
    }

    public ECDomainParameters(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (eCCurve == null) {
            throw new java.lang.NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new java.lang.NullPointerException("n");
        }
        this.getHighSpeedVideoSizes = eCCurve;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes(eCCurve, eCPoint);
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoFpsRangesFor = bigInteger2;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public ECDomainParameters(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ONE, null);
    }

    public ECDomainParameters(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }
}
