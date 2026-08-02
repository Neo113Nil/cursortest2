package com.gemalto.mfs.mwsdk.payment.experience;

/* loaded from: classes8.dex */
public final class PaymentExperienceSettings {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats;

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = "PaymentExperienceSettings";
        int i = getHighSpeedVideoSizesFor + 83;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private PaymentExperienceSettings() {
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 51) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 51) % 128;
        objArr[0] = str2;
    }

    public static boolean checkPaymentExperienceSupport(android.content.Context context, com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience paymentExperience) {
        getInputFormats = (getHighSpeedVideoSizesFor + 53) % 128;
        boolean checkPaymentExperienceSupport = checkPaymentExperienceSupport(context, paymentExperience, 0);
        getHighSpeedVideoSizesFor = (getInputFormats + 37) % 128;
        return checkPaymentExperienceSupport;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoFpsRangesFor + 81;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 99) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
                int i6 = getHighSpeedVideoFpsRanges + 61;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 3;
                }
            }
            cArr = cArr3;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i8 = getHighSpeedVideoFpsRangesFor + 117;
        getHighSpeedVideoFpsRanges = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* renamed from: com.gemalto.mfs.mwsdk.payment.experience.PaymentExperienceSettings$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        private static int Camera2StreamConfigurationMap = 1;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED.ordinal()] = 1;
                int i = getHighSpeedVideoFpsRangesFor;
                int i2 = (i ^ 33) + ((i & 33) << 1);
                Camera2StreamConfigurationMap = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS.ordinal()] = 2;
                int i4 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i4 & 91) + (i4 | 91)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_ENABLED.ordinal()] = 3;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 51) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x02c4, code lost:
    
        if (r8 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02f7, code lost:
    
        if (r35 != com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_ENABLED) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02f9, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("⪜밡箜⪼ࢇ\ue781쳃ᩱ䓙疩廸衞\uf6ac诉\ue889\ue631悝ᦫ窀吚鉸ꠀ", android.view.View.MeasureSpec.getSize(0), r3);
        r1 = ((java.lang.String) r3[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02f1, code lost:
    
        if (r8 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean checkPaymentExperienceSupport(android.content.Context context, com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience paymentExperience, int i) {
        java.lang.String intern;
        getInputFormats = (getHighSpeedVideoSizesFor + 35) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0000", -((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, 111 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), false, objArr);
            java.lang.String intern2 = ((java.lang.String) objArr[0]).intern();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String[] strArr = new java.lang.String[10];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("䲷ℹ덦䳳閴竔Ѐ蝅⋴\ue8f4陶ᕁ邘ᚕ⁓笀", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr2);
            strArr[0] = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("殻鲰鿒毺⎩읖⢦ㅃ״啱몆ꌱ랭\uab1d\u0cf0촂↲㤷黌", android.text.TextUtils.getTrimmedLength(""), objArr3);
            strArr[1] = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("￡\u0006\u0007\u0001\f\ufff9\n�\f", 9 - android.view.KeyEvent.keyCodeFromString(""), -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, true, objArr4);
            strArr[2] = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("⾵\u181e豐\u2fd6剦䏦㬵䂿䇾퇅꤯튮\uf390⾤ὡ볊於붙赎", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
            strArr[3] = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("苒ഝ͖芴\u180e囼됪\u0af3\ueca5쓇☏飂廻㪻遡", android.text.TextUtils.getCapsMode("", 0, 0), objArr6);
            strArr[4] = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0004\t\u0002\u0001\u0004\u0007\u0000￭\u0000￼\uffff", 11 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, false, objArr7);
            strArr[5] = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ufff3\u0003\u000f\u0012\u0005\ufff7\u0005\t\u0007\b\u0014\u0005\u0004\uffc0", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, 163 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), false, objArr8);
            strArr[6] = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ઘ\ue259뇄\u0ad9糬릁ڝ湔擻⮞钇ﰠ훰헼⋧鈝", android.text.TextUtils.indexOf("", "", 0), objArr9);
            strArr[7] = ((java.lang.String) objArr9[0]).intern();
            strArr[8] = new java.util.Date().toString();
            strArr[9] = util.h.xy.br.c.m25599();
            java.lang.String str = util.h.xy.br.a.f1029;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strArr[0]);
            sb.append(intern2);
            sb.append(strArr[1]);
            sb.append(intern2);
            sb.append(strArr[2]);
            sb.append(intern2);
            sb.append(strArr[3]);
            sb.append(intern2);
            sb.append(strArr[4]);
            sb.append(intern2);
            sb.append(strArr[5]);
            sb.append(intern2);
            sb.append(strArr[6]);
            sb.append(intern2);
            sb.append(strArr[7]);
            sb.append(intern2);
            sb.append(strArr[8]);
            sb.append(intern2);
            sb.append(strArr[9]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0000", 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 76 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, objArr10);
            sb.append(((java.lang.String) objArr10[0]).intern());
            util.h.xy.br.mc.m25610(context, str, sb.toString());
            int i2 = com.gemalto.mfs.mwsdk.payment.experience.PaymentExperienceSettings.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[paymentExperience.ordinal()];
            boolean z = i2 == 1 || i2 == 2 || (i2 == 3 && new util.h.xy.br.c().m25603(context, i, 30) == com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_ENABLED);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            double d = 120.0d;
            if (i != 0) {
                int i3 = getInputFormats + 11;
                getHighSpeedVideoSizesFor = i3 % 128;
                d = i3 % 2 == 0 ? 120.0d - ((i / 100.0d) * 0.0d) : 120.0d * ((i / 100.0d) + 1.0d);
            }
            int lastIndexOf = 16 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int keyRepeatDelay = 9 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i4 = getHighSpeedVideoSizesFor + 63;
            getInputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0007\u0016\ufff8\u0003\u000e\ufff8\u0010\n￠ￗ\uffdf\u000b\u000e\u0006\u0016\u000b\ufff8", lastIndexOf, keyRepeatDelay, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE >> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), false, objArr11);
                intern = ((java.lang.String) objArr11[0]).intern();
            } else {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0007\u0016\ufff8\u0003\u000e\ufff8\u0010\n￠ￗ\uffdf\u000b\u000e\u0006\u0016\u000b\ufff8", lastIndexOf, keyRepeatDelay, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, false, objArr12);
                intern = ((java.lang.String) objArr12[0]).intern();
            }
            java.lang.String str2 = util.h.xy.br.a.f1029;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0007\ufffb\u0007\ufffb\u0007\ufffb\u0007\ufffb\ufffb\u0007\ufffb\u0007\ufffb\u0007\ufffb", 15 - android.view.View.resolveSize(0, 0), 8 - android.view.Gravity.getAbsoluteGravity(0, 0), 104 - android.view.KeyEvent.normalizeMetaState(0), false, objArr13);
            sb2.append(((java.lang.String) objArr13[0]).intern());
            sb2.append(currentTimeMillis2);
            sb2.append(intern);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("狉祷쪗狩绫⋓綧江᳣", android.graphics.Color.alpha(0), objArr14);
            sb2.append(((java.lang.String) objArr14[0]).intern());
            util.h.xy.br.mc.m25610(context, str2, sb2.toString());
            if (currentTimeMillis2 <= d * 1000.0d) {
                return z;
            }
            getHighSpeedVideoSizesFor = (getInputFormats + 29) % 128;
            return false;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void setPaymentExperience(android.content.Context context, com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience paymentExperience) {
        new util.h.xy.br.c().m25601(context, paymentExperience);
        getInputFormats = (getHighSpeedVideoSizesFor + 105) % 128;
    }

    public static com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience getPaymentExperience(android.content.Context context) {
        com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25602 = new util.h.xy.br.c().m25602(context);
        int i = getHighSpeedVideoSizesFor + 61;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return m25602;
        }
        throw null;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = -180545289152126048L;
        getHighSpeedVideoSizes = -1231763755;
    }
}
