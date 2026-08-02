package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class BufferedAsymmetricBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    private final org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRangesFor;

    public void reset() {
        if (this.buf != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        }
        this.bufOff = 0;
    }

    public void processBytes(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int i3 = this.bufOff;
        byte[] bArr2 = this.buf;
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.DataLengthException("attempt to process message too long for cipher");
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
        this.bufOff += i2;
    }

    public void processByte(byte b) {
        int i = this.bufOff;
        byte[] bArr = this.buf;
        if (i >= bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("attempt to process message too long for cipher");
        }
        this.bufOff = i + 1;
        bArr[i] = b;
    }

    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        reset();
        this.getHighSpeedVideoFpsRangesFor.init(z, cipherParameters);
        this.buf = new byte[this.getHighSpeedVideoFpsRangesFor.getInputBlockSize() + (z ? 1 : 0)];
        this.bufOff = 0;
    }

    public org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getOutputBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.getOutputBlockSize();
    }

    public int getInputBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.getInputBlockSize();
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public byte[] doFinal() throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] processBlock = this.getHighSpeedVideoFpsRangesFor.processBlock(this.buf, 0, this.bufOff);
        reset();
        return processBlock;
    }

    public BufferedAsymmetricBlockCipher(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoFpsRangesFor = asymmetricBlockCipher;
    }
}
