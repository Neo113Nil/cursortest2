package com.gemalto.mfs.mwsdk.mobilegateway;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class MobileGatewayManager {
    private static int Camera2StreamConfigurationMap = 0;
    public static final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager INSTANCE;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static long getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static int[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService getOutputMinFrameDurationlomOqCM;
    private com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager getOutputSizes;
    private com.gemalto.mfs.mwsdk.mobilegateway.MGCardManager getOutputSizeshNQ4ISI;
    private util.h.xy.au.mf getOutputStallDurationlomOqCM;

    public static com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager valueOf(java.lang.String str) {
        getOutputFormats = (getInputFormats + 25) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager mobileGatewayManager = (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.class, str);
        int i = getInputFormats + 9;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return mobileGatewayManager;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[] values() {
        int i = getOutputFormats + 103;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[] mobileGatewayManagerArr = (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        int i2 = getInputFormats + 1;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return mobileGatewayManagerArr;
        }
        throw null;
    }

    static {
        com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[] mobileGatewayManagerArr;
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-1201372813, -78682611, 759060610, 1312674126}, 7 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
        com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager mobileGatewayManager = new com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager(((java.lang.String) objArr[0]).intern());
        INSTANCE = mobileGatewayManager;
        int i = getInputFormats + 53;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 != 0) {
            mobileGatewayManagerArr = new com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[0];
            mobileGatewayManagerArr[1] = mobileGatewayManager;
        } else {
            mobileGatewayManagerArr = new com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager[]{mobileGatewayManager};
        }
        int i3 = i2 + 61;
        int i4 = i3 % 128;
        getInputFormats = i4;
        if (i3 % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = mobileGatewayManagerArr;
            getOutputMinFrameDuration = "MobileGatewayManager";
            int i5 = i4 + 61;
            getOutputFormats = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    private MobileGatewayManager(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputSizes = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = util.h.xy.au.f.m25126();
        this.getOutputSizes = util.h.xy.au.f.m25125();
        this.getOutputStallDurationlomOqCM = util.h.xy.au.mf.m25169();
        this.getOutputSizeshNQ4ISI = util.h.xy.au.f.m25124();
    }

    public final void configure(android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
        getInputFormats = (getOutputFormats + 59) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (15250 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.view.ViewConfiguration.getLongPressTimeout() >> 16, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int[] iArr = {1143174171, -766863330, 1857075480, 353568741};
        int i = getOutputFormats + 29;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(iArr, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 21) + 6, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(iArr, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 6, objArr3);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            }
            this.getOutputStallDurationlomOqCM.m25171(context);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getInputSizeshNQ4ISI;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i3 = getHighSpeedVideoSizes + 65;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 3;
            }
            int i5 = 0;
            while (i5 < length2) {
                int i6 = getHighSpeedVideoFpsRanges + 77;
                getHighSpeedVideoSizes = i6 % 128;
                if (i6 % 2 != 0) {
                    iArr4[i5] = (int) (iArr3[i5] / (-5569649899877129369L));
                    i5 %= 1;
                } else {
                    iArr4[i5] = (int) (iArr3[i5] ^ (-5569649899877129369L));
                    i5++;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getInputSizeshNQ4ISI;
        if (iArr6 != null) {
            int i7 = getHighSpeedVideoFpsRanges + 115;
            getHighSpeedVideoSizes = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                iArr2[i8] = (int) (iArr6[i8] ^ (-5569649899877129369L));
                i8++;
                length3 = length3;
            }
            i2 = length3;
            iArr6 = iArr2;
        } else {
            i2 = length3;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, i2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i9 = 0; i9 < 16; i9++) {
                cVar.f2627 ^= iArr5[i9];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i10 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i10;
            }
            int i11 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i11;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i12 = cVar.f2627;
            int i13 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final void configure(android.content.Context context, com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration... mGConfigurationArr) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
        int i = 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (15250 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.view.KeyEvent.getDeadChar(0, 0), "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{1143174171, -766863330, 1857075480, 353568741}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (mGConfigurationArr == null || mGConfigurationArr.length <= 0) {
            java.lang.String str = util.h.xy.ay.ma.f895;
            throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f895);
        }
        int length = mGConfigurationArr.length;
        while (i < length) {
            int i2 = getOutputFormats;
            getInputFormats = (i2 + 97) % 128;
            if (mGConfigurationArr[i] == null) {
                java.lang.String str2 = util.h.xy.ay.ma.f895;
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f892);
            }
            i++;
            int i3 = i2 + 107;
            getInputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 5;
            }
        }
        this.getOutputStallDurationlomOqCM.m25184(context, mGConfigurationArr);
        int i5 = getOutputFormats + 101;
        getInputFormats = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 25;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
            int i5 = getHighSpeedVideoFpsRanges + 63;
            getHighSpeedVideoSizes = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final void resetSDKStorage(android.content.Context context, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGConfigurationResetListener mGConfigurationResetListener) {
        synchronized (this) {
            getInputFormats = (getOutputFormats + 59) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15249), android.view.ViewConfiguration.getTouchSlop() >> 8, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("籫赔剾㓬뎆澄Β", (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-1606641414) - android.graphics.Color.red(0), "﨓㲘薠懥", "\uf47c븼쨽䏃", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            this.getOutputStallDurationlomOqCM.m25180(mGConfigurationResetListener, false, context);
            getOutputFormats = (getInputFormats + 105) % 128;
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState getConfigurationState() {
        int i = getOutputFormats + 125;
        getInputFormats = i % 128;
        char bitsPerPixel = (char) (i % 2 == 0 ? 10905 >> android.graphics.ImageFormat.getBitsPerPixel(1) : 15249 - android.graphics.ImageFormat.getBitsPerPixel(0));
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", bitsPerPixel, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            getOutputFormats = (getInputFormats + 117) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("萪˹튰፟ꓣ뇁먮", (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), 472434980 - android.view.View.resolveSizeAndState(0, 0, 0), "⓪⣉༜뎖", "\uf47c븼쨽䏃", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return this.getOutputStallDurationlomOqCM.m25172();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getCardArt(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.NoSuchCardException {
        int i = getOutputFormats + 51;
        int i2 = i % 128;
        getInputFormats = i2;
        int i3 = i % 2 == 0 ? 13496 : 15250;
        getOutputFormats = (i2 + 119) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (i3 + (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), android.view.ViewConfiguration.getTapTimeout() >> 16, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{129755177, 926081189, -852820178, 1749656433}, 7 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            try {
                return this.getOutputStallDurationlomOqCM.m25170(str);
            } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.NoSuchCardException(e.getMessage());
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService getCardEnrollmentService() {
        getInputFormats = (getOutputFormats + 1) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (android.view.KeyEvent.normalizeMetaState(0) + 15250), android.view.ViewConfiguration.getLongPressTimeout() >> 16, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{129755177, 926081189, -474248217, -79605776}, 8 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (util.h.xy.bh.ra.m25484().m25485() == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㲼\ue1fa䖸톅蟢ੑ㘩\u0604ᗬ푍쒘잖ㆂ禍淟ᇶ阒叺\ue705궴ࣜ畟衾刻", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', "\ue8c2\uda7c冀ꨌ", "\uf47c븼쨽䏃", objArr3);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
        }
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService mGCardEnrollmentService = this.getOutputMinFrameDurationlomOqCM;
        getInputFormats = (getOutputFormats + 109) % 128;
        return mGCardEnrollmentService;
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager getCardLifeCycleManager() {
        getOutputFormats = (getInputFormats + 25) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (15250 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), android.text.TextUtils.indexOf("", "", 0, 0), "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{129755177, 926081189, 2125929514, 780540095, 2134621272, -1595682947}, android.text.TextUtils.getTrimmedLength("") + 9, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (util.h.xy.bh.ra.m25484().m25485() == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㲼\ue1fa䖸톅蟢ੑ㘩\u0604ᗬ푍쒘잖ㆂ禍淟ᇶ阒叺\ue705궴ࣜ畟衾刻", (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), android.view.ViewConfiguration.getJumpTapTimeout() >> 16, "\ue8c2\uda7c冀ꨌ", "\uf47c븼쨽䏃", objArr3);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
        }
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager mGCardLifeCycleManager = this.getOutputSizes;
        int i = getInputFormats + 53;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return mGCardLifeCycleManager;
        }
        throw null;
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryService getTransactionHistoryService() {
        java.lang.String intern;
        int longPressTimeout;
        int i = getInputFormats + 37;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (16761 % (android.view.ViewConfiguration.getFadingEdgeLength() << 17)), android.view.ViewConfiguration.getKeyRepeatDelay() - 53, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() + 49;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 15250), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
        }
        char c = (char) longPressTimeout;
        int i2 = getInputFormats + 61;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 5;
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("⦢Ⰱ℺ળ魈䣼坴ꦥ", c, (-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), "哱긷緘င", "\uf47c븼쨽䏃", objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            return this.getOutputStallDurationlomOqCM.m25185();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.MGCardManager getCardManager() {
        getInputFormats = (getOutputFormats + 55) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㷵ꭃ霃䬖", (char) (15249 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0), "䈙蘤銝鼻", "\uf47c븼쨽䏃", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{129755177, 926081189, 1832438673, 1037973490}, android.text.TextUtils.getCapsMode("", 0, 0) + 7, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (util.h.xy.bh.ra.m25484().m25485() == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㲼\ue1fa䖸톅蟢ੑ㘩\u0604ᗬ푍쒘잖ㆂ禍淟ᇶ阒叺\ue705궴ࣜ畟衾刻", (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, "\ue8c2\uda7c冀ꨌ", "\uf47c븼쨽䏃", objArr3);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
        }
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardManager mGCardManager = this.getOutputSizeshNQ4ISI;
        getInputFormats = (getOutputFormats + 99) % 128;
        return mGCardManager;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = 7050860857158846262L;
        Camera2StreamConfigurationMap = 294925130;
        getHighSpeedVideoFpsRangesFor = (char) 13130;
        getInputSizeshNQ4ISI = new int[]{262746095, 739057250, -1347466819, -719927125, 237814569, 2048868298, 95239303, -164922286, 1193285283, 109702511, -540383194, -1603530889, -1277126682, 360027303, -1062505808, -637243275, 1445882716, 412105836};
    }
}
