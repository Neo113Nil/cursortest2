package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    private static long load32(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static long load26(byte[] bArr, int i, int i2) {
        return (load32(bArr, i) >> i2) & 67108863;
    }

    private static void toByteArray(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    private static void copyBlockSize(byte[] bArr, byte[] bArr2, int i) {
        int min = java.lang.Math.min(16, bArr2.length - i);
        java.lang.System.arraycopy(bArr2, i, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            java.util.Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i = 0;
        long load26 = load26(bArr, 0, 0) & 67108863;
        int i2 = 3;
        long load262 = load26(bArr, 3, 2) & 67108611;
        long load263 = load26(bArr, 6, 4) & 67092735;
        long load264 = load26(bArr, 9, 6) & 66076671;
        long load265 = load26(bArr, 12, 8) & 1048575;
        long j = load263 * 5;
        long j2 = load264 * 5;
        long j3 = load265 * 5;
        byte[] bArr3 = new byte[17];
        long j4 = 0;
        int i3 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        while (i3 < bArr2.length) {
            copyBlockSize(bArr3, bArr2, i3);
            long load266 = j8 + load26(bArr3, i, i);
            long load267 = j5 + load26(bArr3, i2, 2);
            long load268 = j4 + load26(bArr3, 6, 4);
            long load269 = j6 + load26(bArr3, 9, 6);
            long load2610 = j7 + (load26(bArr3, 12, 8) | (bArr3[16] << com.google.common.base.Ascii.CAN));
            long j9 = (load266 * load26) + (load267 * j3) + (load268 * j2) + (load269 * j) + (load262 * 5 * load2610);
            long j10 = (load266 * load262) + (load267 * load26) + (load268 * j3) + (load269 * j2) + (load2610 * j) + (j9 >> 26);
            long j11 = (load266 * load263) + (load267 * load262) + (load268 * load26) + (load269 * j3) + (load2610 * j2) + (j10 >> 26);
            long j12 = (load266 * load264) + (load267 * load263) + (load268 * load262) + (load269 * load26) + (load2610 * j3) + (j11 >> 26);
            long j13 = (load266 * load265) + (load267 * load264) + (load268 * load263) + (load269 * load262) + (load2610 * load26) + (j12 >> 26);
            j7 = j13 & 67108863;
            long j14 = (j9 & 67108863) + ((j13 >> 26) * 5);
            j8 = j14 & 67108863;
            j5 = (j10 & 67108863) + (j14 >> 26);
            i3 += 16;
            j6 = j12 & 67108863;
            j4 = j11 & 67108863;
            i = 0;
            i2 = 3;
        }
        long j15 = j4 + (j5 >> 26);
        long j16 = j15 & 67108863;
        long j17 = j6 + (j15 >> 26);
        long j18 = j17 & 67108863;
        long j19 = j7 + (j17 >> 26);
        long j20 = j19 & 67108863;
        long j21 = j8 + ((j19 >> 26) * 5);
        long j22 = j21 & 67108863;
        long j23 = (j5 & 67108863) + (j21 >> 26);
        long j24 = j22 + 5;
        long j25 = (j24 >> 26) + j23;
        long j26 = j16 + (j25 >> 26);
        long j27 = j18 + (j26 >> 26);
        long j28 = (j20 + (j27 >> 26)) - 67108864;
        long j29 = j28 >> 63;
        long j30 = ~j29;
        long j31 = (j25 & 67108863 & j30) | (j23 & j29);
        long j32 = (j26 & 67108863 & j30) | (j16 & j29);
        long j33 = (j27 & 67108863 & j30) | (j18 & j29);
        long load32 = (((j22 & j29) | (j24 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + load32(bArr, 16);
        long load322 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + load32(bArr, 20) + (load32 >> 32);
        long load323 = (((j32 >> 12) | (j33 << 14)) & 4294967295L) + load32(bArr, 24) + (load322 >> 32);
        long load324 = load32(bArr, 28);
        byte[] bArr4 = new byte[16];
        toByteArray(bArr4, load32 & 4294967295L, 0);
        toByteArray(bArr4, load322 & 4294967295L, 4);
        toByteArray(bArr4, load323 & 4294967295L, 8);
        toByteArray(bArr4, ((((j33 >> 18) | (((j20 & j29) | (j28 & j30)) << 8)) & 4294967295L) + load324 + (load323 >> 32)) & 4294967295L, 12);
        return bArr4;
    }

    public static void verifyMac(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.subtle.Bytes.equal(computeMac(bArr, bArr2), bArr3)) {
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }
}
