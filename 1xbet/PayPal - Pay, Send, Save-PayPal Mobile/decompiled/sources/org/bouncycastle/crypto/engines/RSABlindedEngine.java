package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RSABlindedEngine implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.engines.RSACoreEngine Camera2StreamConfigurationMap = new org.bouncycastle.crypto.engines.RSACoreEngine();
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        org.bouncycastle.crypto.engines.RSACoreEngine rSACoreEngine = this.Camera2StreamConfigurationMap;
        boolean z2 = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom;
        rSACoreEngine.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.RSAKeyParameters) (z2 ? ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters() : cipherParameters);
        rSACoreEngine.getHighSpeedVideoSizes = z;
        if (z2) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) parametersWithRandom.getParameters();
            this.getHighSpeedVideoSizes = rSAKeyParameters;
            if (!(rSAKeyParameters instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters)) {
                this.getHighSpeedVideoFpsRanges = null;
                return;
            }
            secureRandom = parametersWithRandom.getRandom();
        } else {
            org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters2 = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = rSAKeyParameters2;
            if (!(rSAKeyParameters2 instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters)) {
                this.getHighSpeedVideoFpsRanges = null;
                return;
            }
            secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        java.math.BigInteger highSpeedVideoFpsRanges;
        org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        java.math.BigInteger publicExponent;
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("RSA engine not initialised");
        }
        java.math.BigInteger highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(bArr, i, i2);
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = this.getHighSpeedVideoSizes;
        if (!(rSAKeyParameters instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(highSpeedVideoSizes);
        } else {
            java.math.BigInteger modulus = rSAPrivateCrtKeyParameters.getModulus();
            java.math.BigInteger bigInteger = getHighResolutionOutputSizeshNQ4ISI;
            java.math.BigInteger createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, modulus.subtract(bigInteger), this.getHighSpeedVideoFpsRanges);
            highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(createRandomInRange.modPow(publicExponent, modulus).multiply(highSpeedVideoSizes).mod(modulus)).multiply(org.bouncycastle.util.BigIntegers.modOddInverse(modulus, createRandomInRange)).mod(modulus);
            if (!highSpeedVideoSizes.equals(highSpeedVideoFpsRanges.modPow(publicExponent, modulus))) {
                throw new java.lang.IllegalStateException("RSA engine faulty decryption/signing detected");
            }
        }
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
    }
}
