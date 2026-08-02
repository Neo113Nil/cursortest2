package util.h.xy.cv;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26060(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i & 53) + (i | 53)) % 128;
        boolean z = true;
        if (str != null) {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i2 = ~((currentTimeMillis ^ 644247949) | (currentTimeMillis & 644247949));
            int i3 = ((i2 ^ (-1744305598)) | (i2 & (-1744305598))) * (-814);
            int i4 = (i3 ^ 476958815) + ((i3 & 476958815) << 1);
            int i5 = ~((~currentTimeMillis) | 1104674104);
            int i6 = (i5 ^ 4616456) | (i5 & 4616456);
            int i7 = ~(644247949 | currentTimeMillis);
            int i8 = ((i7 ^ i6) | (i7 & i6)) * 407;
            int i9 = ~((-644247950) | currentTimeMillis);
            int i10 = (i9 ^ 4616456) | (i9 & 4616456);
            int i11 = ~(currentTimeMillis | (-1104674105));
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i12 = ~currentTimeMillis2;
            int i13 = ~(1042181875 | i12);
            int i14 = ~(((-939540482) ^ currentTimeMillis2) | (currentTimeMillis2 & (-939540482)));
            int i15 = (i13 ^ i14) | (i13 & i14);
            int i16 = ~((currentTimeMillis2 ^ (-264803)) | (currentTimeMillis2 & (-264803)));
            int i17 = (((i15 ^ i16) | (i15 & i16)) * 765) - 519402221;
            int i18 = ~((i12 ^ 102641394) | (i12 & 102641394));
            int i19 = ((i18 ^ (-1042181876)) | (i18 & (-1042181876))) * 1530;
            int i20 = (i17 ^ i19) + ((i17 & i19) << 1);
            int i21 = ~((currentTimeMillis2 ^ 102641394) | (currentTimeMillis2 & 102641394));
            int i22 = ~(i12 | (-264803));
            int i23 = -(-(((i21 ^ i22) | (i21 & i22)) * 765));
            boolean m26062 = m26062(str);
            if ((i4 & i8) + (i8 | i4) + (((i11 ^ i10) | (i11 & i10)) * 407) <= (i20 ^ i23) + ((i23 & i20) << 1)) {
                throw new java.lang.ArithmeticException();
            }
            if (!m26062) {
                z = false;
            }
        }
        int i24 = Camera2StreamConfigurationMap + 117;
        getHighSpeedVideoFpsRanges = i24 % 128;
        if (i24 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26062(java.lang.String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 101) % 128;
            if (!java.lang.Character.isWhitespace(charArray[i])) {
                int i2 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i2 ^ 29) + ((i2 & 29) << 1)) % 128;
                getHighSpeedVideoFpsRanges = ((i2 ^ 113) + ((i2 & 113) << 1)) % 128;
                break;
            }
            i++;
        }
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i3 | 105) << 1) - (i3 ^ 105)) % 128;
        return z;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26061(java.lang.String... strArr) {
        int length;
        int i;
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            length = strArr.length;
            i = 1;
        } else {
            length = strArr.length;
            i = 0;
        }
        while (i < length) {
            int i4 = getHighSpeedVideoFpsRanges + 103;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                if (m26060(strArr[i])) {
                    int i5 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i5 ^ 7) + ((i5 & 7) << 1)) % 128;
                    return true;
                }
                i++;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 11) % 128;
            } else {
                m26060(strArr[i]);
                throw new java.lang.ArithmeticException();
            }
        }
        return false;
    }
}
