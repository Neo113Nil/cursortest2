package util.h.xy.au;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class me {
    private static final /* synthetic */ util.h.xy.au.me[] Camera2StreamConfigurationMap;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.au.me f868;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.au.me f869;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.au.me f870;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.au.me f871;

    private me(java.lang.String str, int i) {
    }

    public static util.h.xy.au.me valueOf(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
        util.h.xy.au.me meVar = (util.h.xy.au.me) java.lang.Enum.valueOf(util.h.xy.au.me.class, str);
        int i = getHighSpeedVideoFpsRanges + 9;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return meVar;
        }
        throw null;
    }

    public static util.h.xy.au.me[] values() {
        int i = getHighSpeedVideoFpsRanges + 77;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.au.me[] meVarArr = (util.h.xy.au.me[]) Camera2StreamConfigurationMap.clone();
        int i2 = getHighSpeedVideoSizesFor + 41;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return meVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.au.me[] meVarArr;
        getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羉햱⯽脳흮", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 43578, objArr);
            util.h.xy.au.me meVar = new util.h.xy.au.me(((java.lang.String) objArr[0]).intern(), 0);
            f869 = meVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羄䢼ᇵ\uda3f", 14142 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr2);
            util.h.xy.au.me meVar2 = new util.h.xy.au.me(((java.lang.String) objArr2[0]).intern(), 1);
            f870 = meVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羚仇ᴉ\uec62", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12620, objArr3);
            util.h.xy.au.me meVar3 = new util.h.xy.au.me(((java.lang.String) objArr3[0]).intern(), 2);
            f868 = meVar3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羈̞蚝ਁ趛", 31873 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
            util.h.xy.au.me meVar4 = new util.h.xy.au.me(((java.lang.String) objArr4[0]).intern(), 3);
            f871 = meVar4;
            int i = getHighSpeedVideoSizesFor + 33;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                meVarArr = new util.h.xy.au.me[3];
                meVarArr[0] = meVar;
                meVarArr[0] = meVar2;
                meVarArr[3] = meVar3;
                meVarArr[5] = meVar4;
            } else {
                meVarArr = new util.h.xy.au.me[]{meVar, meVar2, meVar3, meVar4};
            }
            Camera2StreamConfigurationMap = meVarArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: util.h.xy.au.me$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;

        static {
            int[] iArr = new int[util.h.xy.au.me.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[util.h.xy.au.me.f869.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.au.me.f870.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.au.me.f868.ordinal()] = 3;
                int i = getHighSpeedVideoFpsRangesFor + 3;
                getHighSpeedVideoSizes = i % 128;
                int i2 = i % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.au.me.f871.ordinal()] = 4;
                int i3 = getHighSpeedVideoFpsRangesFor;
                int i4 = (i3 ^ 5) + ((i3 & 5) << 1);
                getHighSpeedVideoSizes = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.lang.String m25168() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 99) % 128;
        int i = util.h.xy.au.me.AnonymousClass3.getHighResolutionOutputSizeshNQ4ISI[ordinal()];
        if (i == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羉햱⯽脳흮", 43577 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            return ((java.lang.String) objArr[0]).intern();
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("羈̞蚝ਁ趛", android.view.View.MeasureSpec.getMode(0) + 31873, objArr2);
                return ((java.lang.String) objArr2[0]).intern();
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羚仇ᴉ\uec62", 12620 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
            return intern;
        }
        int i2 = getHighSpeedVideoFpsRanges + 71;
        getHighSpeedVideoSizesFor = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("羄䢼ᇵ\uda3f", 14143 << (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() + 50), objArr4);
                return ((java.lang.String) objArr4[0]).intern();
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("羄䢼ᇵ\uda3f", 14143 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr5);
            return ((java.lang.String) objArr5[0]).intern();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 3;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 9) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 93) % 128;
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighResolutionOutputSizeshNQ4ISI ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 51) % 128;
            cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = 1490032591839513686L;
    }
}
