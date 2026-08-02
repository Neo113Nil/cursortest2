package util.h.xy.fb;

/* loaded from: classes5.dex */
public abstract class rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26845(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        int i4 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i4 + 5) % 128;
        int i5 = i4 + 53;
        Camera2StreamConfigurationMap = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i8 ^ 19) + ((i8 & 19) << 1)) % 128;
            int i9 = i7 * 784;
            int i10 = -(-(i * (-782)));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            int i12 = ~i;
            int i13 = -(-(i12 * (-783)));
            int i14 = (i11 ^ i13) + ((i13 & i11) << 1);
            int i15 = ~i7;
            int i16 = -(-((~((i12 & i15) | (i15 ^ i12) | i)) * (-783)));
            int i17 = (i14 ^ i16) + ((i16 & i14) << 1);
            int i18 = ~((i12 ^ i) | (i12 & i));
            int i19 = -(-(((i18 ^ i15) | (i18 & i15)) * 783));
            m26841(jArr[(i17 & i19) + (i19 | i17)], bArr, i3);
            i3 = (i3 & 8) + (i3 | 8);
        }
        int i20 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i20 | 29) << 1) - (i20 ^ 29)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26841(long j, byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i2 & 31) + (i2 | 31)) % 128;
        m26840((int) (4294967295L & j), bArr, i);
        int i3 = (i * (-396)) + 1592;
        int i4 = ~i;
        int i5 = ~((i4 ^ (-5)) | (i4 & (-5)));
        int i6 = ~(i | (-5));
        int i7 = (i5 ^ i6) | (i5 & i6);
        int i8 = ~((i4 & i) | (i4 ^ i));
        int i9 = ((i7 ^ i8) | (i8 & i7)) * (-397);
        int i10 = (i3 ^ i9) + ((i3 & i9) << 1);
        int i11 = -(-((~((i ^ (-5)) | (i & (-5)))) * (-397)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        int i13 = -(-(((i6 & i) | (i ^ i6) | (~((i4 & 4) | (i4 ^ 4)))) * 397));
        m26840((int) (j >>> 32), bArr, (i12 ^ i13) + ((i13 & i12) << 1));
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 65) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static long m26846(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 1) + (i2 | 1);
        Camera2StreamConfigurationMap = i3 % 128;
        int m26842 = m26842(bArr, i);
        long m268422 = i3 % 2 == 0 ? ((m26842(bArr, i / 2) - 4294967295L) << 72) / (m26842 | 4294967295L) : ((m26842(bArr, i + 4) & 4294967295L) << 32) | (m26842 & 4294967295L);
        int i4 = Camera2StreamConfigurationMap;
        int i5 = (i4 ^ 21) + ((i4 & 21) << 1);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            return m268422;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26840(int i, byte[] bArr, int i2) {
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i3 + 19) % 128;
        bArr[i2] = (byte) i;
        int i4 = (i2 ^ 87) + ((i2 & 87) << 1);
        int i5 = ((i4 | (-86)) << 1) - (i4 ^ (-86));
        bArr[i5] = (byte) (i >>> 8);
        int i6 = (i5 ^ 1) + ((i5 & 1) << 1);
        bArr[i6] = (byte) (i >>> 16);
        bArr[i6 + 1] = (byte) (i >>> 24);
        int i7 = (i3 ^ 91) + ((i3 & 91) << 1);
        getHighSpeedVideoFpsRanges = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m26842(byte[] bArr, int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i2 + 79) % 128;
        byte b = bArr[i];
        int i3 = (i & 1) + (i | 1);
        byte b2 = bArr[i3];
        int i4 = i3 - 103;
        int i5 = (i4 ^ 104) + ((i4 & 104) << 1);
        int i6 = (((b2 & 255) << 8) ^ (b & 255)) ^ ((bArr[i5] & 255) << 16);
        int i7 = bArr[((i5 | 1) << 1) - (i5 ^ 1)] << com.google.common.base.Ascii.CAN;
        getHighSpeedVideoFpsRanges = (i2 + 107) % 128;
        return (i7 ^ i6) | (i7 & i6);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26843(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        int i4 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i4 + 111) % 128;
        Camera2StreamConfigurationMap = (i4 + 79) % 128;
        int i5 = 0;
        while (i5 < i2) {
            int i6 = getHighSpeedVideoFpsRanges;
            int i7 = ((i6 | 81) << 1) - (i6 ^ 81);
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = -i5;
                m26848(jArr[(i ^ i8) + ((i8 & i) << 1)], bArr, i3);
                i3 = (((i3 | 21) << 1) - (i3 ^ 21)) + 21;
                i5 = (((i5 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE) << 1) - (i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE)) - 123;
            } else {
                m26848(jArr[((i | i5) << 1) - (i ^ i5)], bArr, i3);
                i3 += 8;
                i5++;
            }
            int i9 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i9 ^ 9) + ((i9 & 9) << 1)) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26848(long j, byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (((i2 | 93) << 1) - (i2 ^ 93)) % 128;
        m26847((int) (j >>> 32), bArr, i);
        int i3 = i * (-496);
        int i4 = ~i;
        int i5 = (i3 & (-1984)) + (i3 | (-1984));
        int i6 = (i4 ^ (-5)) | (i4 & (-5));
        int i7 = ~i6;
        int i8 = i5 + (i7 * 497);
        int i9 = ~((i6 ^ i) | (i6 & i));
        int i10 = ~((i4 & i4) | 4);
        int i11 = ((i9 ^ i10) | (i10 & i9)) * 497;
        int i12 = ((i8 | i11) << 1) - (i11 ^ i8);
        int i13 = (~((i & (-5)) | (i ^ (-5)))) | i7;
        int i14 = (i4 ^ 4) | (i4 & 4);
        int i15 = ~((i ^ i14) | (i14 & i));
        int i16 = -(-(((i13 ^ i15) | (i15 & i13)) * 497));
        m26847((int) (j & 4294967295L), bArr, (i12 ^ i16) + ((i16 & i12) << 1));
        int i17 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i17 & 95) + (i17 | 95)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26849(byte[] bArr, int i, long[] jArr, int i2, int i3) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
        int i4 = 0;
        int i5 = i;
        while (i4 < i3) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 39) % 128;
            int i6 = i4 * 868;
            int i7 = -(-(i2 * 868));
            int i8 = (i6 & i7) + (i6 | i7);
            int i9 = ~i4;
            int i10 = ~i;
            int i11 = ~((i9 ^ i10) | (i9 & i10));
            int i12 = ~i2;
            int i13 = ~((i10 & i12) | (i12 ^ i10));
            int i14 = -(-(((i11 ^ i13) | (i13 & i11)) * (-867)));
            int i15 = ~(i9 | i12);
            int i16 = ~((i9 ^ i) | (i9 & i));
            int i17 = (i15 ^ i16) | (i15 & i16);
            int i18 = ~((i12 ^ i) | (i12 & i));
            int i19 = ~(i10 | (i9 ^ i12) | (i9 & i12));
            int i20 = (i9 ^ i2) | (i9 & i2);
            int i21 = ~((i20 ^ i) | (i20 & i));
            int i22 = (i12 & i4) | (i12 ^ i4);
            jArr[(i8 ^ i14) + ((i8 & i14) << 1) + (((i17 & i18) | (i17 ^ i18)) * (-1734)) + (((i21 ^ i19) | (i21 & i19) | (~((i22 & i) | (i22 ^ i)))) * 867)] = m26844(bArr, i5);
            i5 += 8;
            int i23 = ((i4 | (-54)) << 1) - (i4 ^ (-54));
            i4 = (i23 & 55) + (i23 | 55);
        }
        int i24 = getHighSpeedVideoFpsRanges;
        int i25 = ((i24 | 47) << 1) - (i24 ^ 47);
        Camera2StreamConfigurationMap = i25 % 128;
        if (i25 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static long m26844(byte[] bArr, int i) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 29) % 128;
        long m26839 = m26839(bArr, i);
        long m268392 = m26839(bArr, (i & 4) + (i | 4));
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 ^ 29) + ((i2 & 29) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return (m268392 & 4294967295L) | ((m26839 & 4294967295L) << 32);
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26847(int i, byte[] bArr, int i2) {
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 & 25) + (i3 | 25);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            bArr[i2] = (byte) (i >>> 24);
            int i5 = ((i2 & 15) + (i2 | 15)) - 14;
            bArr[i5] = (byte) (i >>> 16);
            int i6 = (((i5 | 50) << 1) - (i5 ^ 50)) - 49;
            bArr[i6] = (byte) (i >>> 8);
            int i7 = (i6 ^ 111) + ((i6 & 111) << 1);
            bArr[((i7 | androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) << 1) - (i7 ^ androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING)] = (byte) i;
            return;
        }
        bArr[i2] = (byte) (i >>> 13);
        int i8 = (i2 & 171) + (i2 | 171);
        int i9 = ((i8 | (-58)) << 1) - (i8 ^ (-58));
        bArr[i9] = (byte) (i << 118);
        int i10 = i9 + 24;
        bArr[i10] = (byte) (i * 36);
        int i11 = (i10 & 114) + (i10 | 114);
        bArr[(i11 & (-7)) + (i11 | (-7))] = (byte) i;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m26839(byte[] bArr, int i) {
        int i2 = bArr[i] << com.google.common.base.Ascii.CAN;
        int i3 = (i ^ 1) + ((i & 1) << 1);
        int i4 = (bArr[i3] & 255) << 16;
        int i5 = (i4 ^ i2) | (i4 & i2);
        int i6 = i3 + 1;
        int i7 = (bArr[i6] & 255) << 8;
        int i8 = (i5 ^ i7) | (i5 & i7);
        int i9 = bArr[(i6 ^ 1) + ((i6 & 1) << 1)] & 255;
        int i10 = getHighSpeedVideoFpsRanges;
        int i11 = (i10 & 113) + (i10 | 113);
        Camera2StreamConfigurationMap = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return (i9 ^ i8) | (i9 & i8);
    }
}
