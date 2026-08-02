package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class OpenPGPCFBBlockCipher implements org.bouncycastle.crypto.BlockCipher {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private int getOutputFormats;
    private boolean getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2;
        int i8 = 0;
        if (this.getOutputMinFrameDuration) {
            int i9 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i + i9 > bArr.length) {
                throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
            }
            if (i2 + i9 > bArr2.length) {
                throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
            }
            int i10 = this.getOutputFormats;
            if (i10 > i9) {
                byte[] bArr3 = this.getHighSpeedVideoSizes;
                byte b = bArr[i];
                int i11 = i9 - 2;
                byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
                byte b2 = (byte) (b ^ bArr4[i11]);
                bArr2[i2] = b2;
                bArr3[i11] = b2;
                int i12 = i9 - 1;
                byte b3 = (byte) (bArr[i + 1] ^ bArr4[i12]);
                bArr2[i2 + 1] = b3;
                bArr3[i12] = b3;
                this.getHighSpeedVideoFpsRangesFor.processBlock(bArr3, 0, bArr4, 0);
                while (i7 < this.getHighResolutionOutputSizeshNQ4ISI) {
                    byte[] bArr5 = this.getHighSpeedVideoSizes;
                    int i13 = i7 - 2;
                    byte b4 = (byte) (bArr[i + i7] ^ this.getHighSpeedVideoFpsRanges[i13]);
                    bArr2[i2 + i7] = b4;
                    bArr5[i13] = b4;
                    i7++;
                }
            } else {
                if (i10 != 0) {
                    if (i10 == i9) {
                        this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                        byte b5 = bArr[i];
                        byte[] bArr6 = this.getHighSpeedVideoFpsRanges;
                        bArr2[i2] = (byte) (b5 ^ bArr6[0]);
                        bArr2[i2 + 1] = (byte) (bArr6[1] ^ bArr[i + 1]);
                        byte[] bArr7 = this.getHighSpeedVideoSizes;
                        java.lang.System.arraycopy(bArr7, 2, bArr7, 0, this.getHighResolutionOutputSizeshNQ4ISI - 2);
                        java.lang.System.arraycopy(bArr2, i2, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI - 2, 2);
                        this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                        while (true) {
                            i6 = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (i7 >= i6) {
                                break;
                            }
                            byte[] bArr8 = this.getHighSpeedVideoSizes;
                            int i14 = i7 - 2;
                            byte b6 = (byte) (bArr[i + i7] ^ this.getHighSpeedVideoFpsRanges[i14]);
                            bArr2[i2 + i7] = b6;
                            bArr8[i14] = b6;
                            i7++;
                        }
                    }
                } else {
                    this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                    while (true) {
                        i6 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i8 >= i6) {
                            break;
                        }
                        byte[] bArr9 = this.getHighSpeedVideoSizes;
                        byte b7 = (byte) (bArr[i + i8] ^ this.getHighSpeedVideoFpsRanges[i8]);
                        bArr2[i2 + i8] = b7;
                        bArr9[i8] = b7;
                        i8++;
                    }
                }
                this.getOutputFormats += i6;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        int i15 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i + i15 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + i15 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i16 = this.getOutputFormats;
        if (i16 > i15) {
            byte b8 = bArr[i];
            byte[] bArr10 = this.getHighSpeedVideoSizes;
            int i17 = i15 - 2;
            bArr10[i17] = b8;
            byte[] bArr11 = this.getHighSpeedVideoFpsRanges;
            bArr2[i2] = (byte) (b8 ^ bArr11[i17]);
            byte b9 = bArr[i + 1];
            int i18 = i15 - 1;
            bArr10[i18] = b9;
            bArr2[i2 + 1] = (byte) (bArr11[i18] ^ b9);
            this.getHighSpeedVideoFpsRangesFor.processBlock(bArr10, 0, bArr11, 0);
            while (i7 < this.getHighResolutionOutputSizeshNQ4ISI) {
                byte b10 = bArr[i + i7];
                int i19 = i7 - 2;
                this.getHighSpeedVideoSizes[i19] = b10;
                bArr2[i2 + i7] = (byte) (b10 ^ this.getHighSpeedVideoFpsRanges[i19]);
                i7++;
            }
        } else {
            if (i16 == 0) {
                this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                while (true) {
                    i5 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i8 >= i5) {
                        break;
                    }
                    int i20 = i + i8;
                    this.getHighSpeedVideoSizes[i8] = bArr[i20];
                    bArr2[i8] = (byte) (bArr[i20] ^ this.getHighSpeedVideoFpsRanges[i8]);
                    i8++;
                }
                i4 = this.getOutputFormats + i5;
            } else if (i16 == i15) {
                this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                byte b11 = bArr[i];
                byte b12 = bArr[i + 1];
                byte[] bArr12 = this.getHighSpeedVideoFpsRanges;
                bArr2[i2] = (byte) (bArr12[0] ^ b11);
                bArr2[i2 + 1] = (byte) (bArr12[1] ^ b12);
                byte[] bArr13 = this.getHighSpeedVideoSizes;
                java.lang.System.arraycopy(bArr13, 2, bArr13, 0, this.getHighResolutionOutputSizeshNQ4ISI - 2);
                byte[] bArr14 = this.getHighSpeedVideoSizes;
                int i21 = this.getHighResolutionOutputSizeshNQ4ISI;
                bArr14[i21 - 2] = b11;
                bArr14[i21 - 1] = b12;
                this.getHighSpeedVideoFpsRangesFor.processBlock(bArr14, 0, this.getHighSpeedVideoFpsRanges, 0);
                while (true) {
                    i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i7 >= i3) {
                        break;
                    }
                    byte b13 = bArr[i + i7];
                    int i22 = i7 - 2;
                    this.getHighSpeedVideoSizes[i22] = b13;
                    bArr2[i2 + i7] = (byte) (b13 ^ this.getHighSpeedVideoFpsRanges[i22]);
                    i7++;
                }
                i4 = this.getOutputFormats + i3;
            }
            this.getOutputFormats = i4;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.getOutputFormats = 0;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        this.getOutputMinFrameDuration = z;
        reset();
        this.getHighSpeedVideoFpsRangesFor.init(true, cipherParameters);
    }

    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
        sb.append("/OpenPGPCFB");
        return sb.toString();
    }

    public OpenPGPCFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoFpsRangesFor = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.getHighResolutionOutputSizeshNQ4ISI = blockSize;
        this.Camera2StreamConfigurationMap = new byte[blockSize];
        this.getHighSpeedVideoSizes = new byte[blockSize];
        this.getHighSpeedVideoFpsRanges = new byte[blockSize];
    }
}
