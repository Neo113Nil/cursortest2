package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public class PKCS7Padding implements org.bouncycastle.crypto.paddings.BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        boolean z = (i > bArr.length) | (i == 0);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            z |= (bArr.length - i2 <= i) & (bArr[i2] != b);
        }
        if (z) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("pad block corrupted");
        }
        return i;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public java.lang.String getPaddingName() {
        return org.bouncycastle.openssl.PEMParser.TYPE_PKCS7;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }
}
