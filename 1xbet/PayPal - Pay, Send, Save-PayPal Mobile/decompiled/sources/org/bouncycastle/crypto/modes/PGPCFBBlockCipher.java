package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class PGPCFBBlockCipher implements org.bouncycastle.crypto.BlockCipher {
    private org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (this.getHighSpeedVideoSizesFor) {
            if (this.getInputFormats) {
                int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i + i7 > bArr.length) {
                    throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
                }
                int i8 = this.getInputSizeshNQ4ISI;
                if (i8 != 0) {
                    if (i8 >= i7 + 2) {
                        if (i7 + i2 > bArr2.length) {
                            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
                        }
                        this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                        int i9 = 0;
                        while (true) {
                            i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (i9 >= i4) {
                                break;
                            }
                            bArr2[i2 + i9] = (byte) (bArr[i + i9] ^ this.getHighSpeedVideoFpsRanges[i9]);
                            i9++;
                        }
                        java.lang.System.arraycopy(bArr2, i2, this.getHighSpeedVideoSizes, 0, i4);
                    }
                    return this.getHighResolutionOutputSizeshNQ4ISI;
                }
                if ((i7 * 2) + i2 + 2 > bArr2.length) {
                    throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
                }
                this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                int i10 = 0;
                while (true) {
                    i5 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i10 >= i5) {
                        break;
                    }
                    bArr2[i2 + i10] = (byte) (this.getHighSpeedVideoFpsRangesFor[i10] ^ this.getHighSpeedVideoFpsRanges[i10]);
                    i10++;
                }
                java.lang.System.arraycopy(bArr2, i2, this.getHighSpeedVideoSizes, 0, i5);
                this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                int i11 = this.getHighResolutionOutputSizeshNQ4ISI;
                byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
                byte b = bArr3[i11 - 2];
                byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
                bArr2[i2 + i11] = (byte) (b ^ bArr4[0]);
                bArr2[i2 + i11 + 1] = (byte) (bArr3[i11 - 1] ^ bArr4[1]);
                java.lang.System.arraycopy(bArr2, i2 + 2, this.getHighSpeedVideoSizes, 0, i11);
                this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                int i12 = 0;
                while (true) {
                    int i13 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i12 >= i13) {
                        java.lang.System.arraycopy(bArr2, i2 + i13 + 2, this.getHighSpeedVideoSizes, 0, i13);
                        int i14 = this.getInputSizeshNQ4ISI;
                        int i15 = (this.getHighResolutionOutputSizeshNQ4ISI * 2) + 2;
                        this.getInputSizeshNQ4ISI = i14 + i15;
                        return i15;
                    }
                    bArr2[i13 + i2 + 2 + i12] = (byte) (bArr[i + i12] ^ this.getHighSpeedVideoFpsRanges[i12]);
                    i12++;
                }
            } else {
                int i16 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i + i16 > bArr.length) {
                    throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
                }
                if (i2 + i16 > bArr2.length) {
                    throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
                }
                int i17 = this.getInputSizeshNQ4ISI;
                if (i17 == 0) {
                    for (int i18 = 0; i18 < this.getHighResolutionOutputSizeshNQ4ISI; i18++) {
                        this.getHighSpeedVideoSizes[i18] = bArr[i + i18];
                    }
                    this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                    this.getInputSizeshNQ4ISI += this.getHighResolutionOutputSizeshNQ4ISI;
                    return 0;
                }
                if (i17 != i16) {
                    if (i17 >= i16 + 2) {
                        java.lang.System.arraycopy(bArr, i, this.getOutputFormats, 0, i16);
                        byte[] bArr5 = this.getOutputFormats;
                        byte b2 = bArr5[0];
                        int i19 = this.getHighResolutionOutputSizeshNQ4ISI;
                        byte[] bArr6 = this.getHighSpeedVideoFpsRanges;
                        bArr2[i2] = (byte) (b2 ^ bArr6[i19 - 2]);
                        bArr2[i2 + 1] = (byte) (bArr5[1] ^ bArr6[i19 - 1]);
                        java.lang.System.arraycopy(bArr5, 0, this.getHighSpeedVideoSizes, i19 - 2, 2);
                        this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
                        int i20 = 0;
                        while (true) {
                            i3 = this.getHighResolutionOutputSizeshNQ4ISI - 2;
                            if (i20 >= i3) {
                                break;
                            }
                            bArr2[i2 + i20 + 2] = (byte) (this.getOutputFormats[i20 + 2] ^ this.getHighSpeedVideoFpsRanges[i20]);
                            i20++;
                        }
                        java.lang.System.arraycopy(this.getOutputFormats, 2, this.getHighSpeedVideoSizes, 0, i3);
                    }
                    return this.getHighResolutionOutputSizeshNQ4ISI;
                }
                java.lang.System.arraycopy(bArr, i, this.getOutputFormats, 0, i16);
                byte[] bArr7 = this.getHighSpeedVideoSizes;
                java.lang.System.arraycopy(bArr7, 2, bArr7, 0, this.getHighResolutionOutputSizeshNQ4ISI - 2);
                byte[] bArr8 = this.getHighSpeedVideoSizes;
                int i21 = this.getHighResolutionOutputSizeshNQ4ISI;
                byte[] bArr9 = this.getOutputFormats;
                bArr8[i21 - 2] = bArr9[0];
                bArr8[i21 - 1] = bArr9[1];
                this.Camera2StreamConfigurationMap.processBlock(bArr8, 0, this.getHighSpeedVideoFpsRanges, 0);
                int i22 = 0;
                while (true) {
                    int i23 = this.getHighResolutionOutputSizeshNQ4ISI - 2;
                    if (i22 >= i23) {
                        java.lang.System.arraycopy(this.getOutputFormats, 2, this.getHighSpeedVideoSizes, 0, i23);
                        this.getInputSizeshNQ4ISI += 2;
                        return this.getHighResolutionOutputSizeshNQ4ISI - 2;
                    }
                    bArr2[i2 + i22] = (byte) (this.getOutputFormats[i22 + 2] ^ this.getHighSpeedVideoFpsRanges[i22]);
                    i22++;
                }
            }
        } else if (this.getInputFormats) {
            int i24 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i + i24 > bArr.length) {
                throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
            }
            if (i24 + i2 > bArr2.length) {
                throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
            }
            this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
            for (int i25 = 0; i25 < this.getHighResolutionOutputSizeshNQ4ISI; i25++) {
                bArr2[i2 + i25] = (byte) (bArr[i + i25] ^ this.getHighSpeedVideoFpsRanges[i25]);
            }
            while (true) {
                int i26 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i6 >= i26) {
                    return i26;
                }
                this.getHighSpeedVideoSizes[i6] = bArr2[i2 + i6];
                i6++;
            }
        } else {
            int i27 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i + i27 > bArr.length) {
                throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
            }
            if (i27 + i2 > bArr2.length) {
                throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
            }
            this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoFpsRanges, 0);
            for (int i28 = 0; i28 < this.getHighResolutionOutputSizeshNQ4ISI; i28++) {
                bArr2[i2 + i28] = (byte) (bArr[i + i28] ^ this.getHighSpeedVideoFpsRanges[i28]);
            }
            while (true) {
                int i29 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i6 >= i29) {
                    return i29;
                }
                this.getHighSpeedVideoSizes[i6] = bArr[i + i6];
                i6++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.getInputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i == bArr.length) {
                this.Camera2StreamConfigurationMap.reset();
                return;
            }
            if (this.getHighSpeedVideoSizesFor) {
                bArr[i] = 0;
            } else {
                bArr[i] = this.getHighSpeedVideoFpsRangesFor[i];
            }
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        this.getInputFormats = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (length < bArr.length) {
                java.lang.System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
                    if (i >= bArr2.length - iv.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                java.lang.System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            blockCipher = this.Camera2StreamConfigurationMap;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            blockCipher = this.Camera2StreamConfigurationMap;
        }
        blockCipher.init(true, cipherParameters);
    }

    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.Camera2StreamConfigurationMap.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        if (this.getHighSpeedVideoSizesFor) {
            sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb.append(str);
        return sb.toString();
    }

    public PGPCFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, boolean z) {
        this.Camera2StreamConfigurationMap = blockCipher;
        this.getHighSpeedVideoSizesFor = z;
        int blockSize = blockCipher.getBlockSize();
        this.getHighResolutionOutputSizeshNQ4ISI = blockSize;
        this.getHighSpeedVideoFpsRangesFor = new byte[blockSize];
        this.getHighSpeedVideoSizes = new byte[blockSize];
        this.getHighSpeedVideoFpsRanges = new byte[blockSize];
        this.getOutputFormats = new byte[blockSize];
    }
}
