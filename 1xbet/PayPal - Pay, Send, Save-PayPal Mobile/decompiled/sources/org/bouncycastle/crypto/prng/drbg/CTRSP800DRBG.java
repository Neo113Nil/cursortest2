package org.bouncycastle.crypto.prng.drbg;

/* loaded from: classes17.dex */
public class CTRSP800DRBG implements org.bouncycastle.crypto.prng.drbg.SP80090DRBG {
    private static final byte[] getHighSpeedVideoFpsRanges = org.bouncycastle.util.encoders.Hex.decodeStrict("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.BlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.prng.EntropySource getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private long getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;

    public CTRSP800DRBG(org.bouncycastle.crypto.BlockCipher blockCipher, int i, int i2, org.bouncycastle.crypto.prng.EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this.getInputFormats = 0L;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = entropySource;
        this.getHighResolutionOutputSizeshNQ4ISI = blockCipher;
        this.getOutputMinFrameDuration = i;
        this.getOutputFormats = i2;
        this.getInputSizeshNQ4ISI = (blockCipher.getBlockSize() * 8) + i;
        this.getHighSpeedVideoSizesFor = blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
        if (i2 > 256) {
            throw new java.lang.IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if ((blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA")) && i == 168) {
            i = 112;
        } else if (!blockCipher.getAlgorithmName().equals(org.jose4j.keys.AesKey.ALGORITHM)) {
            i = -1;
        }
        if (i < i2) {
            throw new java.lang.IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        if (entropySource.entropySize() < i2) {
            throw new java.lang.IllegalArgumentException("Not enough entropy for security strength required");
        }
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(org.bouncycastle.util.Arrays.concatenate(getHighSpeedVideoFpsRangesFor(), bArr2, bArr), this.getInputSizeshNQ4ISI);
        int blockSize = this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
        byte[] bArr3 = new byte[(this.getOutputMinFrameDuration + 7) / 8];
        this.Camera2StreamConfigurationMap = bArr3;
        byte[] bArr4 = new byte[blockSize];
        this.getHighSpeedVideoFpsRangesFor = bArr4;
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, bArr3, bArr4);
        this.getInputFormats = 1L;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        Camera2StreamConfigurationMap(bArr);
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArr3;
        boolean z2 = this.getHighSpeedVideoSizesFor;
        long j = this.getInputFormats;
        if (z2) {
            if (j > 2147483648L) {
                return -1;
            }
            if (org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(bArr, 512)) {
                throw new java.lang.IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j > 140737488355328L) {
                return -1;
            }
            if (org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(bArr, 32768)) {
                throw new java.lang.IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z) {
            Camera2StreamConfigurationMap(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArr3 = Camera2StreamConfigurationMap(bArr2, this.getInputSizeshNQ4ISI);
            getHighResolutionOutputSizeshNQ4ISI(bArr3, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        } else {
            bArr3 = new byte[this.getInputSizeshNQ4ISI / 8];
        }
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        byte[] bArr4 = new byte[length];
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap)));
        for (int i = 0; i <= bArr.length / length; i++) {
            int i2 = i * length;
            int length2 = bArr.length - i2 > length ? length : bArr.length - (this.getHighSpeedVideoFpsRangesFor.length * i);
            if (length2 != 0) {
                getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
                this.getHighResolutionOutputSizeshNQ4ISI.processBlock(this.getHighSpeedVideoFpsRangesFor, 0, bArr4, 0);
                java.lang.System.arraycopy(bArr4, 0, bArr, i2, length2);
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr3, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        this.getInputFormats++;
        return bArr.length * 8;
    }

    private byte[] getHighSpeedVideoSizes(byte[] bArr) {
        if (!this.getHighSpeedVideoSizesFor) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        getHighSpeedVideoFpsRangesFor(bArr, 0, bArr2, 0);
        getHighSpeedVideoFpsRangesFor(bArr, 7, bArr2, 8);
        getHighSpeedVideoFpsRangesFor(bArr, 14, bArr2, 16);
        return bArr2;
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, byte[] bArr2, int i2) {
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i3 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i3] & 252) >>> 1));
        byte b = bArr[i3];
        int i4 = i + 2;
        bArr2[i2 + 2] = (byte) ((b << 6) | ((bArr[i4] & 248) >>> 2));
        byte b2 = bArr[i4];
        int i5 = i + 3;
        bArr2[i2 + 3] = (byte) ((b2 << 5) | ((bArr[i5] & com.visa.cbp.getEncExpo.onUnminimized) >>> 3));
        byte b3 = bArr[i5];
        int i6 = i + 4;
        bArr2[i2 + 4] = (byte) ((b3 << 4) | ((bArr[i6] & 224) >>> 4));
        byte b4 = bArr[i6];
        int i7 = i + 5;
        bArr2[i2 + 5] = (byte) ((b4 << 3) | ((bArr[i7] & com.visa.cbp.getEncExpo.startTransaction) >>> 5));
        int i8 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i7] << 2) | ((bArr[i8] & 128) >>> 6));
        int i9 = i2 + 7;
        bArr2[i9] = (byte) (bArr[i8] << 1);
        while (i2 <= i9) {
            byte b5 = bArr2[i2];
            bArr2[i2] = (byte) ((b5 & 254) | ((((b5 >> 7) ^ ((((((b5 >> 1) ^ (b5 >> 2)) ^ (b5 >> 3)) ^ (b5 >> 4)) ^ (b5 >> 5)) ^ (b5 >> 6))) ^ 1) & 1));
            i2++;
        }
    }

    private byte[] getHighSpeedVideoFpsRangesFor() {
        byte[] entropy = this.getHighSpeedVideoSizes.getEntropy();
        if (entropy.length >= (this.getOutputFormats + 7) / 8) {
            return entropy;
        }
        throw new java.lang.IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr2[i2] ^ bArr3[i2 + i]);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize()];
        int blockSize = this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(bArr2)));
        int i = 0;
        while (true) {
            int i2 = i * blockSize;
            if (i2 >= bArr.length) {
                Camera2StreamConfigurationMap(bArr4, bArr, bArr4, 0);
                java.lang.System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                java.lang.System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            } else {
                getHighSpeedVideoFpsRanges(bArr3);
                this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr3, 0, bArr5, 0);
                int i3 = length - i2;
                if (i3 > blockSize) {
                    i3 = blockSize;
                }
                java.lang.System.arraycopy(bArr5, 0, bArr4, i2, i3);
                i++;
            }
        }
    }

    private void Camera2StreamConfigurationMap(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap(org.bouncycastle.util.Arrays.concatenate(getHighSpeedVideoFpsRangesFor(), bArr), this.getInputSizeshNQ4ISI), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        this.getInputFormats = 1L;
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int blockSize = this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
        int length = bArr.length;
        int i2 = i / 8;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        getHighSpeedVideoFpsRanges(bArr2, length, 0);
        getHighSpeedVideoFpsRanges(bArr2, i2, 4);
        java.lang.System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = Byte.MIN_VALUE;
        int i3 = this.getOutputMinFrameDuration / 8;
        int i4 = i3 + blockSize;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        byte[] bArr6 = new byte[i3];
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges, 0, bArr6, 0, i3);
        int i5 = 0;
        while (true) {
            int i6 = i5 * blockSize;
            if (i6 * 8 >= this.getOutputMinFrameDuration + (blockSize * 8)) {
                break;
            }
            getHighSpeedVideoFpsRanges(bArr5, i5, 0);
            getHighResolutionOutputSizeshNQ4ISI(bArr4, bArr6, bArr5, bArr2);
            int i7 = i4 - i6;
            if (i7 > blockSize) {
                i7 = blockSize;
            }
            java.lang.System.arraycopy(bArr4, 0, bArr3, i6, i7);
            i5++;
        }
        byte[] bArr7 = new byte[blockSize];
        java.lang.System.arraycopy(bArr3, 0, bArr6, 0, i3);
        java.lang.System.arraycopy(bArr3, i3, bArr7, 0, blockSize);
        byte[] bArr8 = new byte[i2];
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(bArr6)));
        int i8 = 0;
        while (true) {
            int i9 = i8 * blockSize;
            if (i9 >= i2) {
                return bArr8;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr7, 0, bArr7, 0);
            int i10 = i2 - i9;
            if (i10 > blockSize) {
                i10 = blockSize;
            }
            java.lang.System.arraycopy(bArr7, 0, bArr8, i9, i10);
            i8++;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int blockSize = this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(bArr2)));
        this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr3, 0, bArr5, 0);
        for (int i = 0; i < length; i++) {
            Camera2StreamConfigurationMap(bArr6, bArr5, bArr4, i * blockSize);
            this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr6, 0, bArr5, 0);
        }
        java.lang.System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }
}
