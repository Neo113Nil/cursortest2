package org.bouncycastle.crypto.kems;

/* loaded from: classes17.dex */
public class RSAKeyEncapsulation implements org.bouncycastle.crypto.KeyEncapsulation {
    private org.bouncycastle.crypto.DerivationFunction getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoSizes;
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(0);
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1);

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.RSAKeyParameters)) {
            throw new java.lang.IllegalArgumentException("RSA key required");
        }
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
    }

    protected org.bouncycastle.crypto.params.KeyParameter generateKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.init(new org.bouncycastle.crypto.params.KDFParameters(org.bouncycastle.util.BigIntegers.asUnsignedByteArray((bigInteger.bitLength() + 7) / 8, bigInteger2), null));
        byte[] bArr = new byte[i];
        this.getHighResolutionOutputSizeshNQ4ISI.generateBytes(bArr, 0, i);
        return new org.bouncycastle.crypto.params.KeyParameter(bArr);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public org.bouncycastle.crypto.CipherParameters encrypt(byte[] bArr, int i, int i2) throws java.lang.IllegalArgumentException {
        if (this.getHighSpeedVideoSizes.isPrivate()) {
            throw new java.lang.IllegalArgumentException("Public key required for encryption");
        }
        java.math.BigInteger modulus = this.getHighSpeedVideoSizes.getModulus();
        java.math.BigInteger exponent = this.getHighSpeedVideoSizes.getExponent();
        java.math.BigInteger createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoFpsRangesFor, modulus.subtract(Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges);
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray((modulus.bitLength() + 7) / 8, createRandomInRange.modPow(exponent, modulus));
        java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr, i, asUnsignedByteArray.length);
        return generateKey(modulus, createRandomInRange, i2);
    }

    public org.bouncycastle.crypto.CipherParameters encrypt(byte[] bArr, int i) {
        return encrypt(bArr, 0, i);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public org.bouncycastle.crypto.CipherParameters decrypt(byte[] bArr, int i, int i2, int i3) throws java.lang.IllegalArgumentException {
        if (!this.getHighSpeedVideoSizes.isPrivate()) {
            throw new java.lang.IllegalArgumentException("Private key required for decryption");
        }
        java.math.BigInteger modulus = this.getHighSpeedVideoSizes.getModulus();
        java.math.BigInteger exponent = this.getHighSpeedVideoSizes.getExponent();
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return generateKey(modulus, new java.math.BigInteger(1, bArr2).modPow(exponent, modulus), i3);
    }

    public org.bouncycastle.crypto.CipherParameters decrypt(byte[] bArr, int i) {
        return decrypt(bArr, 0, bArr.length, i);
    }

    public RSAKeyEncapsulation(org.bouncycastle.crypto.DerivationFunction derivationFunction, java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = derivationFunction;
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }
}
