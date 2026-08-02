package util.h.xy.ep;

/* loaded from: classes18.dex */
public final class a extends util.h.xy.ep.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26647(byte[] bArr, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i2 & 51) + (i2 | 51)) % 128;
        boolean z4 = false;
        int i3 = i;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i3 != i + 8) {
            int i4 = (Camera2StreamConfigurationMap + 5) % 128;
            getHighSpeedVideoFpsRanges = i4;
            byte b = bArr[i3];
            int i5 = -(-(i3 * (-496)));
            int i6 = ~i3;
            int i7 = (i5 & (-3968)) + (i5 | (-3968));
            int i8 = (i6 ^ (-9)) | (i6 & (-9));
            int i9 = i7 + ((~i8) * 497);
            int i10 = ~i;
            int i11 = (i6 ^ i10) | (i6 & i10);
            int i12 = ((~((i8 ^ i) | (i8 & i))) | (~((i11 & 8) | (i11 ^ 8)))) * 497;
            int i13 = (~((i3 & (-9)) | (i3 ^ (-9)))) | (~((i10 ^ (-9)) | (i10 & (-9))));
            int i14 = (i6 ^ 8) | (i6 & 8);
            int i15 = ~((i14 ^ i) | (i14 & i));
            if (b != bArr[(((i9 | i12) << 1) - (i12 ^ i9)) + (((i13 & i15) | (i13 ^ i15)) * 497)]) {
                Camera2StreamConfigurationMap = ((i4 & 49) + (i4 | 49)) % 128;
                z = true;
            } else {
                z = false;
            }
            z5 = (z5 ^ z) | (z5 & z);
            int i16 = (i6 & (-17)) | (i6 ^ (-17));
            int i17 = ~((i16 ^ i10) | (i16 & i10));
            int i18 = i3 & 16;
            int i19 = (i3 ^ 16) | i18;
            int i20 = ~((i19 ^ i) | (i19 & i));
            int i21 = ~(i3 | (-17));
            int i22 = ~((i & (-17)) | (i ^ (-17)));
            int i23 = (4367 - (~(i3 * (-271)))) + (((i17 ^ i20) | (i17 & i20)) * (-272)) + (((i21 & i22) | (i21 ^ i22)) * (-272));
            int i24 = -(-(((~((i ^ 16) | (i & 16))) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
            if (b != bArr[((i23 | i24) << 1) - (i24 ^ i23)]) {
                Camera2StreamConfigurationMap = ((i4 ^ 13) + ((i4 & 13) << 1)) % 128;
                z2 = true;
            } else {
                z2 = false;
            }
            z6 |= z2;
            if (bArr[i3 + 8] != bArr[i18 + (i3 | 16)]) {
                int i25 = Camera2StreamConfigurationMap;
                int i26 = (((i25 | 9) << 1) - (i25 ^ 9)) % 128;
                getHighSpeedVideoFpsRanges = i26;
                Camera2StreamConfigurationMap = (i26 + 55) % 128;
                z3 = true;
            } else {
                z3 = false;
            }
            z7 = (z7 ^ z3) | (z7 & z3);
            i3++;
            int i27 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i27 | 77) << 1) - (i27 ^ 77)) % 128;
        }
        if (z5) {
            int i28 = (getHighSpeedVideoFpsRanges + 79) % 128;
            Camera2StreamConfigurationMap = i28;
            if (z6 && z7) {
                int i29 = i28 + 59;
                getHighSpeedVideoFpsRanges = i29 % 128;
                if (i29 % 2 == 0) {
                    z4 = true;
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 55) % 128;
                return z4;
            }
        }
        int i30 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (((i30 | 9) << 1) - (i30 ^ 9)) % 128;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 55) % 128;
        return z4;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m26646(byte[] bArr, int i) {
        boolean z;
        int i2;
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 ^ 117) + ((i3 & 117) << 1);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = i;
            z = true;
        } else {
            z = false;
            i2 = i;
        }
        while (i2 != (i ^ 8) + ((i & 8) << 1)) {
            int i5 = getHighSpeedVideoFpsRanges;
            int i6 = (i5 ^ 11) + ((i5 & 11) << 1);
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                if (bArr[i2] == bArr[i2 + 110]) {
                    i2 = (i2 ^ 1) + ((i2 & 1) << 1);
                }
                int i7 = (i5 + 17) % 128;
                Camera2StreamConfigurationMap = i7;
                getHighSpeedVideoFpsRanges = (i7 + 19) % 128;
                z = true;
                i2 = (i2 ^ 1) + ((i2 & 1) << 1);
            } else {
                if (bArr[i2] == bArr[(i2 & 8) + (i2 | 8)]) {
                    i2 = (i2 ^ 1) + ((i2 & 1) << 1);
                }
                int i72 = (i5 + 17) % 128;
                Camera2StreamConfigurationMap = i72;
                getHighSpeedVideoFpsRanges = (i72 + 19) % 128;
                z = true;
                i2 = (i2 ^ 1) + ((i2 & 1) << 1);
            }
        }
        int i8 = Camera2StreamConfigurationMap + 121;
        getHighSpeedVideoFpsRanges = i8 % 128;
        if (i8 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26645(byte[] bArr, int i) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = i2 + 3;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0 ? bArr.length != 16 : bArr.length != 125) {
            boolean m26647 = m26647(bArr, i);
            int i4 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i4 ^ 75) + ((i4 & 75) << 1)) % 128;
            return m26647;
        }
        getHighSpeedVideoFpsRanges = ((i2 & 83) + (i2 | 83)) % 128;
        boolean m26646 = m26646(bArr, i);
        int i5 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i5 & 57) + (i5 | 57)) % 128;
        return m26646;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26648(byte[] bArr, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (((i3 | 9) << 1) - (i3 ^ 9)) % 128;
        Camera2StreamConfigurationMap = i4;
        int i5 = i4 + 39;
        getHighSpeedVideoFpsRanges = i5 % 128;
        int i6 = i5 % 2;
        while (i < i2) {
            int i7 = Camera2StreamConfigurationMap;
            int i8 = ((i7 | 79) << 1) - (i7 ^ 79);
            getHighSpeedVideoFpsRanges = i8 % 128;
            boolean m26660 = util.h.xy.ep.ma.m26660(bArr, i);
            if (i8 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (m26660) {
                int i9 = getHighSpeedVideoFpsRanges;
                int i10 = (i9 ^ 91) + ((i9 & 91) << 1);
                Camera2StreamConfigurationMap = i10 % 128;
                return i10 % 2 != 0;
            }
            i = (i & 8) + (i | 8);
            int i11 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i11 & 95) + (i11 | 95)) % 128;
        }
        int i12 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i12 | 93) << 1) - (i12 ^ 93)) % 128;
        return false;
    }
}
