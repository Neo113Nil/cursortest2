package util.h.xy.b;

/* loaded from: classes5.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25287(char[] cArr, char[] cArr2, int i) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 & 121) + (i2 | 121)) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        char c = cArr[i % 4];
        int i4 = i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
        int i5 = (i4 & (-488)) + (i4 | (-488));
        int i6 = ~i;
        int i7 = ((~(i6 & i6)) | (~((i6 ^ 2) | (i6 & 2)))) * (-245);
        int i8 = ~((i6 ^ i) | (i6 & i));
        int i9 = (((i5 & i7) + (i5 | i7)) - (~(-(-(i8 * (-245)))))) - 1;
        int i10 = -(-(((i8 ^ 2) | (i8 & 2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
        char c2 = (char) (((c * 32718) + cArr2[(((i9 | i10) << 1) - (i10 ^ i9)) % 4]) % 65535);
        int i11 = ~(i6 | (-4));
        int i12 = ~((i ^ (-4)) | (i & (-4)));
        int i13 = (i11 ^ i12) | (i11 & i12);
        int i14 = (i * (-396)) + 1194 + (((i13 ^ i8) | (i13 & i8)) * (-397));
        int i15 = -(-(i12 * (-397)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i | i12;
        int i18 = i6 | 3;
        int i19 = ~i18;
        int i20 = ((i17 ^ i19) | (i17 & i19)) * 397;
        char c3 = cArr[((i & 3) + (i | 3)) % 4];
        int i21 = c3 * 32718;
        char c4 = cArr2[(((i | 2) << 1) - (i ^ 2)) % 4];
        int i22 = c4 * 755;
        int i23 = -(-(c3 * 4882));
        int i24 = ~c4;
        int i25 = (i24 ^ i21) | (i24 & i21);
        int i26 = ~i25;
        int i27 = ~((i24 ^ i) | (i24 & i));
        int i28 = (i26 ^ i27) | (i27 & i26);
        int i29 = ~((i21 ^ i) | (i21 & i));
        int i30 = -(-(((i28 ^ i29) | (i28 & i29)) * (-754)));
        int i31 = ~((i25 & i) | (i25 ^ i));
        int i32 = (c4 ^ i6) | (c4 & i6);
        int i33 = ~((i21 ^ i32) | (i21 & i32));
        cArr2[((i16 & i20) + (i20 | i16)) % 4] = (char) ((((((((i22 | i23) << 1) - (i23 ^ i22)) - (~i30)) - 1) + (((i31 & i33) | (i31 ^ i33)) * (-754))) + (((i24 ^ i6) | (i24 & i6)) * 754)) / 65535);
        int i34 = 5318 - (~(i * (-885)));
        int i35 = (~((i6 & (-4)) | (i6 ^ (-4)))) | i8;
        int i36 = ~((i ^ i18) | (i & i18));
        int i37 = ((i36 ^ i35) | (i36 & i35)) * 886;
        int i38 = (i34 & i37) + (i37 | i34);
        int i39 = ((i8 ^ 3) | (i8 & 3)) * (-1772);
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        int i41 = -(-(i19 * 886));
        cArr[((i40 ^ i41) + ((i41 & i40) << 1)) % 4] = c2;
        int i42 = i3 + 125;
        Camera2StreamConfigurationMap = i42 % 128;
        if (i42 % 2 == 0) {
            throw null;
        }
    }
}
