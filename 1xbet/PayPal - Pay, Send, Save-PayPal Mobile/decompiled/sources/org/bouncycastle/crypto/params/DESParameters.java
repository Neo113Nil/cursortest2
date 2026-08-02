package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DESParameters extends org.bouncycastle.crypto.params.KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] getHighSpeedVideoFpsRangesFor = {1, 1, 1, 1, 1, 1, 1, 1, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, com.google.common.base.Ascii.US, -32, com.google.common.base.Ascii.US, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, com.google.common.base.Ascii.US, -2, com.google.common.base.Ascii.US, -2, 14, -2, 14, -2, 1, com.google.common.base.Ascii.US, 1, com.google.common.base.Ascii.US, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, com.google.common.base.Ascii.US, -32, com.google.common.base.Ascii.US, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, com.google.common.base.Ascii.US, -2, com.google.common.base.Ascii.US, -2, 14, -2, 14, com.google.common.base.Ascii.US, 1, com.google.common.base.Ascii.US, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) ((b & 254) | ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isWeakKey(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            throw new java.lang.IllegalArgumentException("key material too short.");
        }
        int i2 = 0;
        while (i2 < 16) {
            for (int i3 = 0; i3 < 8; i3++) {
                if (bArr[i3 + i] != getHighSpeedVideoFpsRangesFor[(i2 * 8) + i3]) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new java.lang.IllegalArgumentException("attempt to create weak DES key");
        }
    }
}
