package util.h.xy.cy;

/* loaded from: classes5.dex */
public final class ra {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static char[] getHighSpeedVideoFpsRanges = {15864, 8094, 31023, 23248, 46162, 37373, 62347, 52584, 11966, 2139, 26029, 18270, 41232, 33454, 56402, 14809, 40040, 48667, 55447, 64351, 5575, 12409, 21008, 27833, 36652, 43458, 50264, 59117, 131, 9018, 32218, 38981, 47845, 54429, 63239};
    private static long Camera2StreamConfigurationMap = -4166550070802006424L;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26123() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 121) + (i | 121)) % 128;
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 43) + ((i2 & 43) << 1)) % 128;
        return highSpeedVideoSizes;
    }

    private static boolean getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRangesFor + 97;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = i % 2;
        getHighSpeedVideoFpsRangesFor = ((i2 & 97) + (i2 | 97)) % 128;
        try {
            int i4 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i5 = i4 * 302;
            int i6 = (i5 ^ 38592) + ((i5 & 38592) << 1);
            int i7 = ~i4;
            int i8 = ~currentTimeMillis;
            int i9 = ((~((i7 ^ i8) | (i7 & i8))) | 64) * (-602);
            int i10 = ~(i7 | (-65));
            int i11 = ~((currentTimeMillis ^ i7) | (i7 & currentTimeMillis));
            int i12 = (i4 ^ i8) | (i4 & i8);
            int i13 = (i6 ^ i9) + ((i6 & i9) << 1) + (((~((i12 ^ 64) | (i12 & 64))) | (i11 ^ i10) | (i11 & i10)) * (-301));
            int i14 = -(-((~((i8 & 64) | (i8 ^ 64))) * 301));
            int i15 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i16 = i15 * 465;
            int i17 = ((i16 | 463) << 1) - (i16 ^ 463);
            int i18 = ~currentTimeMillis2;
            int i19 = ~i18;
            int i20 = ~i15;
            int i21 = i19 | i20;
            int i22 = ~((i18 ^ i15) | (i18 & i15));
            int i23 = ((i22 ^ i21) | (i21 & i22)) * 464;
            int i24 = -(-android.view.KeyEvent.getDeadChar(0, 0));
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((i13 ^ i14) + ((i14 & i13) << 1), ((((i17 & i23) + (i23 | i17)) + (((i20 & currentTimeMillis2) | (currentTimeMillis2 ^ i20)) * (-464))) - (~(((~((i15 & currentTimeMillis2) | (i15 ^ currentTimeMillis2))) | i20) * 464))) - 1, (char) (((i24 | 41368) << 1) - (i24 ^ 41368)), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            int i25 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i26 = ~packedPositionGroup;
            int i27 = ~((i26 ^ 16) | (i26 & 16));
            int i28 = ~((i26 ^ currentTimeMillis3) | (i26 & currentTimeMillis3));
            int i29 = (((packedPositionGroup * 141) - 2224) - (~(((i27 ^ i28) | (i27 & i28)) * (-280)))) - 1;
            int i30 = ~((currentTimeMillis3 ^ (-17)) | (currentTimeMillis3 & (-17)));
            int i31 = -(-(((i30 ^ i28) | (i28 & i30)) * 140));
            int i32 = i26 | (-17);
            int i33 = ~currentTimeMillis3;
            int i34 = (i26 ^ i33) | (i26 & i33);
            int i35 = (~((currentTimeMillis3 ^ i32) | (i32 & currentTimeMillis3))) | (~((i34 ^ 16) | (i34 & 16)));
            int i36 = (i33 & (-17)) | (i33 ^ (-17));
            int i37 = ~((packedPositionGroup ^ i36) | (packedPositionGroup & i36));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((i25 & 18) + (i25 | 18), (((i29 & i31) + (i31 | i29)) - (~(-(-(((i37 ^ i35) | (i37 & i35)) * 140))))) - 1, (char) android.graphics.Color.red(0), objArr2);
            boolean booleanValue = ((java.lang.Boolean) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).booleanValue();
            int i38 = getHighSpeedVideoSizes + 63;
            getHighSpeedVideoFpsRangesFor = i38 % 128;
            if (i38 % 2 != 0) {
                return booleanValue;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }
}
