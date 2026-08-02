package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class SICBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher implements org.bouncycastle.crypto.SkippingStreamCipher {
    private final int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j) {
        long j2;
        long j3;
        int i = 5;
        if (j >= 0) {
            long j4 = (this.getHighResolutionOutputSizeshNQ4ISI + j) / this.Camera2StreamConfigurationMap;
            if (j4 > 255) {
                j3 = j4;
                while (i > 0) {
                    long j5 = 1 << (i * 8);
                    while (j3 >= j5) {
                        getHighSpeedVideoFpsRangesFor(i);
                        j3 -= j5;
                    }
                    i--;
                }
            } else {
                j3 = j4;
            }
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            byte b = bArr[bArr.length - 1];
            int length = bArr.length - 1;
            bArr[length] = (byte) (bArr[length] + ((int) j3));
            if (b != 0 && bArr[bArr.length - 1] < b) {
                getHighSpeedVideoFpsRangesFor(1);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (int) ((this.getHighResolutionOutputSizeshNQ4ISI + j) - (this.Camera2StreamConfigurationMap * j4));
        } else {
            long j6 = ((-j) - this.getHighResolutionOutputSizeshNQ4ISI) / this.Camera2StreamConfigurationMap;
            if (j6 > 255) {
                j2 = j6;
                while (i > 0) {
                    long j7 = 1 << (i * 8);
                    while (j2 > j7) {
                        getHighSpeedVideoSizes(i);
                        j2 -= j7;
                    }
                    i--;
                }
            } else {
                j2 = j6;
            }
            for (long j8 = 0; j8 != j2; j8++) {
                getHighSpeedVideoSizes(0);
            }
            int i2 = (int) (this.getHighResolutionOutputSizeshNQ4ISI + j + (this.Camera2StreamConfigurationMap * j6));
            if (i2 >= 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
            } else {
                getHighSpeedVideoSizes(0);
                this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap + i2;
            }
        }
        if (this.getHighSpeedVideoSizes.length < this.Camera2StreamConfigurationMap) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = this.getHighSpeedVideoSizes;
                if (i3 == bArr2.length) {
                    break;
                }
                if (this.getHighSpeedVideoFpsRanges[i3] != bArr2[i3]) {
                    throw new java.lang.IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
                i3++;
            }
        }
        this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getInputSizeshNQ4ISI, 0);
        return j;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRanges, (byte) 0);
        byte[] bArr = this.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoFpsRanges, 0, bArr.length);
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        byte b;
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i5 == 0) {
                this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getInputSizeshNQ4ISI, 0);
                byte b2 = bArr[i + i4];
                byte[] bArr3 = this.getInputSizeshNQ4ISI;
                int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i6 + 1;
                b = (byte) (b2 ^ bArr3[i6]);
            } else {
                byte b3 = bArr[i + i4];
                byte[] bArr4 = this.getInputSizeshNQ4ISI;
                int i7 = i5 + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i7;
                b = (byte) (bArr4[i5] ^ b3);
                if (i7 == this.getHighSpeedVideoFpsRanges.length) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    getHighSpeedVideoFpsRangesFor();
                }
            }
            bArr2[i3 + i4] = b;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            processBytes(bArr, i, this.Camera2StreamConfigurationMap, bArr2, i2);
        } else {
            int i3 = this.Camera2StreamConfigurationMap;
            if (i + i3 > bArr.length) {
                throw new org.bouncycastle.crypto.DataLengthException("input buffer too small");
            }
            if (i3 + i2 > bArr2.length) {
                throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
            }
            this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getInputSizeshNQ4ISI, 0);
            for (int i4 = 0; i4 < this.Camera2StreamConfigurationMap; i4++) {
                bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.getInputSizeshNQ4ISI[i4]);
            }
            getHighSpeedVideoFpsRangesFor();
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] clone = org.bouncycastle.util.Arrays.clone(parametersWithIV.getIV());
        this.getHighSpeedVideoSizes = clone;
        int i = this.Camera2StreamConfigurationMap;
        if (i < clone.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CTR/SIC mode requires IV no greater than: ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(" bytes.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i2 = i / 2;
        if (8 <= i2) {
            i2 = 8;
        }
        if (i - clone.length <= i2) {
            if (parametersWithIV.getParameters() != null) {
                this.getHighSpeedVideoFpsRangesFor.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CTR/SIC mode requires IV of at least: ");
            sb2.append(this.Camera2StreamConfigurationMap - i2);
            sb2.append(" bytes.");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = length - 1;
        while (i > 0) {
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            int i2 = i < bArr3.length ? (bArr2[i] & 255) - (bArr3[i] & 255) : bArr2[i] & 255;
            if (i2 < 0) {
                bArr2[i - 1] = (byte) (bArr2[r3] - 1);
                i2 += 256;
            }
            bArr2[i] = (byte) i2;
            i--;
        }
        return (org.bouncycastle.util.Pack.bigEndianToLong(bArr2, length - 8) * this.Camera2StreamConfigurationMap) + this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
        sb.append("/SIC");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getInputSizeshNQ4ISI, 0);
            byte[] bArr = this.getInputSizeshNQ4ISI;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        int i3 = i + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.getHighSpeedVideoFpsRanges.length) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            getHighSpeedVideoFpsRangesFor();
        }
        return b2;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        byte b;
        int length = this.getHighSpeedVideoFpsRanges.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        if (length < bArr2.length && bArr2.length < this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    private void getHighSpeedVideoFpsRangesFor(int i) {
        byte b;
        int length = this.getHighSpeedVideoFpsRanges.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    private void getHighSpeedVideoSizes(int i) {
        byte b;
        int length = this.getHighSpeedVideoFpsRanges.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b = (byte) (r1[length] - 1);
            this.getHighSpeedVideoFpsRanges[length] = b;
        } while (b == -1);
    }

    public SICBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        super(blockCipher);
        this.getHighSpeedVideoFpsRangesFor = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.Camera2StreamConfigurationMap = blockSize;
        this.getHighSpeedVideoSizes = new byte[blockSize];
        this.getHighSpeedVideoFpsRanges = new byte[blockSize];
        this.getInputSizeshNQ4ISI = new byte[blockSize];
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }
}
