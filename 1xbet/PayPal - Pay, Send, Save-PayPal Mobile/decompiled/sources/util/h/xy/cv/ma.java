package util.h.xy.cv;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26065(java.lang.String str) {
        int i = Camera2StreamConfigurationMap + 41;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0 ? str.length() == 1 : str.length() == 0) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 109) % 128;
            str = util.h.xy.al.ra.f393.concat(str);
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i2 & 75) + (i2 | 75)) % 128;
        }
        int length = str.length();
        int i3 = ((length ^ 1) + ((length & 1) << 1)) / 2;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = Camera2StreamConfigurationMap + 87;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = i4 * 4;
                bArr[i4] = (byte) java.lang.Integer.parseInt(str.substring(i6, i6 >>> 2), 71);
                i4 += 118;
            } else {
                int i7 = i4 * 2;
                bArr[i4] = (byte) java.lang.Integer.parseInt(str.substring(i7, ((i7 | 2) << 1) - (i7 ^ 2)), 16);
                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 111) % 128;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 11) % 128;
        return bArr;
    }

    private static char getHighResolutionOutputSizeshNQ4ISI(int i) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (((i2 | 43) << 1) - (i2 ^ 43)) % 128;
        getHighSpeedVideoSizes = i3;
        int i4 = i & 15;
        if (i4 < 10) {
            int i5 = (i4 * (-448)) + 21600;
            int i6 = ~((i4 ^ (-49)) | i4);
            int i7 = ~i4;
            int i8 = (i7 & 48) | (i7 ^ 48);
            int i9 = ~((i8 ^ i) | (i8 & i));
            int i10 = ((i9 ^ i6) | (i6 & i9)) * 449;
            int i11 = (((i5 | i10) << 1) - (i5 ^ i10)) + (i6 * (-1347));
            int i12 = ~i;
            int i13 = (i12 ^ i7) | (i12 & i7);
            int i14 = ~((i13 ^ 48) | (i13 & 48));
            int i15 = ((i14 ^ i6) | (i14 & i6)) * 449;
            char c = (char) ((i11 & i15) + (i15 | i11));
            getHighSpeedVideoSizes = (i2 + 119) % 128;
            return c;
        }
        Camera2StreamConfigurationMap = (i3 + 81) % 128;
        int i16 = -(-(i4 * (-753)));
        int i17 = (i16 ^ (-7550)) + ((i16 & (-7550)) << 1);
        int i18 = i & 9;
        int i19 = (~((i4 ^ 9) | i18)) | (~(i18 | (i ^ 9)));
        int i20 = ~((i4 ^ i) | (i4 & i));
        int i21 = -(-(((i19 ^ i20) | (i19 & i20)) * (-754)));
        int i22 = i4 | 9;
        int i23 = ~((i22 ^ i) | (i22 & i));
        int i24 = ~i;
        int i25 = (i24 ^ (-10)) | (i24 & (-10));
        int i26 = ~((i4 ^ i25) | (i4 & i25));
        int i27 = (i17 & i21) + (i21 | i17) + (((i26 & i23) | (i26 ^ i23)) * (-754));
        int i28 = ((i24 & 9) | (i24 ^ 9)) * 754;
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        int i30 = -(-(i29 * 131));
        int i31 = ~i29;
        int i32 = (i31 & i24) | (i24 ^ i31);
        int i33 = (i30 & (-12513)) + (i30 | (-12513)) + ((~((i32 & 97) | (i32 ^ 97))) * 130);
        int i34 = -(-((~((i31 ^ 97) | (i31 & 97))) * (-260)));
        int i35 = ~((i29 ^ (-98)) | (i29 & (-98)));
        int i36 = ~(i | i31 | 97);
        char c2 = (char) ((((i33 ^ i34) + ((i34 & i33) << 1)) - (~(((i36 ^ i35) | (i36 & i35)) * 130))) - 1);
        Camera2StreamConfigurationMap = (i3 + 79) % 128;
        return c2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m26064(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr.length * 2);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 99) % 128;
        int i = 0;
        while (i < bArr.length) {
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i2 ^ 77) + ((i2 & 77) << 1)) % 128;
            stringBuffer.append(getHighResolutionOutputSizeshNQ4ISI(bArr[i] >> 4));
            stringBuffer.append(getHighResolutionOutputSizeshNQ4ISI(bArr[i] & com.google.common.base.Ascii.SI));
            int i3 = (i & (-48)) + (i | (-48));
            i = (i3 ^ 49) + ((i3 & 49) << 1);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 41) % 128;
        }
        java.lang.String upperCase = stringBuffer.toString().toUpperCase();
        int i4 = getHighSpeedVideoSizes;
        int i5 = (i4 & 111) + (i4 | 111);
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 == 0) {
            return upperCase;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m26063(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 3) % 128;
        if (bArr == null) {
            int i2 = (i & 43) + (i | 43);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (bArr2 == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f824);
        }
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        Camera2StreamConfigurationMap = (i + 113) % 128;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b = bArr[i3];
            byte b2 = bArr2[i4 % bArr2.length];
            bArr3[i4] = (byte) ((b & (~b2)) | ((~b) & b2));
            i4++;
            i3 = ((i3 | 1) << 1) - (i3 ^ 1);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 105) % 128;
        }
        return bArr3;
    }
}
