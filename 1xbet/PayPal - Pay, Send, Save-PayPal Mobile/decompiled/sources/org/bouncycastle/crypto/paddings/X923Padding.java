package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public class X923Padding implements org.bouncycastle.crypto.paddings.BlockCipherPadding {
    java.security.SecureRandom getHighSpeedVideoSizes = null;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        if (i <= bArr.length) {
            return i;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("pad block corrupted");
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoSizes = secureRandom;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public java.lang.String getPaddingName() {
        return "X9.23";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            java.security.SecureRandom secureRandom = this.getHighSpeedVideoSizes;
            if (secureRandom == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) secureRandom.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }
}
