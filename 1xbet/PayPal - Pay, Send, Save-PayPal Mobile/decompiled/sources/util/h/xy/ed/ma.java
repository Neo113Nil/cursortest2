package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class ma extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static char getInputFormats = 0;
    private static boolean getInputSizeshNQ4ISI = false;
    private static int getOutputFormats = 0;
    private static boolean getOutputMinFrameDuration = false;
    private static int getOutputStallDurationlomOqCM = 1;

    /* renamed from: ʳ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2084;

    /* renamed from: ʹ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2085;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2086;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2087;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2088;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2089;

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2090;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2091;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2092;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2093;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2094;

    /* renamed from: ˌ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2095;

    /* renamed from: ˍ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2096;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2097;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2098;

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2099;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2100;

    /* renamed from: ՙ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2101;

    /* renamed from: י, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2102;

    /* renamed from: ـ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2103;

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2104;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2105;

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2106;

    /* renamed from: ᐨ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2107;

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2108;

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2109;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2110;

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2111;

    /* renamed from: ι, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2112;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2113;

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2114;

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2115;
    private boolean getOutputSizes;
    private util.h.xy.dh.rh getOutputSizeshNQ4ISI;
    private util.h.xy.dh.i getOutputStallDuration;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 19) % 128;
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
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 65) % 128;
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getInputFormats ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 35;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 85) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getInputSizeshNQ4ISI) {
            if (!getOutputMinFrameDuration) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 3) % 128;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 3) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr);
        f2094 = new util.h.xy.dh.i(((java.lang.String) objArr[0]).intern()).m26300();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("㇗\ue693ᮅ넟⻀\ue67aа\udec9⒣", (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-632633609) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\uf6f8䫆ꇚ追", "\u0000\u0000\u0000\u0000", objArr2);
        f2097 = new util.h.xy.dh.i(((java.lang.String) objArr2[0]).intern()).m26300();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0083\u0085\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr3);
        f2105 = new util.h.xy.dh.i(((java.lang.String) objArr3[0]).intern()).m26300();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("㎫駥歩㍜ğ\ua4cb\udb2c廘㆞", (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (-1777910734) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "㈱ܼ뎖⡃", "\u0000\u0000\u0000\u0000", objArr4);
        f2098 = new util.h.xy.dh.i(((java.lang.String) objArr4[0]).intern()).m26300();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("䗛괞ﰍ\ude2dﱘ뷲뛠釨牦", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1881265343) - android.view.View.getDefaultSize(0, 0), "䇎\ude2b뺏ᴏ", "\u0000\u0000\u0000\u0000", objArr5);
        f2093 = new util.h.xy.dh.i(((java.lang.String) objArr5[0]).intern()).m26300();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoSizes(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0086\u0085\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr6);
        f2086 = new util.h.xy.dh.i(((java.lang.String) objArr6[0]).intern()).m26300();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.text.TextUtils.indexOf("", "", 0), "\u0084\u0085\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr7);
        f2087 = new util.h.xy.dh.i(((java.lang.String) objArr7[0]).intern()).m26300();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\ue826\ued27ல闽褦꤯ꪖ릐\udb02", (char) android.text.TextUtils.getOffsetAfter("", 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 660958791, "䣅敮縧\uec8c", "\u0000\u0000\u0000\u0000", objArr8);
        f2112 = new util.h.xy.dh.i(((java.lang.String) objArr8[0]).intern()).m26300();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0085\u0081\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr9);
        f2088 = new util.h.xy.dh.i(((java.lang.String) objArr9[0]).intern()).m26300();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoSizes(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0087\u0081\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr10);
        f2100 = new util.h.xy.dh.i(((java.lang.String) objArr10[0]).intern()).m26300();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoSizes((-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0088\u0081\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr11);
        f2095 = new util.h.xy.dh.i(((java.lang.String) objArr11[0]).intern()).m26300();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("㪕뇾⓾\uefce硌ਖ਼\uf4d5粄吒", (char) android.view.View.getDefaultSize(0, 0), (-581310058) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "韑姩惝텚", "\u0000\u0000\u0000\u0000", objArr12);
        f2090 = new util.h.xy.dh.i(((java.lang.String) objArr12[0]).intern()).m26300();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("猾\udba7怉䁽瞾힀䈋╵跇", (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.red(0) - 965442833, "\uef1a璂㻆\uee4e", "\u0000\u0000\u0000\u0000", objArr13);
        f2089 = new util.h.xy.dh.i(((java.lang.String) objArr13[0]).intern()).m26300();
        try {
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u0084\u0081\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr14);
            f2091 = new util.h.xy.dh.i(((java.lang.String) objArr14[0]).intern()).m26300();
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0089\u0087\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr15);
            f2092 = new util.h.xy.dh.i(((java.lang.String) objArr15[0]).intern()).m26300();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoSizes((-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0085\u0087\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr16);
            f2103 = new util.h.xy.dh.i(((java.lang.String) objArr16[0]).intern()).m26300();
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("堜냫翐\u1ff1\u16fb㢓烒햀醻", (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 1881494483 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "펌╓끰社", "\u0000\u0000\u0000\u0000", objArr17);
            f2106 = new util.h.xy.dh.i(((java.lang.String) objArr17[0]).intern()).m26300();
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("퉳徻亁ፙ\udcc8\uf6db⪼ඏ印", (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-110163193) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "ࡿ漋燹줁", "\u0000\u0000\u0000\u0000", objArr18);
            f2099 = new util.h.xy.dh.i(((java.lang.String) objArr18[0]).intern()).m26300();
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0083\u0087\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr19);
            f2096 = new util.h.xy.dh.i(((java.lang.String) objArr19[0]).intern()).m26300();
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\uda0cḥ뛬⽙ﰎ醉篧ꝍ㠒", (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 373559808 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "º䐒\ue616\ua7cc", "\u0000\u0000\u0000\u0000", objArr20);
            f2107 = new util.h.xy.dh.i(((java.lang.String) objArr20[0]).intern()).m26300();
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ueb2d丧嘞ꡍԵ습뙢᧽곤", (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 814092337, "\u321f蘐ꤰ촳", "\u0000\u0000\u0000\u0000", objArr21);
            f2101 = new util.h.xy.dh.i(((java.lang.String) objArr21[0]).intern()).m26300();
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u008a\u0088\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr22);
            f2115 = new util.h.xy.dh.i(((java.lang.String) objArr22[0]).intern()).m26300();
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0088\u0083\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr23);
            f2085 = new util.h.xy.dh.i(((java.lang.String) objArr23[0]).intern()).m26300();
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("稡祿븮⸊泦\udb8f濭\u2069ഠ劈㟃開ŉ国䄯聰蕈", (char) (49158 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.graphics.ImageFormat.getBitsPerPixel(0) + 191700750, "෭洟܋췀", "\u0000\u0000\u0000\u0000", objArr24);
            f2102 = new util.h.xy.dh.i(((java.lang.String) objArr24[0]).intern()).m26300();
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ueda6\ue70aﱌ鮂꓿ٺ䃰\uee8b궭Ẓ憓뜹ݩ\uf548ๅฉ푞\ue1dc", (char) (24514 - android.view.View.resolveSize(0, 0)), android.view.KeyEvent.getDeadChar(0, 0), "遦褂슒ꉟ", "\u0000\u0000\u0000\u0000", objArr25);
            f2113 = new util.h.xy.dh.i(((java.lang.String) objArr25[0]).intern()).m26300();
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("퇮ࡡ垻绑⽧ᵠ᱂元ᒙ\uf056쾄\uf254य़\ud962㸮ꯂ䎼鎷", (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43929), android.graphics.Color.alpha(0), "\ue583缷駬ꮫ", "\u0000\u0000\u0000\u0000", objArr26);
            f2108 = new util.h.xy.dh.i(((java.lang.String) objArr26[0]).intern()).m26300();
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("穵됙賭㢶\ue376刱\uf838蛍\uf151夣⪬੯蹋잾陾㷆㙣", (char) (android.view.View.combineMeasuredStates(0, 0) + 63023), android.view.KeyEvent.keyCodeFromString("") - 1787839442, "\u2ef8澼⾕㗶", "\u0000\u0000\u0000\u0000", objArr27);
            f2104 = new util.h.xy.dh.i(((java.lang.String) objArr27[0]).intern()).m26300();
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("퓼ꗤ\udbc3འ\ud826❃ﴥ卑\ueb90ꖳ鿍鵊衃̰뼺\udac6鹄", (char) (42573 - android.view.KeyEvent.keyCodeFromString("")), 427329301 - android.view.MotionEvent.axisFromString(""), "ᛖ碇䴙삦", "\u0000\u0000\u0000\u0000", objArr28);
            f2110 = new util.h.xy.dh.i(((java.lang.String) objArr28[0]).intern()).m26300();
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("溧蟿\ue702겘\ue93e\ueb22\ue8f5閫ᙃ腦鼵\ufaff\u0cbb숞\ueccf楠\ue0f0", (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9036), 926752161 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "ꇨ㴝䴷ਣ", "\u0000\u0000\u0000\u0000", objArr29);
            f2109 = new util.h.xy.dh.i(((java.lang.String) objArr29[0]).intern()).m26300();
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u008a\u0083\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr30);
            f2111 = new util.h.xy.dh.i(((java.lang.String) objArr30[0]).intern()).m26300();
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.MeasureSpec.getSize(0) + 127, "\u0083\u0083\u0082\u0084\u0081\u0082\u0083\u0082\u0081", objArr31);
            f2084 = new util.h.xy.dh.i(((java.lang.String) objArr31[0]).intern()).m26300();
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("遺綖\udce3雄⤍纭錗挀훪", (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 1524828792 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "礂\ue30a걚恸", "\u0000\u0000\u0000\u0000", objArr32);
            f2114 = new util.h.xy.dh.i(((java.lang.String) objArr32[0]).intern()).m26300();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(3);
        dVar.m26290(this.getOutputStallDuration);
        if (this.getOutputSizes) {
            getOutputStallDurationlomOqCM = (getOutputFormats + 29) % 128;
            dVar.m26290(util.h.xy.dh.rb.m26333(true));
        }
        dVar.m26290(this.getOutputSizeshNQ4ISI);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getOutputStallDurationlomOqCM + 71;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mh
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof util.h.xy.ed.ma) {
            util.h.xy.ed.ma maVar = (util.h.xy.ed.ma) obj;
            if (maVar.m26507().m26325(m26507()) && maVar.m26509().m26325(m26509()) && maVar.m26508() == m26508()) {
                int i = getOutputStallDurationlomOqCM + 13;
                getOutputFormats = i % 128;
                return i % 2 == 0;
            }
            getOutputFormats = (getOutputStallDurationlomOqCM + 99) % 128;
        } else {
            getOutputStallDurationlomOqCM = (getOutputFormats + 93) % 128;
        }
        return false;
    }

    @Override // util.h.xy.dh.mh
    public final int hashCode() {
        int i = getOutputStallDurationlomOqCM + 119;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            m26508();
            throw new java.lang.ArithmeticException();
        }
        if (!m26508()) {
            return ~(m26509().hashCode() ^ m26507().hashCode());
        }
        int hashCode = m26509().hashCode();
        int hashCode2 = m26507().hashCode();
        int i2 = getOutputStallDurationlomOqCM + 79;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return hashCode ^ hashCode2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.rh m26509() {
        int i = getOutputFormats + 93;
        int i2 = i % 128;
        getOutputStallDurationlomOqCM = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.rh rhVar = this.getOutputSizeshNQ4ISI;
        getOutputStallDurationlomOqCM = i2;
        return rhVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26508() {
        int i = (getOutputFormats + 67) % 128;
        getOutputStallDurationlomOqCM = i;
        boolean z = this.getOutputSizes;
        getOutputFormats = (i + 93) % 128;
        return z;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.i m26507() {
        int i = (getOutputFormats + 35) % 128;
        getOutputStallDurationlomOqCM = i;
        util.h.xy.dh.i iVar = this.getOutputStallDuration;
        int i2 = i + 11;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return iVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ed.ma m26506(java.lang.Object obj) {
        int i = getOutputStallDurationlomOqCM + 121;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj instanceof util.h.xy.ed.ma) {
            util.h.xy.ed.ma maVar = (util.h.xy.ed.ma) obj;
            getOutputStallDurationlomOqCM = (i2 + 77) % 128;
            return maVar;
        }
        if (obj != null) {
            return new util.h.xy.ed.ma(util.h.xy.dh.l.m26303(obj));
        }
        int i3 = i2 + 113;
        getOutputStallDurationlomOqCM = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private ma(util.h.xy.dh.l lVar) {
        util.h.xy.dh.c mo26287;
        if (lVar.mo26286() == 2) {
            this.getOutputStallDuration = util.h.xy.dh.i.m26297(lVar.mo26287(0));
            this.getOutputSizes = false;
            mo26287 = lVar.mo26287(1);
        } else {
            if (lVar.mo26286() != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ᨆ쀰ឩช鶘陳ৈ跙\uf7e1\ud9c2姐珹弢耣꽭䡆疸ܰ樟", (char) (android.graphics.Color.blue(0) + 65240), 1131055380 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "ᑖ檉\ud843᯾", "\u0000\u0000\u0000\u0000", objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(lVar.mo26286());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getOutputStallDuration = util.h.xy.dh.i.m26297(lVar.mo26287(0));
            this.getOutputSizes = util.h.xy.dh.rb.m26332(lVar.mo26287(1)).m26334();
            mo26287 = lVar.mo26287(2);
        }
        this.getOutputSizeshNQ4ISI = util.h.xy.dh.rh.m26335(mo26287);
    }

    public ma(util.h.xy.dh.i iVar, boolean z, util.h.xy.dh.rh rhVar) {
        this.getOutputStallDuration = iVar;
        this.getOutputSizes = z;
        this.getOutputSizeshNQ4ISI = rhVar;
    }

    public ma(util.h.xy.dh.i iVar, boolean z, byte[] bArr) {
        this(iVar, z, new util.h.xy.dh.mz(util.h.xy.fb.a.m26821(bArr)));
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = 2457411417541981002L;
        Camera2StreamConfigurationMap = 665061244;
        getInputFormats = (char) 13130;
        getHighSpeedVideoSizesFor = new char[]{64160, 64164, 64173, 64169, 64161, 64174, 64163, 64162, 64166, 64172};
        getHighResolutionOutputSizeshNQ4ISI = -1074857258;
        getOutputMinFrameDuration = true;
        getInputSizeshNQ4ISI = true;
    }
}
