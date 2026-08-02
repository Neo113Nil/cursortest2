package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class DSTU4145Signer implements org.bouncycastle.crypto.DSAExt {
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1);
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ECKeyParameters getHighSpeedVideoSizes;

    private static java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger, org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        java.math.BigInteger bigInteger2 = eCFieldElement.toBigInteger();
        int bitLength = bigInteger.bitLength() - 1;
        return bigInteger2.bitLength() > bitLength ? bigInteger2.mod(Camera2StreamConfigurationMap.shiftLeft(bitLength)) : bigInteger2;
    }

    private static org.bouncycastle.math.ec.ECFieldElement getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECCurve eCCurve, byte[] bArr) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(bArr));
        int fieldSize = eCCurve.getFieldSize();
        if (bigInteger.bitLength() > fieldSize) {
            bigInteger = bigInteger.mod(Camera2StreamConfigurationMap.shiftLeft(fieldSize));
        }
        return eCCurve.fromBigInteger(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public java.math.BigInteger[] generateSignature(byte[] bArr) {
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighSpeedVideoSizes.getParameters();
        org.bouncycastle.math.ec.ECCurve curve = parameters.getCurve();
        org.bouncycastle.math.ec.ECFieldElement highSpeedVideoSizes = getHighSpeedVideoSizes(curve, bArr);
        if (highSpeedVideoSizes.isZero()) {
            highSpeedVideoSizes = curve.fromBigInteger(Camera2StreamConfigurationMap);
        }
        java.math.BigInteger n = parameters.getN();
        java.math.BigInteger d = ((org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.getHighSpeedVideoSizes).getD();
        org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(n.bitLength() - 1, this.getHighResolutionOutputSizeshNQ4ISI);
            org.bouncycastle.math.ec.ECFieldElement affineXCoord = createBasePointMultiplier.multiply(parameters.getG(), createRandomBigInteger).normalize().getAffineXCoord();
            if (!affineXCoord.isZero()) {
                java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(n, highSpeedVideoSizes.multiply(affineXCoord));
                if (highSpeedVideoFpsRanges.signum() != 0) {
                    java.math.BigInteger mod = highSpeedVideoFpsRanges.multiply(d).add(createRandomBigInteger).mod(n);
                    if (mod.signum() != 0) {
                        return new java.math.BigInteger[]{highSpeedVideoFpsRanges, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (bigInteger.signum() > 0 && bigInteger2.signum() > 0) {
            org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighSpeedVideoSizes.getParameters();
            java.math.BigInteger n = parameters.getN();
            if (bigInteger.compareTo(n) < 0 && bigInteger2.compareTo(n) < 0) {
                org.bouncycastle.math.ec.ECCurve curve = parameters.getCurve();
                org.bouncycastle.math.ec.ECFieldElement highSpeedVideoSizes = getHighSpeedVideoSizes(curve, bArr);
                if (highSpeedVideoSizes.isZero()) {
                    highSpeedVideoSizes = curve.fromBigInteger(Camera2StreamConfigurationMap);
                }
                org.bouncycastle.math.ec.ECPoint normalize = org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigInteger2, ((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoSizes).getQ(), bigInteger).normalize();
                if (!normalize.isInfinity() && getHighSpeedVideoFpsRanges(n, highSpeedVideoSizes.multiply(normalize.getAffineXCoord())).compareTo(bigInteger) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters;
        if (z) {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
                org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
                this.getHighResolutionOutputSizeshNQ4ISI = parametersWithRandom.getRandom();
                cipherParameters = parametersWithRandom.getParameters();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            eCKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
        } else {
            eCKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
        }
        this.getHighSpeedVideoSizes = eCKeyParameters;
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public java.math.BigInteger getOrder() {
        return this.getHighSpeedVideoSizes.getParameters().getN();
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }
}
