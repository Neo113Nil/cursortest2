package util.h.xy.ef;

/* loaded from: classes18.dex */
public final class rb {
    private static java.security.SecureRandom Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static final java.lang.Object getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static boolean getOutputFormats = false;
    private static final java.util.Map<java.lang.String, java.lang.Object[]> getOutputMinFrameDuration;
    private static boolean getOutputMinFrameDurationlomOqCM;
    private static long getOutputSizes;
    private static final java.security.Permission getOutputSizeshNQ4ISI;
    private static final java.security.Permission getOutputStallDuration;
    private static final java.security.Permission getOutputStallDurationlomOqCM;
    private static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> isOutputSupportedForhNQ4ISI;
    private static char[] toString;

    public static final class ra {
        private static char[] Camera2StreamConfigurationMap = null;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static long getInputFormats;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.ef.rb.ra f2149;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.ef.rb.ra f2150;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.ef.rb.ra f2151;
        private final java.lang.String getHighSpeedVideoSizesFor;
        private final java.lang.Class getOutputMinFrameDuration;

        private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            int i3 = getHighSpeedVideoFpsRangesFor + 25;
            getHighSpeedVideoFpsRanges = i3 % 128;
            int i4 = i3 % 2;
            while (rbVar.f2651 < i) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 105) % 128;
                jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
                rbVar.f2651++;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 65) % 128;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        static {
            getHighSpeedVideoFpsRangesFor();
            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((maximumFlingVelocity >> 16) + 14, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, (char) (3830 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr);
            f2149 = new util.h.xy.ef.rb.ra(((java.lang.String) objArr[0]).intern(), util.h.xy.eb.a.class);
            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
            int blue = android.graphics.Color.blue(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(15 - trimmedLength, 14 - blue, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41924), objArr2);
            f2150 = new util.h.xy.ef.rb.ra(((java.lang.String) objArr2[0]).intern(), util.h.xy.ep.b.class);
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((maxKeyCode >> 16) + 16, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 29, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            f2151 = new util.h.xy.ef.rb.ra(((java.lang.String) objArr3[0]).intern(), util.h.xy.ep.c.class);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 105) % 128;
        }

        static /* synthetic */ java.lang.Class getHighSpeedVideoFpsRanges(util.h.xy.ef.rb.ra raVar) {
            int i = getHighSpeedVideoSizes;
            int i2 = i + 75;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            java.lang.Class cls = raVar.getOutputMinFrameDuration;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            getHighResolutionOutputSizeshNQ4ISI = (i + 53) % 128;
            return cls;
        }

        static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ef.rb.ra raVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoSizes = i % 128;
            java.lang.String str = raVar.getHighSpeedVideoSizesFor;
            if (i % 2 == 0) {
                return str;
            }
            throw null;
        }

        private ra(java.lang.String str, java.lang.Class cls) {
            this.getHighSpeedVideoSizesFor = str;
            this.getOutputMinFrameDuration = cls;
        }

        static void getHighSpeedVideoFpsRangesFor() {
            Camera2StreamConfigurationMap = new char[]{37522, 1420, 48270, 22482, 52967, 25059, 6158, 45884, 10846, 56667, 29803, 60550, 34708, 16014, 16288, 43188, 4528, 64233, 25538, 52445, 46369, 7680, 34672, 28748, 55637, 16830, 10885, 37777, 31975, 40037, 2922, 45648, 22797, 49156, 28447, 5872, 48604, 9389, 54189, 31393, 57960, 35155, 12376, 57148, 17946};
            getInputFormats = -6235445024465220839L;
        }
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 7) % 128;
        objArr[0] = str;
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 11, 25 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (54500 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
            getOutputStallDurationlomOqCM = new util.h.xy.ef.d(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 37 - android.view.KeyEvent.normalizeMetaState(0), (char) (2382 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
            getOutputStallDuration = new util.h.xy.ef.d(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.Color.green(0) + 19, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 55, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
            getOutputSizeshNQ4ISI = new util.h.xy.ef.d(((java.lang.String) objArr3[0]).intern());
            isOutputSupportedForhNQ4ISI = new java.lang.ThreadLocal<>();
            getOutputMinFrameDuration = java.util.Collections.synchronizedMap(new java.util.HashMap());
            getHighSpeedVideoSizes = new java.lang.Object();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(128 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 73, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
            java.math.BigInteger bigInteger = new java.math.BigInteger(((java.lang.String) objArr4[0]).intern(), 16);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(39 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 201, (char) android.view.KeyEvent.normalizeMetaState(0), objArr5);
            java.math.BigInteger bigInteger2 = new java.math.BigInteger(((java.lang.String) objArr5[0]).intern(), 16);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(176 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 241, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr6);
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(((java.lang.String) objArr6[0]).intern(), 16);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 369, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 43940), objArr7);
            util.h.xy.ep.c cVar = new util.h.xy.ep.c(bigInteger, bigInteger2, bigInteger3, new util.h.xy.ep.d(util.h.xy.fa.d.m26803(((java.lang.String) objArr7[0]).intern()), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.getDefaultSize(0, 0) + 192, 409 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 48714), objArr8);
            java.math.BigInteger bigInteger4 = new java.math.BigInteger(((java.lang.String) objArr8[0]).intern(), 16);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 600, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr9);
            java.math.BigInteger bigInteger5 = new java.math.BigInteger(((java.lang.String) objArr9[0]).intern(), 16);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 640 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr10);
            java.math.BigInteger bigInteger6 = new java.math.BigInteger(((java.lang.String) objArr10[0]).intern(), 16);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoSizes(41 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.View.resolveSize(0, 0) + 833, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr11);
            util.h.xy.ep.c cVar2 = new util.h.xy.ep.c(bigInteger4, bigInteger5, bigInteger6, new util.h.xy.ep.d(util.h.xy.fa.d.m26803(((java.lang.String) objArr11[0]).intern()), 263));
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoSizes((longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)) + 255, android.text.TextUtils.indexOf("", "", 0) + 873, (char) (46510 - android.view.View.getDefaultSize(0, 0)), objArr12);
            java.math.BigInteger bigInteger7 = new java.math.BigInteger(((java.lang.String) objArr12[0]).intern(), 16);
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoSizes(40 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.getCapsMode("", 0, 0) + 1129, (char) (12645 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr13);
            java.math.BigInteger bigInteger8 = new java.math.BigInteger(((java.lang.String) objArr13[0]).intern(), 16);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 256, 1169 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (36442 - android.view.KeyEvent.normalizeMetaState(0)), objArr14);
            java.math.BigInteger bigInteger9 = new java.math.BigInteger(((java.lang.String) objArr14[0]).intern(), 16);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoSizes(40 - android.view.KeyEvent.normalizeMetaState(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1425, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29749), objArr15);
            util.h.xy.ep.c cVar3 = new util.h.xy.ep.c(bigInteger7, bigInteger8, bigInteger9, new util.h.xy.ep.d(util.h.xy.fa.d.m26803(((java.lang.String) objArr15[0]).intern()), 92));
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoSizes(511 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1465 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 31424), objArr16);
            java.math.BigInteger bigInteger10 = new java.math.BigInteger(((java.lang.String) objArr16[0]).intern(), 16);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.KeyEvent.normalizeMetaState(0) + 64, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1976, (char) android.view.View.combineMeasuredStates(0, 0), objArr17);
            java.math.BigInteger bigInteger11 = new java.math.BigInteger(((java.lang.String) objArr17[0]).intern(), 16);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 512, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 2042, (char) (754 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr18);
            java.math.BigInteger bigInteger12 = new java.math.BigInteger(((java.lang.String) objArr18[0]).intern(), 16);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63, 2553 - android.text.TextUtils.indexOf("", "", 0), (char) (android.graphics.Color.blue(0) + 16016), objArr19);
            util.h.xy.ep.c cVar4 = new util.h.xy.ep.c(bigInteger10, bigInteger11, bigInteger12, new util.h.xy.ep.d(util.h.xy.fa.d.m26803(((java.lang.String) objArr19[0]).intern()), 497));
            getHighSpeedVideoSizes(util.h.xy.ef.rb.ra.f2151, cVar, cVar2, cVar3, cVar4);
            getHighSpeedVideoSizes(util.h.xy.ef.rb.ra.f2150, getHighSpeedVideoSizes(cVar), getHighSpeedVideoSizes(cVar2), getHighSpeedVideoSizes(cVar3), getHighSpeedVideoSizes(cVar4));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        int i2;
        int i3 = getInputFormats + 71;
        int i4 = i3 % 128;
        getHighSpeedVideoSizesFor = i4;
        if (i <= 1024) {
            i2 = 160;
        } else if (i <= 2048) {
            i2 = 224;
        } else if (i <= 3072) {
            getHighSpeedVideoSizesFor = i4;
            i2 = i3 % 2 == 0 ? 14689 : 256;
        } else {
            i2 = i <= 7680 ? 384 : 512;
        }
        getInputFormats = (getHighSpeedVideoSizesFor + 101) % 128;
        return i2;
    }

    private static util.h.xy.ep.b getHighSpeedVideoSizes(util.h.xy.ep.c cVar) {
        util.h.xy.ep.b bVar = new util.h.xy.ep.b(cVar.m26654(), cVar.m26652(), cVar.m26653(), getHighSpeedVideoFpsRanges(cVar.m26654().bitLength()), 0, null, new util.h.xy.ep.rc(cVar.m26655().m26656(), cVar.m26655().m26657()));
        getHighSpeedVideoSizesFor = (getInputFormats + 37) % 128;
        return bVar;
    }

    private static <T> void getHighSpeedVideoSizes(util.h.xy.ef.rb.ra raVar, T... tArr) {
        int i = getHighSpeedVideoSizesFor + 3;
        getInputFormats = i % 128;
        if (i % 2 == 0 ? util.h.xy.ef.rb.ra.getHighSpeedVideoFpsRanges(raVar).isAssignableFrom(tArr[0].getClass()) : util.h.xy.ef.rb.ra.getHighSpeedVideoFpsRanges(raVar).isAssignableFrom(tArr[1].getClass())) {
            getHighSpeedVideoFpsRanges(raVar, tArr);
            getOutputMinFrameDuration.put(util.h.xy.ef.rb.ra.getHighResolutionOutputSizeshNQ4ISI(raVar), tArr);
            getHighSpeedVideoSizesFor = (getInputFormats + 7) % 128;
        } else {
            int indexOf = android.text.TextUtils.indexOf("", "", 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(indexOf + 25, android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    private static <T> void getHighSpeedVideoFpsRanges(util.h.xy.ef.rb.ra raVar, T[] tArr) {
        java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> threadLocal = isOutputSupportedForhNQ4ISI;
        java.util.Map<java.lang.String, java.lang.Object[]> map = threadLocal.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            threadLocal.set(map);
            int i = getHighSpeedVideoSizesFor + 29;
            getInputFormats = i % 128;
            int i2 = i % 2;
        }
        map.put(util.h.xy.ef.rb.ra.getHighResolutionOutputSizeshNQ4ISI(raVar), tArr);
        getInputFormats = (getHighSpeedVideoSizesFor + 87) % 128;
    }

    static void getHighSpeedVideoFpsRanges() {
        toString = new char[]{64282, 64275, 64270, 64326, 64269, 64287, 64285, 64271, 64258, 64283, 64268, 64267, 64301, 64290, 64262, 64284, 64257, 64263};
        getInputSizeshNQ4ISI = -1074857104;
        getOutputMinFrameDurationlomOqCM = true;
        getOutputFormats = true;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.security.SecureRandom m26559(java.security.SecureRandom secureRandom) {
        getHighSpeedVideoSizesFor = (getInputFormats + 99) % 128;
        if (secureRandom == null) {
            secureRandom = m26558();
        }
        int i = getHighSpeedVideoSizesFor + 67;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return secureRandom;
        }
        throw null;
    }

    static void getHighSpeedVideoSizes() {
        char[] cArr = new char[2617];
        java.nio.ByteBuffer.wrap("\u009cC²pÀE\u0016\u0011$1z#\u0088\u000eÞ\u0001ìä\u0002ãPÕfÈ´áÊ§\u0018\u0080.\u009d}t\u0093t¡\u0001÷A\u0005 [\"i\u0012¿\u0014ÍåH\u0082f\u0099\u0014ªÂ·ðÄ®Ù\\Æ\nú8\u000bÖ\u0013\u0084,²2\u0095;»7É\u001d\u001f\u001a-ns{\u0081c×På¬\u000b¾Y\u0083o¼½àÃñ\u0011É'Öt(\u009ce²tÀG\u0016P$4z=\u0088\u0015Þ#ìà\u0002ÿPÅfÞ´¬Ê\u0092\u0018\u008e.\u009f}g\u0093x¡F\u009cg²rÀ@\u0016\u0007$yzc\u0088\u0002Þ\u0014ì¹\u0002ôP\u0090f\u0083´¢Ê°\u0018\u0083.\u0090}3\u0093'¡D÷W\u0005\"[2i\u0007¿FÍ°ã 1\u0091GÔ\u0095ô«ãù×\u000f\u0095^cl!\u0082\u0016Ð\tæ#4aJT\u0098\u0014®åüô\u0012Â Óv¢\u0084µÚÐè\u0094?cM%c@±\u0003Çq\u0015i+\u0007yB\u008fàÝôó\u0090\u0001\u0087Wðeæ»\u0080É\u0094\u00181. |G\u0092\u0002 tö3\u0004XZ@hà¾¥Ì\u0096âÔ0÷Fµ\u0094\u0087ªÇù2\u000f%]\u0010s\u0002\u0081\"×då\u0004;@I³\u009fô\u00adÅÃ\u0081\u0011ù'èuØ\u008b\u0093Úbèu>\u0010L\u0002bs°0Æ\u0002\u0014\u0015*´x¡\u008eÅÜ\u0088òø\u0000àVÔdÀ»cÉu\u001fB-\u0005Cr\u00914§\u0004õF\u000b²Y¦o\u0094½\u0088Óóá´7ÐEÆ\u009c8²'À\u0013\u0016T$%z5\u0088\u0002Þ\u0012ì²\u0002§P\u0098fÒ´£Ê°\u0018Ù.\u0094}c\u0093s¡\u0013÷\u0007\u0005q[4i\u0004¿GÍãã§1ÀG\u0080\u0095ó«çù\u0085\u000fÈ^2l%\u0082\u0017ÐTær4iJ\u0002\u0098D\u009c7²&À\u0019\u0016\u0005$vz`\u0088\u0003ÞCì¶\u0002ðP\u0098fÒ´§Êå\u0018Õ.\u0094}d\u0093(¡\u0010÷P\u0005u[hi\u0002¿DÍ°ã¥1\u0096GÕ\u0095£«àù\u0080\u000fÈ^`lp\u0082GÐ\u0003æu4eJ\u0007\u0098A®´üð\u0012\u0095 \u0082võ\u0084µÚ×èÅ?9M'c\u0018±\u0002Çp\u00155+Sy\u0015\u008f°Ý¥ó\u0093\u0001\u0086Wðe³»ØÉ\u0094\u00182.$|\u0011\u0092\u0002 qö3\u0004VZ@hç¾õÌ\u0096â\u00820¥F°\u0094ÐªÆù8\u000f!]\u0017s\b\u0081#×båS;\u0014I³\u009f¨\u00ad\u0092Ã\u0084\u0011÷'âuÑ\u008b\u0094Ú0èr>\u0013L\u0001bw°cÆR\u0014D*µxõ\u008e\u0091ÜÕò \u0000ãVÑd\u0090»7Ér\u001f\u0015-\u0000Cw\u00914§TõA\u000bãYôo\u0096½\u0088Óõá²7\u0080EÅ7Ç\u0019\u008dk³½¬\u008f\u0086ÑÍ#÷u·G\u0016©\u0000ûaÍ\"\u001fUa\u0010³t\u00857Ö\u00948Ó\nã\\¬®Ôð\u0097Â÷\u0014íf@H\u0006\u009a2ìt>S\u0000GR ¤6õÁÇÖ)¶{¡MÑ\u009fÅáü3·\".\fb~\u000e¨M\u009a?Ä)6\u001e`\u0002Rò¼¿îØØÎ\n¾tý¦\u0098\u0090\u008cÃ(-b\u001f\\I\u001d»må\u007f×\u0018\u0001\u000esý]ì\u008fÚùÉ+»\u0015ùG\u0093±ÞàyÒn<\bnBXh\u008a\u007fô\u001f&\b\u0010®Bâ¬Ù\u009eÌÈé:¨dÊV\u0082\u0081}ólÝ[\u000f\u001dyi«~\u0095HÇ\u000e1¯cãMÒ¿ËéºÛ¯\u0005\u009aw\u0082¦y\u0090iÂ\u000f,I\u001ehH(ºIä\bÖª\u0000¿rÙ\\Ï\u008e³ø«*\u009b\u0014\u0082Gx±lãRÍB?3i-[\u0012\u0085_÷ú!¾\u0013Ó}Ï¯½\u0099úËÊ5Ùd\u007fVb\u0080\rò\u001aÜi\u000e+xJª_\u0094ùÆí0\u008fbÉLè¾þè\u009dÚÚ\u0005ywi¡Y\u0093Jý2/\u007f\u0019\u001fK\fµûç¹Ñ\u0088\u0003\u009em¼_ÿ\u0089\u009cû\u008c*|\u0014?F_°\u001aâ9Ì*>MhYZ®\u0084âö\u0088 É\u0012¼|«®É\u0098\u008eË|5=g]QK\u0083<í+ß\u001b\t\t{\u00ad¥è\u0097\u0088Á\u009e3í\u001d£O\u0098¹\u0082èxÚm\u0004RvO h\u0092}ü\u001f.\u000e\u0018®J¾´ØæÍÐ³\u0002£lÈ^\u008a\u0089zû:%S\u0017\u0018A>³-\u009dJÏY9úkéUÜ\u0087\u009añ¸#ÿ\rÊ\u007fÝ\u009c8²rÀE\u0016S$%zi\u0088UÞ\u0012ì¸\u0002÷P\u0090fÐ´¢Êã\u0018\u0087.Â}9\u0093u¡\u0011÷W\u0005y[ai\u0007¿EÍ³ãð1ÃG\u0088\u0095ô«ãù\u0084\u000fÆ^2l\"\u0082\u0019ÐSæ'4dJP\u0098@\u009c2²!À\u0015\u0016\u0006$qz0\u0088\u0005ÞDìà\u0002¡P\u0091f\u0084´§Ê³\u0018Ð.Å}b\u0093t¡\u0013÷U\u0005x[5i\u0002¿\u0015Í¹ã¦1ÄG\u0082\u0095ù«³ù\u0082\u000fÆ^el \u0082CÐ\u0000æ\"4dJ\u0007\u0098\u0010®âüó\u0012À Ôv¢\u0084³Ú\u0084èÈ?4Mwc\u0010±\bÇq\u00150+\u0000yF\u008fàÝ¢ó\u0090\u0001ÕWóeâ»\u0082ÉÅ\u0018e.s|C\u0092R #ö4\u0004QZGh°¾¦Ì\u0095â\u00840õFå\u0094ÕªÁù0\u000fp]\u0014sS\u0081s×2åQ;CI±\u009f¨\u00ad\u0097Ã\u0084\u0011¥'éu\u0082\u008bÃÚcèu>\u0013L\u0000bv°`Æ\u0005\u0014B*·x§\u008e\u0099Ü\u0085òõ\u0000äVÖdÆ»0Éw\u001f\u0016-\u0005C#\u00910§QõI\u000bµYõo\u0093½\u0081Óóáè7\u0085EÉ\u00942ªrø\u0010\u000eR\\prd\u0080YÖDäµ:¦HÇ\u009e\u0082¬ Âè\u0010\u0087&Àu`\u008b#Ù\u0016ï\u0000=tS3a\u0004·CÅ²\u001bõ)\u0094\u007f\u0080\u008d £´ñÕ\u0007\u0095V2dtº\u0014ÈP\u001ep,7BW\u0090\u0010¦¶ô¡\n\u0097X\u0085n§¼âÒÐàÇ78E\"\u009b\u0012©Pÿr\re#Wq\u0015\u0087²Õ÷ë\u00949\u0083Oø\u009dã³ÔÁÃ\u009c6²&ÀE\u0016\u0001$'zi\u0088\u0002ÞEìå\u0002ðPÅf\u0080´ôÊ´\u0018\u0083.É}b\u0093%¡G÷\u0003\u0005'[ii\u0005¿GÍ¶ã£1\u0097GÒ\u0095¤«·ù\u0085\u000fÈ^7lu\u0082\u0014ÐSæ#4bJX\u0098H)É\u0007Ûu¸£ù\u0091ÚÏÌ=÷kîY\u001e·[å8Ó*\u0001^\u007fM\u00ad}\u009bfÈ\u009a&\u008d\u0014ëBù°Ûî\u009eÜö\n¼x\u001dVZ\u0084jò| \n\u001eKL*ºhëÉÙ\u00897¾e®S\u008d\u0081Èÿú-í\u001b\u001cI\\§j\u0095yÃ[1Ko\u007f]o\u008aÌø\u008cÖ¾\u0004úrÜ \u0099\u009e÷Ìï:Mh\tF:´.â]ÐI\u000ey|f\u00ad\u009b\u009b\u008aÉº'û\u0015ÛCÏ±ýïíÝ\u001a\u000b\u000eyiW}\u0085ZóF!|\u001f;L\u0097ºÛèºÆ§4\u0089b\u009eP\u00ad\u008e¹üL*\n\u0018iv*¤\r\u0092\u001eÀ|>ooÉ]\u0089\u008bìùý×Ö\u0005\u009dsú¡ê\u009f\u0019Í\\;ki(GWµNã|Ñ=\u000e\u0097|\u008fª¾\u0098ûöÜ$Ë\u0012ù@¹¾Iì\rÚ9\b)fYTO\u0082-ðh!\u0099\u001fÝM¶»¦éÚÇÏ5®cêQN\u008f\u000bý6+y\u0019Vw\u0019¥*\u0093gÀ\u009f>\u008bl¸Zý\u0088ÞæÏÔý\u0002ípL®\r\u009c;Êy8\r\u0016\u001dD.²fãËÑ\u0088\u000fé}ú«\u008d\u0099È÷¬%é\u0013\u001eA]¿ií'Û\\\t\u001dgzUh\u0082Êð\u0088.ì\u001c©J\u008e¸Ç\u0096®Äé2\u001e`\n^?\u008cyú_(K\u0006)t=¥\u0097\u0093\u008cÁé?©m\u008b[Ì\u0089¬çêÕ\u001e\u0003Zql¯,\u009d_ËM9|\u0017jD\u009a²\u008bà¾Þ¬\fÚz\u009e¨þ\u0086éô\u0016\"\u000e\u0010<N-¼\têIØx6jgÉU\u008c\u0083îñú/Ý\u001d\u009dKù¹î\u0097KÅ\b3=a~_\n\u008d\u0019û))m\u0006\u009dt\u008d¢¿\u0090¬ÎÞ<ÆjöX»¶Kä\u000eÒ;\u0000'~_¬N\u009a,Èh\u00ad]\u0083Cñr'd\u0015\u0011K\u0004¹<ïrÝÕ3ÁaöWç\u0085\u0094ûÖ)ç\u001f÷L\u0006¢F\u0090}Æf4Fj\rX<\u008e&ü\u0085ÒÆ\u0000¡v¶¤\u009c\u009a\u0080È´>öo\u0002]D³qál×\u0015\u0005W{b©!\u0012=<|N\u001e\u0098Zªzô;\u0006\u0003P\u001eb¿\u008cýÞÂè\u0089:¨Dï\u0096ß Îó8\u001d)/\u0019y\b\u008bzÕiç\u000e1HCèmý¿\u0099ÉÓ\u001b®%¼wÙ\u0081\u0092Ðlâr\fB^_hzºmÄY\u0016I ½rª\u009cÈ®\u008aøþ\nêT\u0083f\u0099±=ÃríN?\\I/\u009bh¥\u000b÷I\u0001èS¯}Ë\u008fÜÙ£ë¹5\u008dG\u009c\u0096n zòN\u001cR..x<\u008a\u0003ÔNæ¹0ªB\u009flß¾®È²\u001a\u008f$Íw>\u0081}ÓLýZ\u000f+Y<k\nµ\u001bÇã\u0011ú#ÃMÛ\u009fù©¿û\u008f\u0005\u0092Tjf}°LÂZì)>8H^\u009a\u0013¤ïö¨\u0000ÉRÓ|ª\u008e½Ø\u008aê\u009859G|\u0091\u0018£\rÍ+\u001f2)\b{\u0019\u0085ã×¨á\u00983Ó]úo½¹ÞË\u009a\u001ah$(vJ\u0080]Ò,üj\u000e\u0003XIjî´ÿÆÌ\u0010\u0088\"£Lï\u009e\u0089¨\u0093û>\u0005{W\u001aaX³zÝnï\n9NKé\u0095©§\u0099ñØ\u0003ú-½\u007f\u008c\u0089\u009eØbêz4MF\u000e\u0090z¢8Ì\f\u001eM(ëz©\u0084\u009dÖ\u008aà©2º\\\u0088n\u009e¹mËy\u0015\u001d'Zq}\u0083i\u00ad\rÿ\u0019\tì[ªeË·ÚÁ©\u0013¿=\u0088OÉ\u009e8¨(ú\u001a\u0004_V}`:²YÜNîº8óJÎ\u0094Ú¦¢ð»\u0002\u0083,\u0092\u007f:\u0089sÛCåX7\u007fAm\u0093^½\u001aÏî\u0019ª+\u009euÞ\u0087¢Ñíã\u008b\r\u009d\\bny¸CÊ\t\u0014-&=p\u000e\u0082N¬ãþû\bÌZ\u0089d®¶¾À\u0089\u0012\u009e=mO\u007f\u0099K«Zõ/\u0007hQ\bcI\u008d½ß®é\u0098;\u008dE¯\u0097²¡\u0089óÊè\u000fÆC´\"b6PB\u000eRüoª~\u0098\u0083v\u0095$¥\u0012¾À\u0093¾Òl²Zñ\t\u000fç\u001eÕr\u0083bqG/V\u001d2Ëq¹\u0087\u0097\u0096E¯3æáÅßÔ\u008dà{¢*\u0005\u0018Döv¤b\u0092A@S>4ì#æøÈäºÕlÆ^´\u0000òòÇ¤\u0084\u0096%xh*R\u001c\u0014Î4°(b\u0017TR\u0007òé·Û\u0082\u008d\u0095\u007f°!õ\u0013\u0098Å\u0081·s\u00990K\u0005=\u0015ï1Ñ#\u0083Gu\u0005$ó\u0016æø\u0087ªÄ\u009cçN¢0Ââ\u0086Ôs\u0086`hQZB\f0þ\" C\u0092SEõ7ä\u0019\u0087Ë\u0093½µoõQ\u0094\u0003Óõ#§c\u0089\u0004{D-g\u001ftÁ\u0010³Rb£Tµ\u0006×èÆÚ¹\u008cò~Å \u0085\u0012#Ä3¶\u0005\u0098\u0015J9<%îBÐ\b\u0083ùuâ'×\t\u0093ûä\u00ad \u009fÇA\u00823på2×Q¹Fk6]&\u000f\u0016ñ\u0003 ô\u0092°D\u00846\u0093\u0018·Êò¼\u0093n×P\"\u0002bôY¦\u0013\u00889z$,G\u001e\u0005Áù³áeÖWÇ9çëðÝ\u0096\u008f\u0087q##2\u0015\u0005ÇI©0\u009b%M\u0017?Rî¢Ðé\u0082Øt\u0090&·\b÷úÃ¬\u0083\u009e'@f2QäGÖe¸uj\u0016\\\u0000\u000føñé£Ø\u0095ÉGâ)£\u001b\u0091Í\u0089¿ra5S\u0002\u0005I÷eÙ)\u008b\u0018}\u0007,§\u001eéÀÕ²Ád·V£8Äê\u0083Ü\"\u008ehp\u0002\"H\u00145Æu¨\u0010\u009a\u0002Mö?³áÑÓÄ\u0085µwðY\u0099\u000bÕýy¯a\u0091XCG5`çuÉC»\tj¥\\ä\u000eÐðÈ¢´\u0094£F\u0092(\u0088\u001ayÌ4¾\u0004`\u0012R`\u0004)ö\u0014Ø\u0003\u008b }á/\u0080\u0011\u0097Ã°µ£gÅI×;yíbß\u0004\u0081Es6%$\u0017@ùP¨÷\u009aäL\u0085>ÅàäÒò\u0084\u0091vÒXr\niü\u0000®H\u00904B'4\u0011æUÉô»çm×_À\u0001°ó©¥\u0097\u0097×y'+h\u001dYÏ\u0013±8cwUB\u0007\bö¤Ø³\u008a×|Á.ä\u0010ôÂÄ´\u0089f#Ha:RìAÞ2\u0080&r\u0017$S\u0017óùâ«×\u009d\u0093Oâ1¦ã\u0092ÕÓ\u0087$ib[\u0000\r\u0012ÿe¡s\u0093EE\u00064õæ·È\u0085ºÇl°^ò\u0000\u0090òÕ¤s\u0096exV*D\u001cgÎp°\u0012b\u0001Uö\u0007æé\u0083ÛÉ\u008dç\u007f¡!\u0099\u0013\u0081Åu·g\u0099VKI=9ï ÑG\u0083Wrö$´\u0016Ðø\u0092ªà\u009c¤N\u00970×â$Ô4\u0086QhGZ7\fuþ\u0016 \b\u0093ôEá7×\u0019\u0090Ëå½ôo\u0094Q\u0080\u0003$õ5§\u0003\u0089\u0013{4-%\u001f\u0015Á\u0002° bäT×\u0006Âè¸Ú£\u008c\u0096~Õ #\u00122ÄU¶\u0013\u0098`J$<\u0013î\u0001Ññ\u0083éu×'Æ\tµû§\u00ad\u0090\u009f\u0086At32åY×I¹9k$]\u0018\u000f\u0003þô ´\u0092\u0083D\u00926·\u0018¥ÊÂ¼\u0087npPe\u0002VôH¦1\u0088'z\u0016,\u0006\u001fòÁå³ØeÇW¸9¨ë\u0091ÝÒ\u008f#qf#P\u0015EÇd©r\u009b\u0017M\u0007<öîâÐÑ\u0082Åtä&£\b\u0097ú\u0080¬'\u009e0@\u00042\u0014ä2Ö\"¸Cj\u0002]¢\u000f³ñ\u0085£\u0097\u0095±G¡)\u0099\u001bÔÍq¿2aRS\u0017\u0005`÷(Ù\u0011\u008b\u0007zô,á\u001e\u0085ÀÈ²¶dõV\u00928\u0088êqÜh\u008e\u0002pH\"3\u0014&Æ\u0014¨S\u009b§Må?\u0080á\u0092Ó¹\u0085§wÇY×\u000b\"ý3¯R\u0091\u0015C15\"çDÉ\u0007¸¥j·\\\u0082\u000eÉðà¢õ\u0094ÀF\u0084(x\u001abÌU¾C`5R#\u0004EöUÙ÷\u008bµ}Ò/\u0093\u0011âÃòµÀg\u0083I ;eíQßG\u0081bss%\u0011\u0017S\u009cg²)À\u0010\u0016\t$rzg\u0088WÞIìã\u0002ðP\u0094f×´¢Êä\u0018\u0083.\u0093}1\u0093'¡C÷\u0004\u0005x[iiP¿\u0014Í·ãõ1\u0099GÓ\u0095ö«èùÔ\u000f\u0095^2l!\u0082CÐ\tæx4fJY\u0098\u0015®µü¢\u0012Â Ðvñ\u0084´Ú\u0082èÄ?6M#cD±\u0002Çv\u00154+QyH\u008f¸Ý¢ó\u0098\u0001ÐWøeæ»ÖÉÂ\u009eÄ°ÒÂ´\u0014¥&ÒxÂ\u008a©Üäî\u0011\u0000UR2ds¶TÈ\u0018\u001a(,c\u007f\u0093\u0091Ù£åõö\u0007ÕY\u0090k¨½·ÏHáW35E#\u0097\u0003©Fû#\ra\\ÀnÙ\u0080²Ò¢äÑ6\u0095Hö\u009a´¬Hþ\u0002\u0010h\"xt\t\u0086AØ'ê4=\u0091O\u0081a¶³õÅ\u0083\u0017\u0091)§{´\u008d\u0011ß\u0001ñ`\u0003&URgE¹'Ëe\u001aÃ,\u0083~å\u0090¢¢\u0088ôÆ\u0006óXäjG¼\u0001Îeàs2RDE\u0096v¨5ûÆ\rÓ_²qð\u0083ÕÕ\u0099ç¨9µKF\u009dP¯cÁr\u0013\b%\u0019w&\u00890Ø\u0091êÙ<åNñ`\u0087²ÆÄ¤\u0016°(AzT\u008c4Þsð\u0003\u0002\u0012T%ff¹\u0093Ë×\u001dé/öA\u0082\u0093Â¥ö÷±\t\u0015[Pmd¿yÑ\u0003ã\u00175 Gd\u0096Ç¨Öú´\fñ^\u0083p\u0091\u0082¤ÔáæG8VJa\u009cs®\u0007ÀE\u0012'$9wÂ\u0089\u0086Ûãí¦?\u0080QÄcòµ¸ÇE\u0019Y+4}p\u008f\t¡\u0015óu\u00054T\u0091fÕ¸²Êù\u001c\u0083.\u0092@ \u0092²¤Dö\u0006\b`Zwl\t¾EÐsâf5ÂG\u0085\u0099¶«ðý\u0089\u000fÃ!§s¹\u0085G×Tée;rMR\u009f\u0010±'Ã7\u0012À$\u0085vá\u0088óÚ\u0085ì\u0090>§P¸bB´\u0005Æ4\u0018u*\u0007|D\u008et fóÇ\u0005ÙWäiù»\u0087Í\u0099\u001fô1ãC\u0015\u0095\u0006§bùs\u000bS]Bo)\u00816Ð\u0096âÑ4èFó\u0098\u0080ª\u0096ü¡\u000e¹ FrU\u00843ÖtèU:BLs\u009e9±ÃÃ\u0083\u0015é'£y\u0087\u008b\u0091Ýóïµ\u0001FS\u0002ei·rÉ\u0005\u001b\u0019-%\u007f5\u008e\u0091 ×òå\u0004¦V\u0089h\u0094ºóÌã\u001e\u00130\u0006Ba\u0094t¦\u0004ø\u0019\nq\\coÄ\u0081ÓÓ´åõ7\u0088I\u0096\u009bô\u00ad°ÿ\u0012\u0011\u0005#5u%\u0087\u0004Ù\u0013ë\"=5LÁ\u009e\u0082°àÂ¢\u0014\u0082&\u0092x¨\u008a·ÜCîT\u0000iR$d\u0006¶\u0018Èt\u001ae-À\u007f\u0084\u0091á£ôõ\u0084\u0007\u0094Y k³½\u0016ÏQác3%E\b\u0097\u0010©\"ûf\nÄ\\Ñnä\u0080öÒÔä\u00986¨H²\u009a\u0015¬Pþe\u0010w\"QtF\u0086!Ø9ë\u0092=ÖO¶aö³\u0082Å\u0097\u0017¥)ã{F\u008dVßgñv\u0003SU\u0018gv¹aÈÀ\u001a\u0085,ã~£\u0090Ñ¢\u0092ô§\u0006±XCj\u0001¼cÎrà\u00052\u0017Dv\u0096d©Áû\u0082\râ_÷qÔ\u0083\u0090Õ¦ç³9IK\u0006\u009df¯yÁ\u0005\u0013E%#w4\u0086ÇØ\u0084êè<¤N\u0081`Ã²öÄ¹\u0016\u0011(\u0003zh\u008cqÞ\tðA\u0002\"T6g\u0093¹\u0081Ëé\u001d¢/\u0080A\u0094\u0093ó¥â÷@\t\u0005[2my¿RÑ\u0017ãr50DÃ\u0096Õ¨éúø\f\u0088^Äp¡\u0082µÔ\u0012æ\u000281J#\u009c\u0006®\u0015À\"\u00121%Âw\u0081\u0089åÛõí\u0082?\u0093Q©cãµ\u0016Ç\u0003\u0019g+%}\u0005\u008f\u0018¡vóa\u0002\u0095TÓfè¸¤Ê\u0087\u001c\u0092.¥@°\u0092\u0011¤\u0002öi\byZ\tl\u0011¾vÐfã\u00925\u0083Gé\u0099÷«\u0081ý\u0093\u000f¤!°sB\u0085U×6é%;\bMC\u009fu±0ÀÄ\u0012\u0083$ävó\u0088\u0089Ú\u0099ìñ>äPIbV´eÆv\u0018\t*B|u\u008e9¡Áó\u0081\u0005åWôi\u0086»ÆÍ¤\u001f¹1GCX\u0095f§yù\u0003\u000bC]'oa¢ó\u008c±þÓ(\u0095\u001aåDð¶Æà×Ò!<0nSX\u0014\u008ahô\"&\u0013\u0010\u0002C¨\u00adå\u009f\u0089ÉÀ;²eùW\u0097\u0081Øó\"Ý4\u000fRy@«5\u0095 Ç\u00141\u0002`¥Rç¼\u0084îÇØ³\n£tÃ¦\u0087\u0090#Â2,\u0006\u001e\u0019HdºwäAÖX\u0001ðsä]\u0085\u008f\u0097ùç+ö\u0015ÅGÙ±uã8ÍS?\u0014i0[t\u0085B÷W".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2617);
        getHighSpeedVideoFpsRangesFor = cArr;
        getOutputSizes = 909605153525379601L;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.security.SecureRandom m26558() {
        java.security.SecureRandom secureRandom;
        java.security.SecureRandom secureRandom2;
        java.lang.Object obj = getHighSpeedVideoSizes;
        synchronized (obj) {
            secureRandom = Camera2StreamConfigurationMap;
        }
        if (secureRandom != null) {
            return secureRandom;
        }
        try {
            int doubleTapTimeout = 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bytes = "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081".getBytes("ISO-8859-1");
            util.h.xz.b.md mdVar = new util.h.xz.b.md();
            char[] cArr = toString;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr2[i] = (char) (cArr[i] ^ (-3299939579226817547L));
                }
                cArr = cArr2;
            }
            int i2 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
            if (getOutputFormats) {
                mdVar.f2642 = bytes.length;
                char[] cArr3 = new char[mdVar.f2642];
                mdVar.f2643 = 0;
                while (mdVar.f2643 < mdVar.f2642) {
                    cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + doubleTapTimeout] - i2);
                    mdVar.f2643++;
                }
                java.lang.String str = new java.lang.String(cArr3);
                java.lang.String str2 = str;
                java.security.SecureRandom secureRandom3 = (java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null);
                synchronized (obj) {
                    if (Camera2StreamConfigurationMap == null) {
                        Camera2StreamConfigurationMap = secureRandom3;
                    }
                    secureRandom2 = Camera2StreamConfigurationMap;
                }
                return secureRandom2;
            }
            if (getOutputMinFrameDurationlomOqCM) {
                throw new java.lang.NullPointerException();
            }
            throw new java.lang.NullPointerException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
