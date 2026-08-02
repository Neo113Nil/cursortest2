package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public class ISO7816d4Padding implements org.bouncycastle.crypto.paddings.BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("pad block corrupted");
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public java.lang.String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        bArr[i] = Byte.MIN_VALUE;
        int i2 = i;
        while (true) {
            i2++;
            if (i2 >= bArr.length) {
                return length - i;
            }
            bArr[i2] = 0;
        }
    }
}
