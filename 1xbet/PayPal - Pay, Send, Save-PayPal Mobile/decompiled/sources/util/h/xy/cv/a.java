package util.h.xy.cv;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 93;
    private static final byte[] getHighSpeedVideoFpsRanges = new byte[255];
    private static final byte[] Camera2StreamConfigurationMap = new byte[64];

    static {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (i3 < 255) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (((i4 | 49) << 1) - (i4 ^ 49)) % 128;
            getHighSpeedVideoFpsRanges[i3] = -1;
            int i5 = (i3 & 44) + (i3 | 44);
            i3 = (i5 ^ (-43)) + ((i5 & (-43)) << 1);
            int i6 = (i4 & 13) + (i4 | 13);
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
        }
        for (int i8 = 90; i8 >= 65; i8--) {
            getHighSpeedVideoFpsRanges[i8] = (byte) (((i8 | (-65)) << 1) - (i8 ^ (-65)));
        }
        int i9 = getHighSpeedVideoFpsRangesFor + 75;
        getHighSpeedVideoSizes = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 2 / 2;
        }
        int i11 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        while (true) {
            i = 26;
            if (i11 < 97) {
                break;
            }
            int i12 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i12 & 9) + (i12 | 9)) % 128;
            byte[] bArr = getHighSpeedVideoFpsRanges;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i13 = ~i11;
            int i14 = ~currentTimeMillis;
            int i15 = ~(i14 | i13);
            int i16 = ~((currentTimeMillis ^ 96) | (currentTimeMillis & 96));
            int i17 = (((-35988) - (~(-(-(i11 * 371))))) - (~(((i15 & i16) | (i15 ^ i16)) * (-370)))) - 1;
            int i18 = ~(i14 | 96);
            int i19 = ~((currentTimeMillis ^ i13) | (currentTimeMillis & i13));
            int i20 = (i19 ^ i18) | (i19 & i18);
            int i21 = ~(i11 | (-97));
            int i22 = ((i20 ^ i21) | (i20 & i21)) * (-370);
            int i23 = (i17 ^ i22) + ((i22 & i17) << 1) + ((~((i11 ^ (-97)) | (i11 & (-97)))) * com.knotapi.knot.utilities.Constants.ID_KROGER);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i24 = -(-(i23 * (-885)));
            int i25 = (i24 & 46098) + (i24 | 46098);
            int i26 = ~i23;
            int i27 = ~((i26 & (-27)) | (i26 ^ (-27)));
            int i28 = ~(i26 | currentTimeMillis2);
            int i29 = (i28 ^ i27) | (i27 & i28);
            int i30 = ~currentTimeMillis2;
            int i31 = (i30 & 26) | (i30 ^ 26);
            int i32 = ~((i31 ^ i23) | (i31 & i23));
            int i33 = ((i29 ^ i32) | (i29 & i32)) * 886;
            int i34 = (i25 & i33) + (i33 | i25) + ((26 | (~((i30 ^ i23) | (i30 & i23)))) * (-1772));
            int i35 = -(-((~i31) * 886));
            bArr[i11] = (byte) ((i34 & i35) + (i35 | i34));
            int i36 = i11 - 39;
            i11 = ((i36 | 38) << 1) - (i36 ^ 38);
        }
        int i37 = 57;
        while (i37 >= 48) {
            int i38 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i38 & 69) + (i38 | 69)) % 128;
            byte[] bArr2 = getHighSpeedVideoFpsRanges;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i39 = (-42289) - (~(-(-(i37 * 881))));
            int i40 = ~i37;
            int i41 = (~((i40 ^ 47) | (i40 & 47))) | (~((currentTimeMillis3 ^ 47) | (currentTimeMillis3 & 47)));
            int i42 = ~((i40 ^ currentTimeMillis3) | (i40 & currentTimeMillis3));
            int i43 = -(-(((i41 ^ i42) | (i41 & i42)) * (-880)));
            int i44 = (i39 & i43) + (i39 | i43);
            int i45 = ~currentTimeMillis3;
            int i46 = ~((47 ^ i45) | (i45 & 47));
            int i47 = (i46 ^ i37) | (i46 & i37);
            int i48 = ~((currentTimeMillis3 ^ (-48)) | (currentTimeMillis3 & (-48)));
            int i49 = -(-(((i47 ^ i48) | (i47 & i48)) * (-880)));
            int i50 = ((((i44 | i49) << 1) - (i49 ^ i44)) - (~(i48 * 880))) - 1;
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i51 = -(-(i50 * 965));
            int i52 = ~i50;
            int i53 = ~((i52 ^ currentTimeMillis4) | (i52 & currentTimeMillis4));
            int i54 = ((-51040) ^ i51) + ((i51 & (-51040)) << 1) + (((i53 & (-53)) | (i53 ^ (-53))) * (-964));
            int i55 = ((~((~currentTimeMillis4) | i52)) | (~(i52 | 52))) * (-964);
            bArr2[i37] = (byte) ((i54 ^ i55) + ((i55 & i54) << 1));
            i37 = (i37 << 1) + i40;
        }
        byte[] bArr3 = getHighSpeedVideoFpsRanges;
        bArr3[43] = 62;
        bArr3[47] = 63;
        int i56 = 0;
        while (i56 <= 25) {
            byte[] bArr4 = Camera2StreamConfigurationMap;
            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
            int i57 = ~currentTimeMillis5;
            int i58 = ~i56;
            int i59 = ((i56 * (-949)) - 61685) + (((~((i58 & currentTimeMillis5) | (i58 ^ currentTimeMillis5))) | (~((i57 ^ (-66)) | (i57 & (-66))))) * 1900);
            int i60 = -(-(((~(i57 | i56)) | (~(currentTimeMillis5 | 65))) * (-950)));
            int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
            int i62 = ~(i57 | 65);
            int i63 = ~((currentTimeMillis5 ^ i56) | (currentTimeMillis5 & i56));
            int i64 = -(-(((i63 ^ i62) | (i62 & i63)) * 950));
            bArr4[i56] = (byte) ((i61 & i64) + (i64 | i61));
            int i65 = ((i56 | (-31)) << 1) - (i56 ^ (-31));
            i56 = ((i65 | 32) << 1) - (i65 ^ 32);
        }
        int i66 = 0;
        while (i <= 51) {
            int i67 = getHighSpeedVideoSizes + 41;
            getHighSpeedVideoFpsRangesFor = i67 % 128;
            if (i67 % 2 != 0) {
                Camera2StreamConfigurationMap[i] = (byte) (56 - i66);
                i = ((i & 52) << 1) + (i ^ 52);
                i66 += 33;
            } else {
                int i68 = -(-i66);
                Camera2StreamConfigurationMap[i] = (byte) ((i68 ^ 97) + ((i68 & 97) << 1));
                int i69 = i - 114;
                i = ((i69 | 115) << 1) - (i69 ^ 115);
                i66 = (i66 | 1) + (i66 & 1);
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 7) % 128;
        int i70 = 52;
        while (i70 <= 61) {
            byte[] bArr5 = Camera2StreamConfigurationMap;
            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
            int i71 = (i2 * 659) - 31536;
            int i72 = ~i2;
            int i73 = ~((i72 ^ 48) | (i72 & 48));
            int i74 = ~((i2 ^ (-49)) | (i2 & (-49)));
            int i75 = (i73 ^ i74) | (i73 & i74);
            int i76 = ~((currentTimeMillis6 ^ i2) | (currentTimeMillis6 & i2));
            int i77 = ((i75 ^ i76) | (i75 & i76)) * (-658);
            bArr5[i70] = (byte) (((((i71 & i77) + (i71 | i77)) + (i74 * 658)) - (~(-(-(((i76 ^ i74) | (i76 & i74)) * 658))))) - 1);
            i70++;
            i2 = (i2 & 1) + (i2 | 1);
        }
        byte[] bArr6 = Camera2StreamConfigurationMap;
        bArr6[62] = 43;
        bArr6[63] = 47;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0222, code lost:
    
        if ((r0 & 45) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0231, code lost:
    
        r0 = (r0 >> 2) ^ 192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x022e, code lost:
    
        r0 = r0 >> 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022c, code lost:
    
        if ((r0 & Byte.MIN_VALUE) == 0) goto L37;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m26059(byte[] bArr) {
        byte[] bArr2;
        byte b;
        byte b2;
        int i;
        int i2;
        int i3;
        byte b3;
        byte[] bArr3 = bArr;
        int length = bArr3.length * 8;
        int i4 = length % 24;
        int i5 = length / 24;
        if (i4 != 0) {
            int i6 = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            bArr2 = new byte[i6 % 2 != 0 ? (i5 & (-3)) + (i5 | (-3)) : ((i5 & 1) + (i5 | 1)) * 4];
        } else {
            bArr2 = new byte[i5 * 4];
        }
        int i7 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i7 | 23) << 1) - (i7 ^ 23)) % 128;
        int i8 = 0;
        while (i8 < i5) {
            int i9 = i8 * 3;
            byte b4 = bArr3[i9];
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i10 = ~i9;
            int i11 = (i10 ^ 1) | (i10 & 1);
            int i12 = ~currentTimeMillis;
            int i13 = ~(i12 | 1);
            byte b5 = bArr3[(216 - (~(-(-(i8 * (-645)))))) + ((~((currentTimeMillis & 1) | (currentTimeMillis ^ 1))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((i11 & i12) | (i11 ^ i12)) * (-216)) + (((i13 & i9) | (i9 ^ i13)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)];
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i14 = i8 * 255;
            int i15 = ((i14 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1) - (i14 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
            int i16 = ~((i10 ^ (-3)) | (i10 & (-3)));
            int i17 = ~currentTimeMillis2;
            int i18 = ~(i17 | (-3));
            int i19 = (i16 & i18) | (i16 ^ i18);
            int i20 = ~((i10 ^ i17) | (i17 & i10));
            int i21 = (i19 & i20) | (i19 ^ i20);
            int i22 = (i9 ^ 2) | (i9 & 2);
            int i23 = ~((i22 ^ currentTimeMillis2) | (i22 & currentTimeMillis2));
            int i24 = ((i21 ^ i23) | (i21 & i23)) * (-84);
            int i25 = (i15 & i24) + (i24 | i15);
            int i26 = ~((currentTimeMillis2 & i10) | (i10 ^ currentTimeMillis2));
            int i27 = (i26 ^ 2) | (i26 & 2);
            int i28 = ~(i17 | i9);
            int i29 = -(-(((i27 ^ i28) | (i27 & i28)) * (-84)));
            int i30 = ~((i9 & i17) | (i17 ^ i9));
            int i31 = ~i22;
            byte b6 = bArr3[(i25 & i29) + (i29 | i25) + (((i30 ^ i31) | (i30 & i31)) * 84)];
            byte b7 = (byte) (b5 & com.google.common.base.Ascii.SI);
            byte b8 = (byte) (b4 & 3);
            int i32 = i8 * 4;
            if ((b4 & Byte.MIN_VALUE) == 0) {
                int i33 = getHighSpeedVideoFpsRangesFor + 5;
                getHighSpeedVideoSizes = i33 % 128;
                i2 = i33 % 2 == 0 ? b4 / 4 : b4 >> 2;
            } else {
                int i34 = b4 >> 2;
                i2 = (~(i34 & 192)) & (i34 | 192);
            }
            byte b9 = (byte) i2;
            if ((b5 & Byte.MIN_VALUE) == 0) {
                int i35 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i35 | 73) << 1) - (i35 ^ 73)) % 128;
                i3 = b5 >> 4;
            } else {
                i3 = (b5 >> 4) ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
            }
            byte b10 = (byte) i3;
            if ((b6 & Byte.MIN_VALUE) == 0) {
                int i36 = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                getHighSpeedVideoSizes = i36;
                b3 = (byte) (b6 >> 6);
                getHighSpeedVideoFpsRangesFor = (i36 + 87) % 128;
            } else {
                b3 = (byte) ((b6 >> 6) ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            }
            byte[] bArr4 = Camera2StreamConfigurationMap;
            bArr2[i32] = bArr4[b9];
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i37 = i8 * 3524;
            int i38 = ~i32;
            int i39 = i5;
            int i40 = (((i37 ^ 881) + ((i37 & 881) << 1)) - (~(-(-((((~(i38 | (-2))) | (~((currentTimeMillis3 ^ (-2)) | (currentTimeMillis3 & (-2))))) | (~((i38 ^ currentTimeMillis3) | (i38 & currentTimeMillis3)))) * (-880)))))) - 1;
            int i41 = ~currentTimeMillis3;
            int i42 = ~((i41 ^ (-2)) | (i41 & (-2)));
            int i43 = ((i42 ^ i32) | (i42 & i32) | (~(currentTimeMillis3 | 1))) * (-880);
            bArr2[((((i40 | i43) << 1) - (i43 ^ i40)) - (~(-(-(r1 * 880))))) - 1] = bArr4[(b8 << 4) | b10];
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i44 = -(-(i8 * (-3832)));
            int i45 = (i44 ^ (-1916)) + ((i44 & (-1916)) << 1);
            int i46 = ~currentTimeMillis4;
            int i47 = ~((i46 & i38) | (i38 ^ i46));
            int i48 = ~(currentTimeMillis4 | (-3));
            int i49 = ((i47 ^ i48) | (i47 & i48) | (~((i46 ^ 2) | (i46 & 2)))) * 959;
            int i50 = ~((i46 & (-3)) | (i46 ^ (-3)));
            int i51 = ~((i38 ^ currentTimeMillis4) | (i38 & currentTimeMillis4));
            int i52 = (i50 ^ i51) | (i50 & i51);
            int i53 = ~(currentTimeMillis4 | 2);
            bArr2[(((((i45 | i49) << 1) - (i45 ^ i49)) + ((~(i32 | 2)) * (-959))) - (~(-(-(((i53 ^ i52) | (i53 & i52)) * 959))))) - 1] = bArr4[(b7 << 2) | b3];
            bArr2[(i32 ^ 3) + ((i32 & 3) << 1)] = bArr4[b6 & 63];
            int i54 = i8 + 55;
            i8 = ((i54 | (-54)) << 1) - (i54 ^ (-54));
            bArr3 = bArr;
            i5 = i39;
        }
        int i55 = i8 * 3;
        int i56 = i8 * 4;
        if (i4 == 8) {
            int i57 = getHighSpeedVideoFpsRangesFor;
            int i58 = ((i57 | 103) << 1) - (i57 ^ 103);
            int i59 = i58 % 128;
            getHighSpeedVideoSizes = i59;
            if (i58 % 2 == 0) {
                b = bArr[i55];
                b2 = (byte) (b & 2);
            } else {
                b = bArr[i55];
                b2 = (byte) (b & 3);
            }
            byte[] bArr5 = Camera2StreamConfigurationMap;
            bArr2[i56] = bArr5[(byte) i];
            bArr2[i56 + 1] = bArr5[b2 << 4];
            bArr2[(i56 & 2) + (i56 | 2)] = kotlin.io.encoding.Base64.padSymbol;
            bArr2[((i56 | 3) << 1) - (i56 ^ 3)] = kotlin.io.encoding.Base64.padSymbol;
            getHighSpeedVideoFpsRangesFor = (i59 + 19) % 128;
            return bArr2;
        }
        if (i4 == 16) {
            int i60 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i60 ^ 9) + ((i60 & 9) << 1)) % 128;
            byte b11 = bArr[i55];
            byte b12 = bArr[(i55 & 1) + (i55 | 1)];
            byte b13 = (byte) (b12 & com.google.common.base.Ascii.SI);
            byte b14 = (byte) (b11 & 3);
            byte b15 = (byte) ((b11 & Byte.MIN_VALUE) == 0 ? b11 >> 2 : (b11 >> 2) ^ 192);
            int i61 = b12 & Byte.MIN_VALUE;
            int i62 = b12 >> 4;
            if (i61 != 0) {
                i62 = (i62 & (-241)) | ((~i62) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            }
            byte[] bArr6 = Camera2StreamConfigurationMap;
            bArr2[i56] = bArr6[b15];
            bArr2[((i56 | 1) << 1) - (i56 ^ 1)] = bArr6[((byte) i62) | (b14 << 4)];
            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
            int i63 = (-367) - (~(-(-(i8 * (-732)))));
            int i64 = ~currentTimeMillis5;
            int i65 = (i64 ^ (-3)) | (i64 & (-3));
            int i66 = ~i56;
            int i67 = (i64 ^ i66) | (i64 & i66);
            int i68 = -(-(((~(i67 | 2)) | (~((i65 & i56) | (i65 ^ i56)))) * (-184)));
            int i69 = (i63 & i68) + (i63 | i68);
            int i70 = ~(i66 | (-3));
            int i71 = ~i65;
            int i72 = -(-(((~i67) | (i70 ^ i71) | (i70 & i71)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            int i73 = ((i69 | i72) << 1) - (i72 ^ i69);
            int i74 = -(-(((i56 ^ 2) | (i56 & 2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            bArr2[(i73 & i74) + (i74 | i73)] = bArr6[b13 << 2];
            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
            int i75 = -(-(i8 * (-2884)));
            int i76 = ((i75 | (-2163)) << 1) - (i75 ^ (-2163));
            int i77 = (~currentTimeMillis6) | (~((i66 ^ (-4)) | (i66 & (-4))));
            int i78 = ~((i56 ^ 3) | (i56 & 3));
            int i79 = -(-(((i77 ^ i78) | (i77 & i78)) * 1444));
            int i80 = ~(currentTimeMillis6 | 3);
            int i81 = (i78 ^ i80) | (i80 & i78);
            int i82 = ~((currentTimeMillis6 ^ i56) | (currentTimeMillis6 & i56));
            int i83 = ((((i76 | i79) << 1) - (i79 ^ i76)) - (~(-(-(((i82 ^ i81) | (i82 & i81)) * (-1444)))))) - 1;
            int i84 = ((~((i56 ^ (-4)) | (i56 & (-4)))) | (~((i66 ^ 3) | (i66 & 3)))) * 722;
            bArr2[((i83 | i84) << 1) - (i84 ^ i83)] = kotlin.io.encoding.Base64.padSymbol;
        }
        return bArr2;
    }
}
