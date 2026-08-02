package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DSAParametersGenerator {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizesFor;
    private java.security.SecureRandom getInputFormats;
    private int getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getOutputFormats;
    private int getOutputMinFrameDuration;
    private boolean getOutputSizes;
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(0);
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(2);

    public org.bouncycastle.crypto.params.DSAParameters generateParameters() {
        java.math.BigInteger bit;
        int i;
        java.math.BigInteger bigInteger;
        java.math.BigInteger subtract;
        java.math.BigInteger bigInteger2;
        int i2 = 1;
        int i3 = 0;
        if (this.getOutputSizes) {
            org.bouncycastle.crypto.Digest digest = this.getOutputFormats;
            int digestSize = digest.getDigestSize() * 8;
            int i4 = this.Camera2StreamConfigurationMap / 8;
            byte[] bArr = new byte[i4];
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = (i5 - 1) / digestSize;
            int i7 = i5 / 8;
            byte[] bArr2 = new byte[i7];
            int digestSize2 = digest.getDigestSize();
            byte[] bArr3 = new byte[digestSize2];
            loop0: while (true) {
                this.getInputFormats.nextBytes(bArr);
                digest.update(bArr, i3, i4);
                digest.doFinal(bArr3, i3);
                bit = new java.math.BigInteger(i2, bArr3).mod(getHighSpeedVideoFpsRangesFor.shiftLeft(this.Camera2StreamConfigurationMap - i2)).setBit(i3).setBit(this.Camera2StreamConfigurationMap - i2);
                if (bit.isProbablePrime(this.getInputSizeshNQ4ISI)) {
                    byte[] clone = org.bouncycastle.util.Arrays.clone(bArr);
                    int i8 = this.getHighResolutionOutputSizeshNQ4ISI;
                    i = i3;
                    while (i < i8 * 4) {
                        int i9 = i2;
                        while (i9 <= i6) {
                            getHighResolutionOutputSizeshNQ4ISI(clone);
                            digest.update(clone, i3, clone.length);
                            digest.doFinal(bArr2, i7 - (i9 * digestSize2));
                            i9++;
                            i8 = i8;
                        }
                        int i10 = i8;
                        int i11 = i7 - (i6 * digestSize2);
                        getHighResolutionOutputSizeshNQ4ISI(clone);
                        digest.update(clone, i3, clone.length);
                        digest.doFinal(bArr3, i3);
                        java.lang.System.arraycopy(bArr3, digestSize2 - i11, bArr2, i3, i11);
                        bArr2[i3] = (byte) (bArr2[i3] | Byte.MIN_VALUE);
                        java.math.BigInteger bigInteger3 = new java.math.BigInteger(1, bArr2);
                        java.math.BigInteger mod = bigInteger3.mod(bit.shiftLeft(1));
                        bigInteger = getHighSpeedVideoFpsRangesFor;
                        subtract = bigInteger3.subtract(mod.subtract(bigInteger));
                        if (subtract.bitLength() == this.getHighResolutionOutputSizeshNQ4ISI && subtract.isProbablePrime(this.getInputSizeshNQ4ISI)) {
                            break loop0;
                        }
                        i++;
                        i8 = i10;
                        i2 = 1;
                        i3 = 0;
                    }
                }
            }
            int i12 = this.getHighSpeedVideoSizesFor;
            if (i12 >= 0) {
                java.math.BigInteger divide = subtract.subtract(bigInteger).divide(bit);
                byte[] decodeStrict = org.bouncycastle.util.encoders.Hex.decodeStrict("6767656E");
                int length = decodeStrict.length + i4;
                int i13 = length + 3;
                byte[] bArr4 = new byte[i13];
                int i14 = 0;
                java.lang.System.arraycopy(bArr, 0, bArr4, 0, i4);
                java.lang.System.arraycopy(decodeStrict, 0, bArr4, i4, decodeStrict.length);
                bArr4[length] = (byte) i12;
                byte[] bArr5 = new byte[digest.getDigestSize()];
                int i15 = 1;
                while (true) {
                    if (i15 >= 65536) {
                        bigInteger2 = null;
                        break;
                    }
                    getHighResolutionOutputSizeshNQ4ISI(bArr4);
                    digest.update(bArr4, i14, i13);
                    digest.doFinal(bArr5, i14);
                    bigInteger2 = new java.math.BigInteger(1, bArr5).modPow(divide, subtract);
                    if (bigInteger2.compareTo(getHighSpeedVideoFpsRanges) >= 0) {
                        break;
                    }
                    i15++;
                    i14 = 0;
                }
                if (bigInteger2 != null) {
                    return new org.bouncycastle.crypto.params.DSAParameters(subtract, bit, bigInteger2, new org.bouncycastle.crypto.params.DSAValidationParameters(bArr, i, this.getHighSpeedVideoSizesFor));
                }
            }
            return new org.bouncycastle.crypto.params.DSAParameters(subtract, bit, getHighSpeedVideoFpsRanges(subtract, bit, this.getInputFormats), new org.bouncycastle.crypto.params.DSAValidationParameters(bArr, i));
        }
        int i16 = 20;
        byte[] bArr6 = new byte[20];
        byte[] bArr7 = new byte[20];
        byte[] bArr8 = new byte[20];
        byte[] bArr9 = new byte[20];
        int i17 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i18 = (i17 - 1) / 160;
        int i19 = i17 / 8;
        byte[] bArr10 = new byte[i19];
        if (!(this.getOutputFormats instanceof org.bouncycastle.crypto.digests.SHA1Digest)) {
            throw new java.lang.IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
        while (true) {
            this.getInputFormats.nextBytes(bArr6);
            org.bouncycastle.crypto.Digest digest2 = this.getOutputFormats;
            digest2.update(bArr6, 0, i16);
            digest2.doFinal(bArr7, 0);
            java.lang.System.arraycopy(bArr6, 0, bArr8, 0, i16);
            getHighResolutionOutputSizeshNQ4ISI(bArr8);
            org.bouncycastle.crypto.Digest digest3 = this.getOutputFormats;
            digest3.update(bArr8, 0, i16);
            digest3.doFinal(bArr8, 0);
            for (int i20 = 0; i20 != i16; i20++) {
                bArr9[i20] = (byte) (bArr7[i20] ^ bArr8[i20]);
            }
            bArr9[0] = (byte) (bArr9[0] | Byte.MIN_VALUE);
            bArr9[19] = (byte) (bArr9[19] | 1);
            java.math.BigInteger bigInteger4 = new java.math.BigInteger(1, bArr9);
            if (bigInteger4.isProbablePrime(this.getInputSizeshNQ4ISI)) {
                byte[] clone2 = org.bouncycastle.util.Arrays.clone(bArr6);
                getHighResolutionOutputSizeshNQ4ISI(clone2);
                int i21 = 0;
                while (i21 < 4096) {
                    for (int i22 = 1; i22 <= i18; i22++) {
                        getHighResolutionOutputSizeshNQ4ISI(clone2);
                        org.bouncycastle.crypto.Digest digest4 = this.getOutputFormats;
                        digest4.update(clone2, 0, clone2.length);
                        digest4.doFinal(bArr10, i19 - (i22 * 20));
                    }
                    int i23 = i19 - (i18 * 20);
                    getHighResolutionOutputSizeshNQ4ISI(clone2);
                    org.bouncycastle.crypto.Digest digest5 = this.getOutputFormats;
                    digest5.update(clone2, 0, clone2.length);
                    digest5.doFinal(bArr7, 0);
                    java.lang.System.arraycopy(bArr7, 20 - i23, bArr10, 0, i23);
                    bArr10[0] = (byte) (bArr10[0] | Byte.MIN_VALUE);
                    java.math.BigInteger bigInteger5 = new java.math.BigInteger(1, bArr10);
                    java.math.BigInteger subtract2 = bigInteger5.subtract(bigInteger5.mod(bigInteger4.shiftLeft(1)).subtract(getHighSpeedVideoFpsRangesFor));
                    if (subtract2.bitLength() == this.getHighResolutionOutputSizeshNQ4ISI && subtract2.isProbablePrime(this.getInputSizeshNQ4ISI)) {
                        return new org.bouncycastle.crypto.params.DSAParameters(subtract2, bigInteger4, getHighResolutionOutputSizeshNQ4ISI(subtract2, bigInteger4, this.getInputFormats), new org.bouncycastle.crypto.params.DSAValidationParameters(bArr6, i21));
                    }
                    i21++;
                    i16 = 20;
                }
            }
        }
    }

    public void init(int i, int i2, java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i > 1024 ? 256 : 160;
        this.getInputSizeshNQ4ISI = i2;
        this.getOutputMinFrameDuration = java.lang.Math.max(i <= 1024 ? 40 : (((i - 1) / 1024) * 8) + 48, (i2 + 1) / 2);
        this.getInputFormats = secureRandom;
        this.getOutputSizes = false;
        this.getHighSpeedVideoSizesFor = -1;
    }

    public void init(org.bouncycastle.crypto.params.DSAParameterGenerationParameters dSAParameterGenerationParameters) {
        int l = dSAParameterGenerationParameters.getL();
        int n = dSAParameterGenerationParameters.getN();
        if (l < 1024 || l > 3072 || l % 1024 != 0) {
            throw new java.lang.IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (l == 1024 && n != 160) {
            throw new java.lang.IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (l == 2048 && n != 224 && n != 256) {
            throw new java.lang.IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (l == 3072 && n != 256) {
            throw new java.lang.IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.getOutputFormats.getDigestSize() * 8 < n) {
            throw new java.lang.IllegalStateException("Digest output size too small for value of N");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = l;
        this.Camera2StreamConfigurationMap = n;
        int certainty = dSAParameterGenerationParameters.getCertainty();
        this.getInputSizeshNQ4ISI = certainty;
        this.getOutputMinFrameDuration = java.lang.Math.max(l <= 1024 ? 40 : (((l - 1) / 1024) * 8) + 48, (certainty + 1) / 2);
        this.getInputFormats = dSAParameterGenerationParameters.getRandom();
        this.getOutputSizes = true;
        this.getHighSpeedVideoSizesFor = dSAParameterGenerationParameters.getUsageIndex();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private static java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.SecureRandom secureRandom) {
        return getHighResolutionOutputSizeshNQ4ISI(bigInteger, bigInteger2, secureRandom);
    }

    private static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.SecureRandom secureRandom) {
        java.math.BigInteger modPow;
        java.math.BigInteger divide = bigInteger.subtract(getHighSpeedVideoFpsRangesFor).divide(bigInteger2);
        java.math.BigInteger subtract = bigInteger.subtract(getHighSpeedVideoFpsRanges);
        do {
            modPow = org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoFpsRanges, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    public DSAParametersGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getOutputFormats = digest;
    }

    public DSAParametersGenerator() {
        this(org.bouncycastle.crypto.util.DigestFactory.createSHA1());
    }
}
