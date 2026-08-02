package org.bouncycastle.crypto.fpe;

/* loaded from: classes17.dex */
public abstract class FPEEngine {
    protected final org.bouncycastle.crypto.BlockCipher baseCipher;
    protected boolean forEncryption;
    protected org.bouncycastle.crypto.params.FPEParameters fpeParameters;

    protected abstract int decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    protected abstract int encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public abstract java.lang.String getAlgorithmName();

    public abstract void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.fpeParameters == null) {
            throw new java.lang.IllegalStateException("FPE engine not initialized");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("input length cannot be negative");
        }
        if (bArr == null || bArr2 == null) {
            throw new java.lang.NullPointerException("buffer value is null");
        }
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (bArr2.length >= i3 + i2) {
            return this.forEncryption ? encryptBlock(bArr, i, i2, bArr2, i3) : decryptBlock(bArr, i, i2, bArr2, i3);
        }
        throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
    }

    protected static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("data must be an even number of bytes for a wide radix");
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = org.bouncycastle.util.Pack.bigEndianToShort(bArr, i * 2);
        }
        return sArr;
    }

    protected static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i != sArr.length; i++) {
            org.bouncycastle.util.Pack.shortToBigEndian(sArr[i], bArr, i * 2);
        }
        return bArr;
    }

    protected FPEEngine(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }
}
