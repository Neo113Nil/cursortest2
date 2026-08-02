package util.h.xy.dz;

/* loaded from: classes5.dex */
public final class mb extends util.h.xy.dz.ra {
    private static final java.util.Hashtable Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static long getHighSpeedVideoSizes = 0;
    private static int getInputFormats = 1;
    private static int getOutputFormats;
    private static final java.util.Hashtable getOutputMinFrameDuration;

    /* renamed from: ʳ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1838;

    /* renamed from: ʹ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1839;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1840;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1841;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1842;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1843;

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1844;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1845;

    /* renamed from: ˇ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1846;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1847;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1848;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1849;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1850;

    /* renamed from: ˌ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1851;

    /* renamed from: ˍ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1852;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1853;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1854;

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1855;

    /* renamed from: ˡ, reason: contains not printable characters */
    public static final util.h.xy.dw.mb f1856;

    /* renamed from: ˮ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1857;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1858;

    /* renamed from: ՙ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1859;

    /* renamed from: י, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1860;

    /* renamed from: ـ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1861;

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1862;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1863;

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1864;

    /* renamed from: ᐨ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1865;

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1866;

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1867;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1868;

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1869;

    /* renamed from: ι, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1870;

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1871;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1872;

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1873;

    /* renamed from: ﹺ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1874;

    /* renamed from: ｰ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1875;

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final util.h.xy.dh.i f1876;

    /* renamed from: ᐩ, reason: contains not printable characters */
    protected final java.util.Hashtable f1878 = m26459(Camera2StreamConfigurationMap);

    /* renamed from: ʴ, reason: contains not printable characters */
    protected final java.util.Hashtable f1877 = m26459(getOutputMinFrameDuration);

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 41) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 69;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23057), objArr);
            util.h.xy.dh.i m26300 = new util.h.xy.dh.i(((java.lang.String) objArr[0]).intern()).m26300();
            f1850 = m26300;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 7 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (char) (65528 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr2);
            util.h.xy.dh.i m263002 = new util.h.xy.dh.i(((java.lang.String) objArr2[0]).intern()).m26300();
            f1853 = m263002;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.text.TextUtils.indexOf("", "", 0), 15 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 65058), objArr3);
            util.h.xy.dh.i m263003 = new util.h.xy.dh.i(((java.lang.String) objArr3[0]).intern()).m26300();
            f1854 = m263003;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 8, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 23, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
            util.h.xy.dh.i m263004 = new util.h.xy.dh.i(((java.lang.String) objArr4[0]).intern()).m26300();
            f1849 = m263004;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(7 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 24474), objArr5);
            util.h.xy.dh.i m263005 = new util.h.xy.dh.i(((java.lang.String) objArr5[0]).intern()).m26300();
            f1863 = m263005;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, 38 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.graphics.Color.green(0), objArr6);
            f1842 = new util.h.xy.dh.i(((java.lang.String) objArr6[0]).intern()).m26300();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr7);
            util.h.xy.dh.i m263006 = new util.h.xy.dh.i(((java.lang.String) objArr7[0]).intern()).m26300();
            f1858 = m263006;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - android.view.MotionEvent.axisFromString(""), 38 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr8);
            util.h.xy.dh.i m263007 = new util.h.xy.dh.i(((java.lang.String) objArr8[0]).intern()).m26300();
            f1870 = m263007;
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 7, 52 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36511), objArr9);
            util.h.xy.dh.i m263008 = new util.h.xy.dh.i(((java.lang.String) objArr9[0]).intern()).m26300();
            f1841 = m263008;
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 7, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56116), objArr10);
            util.h.xy.dh.i m263009 = new util.h.xy.dh.i(((java.lang.String) objArr10[0]).intern()).m26300();
            f1840 = m263009;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, android.graphics.Color.red(0) + 66, (char) (7146 - android.text.TextUtils.indexOf("", "")), objArr11);
            util.h.xy.dh.i m2630010 = new util.h.xy.dh.i(((java.lang.String) objArr11[0]).intern()).m26300();
            f1851 = m2630010;
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(7 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 72, (char) android.text.TextUtils.getTrimmedLength(""), objArr12);
            util.h.xy.dh.i m2630011 = new util.h.xy.dh.i(((java.lang.String) objArr12[0]).intern()).m26300();
            f1848 = m2630011;
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getTrimmedLength("") + 8, 81 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), objArr13);
            util.h.xy.dh.i m2630012 = new util.h.xy.dh.i(((java.lang.String) objArr13[0]).intern()).m26300();
            f1843 = m2630012;
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.keyCodeFromString("") + 8, 89 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (55076 - android.view.MotionEvent.axisFromString("")), objArr14);
            util.h.xy.dh.i m2630013 = new util.h.xy.dh.i(((java.lang.String) objArr14[0]).intern()).m26300();
            f1847 = m2630013;
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 97 - android.view.View.MeasureSpec.getSize(0), (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1188), objArr15);
            util.h.xy.dh.i m2630014 = new util.h.xy.dh.i(((java.lang.String) objArr15[0]).intern()).m26300();
            f1844 = m2630014;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 8, android.view.Gravity.getAbsoluteGravity(0, 0) + 105, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr16);
            util.h.xy.dh.i m2630015 = new util.h.xy.dh.i(((java.lang.String) objArr16[0]).intern()).m26300();
            f1861 = m2630015;
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 114 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 46211), objArr17);
            util.h.xy.dh.i m2630016 = new util.h.xy.dh.i(((java.lang.String) objArr17[0]).intern()).m26300();
            f1864 = m2630016;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.text.TextUtils.getOffsetBefore("", 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 121, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr18);
            util.h.xy.dh.i m2630017 = new util.h.xy.dh.i(((java.lang.String) objArr18[0]).intern()).m26300();
            f1855 = m2630017;
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 8, 128 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr19);
            util.h.xy.dh.i m2630018 = new util.h.xy.dh.i(((java.lang.String) objArr19[0]).intern()).m26300();
            f1852 = m2630018;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.view.View.resolveSizeAndState(0, 0, 0), 137 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.MotionEvent.axisFromString("") + 1), objArr20);
            util.h.xy.dh.i m2630019 = new util.h.xy.dh.i(((java.lang.String) objArr20[0]).intern()).m26300();
            f1865 = m2630019;
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.view.KeyEvent.keyCodeFromString(""), 145 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 12911), objArr21);
            util.h.xy.dh.i m2630020 = new util.h.xy.dh.i(((java.lang.String) objArr21[0]).intern()).m26300();
            f1860 = m2630020;
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 17, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 154, (char) (16 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr22);
            util.h.xy.dh.i m2630021 = new util.h.xy.dh.i(((java.lang.String) objArr22[0]).intern()).m26300();
            f1859 = m2630021;
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(17 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 170 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr23);
            util.h.xy.dh.i m2630022 = new util.h.xy.dh.i(((java.lang.String) objArr23[0]).intern()).m26300();
            f1876 = m2630022;
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(17 - android.graphics.Color.argb(0, 0, 0, 0), 187 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 35721), objArr24);
            util.h.xy.dh.i m2630023 = new util.h.xy.dh.i(((java.lang.String) objArr24[0]).intern()).m26300();
            f1872 = m2630023;
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 17, 204 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr25);
            util.h.xy.dh.i m2630024 = new util.h.xy.dh.i(((java.lang.String) objArr25[0]).intern()).m26300();
            f1839 = m2630024;
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 221 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (12124 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr26);
            util.h.xy.dh.i m2630025 = new util.h.xy.dh.i(((java.lang.String) objArr26[0]).intern()).m26300();
            f1866 = m2630025;
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 238, (char) android.graphics.Color.blue(0), objArr27);
            util.h.xy.dh.i m2630026 = new util.h.xy.dh.i(((java.lang.String) objArr27[0]).intern()).m26300();
            f1867 = m2630026;
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 8, android.text.TextUtils.getOffsetAfter("", 0) + 251, (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr28);
            util.h.xy.dh.i m2630027 = new util.h.xy.dh.i(((java.lang.String) objArr28[0]).intern()).m26300();
            f1862 = m2630027;
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.view.View.combineMeasuredStates(0, 0), 258 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 25599), objArr29);
            f1869 = new util.h.xy.dh.i(((java.lang.String) objArr29[0]).intern()).m26300();
            util.h.xy.dh.i iVar = util.h.xy.ed.md.f2138;
            f1868 = iVar;
            util.h.xy.dh.i iVar2 = util.h.xy.ed.md.f2119;
            f1874 = iVar2;
            util.h.xy.dh.i iVar3 = util.h.xy.ed.md.f2131;
            f1875 = iVar3;
            util.h.xy.dh.i iVar4 = util.h.xy.du.ra.f1646;
            f1838 = iVar4;
            util.h.xy.dh.i iVar5 = util.h.xy.du.ra.f1653;
            f1873 = iVar5;
            util.h.xy.dh.i iVar6 = util.h.xy.du.ra.f1684;
            f1871 = iVar6;
            f1857 = iVar4;
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(26 - android.view.View.MeasureSpec.getMode(0), 267 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (27745 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr30);
            util.h.xy.dh.i iVar7 = new util.h.xy.dh.i(((java.lang.String) objArr30[0]).intern());
            f1846 = iVar7;
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(25 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 294 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.graphics.Color.red(0), objArr31);
            util.h.xy.dh.i iVar8 = new util.h.xy.dh.i(((java.lang.String) objArr31[0]).intern());
            f1845 = iVar8;
            java.util.Hashtable hashtable = new java.util.Hashtable();
            Camera2StreamConfigurationMap = hashtable;
            java.util.Hashtable hashtable2 = new java.util.Hashtable();
            getOutputMinFrameDuration = hashtable2;
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 318, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr32);
            hashtable.put(m26300, ((java.lang.String) objArr32[0]).intern());
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 319, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 58035), objArr33);
            hashtable.put(m263002, ((java.lang.String) objArr33[0]).intern());
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, 321 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.graphics.Color.red(0), objArr34);
            hashtable.put(m263004, ((java.lang.String) objArr34[0]).intern());
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 2, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 321, (char) (58978 - android.view.MotionEvent.axisFromString("")), objArr35);
            hashtable.put(m263003, ((java.lang.String) objArr35[0]).intern());
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 322, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr36);
            hashtable.put(m263005, ((java.lang.String) objArr36[0]).intern());
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(-((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.text.TextUtils.indexOf("", "") + 325, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 53568), objArr37);
            hashtable.put(m263008, ((java.lang.String) objArr37[0]).intern());
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, 326 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-16759120) - android.graphics.Color.rgb(0, 0, 0)), objArr38);
            hashtable.put(m263009, ((java.lang.String) objArr38[0]).intern());
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 328 - android.view.View.getDefaultSize(0, 0), (char) (9415 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr39);
            hashtable.put(m263007, ((java.lang.String) objArr39[0]).intern());
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, 340 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (46218 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr40);
            hashtable.put(iVar4, ((java.lang.String) objArr40[0]).intern());
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 3, 341 - android.text.TextUtils.getOffsetBefore("", 0), (char) (33989 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr41);
            hashtable.put(iVar7, ((java.lang.String) objArr41[0]).intern());
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 3, android.view.View.resolveSizeAndState(0, 0, 0) + 343, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11983), objArr42);
            hashtable.put(iVar8, ((java.lang.String) objArr42[0]).intern());
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 345, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr43);
            hashtable.put(m263006, ((java.lang.String) objArr43[0]).intern());
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 352, (char) android.graphics.Color.blue(0), objArr44);
            hashtable.put(m2630010, ((java.lang.String) objArr44[0]).intern());
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - android.view.View.combineMeasuredStates(0, 0), 359 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr45);
            hashtable.put(m2630011, ((java.lang.String) objArr45[0]).intern());
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 368 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (char) (android.text.TextUtils.indexOf("", "") + 37767), objArr46);
            hashtable.put(m2630012, ((java.lang.String) objArr46[0]).intern());
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, android.view.KeyEvent.getDeadChar(0, 0) + 376, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr47);
            hashtable.put(m2630013, ((java.lang.String) objArr47[0]).intern());
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 11, 385 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr48);
            hashtable.put(m2630015, ((java.lang.String) objArr48[0]).intern());
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 4, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 397, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 24738), objArr49);
            hashtable.put(m2630020, ((java.lang.String) objArr49[0]).intern());
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 401, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr50);
            hashtable.put(iVar6, ((java.lang.String) objArr50[0]).intern());
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(16 - android.view.View.MeasureSpec.getSize(0), 420 - android.view.View.MeasureSpec.getMode(0), (char) (35758 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr51);
            hashtable.put(iVar5, ((java.lang.String) objArr51[0]).intern());
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-16777200) - android.graphics.Color.rgb(0, 0, 0), 436 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 31297), objArr52);
            hashtable.put(m2630014, ((java.lang.String) objArr52[0]).intern());
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, 452 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr53);
            hashtable.put(m2630018, ((java.lang.String) objArr53[0]).intern());
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 9, 454 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr54);
            hashtable.put(m2630019, ((java.lang.String) objArr54[0]).intern());
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 13, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 462, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr55);
            hashtable.put(m2630027, ((java.lang.String) objArr55[0]).intern());
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.blue(0) + 476, (char) (62591 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr56);
            hashtable.put(m2630026, ((java.lang.String) objArr56[0]).intern());
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, 486 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (176 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr57);
            hashtable.put(m2630024, ((java.lang.String) objArr57[0]).intern());
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 19, android.view.KeyEvent.getDeadChar(0, 0) + 507, (char) (29224 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr58);
            hashtable.put(m2630025, ((java.lang.String) objArr58[0]).intern());
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 525, (char) (15906 - android.graphics.Color.red(0)), objArr59);
            hashtable.put(m2630023, ((java.lang.String) objArr59[0]).intern());
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 531, (char) (android.graphics.Color.alpha(0) + 49076), objArr60);
            hashtable.put(m2630022, ((java.lang.String) objArr60[0]).intern());
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue();
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - ((intValue + 20) >> 6), 542 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (35459 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr61);
            hashtable.put(m2630021, ((java.lang.String) objArr61[0]).intern());
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, android.view.View.MeasureSpec.getSize(0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_WRONG_ACT_CODE, (char) (14667 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr62);
            hashtable.put(m2630017, ((java.lang.String) objArr62[0]).intern());
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, 564 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (53928 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr63);
            hashtable.put(m2630016, ((java.lang.String) objArr63[0]).intern());
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(16 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 580, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr64);
            hashtable.put(iVar, ((java.lang.String) objArr64[0]).intern());
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(4 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 596, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr65);
            hashtable.put(iVar2, ((java.lang.String) objArr65[0]).intern());
            java.lang.Object[] objArr66 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(22 - android.graphics.Color.alpha(0), 599 - android.graphics.Color.argb(0, 0, 0, 0), (char) (3728 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr66);
            hashtable.put(iVar3, ((java.lang.String) objArr66[0]).intern());
            java.lang.Object[] objArr67 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 1, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_NOT_FOUND, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr67);
            hashtable2.put(((java.lang.String) objArr67[0]).intern(), m26300);
            java.lang.Object[] objArr68 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 1, 622 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr68);
            hashtable2.put(((java.lang.String) objArr68[0]).intern(), m263002);
            java.lang.Object[] objArr69 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 623, (char) android.view.View.resolveSize(0, 0), objArr69);
            hashtable2.put(((java.lang.String) objArr69[0]).intern(), m263004);
            java.lang.Object[] objArr70 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 623 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr70);
            hashtable2.put(((java.lang.String) objArr70[0]).intern(), m263003);
            java.lang.Object[] objArr71 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 2, 626 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 44922), objArr71);
            hashtable2.put(((java.lang.String) objArr71[0]).intern(), m263005);
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 1, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 627, (char) android.view.View.MeasureSpec.getSize(0), objArr72);
            hashtable2.put(((java.lang.String) objArr72[0]).intern(), m263008);
            java.lang.Object[] objArr73 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, 628 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 11953), objArr73);
            hashtable2.put(((java.lang.String) objArr73[0]).intern(), m263009);
            java.lang.Object[] objArr74 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2, android.graphics.Color.rgb(0, 0, 0) + 16777847, (char) (28000 - android.graphics.Color.blue(0)), objArr74);
            hashtable2.put(((java.lang.String) objArr74[0]).intern(), m2630010);
            java.lang.Object[] objArr75 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(12 - android.graphics.Color.green(0), 634 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (20362 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr75);
            hashtable2.put(((java.lang.String) objArr75[0]).intern(), m263007);
            java.lang.Object[] objArr76 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - android.view.KeyEvent.getDeadChar(0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 645, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr76);
            hashtable2.put(((java.lang.String) objArr76[0]).intern(), m263006);
            java.lang.Object[] objArr77 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 12, android.view.View.MeasureSpec.getMode(0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED, (char) (59451 - android.graphics.Color.red(0)), objArr77);
            hashtable2.put(((java.lang.String) objArr77[0]).intern(), iVar4);
            java.lang.Object[] objArr78 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 2, android.text.TextUtils.getOffsetAfter("", 0) + 663, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 5962), objArr78);
            hashtable2.put(((java.lang.String) objArr78[0]).intern(), iVar7);
            java.lang.Object[] objArr79 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 665 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr79);
            hashtable2.put(((java.lang.String) objArr79[0]).intern(), iVar4);
            java.lang.Object[] objArr80 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 666 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr80);
            hashtable2.put(((java.lang.String) objArr80[0]).intern(), iVar8);
            java.lang.Object[] objArr81 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(7 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 669, (char) android.graphics.Color.red(0), objArr81);
            hashtable2.put(((java.lang.String) objArr81[0]).intern(), m2630010);
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 676, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr82);
            hashtable2.put(((java.lang.String) objArr82[0]).intern(), m2630011);
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 8, android.view.View.MeasureSpec.getMode(0) + 685, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23344), objArr83);
            hashtable2.put(((java.lang.String) objArr83[0]).intern(), m2630012);
            java.lang.Object[] objArr84 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, 693 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr84);
            hashtable2.put(((java.lang.String) objArr84[0]).intern(), m2630013);
            java.lang.Object[] objArr85 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + org.chromium.net.telemetry.CronetStatsLog.CRONET_ENGINE_CREATED, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 49680), objArr85);
            hashtable2.put(((java.lang.String) objArr85[0]).intern(), m2630015);
            java.lang.Object[] objArr86 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, android.view.View.resolveSizeAndState(0, 0, 0) + 714, (char) android.text.TextUtils.indexOf("", ""), objArr86);
            hashtable2.put(((java.lang.String) objArr86[0]).intern(), m2630020);
            java.lang.Object[] objArr87 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 19, android.view.KeyEvent.getDeadChar(0, 0) + 718, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 65263), objArr87);
            hashtable2.put(((java.lang.String) objArr87[0]).intern(), iVar6);
            java.lang.Object[] objArr88 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(16 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 737, (char) android.graphics.Color.blue(0), objArr88);
            hashtable2.put(((java.lang.String) objArr88[0]).intern(), iVar5);
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(16 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 752 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (28918 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr89);
            hashtable2.put(((java.lang.String) objArr89[0]).intern(), m2630014);
            java.lang.Object[] objArr90 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(2 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 769 - android.text.TextUtils.getOffsetBefore("", 0), (char) (34265 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr90);
            hashtable2.put(((java.lang.String) objArr90[0]).intern(), m2630018);
            java.lang.Object[] objArr91 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 9, android.widget.ExpandableListView.getPackedPositionChild(0L) + 772, (char) (28587 - android.graphics.Color.alpha(0)), objArr91);
            hashtable2.put(((java.lang.String) objArr91[0]).intern(), m2630019);
            java.lang.Object[] objArr92 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(0, 0) + 13, 779 - android.view.MotionEvent.axisFromString(""), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 52224), objArr92);
            hashtable2.put(((java.lang.String) objArr92[0]).intern(), m2630027);
            java.lang.Object[] objArr93 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 792, (char) (33906 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr93);
            hashtable2.put(((java.lang.String) objArr93[0]).intern(), m2630026);
            java.lang.Object[] objArr94 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 803, (char) android.view.View.MeasureSpec.getSize(0), objArr94);
            hashtable2.put(((java.lang.String) objArr94[0]).intern(), m2630024);
            java.lang.Object[] objArr95 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 824 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr95);
            hashtable2.put(((java.lang.String) objArr95[0]).intern(), m2630025);
            java.lang.Object[] objArr96 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 6, 843 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.getTrimmedLength("") + 27347), objArr96);
            hashtable2.put(((java.lang.String) objArr96[0]).intern(), m2630023);
            java.lang.Object[] objArr97 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 12, 847 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr97);
            hashtable2.put(((java.lang.String) objArr97[0]).intern(), m2630022);
            java.lang.Object[] objArr98 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 860, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 42889), objArr98);
            hashtable2.put(((java.lang.String) objArr98[0]).intern(), m2630021);
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, 870 - android.view.MotionEvent.axisFromString(""), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr99);
            hashtable2.put(((java.lang.String) objArr99[0]).intern(), m2630017);
            java.lang.Object[] objArr100 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 16, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 880, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 50608), objArr100);
            hashtable2.put(((java.lang.String) objArr100[0]).intern(), m2630016);
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-16777201) - android.graphics.Color.rgb(0, 0, 0), android.view.View.combineMeasuredStates(0, 0) + 897, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr101);
            hashtable2.put(((java.lang.String) objArr101[0]).intern(), iVar);
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 4, android.graphics.Color.alpha(0) + 912, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40982), objArr102);
            hashtable2.put(((java.lang.String) objArr102[0]).intern(), iVar2);
            java.lang.Object[] objArr103 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(22 - android.text.TextUtils.indexOf("", "", 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 916, (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr103);
            hashtable2.put(((java.lang.String) objArr103[0]).intern(), iVar3);
            f1856 = new util.h.xy.dz.mb();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // util.h.xy.dw.mb
    /* renamed from: ˎ */
    public final java.lang.String mo26437(util.h.xy.dw.b bVar) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z = true;
        for (util.h.xy.dw.ra raVar : bVar.m26431()) {
            getInputFormats = (getOutputFormats + 79) % 128;
            if (z) {
                z = false;
            } else {
                stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            util.h.xy.dz.ma.m26457(stringBuffer, raVar, this.f1878);
        }
        java.lang.String obj = stringBuffer.toString();
        int i = getOutputFormats + 53;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dw.mb
    /* renamed from: ᐝ */
    public final util.h.xy.dw.ra[] mo26440(java.lang.String str) {
        getInputFormats = (getOutputFormats + 61) % 128;
        util.h.xy.dw.ra[] m26451 = util.h.xy.dz.ma.m26451(str, this);
        int i = getOutputFormats + 31;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return m26451;
        }
        throw null;
    }

    @Override // util.h.xy.dw.mb
    /* renamed from: ˋ */
    public final util.h.xy.dh.i mo26436(java.lang.String str) {
        getInputFormats = (getOutputFormats + 35) % 128;
        util.h.xy.dh.i m26456 = util.h.xy.dz.ma.m26456(str, this.f1877);
        getOutputFormats = (getInputFormats + 73) % 128;
        return m26456;
    }

    @Override // util.h.xy.dz.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    protected final util.h.xy.dh.c mo26458(util.h.xy.dh.i iVar, java.lang.String str) {
        if (iVar.m26325(f1838) || iVar.m26325(f1846)) {
            return new util.h.xy.dh.y(str);
        }
        if (iVar.m26325(f1859)) {
            return new util.h.xy.dh.me(str);
        }
        if (!iVar.m26325(f1850) && !iVar.m26325(f1842) && !iVar.m26325(f1852)) {
            int i = getOutputFormats + 61;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                iVar.m26325(f1868);
                throw new java.lang.ArithmeticException();
            }
            if (!iVar.m26325(f1868)) {
                util.h.xy.dh.c mo26458 = super.mo26458(iVar, str);
                getOutputFormats = (getInputFormats + 87) % 128;
                return mo26458;
            }
        }
        util.h.xy.dh.rz rzVar = new util.h.xy.dh.rz(str);
        int i2 = getOutputFormats + 13;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return rzVar;
        }
        throw new java.lang.ArithmeticException();
    }

    protected mb() {
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        char[] cArr = new char[938];
        java.nio.ByteBuffer.wrap("Æ\"\n\u008e_E .ôä9N\n\u0006cË¯gú¬\u0005ÇQ\r\u009c§¯èû\u0019b\u0011®½ûv\u0004\u001dP×\u009d}®2úÂ\u009c3P\u009f\u0005Tú?®õc_P\u0010\u0004ãÃ©\u000f\u0005ZÎ¥¥ño<Å\u000f\u0088\u009c3P\u009f\u0005Tú?®õc_P\u0014\u009c3P\u009f\u0005Tú?®õc_P\u0018\u0012\u0093Þ?\u008bôt\u009f UíÿÞ¶G\u0000\u008b¬Þg!\fuÆ¸l\u008b*\u0087ÙKu\u001e¾áÕµ\u001fxµKÿ\u009c3P\u009f\u0005Tú?®õc_P\u0015\u0004ã\u009c3P\u009f\u0005Tú?®õc_P\u0015\u0004âK\u0016\u0087ºÒq-\u001ayÐ´z\u00870ÓÀ\u0098\u0096T:\u0001ñþ\u009aªPgúT°\u0000A\u009c3P\u009f\u0005Tú?®õc_P\u0010\u0004â(°ä\u001c±×N¼\u001av×Üä\u0093°g\u009c3P\u009f\u0005Tú?®õc_P\u0010\u0004æ\u009c3P\u009f\u0005Tú?®õc_P\u0015\u0004ç\u009c3P\u009f\u0005Tú?®õc_P\u0017\u0004ä®\\bð7;ÈP\u009c\u009aQ0by6\u008c\u009c P\u008f\u0005Bú/®çcOP\u0000\u0004ïù¤®\u000fbÄW¯\u0004føÏ\u00ad\u0088boW \u009c0P\u009f\u0005Rú?®÷c_P\u0010\u0004ÿù´®\u001fbÔW¿\u0004vøß\u00ad\u0098b\u007fW3\u0017¸Û\u0017\u008eÚq·%\u007fè×Û\u0098\u008fwr<%\u0097é\\Ü7\u008fþsW&\u0010é÷Üº\u009c0P\u009f\u0005Rú?®÷c_P\u0010\u0004ÿù´®\u001fbÔW¿\u0004vøß\u00ad\u0098b\u007fW5³k\u007fÄ*\tÕd\u0081¬L\u0004\u007fK+¤Öï\u0081DM\u008fxä+-×\u0084\u0082ÃM$xo\u009c0P\u009f\u0005Rú?®òcGP\u000f\u0004éù¯®\u0002bÏW \u0004u\u009c3P\u009f\u0005Tú?®õc_P\u0010\u0004çÿÌ3`f«\u0099ÀÍ\n\u0000 3ëg\u001aðP<þi9\u0096^Â\u0092\u000f#<th\u0082\u0095ÎÂa\u000e¹;Âh\u0010\u0094 Áó\u000e\u0000;Pgþ\u00941Á@\r\u0090:>gq\u0093\u009eÀÒ\re\u009c1P\u009f\u0005Xú?®ócBP\u0015\u0004ãù¯®\u0000bØW£\u0004qøÁ\u00ad\u0092baW1\u000b\u009føP\u00ad!añV_\u000b\u0010ÿÿ¬°\u009cB~ú\u009cUz-¶\u0087\u009cBPÿM\rÚâ\u0016U¸\u0095t3!ôÞ\u009f\u008aGGút¨ CÝ\u000b\u008a´Fcs\u0004(Í\u0018\u0080Ô7²\u009a~6+ë\u009cRPå\u00053úT®\u0084c%\u009cRPä\u00053ú_®\u0080c<Pd\u009cFPø\u00057úT®\u008fc?P`\u0004\u009cùÄ\u000fÏÃx\u0096¯iÂ=\u000fð·Ãê\u0097\u0005\u009cFPô\u0005/úT®\u0093c0Pu\u0004\u0098ùÎ®\u007f\u009cEPô\u00052úR®\u0093c8Pq\u0004\u0085ùÈ®~b¯üñ0\\e\u008f\u009aö\u009ctPß\u0005\u0012úe®³c\u0004PB\u0004¥ùô®Cb\u0084Wõ\u0004\u0000ø\u0095\u00adÅb#Wd\u000bÂø\u0012\u0017ÙÛr\u008e¿qÈ%\u001eè©Ûï\u008f\brY%îé)ÜX\u008f¢s=&aé\u0099æ\u0015*\u009e\u007fI\u0080!Ôõ\u0019U*)~ô\u0083¥Ô\u001e\u0018Ô-¹~f\u0082Ù×\u0085\u0018b\u009cEPÿ\u009cQPÂ\u0005\u0004úd®¥c\u001ePO\u0004¨ùì\u009cQPÞ\u0005\u0012úe® c\u001dP`\u0004µùå®Cb\u0084Wâ\u00042hÏ¤Pñ\u008c\u000eôZ\u0000\u0097\u0085¤ãð8\rsZÅ\u0096\t\u009còPn\u0005¤úÏ®\u0005c³Pè\u0004.ùW®Âb8WU\u0004\u0098ø;\u00adtb\u008fWÂ\u000biø¸\u00adÑîk\"÷w=\u0088VÜ\u009c\u0011*\"qv·\u008bÎÜJ\u0010\u00ad%Ëv\u0001\u008a¼ßí\u0010\u0016%Kyý¢dnö;-ÄW\u0090\u0086]!#åïiº´EÆ\u0011\u0010Ü\u008aïó»'F\\\u0011÷Ý!èM\u0016ÆÚS\u008f\u0096p÷$\ré\u0094Úà\u008e;sp$Æè\n¥\u001ai\u0095<YÃ.\u0097ëZVi)=õÀ®\u0097\u001fNê\u0082m×»(Ñ|\u0006±½\u0082ûÖ\u000b+k|ù°<\u0085]Ö\u008f*7\u007fz°\u0081\u009cUPÔ\u0005\rút®±c\u0019PN\u0004¿ùä®\u007fb\u0094Wü\u0004#ø\u0094\u00adÓ\u009cOPÐ\u0005\fút\u0092þ^S\u000b\u0096ôà ?m\u0088^Ë\n ÷e Èl\u001eYo\n\u0098ö\u0005£Tl¯Yå\u0005Hö\u0097£èo4X\u0093\u009cb\u009cn\u009cu\u009cnPÄ3\u0018ÿ¥\u009cm²Ã~tñ\u0012=¿Óø\u001f^J\u0099µòá*,\u0097\u001fÅK.¶fáÙ-\u000e\u0018i\u009crPÅ\u0005\u0013út®¤c\u0005t_¸çí;\u0012CF\u0096\u008b+¸~ì\u008e\u0011ÈFo\u008a©¿Ù\u008b/G\u0098\u009cd\u009ctPØ\u0005\u0005\u009crPÄ\u0005\u0013ú\u007f® c\u001cPD\u009cfPØ\u0005\u0017út®¯c\u001fP@\u0004¼ùäÇG\u000bð^'¡Jõ\u00878?\u000bb_\u008d\u009cfPÔ\u0005\u000fút®³c\u0010PU\u0004¸ùî®_^u\u0092ÄÇ\u00028bl£¡\b\u0092AÆµ;ølN \u009f\u009csPÞ\u0005\rútb\u009b®0ûý\u0004\u008aP\\\u009dë®\u00adúJ\u0007\u001bP¬\u009ck©\u001aúÏ\u0006zS*\u009cÌ©\u008bõ-\u0006ý\u009ctPß\u0005\u0012úe®³c\u0004PB\u0004¥ùô®Cb\u0084Wõ\u0004/ø\u0090\u00adÌb4ì\u0082 )uþ\u008a\u0096ÞB\u0013â ¾tC\u0089\u0012Þ©\u0012c'\u000etÑ\u0088nÝ2\u0012Õ\u0019¼Õ\u0006óÚ?ij¯\u0095ÏÁ\u000e\fµ?äk\u0003\u0096GPp\u009cßÉ\u00136db¡¯\u001c\u009cAÈ´5äbB®\u0085\u009bãÈ3\u0018\u001dÔ¢\u0081~~\u0006*ÒçwÔ1\u0080Ê}\u0081*7æû\u009cbPÞ\u0005\u0014ú\u007f®µc\u0003PX\u0004¾ùç®Rb\u0088Wå\u0004(ø\u008b\u00adÄb?Wr\u000bÙø\b\u00ada\u009cbPÞ\u0005\u0014ú\u007f®µc\u0003PX\u0004¾ùç®Cb\u0084Wâ\u0004(ø\u0095\u00adÄb?Wb\u000bÔöµ:\u0007oÜ\u0090¦Äw\tÐ\u009cqPÝ\u0005\u0000úr®¤c\u001ePG\u0004³ùè®Cb\u0095Wù;ì÷Y¢\u009c]ý\t'Ä\u009e÷Ê£1^z\tÌÅ\u0000\u009cqPÞ\u0005\u0012úe® c\u001dPB\u0004¾ùå®TYÌ\u0095kÀ½?×k\u0000¦»\u0095ýÁ\r<Mkÿ§:\u0092[Á\u0089=1h|§\u0087\u009cuPÔ\u0005\rút®±c\u0019PN\u0004¿ùä®_b\u0094Wü\u0004#ø\u0094\u00adÓ<zðÅ¥\u0019Za\u009cnPÃ\u0005\u0006úp®¯c\u0018P[\u0004°ùõ®Xb\u008eWÿ\u0004(ø\u0095\u00adÄb?Wu\u000bØø\u0007\u00adxa¤V\u0003".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 938);
        getHighSpeedVideoFpsRangesFor = cArr;
        getHighSpeedVideoSizes = 8602336717160599729L;
    }
}
