package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public abstract class StreamBlockCipher implements org.bouncycastle.crypto.BlockCipher, org.bouncycastle.crypto.StreamCipher {
    private final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRanges;

    protected abstract byte calculateByte(byte b);

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b) {
        return calculateByte(b);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        while (i < i4) {
            bArr2[i3] = calculateByte(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }

    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public StreamBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoFpsRanges = blockCipher;
    }
}
