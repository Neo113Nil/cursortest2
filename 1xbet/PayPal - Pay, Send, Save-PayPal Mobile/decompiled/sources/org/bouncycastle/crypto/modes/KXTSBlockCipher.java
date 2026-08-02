package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class KXTSBlockCipher extends org.bouncycastle.crypto.BufferedBlockCipher {
    private final long[] Camera2StreamConfigurationMap;
    private final long[] getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        if (bArr.length - i < i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (bArr2.length - i < i2) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        if (i2 % this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalArgumentException("Partial blocks not supported");
        }
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i + i5;
            int i7 = i3 + i5;
            int i8 = this.getHighSpeedVideoSizes;
            if (i8 == -1) {
                throw new java.lang.IllegalStateException("Attempt to process too many blocks");
            }
            this.getHighSpeedVideoSizes = i8 + 1;
            long j = this.getHighSpeedVideoFpsRangesFor;
            long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
            long j2 = 0;
            int i9 = 0;
            while (i9 < jArr.length) {
                long j3 = jArr[i9];
                jArr[i9] = j2 ^ (j3 << 1);
                i9++;
                j2 = j3 >>> 63;
            }
            jArr[0] = (j & (-j2)) ^ jArr[0];
            byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRanges];
            org.bouncycastle.util.Pack.longToLittleEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr3, 0);
            int i10 = this.getHighSpeedVideoFpsRanges;
            byte[] bArr4 = new byte[i10];
            java.lang.System.arraycopy(bArr3, 0, bArr4, 0, i10);
            for (int i11 = 0; i11 < this.getHighSpeedVideoFpsRanges; i11++) {
                bArr4[i11] = (byte) (bArr4[i11] ^ bArr[i6 + i11]);
            }
            this.cipher.processBlock(bArr4, 0, bArr4, 0);
            int i12 = 0;
            while (true) {
                i4 = this.getHighSpeedVideoFpsRanges;
                if (i12 < i4) {
                    bArr2[i7 + i12] = (byte) (bArr4[i12] ^ bArr3[i12]);
                    i12++;
                }
            }
            i5 += i4;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        this.cipher.reset();
        long[] jArr = this.Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(jArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, jArr.length);
        this.getHighSpeedVideoSizes = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        throw new java.lang.IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("Invalid parameters passed");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        org.bouncycastle.crypto.CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        int i = this.getHighSpeedVideoFpsRanges;
        if (length != i) {
            throw new java.lang.IllegalArgumentException("Currently only support IVs of exactly one block");
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(iv, 0, bArr, 0, i);
        this.cipher.init(true, parameters);
        this.cipher.processBlock(bArr, 0, bArr, 0);
        this.cipher.init(z, parameters);
        org.bouncycastle.util.Pack.littleEndianToLong(bArr, 0, this.Camera2StreamConfigurationMap);
        long[] jArr = this.Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(jArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, jArr.length);
        this.getHighSpeedVideoSizes = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        reset();
        return 0;
    }

    protected static long getReductionPolynomial(int i) {
        if (i == 16) {
            return 135L;
        }
        if (i == 32) {
            return 1061L;
        }
        if (i == 64) {
            return 293L;
        }
        throw new java.lang.IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    public KXTSBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.getHighSpeedVideoFpsRanges = blockSize;
        this.getHighSpeedVideoFpsRangesFor = getReductionPolynomial(blockSize);
        int i = blockSize >>> 3;
        this.Camera2StreamConfigurationMap = new long[i];
        this.getHighResolutionOutputSizeshNQ4ISI = new long[i];
        this.getHighSpeedVideoSizes = -1;
    }
}
