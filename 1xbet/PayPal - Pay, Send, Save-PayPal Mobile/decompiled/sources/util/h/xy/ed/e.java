package util.h.xy.ed;

/* loaded from: classes18.dex */
public class e extends util.h.xy.dh.mh {
    private static char[] Camera2StreamConfigurationMap = null;
    private static final java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static long getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static final java.lang.Boolean getOutputFormats;

    /* renamed from: ʳ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2042;

    /* renamed from: ʴ, reason: contains not printable characters */
    public static final java.util.Hashtable f2043;

    /* renamed from: ʹ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2044;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2045;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2046;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2047;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2048;

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2049;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final java.util.Hashtable f2050;

    /* renamed from: ˇ, reason: contains not printable characters */
    public static final java.util.Hashtable f2051;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2052;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2053;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2054;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2055;

    /* renamed from: ˌ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2056;

    /* renamed from: ˍ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2057;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2058;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2059;

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2060;

    /* renamed from: ˡ, reason: contains not printable characters */
    public static boolean f2061 = false;

    /* renamed from: ˮ, reason: contains not printable characters */
    public static final java.util.Hashtable f2062;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2063;

    /* renamed from: ՙ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2064;

    /* renamed from: י, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2065;

    /* renamed from: ـ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2066;

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2067;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2068;

    /* renamed from: ᐣ, reason: contains not printable characters */
    public static final java.util.Hashtable f2069;

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2070;

    /* renamed from: ᐨ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2071;

    /* renamed from: ᐩ, reason: contains not printable characters */
    public static final java.util.Hashtable f2072;

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2073;

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2074;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2075;

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2076;

    /* renamed from: ι, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2077;

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2078;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2079;

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2080;

    /* renamed from: ﹺ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2081;

    /* renamed from: ｰ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2082;

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f2083;
    private int getOutputMinFrameDuration;
    private boolean getOutputSizeshNQ4ISI;
    private util.h.xy.dh.l getOutputStallDuration;
    private util.h.xy.ed.me getHighSpeedVideoSizesFor = null;
    private java.util.Vector getOutputSizes = new java.util.Vector();
    private java.util.Vector getOutputMinFrameDurationlomOqCM = new java.util.Vector();
    private java.util.Vector getOutputStallDurationlomOqCM = new java.util.Vector();

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 99) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 81) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
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

    static {
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(6 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 67 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "", 0) + 26111), objArr);
        util.h.xy.dh.i iVar = new util.h.xy.dh.i(((java.lang.String) objArr[0]).intern());
        f2054 = iVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.View.resolveSizeAndState(0, 0, 0) + 8, 73 - android.view.View.getDefaultSize(0, 0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
        util.h.xy.dh.i iVar2 = new util.h.xy.dh.i(((java.lang.String) objArr2[0]).intern());
        f2059 = iVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 8, 81 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
        util.h.xy.dh.i iVar3 = new util.h.xy.dh.i(((java.lang.String) objArr3[0]).intern());
        f2058 = iVar3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getTouchSlop() >> 8) + 8, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 89, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 882), objArr4);
        util.h.xy.dh.i iVar4 = new util.h.xy.dh.i(((java.lang.String) objArr4[0]).intern());
        f2068 = iVar4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 8, android.graphics.Color.blue(0) + 97, (char) (15236 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr5);
        util.h.xy.dh.i iVar5 = new util.h.xy.dh.i(((java.lang.String) objArr5[0]).intern());
        f2055 = iVar5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoSizes(7 - android.text.TextUtils.getCapsMode("", 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 104, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12158), objArr6);
        util.h.xy.dh.i iVar6 = new util.h.xy.dh.i(((java.lang.String) objArr6[0]).intern());
        f2077 = iVar6;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.graphics.Color.green(0) + 7, 111 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
        util.h.xy.dh.i iVar7 = new util.h.xy.dh.i(((java.lang.String) objArr7[0]).intern());
        f2046 = iVar7;
        f2047 = iVar6;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoSizes(7 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 118 - android.text.TextUtils.getOffsetBefore("", 0), (char) android.view.KeyEvent.keyCodeFromString(""), objArr8);
        util.h.xy.dh.i iVar8 = new util.h.xy.dh.i(((java.lang.String) objArr8[0]).intern());
        f2063 = iVar8;
        try {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 125, (char) (android.graphics.Color.green(0) + 58440), objArr9);
            util.h.xy.dh.i iVar9 = new util.h.xy.dh.i(((java.lang.String) objArr9[0]).intern());
            f2045 = iVar9;
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 133 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.view.KeyEvent.normalizeMetaState(0), objArr10);
            util.h.xy.dh.i iVar10 = new util.h.xy.dh.i(((java.lang.String) objArr10[0]).intern());
            f2048 = iVar10;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - android.view.View.getDefaultSize(0, 0), 140 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
            util.h.xy.dh.i iVar11 = new util.h.xy.dh.i(((java.lang.String) objArr11[0]).intern());
            f2053 = iVar11;
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 8, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 147, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr12);
            util.h.xy.dh.i iVar12 = new util.h.xy.dh.i(((java.lang.String) objArr12[0]).intern());
            f2049 = iVar12;
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 8, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 156, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
            util.h.xy.dh.i iVar13 = new util.h.xy.dh.i(((java.lang.String) objArr13[0]).intern());
            f2056 = iVar13;
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes(9 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 163, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr14);
            util.h.xy.dh.i iVar14 = new util.h.xy.dh.i(((java.lang.String) objArr14[0]).intern());
            f2052 = iVar14;
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - android.view.KeyEvent.getDeadChar(0, 0), 171 - android.view.View.MeasureSpec.getMode(0), (char) (14293 - android.graphics.Color.blue(0)), objArr15);
            util.h.xy.dh.i iVar15 = new util.h.xy.dh.i(((java.lang.String) objArr15[0]).intern());
            f2060 = iVar15;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 179, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
            util.h.xy.dh.i iVar16 = new util.h.xy.dh.i(((java.lang.String) objArr16[0]).intern());
            f2066 = iVar16;
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - android.text.TextUtils.getOffsetAfter("", 0), 187 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr17);
            util.h.xy.dh.i iVar17 = new util.h.xy.dh.i(((java.lang.String) objArr17[0]).intern());
            f2071 = iVar17;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr18);
            util.h.xy.dh.i iVar18 = new util.h.xy.dh.i(((java.lang.String) objArr18[0]).intern());
            f2070 = iVar18;
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoSizes(18 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 203, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20315), objArr19);
            util.h.xy.dh.i iVar19 = new util.h.xy.dh.i(((java.lang.String) objArr19[0]).intern());
            f2057 = iVar19;
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoSizes((intValue >> 22) + 17, android.widget.ExpandableListView.getPackedPositionChild(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23739), objArr20);
            util.h.xy.dh.i iVar20 = new util.h.xy.dh.i(((java.lang.String) objArr20[0]).intern());
            f2065 = iVar20;
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoSizes(17 - android.view.KeyEvent.getDeadChar(0, 0), 238 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0), objArr21);
            util.h.xy.dh.i iVar21 = new util.h.xy.dh.i(((java.lang.String) objArr21[0]).intern());
            f2083 = iVar21;
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoSizes(16 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 254 - android.text.TextUtils.indexOf("", ""), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40029), objArr22);
            util.h.xy.dh.i iVar22 = new util.h.xy.dh.i(((java.lang.String) objArr22[0]).intern());
            f2044 = iVar22;
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoSizes(17 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 271 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22167), objArr23);
            util.h.xy.dh.i iVar23 = new util.h.xy.dh.i(((java.lang.String) objArr23[0]).intern());
            f2079 = iVar23;
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 14, 288 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr24);
            util.h.xy.dh.i iVar24 = new util.h.xy.dh.i(((java.lang.String) objArr24[0]).intern());
            f2064 = iVar24;
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 300 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 22279), objArr25);
            util.h.xy.dh.i iVar25 = new util.h.xy.dh.i(((java.lang.String) objArr25[0]).intern());
            f2074 = iVar25;
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.KeyEvent.getDeadChar(0, 0) + 8, android.graphics.ImageFormat.getBitsPerPixel(0) + 310, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 57070), objArr26);
            f2067 = new util.h.xy.dh.i(((java.lang.String) objArr26[0]).intern());
            util.h.xy.dh.i iVar26 = util.h.xy.ed.md.f2138;
            f2076 = iVar26;
            util.h.xy.dh.i iVar27 = util.h.xy.ed.md.f2119;
            f2075 = iVar27;
            util.h.xy.dh.i iVar28 = util.h.xy.du.ra.f1646;
            f2073 = iVar28;
            util.h.xy.dh.i iVar29 = util.h.xy.du.ra.f1653;
            f2078 = iVar29;
            util.h.xy.dh.i iVar30 = util.h.xy.du.ra.f1684;
            f2042 = iVar30;
            f2081 = iVar28;
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 27, 317 - android.view.View.resolveSize(0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
            util.h.xy.dh.i iVar31 = new util.h.xy.dh.i(((java.lang.String) objArr27[0]).intern());
            f2082 = iVar31;
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoSizes(26 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.visa.cbp.getCertUsage.isReperso, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11063), objArr28);
            util.h.xy.dh.i iVar32 = new util.h.xy.dh.i(((java.lang.String) objArr28[0]).intern());
            f2080 = iVar32;
            f2061 = false;
            java.util.Hashtable hashtable = new java.util.Hashtable();
            f2051 = hashtable;
            java.util.Hashtable hashtable2 = new java.util.Hashtable();
            f2043 = hashtable2;
            java.util.Hashtable hashtable3 = new java.util.Hashtable();
            f2062 = hashtable3;
            java.util.Hashtable hashtable4 = new java.util.Hashtable();
            f2050 = hashtable4;
            f2069 = hashtable;
            f2072 = hashtable4;
            getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.TRUE;
            getOutputFormats = java.lang.Boolean.FALSE;
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 368, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64508), objArr29);
            hashtable.put(iVar, ((java.lang.String) objArr29[0]).intern());
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 369 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22985), objArr30);
            hashtable.put(iVar2, ((java.lang.String) objArr30[0]).intern());
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - android.graphics.Color.blue(0), 370 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr31);
            hashtable.put(iVar4, ((java.lang.String) objArr31[0]).intern());
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, (-16776845) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr32);
            hashtable.put(iVar3, ((java.lang.String) objArr32[0]).intern());
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - android.view.View.resolveSize(0, 0), 373 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5096), objArr33);
            hashtable.put(iVar5, ((java.lang.String) objArr33[0]).intern());
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 376, (char) (android.view.View.resolveSize(0, 0) + 7408), objArr34);
            hashtable.put(iVar8, ((java.lang.String) objArr34[0]).intern());
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) + 2, android.view.View.resolveSize(0, 0) + 376, (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr35);
            hashtable.put(iVar9, ((java.lang.String) objArr35[0]).intern());
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.KeyEvent.normalizeMetaState(0) + 12, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 378, (char) (11737 - android.graphics.Color.blue(0)), objArr36);
            hashtable.put(iVar6, ((java.lang.String) objArr36[0]).intern());
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 390 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 49600), objArr37);
            hashtable.put(iVar28, ((java.lang.String) objArr37[0]).intern());
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 391 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr38);
            hashtable.put(iVar31, ((java.lang.String) objArr38[0]).intern());
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            getHighSpeedVideoSizes(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 3, 392 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) android.view.View.getDefaultSize(0, 0), objArr39);
            hashtable.put(iVar32, ((java.lang.String) objArr39[0]).intern());
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.view.KeyEvent.normalizeMetaState(0), 396 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr40);
            hashtable.put(iVar7, ((java.lang.String) objArr40[0]).intern());
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.KeyEvent.keyCodeFromString("") + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY, (char) (android.view.View.resolveSize(0, 0) + 26942), objArr41);
            hashtable.put(iVar10, ((java.lang.String) objArr41[0]).intern());
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 9, android.graphics.Color.rgb(0, 0, 0) + 16777625, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 56869), objArr42);
            hashtable.put(iVar11, ((java.lang.String) objArr42[0]).intern());
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 418 - android.graphics.Color.alpha(0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr43);
            hashtable.put(iVar12, ((java.lang.String) objArr43[0]).intern());
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            getHighSpeedVideoSizes(9 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 426, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr44);
            hashtable.put(iVar13, ((java.lang.String) objArr44[0]).intern());
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 436, (char) (android.view.KeyEvent.keyCodeFromString("") + 50297), objArr45);
            hashtable.put(iVar30, ((java.lang.String) objArr45[0]).intern());
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            getHighSpeedVideoSizes(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 17, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 455, (char) (23426 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr46);
            hashtable.put(iVar29, ((java.lang.String) objArr46[0]).intern());
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 17, 471 - android.graphics.Color.argb(0, 0, 0, 0), (char) (7322 - android.view.View.combineMeasuredStates(0, 0)), objArr47);
            hashtable.put(iVar14, ((java.lang.String) objArr47[0]).intern());
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, 487 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (38376 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr48);
            hashtable.put(iVar17, ((java.lang.String) objArr48[0]).intern());
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 9, 489 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr49);
            hashtable.put(iVar18, ((java.lang.String) objArr49[0]).intern());
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            getHighSpeedVideoSizes(12 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 497, (char) (40020 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr50);
            hashtable.put(iVar25, ((java.lang.String) objArr50[0]).intern());
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 512, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr51);
            hashtable.put(iVar24, ((java.lang.String) objArr51[0]).intern());
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            getHighSpeedVideoSizes(20 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr52);
            hashtable.put(iVar22, ((java.lang.String) objArr52[0]).intern());
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            getHighSpeedVideoSizes(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 18, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 542, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr53);
            hashtable.put(iVar23, ((java.lang.String) objArr53[0]).intern());
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.text.TextUtils.indexOf("", "", 0, 0), 560 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr54);
            hashtable.put(iVar21, ((java.lang.String) objArr54[0]).intern());
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            getHighSpeedVideoSizes(11 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 566 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (1770 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr55);
            hashtable.put(iVar20, ((java.lang.String) objArr55[0]).intern());
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            getHighSpeedVideoSizes(10 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 578 - android.text.TextUtils.indexOf("", ""), (char) (android.view.KeyEvent.normalizeMetaState(0) + 27100), objArr56);
            hashtable.put(iVar19, ((java.lang.String) objArr56[0]).intern());
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            getHighSpeedVideoSizes((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 9, 588 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.View.getDefaultSize(0, 0) + 64240), objArr57);
            hashtable.put(iVar16, ((java.lang.String) objArr57[0]).intern());
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            getHighSpeedVideoSizes(17 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 599, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr58);
            hashtable.put(iVar15, ((java.lang.String) objArr58[0]).intern());
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, android.graphics.Color.alpha(0) + 615, (char) (6820 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr59);
            hashtable.put(iVar26, ((java.lang.String) objArr59[0]).intern());
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            getHighSpeedVideoSizes(3 - android.graphics.ImageFormat.getBitsPerPixel(0), 631 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr60);
            hashtable.put(iVar27, ((java.lang.String) objArr60[0]).intern());
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 368 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 64508), objArr61);
            hashtable2.put(iVar, ((java.lang.String) objArr61[0]).intern());
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - android.view.View.MeasureSpec.getSize(0), 368 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.graphics.Color.alpha(0) + 22986), objArr62);
            hashtable2.put(iVar2, ((java.lang.String) objArr62[0]).intern());
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            getHighSpeedVideoSizes(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 3, 371 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr63);
            hashtable2.put(iVar3, ((java.lang.String) objArr63[0]).intern());
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2, android.view.View.getDefaultSize(0, 0) + 373, (char) (5096 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr64);
            hashtable2.put(iVar5, ((java.lang.String) objArr64[0]).intern());
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 375 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (7409 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr65);
            hashtable2.put(iVar8, ((java.lang.String) objArr65[0]).intern());
            java.lang.Object[] objArr66 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2, 376 - android.text.TextUtils.getTrimmedLength(""), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr66);
            hashtable2.put(iVar9, ((java.lang.String) objArr66[0]).intern());
            java.lang.Object[] objArr67 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) + 6, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 396, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr67);
            hashtable2.put(iVar7, ((java.lang.String) objArr67[0]).intern());
            java.lang.Object[] objArr68 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 391, (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr68);
            hashtable2.put(iVar31, ((java.lang.String) objArr68[0]).intern());
            java.lang.Object[] objArr69 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, 393 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr69);
            hashtable2.put(iVar32, ((java.lang.String) objArr69[0]).intern());
            java.lang.Object[] objArr70 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "") + 1, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 369, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 64508), objArr70);
            hashtable3.put(iVar, ((java.lang.String) objArr70[0]).intern());
            java.lang.Object[] objArr71 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getCapsMode("", 0, 0) + 1, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 368, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22986), objArr71);
            hashtable3.put(iVar2, ((java.lang.String) objArr71[0]).intern());
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getOffsetBefore("", 0) + 2, 371 - android.text.TextUtils.indexOf("", "", 0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr72);
            hashtable3.put(iVar3, ((java.lang.String) objArr72[0]).intern());
            java.lang.Object[] objArr73 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 373 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 5096), objArr73);
            hashtable3.put(iVar5, ((java.lang.String) objArr73[0]).intern());
            java.lang.Object[] objArr74 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - android.view.View.MeasureSpec.getSize(0), 375 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (7408 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr74);
            hashtable3.put(iVar8, ((java.lang.String) objArr74[0]).intern());
            java.lang.Object[] objArr75 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 376, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr75);
            hashtable3.put(iVar9, ((java.lang.String) objArr75[0]).intern());
            java.lang.Object[] objArr76 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 396 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr76);
            hashtable3.put(iVar7, ((java.lang.String) objArr76[0]).intern());
            java.lang.Object[] objArr77 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 633 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 12370), objArr77);
            hashtable4.put(((java.lang.String) objArr77[0]).intern(), iVar);
            java.lang.Object[] objArr78 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 634 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 57366), objArr78);
            hashtable4.put(((java.lang.String) objArr78[0]).intern(), iVar2);
            java.lang.Object[] objArr79 = new java.lang.Object[1];
            getHighSpeedVideoSizes(-((byte) android.view.KeyEvent.getModifierMetaStateMask()), 635 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14270 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr79);
            hashtable4.put(((java.lang.String) objArr79[0]).intern(), iVar4);
            java.lang.Object[] objArr80 = new java.lang.Object[1];
            getHighSpeedVideoSizes(3 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 637 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 38839), objArr80);
            hashtable4.put(((java.lang.String) objArr80[0]).intern(), iVar3);
            java.lang.Object[] objArr81 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2, 639 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr81);
            hashtable4.put(((java.lang.String) objArr81[0]).intern(), iVar5);
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 642 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr82);
            hashtable4.put(((java.lang.String) objArr82[0]).intern(), iVar8);
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 3, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 641, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr83);
            hashtable4.put(((java.lang.String) objArr83[0]).intern(), iVar9);
            java.lang.Object[] objArr84 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 643 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.combineMeasuredStates(0, 0), objArr84);
            hashtable4.put(((java.lang.String) objArr84[0]).intern(), iVar6);
            java.lang.Object[] objArr85 = new java.lang.Object[1];
            getHighSpeedVideoSizes(13 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 647, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40455), objArr85);
            hashtable4.put(((java.lang.String) objArr85[0]).intern(), iVar6);
            java.lang.Object[] objArr86 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 658 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr86);
            hashtable4.put(((java.lang.String) objArr86[0]).intern(), iVar7);
            java.lang.Object[] objArr87 = new java.lang.Object[1];
            getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 663, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 33075), objArr87);
            hashtable4.put(((java.lang.String) objArr87[0]).intern(), iVar28);
            java.lang.Object[] objArr88 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 676 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.text.TextUtils.indexOf("", "", 0), objArr88);
            hashtable4.put(((java.lang.String) objArr88[0]).intern(), iVar31);
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            getHighSpeedVideoSizes(1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 678 - android.view.KeyEvent.keyCodeFromString(""), (char) (13546 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr89);
            hashtable4.put(((java.lang.String) objArr89[0]).intern(), iVar28);
            java.lang.Object[] objArr90 = new java.lang.Object[1];
            getHighSpeedVideoSizes(3 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 679, (char) (android.graphics.Color.blue(0) + 28410), objArr90);
            hashtable4.put(((java.lang.String) objArr90[0]).intern(), iVar32);
            java.lang.Object[] objArr91 = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - android.view.View.MeasureSpec.getMode(0), 682 - android.view.View.resolveSize(0, 0), (char) (android.graphics.Color.blue(0) + 54489), objArr91);
            hashtable4.put(((java.lang.String) objArr91[0]).intern(), iVar10);
            java.lang.Object[] objArr92 = new java.lang.Object[1];
            getHighSpeedVideoSizes(9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 688, (char) (44239 - android.view.MotionEvent.axisFromString("")), objArr92);
            hashtable4.put(((java.lang.String) objArr92[0]).intern(), iVar11);
            java.lang.Object[] objArr93 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - android.text.TextUtils.indexOf("", ""), android.graphics.Color.green(0) + 698, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr93);
            hashtable4.put(((java.lang.String) objArr93[0]).intern(), iVar12);
            java.lang.Object[] objArr94 = new java.lang.Object[1];
            getHighSpeedVideoSizes(10 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 706 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr94);
            hashtable4.put(((java.lang.String) objArr94[0]).intern(), iVar13);
            java.lang.Object[] objArr95 = new java.lang.Object[1];
            getHighSpeedVideoSizes(19 - android.view.View.getDefaultSize(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 715, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr95);
            hashtable4.put(((java.lang.String) objArr95[0]).intern(), iVar30);
            java.lang.Object[] objArr96 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, 735 - android.graphics.Color.blue(0), (char) android.text.TextUtils.indexOf("", ""), objArr96);
            hashtable4.put(((java.lang.String) objArr96[0]).intern(), iVar29);
            java.lang.Object[] objArr97 = new java.lang.Object[1];
            getHighSpeedVideoSizes(15 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 751 - android.graphics.Color.blue(0), (char) (48639 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr97);
            hashtable4.put(((java.lang.String) objArr97[0]).intern(), iVar14);
            java.lang.Object[] objArr98 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "") + 2, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 767, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr98);
            hashtable4.put(((java.lang.String) objArr98[0]).intern(), iVar17);
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_USER_ID, (char) (29320 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr99);
            hashtable4.put(((java.lang.String) objArr99[0]).intern(), iVar18);
            java.lang.Object[] objArr100 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 13, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 778, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 55092), objArr100);
            hashtable4.put(((java.lang.String) objArr100[0]).intern(), iVar25);
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            getHighSpeedVideoSizes(11 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 791, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1303), objArr101);
            hashtable4.put(((java.lang.String) objArr101[0]).intern(), iVar24);
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            getHighSpeedVideoSizes(20 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 802 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr102);
            hashtable4.put(((java.lang.String) objArr102[0]).intern(), iVar22);
            java.lang.Object[] objArr103 = new java.lang.Object[1];
            getHighSpeedVideoSizes(19 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 822 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13558), objArr103);
            hashtable4.put(((java.lang.String) objArr103[0]).intern(), iVar23);
            java.lang.Object[] objArr104 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 840 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.MeasureSpec.getSize(0), objArr104);
            hashtable4.put(((java.lang.String) objArr104[0]).intern(), iVar21);
            java.lang.Object[] objArr105 = new java.lang.Object[1];
            getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 847 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (7690 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr105);
            hashtable4.put(((java.lang.String) objArr105[0]).intern(), iVar20);
            java.lang.Object[] objArr106 = new java.lang.Object[1];
            getHighSpeedVideoSizes(11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 859 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0), objArr106);
            hashtable4.put(((java.lang.String) objArr106[0]).intern(), iVar19);
            java.lang.Object[] objArr107 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.getDefaultSize(0, 0) + 10, 869 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15239), objArr107);
            hashtable4.put(((java.lang.String) objArr107[0]).intern(), iVar16);
            java.lang.Object[] objArr108 = new java.lang.Object[1];
            getHighSpeedVideoSizes(15 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.KeyEvent.normalizeMetaState(0) + 879, (char) (7845 - android.graphics.Color.alpha(0)), objArr108);
            hashtable4.put(((java.lang.String) objArr108[0]).intern(), iVar15);
            java.lang.Object[] objArr109 = new java.lang.Object[1];
            getHighSpeedVideoSizes(15 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.View.MeasureSpec.getSize(0) + 895, (char) (43930 - android.graphics.Color.green(0)), objArr109);
            hashtable4.put(((java.lang.String) objArr109[0]).intern(), iVar26);
            java.lang.Object[] objArr110 = new java.lang.Object[1];
            getHighSpeedVideoSizes(4 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 910, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr110);
            hashtable4.put(((java.lang.String) objArr110[0]).intern(), iVar27);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public java.lang.String toString() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 59) % 128;
        java.lang.String m26505 = m26505(f2061, f2051);
        int i = getHighSpeedVideoSizes + 19;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m26505;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public java.lang.String m26505(boolean z, java.util.Hashtable hashtable) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Vector vector = new java.util.Vector();
        java.lang.StringBuffer stringBuffer2 = null;
        for (int i = 0; i < this.getOutputSizes.size(); i++) {
            if (((java.lang.Boolean) this.getOutputStallDurationlomOqCM.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                Camera2StreamConfigurationMap(stringBuffer2, hashtable, (util.h.xy.dh.i) this.getOutputSizes.elementAt(i), (java.lang.String) this.getOutputMinFrameDurationlomOqCM.elementAt(i));
            } else {
                stringBuffer2 = new java.lang.StringBuffer();
                Camera2StreamConfigurationMap(stringBuffer2, hashtable, (util.h.xy.dh.i) this.getOutputSizes.elementAt(i), (java.lang.String) this.getOutputMinFrameDurationlomOqCM.elementAt(i));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z2 = true;
        if (z) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                int i3 = getHighSpeedVideoSizes + 109;
                getInputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(vector.elementAt(i2).toString());
            }
        }
        java.lang.String obj = stringBuffer.toString();
        int i4 = getHighSpeedVideoSizes + 119;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void Camera2StreamConfigurationMap(java.lang.StringBuffer stringBuffer, java.util.Hashtable hashtable, util.h.xy.dh.i iVar, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) hashtable.get(iVar);
        if (str2 != null) {
            int i = getHighSpeedVideoSizes + 55;
            getInputSizeshNQ4ISI = i % 128;
            stringBuffer.append(str2);
            if (i % 2 != 0) {
                throw null;
            }
        } else {
            stringBuffer.append(iVar.m26298());
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            int i2 = getHighSpeedVideoSizes + 29;
            getInputSizeshNQ4ISI = i2 % 128;
            length = i2 % 2 != 0 ? length + 100 : length + 2;
        }
        while (length < length2) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 111) % 128;
            if (stringBuffer.charAt(length) != ' ') {
                break;
            }
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 9) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 16, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14825), objArr);
            stringBuffer.insert(length, ((java.lang.String) objArr[0]).intern());
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            }
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 105) % 128;
            stringBuffer.insert(length2, '\\');
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        continue;
                }
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 1, android.widget.ExpandableListView.getPackedPositionChild(0L) + 17, (char) (android.graphics.Color.green(0) + 14825), objArr2);
            stringBuffer.insert(length, ((java.lang.String) objArr2[0]).intern());
            length += 2;
            length2++;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 97) % 128;
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt == ' ') {
                    int i2 = getHighSpeedVideoSizes + 109;
                    getInputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (charAt2 == '}') {
                        }
                    } else if (charAt2 == ' ') {
                    }
                    i++;
                    charAt = charAt2;
                }
                stringBuffer.append(charAt2);
                i++;
                charAt = charAt2;
            }
        }
        java.lang.String obj = stringBuffer.toString();
        int i3 = getInputSizeshNQ4ISI + 87;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    private static util.h.xy.dh.mi getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 93;
        getInputSizeshNQ4ISI = i % 128;
        try {
            return i % 2 != 0 ? util.h.xy.dh.mi.m26324(util.h.xy.fa.d.m26804(str, 0, str.length())) : util.h.xy.dh.mi.m26324(util.h.xy.fa.d.m26804(str, 1, str.length() - 1));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(26 - android.graphics.Color.blue(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 51) % 128;
        java.lang.String m26857 = util.h.xy.fb.rd.m26857(str.trim());
        if (m26857.length() <= 0 || m26857.charAt(0) != '#') {
            return m26857;
        }
        util.h.xy.dh.c highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(m26857);
        if (!(highResolutionOutputSizeshNQ4ISI instanceof util.h.xy.dh.m)) {
            return m26857;
        }
        int i = getHighSpeedVideoSizes + 117;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.m mVar = (util.h.xy.dh.m) highResolutionOutputSizeshNQ4ISI;
        if (i % 2 == 0) {
            return util.h.xy.fb.rd.m26857(mVar.mo26276().trim());
        }
        util.h.xy.fb.rd.m26857(mVar.mo26276().trim());
        throw new java.lang.ArithmeticException();
    }

    private boolean Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 47) % 128;
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str2);
        if (highSpeedVideoFpsRanges.equals(highSpeedVideoFpsRanges2)) {
            return true;
        }
        int i = getInputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i % 128;
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
        java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges2);
        if (i % 2 != 0) {
            return highSpeedVideoSizes.equals(highSpeedVideoSizes2);
        }
        highSpeedVideoSizes.equals(highSpeedVideoSizes2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        r0[r9] = true;
        r4 = r4 + r6;
     */
    @Override // util.h.xy.dh.mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i4 + 17) % 128;
        if (obj == this) {
            int i5 = i4 + 13;
            getInputSizeshNQ4ISI = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof util.h.xy.ed.e)) {
            getInputSizeshNQ4ISI = (i4 + 107) % 128;
            if (!(obj instanceof util.h.xy.dh.l)) {
                return false;
            }
        }
        if (mo26279().m26325(((util.h.xy.dh.c) obj).mo26279())) {
            return true;
        }
        try {
            util.h.xy.ed.e m26504 = m26504(obj);
            int i6 = (getHighSpeedVideoSizes + 53) % 128;
            getInputSizeshNQ4ISI = i6;
            int i7 = i6 + 121;
            getHighSpeedVideoSizes = i7 % 128;
            int size = this.getOutputSizes.size();
            if (i7 % 2 == 0) {
                m26504.getOutputSizes.size();
                throw new java.lang.ArithmeticException();
            }
            if (size != m26504.getOutputSizes.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            if (this.getOutputSizes.elementAt(0).equals(m26504.getOutputSizes.elementAt(0))) {
                i3 = 1;
                i = 0;
                i2 = size;
            } else {
                i = size - 1;
                i2 = -1;
                i3 = -1;
            }
            while (i != i2) {
                util.h.xy.dh.i iVar = (util.h.xy.dh.i) this.getOutputSizes.elementAt(i);
                java.lang.String str = (java.lang.String) this.getOutputMinFrameDurationlomOqCM.elementAt(i);
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 41) % 128;
                int i8 = 0;
                while (i8 < size) {
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 79) % 128;
                    if (zArr[i8] || !iVar.m26325((util.h.xy.dh.i) m26504.getOutputSizes.elementAt(i8)) || !Camera2StreamConfigurationMap(str, (java.lang.String) m26504.getOutputMinFrameDurationlomOqCM.elementAt(i8))) {
                        i8++;
                    }
                }
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 41) % 128;
                return false;
            }
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // util.h.xy.dh.mh
    public int hashCode() {
        if (this.getOutputSizeshNQ4ISI) {
            return this.getOutputMinFrameDuration;
        }
        this.getOutputSizeshNQ4ISI = true;
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 77) % 128;
        for (int i = 0; i != this.getOutputSizes.size(); i++) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 55) % 128;
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges((java.lang.String) this.getOutputMinFrameDurationlomOqCM.elementAt(i)));
            int hashCode = this.getOutputMinFrameDuration ^ this.getOutputSizes.elementAt(i).hashCode();
            this.getOutputMinFrameDuration = hashCode;
            this.getOutputMinFrameDuration = highSpeedVideoSizes.hashCode() ^ hashCode;
        }
        return this.getOutputMinFrameDuration;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoSizes + 21;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.getOutputStallDuration == null) {
            util.h.xy.dh.d dVar = new util.h.xy.dh.d();
            util.h.xy.dh.d dVar2 = new util.h.xy.dh.d();
            int i2 = 0;
            util.h.xy.dh.i iVar = null;
            while (i2 != this.getOutputSizes.size()) {
                util.h.xy.dh.d dVar3 = new util.h.xy.dh.d(2);
                util.h.xy.dh.i iVar2 = (util.h.xy.dh.i) this.getOutputSizes.elementAt(i2);
                dVar3.m26290(iVar2);
                dVar3.m26290(this.getHighSpeedVideoSizesFor.m26515(iVar2, (java.lang.String) this.getOutputMinFrameDurationlomOqCM.elementAt(i2)));
                if (iVar == null || ((java.lang.Boolean) this.getOutputStallDurationlomOqCM.elementAt(i2)).booleanValue()) {
                    dVar2.m26290(new util.h.xy.dh.aa(dVar3));
                    getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 35) % 128;
                } else {
                    dVar.m26290(new util.h.xy.dh.ae(dVar2));
                    dVar2 = new util.h.xy.dh.d();
                    dVar2.m26290(new util.h.xy.dh.aa(dVar3));
                }
                i2++;
                iVar = iVar2;
            }
            dVar.m26290(new util.h.xy.dh.ae(dVar2));
            this.getOutputStallDuration = new util.h.xy.dh.aa(dVar);
        }
        return this.getOutputStallDuration;
    }

    public e(util.h.xy.dh.l lVar) {
        java.lang.Object obj;
        java.util.Vector vector;
        this.getOutputStallDuration = lVar;
        java.util.Enumeration mo26285 = lVar.mo26285();
        while (mo26285.hasMoreElements()) {
            util.h.xy.dh.rk m26341 = util.h.xy.dh.rk.m26341(((util.h.xy.dh.c) mo26285.nextElement()).mo26279());
            int i = 0;
            int i2 = 0;
            while (i2 < m26341.m26342()) {
                util.h.xy.dh.l m26303 = util.h.xy.dh.l.m26303(m26341.m26345(i2).mo26279());
                if (m26303.mo26286() != 2) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(16 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.util.TypedValue.complexToFloat(i) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i) == 0.0f ? 0 : -1)), (char) (14005 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                }
                this.getOutputSizes.addElement(util.h.xy.dh.i.m26297(m26303.mo26287(i)));
                util.h.xy.dh.c mo26287 = m26303.mo26287(1);
                if (!(mo26287 instanceof util.h.xy.dh.m) || (mo26287 instanceof util.h.xy.dh.mo)) {
                    try {
                        java.util.Vector vector2 = this.getOutputMinFrameDurationlomOqCM;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            objArr2[i] = java.lang.Integer.valueOf(i);
                            java.lang.Class<?> cls = java.lang.Class.forName("android.os.Process");
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i] = java.lang.Integer.TYPE;
                            java.lang.reflect.Method method = cls.getMethod("getThreadPriority", clsArr);
                            obj = null;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(1 - packedPositionGroup, ((((java.lang.Integer) method.invoke(null, objArr2)).intValue() + 20) >> 6) + 17, (char) (3900 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr3);
                            sb.append(((java.lang.String) objArr3[0]).intern());
                            util.h.xy.dh.mi mo26279 = mo26287.mo26279();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(3 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 18, (char) (702 - android.view.KeyEvent.keyCodeFromString("")), objArr4);
                            byte[] m26800 = util.h.xy.fa.d.m26800(mo26279.m26322(((java.lang.String) objArr4[0]).intern()));
                            int length = m26800.length;
                            char[] cArr = new char[length];
                            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 117) % 128;
                            for (int i3 = 0; i3 != length; i3++) {
                                getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 91) % 128;
                                cArr[i3] = (char) (m26800[i3] & 255);
                            }
                            sb.append(new java.lang.String(cArr));
                            vector2.addElement(sb.toString());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.io.IOException unused) {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(19 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.graphics.Color.blue(0) + 21, (char) (31670 - android.view.KeyEvent.keyCodeFromString("")), objArr5);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
                    }
                } else {
                    java.lang.String mo26276 = ((util.h.xy.dh.m) mo26287).mo26276();
                    if (mo26276.length() <= 0 || mo26276.charAt(i) != '#') {
                        vector = this.getOutputMinFrameDurationlomOqCM;
                    } else {
                        vector = this.getOutputMinFrameDurationlomOqCM;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(1 - android.text.TextUtils.indexOf("", "", i, i), (android.widget.ExpandableListView.getPackedPositionForChild(i, i) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i, i) == 0L ? 0 : -1)) + 17, (char) (android.view.MotionEvent.axisFromString("") + 14826), objArr6);
                        sb2.append(((java.lang.String) objArr6[i]).intern());
                        sb2.append(mo26276);
                        mo26276 = sb2.toString();
                    }
                    vector.addElement(mo26276);
                    obj = null;
                }
                this.getOutputStallDurationlomOqCM.addElement(i2 != 0 ? getHighResolutionOutputSizeshNQ4ISI : getOutputFormats);
                i2++;
                i = 0;
            }
        }
    }

    protected e() {
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[914];
        java.nio.ByteBuffer.wrap("ªÖ\u009cPÇÚ\tWpÙº\ríÙ×~\u001eæ@|\u008bâý#$øn\u0014Q\u009b\u009b\r¥´\u0093\u0019\u009eû¨\u007fóççÔÑS\u008aÓDV=Ì÷Z \u0089\u009aqSñ\ryÆê°diî#V\u001c\u0087Ö\u001d\u008f\u008by\u00172\u0088\u009ctªêñ`?àFz\u008cïÛqá\u0082(LvÂ½PËÙ\u0012YX©g)\u00ad\u00adôq\u0002½I5\u0097þÞ\u000bä\u00893\u0002y\u0097\u0080CÎÜùÌÏU\u0094ÁZ_#ÞéI¾Ö\u009c3ªªñ>? F!\u008c¶Û.á\u0092\u009c3ªªñ>? F!\u008c¶Û.á\u0093\u009fA©ØòL<ÒES\u008fÄØ\\ââ§°\u0091)Ê½\u0004#}¢·5à¯³N\u0085×ÞC\u0010Ýi\\£ËôW\u009c3ªªñ>? F!\u008c¶Û&\u009c3ªªñ>? F!\u008c¶Û(x{Nâ\u0015vÛè¢ihþ?o\u009c3ªªñ>? F!\u008c¶Û+\u009c3ªªñ>? F!\u008c¶Û+á\u0090\u009c3ªªñ>? F!\u008c¶Û+á\u0091\u009c3ªªñ>? F!\u008c¶Û+á\u0096\u009c3ªªñ>? F!\u008c¶Û+á\u0097«æ\u009d\u007fÆë\buqô»cìûÖB\u009c3ªªñ>? F!\u008c¶Û.á\u0095\u009c3ªªñ>? F!\u008c¶Û+á\u0094\u009c3ªªñ>? F!\u008c¶Û)á\u0097Ókåñ¾cpû\txÃí\u0094u®×gG9Ùò]\u0084Ã]Q\u0017µ(%â¿»;À\u008bö\u0011\u00ad\u0083c\u001b\u001a\u0098Ð\r\u0087\u0095½7t§*9á½\u0097#N±\u0004U;Åñ_¨Ø\u009c0ªªñ8? F#\u008c¶Û.á\u008c(\u001cv\u0082½\u0006Ë\u0098\u0012\nXîg~\u00adäôb\u0000m6÷me£ýÚ~\u0010ëGs}Ñ´Aêß![WÅ\u008eWÄ³û#1¹h8Ê÷üm§ÿig\u0010äÚq\u008dé·K~Û EëÁ\u009d_DÍ\u000e)1¹û#¢£\u009c0ªªñ8? F&\u008c®Û1á\u009a(\u0007v\u009f½\u001dË\u0087\u0012\tË4ý\u00ad¦9h§\u0011&Û±\u008c)¶\u0093BÝtD/ÐáN\u0098ÏRX\u0005Ä?x\u009c1ªªñ2? F'\u008c«Û+á\u0090(\u0007v\u009d½\nË\u0084\u0012\rXðgt\u00adúôa\u0002úIj\u0097îÞUäÆ3^yÜ\u0080KÎÉ·\t\u0081\u0092Ú\n\u0014\u0098m\u001f§\u0093ð\u0013Ê¨\u0003?]¥\u00962à¼95sÈLL\u0086ÂßY)ÂbR¼ÖõmÏþ\u0018fRä«pg¾Å\u0084\u009cU\u009cNªÑ\u008fª¹\"\u0080½\u009cRªÐ±\u008b\u0087\u0018Ü\u0080\u0012\u001ek\u008d¡\rö\u0088Ì.\u0005½[7\u0090¯æ=]\u0084\u009cEªÇ\u009cTªÍñO\u009cRªÐñY?ËFP\u008cÌõlÃï\u0098gVþ/jåë²dBbté/yáï\u0098\u007fRò\u0005z?ËöH\u009cHªÊñB?ÚF\\\u008cÙÛSáñ\u009cFªÁñE?ËFG\u008cÙÛKáë(fvâX\rn\u00935\u0001û\u0083\u0082\u001eH\u0094\u001f\u0005%¯ì%²§y/\u000f«Ö\u0005\u009cÝ£ZiÁ0MÆÞ\u008dQÇöñhªúdx\u001då×o\u0080þºTsÞ-\\æÔ\u0090PIñ\u0003#<¨ö-\u0080Î¶píø#eZú\u0090gÇÌý\\4ÖjX¡Ý×E\u000eÁD3{¸±\"\t\u00ad?\"\u009cQª÷ñn?ûFq\u008c÷ÛqáÛ(D\u0000\u00056¿m,£®Ú \u0010 G\n}\u0092´\u0019ê\u008a!\u0002W\u0091\u008e\u001a\u009cOªåñf?ëFT\u008cìÛ]áË([vØ½[\u009cBªëñ~?àFa\u008cêÛfáí(Ovï½ZËÂ\u0012TXºg\"\u00ad¤ô\"\u0002¼I2\u0097®\u009cBªëñ~?àFa\u008cêÛfáí(Ovþ½VËÅ\u0012TX¤g\"\u00ad¤ô2\u0002±\u009cFªáñe?êFp\u008cê\u009a»¬\u0002÷\u00809\u0007@\u009a\u008a=Ý\u0093ç\n.ªp4»\u00adÍ4õ\u0099Ã9\u0098£V7/\u0086å\"²\u0081\u0088\u0017A\u0087\u001f\u0004Ô\u0087f¡P\u001b\u000b\u0088Å\n¼\u0084v\u0004!¬\u001b=Ò½\u008c9\u009cCªññx?çF{\u008cýÛláÑ(jvÍ½GËÓ\u0012ZX¯g5\u00ad³\u0086ñ°EëÃ%O\\Á\u0096TÁÔûh2èlF§âÑ\u007f\bûB\u0001}\u0091\u009cOªåñf?ë¬0|x«Ê\u000bÙ=F\u009cbªê\u009cm\u009crªð\u009crªê\u0002t4ço\u007f¡áØr\u0012òEw\u007fÑ¶BèÈ#PUÂ\u009crªðñy?ëFp\u008cì\u001dW+ÚpY¾ÔÇJ\rÊZH`õ©h÷ú<sJö\u009ceªç¨\u008eò\u008eÄ\u0017\u009f\u0095H«~(% ë9\u0092\u00adX,\u000f£0¶\u0006=]\u00ad\u0093;ê« &w®M\u001f\u0084\u009c\u009chªêñb?úF|\u008cùÛsáÑ\u009cfªáñe?ëFg\u008cùÛkáË(FvÂ\u009ctªêñx?úFg\u008cíÛ|áÖ(\\vÞ½VËÒ\u0012\\X¤g#\u00ad¸ô4\u0002§I(\u009ctªêñx?úFg\u008cíÛ|áÖ(\\vÞ½VËÒ\u0012SX¡g*\u00ad¯!\u008b\u0017\u0015L\u009d\u0082\u0000û\u009f1\u0002f\u0089\\9\u0095³Ë=\u0000¸v ¯¤åVÚÝ\u0010G\u009ceªêîöØp\u0083éM|4öþp©ö\u0093\\ZÃKE}ß&LèÎ\u0091@[À\fJ6òÿy¡êjb\u001cñÅz\u0099x¯òôq:üCm\u0089éÞjäÜ-LsÏ¸L\u009cbªëñ~?àFa\u008cêÛfáÍ(OvÏ½ZËÂ\u0012TXºg\"\u00ad¤ô\"\u0002¼I2\u0097®¨\u0094\u009e\u001dÅ\u0088\u000b\u0016r\u0097¸\u001cï\u0090Õ;\u001c¹B(\u0089 ÿ3&¢lRSÔ\u0099RÀÄ6G\u009cfªáñe?êFp\u008cê\u0082z´ãïa!æX{\u0092üÅrÿË6KhÕ£LÕÕ\u009ceªåñ\u007f?ëFz\u008cþÛ}áË([vØ½[§÷\u0091mÊþ\u0004|}ò·ràúÚK\u0013ËMO\u0082Æ´TïÝ!BXÞ\u0092XÅÉÿt6ïhh£âÕv\fÿF\ny\u0090³\u00167ï\u0001{Zý\u0094qíÿ'jpêJV\u0083ÖÝX\u0016Ü`A¹Åó?Ì¯\u009coªåñf?ë".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 914);
        Camera2StreamConfigurationMap = cArr;
        getInputFormats = 5201960477809486468L;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ed.e m26504(java.lang.Object obj) {
        if (obj instanceof util.h.xy.ed.e) {
            return (util.h.xy.ed.e) obj;
        }
        if (obj instanceof util.h.xy.dw.b) {
            return new util.h.xy.ed.e(util.h.xy.dh.l.m26303(((util.h.xy.dw.b) obj).mo26279()));
        }
        if (obj != null) {
            util.h.xy.ed.e eVar = new util.h.xy.ed.e(util.h.xy.dh.l.m26303(obj));
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 101) % 128;
            return eVar;
        }
        int i = getHighSpeedVideoSizes + 111;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }
}
