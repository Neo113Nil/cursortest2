package util.h.xy.b;

/* loaded from: classes5.dex */
public final class ra {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int[] m25289(char[] cArr, int[] iArr, boolean z) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 117) << 1) - (i ^ 117)) % 128;
        int i2 = cArr[0] << 16;
        char c = cArr[1];
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i3 = c * 829;
        int i4 = -(-(i2 * 829));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = ~c;
        int i7 = ~i2;
        int i8 = ~((i6 ^ i7) | (i6 & i7));
        int i9 = ~currentTimeMillis;
        int i10 = ~((i9 ^ c) | (i9 & c) | i2);
        int i11 = -(-(((i8 ^ i10) | (i8 & i10)) * (-828)));
        int i12 = ((((i5 ^ i11) + ((i11 & i5) << 1)) - (~((i9 | (c | i2)) * (-828)))) - 1) + ((~((i2 ^ c) | (i2 & c))) * 828);
        int i13 = cArr[2] << 16;
        int i14 = -(-cArr[3]);
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        if (!z) {
            m25291(iArr);
        }
        int i16 = 0;
        while (i16 < 16) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 17) % 128;
            int i17 = iArr[i16];
            int i18 = (~(i17 & i12)) & (i17 | i12);
            int m25290 = m25290(i18);
            i12 = (m25290 | i15) & (~(m25290 & i15));
            i16 = (i16 ^ 1) + ((i16 & 1) << 1);
            i15 = i18;
        }
        int i19 = iArr[16] ^ i12;
        int i20 = iArr[17];
        int i21 = (~(i20 & i15)) & (i20 | i15);
        int[] iArr2 = {i21, i19};
        cArr[0] = (char) (i21 >>> 16);
        cArr[1] = (char) i21;
        cArr[2] = (char) (i19 >>> 16);
        cArr[3] = (char) i19;
        if (!z) {
            int i22 = getHighSpeedVideoFpsRangesFor;
            int i23 = ((i22 | 11) << 1) - (i22 ^ 11);
            getHighSpeedVideoFpsRanges = i23 % 128;
            if (i23 % 2 != 0) {
                m25291(iArr);
                throw new java.lang.ArithmeticException();
            }
            m25291(iArr);
            int i24 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i24 & 79) + (i24 | 79)) % 128;
        }
        int i25 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i25 | 101) << 1) - (i25 ^ 101)) % 128;
        return iArr2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25291(int[] iArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 95) << 1) - (i ^ 95)) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 29) % 128;
        int i2 = 0;
        while (i2 < iArr.length / 2) {
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i3 | 41) << 1) - (i3 ^ 41)) % 128;
            int i4 = iArr[i2];
            int length = iArr.length;
            int i5 = -i2;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i6 = (i5 * 69) + (length * (-67));
            int i7 = ~i5;
            int i8 = ~length;
            int i9 = (i8 & i7) | (i7 ^ i8);
            int i10 = ~currentTimeMillis;
            int i11 = ~((i9 ^ i10) | (i9 & i10));
            int i12 = ~((i5 ^ length) | (i5 & length));
            int i13 = (i11 ^ i12) | (i11 & i12);
            int i14 = ~((currentTimeMillis & length) | (length ^ currentTimeMillis));
            int i15 = -(-(((i14 ^ i13) | (i13 & i14)) * (-68)));
            int i16 = (i7 ^ i10) | (i7 & i10);
            int i17 = (i6 ^ i15) + ((i15 & i6) << 1) + ((~((length ^ i16) | (i16 & length))) * (-68));
            int i18 = ((~((i8 & i10) | (i8 ^ i10))) | i7) * 68;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i20 = i19 * (-622);
            int i21 = ((i20 | (-624)) << 1) - (i20 ^ (-624));
            int i22 = ~i19;
            int i23 = (~i22) | i22;
            int i24 = -(-((~((i23 & currentTimeMillis2) | (i23 ^ currentTimeMillis2))) * 623));
            int i25 = (i21 & i24) + (i21 | i24);
            int i26 = -(-(((~currentTimeMillis2) | i22) * (-623)));
            int i27 = (~((i22 ^ currentTimeMillis2) | (i22 & currentTimeMillis2))) | (~i23);
            int i28 = ~(currentTimeMillis2 | (currentTimeMillis2 ^ (-1)));
            iArr[i2] = iArr[(((i25 & i26) + (i26 | i25)) - (~(-(-(((i28 ^ i27) | (i28 & i27)) * 623))))) - 1];
            int length2 = iArr.length;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i29 = i5 * 758;
            int i30 = length2 * (-756);
            int i31 = ~currentTimeMillis3;
            int i32 = (i29 ^ i30) + ((i29 & i30) << 1) + (((i31 & i5) | (i5 ^ i31)) * (-757));
            int i33 = ~length2;
            int i34 = -(-((~(i33 | i5 | currentTimeMillis3)) * 1514));
            int i35 = ((i32 | i34) << 1) - (i34 ^ i32);
            int i36 = (~(i33 | i7)) | (~((i33 & i31) | (i31 ^ i33)));
            int i37 = (length2 ^ i5) | (length2 & i5);
            int i38 = ~((i37 ^ currentTimeMillis3) | (i37 & currentTimeMillis3));
            int i39 = ((i38 ^ i36) | (i38 & i36)) * 757;
            int i40 = (i35 ^ i39) + ((i39 & i35) << 1);
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i41 = -(-(i40 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd));
            int i42 = ~i40;
            int i43 = ~((~i42) | i42);
            int i44 = ~currentTimeMillis4;
            int i45 = ~((~i44) | i44);
            int i46 = ((((i41 ^ 1975) + ((i41 & 1975) << 1)) - (~(-(-(((i42 & currentTimeMillis4) | (currentTimeMillis4 ^ i42)) * 988))))) - 1) + (((i43 & i45) | (i43 ^ i45)) * (-1976));
            int i47 = ~(currentTimeMillis4 | i42);
            int i48 = -(-(((i47 ^ i42) | (i42 & i47) | (~(i40 | i44))) * 988));
            iArr[(i46 & i48) + (i48 | i46)] = i4;
            i2 = (i2 & 1) + (i2 | 1);
            int i49 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i49 & 101) + (i49 | 101)) % 128;
        }
        int i50 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i50 & 95) + (i50 | 95)) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m25290(int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 69) + ((i2 & 69) << 1)) % 128;
        util.h.xy.b.mb mbVar = util.h.xy.b.mb.f915;
        int i3 = mbVar.f916[0][i >>> 24];
        int i4 = mbVar.f916[1][(i >>> 16) & 255];
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = mbVar.f916[2][(i >>> 8) & 255];
        int i7 = (~(i6 & i5)) & (i6 | i5);
        int i8 = mbVar.f916[3][i & 255];
        int i9 = ~i7;
        int i10 = ~((~i8) | i);
        int i11 = ~i;
        int i12 = (i11 & i8) | (i11 ^ i8);
        int i13 = i11 | i9;
        int i14 = ~((i13 ^ i8) | (i13 & i8));
        int i15 = (i8 & i7) | (i8 ^ i7);
        int i16 = ~((i15 ^ i) | (i & i15));
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 77) % 128;
        return ((((((i8 * 319) + (i7 * (-317))) - (~(((i10 ^ i9) | (i10 & i9)) * (-318)))) - 1) + (((~(i | i9)) | (~((i7 ^ i12) | (i12 & i7)))) * 318)) - (~(((i16 & i14) | (i14 ^ i16)) * 318))) - 1;
    }
}
