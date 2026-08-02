package com.google.crypto.tink.mac.internal;

/* loaded from: classes4.dex */
public final class AesUtil {
    public static final int BLOCK_SIZE = 16;

    public static byte[] dbl(byte[] bArr) {
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] cmacPad(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new java.lang.IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, 16);
        copyOf[bArr.length] = Byte.MIN_VALUE;
        return copyOf;
    }

    private AesUtil() {
    }
}
