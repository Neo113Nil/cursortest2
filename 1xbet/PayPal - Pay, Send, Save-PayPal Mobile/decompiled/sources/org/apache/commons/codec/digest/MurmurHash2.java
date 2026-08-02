package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public final class MurmurHash2 {
    public static int hash32(byte[] bArr, int i) {
        return hash32(bArr, i, -1756908916);
    }

    public static int hash32(java.lang.String str) {
        byte[] bytesUtf8 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, bytesUtf8.length);
    }

    public static int hash32(java.lang.String str, int i, int i2) {
        return hash32(str.substring(i, i2 + i));
    }

    public static long hash64(byte[] bArr, int i) {
        return hash64(bArr, i, -512093083);
    }

    public static long hash64(java.lang.String str) {
        byte[] bytesUtf8 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str);
        return hash64(bytesUtf8, bytesUtf8.length);
    }

    public static long hash64(java.lang.String str, int i, int i2) {
        return hash64(str.substring(i, i2 + i));
    }

    private MurmurHash2() {
    }

    public static int hash32(byte[] bArr, int i, int i2) {
        int i3 = i2 ^ i;
        int i4 = i >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 << 2;
            int i7 = (((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16)) * 1540483477;
            i3 = (i3 * 1540483477) ^ ((i7 ^ (i7 >>> 24)) * 1540483477);
        }
        int i8 = i4 << 2;
        int i9 = i - i8;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 ^= (bArr[i8 + 2] & 255) << 16;
                }
                int i10 = ((i3 >>> 13) ^ i3) * 1540483477;
                return i10 ^ (i10 >>> 15);
            }
            i3 ^= (bArr[i8 + 1] & 255) << 8;
        }
        i3 = ((bArr[i8] & 255) ^ i3) * 1540483477;
        int i102 = ((i3 >>> 13) ^ i3) * 1540483477;
        return i102 ^ (i102 >>> 15);
    }

    public static long hash64(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9 = (i2 & 4294967295L) ^ (i * (-4132994306676758123L));
        int i3 = i >> 3;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 << 3;
            long j10 = bArr[i5];
            long j11 = bArr[i5 + 1];
            long j12 = bArr[i5 + 2];
            long j13 = bArr[i5 + 3];
            long j14 = bArr[i5 + 4];
            int i6 = i3;
            long j15 = (((bArr[i5 + 7] & 255) << 56) | ((bArr[i5 + 5] & 255) << 40) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((bArr[i5 + 6] & 255) << 48)) * (-4132994306676758123L);
            i4++;
            j9 = (j9 ^ ((j15 ^ (j15 >>> 47)) * (-4132994306676758123L))) * (-4132994306676758123L);
            i3 = i6;
        }
        long j16 = j9;
        switch (i - (i3 << 3)) {
            case 1:
                j = 255;
                j2 = j16;
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            case 2:
                j = 255;
                j3 = j16;
                j2 = j3 ^ ((bArr[r0 + 1] & j) << 8);
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            case 3:
                j = 255;
                j4 = j16;
                j3 = j4 ^ ((bArr[r0 + 2] & j) << 16);
                j2 = j3 ^ ((bArr[r0 + 1] & j) << 8);
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            case 4:
                j = 255;
                j5 = j16;
                j4 = j5 ^ ((bArr[r0 + 3] & j) << 24);
                j3 = j4 ^ ((bArr[r0 + 2] & j) << 16);
                j2 = j3 ^ ((bArr[r0 + 1] & j) << 8);
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            case 5:
                j = 255;
                j6 = j16;
                j5 = j6 ^ ((bArr[r0 + 4] & j) << 32);
                j4 = j5 ^ ((bArr[r0 + 3] & j) << 24);
                j3 = j4 ^ ((bArr[r0 + 2] & j) << 16);
                j2 = j3 ^ ((bArr[r0 + 1] & j) << 8);
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            case 6:
                j = 255;
                j7 = j16;
                j6 = j7 ^ ((bArr[r0 + 5] & j) << 40);
                j5 = j6 ^ ((bArr[r0 + 4] & j) << 32);
                j4 = j5 ^ ((bArr[r0 + 3] & j) << 24);
                j3 = j4 ^ ((bArr[r0 + 2] & j) << 16);
                j2 = j3 ^ ((bArr[r0 + 1] & j) << 8);
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            case 7:
                j = 255;
                j7 = j16 ^ ((bArr[r0 + 6] & 255) << 48);
                j6 = j7 ^ ((bArr[r0 + 5] & j) << 40);
                j5 = j6 ^ ((bArr[r0 + 4] & j) << 32);
                j4 = j5 ^ ((bArr[r0 + 3] & j) << 24);
                j3 = j4 ^ ((bArr[r0 + 2] & j) << 16);
                j2 = j3 ^ ((bArr[r0 + 1] & j) << 8);
                j8 = -4132994306676758123L;
                j16 = ((j & bArr[r0]) ^ j2) * (-4132994306676758123L);
                break;
            default:
                j8 = -4132994306676758123L;
                break;
        }
        long j17 = ((j16 >>> 47) ^ j16) * j8;
        return (j17 >>> 47) ^ j17;
    }
}
