package util.h.xy.d;

/* loaded from: classes5.dex */
public final class f extends util.h.xy.s.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static char[] getInputFormats;
    private static int getOutputFormats;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static java.lang.String f1130;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static java.lang.String f1131;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static java.lang.String f1132;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String f1133;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String f1134;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String f1135;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String f1136;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static java.lang.String f1137;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String f1138;

    /* renamed from: ι, reason: contains not printable characters */
    public static java.lang.String f1139;

    static {
        int i;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ufff9\b\u0001", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 175 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, objArr);
        f1135 = ((java.lang.String) objArr[0]).intern();
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        int i2 = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000b\u0002\t\u0011\uffde\t\t\ufffa\ufffe\r\ufffa\uffdd\u0012", (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 12, 9 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 172 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), true, objArr2);
            f1138 = ((java.lang.String) objArr2[0]).intern();
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 7) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("￭\b\ufffb\n\ufffe\u0007\u000f￨\u000b\uffff", 9 - lastIndexOf, 6 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 171 - android.view.MotionEvent.axisFromString(""), true, objArr3);
            f1133 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000b\uffdfￌ\u0005�\ufffb\f\u000e\u000e\b\uffff\u0006\ufffb\u0010\u0003\u000f", 17 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 8, 172 - android.view.View.resolveSizeAndState(0, 0, 0), true, objArr4);
            f1136 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0005\u0000�", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, -android.graphics.ImageFormat.getBitsPerPixel(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 171, true, objArr5);
            f1134 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0006�\u0010\u0007\uffe7\t\ufffe\uffff", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, 1 - android.view.View.getDefaultSize(0, 0), 171 - android.widget.ExpandableListView.getPackedPositionChild(0L), false, objArr6);
            f1132 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0005\r\u0006\u0007\u0001\f\ufff9\n�\u0006�\uffdf￼", 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.MotionEvent.axisFromString("") + 175, true, objArr7);
            f1137 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\f\ufffa\ufff8�￭￼\t\n\u0000\u0006\u0005", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, 175 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), false, objArr8);
            f1131 = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff6\u0005\u0007", android.graphics.Color.green(0) + 3, android.graphics.Color.green(0) + 2, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, true, objArr9);
            f1139 = ((java.lang.String) objArr9[0]).intern();
            char offsetBefore = (byte) (126 - android.text.TextUtils.getOffsetBefore("", 0));
            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
            int i4 = packedPositionType + 17;
            char[] charArray = "\u0001\b\n\f\u000f\u0000\n\u000b\u0003\u0000\u0004\u0000\f\r\u0003\u0000㙧".toCharArray();
            util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
            char[] cArr = getInputFormats;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
                for (int i5 = 0; i5 < length; i5++) {
                    cArr2[i5] = (char) (cArr[i5] ^ 4042185467053315654L);
                }
                cArr = cArr2;
            }
            char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRanges);
            char[] cArr3 = new char[i4];
            if (i4 % 2 != 0) {
                int i6 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i6 + 61) % 128;
                i = packedPositionType + 16;
                cArr3[i] = (char) (charArray[i] - offsetBefore);
                int i7 = i6 + 29;
                getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i = i4;
            }
            if (i > 1) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 31) % 128;
                mcVar.f2638 = 0;
                while (mcVar.f2638 < i) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                    if (mcVar.f2641 == mcVar.f2636) {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 - offsetBefore);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - offsetBefore);
                    } else {
                        mcVar.f2639 = mcVar.f2641 / c;
                        mcVar.f2640 = mcVar.f2641 % c;
                        mcVar.f2637 = mcVar.f2636 / c;
                        mcVar.f2635 = mcVar.f2636 % c;
                        if (mcVar.f2640 == mcVar.f2635) {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                            mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                            mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                            int i9 = mcVar.f2639;
                            int i10 = mcVar.f2640;
                            int i11 = mcVar.f2637;
                            int i12 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                            cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                        } else if (mcVar.f2639 == mcVar.f2637) {
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
                            mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                            mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                            int i13 = mcVar.f2639;
                            int i14 = mcVar.f2640;
                            int i15 = mcVar.f2637;
                            int i16 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                            cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                        } else {
                            int i17 = mcVar.f2639;
                            int i18 = mcVar.f2635;
                            int i19 = mcVar.f2637;
                            int i20 = mcVar.f2640;
                            cArr3[mcVar.f2638] = cArr[(i17 * c) + i18];
                            cArr3[mcVar.f2638 + 1] = cArr[(i19 * c) + i20];
                        }
                    }
                    mcVar.f2638 += 2;
                }
            }
            for (int i21 = 0; i21 < i4; i21++) {
                cArr3[i21] = (char) (cArr3[i21] ^ 13722);
            }
            f1130 = new java.lang.String(cArr3).intern();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 79) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getOutputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                int i6 = getHighSpeedVideoFpsRangesFor + 19;
                getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr3[raVar.f2649] = cArr[raVar.f2649 + i + 1];
                    i4 = raVar.f2649;
                } else {
                    cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                    i4 = raVar.f2649 + 1;
                }
                raVar.f2649 = i4;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats = -1231763760;
        getInputFormats = new char[]{41912, 41030, 41907, 41906, 41026, 41031, 41903, 41029, 41919, 41913, 41887, 41028, 41909, 41027, 41904, 41896};
        getHighSpeedVideoFpsRanges = (char) 38466;
    }
}
