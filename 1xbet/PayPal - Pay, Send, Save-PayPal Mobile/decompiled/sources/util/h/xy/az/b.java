package util.h.xy.az;

/* loaded from: classes5.dex */
public class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static long getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static byte[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static short[] getOutputMinFrameDuration;
    private static final java.lang.String getOutputMinFrameDurationlomOqCM;
    private static char[] getOutputStallDurationlomOqCM;
    private boolean getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private util.h.xy.az.b.EnumC0259b getOutputStallDuration;
    private byte[] getValidOutputFormatsForInputhNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.String> isOutputSupportedFor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: util.h.xy.az.b$b, reason: collision with other inner class name */
    public static final class EnumC0259b {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static short[] getHighSpeedVideoFpsRanges = null;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;
        private static final /* synthetic */ util.h.xy.az.b.EnumC0259b[] getHighSpeedVideoSizesFor;
        private static int getInputFormats = 1;
        private static int getInputSizeshNQ4ISI;
        private static byte[] getOutputFormats;
        private static int getOutputMinFrameDuration;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.az.b.EnumC0259b f912;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.az.b.EnumC0259b f913;
        private java.lang.String getOutputSizeshNQ4ISI;

        public static util.h.xy.az.b.EnumC0259b valueOf(java.lang.String str) {
            int i = getHighSpeedVideoFpsRangesFor + 107;
            getInputFormats = i % 128;
            util.h.xy.az.b.EnumC0259b enumC0259b = (util.h.xy.az.b.EnumC0259b) java.lang.Enum.valueOf(util.h.xy.az.b.EnumC0259b.class, str);
            if (i % 2 != 0) {
                return enumC0259b;
            }
            throw new java.lang.ArithmeticException();
        }

        public static util.h.xy.az.b.EnumC0259b[] values() {
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 77) % 128;
            util.h.xy.az.b.EnumC0259b[] enumC0259bArr = (util.h.xy.az.b.EnumC0259b[]) getHighSpeedVideoSizesFor.clone();
            int i = getHighSpeedVideoFpsRangesFor + 21;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                return enumC0259bArr;
            }
            throw null;
        }

        static {
            getHighResolutionOutputSizeshNQ4ISI();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 869938991, (short) ((-73) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 6), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) - 117, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 168755716, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.KeyEvent.getMaxKeyCode() >> 16) + 869938990, (short) (android.view.View.getDefaultSize(0, 0) - 74), (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 6), (-117) - android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.green(0) + 168755716, objArr2);
                util.h.xy.az.b.EnumC0259b enumC0259b = new util.h.xy.az.b.EnumC0259b(intern, 0, ((java.lang.String) objArr2[0]).intern());
                f913 = enumC0259b;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getTouchSlop() >> 8) + 869938993, (short) (android.widget.ExpandableListView.getPackedPositionGroup(0L) - 103), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 107), (-16777333) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", "") + 168755725, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 869938993, (short) ((-103) - android.graphics.Color.red(0)), (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 106), android.view.KeyEvent.getDeadChar(0, 0) - 117, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 168755724, objArr4);
                util.h.xy.az.b.EnumC0259b enumC0259b2 = new util.h.xy.az.b.EnumC0259b(intern2, 1, ((java.lang.String) objArr4[0]).intern());
                f912 = enumC0259b2;
                int i = getHighSpeedVideoFpsRangesFor + 121;
                getInputFormats = i % 128;
                int i2 = i % 2;
                getHighSpeedVideoSizesFor = new util.h.xy.az.b.EnumC0259b[]{enumC0259b, enumC0259b2};
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private EnumC0259b(java.lang.String str, int i, java.lang.String str2) {
            this.getOutputSizeshNQ4ISI = str2;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int i = getInputFormats;
            getHighSpeedVideoFpsRangesFor = (i + 103) % 128;
            java.lang.String str = this.getOutputSizeshNQ4ISI;
            int i2 = i + 57;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
            int i4;
            util.h.xz.b.me meVar = new util.h.xz.b.me();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i5 = i2 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L)));
            if (i5 == -1) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 3) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = getOutputFormats;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                    }
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 119) % 128;
                    bArr = bArr2;
                }
                i5 = bArr != null ? (byte) (((byte) (getOutputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            }
            if (i5 > 0) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 67) % 128;
                meVar.f2647 = ((i + i5) - 2) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i4;
                meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                byte[] bArr3 = getOutputFormats;
                if (bArr3 != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 125) % 128;
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
                        bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                    }
                    bArr3 = bArr4;
                }
                boolean z = bArr3 != null;
                meVar.f2645 = 1;
                while (meVar.f2645 < i5) {
                    int i8 = Camera2StreamConfigurationMap + 83;
                    getHighSpeedVideoSizes = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (z) {
                        byte[] bArr5 = getOutputFormats;
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
            objArr[0] = sb.toString();
        }

        static void getHighResolutionOutputSizeshNQ4ISI() {
            getInputSizeshNQ4ISI = 730128138;
            getHighResolutionOutputSizeshNQ4ISI = -408873044;
            getOutputMinFrameDuration = 307358107;
            getOutputFormats = new byte[]{87, -25, -106, 72, 10, 13, 36};
        }
    }

    static {
        getHighSpeedVideoSizes();
        getOutputMinFrameDurationlomOqCM = util.h.xy.az.b.class.getName();
        int i = getHighSpeedVideoFpsRanges + 45;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.az.b.EnumC0259b m25257() {
        int i = getOutputFormats;
        int i2 = i + 115;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.az.b.EnumC0259b enumC0259b = this.getOutputStallDuration;
        int i3 = i + 65;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return enumC0259b;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m25260() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 121;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr = this.getValidOutputFormatsForInputhNQ4ISI;
            if (bArr == null) {
                return 0;
            }
            int i3 = i + 77;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                return bArr.length;
            }
            int length = bArr.length;
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m25262() {
        int i = getHighSpeedVideoFpsRanges + 11;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return this.getOutputSizes;
        }
        throw null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 31) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getOutputStallDurationlomOqCM[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRangesFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 5;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                int i4 = rbVar.f2651;
                throw new java.lang.ArithmeticException();
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> m25259() {
        int i = getOutputFormats;
        getHighSpeedVideoFpsRanges = (i + 27) % 128;
        java.util.Map<java.lang.String, java.lang.String> map = this.isOutputSupportedFor;
        int i2 = i + 61;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    private b() {
        this.getOutputStallDuration = util.h.xy.az.b.EnumC0259b.f913;
        this.getOutputSizes = false;
        this.isOutputSupportedFor = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
    }

    public b(java.lang.String str, util.h.xy.az.b.EnumC0259b enumC0259b) throws java.lang.IllegalArgumentException {
        this();
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (str.length() < 4) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(220736729 - android.graphics.Color.argb(0, 0, 0, 0), (short) (15 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 107), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 69, android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 1914317304, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (enumC0259b == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.green(0) + 27, android.view.KeyEvent.normalizeMetaState(0) + 32, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        this.getOutputStallDuration = enumC0259b;
        this.getOutputSizeshNQ4ISI = str;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25264(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2)) {
            getHighSpeedVideoFpsRanges = (getOutputFormats + 111) % 128;
            if (str3 != null) {
                str2 = str3;
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        getOutputFormats = (getHighSpeedVideoFpsRanges + 25) % 128;
        this.isOutputSupportedFor.put(str, str2);
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25258(org.json.JSONObject jSONObject) throws util.h.xy.az.ma {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 107) % 128;
        try {
            java.lang.String jSONObject2 = jSONObject.toString();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.KeyEvent.getMaxKeyCode() >> 16) + 5, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 60, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            this.getValidOutputFormatsForInputhNQ4ISI = jSONObject2.getBytes(((java.lang.String) objArr[0]).intern());
            java.lang.String jSONObject3 = jSONObject.toString();
            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            getOutputFormats = (getHighSpeedVideoFpsRanges + 53) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(6 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 60 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr2);
                this.getValidOutputFormatsForInputhNQ4ISI = jSONObject3.getBytes(((java.lang.String) objArr2[0]).intern());
                this.getOutputSizes = true;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 220736770, (short) (29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) ((-23) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 69, (-1914317321) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                short offsetBefore = (short) ((-74) - android.text.TextUtils.getOffsetBefore("", 0));
                getOutputFormats = (getHighSpeedVideoFpsRanges + 95) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(keyCodeFromString + 220736782, offsetBefore, (byte) (108 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), (-69) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1914317291) - android.graphics.Color.green(0), objArr4);
                    m25264(intern, ((java.lang.String) objArr4[0]).intern(), null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (java.io.UnsupportedEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.ImageFormat.getBitsPerPixel(0) + 24, 64 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 46070), objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.az.ma(sb.toString(), 3);
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public java.net.URL m25263() throws util.h.xy.az.ma {
        try {
            java.lang.String str = this.getOutputSizeshNQ4ISI;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(220736798 + android.view.KeyEvent.normalizeMetaState(0), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1), (byte) (75 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 69, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1914317357, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(220736799 - android.graphics.Color.green(0), (short) (16 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 97), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 69, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1914317351, objArr2);
            java.net.URL url = new java.net.URL(str.replace(intern, ((java.lang.String) objArr2[0]).intern()));
            int i = getOutputFormats + 39;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return url;
            }
            throw null;
        } catch (java.net.MalformedURLException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(220736802 + android.text.TextUtils.indexOf("", ""), (short) (59 - android.view.View.getDefaultSize(0, 0)), (byte) (android.text.TextUtils.getOffsetBefore("", 0) + 20), (-70) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-1914317312) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.az.ma(sb.toString(), 3);
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25261(java.io.OutputStream outputStream) throws java.io.IOException {
        int i = getOutputFormats + 59;
        getHighSpeedVideoFpsRanges = i % 128;
        try {
            if (i % 2 == 0) {
                outputStream.write(this.getValidOutputFormatsForInputhNQ4ISI);
                getHighSpeedVideoFpsRanges = (getOutputFormats + 71) % 128;
            } else {
                outputStream.write(this.getValidOutputFormatsForInputhNQ4ISI);
                throw new java.lang.NullPointerException();
            }
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        byte[] bArr;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L)));
        boolean z = i6 == -1;
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 29) % 128;
            byte[] bArr2 = getInputFormats;
            if (bArr2 != null) {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                i6 = (byte) (((byte) (getInputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
            } else {
                i6 = (short) (((short) (getOutputMinFrameDuration[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            }
        }
        if (i6 > 0) {
            int i8 = (int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L));
            if (z) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 57;
                getHighSpeedVideoSizes = i9 % 128;
                if (i9 % 2 != 0) {
                    i4 = 1;
                    meVar.f2647 = ((i + i6) - 2) + i8 + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    bArr = getInputFormats;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr4[i10] = (byte) (bArr[i10] ^ (-2689713159175858216L));
                        }
                        bArr = bArr4;
                    }
                    boolean z2 = bArr == null;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i6) {
                        if (z2) {
                            int i11 = getHighSpeedVideoSizes + 83;
                            getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
                            if (i11 % 2 != 0) {
                                byte[] bArr5 = getInputFormats;
                                meVar.f2647 = meVar.f2647 >>> 1;
                                i5 = meVar.f2646 - (((byte) (((byte) (bArr5[r9] * (-2689713159175858216L))) + s)) ^ b);
                            } else {
                                byte[] bArr6 = getInputFormats;
                                meVar.f2647 = meVar.f2647 - 1;
                                i5 = meVar.f2646 + (((byte) (((byte) (bArr6[r9] ^ (-2689713159175858216L))) + s)) ^ b);
                            }
                            meVar.f2644 = (char) i5;
                        } else {
                            short[] sArr = getOutputMinFrameDuration;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
            }
            i4 = 0;
            meVar.f2647 = ((i + i6) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            bArr = getInputFormats;
            if (bArr != null) {
            }
            if (bArr == null) {
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
            }
        }
        objArr[0] = sb.toString();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m25256() {
        int i = getOutputFormats + 57;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.getValidOutputFormatsForInputhNQ4ISI;
            if (bArr != null) {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            java.util.Map<java.lang.String, java.lang.String> map = this.isOutputSupportedFor;
            if (map != null) {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 31) % 128;
                map.clear();
                this.isOutputSupportedFor.size();
                return;
            }
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoSizes() {
        getOutputStallDurationlomOqCM = new char[]{40021, 37026, 34290, 47680, 44920, 41892, 53391, 50604, 64063, 61261, 58269, 4248, 1521, 14886, 12158, 9156, 20675, 17695, 31286, 28517, 25528, 37077, 34055, 47644, 44896, 41889, 53439, 50445, 64088, 61070, 58303, 4333, 40019, 37039, 34278, 47637, 44872, 41861, 53431, 50604, 64045, 61275, 58271, 4317, 1445, 14893, 12154, 9098, 20703, 17685, 31283, 28464, 25535, 37059, 34131, 47698, 44924, 41918, 53491, 40020, 37022, 34257, 47693, 44821, 12193, 9041, 13827, 2551, 7348, 4198, 25366, 30221, 18883, 23799, 20585, 41768, 46596, 35227, 40077, 36990, 58154, 63227, 51671, 56459, 53340, 9065, 13990};
        getHighSpeedVideoFpsRangesFor = -6107463143328083766L;
        getInputSizeshNQ4ISI = 360105215;
        Camera2StreamConfigurationMap = -408873060;
        getHighSpeedVideoSizesFor = -1782891116;
        getInputFormats = new byte[]{kotlin.io.encoding.Base64.padSymbol, -123, -118, 82, -126, -119, 85, -122, 92, -113, com.visa.cbp.getEncExpo.startTransaction, 111, -122, -126, -51, 110, -119, -54, 111, -126, -115, 83, -121, -113, 80, -15, com.google.common.base.Ascii.CAN, 94, 87, -9, 109, Byte.MIN_VALUE, -118, -59, com.visa.cbp.getEncExpo.IResultReceiver, 89, 94, -106, com.google.common.base.Ascii.CAN, 94, -73, 16, -40, -38, 104, 106, -20, 9, com.google.common.base.Ascii.FS, 36, 9, 34, Byte.MAX_VALUE, com.google.common.base.Ascii.DC4, 6, 57, 116, 66, 44, 6, 111, 48, com.google.common.base.Ascii.SUB, 7, 3, 56, 57, 109, 118, 101, 103, -105, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.VT, 111, 69, 104, com.google.common.base.Ascii.SI, 126, 13, 60, 3, com.google.common.base.Ascii.FS, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 106, 107, 118, 114, 104, 105, 108, 4, 58, 107, 60, com.google.common.base.Ascii.GS};
    }
}
