package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class NullEngine implements org.bouncycastle.crypto.BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private boolean getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("Null engine not initialised");
        }
        int i3 = this.getHighSpeedVideoSizes;
        if (i + i3 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i4 = 0;
        while (true) {
            int i5 = this.getHighSpeedVideoSizes;
            if (i4 >= i5) {
                return i5;
            }
            bArr2[i2 + i4] = bArr[i + i4];
            i4++;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "Null";
    }

    public NullEngine(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public NullEngine() {
        this(1);
    }
}
