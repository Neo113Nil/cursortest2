package util.h.xy.ct;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˏ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final /* synthetic */ util.h.xy.ct.mb[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char[] getInputFormats;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.ct.mb f1127;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.ct.mb f1128;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.ct.mb f1129;

    private mb(java.lang.String str, int i) {
    }

    public static util.h.xy.ct.mb valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 77;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.ct.mb mbVar = (util.h.xy.ct.mb) java.lang.Enum.valueOf(util.h.xy.ct.mb.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        return mbVar;
    }

    public static util.h.xy.ct.mb[] values() {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        util.h.xy.ct.mb[] mbVarArr = (util.h.xy.ct.mb[]) getHighSpeedVideoFpsRangesFor.clone();
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
        return mbVarArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (android.view.KeyEvent.keyCodeFromString("") + 68), "\u0004\r\u0006\b\u0000\u0002\f\u0004\u0005\u000b\u0002\u0007㘺", 13 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        util.h.xy.ct.mb mbVar = new util.h.xy.ct.mb(((java.lang.String) objArr[0]).intern(), 0);
        f1129 = mbVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 29), "\u0004\r\u0006\b\u0000\u0002\n\f\u0001\u0005\u0003\u0004\u000b\u0001\n\u0006", 15 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
        util.h.xy.ct.mb mbVar2 = new util.h.xy.ct.mb(((java.lang.String) objArr2[0]).intern(), 1);
        f1128 = mbVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 112), "\u0004\r\u0006\b\u0000\u0002\t\b\r\u0007", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, objArr3);
        util.h.xy.ct.mb mbVar3 = new util.h.xy.ct.mb(((java.lang.String) objArr3[0]).intern(), 2);
        f1127 = mbVar3;
        int i = getHighSpeedVideoSizesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 33) % 128;
        int i2 = (i + 109) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        getHighSpeedVideoFpsRangesFor = new util.h.xy.ct.mb[]{mbVar, mbVar2, mbVar3};
        int i3 = i2 + 117;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ct.mb m26044(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 41) % 128;
        util.h.xy.ct.mb mbVar = f1127;
        if (str != null) {
            int i2 = i + 49;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (str.length() > 0) {
                getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((byte) (29 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u0004\r\u0006\b\u0000\u0002\n\f\u0001\u0005\u0003\u0004\u000b\u0001\n\u0006", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 17, objArr);
                if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    int i3 = getHighResolutionOutputSizeshNQ4ISI + 69;
                    int i4 = i3 % 128;
                    getHighSpeedVideoSizesFor = i4;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    util.h.xy.ct.mb mbVar2 = f1128;
                    int i5 = i4 + 75;
                    getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 4;
                    }
                    return mbVar2;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 67), "\u0004\r\u0006\b\u0000\u0002\f\u0004\u0005\u000b\u0002\u0007㘺", 13 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                if (str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    int i7 = getHighSpeedVideoSizesFor + 37;
                    getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                    if (i7 % 2 == 0) {
                        return f1129;
                    }
                    throw null;
                }
            }
        }
        return mbVar;
    }

    /* renamed from: util.h.xy.ct.mb$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.ct.mb.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[util.h.xy.ct.mb.f1128.ordinal()] = 1;
                int i = getHighSpeedVideoSizes;
                int i2 = (i & 19) + (i | 19);
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.ct.mb.f1129.ordinal()] = 2;
                int i4 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = (((i4 | 33) << 1) - (i4 ^ 33)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int i5 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i5 & 41) + (i5 | 41)) % 128;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m26045() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 11) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (android.text.TextUtils.getCapsMode("", 0, 0) + 113), "\u0004\r\u0006\b\u0000\u0002\t\b\r\u0007", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = util.h.xy.ct.mb.AnonymousClass4.Camera2StreamConfigurationMap[ordinal()];
        if (i == 1) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) (29 - android.text.TextUtils.indexOf("", "", 0)), "\u0004\r\u0006\b\u0000\u0002\n\f\u0001\u0005\u0003\u0004\u000b\u0001\n\u0006", 16 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            return ((java.lang.String) objArr2[0]).intern();
        }
        if (i != 2) {
            return intern;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (67 - android.view.MotionEvent.axisFromString("")), "\u0004\r\u0006\b\u0000\u0002\f\u0004\u0005\u000b\u0002\u0007㘺", android.view.View.resolveSizeAndState(0, 0, 0) + 13, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        return intern2;
    }

    private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 89) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ Camera2StreamConfigurationMap);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i4 = getHighSpeedVideoSizes + 125;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 == 0) {
                i2 = i + 52;
                cArr3[i2] = (char) (charArray[i2] << b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    int i5 = getHighSpeedVideoFpsRanges + 121;
                    getHighSpeedVideoSizes = i5 % 128;
                    if (i5 % 2 != 0) {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 >>> b);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 >> b);
                    } else {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                    }
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                        cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 23) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                        cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                        cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputFormats = new char[]{41871, 41896, 41904, 41909, 41859, 41880, 41917, 41913, 41908, 41902, 41899, 41865, 41882, 41897, 41907, 41877};
        Camera2StreamConfigurationMap = (char) 38466;
    }
}
