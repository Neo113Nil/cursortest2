package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public abstract class SerpentEngineBase implements org.bouncycastle.crypto.BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    protected int X0;
    protected int X1;
    protected int X2;
    protected int X3;
    protected boolean encrypting;
    protected int[] wKey;

    protected static int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    protected static int rotateRight(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    protected abstract void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    protected abstract void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    protected abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    protected final void sb7(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        this.X1 = i8;
        int i9 = (i & i7) ^ i5;
        this.X3 = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        this.X2 = i11;
        this.X0 = (i9 & i11) ^ (~i10);
    }

    protected final void sb6(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i2 ^ i5;
        int i7 = ((~i) | i5) ^ i3;
        int i8 = i2 ^ i7;
        this.X1 = i8;
        int i9 = (i8 | i5) ^ i4;
        int i10 = (i7 & i9) ^ i6;
        this.X2 = i10;
        int i11 = i9 ^ i7;
        this.X0 = i10 ^ i11;
        this.X3 = (~i7) ^ (i11 & i6);
    }

    protected final void sb5(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        this.X0 = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        this.X1 = i10;
        int i11 = i7 ^ (i8 | i5);
        this.X2 = (i6 | i9) ^ i11;
        this.X3 = (i11 & i10) ^ (i2 ^ i9);
    }

    protected final void sb4(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        this.X3 = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        this.X0 = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        this.X2 = i11;
        this.X1 = (i ^ i6) ^ (i10 & i11);
    }

    protected final void sb3(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i | i4;
        int i7 = i3 ^ i4;
        int i8 = (i & i3) | (i5 & i6);
        int i9 = i7 ^ i8;
        this.X2 = i9;
        int i10 = i8 ^ (i6 ^ i2);
        int i11 = i5 ^ (i7 & i10);
        this.X0 = i11;
        int i12 = i9 & i11;
        this.X1 = i10 ^ i12;
        this.X3 = (i2 | i4) ^ (i7 ^ i12);
    }

    protected final void sb2(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        this.X0 = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        this.X3 = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        this.X2 = i11;
        this.X1 = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    protected final void sb1(int i, int i2, int i3, int i4) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        this.X2 = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        this.X3 = i10;
        int i11 = i8 ^ i6;
        this.X1 = i10 ^ i11;
        this.X0 = i6 ^ (i11 & i9);
    }

    protected final void sb0(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        this.X3 = i8;
        int i9 = i ^ (i2 & i5);
        this.X2 = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        this.X1 = (~i6) ^ i10;
        this.X0 = (~i9) ^ i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.wKey == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 16;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 16;
    }

    protected final void inverseLT() {
        int rotateRight = (rotateRight(this.X2, 22) ^ this.X3) ^ (this.X1 << 7);
        int rotateRight2 = rotateRight(this.X0, 5);
        int i = this.X1;
        int i2 = this.X3;
        int i3 = (rotateRight2 ^ i) ^ i2;
        int rotateRight3 = rotateRight(i2, 7);
        int rotateRight4 = rotateRight(this.X1, 1);
        this.X3 = (rotateRight3 ^ rotateRight) ^ (i3 << 3);
        this.X1 = (rotateRight4 ^ i3) ^ rotateRight;
        this.X2 = rotateRight(rotateRight, 3);
        this.X0 = rotateRight(i3, 13);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            this.encrypting = z;
            this.wKey = makeWorkingKey(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to ");
            sb.append(getAlgorithmName());
            sb.append(" init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    protected final void ib7(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        this.X3 = i7;
        int i8 = i2 ^ i6;
        int i9 = (((~i4) ^ i7) | i8) ^ i;
        this.X1 = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        this.X0 = i10;
        this.X2 = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    protected final void ib6(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.X1 = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        this.X3 = i10;
        int i11 = i2 | i10;
        this.X0 = i9 ^ i11;
        this.X2 = (i4 & i5) ^ (i11 ^ i7);
    }

    protected final void ib5(int i, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        this.X3 = i8;
        int i9 = i8 | i2;
        this.X1 = i6 ^ (i & i9);
        int i10 = i4 | i;
        this.X0 = (i5 ^ i9) ^ i10;
        this.X2 = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    protected final void ib4(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        this.X1 = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        this.X3 = i9;
        int i10 = i4 ^ (i7 | i8);
        this.X0 = i9 ^ i10;
        this.X2 = (i8 ^ i7) ^ (i5 & i10);
    }

    protected final void ib3(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i2 & i5) ^ i;
        int i7 = i4 | i6;
        int i8 = i5 ^ i7;
        this.X0 = i8;
        int i9 = i4 ^ (i5 | i7);
        this.X2 = (i3 ^ i6) ^ i9;
        int i10 = (i | i2) ^ i9;
        int i11 = (i8 & i10) ^ i6;
        this.X3 = i11;
        this.X1 = (i10 ^ i8) ^ i11;
    }

    protected final void ib2(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = i ^ i3;
        int i7 = i3 ^ i5;
        int i8 = (i2 & i7) ^ i6;
        this.X0 = i8;
        int i9 = (((i | (~i5)) ^ i4) | i6) ^ i5;
        this.X3 = i9;
        int i10 = ~i7;
        int i11 = i9 | i8;
        this.X1 = i10 ^ i11;
        this.X2 = (i11 ^ i6) ^ (i4 & i10);
    }

    protected final void ib1(int i, int i2, int i3, int i4) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        this.X3 = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        this.X1 = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        this.X0 = i11 ^ i12;
        this.X2 = (i11 | i12) ^ i7;
    }

    protected final void ib0(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        this.X2 = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        this.X1 = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        this.X3 = i12;
        this.X0 = i12 ^ (i10 ^ i8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "Serpent";
    }

    protected final void LT() {
        int rotateLeft = rotateLeft(this.X0, 13);
        int rotateLeft2 = rotateLeft(this.X2, 3);
        int i = this.X1;
        int i2 = this.X3;
        this.X1 = rotateLeft((i ^ rotateLeft) ^ rotateLeft2, 1);
        int rotateLeft3 = rotateLeft((i2 ^ rotateLeft2) ^ (rotateLeft << 3), 7);
        this.X3 = rotateLeft3;
        this.X0 = rotateLeft((rotateLeft ^ this.X1) ^ rotateLeft3, 5);
        this.X2 = rotateLeft((this.X3 ^ rotateLeft2) ^ (this.X1 << 7), 22);
    }

    SerpentEngineBase() {
    }
}
