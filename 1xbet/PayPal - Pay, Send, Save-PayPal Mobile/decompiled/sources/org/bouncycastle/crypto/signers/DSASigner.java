package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class DSASigner implements org.bouncycastle.crypto.DSAExt {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.signers.DSAKCalculator getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.DSAKeyParameters getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.DSA
    public java.math.BigInteger[] generateSignature(byte[] bArr) {
        org.bouncycastle.crypto.params.DSAParameters parameters = this.getHighSpeedVideoFpsRanges.getParameters();
        java.math.BigInteger q = parameters.getQ();
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(q, bArr);
        java.math.BigInteger x = ((org.bouncycastle.crypto.params.DSAPrivateKeyParameters) this.getHighSpeedVideoFpsRanges).getX();
        if (this.getHighResolutionOutputSizeshNQ4ISI.isDeterministic()) {
            this.getHighResolutionOutputSizeshNQ4ISI.init(q, x, bArr);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.init(q, this.Camera2StreamConfigurationMap);
        }
        java.math.BigInteger nextK = this.getHighResolutionOutputSizeshNQ4ISI.nextK();
        java.math.BigInteger mod = parameters.getG().modPow(nextK.add(org.bouncycastle.util.BigIntegers.createRandomBigInteger(7, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(this.Camera2StreamConfigurationMap)).add(java.math.BigInteger.valueOf(128L)).multiply(q)), parameters.getP()).mod(q);
        return new java.math.BigInteger[]{mod, org.bouncycastle.util.BigIntegers.modOddInverse(q, nextK).multiply(highSpeedVideoFpsRanges.add(x.multiply(mod))).mod(q)};
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        org.bouncycastle.crypto.params.DSAParameters parameters = this.getHighSpeedVideoFpsRanges.getParameters();
        java.math.BigInteger q = parameters.getQ();
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(q, bArr);
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || q.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || q.compareTo(bigInteger2) <= 0) {
            return false;
        }
        java.math.BigInteger modOddInverseVar = org.bouncycastle.util.BigIntegers.modOddInverseVar(q, bigInteger2);
        java.math.BigInteger mod = highSpeedVideoFpsRanges.multiply(modOddInverseVar).mod(q);
        java.math.BigInteger mod2 = bigInteger.multiply(modOddInverseVar).mod(q);
        java.math.BigInteger p = parameters.getP();
        return parameters.getG().modPow(mod, p).multiply(((org.bouncycastle.crypto.params.DSAPublicKeyParameters) this.getHighSpeedVideoFpsRanges).getY().modPow(mod2, p)).mod(p).mod(q).equals(bigInteger);
    }

    protected java.security.SecureRandom initSecureRandom(boolean z, java.security.SecureRandom secureRandom) {
        if (z) {
            return org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.DSAKeyParameters dSAKeyParameters;
        java.security.SecureRandom secureRandom;
        if (!z) {
            dSAKeyParameters = (org.bouncycastle.crypto.params.DSAPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
                org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
                this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                this.Camera2StreamConfigurationMap = initSecureRandom((z || this.getHighResolutionOutputSizeshNQ4ISI.isDeterministic()) ? false : true, secureRandom);
            }
            dSAKeyParameters = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) cipherParameters;
        }
        this.getHighSpeedVideoFpsRanges = dSAKeyParameters;
        secureRandom = null;
        this.Camera2StreamConfigurationMap = initSecureRandom((z || this.getHighResolutionOutputSizeshNQ4ISI.isDeterministic()) ? false : true, secureRandom);
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public java.math.BigInteger getOrder() {
        return this.getHighSpeedVideoFpsRanges.getParameters().getQ();
    }

    private static java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new java.math.BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new java.math.BigInteger(1, bArr2);
    }

    public DSASigner(org.bouncycastle.crypto.signers.DSAKCalculator dSAKCalculator) {
        this.getHighResolutionOutputSizeshNQ4ISI = dSAKCalculator;
    }

    public DSASigner() {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.signers.RandomDSAKCalculator();
    }
}
