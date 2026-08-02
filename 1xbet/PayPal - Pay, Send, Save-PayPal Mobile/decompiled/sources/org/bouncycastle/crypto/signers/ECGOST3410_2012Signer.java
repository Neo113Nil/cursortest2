package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class ECGOST3410_2012Signer implements org.bouncycastle.crypto.DSAExt {
    java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.params.ECKeyParameters getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(bArr));
        java.math.BigInteger n = this.getHighSpeedVideoFpsRanges.getParameters().getN();
        if (bigInteger.compareTo(org.bouncycastle.math.ec.ECConstants.ONE) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(org.bouncycastle.math.ec.ECConstants.ONE) < 0 || bigInteger2.compareTo(n) >= 0) {
            return false;
        }
        java.math.BigInteger modOddInverseVar = org.bouncycastle.util.BigIntegers.modOddInverseVar(n, bigInteger3);
        org.bouncycastle.math.ec.ECPoint normalize = org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(this.getHighSpeedVideoFpsRanges.getParameters().getG(), bigInteger2.multiply(modOddInverseVar).mod(n), ((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoFpsRanges).getQ(), n.subtract(bigInteger).multiply(modOddInverseVar).mod(n)).normalize();
        if (normalize.isInfinity()) {
            return false;
        }
        return normalize.getAffineXCoord().toBigInteger().mod(n).equals(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!z) {
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
        } else {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = parametersWithRandom.getRandom();
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) parametersWithRandom.getParameters();
        }
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public java.math.BigInteger getOrder() {
        return this.getHighSpeedVideoFpsRanges.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public java.math.BigInteger[] generateSignature(byte[] bArr) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(bArr));
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighSpeedVideoFpsRanges.getParameters();
        java.math.BigInteger n = parameters.getN();
        java.math.BigInteger d = ((org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.getHighSpeedVideoFpsRanges).getD();
        org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(n.bitLength(), this.getHighResolutionOutputSizeshNQ4ISI);
            if (!createRandomBigInteger.equals(org.bouncycastle.math.ec.ECConstants.ZERO)) {
                java.math.BigInteger mod = createBasePointMultiplier.multiply(parameters.getG(), createRandomBigInteger).normalize().getAffineXCoord().toBigInteger().mod(n);
                if (mod.equals(org.bouncycastle.math.ec.ECConstants.ZERO)) {
                    continue;
                } else {
                    java.math.BigInteger mod2 = createRandomBigInteger.multiply(bigInteger).add(d.multiply(mod)).mod(n);
                    if (!mod2.equals(org.bouncycastle.math.ec.ECConstants.ZERO)) {
                        return new java.math.BigInteger[]{mod, mod2};
                    }
                }
            }
        }
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }
}
