package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public class PaddedBufferedBlockCipher extends org.bouncycastle.crypto.BufferedBlockCipher {
    org.bouncycastle.crypto.paddings.BlockCipherPadding getHighSpeedVideoFpsRanges;

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
            this.bufOff = 0;
            i2 -= length;
            i += length;
            i4 = processBlock;
            while (i2 > this.buf.length) {
                i4 += this.cipher.processBlock(bArr, i, bArr2, i3 + i4);
                i2 -= blockSize;
                i += blockSize;
            }
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
            this.bufOff = 0;
            i2 = processBlock;
        }
        byte[] bArr2 = this.buf;
        int i3 = this.bufOff;
        this.bufOff = i3 + 1;
        bArr2[i3] = b;
        return i2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        this.forEncryption = z;
        reset();
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighSpeedVideoFpsRanges.init(parametersWithRandom.getRandom());
            blockCipher = this.cipher;
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.getHighSpeedVideoFpsRanges.init(null);
            blockCipher = this.cipher;
        }
        blockCipher.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        int length = i2 % this.buf.length;
        return length == 0 ? java.lang.Math.max(0, i2 - this.buf.length) : i2 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        int length;
        int i2 = i + this.bufOff;
        int length2 = i2 % this.buf.length;
        if (length2 != 0) {
            i2 -= length2;
            length = this.buf.length;
        } else {
            if (!this.forEncryption) {
                return i2;
            }
            length = this.buf.length;
        }
        return i2 + length;
    }

    /* JADX WARN: Finally extract failed */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int i2;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i2 = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    reset();
                    throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
                }
                i2 = this.cipher.processBlock(this.buf, 0, bArr, i);
                this.bufOff = 0;
            }
            this.getHighSpeedVideoFpsRanges.addPadding(this.buf, this.bufOff);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr, i + i2);
            reset();
            return i2 + processBlock;
        }
        if (this.bufOff != blockSize) {
            reset();
            throw new org.bouncycastle.crypto.DataLengthException("last block incomplete in decryption");
        }
        int processBlock2 = this.cipher.processBlock(this.buf, 0, this.buf, 0);
        this.bufOff = 0;
        try {
            int padCount = processBlock2 - this.getHighSpeedVideoFpsRanges.padCount(this.buf);
            java.lang.System.arraycopy(this.buf, 0, bArr, i, padCount);
            reset();
            return padCount;
        } catch (java.lang.Throwable th) {
            reset();
            throw th;
        }
    }

    public PaddedBufferedBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.getHighSpeedVideoFpsRanges = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    public PaddedBufferedBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, new org.bouncycastle.crypto.paddings.PKCS7Padding());
    }
}
