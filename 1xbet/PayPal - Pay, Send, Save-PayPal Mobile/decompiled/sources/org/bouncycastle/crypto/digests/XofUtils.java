package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class XofUtils {
    public static byte[] rightEncode(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[b] = b;
        for (int i = 0; i < b; i++) {
            bArr[i] = (byte) (j >> (((b - i) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] leftEncode(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[0] = b;
        for (int i = 1; i <= b; i++) {
            bArr[i] = (byte) (j >> ((b - i) * 8));
        }
        return bArr;
    }

    static byte[] getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) {
        return bArr.length == i2 ? org.bouncycastle.util.Arrays.concatenate(leftEncode(i2 * 8), bArr) : org.bouncycastle.util.Arrays.concatenate(leftEncode(i2 * 8), org.bouncycastle.util.Arrays.copyOfRange(bArr, i, i2 + i));
    }

    static byte[] getHighSpeedVideoFpsRanges(byte b) {
        return org.bouncycastle.util.Arrays.concatenate(leftEncode(8L), new byte[]{b});
    }
}
