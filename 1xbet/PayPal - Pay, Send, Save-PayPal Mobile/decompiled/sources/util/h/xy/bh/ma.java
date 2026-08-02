package util.h.xy.bh;

/* loaded from: classes18.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final char[] getHighSpeedVideoFpsRanges = util.h.xy.al.ra.f619.toCharArray();
    static final byte[] getHighSpeedVideoSizes = new byte[128];

    static {
        int i = 128;
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < 10) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 89) % i;
            byte[] bArr = getHighSpeedVideoSizes;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i6 = ~i5;
            int i7 = (~(i6 | (-49))) | (~((i6 ^ currentTimeMillis) | (i6 & currentTimeMillis)));
            int i8 = ~(currentTimeMillis | (-49));
            int i9 = ~currentTimeMillis;
            int i10 = ~((i9 ^ i6) | (i9 & i6));
            int i11 = (i10 ^ 48) | (i10 & 48);
            int i12 = ~((currentTimeMillis ^ i5) | (currentTimeMillis & i5));
            int i13 = (i5 * 881) + 42288 + (((i7 ^ i8) | (i7 & i8)) * (-880)) + (((i11 & i12) | (i11 ^ i12)) * (-880));
            int i14 = -(-(i12 * 880));
            bArr[(i13 & i14) + (i14 | i13)] = (byte) i5;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i15 = i5 * com.knotapi.knot.utilities.Constants.ID_KROGER;
            int i16 = (i5 ^ 65) | (i5 & 65);
            int i17 = ~currentTimeMillis2;
            int i18 = ~(i17 | i6);
            int i19 = ~(i5 | (-66));
            int i20 = ~((currentTimeMillis2 ^ i5) | (currentTimeMillis2 & i5));
            int i21 = (i20 ^ i19) | (i20 & i19);
            int i22 = (i6 ^ i17) | (i17 & i6);
            int i23 = ~((i22 ^ 65) | (i22 & 65));
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i24 = i5 * (-515);
            int i25 = (i24 ^ 5170) + ((i24 & 5170) << 1);
            int i26 = ~currentTimeMillis3;
            int i27 = ~((i26 ^ 10) | (i26 & 10));
            int i28 = ((~(i26 | i5)) | (~((currentTimeMillis3 ^ (-11)) | (currentTimeMillis3 & (-11)))) | i27) * (-516);
            int i29 = ((i25 | i28) << 1) - (i28 ^ i25);
            int i30 = (i6 ^ (-11)) | (i6 & (-11));
            int i31 = ((~((i30 ^ currentTimeMillis3) | (currentTimeMillis3 & i30))) | (~((i6 ^ i26) | (i26 & i6) | 10))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR;
            int i32 = (i29 ^ i31) + ((i31 & i29) << 1);
            int i33 = ~(i6 | 10);
            int i34 = -(-(((i33 ^ i27) | (i33 & i27)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
            bArr[i15 + 24050 + (((i16 ^ i17) | (i16 & i17)) * (-369)) + (((i18 & 65) | (i18 ^ 65)) * (-369)) + (((i21 ^ i23) | (i21 & i23)) * 369)] = (byte) (((i32 | i34) << 1) - (i34 ^ i32));
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i35 = i5 * 980;
            int i36 = ((i35 | (-94866)) << 1) - (i35 ^ (-94866));
            int i37 = ~currentTimeMillis4;
            int i38 = (~((i37 ^ (-98)) | (i37 & (-98)))) * 979;
            int i39 = ~((currentTimeMillis4 & (-98)) | (currentTimeMillis4 ^ (-98)));
            int i40 = ~((i37 ^ i5) | (i37 & i5));
            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
            int i41 = i15 + 3700;
            int i42 = ~currentTimeMillis5;
            int i43 = ((i5 ^ 10) | (i5 & 10) | i42) * (-369);
            int i44 = i6 | i42;
            int i45 = ~i44;
            int i46 = (((i41 ^ i43) + ((i41 & i43) << 1)) - (~(-(-(((i45 & 10) | (i45 ^ 10)) * (-369)))))) - 1;
            int i47 = ~(i5 | (-11));
            int i48 = ~((currentTimeMillis5 ^ i5) | (currentTimeMillis5 & i5));
            int i49 = (i47 ^ i48) | (i48 & i47);
            int i50 = ~((10 ^ i44) | (i44 & 10));
            int i51 = -(-(((i50 ^ i49) | (i50 & i49)) * 369));
            bArr[(((((i36 & i38) + (i36 | i38)) - (~(((currentTimeMillis4 & i5) | (i5 ^ currentTimeMillis4)) * (-979)))) - 1) - (~(((i39 & i40) | (i40 ^ i39)) * 979))) - 1] = (byte) ((i46 & i51) + (i51 | i46));
            i5++;
            i = 128;
        }
        int i52 = getHighResolutionOutputSizeshNQ4ISI + 41;
        Camera2StreamConfigurationMap = i52 % 128;
        if (i52 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25468(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 89) + (i | 89)) % 128;
        char[] charArray = str.replace(util.h.xy.al.ra.f692, util.h.xy.al.ra.f733).replace(util.h.xy.al.ra.f644, util.h.xy.al.ra.f733).toUpperCase().toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i4 ^ 113) + ((i4 & 113) << 1)) % 128;
            byte[] bArr2 = getHighSpeedVideoSizes;
            int i5 = i3 - 48;
            int i6 = (i5 & 49) + (i5 | 49);
            bArr[i2] = (byte) ((bArr2[charArray[i3] & com.google.common.base.Ascii.MAX] << 4) + bArr2[charArray[i6] & com.google.common.base.Ascii.MAX]);
            int i7 = (i2 & (-123)) + (i2 | (-123));
            i2 = ((i7 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1) - (i7 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            getHighResolutionOutputSizeshNQ4ISI = ((i4 & 97) + (i4 | 97)) % 128;
            i3 = i6 + 1;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
        return bArr;
    }
}
