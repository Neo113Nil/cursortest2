package util.h.xy.b;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25288(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        int i4;
        int Camera2StreamConfigurationMap2;
        int i5 = ~i;
        if (!z) {
            int i6 = Camera2StreamConfigurationMap + 119;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                getHighSpeedVideoFpsRangesFor(iArr);
            } else {
                getHighSpeedVideoFpsRangesFor(iArr);
                throw null;
            }
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
        int i7 = i;
        int i8 = 0;
        while (i8 < i3) {
            int i9 = Camera2StreamConfigurationMap;
            int i10 = (i9 & 121) + (i9 | 121);
            getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = iArr[i8];
                i4 = (i7 & (~i11)) | ((~i7) & i11);
                int i12 = (i8 & 44) + (i8 | 44);
                i8 = (i12 ^ 16) + ((i12 & 16) << 1);
                Camera2StreamConfigurationMap2 = i2 ^ Camera2StreamConfigurationMap(i4, iArr2);
            } else {
                i4 = i7 ^ iArr[i8];
                Camera2StreamConfigurationMap2 = i2 ^ Camera2StreamConfigurationMap(i4, iArr2);
                i8 = ((i8 | 1) << 1) - (i8 ^ 1);
            }
            int i13 = i4;
            i7 = Camera2StreamConfigurationMap2;
            i2 = i13;
        }
        int length = iArr.length;
        int i14 = (-283) - (~(-(-(length * (-139)))));
        int i15 = ((~((length ^ 1) | (length & 1))) | (~((i ^ 1) | (i & 1)))) * (-280);
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        int i17 = ~(i | 1);
        int i18 = ~length;
        int i19 = ~((i18 ^ i) | (i18 & i));
        int i20 = ((i17 ^ i19) | (i17 & i19)) * 140;
        int i21 = ((i16 | i20) << 1) - (i20 ^ i16);
        int i22 = ~(i | (i18 ^ 1) | (i18 & 1));
        int i23 = (i5 & 1) | (i5 ^ 1);
        int i24 = ~((length ^ i23) | (length & i23));
        int i25 = (i22 ^ i24) | (i22 & i24);
        int i26 = (i18 ^ i5) | (i5 & i18);
        int i27 = ~((i26 ^ (-2)) | (i26 & (-2)));
        int i28 = -(-(((i25 ^ i27) | (i25 & i27)) * 140));
        int i29 = iArr[((i21 | i28) << 1) - (i28 ^ i21)];
        int length2 = iArr.length;
        int i30 = iArr[(~length2) + (length2 << 1)];
        if (!z) {
            int i31 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (((i31 | 71) << 1) - (i31 ^ 71)) % 128;
            getHighSpeedVideoFpsRangesFor(iArr);
        }
        iArr3[0] = (~(i2 & i30)) & (i30 | i2);
        iArr3[1] = (~(i29 & i7)) & (i29 | i7);
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i + 73) % 128;
        for (int i3 = i2 % 2 != 0 ? 1 : 0; i3 < iArr.length / 2; i3++) {
            int i4 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = (((i4 | 115) << 1) - (i4 ^ 115)) % 128;
            int i5 = iArr[i3];
            int length = iArr.length;
            int i6 = -i3;
            int i7 = ~i6;
            int i8 = (length - i7) - 1;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i9 = (-496) - (~(i8 * (-493)));
            int i10 = ~i8;
            int i11 = ((i10 ^ (-1)) | i10) * (-988);
            int i12 = (i9 & i11) + (i9 | i11);
            int i13 = ~currentTimeMillis;
            int i14 = (i13 ^ i8) | (i13 & i8);
            int i15 = -(-(i14 * 494));
            int i16 = ~i10;
            int i17 = ~i14;
            iArr[i3] = iArr[(((i12 | i15) << 1) - (i15 ^ i12)) + (((~(i8 | (i8 ^ (-1)))) | (i17 ^ i16) | (i17 & i16)) * 494)];
            int length2 = iArr.length;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i18 = ((((i6 * (-665)) - (~(length2 * com.visa.cbp.getCertUsage.setODAData))) - 1) - (~(-(-(i7 * (-333)))))) - 1;
            int i19 = ~currentTimeMillis2;
            int i20 = ~((i19 & i7) | (i7 ^ i19));
            int i21 = ~((length2 ^ currentTimeMillis2) | (length2 & currentTimeMillis2));
            int i22 = -(-(((i20 ^ i21) | (i20 & i21)) * com.visa.cbp.getCertUsage.getODAData));
            int i23 = (i18 & i22) + (i18 | i22);
            int i24 = ~(i7 | currentTimeMillis2);
            int i25 = ~((length2 ^ i19) | (length2 & i19));
            int i26 = ((i25 ^ i24) | (i25 & i24)) * com.visa.cbp.getCertUsage.getODAData;
            iArr[(-2) - (~((i23 & i26) + (i26 | i23)))] = i5;
        }
        int i27 = getHighResolutionOutputSizeshNQ4ISI;
        int i28 = ((i27 | 83) << 1) - (i27 ^ 83);
        Camera2StreamConfigurationMap = i28 % 128;
        if (i28 % 2 == 0) {
            throw null;
        }
    }

    private static int Camera2StreamConfigurationMap(int i, int[][] iArr) {
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
        int i3 = iArr[0][i >>> 24];
        int i4 = iArr[1][(i >>> 16) & 255];
        int i5 = i4 * (-559);
        int i6 = i3 * 561;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = ~i;
        int i9 = -(-((~(i8 | i4)) * (-560)));
        int i10 = (i7 ^ i9) + ((i9 & i7) << 1);
        int i11 = (~i3) | i4;
        int i12 = (~((i11 ^ i) | (i & i11))) * (-560);
        int i13 = ~i4;
        int i14 = ~((i13 ^ i3) | (i13 & i3));
        int i15 = ~((i3 ^ i8) | (i3 & i8));
        int i16 = (i10 & i12) + (i12 | i10) + (((i15 ^ i14) | (i14 & i15)) * 560);
        int i17 = iArr[2][(i >>> 8) & 255];
        int i18 = ((~i17) & i16) | ((~i16) & i17);
        int i19 = iArr[3][i & 255];
        int i20 = (i2 & 9) + (i2 | 9);
        getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
        if (i20 % 2 == 0) {
            return (i18 ^ i19) + ((i19 & i18) << 1);
        }
        throw new java.lang.ArithmeticException();
    }
}
