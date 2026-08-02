package util.h.xy.bh;

/* loaded from: classes5.dex */
public final class b {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static char getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static char getOutputStallDuration;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static java.lang.String f946;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static java.lang.String f947;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static java.lang.String f948;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String f949;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String f950;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String f951;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String f952;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static java.lang.String f953;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String f954;

    /* renamed from: ι, reason: contains not printable characters */
    public static java.lang.String f955;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType m25467(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 107;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType transactionType = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.OTHER;
            if (str == null || str.length() <= 0) {
                return transactionType;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\uf837᧷伋㚼᳴혓\ueffe㯲", android.view.KeyEvent.normalizeMetaState(0) + 8, objArr);
            if (!str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("⚬訮\u07b8䃒ꟊ䒙", 7 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                if (!str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("籭岒兏뎆ꊘᡠ존\u0ec5앙텿풌ɥ\uec5c饯", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr3);
                    if (str.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                        int i2 = getInputSizeshNQ4ISI + 39;
                        getOutputMinFrameDuration = i2 % 128;
                        if (i2 % 2 != 0) {
                            return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_WITHDRAWAL;
                        }
                        com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType transactionType2 = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_WITHDRAWAL;
                        throw null;
                    }
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("밲\udae9០齷鈰歹쇚፥ɲዒꧪ贻붷\ue6fa\uf022菻䕤", (char) (android.graphics.Color.argb(0, 0, 0, 0) + 60168), 1763152860 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\udca1នࡩ諫", "\u0000\u0000\u0000\u0000", objArr4);
                    if (str.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                        int i3 = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        getOutputMinFrameDuration = i3 % 128;
                        if (i3 % 2 != 0) {
                            return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_OTHER_SERVICE;
                        }
                        com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType transactionType3 = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_OTHER_SERVICE;
                        throw null;
                    }
                    return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.OTHER;
                }
                getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 19) % 128;
                return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.REFUND;
            }
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 75) % 128;
            return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.PURCHASE;
        }
        com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType transactionType4 = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.OTHER;
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus m25465(java.lang.String str) {
        com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus transactionStatus = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.DECLINED;
        if (str != null) {
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 121) % 128;
            if (str.length() > 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u0adf墚㭚\ue7e7\uf51d\ud912쫥ရ", (char) android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, "卄╧\uc7375", "\u0000\u0000\u0000\u0000", objArr);
                if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    int i = getInputSizeshNQ4ISI + 51;
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 != 0) {
                        return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.APPROVED;
                    }
                    com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus transactionStatus2 = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.APPROVED;
                    throw null;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("띶荁顩ť廥馕膏歹", '8' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                if (str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus transactionStatus3 = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.DECLINED;
                    getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 37) % 128;
                    return transactionStatus3;
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("⚬訮\u07b8䃒ꟊ䒙膏歹", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 8, objArr3);
                if (str.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                    return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.REFUNDED;
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("顩ťﵰჁ⚬訮\uf02fල", 7 - android.text.TextUtils.indexOf("", "", 0), objArr4);
                if (str.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                    getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 101) % 128;
                    return com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.CLEARED;
                }
            }
        }
        return transactionStatus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009c, code lost:
    
        if (r14.equalsIgnoreCase(((java.lang.String) r2[0]).intern()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
    
        return com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.OTP_NEEDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        r2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ẅ➉\u0e6d￢箃᾿쒂駨\uf6f3邔띶荁\uf02fල", 13 - android.view.View.MeasureSpec.getSize(0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        if (r14.equalsIgnoreCase(((java.lang.String) r2[0]).intern()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        return com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.WEB3DS_NEEDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("떸䈌\ueccc\ud7c9\uf461犂\u0a92䃕\ue3f0\ue3a8陝饿裇ꛕ嚽뮸", (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 47281), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "咪\uf3a3눶閸", "\u0000\u0000\u0000\u0000", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
    
        if (r14.equalsIgnoreCase(((java.lang.String) r3[0]).intern()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
    
        return com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.APP2APP_SELECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        return com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.IDV_METHOD_NOT_SELECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r14.equalsIgnoreCase(((java.lang.String) r5[0]).intern()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (r14.equalsIgnoreCase(((java.lang.String) r5[0]).intern()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("尞ᶾ쇿婸ⷫ柵膏歹膏歹", 9 - android.view.MotionEvent.axisFromString(""), r2);
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus m25466(java.lang.String str) {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 87) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus cardStatus = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.ACTIVE;
        if (str != null) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 119) % 128;
            if (str.length() > 0) {
                int i = getOutputMinFrameDuration + 21;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("㍓封ﳤ鬻ຽ⢢幰⇧ꃌ멚䮞箓\uf23e㮺ᩎ諏섫뭏콌콱\udb00쯍垙", (char) ((-1) << android.widget.ExpandableListView.getPackedPositionChild(1L)), 243021101 << android.graphics.Color.rgb(1, 1, 1), "\u2daf簵ഏ槽", "\u0000\u0000\u0000\u0000", objArr);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("㍓封ﳤ鬻ຽ⢢幰⇧ꃌ멚䮞箓\uf23e㮺ᩎ諏섫뭏콌콱\udb00쯍垙", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 243021101 - android.graphics.Color.rgb(0, 0, 0), "\u2daf簵ഏ槽", "\u0000\u0000\u0000\u0000", objArr2);
                }
            }
        }
        return cardStatus;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i3 = getHighSpeedVideoFpsRanges + 117;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 == 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630];
                i2 = 1;
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                i4 -= 40503;
                i2++;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("㼋᎘땎ʹ嵒䵳혵픦⩈\udfe2", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, objArr);
        f950 = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("⺘噜\udecdࡂ\uf887䪑\uf254姤㐞ﻫ嘷", (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 31135250 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "ᄶ\udb16搁⽻", "\u0000\u0000\u0000\u0000", objArr2);
        f949 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䦗ネꋆ\uf854璉\ud9b0㟩땉ꎒ贴컰︮闃놿\uf02fල", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr3);
        f951 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䦗ネꋆ\uf854璉\ud9b0㟩땉ꎒ贴컰︮闃놿穆䗁쒮⍜컖썠廥馕膏歹", 23 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
        f954 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("嗁\udc2e\u0016ơ寯睝혌ቭ㨅欭Ꮰ챂괚", (char) (40005 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 1720108076 + (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "ⱋ蛄䕦羜", "\u0000\u0000\u0000\u0000", objArr5);
        f952 = ((java.lang.String) objArr5[0]).intern();
        int i = getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i + 113) % 128;
        getOutputMinFrameDuration = (i + 81) % 128;
        try {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("䦗ネꋆ\uf854ꤻ陝쒮⍜\udf58㬛", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 10, objArr6);
            f955 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("㍓封ﳤ鬻ຽ⢢幰⇧ꃌ멚䮞箓\uf23e㮺ᩎ諏섫뭏콌콱\udb00쯍垙", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 259798318 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u2daf簵ഏ槽", "\u0000\u0000\u0000\u0000", objArr7);
            f953 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("尞ᶾ쇿婸ⷫ柵膏歹膏歹", ':' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr8);
            f946 = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ẅ➉ऻ뼼뭔낋殯擇ⷫ柵膏歹膏歹", 13 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr9);
            f948 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ue235흅鮠๏䋱醫ꕍ\ueef8톖ﻧ⥇㫰́넶", (char) (android.graphics.Color.argb(0, 0, 0, 0) + 5241), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "큃溏礛㤔", "\u0000\u0000\u0000\u0000", objArr10);
            f947 = ((java.lang.String) objArr10[0]).intern();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
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
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 33) % 128;
        while (rcVar.f2652 < length3) {
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizes ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getOutputStallDuration ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        Camera2StreamConfigurationMap = (char) 43221;
        getInputFormats = (char) 58691;
        getHighSpeedVideoSizesFor = (char) 7832;
        getHighSpeedVideoFpsRangesFor = (char) 34866;
        getHighSpeedVideoSizes = 2457411417541981002L;
        getOutputFormats = 294925130;
        getOutputStallDuration = (char) 57245;
    }
}
