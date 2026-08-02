package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class honorsDebugCertificates {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5 = ~i2;
        int i6 = (i * (-501)) + (i2 * 503) + (((~(i2 | i)) | (~(i5 | i3))) * (-502)) + ((~((~i3) | i5 | i)) * (-502)) + (((~((~i) | i3)) | i5) * 502);
        if (i6 == 1) {
            long longValue = ((java.lang.Number) objArr[0]).longValue();
            byte[] bArr = (byte[]) objArr[1];
            int intValue = ((java.lang.Number) objArr[2]).intValue();
            valueOf = (AlternateContactlessPaymentDataJson + 49) % 128;
            int i7 = (int) (longValue >>> 32);
            valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i7), bArr, java.lang.Integer.valueOf(intValue)}, 2084777341, -2084777337, i7);
            int i8 = (int) longValue;
            int i9 = intValue & 4;
            valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i8), bArr, java.lang.Integer.valueOf((((intValue ^ 4) | i9) << 1) - ((intValue | 4) & (~i9)))}, 2084777341, -2084777337, i8);
            int i10 = AlternateContactlessPaymentDataJson;
            valueOf = (((i10 | 29) << 1) - (i10 ^ 29)) % 128;
            return null;
        }
        if (i6 == 2) {
            byte[] bArr2 = (byte[]) objArr[0];
            int intValue2 = ((java.lang.Number) objArr[1]).intValue();
            int i11 = valueOf;
            int i12 = i11 & 83;
            AlternateContactlessPaymentDataJson = ((((i11 | 83) & (~i12)) - (~(i12 << 1))) - 1) % 128;
            int i13 = (intValue2 & 4) + (intValue2 | 4);
            long intValue3 = ((java.lang.Integer) valueOf(new java.lang.Object[]{bArr2, java.lang.Integer.valueOf(intValue2)}, -1462830568, 1462830571, intValue2)).intValue();
            long intValue4 = ((java.lang.Integer) valueOf(new java.lang.Object[]{bArr2, java.lang.Integer.valueOf(i13)}, -1462830568, 1462830571, i13)).intValue();
            int i14 = AlternateContactlessPaymentDataJson;
            int i15 = i14 & 35;
            int i16 = (i14 | 35) & (~i15);
            int i17 = i15 << 1;
            valueOf = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
            return java.lang.Long.valueOf((intValue4 & 4294967295L) | ((intValue3 & 4294967295L) << 32));
        }
        if (i6 == 3) {
            return valueOf(objArr);
        }
        if (i6 == 4) {
            int intValue5 = ((java.lang.Number) objArr[0]).intValue();
            byte[] bArr3 = (byte[]) objArr[1];
            int intValue6 = ((java.lang.Number) objArr[2]).intValue();
            int i18 = AlternateContactlessPaymentDataJson + 65;
            valueOf = i18 % 128;
            if (i18 % 2 != 0) {
                bArr3[intValue6] = (byte) (intValue5 << 32);
                int i19 = (intValue6 & (-76)) | ((~intValue6) & 75);
                int i20 = (intValue6 & 75) << 1;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                bArr3[i21] = (byte) (intValue5 % 49);
                int i22 = (i21 & 53) + (i21 | 53);
                bArr3[i22] = (byte) (intValue5 % 107);
                int i23 = i22 & 64;
                int i24 = -(-((i22 ^ 64) | i23));
                bArr3[(i23 & i24) + (i24 | i23)] = (byte) intValue5;
            } else {
                bArr3[intValue6] = (byte) (intValue5 >>> 24);
                int i25 = ((intValue6 & (-129)) | ((~intValue6) & 128)) + ((intValue6 & 128) << 1);
                int i26 = ((i25 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i25 & androidx.compose.runtime.ComposerKt.defaultsKey)) << 1;
                int i27 = -((i25 & 126) | ((~i25) & androidx.compose.runtime.ComposerKt.defaultsKey));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                bArr3[i28] = (byte) (intValue5 >>> 16);
                bArr3[i28 + 1] = (byte) (intValue5 >>> 8);
                bArr3[i28 + 2] = (byte) intValue5;
            }
            return null;
        }
        byte[] bArr4 = (byte[]) objArr[0];
        int intValue7 = ((java.lang.Number) objArr[1]).intValue();
        int i29 = AlternateContactlessPaymentDataJson;
        int i30 = i29 & 103;
        int i31 = (i29 ^ 103) | i30;
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        int i33 = i32 % 128;
        valueOf = i33;
        if (i32 % 2 != 0) {
            int i34 = bArr4[intValue7] & 11874;
            int i35 = intValue7 + 30;
            int i36 = (bArr4[i35] & com.visa.cbp.getEncExpo.registerForActivityResult) % 115;
            int i37 = ((~i36) & i34) | ((~i34) & i36);
            int i38 = i34 & i36;
            int i39 = (i38 ^ i37) | (i38 & i37);
            int i40 = i35 & 101;
            int i41 = (i35 | 101) & (~i40);
            int i42 = i40 << 1;
            int i43 = (i41 & i42) + (i41 | i42);
            int i44 = (bArr4[i43] & 15369) >> 108;
            int i45 = i39 ^ i44;
            int i46 = i44 & i39;
            int i47 = i43 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
            int i48 = -(-(i43 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE));
            int i49 = (i47 & i48) + (i47 | i48);
            int i50 = i49 & (-15);
            int i51 = -(-((i49 ^ (-15)) | i50));
            i4 = (i46 ^ i45) | (i46 & i45) | (bArr4[(i50 ^ i51) + ((i50 & i51) << 1)] * 106);
        } else {
            int i52 = bArr4[intValue7] & 255;
            int i53 = intValue7 + 43;
            int i54 = (i53 & (-41)) + (i53 | (-41));
            int i55 = (bArr4[i54 - 1] & 255) << 8;
            int i56 = ((~i55) & i52) | ((~i52) & i55) | ((bArr4[i54] & 255) << 16);
            int i57 = i54 ^ 1;
            int i58 = ((i54 & 1) | i57) << 1;
            int i59 = -i57;
            int i60 = bArr4[(i58 ^ i59) + ((i59 & i58) << 1)] << com.google.common.base.Ascii.CAN;
            int i61 = i56 & i60;
            i4 = ((i56 | i60) & (~i61)) | i61;
        }
        AlternateContactlessPaymentDataJson = ((i33 & 41) + (i33 | 41)) % 128;
        return java.lang.Integer.valueOf(i4);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i;
        byte[] bArr = (byte[]) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = i2 + 96;
        int i4 = (~i3) + (i3 << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = bArr[intValue] << 64;
            int i6 = (bArr[intValue + 11] & 25983) >>> 12;
            int i7 = i5 & i6;
            int i8 = (i5 | i6) & (~i7);
            int i9 = (i8 ^ i7) | (i8 & i7);
            int i10 = intValue + 23;
            byte b = bArr[i10];
            int i11 = i10 & 144;
            int i12 = (i10 ^ 144) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            int i14 = i13 & (-85);
            int i15 = -(-((i13 ^ (-85)) | i14));
            int i16 = bArr[(i14 & i15) + (i14 | i15)] & 4731;
            int i17 = i9 & i16;
            int i18 = (i16 | i9) & (~i17);
            i = (i18 ^ i17) | (i18 & i17);
        } else {
            int i19 = bArr[intValue] << com.google.common.base.Ascii.CAN;
            int i20 = (intValue & 1) + (intValue | 1);
            int i21 = (bArr[i20] & 255) << 16;
            int i22 = i19 & i21;
            int i23 = (i21 | i19) & (~i22);
            int i24 = (i23 ^ i22) | (i23 & i22);
            int i25 = i20 ^ 1;
            int i26 = -(-((i20 & 1) << 1));
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            int i28 = (bArr[i27] & 255) << 8;
            int i29 = i24 & i28;
            int i30 = (i24 | i28) & (~i29);
            int i31 = (i30 ^ i29) | (i30 & i29);
            int i32 = i27 & 1;
            int i33 = (i27 ^ 1) | i32;
            int i34 = bArr[(i32 & i33) + (i32 | i33)] & 255;
            int i35 = i31 & i34;
            i = ((i31 | i34) & (~i35)) | i35;
        }
        int i36 = (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1);
        int i37 = (~i36) + (i36 << 1);
        valueOf = i37 % 128;
        if (i37 % 2 == 0) {
            return java.lang.Integer.valueOf(i);
        }
        throw new java.lang.ArithmeticException();
    }

    public static int writeReplace(byte[] bArr, int i) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i)}, -332346579, 332346579, i)).intValue();
    }

    public static void AlternateContactlessPaymentDataJson(long j, byte[] bArr, int i) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j), bArr, java.lang.Integer.valueOf(i)}, -2099933895, 2099933896, i);
    }

    public static long AlternateContactlessPaymentDataJson(byte[] bArr, int i) {
        return ((java.lang.Long) valueOf(new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i)}, -2006018601, 2006018603, i)).longValue();
    }

    public static void DigitizedCardProfile(int i, byte[] bArr, int i2) {
        valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i), bArr, java.lang.Integer.valueOf(i2)}, 2084777341, -2084777337, i);
    }

    private static int values(byte[] bArr, int i) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i)}, -1462830568, 1462830571, i)).intValue();
    }
}
