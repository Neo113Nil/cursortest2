package util.h.xy.av;

/* loaded from: classes5.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static short[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static char[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static long getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static byte[] getOutputMinFrameDurationlomOqCM;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final java.lang.String f881;

    static {
        Camera2StreamConfigurationMap();
        f881 = "ra";
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 57) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m25230(android.content.Context context, java.lang.String str) throws java.lang.IllegalArgumentException {
        java.lang.Object obj;
        int i = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(21 - modifierMetaStateMask, (android.graphics.PointF.length(2.0f, 2.0f) > 0.0f ? 1 : (android.graphics.PointF.length(2.0f, 2.0f) == 0.0f ? 0 : -1)), (char) (52886 >> android.view.View.MeasureSpec.makeMeasureSpec(1, 0)), objArr);
            obj = objArr[0];
        } else {
            byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(modifierMetaStateMask2 + 13, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (52886 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr2);
            obj = objArr2[0];
        }
        java.lang.String m25234 = m25234(context, ((java.lang.String) obj).intern(), str);
        int i2 = getHighSpeedVideoFpsRangesFor + 29;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return m25234;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25234(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        if (context == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetBefore("", 0) + 1582913093, (short) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 114), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 13 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-1733309391) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (str2 == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1582913107 - android.graphics.Color.argb(0, 0, 0, 0), (short) ((-16777251) - android.graphics.Color.rgb(0, 0, 0)), (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 9 - android.graphics.Color.blue(0), (-1733309383) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (str2.isEmpty()) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        return context.getSharedPreferences(str, 0).getString(str2, null);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25239(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 105) % 128;
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(12 - (maxKeyCode >> 16), 1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52886), objArr);
        m25232(context, ((java.lang.String) objArr[0]).intern(), str, str2);
        getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 31) % 128;
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 59;
        while (true) {
            Camera2StreamConfigurationMap = i3 % 128;
            if (rbVar.f2651 >= i) {
                break;
            }
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
            rbVar.f2651++;
            i3 = getHighResolutionOutputSizeshNQ4ISI + 63;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 49) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25232(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.IllegalArgumentException {
        int i = getInputSizeshNQ4ISI + 75;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (context == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.green(0) + 1582913093, (short) (android.view.View.MeasureSpec.getMode(0) + 114), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.blue(0) + 13, android.text.TextUtils.getTrimmedLength("") - 1733309391, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (str2 == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetAfter("", 0) + 1582913107, (short) ((-34) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 9, (-1733309384) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (str2.isEmpty()) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 12 - android.view.View.MeasureSpec.getMode(0), (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (str3 == null) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1566135901 - android.graphics.Color.rgb(0, 0, 0), (short) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 36), (byte) android.text.TextUtils.getOffsetAfter("", 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, (-1733309372) - android.view.KeyEvent.normalizeMetaState(0), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        if (str3.isEmpty()) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(14 - android.view.View.combineMeasuredStates(0, 0), 23 - android.view.MotionEvent.axisFromString(""), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 48408), objArr5);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
        edit.commit();
        int i2 = getInputSizeshNQ4ISI + 39;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25235(android.content.Context context, java.lang.String str) {
        int indexOf;
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor + 63;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            indexOf = 106 >> android.text.TextUtils.indexOf("", io.ktor.util.date.GMTDateParser.SECONDS, 1, 1);
            i = 0;
        } else {
            indexOf = 11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            i = 1;
        }
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(indexOf, i + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 52886), objArr);
            m25231(context, ((java.lang.String) objArr[0]).intern(), str);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25231(android.content.Context context, java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoFpsRangesFor + 119;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (context == null) {
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1582913093 + (jumpTapTimeout >> 16), (short) (114 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, android.text.TextUtils.getTrimmedLength("") - 1733309391, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (str2 == null) {
            float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 1582913107, (short) ((-36) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-1733309383) - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (str2.isEmpty()) {
            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(12 - capsMode, android.view.Gravity.getAbsoluteGravity(0, 0) + 12, (char) android.text.TextUtils.indexOf("", ""), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.remove(str2);
        edit.apply();
        edit.commit();
        int i2 = getInputSizeshNQ4ISI + 101;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25229(android.content.Context context) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        if (context == null) {
            int blue = android.graphics.Color.blue(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(blue + 1582913093, (short) (114 - android.text.TextUtils.getOffsetBefore("", 0)), (byte) android.view.View.getDefaultSize(0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, (-1733309391) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(capsMode + 12, 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 52887), objArr2);
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(((java.lang.String) objArr2[0]).intern(), 0).edit();
        edit.clear();
        edit.apply();
        edit.commit();
        int i = getHighSpeedVideoFpsRangesFor + 55;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m25240(android.content.Context context) {
        boolean z = false;
        int mode = android.view.View.MeasureSpec.getMode(0);
        short s = (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 125);
        byte green = (byte) android.graphics.Color.green(0);
        getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 83) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1582913129 - mode, s, green, 13 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 1733309383, objArr);
            if (m25230(context, ((java.lang.String) objArr[0]).intern()) != null) {
                getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 115) % 128;
                z = true;
            }
            getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 7) % 128;
            return z;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m25233(android.content.Context context) {
        int i = getInputSizeshNQ4ISI + 17;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        try {
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1582913143 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), (short) ((-11) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1733309373, objArr);
            if (m25230(context, ((java.lang.String) objArr[0]).intern()) == null) {
                return false;
            }
            int i2 = getHighSpeedVideoFpsRangesFor + 53;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 3;
            }
            return true;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        if (i5 == -1) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
            byte[] bArr2 = getOutputMinFrameDurationlomOqCM;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr3[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                int i7 = Camera2StreamConfigurationMap + 75;
                getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                i5 = (byte) (i7 % 2 == 0 ? ((byte) (getOutputMinFrameDurationlomOqCM[i >> ((int) (getOutputMinFrameDuration % (-2689713159175858216L)))] * (-2689713159175858216L))) >> ((int) (getHighSpeedVideoSizesFor * (-2689713159175858216L))) : ((byte) (getOutputMinFrameDurationlomOqCM[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            meVar.f2647 = ((i + i5) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputMinFrameDurationlomOqCM;
            if (bArr4 != null) {
                int i8 = Camera2StreamConfigurationMap + 81;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                int i9 = 0;
                while (i9 < length) {
                    int i10 = getHighResolutionOutputSizeshNQ4ISI + 89;
                    Camera2StreamConfigurationMap = i10 % 128;
                    if (i10 % 2 != 0) {
                        bArr[i9] = (byte) (bArr4[i9] % (-2689713159175858216L));
                    } else {
                        bArr[i9] = (byte) (bArr4[i9] ^ (-2689713159175858216L));
                        i9++;
                    }
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                int i11 = Camera2StreamConfigurationMap + 81;
                getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
                if (i11 % 2 != 0) {
                    z = true;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        int i12 = getHighResolutionOutputSizeshNQ4ISI + 63;
                        Camera2StreamConfigurationMap = i12 % 128;
                        if (i12 % 2 != 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr5 = getOutputMinFrameDurationlomOqCM;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getHighSpeedVideoFpsRanges;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
            } else {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 117) % 128;
            }
            z = false;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
            }
        }
        objArr[0] = sb.toString();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m25237(android.content.Context context) {
        int i;
        int i2;
        int i3 = getInputSizeshNQ4ISI + 25;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            i = 81;
            i2 = 1;
        } else {
            i = 7;
            i2 = 0;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(i + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(i2))).intValue() + 20) >> 6), 38 - android.graphics.Color.blue(0), (char) (14595 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr);
            if (m25230(context, ((java.lang.String) objArr[0]).intern()) != null) {
                return true;
            }
            int i4 = getInputSizeshNQ4ISI + 113;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m25236(android.content.Context context) {
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(combineMeasuredStates + 7, 45 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr);
        if (m25230(context, ((java.lang.String) objArr[0]).intern()) != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 37) % 128;
            return true;
        }
        getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 109) % 128;
        return false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static java.lang.String m25228(android.content.Context context) {
        int resolveSize = android.view.View.resolveSize(0, 0);
        int i = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        getInputSizeshNQ4ISI = i;
        getHighSpeedVideoFpsRangesFor = (i + 23) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(resolveSize + 7, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 38, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 14596), objArr);
            java.lang.String m25230 = m25230(context, ((java.lang.String) objArr[0]).intern());
            if (m25230 == null) {
                return "";
            }
            int i2 = getHighSpeedVideoFpsRangesFor + 125;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return m25230.length() != 0 ? m25230 : "";
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if (r7.length() == 0) goto L12;
     */
    /* renamed from: ͺ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m25238(android.content.Context context) {
        java.lang.String m25230;
        int i = getHighSpeedVideoFpsRangesFor + 113;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 1, 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(99 % resolveSizeAndState, 80 << (android.view.ViewConfiguration.getEdgeSlop() / 121), (char) ('E' >>> android.text.AndroidCharacter.getMirror('=')), objArr);
            m25230 = m25230(context, ((java.lang.String) objArr[0]).intern());
        } else {
            int resolveSizeAndState2 = android.view.View.resolveSizeAndState(0, 0, 0);
            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(7 - resolveSizeAndState2, (edgeSlop >> 16) + 45, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
            m25230 = m25230(context, ((java.lang.String) objArr2[0]).intern());
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(4 - absoluteGravity, 52 - android.graphics.Color.blue(0), (char) (30825 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr3);
        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        return intern;
    }

    static void Camera2StreamConfigurationMap() {
        getInputFormats = new char[]{21245, 6417, 50476, 45347, 32071, 10589, 38259, 16776, 3477, 63908, 42426, 4563, 40042, 55177, 2978, 32742, 46044, 59347, 23471, 36639, 49924, 14116, 27447, 57175, 8559, 27285, 46767, 49835, 3784, 23192, 59134, 12817, 32337, 35369, 54838, 25158, 44657, 64105, 42340, 61069, 12972, 18095, 35543, 57024, 25327, 40032, 55199, 3006, 32683, 46038, 59331, 23531, 58456, 44981, 29570, 1951};
        getOutputFormats = -4251455505075021844L;
        getOutputMinFrameDuration = 1174912611;
        getHighSpeedVideoSizesFor = -408872998;
        getHighSpeedVideoSizes = -2131680278;
        getOutputMinFrameDurationlomOqCM = new byte[]{86, 93, 77, 4, -29, 64, com.google.common.base.Ascii.SI, -30, 82, 121, -89, 76, 85, 66, -5, -62, -14, -87, 8, -11, -76, 18, -17, -59, -4, -61, -13, -86, 9, -10, -75, 7, -52, -11, -9, -41, -94, 87, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 84, -93, -92, 77, -87, 91, 77, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 92, 44, -42, -58, -33, -42, -37, -56, -33, com.visa.cbp.getEncExpo.kernelVersion, 34, -57, 36, -60, -55, 32, -40, -40, -40, -40, -40};
    }
}
