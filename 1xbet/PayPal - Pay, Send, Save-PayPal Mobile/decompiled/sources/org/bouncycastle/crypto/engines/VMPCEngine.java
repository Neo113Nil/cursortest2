package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class VMPCEngine implements org.bouncycastle.crypto.StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;
    protected byte n = 0;
    protected byte[] P = null;
    protected byte s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        byte[] bArr = this.P;
        byte b2 = this.s;
        byte b3 = this.n;
        int i = b3 & 255;
        byte b4 = bArr[i];
        byte b5 = bArr[(b2 + b4) & 255];
        this.s = b5;
        int i2 = b5 & 255;
        byte b6 = bArr[i2];
        byte b7 = bArr[(bArr[b6 & 255] + 1) & 255];
        bArr[i] = b6;
        bArr[i2] = b4;
        this.n = (byte) ((b3 + 1) & 255);
        return (byte) (b ^ b7);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.P;
            byte b = this.s;
            byte b2 = this.n;
            int i5 = b2 & 255;
            byte b3 = bArr3[i5];
            byte b4 = bArr3[(b + b3) & 255];
            this.s = b4;
            int i6 = b4 & 255;
            byte b5 = bArr3[i6];
            byte b6 = bArr3[(bArr3[b5 & 255] + 1) & 255];
            bArr3[i5] = b5;
            bArr3[i6] = b3;
            this.n = (byte) ((b2 + 1) & 255);
            bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b6);
        }
        return i2;
    }

    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.s = (byte) 0;
        this.P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.P;
            byte b = this.s;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.s = b3;
            int i4 = b3 & 255;
            bArr3[i3] = bArr3[i4];
            bArr3[i4] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.P;
            byte b4 = this.s;
            int i6 = i5 & 255;
            byte b5 = bArr4[i6];
            byte b6 = bArr4[(b4 + b5 + bArr2[i5 % bArr2.length]) & 255];
            this.s = b6;
            int i7 = b6 & 255;
            bArr4[i6] = bArr4[i7];
            bArr4[i7] = b5;
        }
        this.n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("VMPC init parameters must include an IV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("VMPC init parameters must include a key");
        }
        org.bouncycastle.crypto.params.KeyParameter keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length <= 0 || iv.length > 768) {
            throw new java.lang.IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "VMPC";
    }
}
