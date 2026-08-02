package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class CTSBlockCipher extends org.bouncycastle.crypto.BufferedBlockCipher {
    private int getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int length = this.buf.length - this.bufOff;
        int i4 = 0;
        if (i2 > length) {
            java.lang.System.arraycopy(bArr, i, this.buf, this.bufOff, length);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i3);
            byte[] bArr3 = this.buf;
            java.lang.System.arraycopy(bArr3, blockSize, bArr3, 0, blockSize);
            this.bufOff = blockSize;
            i2 -= length;
            i += length;
            while (i2 > blockSize) {
                java.lang.System.arraycopy(bArr, i, this.buf, this.bufOff, blockSize);
                processBlock += this.cipher.processBlock(this.buf, 0, bArr2, i3 + processBlock);
                byte[] bArr4 = this.buf;
                java.lang.System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i4 = processBlock;
        }
        java.lang.System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
        return i4;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i2 = 0;
        if (this.bufOff == this.buf.length) {
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr, i);
            java.lang.System.arraycopy(this.buf, this.getHighSpeedVideoFpsRanges, this.buf, 0, this.getHighSpeedVideoFpsRanges);
            this.bufOff = this.getHighSpeedVideoFpsRanges;
            i2 = processBlock;
        }
        byte[] bArr2 = this.buf;
        int i3 = this.bufOff;
        this.bufOff = i3 + 1;
        bArr2[i3] = b;
        return i2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        int length = i2 % this.buf.length;
        return length == 0 ? i2 - this.buf.length : i2 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.bufOff + i > bArr.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i2 = this.bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            if (this.bufOff < blockSize) {
                throw new org.bouncycastle.crypto.DataLengthException("need at least one block of input for CTS");
            }
            this.cipher.processBlock(this.buf, 0, bArr2, 0);
            if (this.bufOff > blockSize) {
                for (int i3 = this.bufOff; i3 != this.buf.length; i3++) {
                    this.buf[i3] = bArr2[i3 - blockSize];
                }
                for (int i4 = blockSize; i4 != this.bufOff; i4++) {
                    byte[] bArr3 = this.buf;
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr2[i4 - blockSize]);
                }
                if (this.cipher instanceof org.bouncycastle.crypto.modes.CBCBlockCipher) {
                    ((org.bouncycastle.crypto.modes.CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, blockSize, bArr, i);
                } else {
                    this.cipher.processBlock(this.buf, blockSize, bArr, i);
                }
                java.lang.System.arraycopy(bArr2, 0, bArr, i + blockSize, i2);
            }
            java.lang.System.arraycopy(bArr2, 0, bArr, i, blockSize);
        } else {
            if (this.bufOff < blockSize) {
                throw new org.bouncycastle.crypto.DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (this.bufOff > blockSize) {
                if (this.cipher instanceof org.bouncycastle.crypto.modes.CBCBlockCipher) {
                    ((org.bouncycastle.crypto.modes.CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                } else {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                }
                for (int i5 = blockSize; i5 != this.bufOff; i5++) {
                    int i6 = i5 - blockSize;
                    bArr4[i6] = (byte) (bArr2[i6] ^ this.buf[i5]);
                }
                java.lang.System.arraycopy(this.buf, blockSize, bArr2, 0, i2);
                this.cipher.processBlock(bArr2, 0, bArr, i);
                java.lang.System.arraycopy(bArr4, 0, bArr, i + blockSize, i2);
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                java.lang.System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i7 = this.bufOff;
        reset();
        return i7;
    }

    public CTSBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        if (blockCipher instanceof org.bouncycastle.crypto.StreamBlockCipher) {
            throw new java.lang.IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.getHighSpeedVideoFpsRanges = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }
}
