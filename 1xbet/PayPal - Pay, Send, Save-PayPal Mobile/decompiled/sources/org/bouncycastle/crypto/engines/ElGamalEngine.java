package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class ElGamalEngine implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private boolean Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.ElGamalKeyParameters getHighSpeedVideoSizesFor;
    private java.security.SecureRandom getInputSizeshNQ4ISI;
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(0);
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        java.math.BigInteger createRandomBigInteger;
        if (this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.IllegalStateException("ElGamal engine not initialised");
        }
        if (i2 > (this.Camera2StreamConfigurationMap ? (this.getHighSpeedVideoFpsRangesFor + 6) / 8 : getInputBlockSize())) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for ElGamal cipher.\n");
        }
        java.math.BigInteger p = this.getHighSpeedVideoSizesFor.getParameters().getP();
        if (this.getHighSpeedVideoSizesFor instanceof org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters) {
            int i3 = i2 / 2;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[i3];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i3);
            java.lang.System.arraycopy(bArr, i + i3, bArr3, 0, i3);
            return org.bouncycastle.util.BigIntegers.asUnsignedByteArray(new java.math.BigInteger(1, bArr2).modPow(p.subtract(getHighSpeedVideoFpsRanges).subtract(((org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters) this.getHighSpeedVideoSizesFor).getX()), p).multiply(new java.math.BigInteger(1, bArr3)).mod(p));
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr4 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr4, 0, i2);
            bArr = bArr4;
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(p) >= 0) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for ElGamal cipher.\n");
        }
        org.bouncycastle.crypto.params.ElGamalPublicKeyParameters elGamalPublicKeyParameters = (org.bouncycastle.crypto.params.ElGamalPublicKeyParameters) this.getHighSpeedVideoSizesFor;
        int bitLength = p.bitLength();
        while (true) {
            createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength, this.getInputSizeshNQ4ISI);
            if (!createRandomBigInteger.equals(getHighSpeedVideoSizes) && createRandomBigInteger.compareTo(p.subtract(getHighResolutionOutputSizeshNQ4ISI)) <= 0) {
                break;
            }
        }
        java.math.BigInteger modPow = this.getHighSpeedVideoSizesFor.getParameters().getG().modPow(createRandomBigInteger, p);
        java.math.BigInteger mod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(createRandomBigInteger, p)).mod(p);
        byte[] byteArray = modPow.toByteArray();
        byte[] byteArray2 = mod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i4 = outputBlockSize / 2;
        if (byteArray.length > i4) {
            java.lang.System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            java.lang.System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i4) {
            java.lang.System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        java.lang.System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        return bArr5;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighSpeedVideoSizesFor = (org.bouncycastle.crypto.params.ElGamalKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.getHighSpeedVideoSizesFor = (org.bouncycastle.crypto.params.ElGamalKeyParameters) cipherParameters;
            secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        this.getInputSizeshNQ4ISI = secureRandom;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor.getParameters().getP().bitLength();
        if (z) {
            if (!(this.getHighSpeedVideoSizesFor instanceof org.bouncycastle.crypto.params.ElGamalPublicKeyParameters)) {
                throw new java.lang.IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.getHighSpeedVideoSizesFor instanceof org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.Camera2StreamConfigurationMap ? ((this.getHighSpeedVideoFpsRangesFor + 7) / 8) * 2 : (this.getHighSpeedVideoFpsRangesFor - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.Camera2StreamConfigurationMap ? (this.getHighSpeedVideoFpsRangesFor - 1) / 8 : ((this.getHighSpeedVideoFpsRangesFor + 7) / 8) * 2;
    }
}
