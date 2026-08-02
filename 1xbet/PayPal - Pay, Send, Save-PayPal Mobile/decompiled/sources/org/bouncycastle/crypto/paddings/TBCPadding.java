package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public class TBCPadding implements org.bouncycastle.crypto.paddings.BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public java.lang.String getPaddingName() {
        return "TBC";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) ((i <= 0 ? (bArr[bArr.length + (-1)] & 1) == 0 : (bArr[i + (-1)] & 1) == 0) ? 255 : 0);
        for (int i2 = i; i2 < bArr.length; i2++) {
            bArr[i2] = b;
        }
        return length - i;
    }
}
