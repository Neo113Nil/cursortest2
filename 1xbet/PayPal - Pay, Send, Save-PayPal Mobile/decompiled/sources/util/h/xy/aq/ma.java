package util.h.xy.aq;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static final char[] getHighSpeedVideoSizes = util.h.xy.al.ra.f619.toCharArray();
    static final byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[128];

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i & 27) + (i | 27)) % 128;
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i3 & 57) + (i3 | 57)) % 128;
            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
            bArr[(i2 ^ 48) + ((i2 & 48) << 1)] = (byte) i2;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i4 = i2 * 567;
            int i5 = ~i2;
            int i6 = ~((i5 ^ 10) | (i5 & 10));
            int i7 = ~((i5 & currentTimeMillis) | (i5 ^ currentTimeMillis));
            int i8 = ((((i4 | (-5650)) << 1) - (i4 ^ (-5650))) - (~(-(-(((i7 & i6) | (i6 ^ i7)) * (-566)))))) - 1;
            int i9 = -(-((~(i2 | (-11))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
            int i10 = (i5 ^ (-11)) | (i5 & (-11));
            bArr[i2 + 65] = (byte) (((((i8 | i9) << 1) - (i9 ^ i8)) - (~((~((currentTimeMillis ^ i10) | (currentTimeMillis & i10))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) - 1);
            int i11 = i2 * (-1939);
            int i12 = ~((int) java.lang.System.currentTimeMillis());
            int i13 = (i11 ^ 94187) + ((i11 & 94187) << 1) + (((~((i2 ^ (-98)) | (i2 & (-98)))) | (~(i12 | 97))) * (-970)) + ((~((i5 ^ 97) | (i5 & 97))) * 1940);
            int i14 = ~((i5 & (-98)) | (i5 ^ (-98)));
            int i15 = ~((i12 ^ 97) | (i12 & 97));
            int i16 = -(-(((i15 ^ i14) | (i15 & i14)) * 970));
            bArr[(i13 ^ i16) + ((i16 & i13) << 1)] = (byte) ((i2 & 10) + (i2 | 10));
        }
        int i17 = Camera2StreamConfigurationMap + 61;
        getHighSpeedVideoFpsRangesFor = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m25045(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 29) + ((i & 29) << 1)) % 128;
        java.lang.String m25044 = m25044(bArr, 0, bArr.length);
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 89) << 1) - (i2 ^ 89);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return m25044;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected static java.lang.String m25043(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 91) + ((i & 91) << 1)) % 128;
        java.lang.String m25042 = m25042(bArr, 0, bArr.length);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
        return m25042;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected static java.lang.String m25042(byte[] bArr, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f548);
        sb.append(i2);
        sb.append(util.h.xy.al.ra.f608);
        int i3 = 0;
        int i4 = i;
        while (true) {
            int i5 = i2 * 465;
            int i6 = i * (-463);
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            int i8 = ~i;
            int i9 = ~i8;
            int i10 = ~((i8 & i2) | (i8 ^ i2));
            int i11 = (i9 | i10 | i10) * 464;
            int i12 = (i7 & i11) + (i7 | i11);
            int i13 = ~i2;
            int i14 = (i13 ^ i) | (i13 & i);
            int i15 = -(-(((i8 ^ i14) | (i14 & i8)) * (-464)));
            int i16 = ~(i2 | i);
            if (i4 < (((i12 | i15) << 1) - (i15 ^ i12)) + (((i10 & i16) | (i10 ^ i16)) * 464)) {
                int i17 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i17 & 35) + (i17 | 35)) % 128;
                byte b = bArr[i4];
                if (i3 % 4 != 0) {
                    sb.append(' ');
                } else {
                    int i18 = (i17 & 93) + (i17 | 93);
                    Camera2StreamConfigurationMap = i18 % 128;
                    if (i18 % 2 == 0) {
                        sb.append(util.h.xy.al.ra.f644);
                        throw null;
                    }
                    sb.append(util.h.xy.al.ra.f644);
                }
                char[] cArr = getHighSpeedVideoSizes;
                sb.append(cArr[(b & com.visa.cbp.getEncExpo.onUnminimized) >>> 4]);
                sb.append(cArr[b & com.google.common.base.Ascii.SI]);
                int i19 = (i4 ^ 126) + ((i4 & 126) << 1);
                i4 = ((i19 | (-125)) << 1) - (i19 ^ (-125));
                int i20 = (i3 & 20) + (i3 | 20);
                i3 = (i20 & (-19)) + (i20 | (-19));
            } else {
                java.lang.String obj = sb.toString();
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                return obj;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected static java.lang.String m25044(byte[] bArr, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i3 ^ 119) + ((i3 & 119) << 1)) % 128;
        char[] cArr = new char[i2 * 2];
        Camera2StreamConfigurationMap = ((i3 ^ 23) + ((i3 & 23) << 1)) % 128;
        int i4 = 0;
        int i5 = i;
        while (true) {
            int i6 = -(-i2);
            if (i5 >= (i & i6) + (i6 | i)) {
                return new java.lang.String(cArr);
            }
            int i7 = getHighSpeedVideoFpsRangesFor;
            int i8 = ((i7 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i7 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            Camera2StreamConfigurationMap = i8 % 128;
            if (i8 % 2 == 0) {
                byte b = bArr[i5];
                int i9 = (i4 ^ (-108)) + ((i4 & (-108)) << 1);
                int i10 = (i9 & 117) + (i9 | 117);
                char[] cArr2 = getHighSpeedVideoSizes;
                cArr[i4] = cArr2[(b & com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME) % 2];
                i4 = i10 + 46;
                cArr[i10] = cArr2[b & com.google.common.base.Ascii.VT];
                int i11 = (i5 ^ 76) + ((i5 & 76) << 1);
                i5 = (i11 & 37) + (i11 | 37);
            } else {
                byte b2 = bArr[i5];
                int i12 = (i4 ^ 1) + ((i4 & 1) << 1);
                char[] cArr3 = getHighSpeedVideoSizes;
                cArr[i4] = cArr3[(b2 & com.visa.cbp.getEncExpo.onUnminimized) >>> 4];
                int i13 = (i12 ^ 3) + ((i12 & 3) << 1);
                cArr[i12] = cArr3[b2 & com.google.common.base.Ascii.SI];
                int i14 = i5 - 31;
                i5 = ((i14 | 32) << 1) - (i14 ^ 32);
                i4 = (i13 | (-2)) + (i13 & (-2));
            }
        }
    }
}
