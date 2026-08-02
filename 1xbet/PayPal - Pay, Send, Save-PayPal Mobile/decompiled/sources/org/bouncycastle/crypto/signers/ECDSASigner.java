package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class ECDSASigner implements org.bouncycastle.math.ec.ECConstants, org.bouncycastle.crypto.DSAExt {
    private final org.bouncycastle.crypto.signers.DSAKCalculator Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ECKeyParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger cofactor;
        org.bouncycastle.math.ec.ECFieldElement denominator;
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighSpeedVideoFpsRangesFor.getParameters();
        java.math.BigInteger n = parameters.getN();
        java.math.BigInteger calculateE = calculateE(n, bArr);
        if (bigInteger.compareTo(ONE) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(ONE) < 0 || bigInteger2.compareTo(n) >= 0) {
            return false;
        }
        java.math.BigInteger modOddInverseVar = org.bouncycastle.util.BigIntegers.modOddInverseVar(n, bigInteger2);
        org.bouncycastle.math.ec.ECPoint sumOfTwoMultiplies = org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), calculateE.multiply(modOddInverseVar).mod(n), ((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoFpsRangesFor).getQ(), bigInteger.multiply(modOddInverseVar).mod(n));
        if (sumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        org.bouncycastle.math.ec.ECCurve curve = sumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), sumOfTwoMultiplies)) == null || denominator.isZero()) {
            return sumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n).equals(bigInteger);
        }
        org.bouncycastle.math.ec.ECFieldElement xCoord = sumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n);
        }
        return false;
    }

    protected java.security.SecureRandom initSecureRandom(boolean z, java.security.SecureRandom secureRandom) {
        if (z) {
            return org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters;
        java.security.SecureRandom secureRandom;
        if (!z) {
            eCKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
                org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
                this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                this.getHighResolutionOutputSizeshNQ4ISI = initSecureRandom((z || this.Camera2StreamConfigurationMap.isDeterministic()) ? false : true, secureRandom);
            }
            eCKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
        }
        this.getHighSpeedVideoFpsRangesFor = eCKeyParameters;
        secureRandom = null;
        this.getHighResolutionOutputSizeshNQ4ISI = initSecureRandom((z || this.Camera2StreamConfigurationMap.isDeterministic()) ? false : true, secureRandom);
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public java.math.BigInteger getOrder() {
        return this.getHighSpeedVideoFpsRangesFor.getParameters().getN();
    }

    protected org.bouncycastle.math.ec.ECFieldElement getDenominator(int i, org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i != 6 && i != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    @Override // org.bouncycastle.crypto.DSA
    public java.math.BigInteger[] generateSignature(byte[] bArr) {
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighSpeedVideoFpsRangesFor.getParameters();
        java.math.BigInteger n = parameters.getN();
        java.math.BigInteger calculateE = calculateE(n, bArr);
        java.math.BigInteger d = ((org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.getHighSpeedVideoFpsRangesFor).getD();
        if (this.Camera2StreamConfigurationMap.isDeterministic()) {
            this.Camera2StreamConfigurationMap.init(n, d, bArr);
        } else {
            this.Camera2StreamConfigurationMap.init(n, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            java.math.BigInteger nextK = this.Camera2StreamConfigurationMap.nextK();
            java.math.BigInteger mod = createBasePointMultiplier.multiply(parameters.getG(), nextK).normalize().getAffineXCoord().toBigInteger().mod(n);
            if (!mod.equals(ZERO)) {
                java.math.BigInteger mod2 = org.bouncycastle.util.BigIntegers.modOddInverse(n, nextK).multiply(calculateE.add(d.multiply(mod))).mod(n);
                if (!mod2.equals(ZERO)) {
                    return new java.math.BigInteger[]{mod, mod2};
                }
            }
        }
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }

    protected java.math.BigInteger calculateE(java.math.BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    public ECDSASigner(org.bouncycastle.crypto.signers.DSAKCalculator dSAKCalculator) {
        this.Camera2StreamConfigurationMap = dSAKCalculator;
    }

    public ECDSASigner() {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.signers.RandomDSAKCalculator();
    }
}
