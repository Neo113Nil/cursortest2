package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public class ZeroBytePadding implements org.bouncycastle.crypto.paddings.BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public java.lang.String getPaddingName() {
        return "ZeroByte";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        for (int i2 = i; i2 < bArr.length; i2++) {
            bArr[i2] = 0;
        }
        return length - i;
    }
}
