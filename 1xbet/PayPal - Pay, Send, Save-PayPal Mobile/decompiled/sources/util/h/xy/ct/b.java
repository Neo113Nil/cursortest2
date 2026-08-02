package util.h.xy.ct;

/* loaded from: classes5.dex */
final class b implements util.h.xy.ct.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static byte[] getHighSpeedVideoSizes = null;
    private static char getHighSpeedVideoSizesFor = 0;
    private static char[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats = 0;
    private static boolean getOutputMinFrameDuration = false;
    private static short[] getOutputMinFrameDurationlomOqCM;
    private static int getOutputSizes;
    private static int getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;
    private static final java.lang.String getOutputStallDurationlomOqCM;
    private static int getValidOutputFormatsForInputhNQ4ISI;
    private final util.h.xy.co.ra toString;

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap();
        getOutputStallDurationlomOqCM = util.h.xy.ct.b.class.getName();
        int i = getInputSizeshNQ4ISI + 19;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {
        public static final util.h.xy.ct.b.a Camera2StreamConfigurationMap;
        public static final util.h.xy.ct.b.a getHighResolutionOutputSizeshNQ4ISI;
        public static final util.h.xy.ct.b.a getHighSpeedVideoFpsRanges;
        public static final util.h.xy.ct.b.a getHighSpeedVideoFpsRangesFor;
        public static final util.h.xy.ct.b.a getHighSpeedVideoSizes;
        private static char[] getHighSpeedVideoSizesFor = null;
        public static final util.h.xy.ct.b.a getInputFormats;
        private static int getInputSizeshNQ4ISI = 0;
        private static int getOutputFormats = 1;
        public static final util.h.xy.ct.b.a getOutputMinFrameDuration;
        private static boolean getOutputMinFrameDurationlomOqCM = false;
        private static boolean getOutputSizes = false;
        private static int getOutputSizeshNQ4ISI = 0;
        private static int getOutputStallDuration = 0;
        private static long getOutputStallDurationlomOqCM = 0;
        private static final /* synthetic */ util.h.xy.ct.b.a[] isOutputSupportedForhNQ4ISI;
        private static int toString = 1;
        private final java.lang.String isOutputSupportedFor;

        public static util.h.xy.ct.b.a valueOf(java.lang.String str) {
            toString = (getOutputStallDuration + 57) % 128;
            util.h.xy.ct.b.a aVar = (util.h.xy.ct.b.a) java.lang.Enum.valueOf(util.h.xy.ct.b.a.class, str);
            toString = (getOutputStallDuration + 77) % 128;
            return aVar;
        }

        public static util.h.xy.ct.b.a[] values() {
            toString = (getOutputStallDuration + 113) % 128;
            util.h.xy.ct.b.a[] aVarArr = (util.h.xy.ct.b.a[]) isOutputSupportedForhNQ4ISI.clone();
            getOutputStallDuration = (toString + 107) % 128;
            return aVarArr;
        }

        static {
            getHighSpeedVideoSizes();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0084\u0089\u008d\u0087\u0089\u008c\u0086\u0089\u008b\u008a\u0089\u0088\u0088\u0082\u0085\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008e\u0086", objArr2);
            util.h.xy.ct.b.a aVar = new util.h.xy.ct.b.a(intern, 0, ((java.lang.String) objArr2[0]).intern());
            getHighSpeedVideoFpsRanges = aVar;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("첔ꦬۅ", (-16751313) - android.graphics.Color.rgb(0, 0, 0), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, "\u008f\u0086", objArr4);
            util.h.xy.ct.b.a aVar2 = new util.h.xy.ct.b.a(intern2, 1, ((java.lang.String) objArr4[0]).intern());
            getInputFormats = aVar2;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0091\u0090", objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.getDefaultSize(0, 0) + 127, "\u0092\u0086", objArr6);
            util.h.xy.ct.b.a aVar3 = new util.h.xy.ct.b.a(intern3, 2, ((java.lang.String) objArr6[0]).intern());
            getHighSpeedVideoFpsRangesFor = aVar3;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("첟럞㨛뵩↤ꐄ⽞鎶ᛣ饒ᶈ", android.graphics.Color.red(0) + 31567, objArr7);
            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("첏쨓", android.view.Gravity.getAbsoluteGravity(0, 0) + 1783, objArr8);
            util.h.xy.ct.b.a aVar4 = new util.h.xy.ct.b.a(intern4, 3, ((java.lang.String) objArr8[0]).intern());
            getHighResolutionOutputSizeshNQ4ISI = aVar4;
            try {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u0084\u0089\u008d\u0087\u0089\u008c\u0086\u008a\u0089\u0094\u0093\u0084\u0086\u0085\u0084\u0083\u0082\u0093", objArr9);
                java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0095\u0086", objArr10);
                util.h.xy.ct.b.a aVar5 = new util.h.xy.ct.b.a(intern5, 4, ((java.lang.String) objArr10[0]).intern());
                getHighSpeedVideoSizes = aVar5;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("첂\uf15c뜃症㮹", 15818 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr11);
                java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoSizes(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0096\u0086", objArr12);
                util.h.xy.ct.b.a aVar6 = new util.h.xy.ct.b.a(intern6, 5, ((java.lang.String) objArr12[0]).intern());
                getOutputMinFrameDuration = aVar6;
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoSizes(128 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), "\u008a\u0097\u0081\u0086\u0084\u0088\u0082\u008c", objArr13);
                java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("첏ꀭ", android.widget.ExpandableListView.getPackedPositionType(0L) + 27851, objArr14);
                util.h.xy.ct.b.a aVar7 = new util.h.xy.ct.b.a(intern7, 6, ((java.lang.String) objArr14[0]).intern());
                Camera2StreamConfigurationMap = aVar7;
                int i = getOutputStallDuration;
                toString = (i + 39) % 128;
                util.h.xy.ct.b.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
                int i2 = i + 37;
                toString = i2 % 128;
                if (i2 % 2 != 0) {
                    isOutputSupportedForhNQ4ISI = aVarArr;
                    return;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private a(java.lang.String str, int i, java.lang.String str2) {
            this.isOutputSupportedFor = str2;
        }

        private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] charArray = str.toCharArray();
            util.h.xz.b.d dVar = new util.h.xz.b.d();
            dVar.f2628 = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputStallDurationlomOqCM ^ (-7508379876853140581L));
                dVar.f2629++;
            }
            char[] cArr = new char[length];
            dVar.f2629 = 0;
            getOutputFormats = (getInputSizeshNQ4ISI + 63) % 128;
            while (dVar.f2629 < charArray.length) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                dVar.f2629++;
            }
            java.lang.String str2 = new java.lang.String(cArr);
            getInputSizeshNQ4ISI = (getOutputFormats + 119) % 128;
            objArr[0] = str2;
        }

        public final java.lang.String getHighSpeedVideoFpsRanges() {
            int i = toString;
            int i2 = i + 47;
            getOutputStallDuration = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            java.lang.String str = this.isOutputSupportedFor;
            int i3 = i + 1;
            getOutputStallDuration = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
            int length;
            char[] cArr;
            getOutputFormats = (getInputSizeshNQ4ISI + 27) % 128;
            byte[] bytes = str.getBytes("ISO-8859-1");
            util.h.xz.b.md mdVar = new util.h.xz.b.md();
            char[] cArr2 = getHighSpeedVideoSizesFor;
            if (cArr2 != null) {
                int i2 = getOutputFormats + 25;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                for (int i3 = 0; i3 < length; i3++) {
                    cArr[i3] = (char) (cArr2[i3] ^ (-3299939579226817547L));
                }
                cArr2 = cArr;
            }
            int i4 = (int) ((-3299939579226817547L) ^ getOutputSizeshNQ4ISI);
            if (!getOutputMinFrameDurationlomOqCM) {
                if (!getOutputSizes) {
                    throw null;
                }
                getOutputFormats = (getInputSizeshNQ4ISI + 1) % 128;
                throw null;
            }
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
                mdVar.f2643++;
                getInputSizeshNQ4ISI = (getOutputFormats + 85) % 128;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void getHighSpeedVideoSizes() {
            getHighSpeedVideoSizesFor = new char[]{64371, 64374, 64354, 64355, 64383, 64340, 64368, 64379, 64370, 64357, 64380, 64352, 64353, 64399, 64384, 64382, 64365, 64396, 64356, 64376, 64386, 64390, 64366};
            getOutputSizeshNQ4ISI = -1074857033;
            getOutputSizes = true;
            getOutputMinFrameDurationlomOqCM = true;
            getOutputStallDurationlomOqCM = -3842347050687201461L;
        }
    }

    b() throws util.h.xy.ct.mc {
        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((scrollBarSize >> 8) + 1724379044, (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) (android.graphics.Color.alpha(0) + androidx.compose.runtime.ComposerKt.defaultsKey), 65523 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 78033383 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.ct.b.a.getInputFormats.getHighSpeedVideoFpsRanges(), intern);
        hashMap.put(util.h.xy.ct.b.a.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(), intern);
        hashMap.put(util.h.xy.ct.b.a.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(), intern);
        hashMap.put(util.h.xy.ct.b.a.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(), intern);
        hashMap.put(util.h.xy.ct.b.a.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(), intern);
        hashMap.put(util.h.xy.ct.b.a.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(), intern);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u0089\u0088\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081", objArr2);
        util.h.xy.co.ra raVar = new util.h.xy.co.ra(((java.lang.String) objArr2[0]).intern(), util.h.xy.ct.b.a.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(), hashMap);
        this.toString = raVar;
        try {
            util.h.xy.co.ma.m25988().mo25986(raVar);
        } catch (util.h.xy.co.b unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "") + 127, "\u0099\u0091\u0096\u0093\u008a\u008b\u0094\u0097\u008c\u0091\u008a\u0098\u0092\u0091\u0097\u008c\u0096\u0095\u008f\u0094\u0093\u0091\u008a\u0092\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0083", objArr3);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr3[0]).intern());
        }
    }

    @Override // util.h.xy.ct.ma
    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean mo26034(java.lang.String str) throws util.h.xy.ct.mc {
        getOutputSizes = (getInputSizeshNQ4ISI + 13) % 128;
        try {
            if (util.h.xy.co.ma.m25988().mo25983(this.toString, str)) {
                if (util.h.xy.co.ma.m25988().mo25984(this.toString, str).isEmpty()) {
                    return false;
                }
                getInputSizeshNQ4ISI = (getOutputSizes + 115) % 128;
                return true;
            }
            getOutputSizes = (getInputSizeshNQ4ISI + 77) % 128;
            return false;
        } catch (util.h.xy.co.b unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379056 + android.view.View.MeasureSpec.getSize(0), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 53), (-34) - android.view.View.MeasureSpec.getMode(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45497, objArr);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr[0]).intern());
        }
    }

    @Override // util.h.xy.ct.ma
    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.util.Map<util.h.xy.ct.ma.b, byte[]> mo26035(byte[] bArr, byte[] bArr2, int i) throws util.h.xy.ct.mc {
        getInputSizeshNQ4ISI = (getOutputSizes + 15) % 128;
        java.util.Map<util.h.xy.ct.ma.b, byte[]> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, i);
        getOutputSizes = (getInputSizeshNQ4ISI + 31) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // util.h.xy.ct.ma
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void mo26032(byte[] bArr, byte[] bArr2, java.util.Map<util.h.xy.ct.ma.b, byte[]> map) throws util.h.xy.ct.mc {
        int i = getOutputSizes + 33;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoSizes(bArr, bArr2, map);
            getInputSizeshNQ4ISI = (getOutputSizes + 1) % 128;
        } else {
            getHighSpeedVideoSizes(bArr, bArr2, map);
            throw new java.lang.ArithmeticException();
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // util.h.xy.ct.ma
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void mo26037(byte[] r34) throws util.h.xy.ct.mc {
        /*
            Method dump skipped, instructions count: 1715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: util.h.xy.ct.b.mo26037(byte[]):void");
    }

    @Override // util.h.xy.ct.ma
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void mo26033(byte[] bArr) throws util.h.xy.ct.mc {
        int i = getOutputSizes + 71;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(bArr);
            getOutputSizes = (getInputSizeshNQ4ISI + 73) % 128;
        } else {
            getHighSpeedVideoFpsRangesFor(bArr);
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.ct.ma
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void mo26036() throws util.h.xy.ct.mc {
        int i = getInputSizeshNQ4ISI + 77;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges();
        } else {
            getHighSpeedVideoFpsRanges();
            throw new java.lang.ArithmeticException();
        }
    }

    private static java.util.Map<util.h.xy.ct.ma.b, byte[]> getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, util.h.xy.cs.mb mbVar, util.h.xy.cs.mb mbVar2) throws util.h.xy.cm.ma {
        java.util.HashMap hashMap = new java.util.HashMap();
        if ((util.h.xy.ct.ma.b.f1125.m26043() & i) == util.h.xy.ct.ma.b.f1125.m26043()) {
            hashMap.put(util.h.xy.ct.ma.b.f1125, util.h.xy.cm.rb.m25971(bArr, bArr3, bArr2));
            getInputSizeshNQ4ISI = (getOutputSizes + 55) % 128;
        }
        byte[] bArr7 = null;
        if ((util.h.xy.ct.ma.b.f1126.m26043() & i) == util.h.xy.ct.ma.b.f1126.m26043()) {
            int i2 = getInputSizeshNQ4ISI + 53;
            getOutputSizes = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    byte[] m25971 = util.h.xy.cm.rb.m25971(mbVar.getEncoded(), bArr3, bArr4);
                    try {
                        hashMap.put(util.h.xy.ct.ma.b.f1126, util.h.xy.cm.rb.m25971(mbVar2.getEncoded(), bArr3, m25971));
                        util.h.xy.cv.ra.m26066(m25971);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr7 = m25971;
                    }
                } else {
                    byte[] m259712 = util.h.xy.cm.rb.m25971(mbVar.getEncoded(), bArr3, bArr4);
                    try {
                        hashMap.put(util.h.xy.ct.ma.b.f1126, util.h.xy.cm.rb.m25971(mbVar2.getEncoded(), bArr3, m259712));
                        util.h.xy.cv.ra.m26066(m259712);
                        throw null;
                    } catch (java.lang.Throwable th2) {
                        bArr7 = m259712;
                        th = th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
            throw th;
        }
        if ((util.h.xy.ct.ma.b.f1124.m26043() & i) == util.h.xy.ct.ma.b.f1124.m26043()) {
            try {
                byte[] m259713 = util.h.xy.cm.rb.m25971(mbVar.getEncoded(), bArr3, bArr5);
                try {
                    hashMap.put(util.h.xy.ct.ma.b.f1124, util.h.xy.cm.rb.m25971(mbVar2.getEncoded(), bArr3, m259713));
                    util.h.xy.cv.ra.m26066(m259713);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bArr7 = m259713;
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        }
        if ((i & util.h.xy.ct.ma.b.f1123.m26043()) != util.h.xy.ct.ma.b.f1123.m26043()) {
            return hashMap;
        }
        getOutputSizes = (getInputSizeshNQ4ISI + 31) % 128;
        try {
            bArr7 = util.h.xy.cm.rb.m25971(mbVar.getEncoded(), bArr3, bArr6);
            hashMap.put(util.h.xy.ct.ma.b.f1123, util.h.xy.cm.rb.m25971(mbVar2.getEncoded(), bArr3, bArr7));
            return hashMap;
        } finally {
            util.h.xy.cv.ra.m26066(bArr7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        if (i6 == -1) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 63) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = getHighSpeedVideoSizes;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (getHighSpeedVideoSizes[((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getOutputMinFrameDurationlomOqCM[((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i8 = getHighSpeedVideoFpsRanges + 121;
            Camera2StreamConfigurationMap = i8 % 128;
            if (i8 % 2 == 0) {
                i4 = ((i >> i6) >> 4) >> ((int) (getOutputSizeshNQ4ISI | (-2689713159175858216L)));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoSizes;
            if (bArr3 != null) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 113) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                    i9++;
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 9) % 128;
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 75) % 128;
                    byte[] bArr5 = getHighSpeedVideoSizes;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputMinFrameDurationlomOqCM;
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

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 23) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        int i2 = Camera2StreamConfigurationMap + 107;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = bytes;
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 61) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getValidOutputFormatsForInputhNQ4ISI);
        if (!getOutputMinFrameDuration) {
            if (!getHighResolutionOutputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bArr.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 95) % 128;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bArr[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighSpeedVideoSizes(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r7 != 4096) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x046b  */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.Map<util.h.xy.ct.ma.b, byte[]> getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, int i) throws util.h.xy.ct.mc {
        int i2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        byte[] bArr18;
        byte[] bArr19;
        byte[] bArr20;
        byte[] bArr21;
        byte[] bArr22;
        byte[] bArr23;
        byte[] bArr24;
        byte[] bArr25;
        byte[] bArr26;
        byte[] bArr27;
        util.h.xy.cs.mb mbVar;
        util.h.xy.cs.mb mbVar2;
        byte[] bArr28;
        util.h.xy.cs.mb mbVar3;
        byte[] bArr29;
        util.h.xy.cs.mb mbVar4;
        byte[] bArr30;
        byte[] bArr31;
        byte[] bArr32;
        byte[] bArr33;
        byte[] bArr34;
        byte[] bArr35;
        byte[] bArr36;
        byte[] bArr37;
        byte[] bArr38;
        byte[] bArr39;
        byte[] bArr40;
        byte[] bArr41;
        byte[] bArr42;
        byte[] bArr43;
        byte[] bArr44;
        byte[] m25971;
        byte[] bArr45;
        if (!util.h.xy.cv.ra.m26070(bArr)) {
            if (util.h.xy.cv.ra.m26070(bArr2)) {
                int i3 = i;
                int i4 = i3 & 4096;
                i2 = i3;
            } else {
                i2 = i;
            }
            try {
                try {
                    java.lang.String str = new java.lang.String(bArr);
                    if (!util.h.xy.co.ma.m25988().mo25983(this.toString, str)) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(1724379095 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (short) android.view.View.MeasureSpec.getMode(0), (byte) ((-64) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-56) - android.text.TextUtils.getOffsetAfter("", 0), android.graphics.Color.green(0) + 78033394, objArr);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr[0]).intern());
                    }
                    java.util.Map<java.lang.String, byte[]> mo25984 = util.h.xy.co.ma.m25988().mo25984(this.toString, str);
                    byte[] bArr46 = mo25984.get(util.h.xy.ct.b.a.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges());
                    try {
                        bArr32 = mo25984.get(util.h.xy.ct.b.a.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges());
                        try {
                            bArr22 = mo25984.get(util.h.xy.ct.b.a.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges());
                        } catch (util.h.xy.cm.ma e) {
                            e = e;
                            bArr14 = bArr32;
                            bArr20 = null;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr2);
                            sb.append(((java.lang.String) objArr2[0]).intern());
                            sb.append(e.getMessage());
                            throw new util.h.xy.ct.mc(sb.toString());
                        } catch (util.h.xy.co.b e2) {
                            e = e2;
                            bArr13 = bArr32;
                            bArr19 = null;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr3);
                            sb2.append(((java.lang.String) objArr3[0]).intern());
                            sb2.append(e.getMessage());
                            throw new util.h.xy.ct.mc(sb2.toString());
                        } catch (util.h.xy.ct.mc e3) {
                            e = e3;
                            bArr11 = bArr46;
                            bArr12 = bArr32;
                            bArr17 = bArr12;
                            bArr18 = null;
                            bArr22 = bArr18;
                            bArr23 = null;
                            bArr24 = null;
                            bArr25 = null;
                            bArr26 = null;
                            bArr28 = null;
                            mbVar3 = null;
                            bArr29 = bArr23;
                            mbVar4 = null;
                            bArr31 = bArr29;
                            try {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                try {
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr4);
                                    sb3.append(((java.lang.String) objArr4[0]).intern());
                                    sb3.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb3.toString());
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                bArr8 = bArr24;
                                util.h.xy.cs.mb mbVar5 = mbVar4;
                                bArr30 = bArr31;
                                bArr15 = bArr8;
                                bArr10 = bArr17;
                                bArr4 = bArr11;
                                bArr3 = bArr30;
                                bArr9 = bArr25;
                                bArr16 = bArr22;
                                bArr21 = bArr26;
                                bArr27 = bArr28;
                                mbVar = mbVar5;
                                mbVar2 = mbVar3;
                                util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                                if (mbVar != null) {
                                    mbVar.m26028();
                                }
                                if (mbVar2 != null) {
                                    mbVar2.m26028();
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            bArr4 = bArr46;
                            bArr10 = bArr32;
                            bArr3 = null;
                            bArr9 = null;
                            bArr15 = null;
                            bArr16 = null;
                            bArr21 = null;
                            bArr27 = null;
                            mbVar = null;
                            mbVar2 = null;
                            util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                            if (mbVar != null) {
                            }
                            if (mbVar2 != null) {
                            }
                            throw th;
                        }
                    } catch (util.h.xy.cm.ma e4) {
                        e = e4;
                        bArr7 = bArr46;
                        bArr14 = null;
                        bArr20 = null;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr22);
                        sb4.append(((java.lang.String) objArr22[0]).intern());
                        sb4.append(e.getMessage());
                        throw new util.h.xy.ct.mc(sb4.toString());
                    } catch (util.h.xy.co.b e5) {
                        e = e5;
                        bArr6 = bArr46;
                        bArr13 = null;
                        bArr19 = null;
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr32);
                        sb22.append(((java.lang.String) objArr32[0]).intern());
                        sb22.append(e.getMessage());
                        throw new util.h.xy.ct.mc(sb22.toString());
                    } catch (util.h.xy.ct.mc e6) {
                        e = e6;
                        bArr5 = bArr46;
                        bArr11 = bArr5;
                        bArr12 = null;
                        bArr17 = bArr12;
                        bArr18 = null;
                        bArr22 = bArr18;
                        bArr23 = null;
                        bArr24 = null;
                        bArr25 = null;
                        bArr26 = null;
                        bArr28 = null;
                        mbVar3 = null;
                        bArr29 = bArr23;
                        mbVar4 = null;
                        bArr31 = bArr29;
                        java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr42);
                        sb32.append(((java.lang.String) objArr42[0]).intern());
                        sb32.append(e.getMessage());
                        throw new util.h.xy.ct.mc(sb32.toString());
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        bArr4 = bArr46;
                        bArr3 = null;
                        bArr9 = null;
                        bArr10 = null;
                        bArr15 = null;
                        bArr16 = null;
                        bArr21 = null;
                        bArr27 = null;
                        mbVar = null;
                        mbVar2 = null;
                        util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                        if (mbVar != null) {
                        }
                        if (mbVar2 != null) {
                        }
                        throw th;
                    }
                    try {
                        bArr26 = mo25984.get(util.h.xy.ct.b.a.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges());
                        try {
                            bArr28 = mo25984.get(util.h.xy.ct.b.a.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges());
                            try {
                                bArr44 = util.h.xy.co.ma.m25988().mo25984(this.toString, str).get(util.h.xy.ct.b.a.getInputFormats.getHighSpeedVideoFpsRanges());
                            } catch (util.h.xy.cm.ma e7) {
                                e = e7;
                                bArr41 = bArr32;
                                bArr42 = bArr46;
                            } catch (util.h.xy.co.b e8) {
                                e = e8;
                                bArr39 = bArr32;
                                bArr40 = bArr46;
                            } catch (util.h.xy.ct.mc e9) {
                                e = e9;
                                bArr37 = bArr32;
                                bArr38 = bArr46;
                                bArr24 = null;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                bArr33 = bArr32;
                                bArr34 = bArr46;
                                bArr35 = null;
                                bArr36 = null;
                            }
                            try {
                                mbVar3 = util.h.xy.ct.c.m26038(bArr, bArr46);
                                try {
                                    m25971 = util.h.xy.cm.rb.m25971(mbVar3.getEncoded(), bArr32, bArr44);
                                } catch (util.h.xy.cm.ma e10) {
                                    e = e10;
                                    bArr41 = bArr32;
                                    bArr42 = bArr46;
                                } catch (util.h.xy.co.b e11) {
                                    e = e11;
                                    bArr39 = bArr32;
                                    bArr40 = bArr46;
                                } catch (util.h.xy.ct.mc e12) {
                                    e = e12;
                                    bArr37 = bArr32;
                                    bArr38 = bArr46;
                                    bArr24 = bArr44;
                                    bArr43 = null;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    bArr36 = bArr44;
                                    bArr33 = bArr32;
                                    bArr34 = bArr46;
                                    bArr35 = null;
                                }
                                try {
                                    mbVar4 = util.h.xy.ct.c.m26039(bArr, bArr46, new util.h.xy.cp.ma(), util.h.xy.cr.ra.m26018());
                                    try {
                                        bArr25 = util.h.xy.cm.rb.m25971(mbVar4.getEncoded(), bArr32, m25971);
                                        bArr45 = m25971;
                                    } catch (util.h.xy.cm.ma e13) {
                                        e = e13;
                                    } catch (util.h.xy.co.b e14) {
                                        e = e14;
                                    } catch (util.h.xy.ct.mc e15) {
                                        e = e15;
                                        bArr31 = m25971;
                                        bArr11 = bArr46;
                                        bArr17 = bArr32;
                                        bArr24 = bArr44;
                                        bArr25 = null;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        bArr3 = m25971;
                                        bArr4 = bArr46;
                                        bArr10 = bArr32;
                                        bArr15 = bArr44;
                                        bArr16 = bArr22;
                                        bArr21 = bArr26;
                                        bArr27 = bArr28;
                                        mbVar2 = mbVar3;
                                        mbVar = mbVar4;
                                        bArr9 = null;
                                    }
                                } catch (util.h.xy.cm.ma e16) {
                                    e = e16;
                                    bArr41 = bArr32;
                                    bArr42 = bArr46;
                                    java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr222 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr222);
                                    sb42.append(((java.lang.String) objArr222[0]).intern());
                                    sb42.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb42.toString());
                                } catch (util.h.xy.co.b e17) {
                                    e = e17;
                                    bArr39 = bArr32;
                                    bArr40 = bArr46;
                                    java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr322);
                                    sb222.append(((java.lang.String) objArr322[0]).intern());
                                    sb222.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb222.toString());
                                } catch (util.h.xy.ct.mc e18) {
                                    e = e18;
                                    bArr43 = m25971;
                                    bArr37 = bArr32;
                                    bArr38 = bArr46;
                                    bArr24 = bArr44;
                                    bArr11 = bArr38;
                                    bArr17 = bArr37;
                                    bArr25 = null;
                                    bArr29 = bArr43;
                                    mbVar4 = null;
                                    bArr31 = bArr29;
                                    java.lang.StringBuilder sb322 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr422 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr422);
                                    sb322.append(((java.lang.String) objArr422[0]).intern());
                                    sb322.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb322.toString());
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    bArr36 = bArr44;
                                    bArr33 = bArr32;
                                    bArr34 = bArr46;
                                    bArr35 = m25971;
                                    bArr3 = bArr35;
                                    bArr4 = bArr34;
                                    bArr10 = bArr33;
                                    bArr15 = bArr36;
                                    bArr16 = bArr22;
                                    bArr21 = bArr26;
                                    bArr27 = bArr28;
                                    mbVar2 = mbVar3;
                                    bArr9 = null;
                                    mbVar = null;
                                    util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                                    if (mbVar != null) {
                                    }
                                    if (mbVar2 != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    java.util.Map<util.h.xy.ct.ma.b, byte[]> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, bArr2, bArr25, bArr32, bArr22, bArr26, bArr28, mbVar3, mbVar4);
                                    util.h.xy.cv.ra.m26068(bArr45, bArr46, bArr25, bArr32, bArr44, bArr22, bArr26, bArr28);
                                    if (mbVar4 != null) {
                                        mbVar4.m26028();
                                    }
                                    if (mbVar3 != null) {
                                        mbVar3.m26028();
                                    }
                                    return highResolutionOutputSizeshNQ4ISI;
                                } catch (util.h.xy.cm.ma e19) {
                                    e = e19;
                                    java.lang.StringBuilder sb422 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr2222 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr2222);
                                    sb422.append(((java.lang.String) objArr2222[0]).intern());
                                    sb422.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb422.toString());
                                } catch (util.h.xy.co.b e20) {
                                    e = e20;
                                    java.lang.StringBuilder sb2222 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr3222 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr3222);
                                    sb2222.append(((java.lang.String) objArr3222[0]).intern());
                                    sb2222.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb2222.toString());
                                } catch (util.h.xy.ct.mc e21) {
                                    e = e21;
                                    bArr11 = bArr46;
                                    bArr17 = bArr32;
                                    bArr24 = bArr44;
                                    bArr31 = bArr45;
                                    java.lang.StringBuilder sb3222 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr4222);
                                    sb3222.append(((java.lang.String) objArr4222[0]).intern());
                                    sb3222.append(e.getMessage());
                                    throw new util.h.xy.ct.mc(sb3222.toString());
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    bArr3 = bArr45;
                                    bArr4 = bArr46;
                                    bArr9 = bArr25;
                                    bArr10 = bArr32;
                                    bArr15 = bArr44;
                                    bArr16 = bArr22;
                                    bArr21 = bArr26;
                                    bArr27 = bArr28;
                                    mbVar2 = mbVar3;
                                    mbVar = mbVar4;
                                    util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                                    if (mbVar != null) {
                                    }
                                    if (mbVar2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (util.h.xy.cm.ma e22) {
                                e = e22;
                                bArr41 = bArr32;
                                bArr42 = bArr46;
                                java.lang.StringBuilder sb4222 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr22222 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr22222);
                                sb4222.append(((java.lang.String) objArr22222[0]).intern());
                                sb4222.append(e.getMessage());
                                throw new util.h.xy.ct.mc(sb4222.toString());
                            } catch (util.h.xy.co.b e23) {
                                e = e23;
                                bArr39 = bArr32;
                                bArr40 = bArr46;
                                java.lang.StringBuilder sb22222 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr32222 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr32222);
                                sb22222.append(((java.lang.String) objArr32222[0]).intern());
                                sb22222.append(e.getMessage());
                                throw new util.h.xy.ct.mc(sb22222.toString());
                            } catch (util.h.xy.ct.mc e24) {
                                e = e24;
                                bArr37 = bArr32;
                                bArr38 = bArr46;
                                bArr24 = bArr44;
                                bArr43 = null;
                                mbVar3 = null;
                                bArr11 = bArr38;
                                bArr17 = bArr37;
                                bArr25 = null;
                                bArr29 = bArr43;
                                mbVar4 = null;
                                bArr31 = bArr29;
                                java.lang.StringBuilder sb32222 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr42222);
                                sb32222.append(((java.lang.String) objArr42222[0]).intern());
                                sb32222.append(e.getMessage());
                                throw new util.h.xy.ct.mc(sb32222.toString());
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                bArr36 = bArr44;
                                bArr33 = bArr32;
                                bArr34 = bArr46;
                                bArr35 = null;
                                mbVar3 = null;
                                bArr3 = bArr35;
                                bArr4 = bArr34;
                                bArr10 = bArr33;
                                bArr15 = bArr36;
                                bArr16 = bArr22;
                                bArr21 = bArr26;
                                bArr27 = bArr28;
                                mbVar2 = mbVar3;
                                bArr9 = null;
                                mbVar = null;
                                util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                                if (mbVar != null) {
                                }
                                if (mbVar2 != null) {
                                }
                                throw th;
                            }
                        } catch (util.h.xy.cm.ma e25) {
                            e = e25;
                            java.lang.StringBuilder sb42222 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr222222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr222222);
                            sb42222.append(((java.lang.String) objArr222222[0]).intern());
                            sb42222.append(e.getMessage());
                            throw new util.h.xy.ct.mc(sb42222.toString());
                        } catch (util.h.xy.co.b e26) {
                            e = e26;
                            java.lang.StringBuilder sb222222 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr322222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr322222);
                            sb222222.append(((java.lang.String) objArr322222[0]).intern());
                            sb222222.append(e.getMessage());
                            throw new util.h.xy.ct.mc(sb222222.toString());
                        } catch (util.h.xy.ct.mc e27) {
                            e = e27;
                            bArr11 = bArr46;
                            bArr17 = bArr32;
                            bArr23 = null;
                            bArr24 = null;
                            bArr25 = null;
                            bArr28 = null;
                            mbVar3 = null;
                            bArr29 = bArr23;
                            mbVar4 = null;
                            bArr31 = bArr29;
                            java.lang.StringBuilder sb322222 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr422222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr422222);
                            sb322222.append(((java.lang.String) objArr422222[0]).intern());
                            sb322222.append(e.getMessage());
                            throw new util.h.xy.ct.mc(sb322222.toString());
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            bArr4 = bArr46;
                            bArr10 = bArr32;
                            bArr16 = bArr22;
                            bArr21 = bArr26;
                            bArr3 = null;
                            bArr9 = null;
                            bArr15 = null;
                            bArr27 = null;
                            mbVar = null;
                            mbVar2 = null;
                            util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                            if (mbVar != null) {
                            }
                            if (mbVar2 != null) {
                            }
                            throw th;
                        }
                    } catch (util.h.xy.cm.ma e28) {
                        e = e28;
                        bArr20 = bArr22;
                        java.lang.StringBuilder sb422222 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2222222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u009a\u0091\u0090\u009d\u008b\u008a\u009e\u008c\u0092\u008f\u008e\u009e\u0093\u008a\u0096\u008b\u0094\u009e\u009f\u008a\u0081", objArr2222222);
                        sb422222.append(((java.lang.String) objArr2222222[0]).intern());
                        sb422222.append(e.getMessage());
                        throw new util.h.xy.ct.mc(sb422222.toString());
                    } catch (util.h.xy.co.b e29) {
                        e = e29;
                        bArr19 = bArr22;
                        java.lang.StringBuilder sb2222222 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr3222222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr3222222);
                        sb2222222.append(((java.lang.String) objArr3222222[0]).intern());
                        sb2222222.append(e.getMessage());
                        throw new util.h.xy.ct.mc(sb2222222.toString());
                    } catch (util.h.xy.ct.mc e30) {
                        e = e30;
                        bArr11 = bArr46;
                        bArr17 = bArr32;
                        bArr18 = bArr22;
                        bArr22 = bArr18;
                        bArr23 = null;
                        bArr24 = null;
                        bArr25 = null;
                        bArr26 = null;
                        bArr28 = null;
                        mbVar3 = null;
                        bArr29 = bArr23;
                        mbVar4 = null;
                        bArr31 = bArr29;
                        java.lang.StringBuilder sb3222222 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr4222222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(127 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), "\u008c¢\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0096\u0095\u008f\u009c\u0093\u008b\u0090\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0091\u008c\u0091\u0096\u0093\u008a\u008b\u0094¡", objArr4222222);
                        sb3222222.append(((java.lang.String) objArr4222222[0]).intern());
                        sb3222222.append(e.getMessage());
                        throw new util.h.xy.ct.mc(sb3222222.toString());
                    } catch (java.lang.Throwable th12) {
                        th = th12;
                        bArr4 = bArr46;
                        bArr10 = bArr32;
                        bArr16 = bArr22;
                        bArr3 = null;
                        bArr9 = null;
                        bArr15 = null;
                        bArr21 = null;
                        bArr27 = null;
                        mbVar = null;
                        mbVar2 = null;
                        util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                        if (mbVar != null) {
                        }
                        if (mbVar2 != null) {
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th13) {
                    th = th13;
                    bArr8 = null;
                    bArr30 = i2;
                    bArr15 = bArr8;
                    bArr10 = bArr17;
                    bArr4 = bArr11;
                    bArr3 = bArr30;
                    bArr9 = bArr25;
                    bArr16 = bArr22;
                    bArr21 = bArr26;
                    bArr27 = bArr28;
                    mbVar = mbVar5;
                    mbVar2 = mbVar3;
                    util.h.xy.cv.ra.m26068(bArr3, bArr4, bArr9, bArr10, bArr15, bArr16, bArr21, bArr27);
                    if (mbVar != null) {
                    }
                    if (mbVar2 != null) {
                    }
                    throw th;
                }
            } catch (util.h.xy.cm.ma e31) {
                e = e31;
                bArr7 = null;
            } catch (util.h.xy.co.b e32) {
                e = e32;
                bArr6 = null;
            } catch (util.h.xy.ct.mc e33) {
                e = e33;
                bArr5 = null;
            } catch (java.lang.Throwable th14) {
                th = th14;
                bArr3 = null;
                bArr4 = null;
            }
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), " \u009f\u0094\u009e\u009a\u0091\u008c\u008a\u008b\u008c\u0090\u0090\u0098\u0095\u008c\u0091\u009d\u008c\u0094\u008b\u0095\u008c\u009c\u0090\u0098\u008b\u008e\u0097\u008c\u009b\u0087\u0088\u008c\u008a\u008b\u008c\u009a\u0090\u0093\u0091\u0082", objArr5);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0613 A[Catch: all -> 0x0615, TryCatch #85 {all -> 0x0615, blocks: (B:147:0x05d8, B:148:0x0601, B:152:0x060d, B:154:0x0613, B:155:0x0614), top: B:138:0x05b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0614 A[Catch: all -> 0x0615, TRY_LEAVE, TryCatch #85 {all -> 0x0615, blocks: (B:147:0x05d8, B:148:0x0601, B:152:0x060d, B:154:0x0613, B:155:0x0614), top: B:138:0x05b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06fb  */
    /* JADX WARN: Type inference failed for: r27v32 */
    /* JADX WARN: Type inference failed for: r27v34 */
    /* JADX WARN: Type inference failed for: r27v36 */
    /* JADX WARN: Type inference failed for: r27v38 */
    /* JADX WARN: Type inference failed for: r27v41 */
    /* JADX WARN: Type inference failed for: r27v43 */
    /* JADX WARN: Type inference failed for: r27v49 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v50 */
    /* JADX WARN: Type inference failed for: r27v65 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, java.util.Map<util.h.xy.ct.ma.b, byte[]> map) throws util.h.xy.ct.mc {
        byte[] bArr3;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        byte[] bArr4;
        byte[] bArr5;
        java.lang.CharSequence charSequence3;
        util.h.xy.cs.mb mbVar;
        byte[] bArr6;
        java.lang.CharSequence charSequence4;
        byte[] bArr7;
        util.h.xy.cs.mb mbVar2;
        util.h.xy.cs.mb mbVar3;
        util.h.xy.cs.mb mbVar4;
        util.h.xy.cs.mb mbVar5;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        util.h.xy.cs.mb mbVar6;
        byte[] bArr12;
        util.h.xy.cs.mb mbVar7;
        ?? r27;
        util.h.xy.cs.mb mbVar8;
        util.h.xy.cs.mb mbVar9;
        util.h.xy.cs.mb mbVar10;
        util.h.xy.cs.mb mbVar11;
        byte[] bArr13;
        byte[] bArr14;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        byte[] bArr18;
        byte[] bArr19;
        byte[] bArr20;
        byte[] bArr21;
        byte[] bArr22;
        byte[] bArr23;
        byte[] bArr24;
        byte[] bArr25;
        byte[] bArr26;
        byte[] bArr27;
        byte[] bArr28;
        byte[] bArr29;
        byte[] bArr30;
        util.h.xy.cs.mb mbVar12;
        byte[] bArr31;
        byte[] bArr32;
        byte[] bArr33;
        byte[] bArr34;
        byte[] bArr35;
        util.h.xy.cs.mb mbVar13;
        byte[] bArr36;
        byte[] bArr37;
        byte[] bArr38;
        byte[] bArr39;
        byte[] bArr40;
        byte[] bArr41;
        byte[] bArr42;
        byte[] bArr43;
        byte[] bArr44;
        byte[] bArr45;
        byte[] bArr46;
        byte[] bArr47;
        byte[] bArr48;
        byte[] bArr49;
        byte[] bArr50;
        util.h.xy.cs.mb mbVar14;
        util.h.xy.cs.mb mbVar15;
        byte[] bArr51;
        byte[] bArr52;
        java.lang.Throwable cause;
        byte[] bArr53;
        util.h.xy.cs.mb mbVar16;
        util.h.xy.cs.mb m26039;
        util.h.xy.cs.mb m26038;
        byte[] bArr54;
        util.h.xy.cs.mb mbVar17;
        java.lang.CharSequence charSequence5;
        util.h.xy.cs.mb mbVar18;
        ?? r272;
        byte[] bArr55;
        util.h.xy.cs.mb mbVar19;
        util.h.xy.cs.mb mbVar20;
        byte[] bArr56;
        byte[] bArr57;
        byte[] bArr58;
        byte[] bArr59;
        byte[] bArr60;
        byte[] bArr61;
        byte[] bArr62;
        byte[] bArr63;
        java.lang.CharSequence charSequence6;
        byte[] bArr64;
        util.h.xy.cs.mb mbVar21;
        ?? r273;
        byte[] bArr65;
        byte[] bArr66;
        util.h.xy.cs.mb mbVar22;
        byte[] bArr67;
        byte[] bArr68;
        byte[] bArr69;
        byte[] bArr70;
        byte[] bArr71;
        java.lang.CharSequence charSequence7;
        byte[] bArr72;
        byte[] bArr73;
        byte[] bArr74;
        java.lang.CharSequence charSequence8;
        byte[] bArr75;
        byte[] m25973;
        byte[] m259732;
        ?? r274;
        byte[] bArr76;
        util.h.xy.cs.mb mbVar23;
        util.h.xy.cs.mb mbVar24;
        if (util.h.xy.cv.ra.m26070(bArr) || util.h.xy.cv.ra.m26070(bArr2)) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1724379112, (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-88) - android.view.MotionEvent.axisFromString("")), (-22) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 78033398 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause2 = th.getCause();
                if (cause2 == null) {
                    throw th;
                }
                throw cause2;
            }
        }
        if (map == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(175 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0090\u0090\u0098\u0095\u008c\u0091\u009d\u008c\u0094\u008b\u0095\u008c\u009c\u0090\u0098\u008b\u008e\u0097\u008c\u0097\u0090\u0093\u008f\u0094\u0095\u0091\u009c\u0091\u008a\u0081", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (map.isEmpty()) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 127, "\u0090\u0090\u0098\u0095\u008c\u0091\u009d\u008c\u0094\u008b\u0095\u008c\u009c\u0090\u0098\u008b\u008e\u0097\u008c\u0097\u0090\u0093\u008f\u0094\u0095\u0091\u009c\u0091\u008a\u0081", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        byte[] bArr77 = new byte[32];
        byte[] bArr78 = new byte[16];
        try {
            try {
            } catch (util.h.xy.co.b unused) {
                charSequence2 = "";
            }
            try {
                bArr3 = map.get(util.h.xy.ct.ma.b.f1126);
            } catch (util.h.xy.co.b unused2) {
                charSequence2 = "";
                bArr3 = null;
                bArr4 = null;
                bArr5 = null;
                bArr6 = null;
                bArr7 = bArr6;
                mbVar2 = null;
                mbVar5 = mbVar2;
                bArr12 = null;
                mbVar7 = null;
                bArr21 = bArr4;
                bArr22 = null;
                bArr23 = null;
                bArr24 = null;
                bArr25 = null;
                bArr26 = null;
                bArr27 = null;
                bArr28 = null;
                bArr29 = null;
                try {
                    bArr43 = bArr22;
                    bArr44 = bArr7;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr4);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr4[0]).intern());
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr45 = bArr44;
                        bArr46 = bArr5;
                        bArr47 = bArr27;
                        bArr42 = bArr43;
                        bArr39 = bArr26;
                        bArr14 = bArr47;
                        bArr10 = bArr46;
                        bArr13 = bArr23;
                        bArr19 = bArr24;
                        bArr8 = bArr3;
                        bArr9 = bArr21;
                        bArr17 = bArr25;
                        bArr16 = bArr28;
                        bArr18 = bArr42;
                        bArr15 = bArr39;
                        bArr20 = bArr29;
                        mbVar6 = mbVar7;
                        bArr11 = bArr45;
                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                        contentValues.clear();
                        if (mbVar5 != null) {
                            mbVar5.m26028();
                        }
                        if (mbVar6 != null) {
                            mbVar6.m26028();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr43 = bArr22;
                    bArr44 = bArr7;
                }
            }
        } catch (java.security.NoSuchAlgorithmException unused3) {
            bArr3 = null;
        } catch (util.h.xy.cm.ma unused4) {
            num = 0;
            str = "getThreadPriority";
            str2 = "android.os.Process";
            charSequence = "";
            bArr3 = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr3 = null;
        }
        try {
            bArr4 = map.get(util.h.xy.ct.ma.b.f1124);
            try {
                bArr5 = map.get(util.h.xy.ct.ma.b.f1125);
            } catch (java.security.NoSuchAlgorithmException unused5) {
                bArr5 = null;
                bArr6 = null;
                bArr7 = bArr6;
                mbVar3 = null;
                mbVar10 = mbVar3;
                bArr12 = null;
                mbVar11 = null;
                bArr21 = bArr4;
                bArr35 = bArr12;
                mbVar13 = mbVar11;
                bArr36 = null;
                bArr37 = null;
                bArr25 = null;
                bArr38 = null;
                bArr39 = null;
                bArr28 = null;
                bArr29 = null;
                bArr40 = bArr5;
                bArr42 = null;
                try {
                    bArr53 = bArr7;
                    try {
                        mbVar16 = mbVar10;
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr5);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr5[0]).intern());
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            bArr45 = bArr53;
                            mbVar5 = mbVar16;
                            mbVar7 = mbVar13;
                            bArr47 = bArr36;
                            bArr23 = bArr37;
                            bArr24 = bArr38;
                            bArr46 = bArr40;
                            bArr12 = bArr35;
                            bArr14 = bArr47;
                            bArr10 = bArr46;
                            bArr13 = bArr23;
                            bArr19 = bArr24;
                            bArr8 = bArr3;
                            bArr9 = bArr21;
                            bArr17 = bArr25;
                            bArr16 = bArr28;
                            bArr18 = bArr42;
                            bArr15 = bArr39;
                            bArr20 = bArr29;
                            mbVar6 = mbVar7;
                            bArr11 = bArr45;
                            util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                            contentValues.clear();
                            if (mbVar5 != null) {
                            }
                            if (mbVar6 != null) {
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        mbVar16 = mbVar10;
                        bArr45 = bArr53;
                        mbVar5 = mbVar16;
                        mbVar7 = mbVar13;
                        bArr47 = bArr36;
                        bArr23 = bArr37;
                        bArr24 = bArr38;
                        bArr46 = bArr40;
                        bArr12 = bArr35;
                        bArr14 = bArr47;
                        bArr10 = bArr46;
                        bArr13 = bArr23;
                        bArr19 = bArr24;
                        bArr8 = bArr3;
                        bArr9 = bArr21;
                        bArr17 = bArr25;
                        bArr16 = bArr28;
                        bArr18 = bArr42;
                        bArr15 = bArr39;
                        bArr20 = bArr29;
                        mbVar6 = mbVar7;
                        bArr11 = bArr45;
                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                        contentValues.clear();
                        if (mbVar5 != null) {
                        }
                        if (mbVar6 != null) {
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bArr53 = bArr7;
                }
            } catch (util.h.xy.cm.ma unused6) {
                num = 0;
                str = "getThreadPriority";
                str2 = "android.os.Process";
                charSequence3 = "";
                bArr5 = null;
                charSequence4 = charSequence3;
                bArr6 = null;
                bArr7 = bArr6;
                mbVar4 = null;
                r27 = charSequence4;
                mbVar8 = mbVar4;
                bArr12 = null;
                mbVar9 = null;
                bArr30 = r27;
                mbVar12 = mbVar9;
                bArr31 = null;
                bArr23 = null;
                bArr32 = null;
                bArr33 = null;
                bArr25 = null;
                bArr34 = null;
                bArr28 = null;
                bArr41 = bArr30;
                bArr29 = null;
                bArr48 = bArr41;
                try {
                    bArr49 = bArr31;
                    bArr50 = bArr7;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    bArr49 = bArr31;
                    bArr50 = bArr7;
                }
                try {
                    mbVar14 = mbVar8;
                    mbVar15 = mbVar12;
                    ?? r5 = bArr48;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r5, (java.lang.CharSequence) r5) + 78033385, objArr6);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr6[0]).intern());
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    cause = th.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            bArr51 = bArr49;
                            bArr52 = bArr50;
                            mbVar5 = mbVar14;
                            bArr24 = bArr33;
                            bArr23 = bArr48;
                            bArr3 = r38;
                            bArr18 = bArr51;
                            bArr11 = bArr52;
                            bArr19 = bArr24;
                            bArr8 = bArr3;
                            bArr17 = bArr25;
                            bArr9 = bArr4;
                            mbVar6 = mbVar15;
                            bArr14 = bArr34;
                            bArr15 = bArr6;
                            bArr16 = bArr28;
                            bArr20 = bArr29;
                            bArr13 = bArr23;
                            bArr10 = bArr5;
                            util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                            contentValues.clear();
                            if (mbVar5 != null) {
                            }
                            if (mbVar6 != null) {
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th13) {
                        th = th13;
                        bArr48 = bArr23;
                        bArr6 = bArr32;
                        byte[] bArr79 = bArr3;
                        bArr51 = bArr49;
                        bArr52 = bArr50;
                        mbVar5 = mbVar14;
                        bArr24 = bArr33;
                        bArr23 = bArr48;
                        bArr3 = bArr79;
                        bArr18 = bArr51;
                        bArr11 = bArr52;
                        bArr19 = bArr24;
                        bArr8 = bArr3;
                        bArr17 = bArr25;
                        bArr9 = bArr4;
                        mbVar6 = mbVar15;
                        bArr14 = bArr34;
                        bArr15 = bArr6;
                        bArr16 = bArr28;
                        bArr20 = bArr29;
                        bArr13 = bArr23;
                        bArr10 = bArr5;
                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                        contentValues.clear();
                        if (mbVar5 != null) {
                        }
                        if (mbVar6 != null) {
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th14) {
                    th = th14;
                    mbVar14 = mbVar8;
                    mbVar15 = mbVar12;
                    bArr48 = bArr23;
                    bArr6 = bArr32;
                    byte[] bArr792 = bArr3;
                    bArr51 = bArr49;
                    bArr52 = bArr50;
                    mbVar5 = mbVar14;
                    bArr24 = bArr33;
                    bArr23 = bArr48;
                    bArr3 = bArr792;
                    bArr18 = bArr51;
                    bArr11 = bArr52;
                    bArr19 = bArr24;
                    bArr8 = bArr3;
                    bArr17 = bArr25;
                    bArr9 = bArr4;
                    mbVar6 = mbVar15;
                    bArr14 = bArr34;
                    bArr15 = bArr6;
                    bArr16 = bArr28;
                    bArr20 = bArr29;
                    bArr13 = bArr23;
                    bArr10 = bArr5;
                    util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                    contentValues.clear();
                    if (mbVar5 != null) {
                    }
                    if (mbVar6 != null) {
                    }
                    throw th;
                }
            } catch (util.h.xy.co.b unused7) {
                charSequence2 = "";
                bArr5 = null;
                bArr6 = null;
                bArr7 = bArr6;
                mbVar2 = null;
                mbVar5 = mbVar2;
                bArr12 = null;
                mbVar7 = null;
                bArr21 = bArr4;
                bArr22 = null;
                bArr23 = null;
                bArr24 = null;
                bArr25 = null;
                bArr26 = null;
                bArr27 = null;
                bArr28 = null;
                bArr29 = null;
                bArr43 = bArr22;
                bArr44 = bArr7;
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr42);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr42[0]).intern());
            } catch (java.lang.Throwable th15) {
                th = th15;
                bArr5 = null;
                mbVar = null;
                bArr6 = null;
                mbVar5 = mbVar;
                bArr8 = bArr3;
                bArr9 = bArr4;
                bArr10 = bArr5;
                bArr11 = bArr6;
                mbVar6 = null;
                bArr12 = null;
                bArr13 = null;
                bArr14 = null;
                bArr15 = null;
                bArr16 = null;
                bArr17 = null;
                bArr18 = null;
                bArr19 = null;
                bArr20 = null;
                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                contentValues.clear();
                if (mbVar5 != null) {
                }
                if (mbVar6 != null) {
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused8) {
            bArr4 = null;
            bArr5 = null;
            bArr6 = null;
            bArr7 = bArr6;
            mbVar3 = null;
            mbVar10 = mbVar3;
            bArr12 = null;
            mbVar11 = null;
            bArr21 = bArr4;
            bArr35 = bArr12;
            mbVar13 = mbVar11;
            bArr36 = null;
            bArr37 = null;
            bArr25 = null;
            bArr38 = null;
            bArr39 = null;
            bArr28 = null;
            bArr29 = null;
            bArr40 = bArr5;
            bArr42 = null;
            bArr53 = bArr7;
            mbVar16 = mbVar10;
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr52);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr52[0]).intern());
        } catch (util.h.xy.cm.ma unused9) {
            num = 0;
            str = "getThreadPriority";
            str2 = "android.os.Process";
            charSequence = "";
            bArr4 = null;
            charSequence3 = charSequence;
            bArr5 = null;
            charSequence4 = charSequence3;
            bArr6 = null;
            bArr7 = bArr6;
            mbVar4 = null;
            r27 = charSequence4;
            mbVar8 = mbVar4;
            bArr12 = null;
            mbVar9 = null;
            bArr30 = r27;
            mbVar12 = mbVar9;
            bArr31 = null;
            bArr23 = null;
            bArr32 = null;
            bArr33 = null;
            bArr25 = null;
            bArr34 = null;
            bArr28 = null;
            bArr41 = bArr30;
            bArr29 = null;
            bArr48 = bArr41;
            bArr49 = bArr31;
            bArr50 = bArr7;
            mbVar14 = mbVar8;
            mbVar15 = mbVar12;
            ?? r52 = bArr48;
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r52, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r52, (java.lang.CharSequence) r52) + 78033385, objArr62);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr62[0]).intern());
        } catch (util.h.xy.co.b unused10) {
            charSequence2 = "";
            bArr4 = null;
            bArr5 = null;
            bArr6 = null;
            bArr7 = bArr6;
            mbVar2 = null;
            mbVar5 = mbVar2;
            bArr12 = null;
            mbVar7 = null;
            bArr21 = bArr4;
            bArr22 = null;
            bArr23 = null;
            bArr24 = null;
            bArr25 = null;
            bArr26 = null;
            bArr27 = null;
            bArr28 = null;
            bArr29 = null;
            bArr43 = bArr22;
            bArr44 = bArr7;
            java.lang.Object[] objArr422 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr422);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr422[0]).intern());
        } catch (java.lang.Throwable th16) {
            th = th16;
            bArr4 = null;
            bArr5 = null;
            mbVar = null;
            bArr6 = null;
            mbVar5 = mbVar;
            bArr8 = bArr3;
            bArr9 = bArr4;
            bArr10 = bArr5;
            bArr11 = bArr6;
            mbVar6 = null;
            bArr12 = null;
            bArr13 = null;
            bArr14 = null;
            bArr15 = null;
            bArr16 = null;
            bArr17 = null;
            bArr18 = null;
            bArr19 = null;
            bArr20 = null;
            util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
            contentValues.clear();
            if (mbVar5 != null) {
            }
            if (mbVar6 != null) {
            }
            throw th;
        }
        try {
            bArr7 = map.get(util.h.xy.ct.ma.b.f1123);
            try {
                try {
                    str = "getThreadPriority";
                    try {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "¦\u0085\u0082¥¤\u0088£¡", objArr7);
                        try {
                            java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            str2 = "android.os.Process";
                            try {
                                getHighSpeedVideoSizes((byte) (94 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), "\u0014\u0012\u0014\u0013\u0004\n\u0011\u0018\u0015\u0016\u0006\u0004\n\u0005\u000e\u000f\u0017\u0015\u0018\u0010\n\u0012\b\u0017\u000e\u0002", 26 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                num = 0;
                                try {
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes((byte) (32 - (android.os.Process.myTid() >> 22)), "\u000e\u0010\u0002\u0010\u0004\r\u0000\u0010\u0002\u0017㘟", android.view.View.resolveSizeAndState(0, 0, 0) + 11, objArr10);
                                    java.security.SecureRandom secureRandom = (java.security.SecureRandom) cls.getMethod((java.lang.String) objArr10[0], java.lang.String.class).invoke(null, objArr8);
                                    try {
                                        secureRandom.nextBytes(bArr77);
                                        secureRandom.nextBytes(bArr78);
                                        m26039 = util.h.xy.ct.c.m26039(bArr, bArr77, new util.h.xy.cp.ma(), util.h.xy.cr.ra.m26018());
                                    } catch (util.h.xy.cm.ma unused11) {
                                        bArr6 = bArr7;
                                        charSequence4 = "";
                                        bArr7 = bArr6;
                                        mbVar4 = null;
                                        r27 = charSequence4;
                                        mbVar8 = mbVar4;
                                        bArr12 = null;
                                        mbVar9 = null;
                                        bArr30 = r27;
                                        mbVar12 = mbVar9;
                                        bArr31 = null;
                                        bArr23 = null;
                                        bArr32 = null;
                                        bArr33 = null;
                                        bArr25 = null;
                                        bArr34 = null;
                                        bArr28 = null;
                                        bArr41 = bArr30;
                                        bArr29 = null;
                                        bArr48 = bArr41;
                                        bArr49 = bArr31;
                                        bArr50 = bArr7;
                                        mbVar14 = mbVar8;
                                        mbVar15 = mbVar12;
                                        ?? r522 = bArr48;
                                        java.lang.Object[] objArr622 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r522, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r522, (java.lang.CharSequence) r522) + 78033385, objArr622);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr622[0]).intern());
                                    }
                                } catch (java.lang.Throwable th17) {
                                    th = th17;
                                    bArr6 = bArr7;
                                    charSequence4 = "";
                                    try {
                                        java.lang.Throwable cause3 = th.getCause();
                                        if (cause3 == null) {
                                            throw th;
                                        }
                                        throw cause3;
                                    } catch (java.security.NoSuchAlgorithmException unused12) {
                                        bArr7 = bArr6;
                                        mbVar3 = null;
                                        mbVar10 = mbVar3;
                                        bArr12 = null;
                                        mbVar11 = null;
                                        bArr21 = bArr4;
                                        bArr35 = bArr12;
                                        mbVar13 = mbVar11;
                                        bArr36 = null;
                                        bArr37 = null;
                                        bArr25 = null;
                                        bArr38 = null;
                                        bArr39 = null;
                                        bArr28 = null;
                                        bArr29 = null;
                                        bArr40 = bArr5;
                                        bArr42 = null;
                                        bArr53 = bArr7;
                                        mbVar16 = mbVar10;
                                        java.lang.Object[] objArr522 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr522);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr522[0]).intern());
                                    } catch (util.h.xy.cm.ma unused13) {
                                        bArr7 = bArr6;
                                        mbVar4 = null;
                                        r27 = charSequence4;
                                        mbVar8 = mbVar4;
                                        bArr12 = null;
                                        mbVar9 = null;
                                        bArr30 = r27;
                                        mbVar12 = mbVar9;
                                        bArr31 = null;
                                        bArr23 = null;
                                        bArr32 = null;
                                        bArr33 = null;
                                        bArr25 = null;
                                        bArr34 = null;
                                        bArr28 = null;
                                        bArr41 = bArr30;
                                        bArr29 = null;
                                        bArr48 = bArr41;
                                        bArr49 = bArr31;
                                        bArr50 = bArr7;
                                        mbVar14 = mbVar8;
                                        mbVar15 = mbVar12;
                                        ?? r5222 = bArr48;
                                        java.lang.Object[] objArr6222 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r5222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r5222, (java.lang.CharSequence) r5222) + 78033385, objArr6222);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr6222[0]).intern());
                                    } catch (util.h.xy.co.b unused14) {
                                        charSequence2 = charSequence4;
                                        bArr7 = bArr6;
                                        mbVar2 = null;
                                        mbVar5 = mbVar2;
                                        bArr12 = null;
                                        mbVar7 = null;
                                        bArr21 = bArr4;
                                        bArr22 = null;
                                        bArr23 = null;
                                        bArr24 = null;
                                        bArr25 = null;
                                        bArr26 = null;
                                        bArr27 = null;
                                        bArr28 = null;
                                        bArr29 = null;
                                        bArr43 = bArr22;
                                        bArr44 = bArr7;
                                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr4222);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr4222[0]).intern());
                                    } catch (java.lang.Throwable th18) {
                                        th = th18;
                                        mbVar = null;
                                        mbVar5 = mbVar;
                                        bArr8 = bArr3;
                                        bArr9 = bArr4;
                                        bArr10 = bArr5;
                                        bArr11 = bArr6;
                                        mbVar6 = null;
                                        bArr12 = null;
                                        bArr13 = null;
                                        bArr14 = null;
                                        bArr15 = null;
                                        bArr16 = null;
                                        bArr17 = null;
                                        bArr18 = null;
                                        bArr19 = null;
                                        bArr20 = null;
                                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                                        contentValues.clear();
                                        if (mbVar5 != null) {
                                        }
                                        if (mbVar6 != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (java.lang.Throwable th19) {
                                th = th19;
                                bArr6 = bArr7;
                                num = 0;
                            }
                        } catch (java.lang.Throwable th20) {
                            th = th20;
                            bArr6 = bArr7;
                            num = 0;
                            str2 = "android.os.Process";
                        }
                    } catch (util.h.xy.cm.ma unused15) {
                        bArr6 = bArr7;
                        num = 0;
                        str2 = "android.os.Process";
                        charSequence4 = "";
                        bArr7 = bArr6;
                        mbVar4 = null;
                        r27 = charSequence4;
                        mbVar8 = mbVar4;
                        bArr12 = null;
                        mbVar9 = null;
                        bArr30 = r27;
                        mbVar12 = mbVar9;
                        bArr31 = null;
                        bArr23 = null;
                        bArr32 = null;
                        bArr33 = null;
                        bArr25 = null;
                        bArr34 = null;
                        bArr28 = null;
                        bArr41 = bArr30;
                        bArr29 = null;
                        bArr48 = bArr41;
                        bArr49 = bArr31;
                        bArr50 = bArr7;
                        mbVar14 = mbVar8;
                        mbVar15 = mbVar12;
                        ?? r52222 = bArr48;
                        java.lang.Object[] objArr62222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r52222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r52222, (java.lang.CharSequence) r52222) + 78033385, objArr62222);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr62222[0]).intern());
                    }
                } catch (util.h.xy.cm.ma unused16) {
                    bArr6 = bArr7;
                    num = 0;
                    str = "getThreadPriority";
                }
            } catch (java.security.NoSuchAlgorithmException unused17) {
                bArr6 = bArr7;
            } catch (util.h.xy.co.b unused18) {
                bArr6 = bArr7;
                charSequence4 = "";
            } catch (java.lang.Throwable th21) {
                th = th21;
                bArr6 = bArr7;
            }
            try {
                m26038 = util.h.xy.ct.c.m26038(bArr, bArr77);
            } catch (java.security.NoSuchAlgorithmException unused19) {
                mbVar3 = m26039;
                mbVar10 = mbVar3;
                bArr12 = null;
                mbVar11 = null;
                bArr21 = bArr4;
                bArr35 = bArr12;
                mbVar13 = mbVar11;
                bArr36 = null;
                bArr37 = null;
                bArr25 = null;
                bArr38 = null;
                bArr39 = null;
                bArr28 = null;
                bArr29 = null;
                bArr40 = bArr5;
                bArr42 = null;
                bArr53 = bArr7;
                mbVar16 = mbVar10;
                java.lang.Object[] objArr5222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr5222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr5222[0]).intern());
            } catch (util.h.xy.cm.ma unused20) {
                bArr6 = bArr7;
                r27 = "";
                mbVar4 = m26039;
                mbVar8 = mbVar4;
                bArr12 = null;
                mbVar9 = null;
                bArr30 = r27;
                mbVar12 = mbVar9;
                bArr31 = null;
                bArr23 = null;
                bArr32 = null;
                bArr33 = null;
                bArr25 = null;
                bArr34 = null;
                bArr28 = null;
                bArr41 = bArr30;
                bArr29 = null;
                bArr48 = bArr41;
                bArr49 = bArr31;
                bArr50 = bArr7;
                mbVar14 = mbVar8;
                mbVar15 = mbVar12;
                ?? r522222 = bArr48;
                java.lang.Object[] objArr622222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r522222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r522222, (java.lang.CharSequence) r522222) + 78033385, objArr622222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr622222[0]).intern());
            } catch (util.h.xy.co.b unused21) {
                mbVar2 = m26039;
                charSequence2 = "";
                mbVar5 = mbVar2;
                bArr12 = null;
                mbVar7 = null;
                bArr21 = bArr4;
                bArr22 = null;
                bArr23 = null;
                bArr24 = null;
                bArr25 = null;
                bArr26 = null;
                bArr27 = null;
                bArr28 = null;
                bArr29 = null;
                bArr43 = bArr22;
                bArr44 = bArr7;
                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr42222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr42222[0]).intern());
            } catch (java.lang.Throwable th22) {
                th = th22;
                bArr6 = bArr7;
                mbVar = m26039;
                mbVar5 = mbVar;
                bArr8 = bArr3;
                bArr9 = bArr4;
                bArr10 = bArr5;
                bArr11 = bArr6;
                mbVar6 = null;
                bArr12 = null;
                bArr13 = null;
                bArr14 = null;
                bArr15 = null;
                bArr16 = null;
                bArr17 = null;
                bArr18 = null;
                bArr19 = null;
                bArr20 = null;
                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                contentValues.clear();
                if (mbVar5 != null) {
                }
                if (mbVar6 != null) {
                }
                throw th;
            }
            try {
                bArr12 = util.h.xy.cm.rb.m25973(bArr2, bArr78, bArr5);
            } catch (java.security.NoSuchAlgorithmException unused22) {
                bArr55 = bArr7;
                mbVar19 = m26039;
                mbVar11 = m26038;
                bArr12 = null;
            } catch (util.h.xy.cm.ma unused23) {
                bArr6 = bArr7;
                mbVar18 = m26039;
                mbVar9 = m26038;
                r272 = "";
                bArr12 = null;
            } catch (util.h.xy.co.b unused24) {
                bArr54 = bArr7;
                mbVar17 = m26039;
                mbVar7 = m26038;
                charSequence5 = "";
                bArr12 = null;
            } catch (java.lang.Throwable th23) {
                th = th23;
                mbVar5 = m26039;
                bArr8 = bArr3;
                bArr9 = bArr4;
                bArr10 = bArr5;
                bArr11 = bArr7;
                mbVar6 = m26038;
                bArr12 = null;
                bArr13 = null;
                bArr14 = null;
                bArr15 = null;
                bArr16 = null;
                bArr17 = null;
                bArr18 = null;
                bArr19 = null;
                bArr20 = null;
                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                contentValues.clear();
                if (mbVar5 != null) {
                }
                if (mbVar6 != null) {
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused25) {
            bArr6 = null;
            bArr7 = bArr6;
            mbVar3 = null;
            mbVar10 = mbVar3;
            bArr12 = null;
            mbVar11 = null;
            bArr21 = bArr4;
            bArr35 = bArr12;
            mbVar13 = mbVar11;
            bArr36 = null;
            bArr37 = null;
            bArr25 = null;
            bArr38 = null;
            bArr39 = null;
            bArr28 = null;
            bArr29 = null;
            bArr40 = bArr5;
            bArr42 = null;
            bArr53 = bArr7;
            mbVar16 = mbVar10;
            java.lang.Object[] objArr52222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr52222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr52222[0]).intern());
        } catch (util.h.xy.cm.ma unused26) {
            num = 0;
            str = "getThreadPriority";
            str2 = "android.os.Process";
            charSequence4 = "";
            bArr6 = null;
            bArr7 = bArr6;
            mbVar4 = null;
            r27 = charSequence4;
            mbVar8 = mbVar4;
            bArr12 = null;
            mbVar9 = null;
            bArr30 = r27;
            mbVar12 = mbVar9;
            bArr31 = null;
            bArr23 = null;
            bArr32 = null;
            bArr33 = null;
            bArr25 = null;
            bArr34 = null;
            bArr28 = null;
            bArr41 = bArr30;
            bArr29 = null;
            bArr48 = bArr41;
            bArr49 = bArr31;
            bArr50 = bArr7;
            mbVar14 = mbVar8;
            mbVar15 = mbVar12;
            ?? r5222222 = bArr48;
            java.lang.Object[] objArr6222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r5222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r5222222, (java.lang.CharSequence) r5222222) + 78033385, objArr6222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr6222222[0]).intern());
        } catch (util.h.xy.co.b unused27) {
            charSequence2 = "";
            bArr6 = null;
            bArr7 = bArr6;
            mbVar2 = null;
            mbVar5 = mbVar2;
            bArr12 = null;
            mbVar7 = null;
            bArr21 = bArr4;
            bArr22 = null;
            bArr23 = null;
            bArr24 = null;
            bArr25 = null;
            bArr26 = null;
            bArr27 = null;
            bArr28 = null;
            bArr29 = null;
            bArr43 = bArr22;
            bArr44 = bArr7;
            java.lang.Object[] objArr422222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr422222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr422222[0]).intern());
        } catch (java.lang.Throwable th24) {
            th = th24;
            mbVar = null;
            bArr6 = null;
            mbVar5 = mbVar;
            bArr8 = bArr3;
            bArr9 = bArr4;
            bArr10 = bArr5;
            bArr11 = bArr6;
            mbVar6 = null;
            bArr12 = null;
            bArr13 = null;
            bArr14 = null;
            bArr15 = null;
            bArr16 = null;
            bArr17 = null;
            bArr18 = null;
            bArr19 = null;
            bArr20 = null;
            util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
            contentValues.clear();
            if (mbVar5 != null) {
            }
            if (mbVar6 != null) {
            }
            throw th;
        }
        try {
            bArr23 = util.h.xy.cm.rb.m25973(m26039.getEncoded(), bArr78, bArr12);
            try {
                m25973 = util.h.xy.cm.rb.m25973(m26039.getEncoded(), bArr78, bArr3);
            } catch (java.security.NoSuchAlgorithmException unused28) {
                bArr66 = bArr7;
                mbVar20 = m26039;
                mbVar22 = m26038;
                bArr67 = null;
            } catch (util.h.xy.cm.ma unused29) {
                bArr6 = bArr7;
                mbVar20 = m26039;
                mbVar21 = m26038;
                r273 = "";
                bArr65 = null;
            } catch (util.h.xy.co.b unused30) {
                bArr63 = bArr7;
                mbVar20 = m26039;
                mbVar7 = m26038;
                charSequence6 = "";
                bArr64 = null;
            } catch (java.lang.Throwable th25) {
                th = th25;
                bArr6 = bArr7;
                mbVar20 = m26039;
                mbVar7 = m26038;
                bArr56 = null;
                bArr57 = bArr56;
                bArr58 = null;
                bArr59 = bArr58;
                bArr60 = null;
                bArr25 = null;
                bArr61 = null;
                bArr62 = null;
                bArr28 = bArr59;
                bArr29 = null;
                bArr18 = bArr61;
                bArr14 = bArr60;
                bArr19 = bArr62;
                bArr13 = bArr23;
                bArr15 = bArr57;
                bArr8 = bArr3;
                bArr17 = bArr25;
                bArr9 = bArr4;
                bArr10 = bArr5;
                bArr11 = bArr6;
                bArr16 = bArr28;
                bArr20 = bArr29;
                mbVar6 = mbVar7;
                mbVar5 = mbVar20;
                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                contentValues.clear();
                if (mbVar5 != null) {
                }
                if (mbVar6 != null) {
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused31) {
            bArr55 = bArr7;
            mbVar19 = m26039;
            mbVar11 = m26038;
            mbVar10 = mbVar19;
            bArr7 = bArr55;
            bArr21 = bArr4;
            bArr35 = bArr12;
            mbVar13 = mbVar11;
            bArr36 = null;
            bArr37 = null;
            bArr25 = null;
            bArr38 = null;
            bArr39 = null;
            bArr28 = null;
            bArr29 = null;
            bArr40 = bArr5;
            bArr42 = null;
            bArr53 = bArr7;
            mbVar16 = mbVar10;
            java.lang.Object[] objArr522222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr522222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr522222[0]).intern());
        } catch (util.h.xy.cm.ma unused32) {
            bArr6 = bArr7;
            mbVar18 = m26039;
            mbVar9 = m26038;
            r272 = "";
            mbVar8 = mbVar18;
            bArr7 = bArr6;
            bArr30 = r272;
            mbVar12 = mbVar9;
            bArr31 = null;
            bArr23 = null;
            bArr32 = null;
            bArr33 = null;
            bArr25 = null;
            bArr34 = null;
            bArr28 = null;
            bArr41 = bArr30;
            bArr29 = null;
            bArr48 = bArr41;
            bArr49 = bArr31;
            bArr50 = bArr7;
            mbVar14 = mbVar8;
            mbVar15 = mbVar12;
            ?? r52222222 = bArr48;
            java.lang.Object[] objArr62222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r52222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r52222222, (java.lang.CharSequence) r52222222) + 78033385, objArr62222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr62222222[0]).intern());
        } catch (util.h.xy.co.b unused33) {
            bArr54 = bArr7;
            mbVar17 = m26039;
            mbVar7 = m26038;
            charSequence5 = "";
            mbVar5 = mbVar17;
            charSequence2 = charSequence5;
            bArr7 = bArr54;
            bArr21 = bArr4;
            bArr22 = null;
            bArr23 = null;
            bArr24 = null;
            bArr25 = null;
            bArr26 = null;
            bArr27 = null;
            bArr28 = null;
            bArr29 = null;
            bArr43 = bArr22;
            bArr44 = bArr7;
            java.lang.Object[] objArr4222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr4222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr4222222[0]).intern());
        } catch (java.lang.Throwable th26) {
            th = th26;
            bArr6 = bArr7;
            mbVar20 = m26039;
            mbVar7 = m26038;
            bArr23 = null;
        }
        try {
            m259732 = util.h.xy.cm.rb.m25973(m26039.getEncoded(), bArr78, bArr4);
            r274 = "";
            try {
                bArr25 = util.h.xy.cm.rb.m25973(m26039.getEncoded(), bArr78, bArr7);
                mbVar20 = m26039;
                try {
                    bArr60 = util.h.xy.cm.rb.m25973(m26038.getEncoded(), bArr78, bArr23);
                    bArr6 = bArr7;
                    try {
                        bArr61 = util.h.xy.cm.rb.m25973(m26038.getEncoded(), bArr78, m25973);
                        bArr76 = m25973;
                    } catch (java.security.NoSuchAlgorithmException unused34) {
                        mbVar24 = m26038;
                        bArr76 = m25973;
                        bArr28 = m259732;
                        bArr61 = null;
                    } catch (util.h.xy.cm.ma unused35) {
                        mbVar23 = m26038;
                        bArr76 = m25973;
                        bArr28 = m259732;
                        bArr61 = null;
                    } catch (util.h.xy.co.b unused36) {
                        mbVar7 = m26038;
                        bArr76 = m25973;
                        bArr28 = m259732;
                        bArr61 = null;
                    } catch (java.lang.Throwable th27) {
                        th = th27;
                        mbVar7 = m26038;
                        bArr57 = m25973;
                        bArr59 = m259732;
                        bArr61 = null;
                        bArr62 = null;
                        bArr28 = bArr59;
                        bArr29 = null;
                        bArr18 = bArr61;
                        bArr14 = bArr60;
                        bArr19 = bArr62;
                        bArr13 = bArr23;
                        bArr15 = bArr57;
                        bArr8 = bArr3;
                        bArr17 = bArr25;
                        bArr9 = bArr4;
                        bArr10 = bArr5;
                        bArr11 = bArr6;
                        bArr16 = bArr28;
                        bArr20 = bArr29;
                        mbVar6 = mbVar7;
                        mbVar5 = mbVar20;
                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                        contentValues.clear();
                        if (mbVar5 != null) {
                        }
                        if (mbVar6 != null) {
                        }
                        throw th;
                    }
                } catch (java.security.NoSuchAlgorithmException unused37) {
                    bArr66 = bArr7;
                    mbVar22 = m26038;
                    bArr70 = m25973;
                    bArr74 = m259732;
                    mbVar10 = mbVar20;
                    bArr39 = bArr70;
                    bArr28 = bArr74;
                    bArr21 = bArr4;
                    bArr35 = bArr12;
                    bArr7 = bArr66;
                    mbVar13 = mbVar22;
                    bArr38 = null;
                    bArr29 = null;
                    bArr37 = bArr23;
                    bArr40 = bArr5;
                    bArr36 = null;
                    bArr42 = null;
                    bArr53 = bArr7;
                    mbVar16 = mbVar10;
                    java.lang.Object[] objArr5222222 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr5222222);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr5222222[0]).intern());
                } catch (util.h.xy.cm.ma unused38) {
                    bArr6 = bArr7;
                    mbVar21 = m26038;
                    bArr28 = m259732;
                    bArr32 = m25973;
                    bArr75 = r274;
                    mbVar8 = mbVar20;
                    bArr7 = bArr6;
                    mbVar12 = mbVar21;
                    bArr31 = null;
                    bArr33 = null;
                    bArr34 = null;
                    bArr41 = bArr75;
                    bArr29 = null;
                    bArr48 = bArr41;
                    bArr49 = bArr31;
                    bArr50 = bArr7;
                    mbVar14 = mbVar8;
                    mbVar15 = mbVar12;
                    ?? r522222222 = bArr48;
                    java.lang.Object[] objArr622222222 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r522222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r522222222, (java.lang.CharSequence) r522222222) + 78033385, objArr622222222);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr622222222[0]).intern());
                } catch (util.h.xy.co.b unused39) {
                    bArr63 = bArr7;
                    mbVar7 = m26038;
                    bArr68 = m25973;
                    bArr72 = m259732;
                    charSequence8 = r274;
                    mbVar5 = mbVar20;
                    bArr28 = bArr72;
                    bArr21 = bArr4;
                    charSequence2 = charSequence8;
                    bArr7 = bArr63;
                    bArr22 = null;
                    bArr27 = null;
                    bArr29 = null;
                    bArr26 = bArr68;
                    bArr24 = null;
                    bArr43 = bArr22;
                    bArr44 = bArr7;
                    java.lang.Object[] objArr42222222 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr42222222);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr42222222[0]).intern());
                } catch (java.lang.Throwable th28) {
                    th = th28;
                    bArr6 = bArr7;
                    mbVar7 = m26038;
                    bArr57 = m25973;
                    bArr59 = m259732;
                    bArr60 = null;
                }
            } catch (java.security.NoSuchAlgorithmException unused40) {
                bArr66 = bArr7;
                mbVar20 = m26039;
                mbVar22 = m26038;
                bArr71 = m259732;
                bArr70 = m25973;
                bArr74 = bArr71;
                bArr25 = null;
                mbVar10 = mbVar20;
                bArr39 = bArr70;
                bArr28 = bArr74;
                bArr21 = bArr4;
                bArr35 = bArr12;
                bArr7 = bArr66;
                mbVar13 = mbVar22;
                bArr38 = null;
                bArr29 = null;
                bArr37 = bArr23;
                bArr40 = bArr5;
                bArr36 = null;
                bArr42 = null;
                bArr53 = bArr7;
                mbVar16 = mbVar10;
                java.lang.Object[] objArr52222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr52222222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr52222222[0]).intern());
            } catch (util.h.xy.cm.ma unused41) {
                bArr6 = bArr7;
                mbVar20 = m26039;
                mbVar21 = m26038;
                bArr28 = m259732;
                bArr32 = m25973;
                bArr73 = r274;
                bArr25 = null;
                bArr75 = bArr73;
                mbVar8 = mbVar20;
                bArr7 = bArr6;
                mbVar12 = mbVar21;
                bArr31 = null;
                bArr33 = null;
                bArr34 = null;
                bArr41 = bArr75;
                bArr29 = null;
                bArr48 = bArr41;
                bArr49 = bArr31;
                bArr50 = bArr7;
                mbVar14 = mbVar8;
                mbVar15 = mbVar12;
                ?? r5222222222 = bArr48;
                java.lang.Object[] objArr6222222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r5222222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r5222222222, (java.lang.CharSequence) r5222222222) + 78033385, objArr6222222222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr6222222222[0]).intern());
            } catch (util.h.xy.co.b unused42) {
                bArr63 = bArr7;
                mbVar20 = m26039;
                mbVar7 = m26038;
                bArr69 = m259732;
                bArr68 = m25973;
                charSequence7 = r274;
                bArr72 = bArr69;
                bArr25 = null;
                charSequence8 = charSequence7;
                mbVar5 = mbVar20;
                bArr28 = bArr72;
                bArr21 = bArr4;
                charSequence2 = charSequence8;
                bArr7 = bArr63;
                bArr22 = null;
                bArr27 = null;
                bArr29 = null;
                bArr26 = bArr68;
                bArr24 = null;
                bArr43 = bArr22;
                bArr44 = bArr7;
                java.lang.Object[] objArr422222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr422222222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr422222222[0]).intern());
            } catch (java.lang.Throwable th29) {
                th = th29;
                bArr6 = bArr7;
                mbVar20 = m26039;
                mbVar7 = m26038;
                bArr58 = m259732;
                bArr57 = m25973;
                bArr59 = bArr58;
                bArr60 = null;
                bArr25 = null;
                bArr61 = null;
                bArr62 = null;
                bArr28 = bArr59;
                bArr29 = null;
                bArr18 = bArr61;
                bArr14 = bArr60;
                bArr19 = bArr62;
                bArr13 = bArr23;
                bArr15 = bArr57;
                bArr8 = bArr3;
                bArr17 = bArr25;
                bArr9 = bArr4;
                bArr10 = bArr5;
                bArr11 = bArr6;
                bArr16 = bArr28;
                bArr20 = bArr29;
                mbVar6 = mbVar7;
                mbVar5 = mbVar20;
                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                contentValues.clear();
                if (mbVar5 != null) {
                }
                if (mbVar6 != null) {
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused43) {
            bArr66 = bArr7;
            mbVar20 = m26039;
            mbVar22 = m26038;
            bArr67 = m25973;
            bArr70 = bArr67;
            bArr71 = null;
            bArr74 = bArr71;
            bArr25 = null;
            mbVar10 = mbVar20;
            bArr39 = bArr70;
            bArr28 = bArr74;
            bArr21 = bArr4;
            bArr35 = bArr12;
            bArr7 = bArr66;
            mbVar13 = mbVar22;
            bArr38 = null;
            bArr29 = null;
            bArr37 = bArr23;
            bArr40 = bArr5;
            bArr36 = null;
            bArr42 = null;
            bArr53 = bArr7;
            mbVar16 = mbVar10;
            java.lang.Object[] objArr522222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr522222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr522222222[0]).intern());
        } catch (util.h.xy.cm.ma unused44) {
            bArr6 = bArr7;
            mbVar20 = m26039;
            mbVar21 = m26038;
            r273 = "";
            bArr65 = m25973;
            bArr32 = bArr65;
            bArr28 = null;
            bArr73 = r273;
            bArr25 = null;
            bArr75 = bArr73;
            mbVar8 = mbVar20;
            bArr7 = bArr6;
            mbVar12 = mbVar21;
            bArr31 = null;
            bArr33 = null;
            bArr34 = null;
            bArr41 = bArr75;
            bArr29 = null;
            bArr48 = bArr41;
            bArr49 = bArr31;
            bArr50 = bArr7;
            mbVar14 = mbVar8;
            mbVar15 = mbVar12;
            ?? r52222222222 = bArr48;
            java.lang.Object[] objArr62222222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r52222222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r52222222222, (java.lang.CharSequence) r52222222222) + 78033385, objArr62222222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr62222222222[0]).intern());
        } catch (util.h.xy.co.b unused45) {
            bArr63 = bArr7;
            mbVar20 = m26039;
            mbVar7 = m26038;
            charSequence6 = "";
            bArr64 = m25973;
            bArr68 = bArr64;
            bArr69 = null;
            charSequence7 = charSequence6;
            bArr72 = bArr69;
            bArr25 = null;
            charSequence8 = charSequence7;
            mbVar5 = mbVar20;
            bArr28 = bArr72;
            bArr21 = bArr4;
            charSequence2 = charSequence8;
            bArr7 = bArr63;
            bArr22 = null;
            bArr27 = null;
            bArr29 = null;
            bArr26 = bArr68;
            bArr24 = null;
            bArr43 = bArr22;
            bArr44 = bArr7;
            java.lang.Object[] objArr4222222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr4222222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr4222222222[0]).intern());
        } catch (java.lang.Throwable th30) {
            th = th30;
            bArr6 = bArr7;
            mbVar20 = m26039;
            mbVar7 = m26038;
            bArr56 = m25973;
            bArr57 = bArr56;
            bArr58 = null;
            bArr59 = bArr58;
            bArr60 = null;
            bArr25 = null;
            bArr61 = null;
            bArr62 = null;
            bArr28 = bArr59;
            bArr29 = null;
            bArr18 = bArr61;
            bArr14 = bArr60;
            bArr19 = bArr62;
            bArr13 = bArr23;
            bArr15 = bArr57;
            bArr8 = bArr3;
            bArr17 = bArr25;
            bArr9 = bArr4;
            bArr10 = bArr5;
            bArr11 = bArr6;
            bArr16 = bArr28;
            bArr20 = bArr29;
            mbVar6 = mbVar7;
            mbVar5 = mbVar20;
            util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
            contentValues.clear();
            if (mbVar5 != null) {
            }
            if (mbVar6 != null) {
            }
            throw th;
        }
        try {
            bArr24 = util.h.xy.cm.rb.m25973(m26038.getEncoded(), bArr78, m259732);
            bArr28 = m259732;
            try {
                byte[] m259733 = util.h.xy.cm.rb.m25973(m26038.getEncoded(), bArr78, bArr25);
                try {
                    mbVar7 = m26038;
                    try {
                        contentValues.put(util.h.xy.ct.b.a.getInputFormats.getHighSpeedVideoFpsRanges(), bArr60);
                        contentValues.put(util.h.xy.ct.b.a.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(), bArr61);
                        contentValues.put(util.h.xy.ct.b.a.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(), bArr24);
                        contentValues.put(util.h.xy.ct.b.a.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(), m259733);
                        contentValues.put(util.h.xy.ct.b.a.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(), bArr77);
                        contentValues.put(util.h.xy.ct.b.a.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(), bArr78);
                        java.lang.String str3 = new java.lang.String(bArr);
                        util.h.xy.co.a m25988 = util.h.xy.co.ma.m25988();
                        bArr29 = m259733;
                        try {
                            try {
                                if (m25988.mo25983(this.toString, str3)) {
                                    try {
                                        m25988.W_(this.toString, str3, contentValues);
                                    } catch (java.lang.Throwable th31) {
                                        th = th31;
                                        bArr51 = bArr61;
                                        bArr34 = bArr60;
                                        bArr52 = bArr6;
                                        mbVar15 = mbVar7;
                                        bArr6 = bArr76;
                                        mbVar5 = mbVar20;
                                        bArr18 = bArr51;
                                        bArr11 = bArr52;
                                        bArr19 = bArr24;
                                        bArr8 = bArr3;
                                        bArr17 = bArr25;
                                        bArr9 = bArr4;
                                        mbVar6 = mbVar15;
                                        bArr14 = bArr34;
                                        bArr15 = bArr6;
                                        bArr16 = bArr28;
                                        bArr20 = bArr29;
                                        bArr13 = bArr23;
                                        bArr10 = bArr5;
                                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                                        contentValues.clear();
                                        if (mbVar5 != null) {
                                        }
                                        if (mbVar6 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    m25988.V_(this.toString, str3, contentValues);
                                }
                                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr23, bArr60, bArr78, bArr5, bArr3, bArr4, bArr6, bArr76, bArr28, bArr25, bArr61, bArr24, bArr29);
                                contentValues.clear();
                                if (mbVar20 != null) {
                                    mbVar20.m26028();
                                }
                                if (mbVar7 != null) {
                                    mbVar7.m26028();
                                }
                            } catch (java.lang.Throwable th32) {
                                th = th32;
                                bArr62 = bArr24;
                                bArr57 = bArr76;
                                bArr18 = bArr61;
                                bArr14 = bArr60;
                                bArr19 = bArr62;
                                bArr13 = bArr23;
                                bArr15 = bArr57;
                                bArr8 = bArr3;
                                bArr17 = bArr25;
                                bArr9 = bArr4;
                                bArr10 = bArr5;
                                bArr11 = bArr6;
                                bArr16 = bArr28;
                                bArr20 = bArr29;
                                mbVar6 = mbVar7;
                                mbVar5 = mbVar20;
                                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                                contentValues.clear();
                                if (mbVar5 != null) {
                                }
                                if (mbVar6 != null) {
                                }
                                throw th;
                            }
                        } catch (java.security.NoSuchAlgorithmException unused46) {
                            bArr39 = bArr76;
                            bArr21 = bArr4;
                            bArr35 = bArr12;
                            mbVar13 = mbVar7;
                            bArr38 = bArr24;
                            bArr40 = bArr5;
                            bArr42 = bArr61;
                            bArr37 = bArr23;
                            bArr7 = bArr6;
                            bArr36 = bArr60;
                            mbVar10 = mbVar20;
                            bArr53 = bArr7;
                            mbVar16 = mbVar10;
                            java.lang.Object[] objArr5222222222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr5222222222);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr5222222222[0]).intern());
                        } catch (util.h.xy.cm.ma unused47) {
                            bArr31 = bArr61;
                            bArr34 = bArr60;
                            bArr33 = bArr24;
                            bArr7 = bArr6;
                            mbVar12 = mbVar7;
                            bArr32 = bArr76;
                            mbVar8 = mbVar20;
                            bArr48 = r274;
                            bArr49 = bArr31;
                            bArr50 = bArr7;
                            mbVar14 = mbVar8;
                            mbVar15 = mbVar12;
                            ?? r522222222222 = bArr48;
                            java.lang.Object[] objArr622222222222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r522222222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r522222222222, (java.lang.CharSequence) r522222222222) + 78033385, objArr622222222222);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr622222222222[0]).intern());
                        } catch (util.h.xy.co.b unused48) {
                            bArr22 = bArr61;
                            bArr27 = bArr60;
                            bArr21 = bArr4;
                            charSequence2 = r274;
                            bArr7 = bArr6;
                            bArr26 = bArr76;
                            mbVar5 = mbVar20;
                            bArr43 = bArr22;
                            bArr44 = bArr7;
                            java.lang.Object[] objArr42222222222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr42222222222);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr42222222222[0]).intern());
                        }
                    } catch (java.security.NoSuchAlgorithmException unused49) {
                        bArr29 = m259733;
                        bArr39 = bArr76;
                        bArr21 = bArr4;
                        bArr35 = bArr12;
                        mbVar13 = mbVar7;
                        bArr38 = bArr24;
                        bArr40 = bArr5;
                        bArr42 = bArr61;
                        bArr37 = bArr23;
                        bArr7 = bArr6;
                        bArr36 = bArr60;
                        mbVar10 = mbVar20;
                        bArr53 = bArr7;
                        mbVar16 = mbVar10;
                        java.lang.Object[] objArr52222222222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr52222222222);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr52222222222[0]).intern());
                    } catch (util.h.xy.cm.ma unused50) {
                        bArr29 = m259733;
                        bArr31 = bArr61;
                        bArr34 = bArr60;
                        bArr33 = bArr24;
                        bArr7 = bArr6;
                        mbVar12 = mbVar7;
                        bArr32 = bArr76;
                        mbVar8 = mbVar20;
                        bArr48 = r274;
                        bArr49 = bArr31;
                        bArr50 = bArr7;
                        mbVar14 = mbVar8;
                        mbVar15 = mbVar12;
                        ?? r5222222222222 = bArr48;
                        java.lang.Object[] objArr6222222222222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r5222222222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r5222222222222, (java.lang.CharSequence) r5222222222222) + 78033385, objArr6222222222222);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr6222222222222[0]).intern());
                    } catch (util.h.xy.co.b unused51) {
                        bArr29 = m259733;
                        bArr22 = bArr61;
                        bArr27 = bArr60;
                        bArr21 = bArr4;
                        charSequence2 = r274;
                        bArr7 = bArr6;
                        bArr26 = bArr76;
                        mbVar5 = mbVar20;
                        bArr43 = bArr22;
                        bArr44 = bArr7;
                        java.lang.Object[] objArr422222222222 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr422222222222);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr422222222222[0]).intern());
                    } catch (java.lang.Throwable th33) {
                        th = th33;
                        bArr29 = m259733;
                        bArr62 = bArr24;
                        bArr57 = bArr76;
                        bArr18 = bArr61;
                        bArr14 = bArr60;
                        bArr19 = bArr62;
                        bArr13 = bArr23;
                        bArr15 = bArr57;
                        bArr8 = bArr3;
                        bArr17 = bArr25;
                        bArr9 = bArr4;
                        bArr10 = bArr5;
                        bArr11 = bArr6;
                        bArr16 = bArr28;
                        bArr20 = bArr29;
                        mbVar6 = mbVar7;
                        mbVar5 = mbVar20;
                        util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                        contentValues.clear();
                        if (mbVar5 != null) {
                        }
                        if (mbVar6 != null) {
                        }
                        throw th;
                    }
                } catch (java.security.NoSuchAlgorithmException unused52) {
                    mbVar7 = m26038;
                } catch (util.h.xy.cm.ma unused53) {
                    mbVar7 = m26038;
                } catch (util.h.xy.co.b unused54) {
                    mbVar7 = m26038;
                } catch (java.lang.Throwable th34) {
                    th = th34;
                    mbVar7 = m26038;
                }
            } catch (java.security.NoSuchAlgorithmException unused55) {
                mbVar24 = m26038;
                bArr39 = bArr76;
                bArr21 = bArr4;
                bArr35 = bArr12;
                mbVar13 = mbVar24;
                bArr29 = null;
                bArr38 = bArr24;
                bArr40 = bArr5;
                bArr42 = bArr61;
                bArr37 = bArr23;
                bArr7 = bArr6;
                bArr36 = bArr60;
                mbVar10 = mbVar20;
                bArr53 = bArr7;
                mbVar16 = mbVar10;
                java.lang.Object[] objArr522222222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr522222222222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr522222222222[0]).intern());
            } catch (util.h.xy.cm.ma unused56) {
                mbVar23 = m26038;
                bArr31 = bArr61;
                bArr34 = bArr60;
                bArr33 = bArr24;
                bArr7 = bArr6;
                mbVar12 = mbVar23;
                bArr29 = null;
                bArr32 = bArr76;
                mbVar8 = mbVar20;
                bArr48 = r274;
                bArr49 = bArr31;
                bArr50 = bArr7;
                mbVar14 = mbVar8;
                mbVar15 = mbVar12;
                ?? r52222222222222 = bArr48;
                java.lang.Object[] objArr62222222222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r52222222222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r52222222222222, (java.lang.CharSequence) r52222222222222) + 78033385, objArr62222222222222);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr62222222222222[0]).intern());
            } catch (util.h.xy.co.b unused57) {
                mbVar7 = m26038;
                bArr29 = null;
            } catch (java.lang.Throwable th35) {
                th = th35;
                mbVar7 = m26038;
                bArr62 = bArr24;
                bArr59 = bArr28;
                bArr57 = bArr76;
                bArr28 = bArr59;
                bArr29 = null;
                bArr18 = bArr61;
                bArr14 = bArr60;
                bArr19 = bArr62;
                bArr13 = bArr23;
                bArr15 = bArr57;
                bArr8 = bArr3;
                bArr17 = bArr25;
                bArr9 = bArr4;
                bArr10 = bArr5;
                bArr11 = bArr6;
                bArr16 = bArr28;
                bArr20 = bArr29;
                mbVar6 = mbVar7;
                mbVar5 = mbVar20;
                util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
                contentValues.clear();
                if (mbVar5 != null) {
                }
                if (mbVar6 != null) {
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused58) {
            mbVar24 = m26038;
            bArr28 = m259732;
            bArr24 = null;
            bArr39 = bArr76;
            bArr21 = bArr4;
            bArr35 = bArr12;
            mbVar13 = mbVar24;
            bArr29 = null;
            bArr38 = bArr24;
            bArr40 = bArr5;
            bArr42 = bArr61;
            bArr37 = bArr23;
            bArr7 = bArr6;
            bArr36 = bArr60;
            mbVar10 = mbVar20;
            bArr53 = bArr7;
            mbVar16 = mbVar10;
            java.lang.Object[] objArr5222222222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1724379162, (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-65) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-42) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 78033385, objArr5222222222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr5222222222222[0]).intern());
        } catch (util.h.xy.cm.ma unused59) {
            mbVar23 = m26038;
            bArr28 = m259732;
            bArr24 = null;
            bArr31 = bArr61;
            bArr34 = bArr60;
            bArr33 = bArr24;
            bArr7 = bArr6;
            mbVar12 = mbVar23;
            bArr29 = null;
            bArr32 = bArr76;
            mbVar8 = mbVar20;
            bArr48 = r274;
            bArr49 = bArr31;
            bArr50 = bArr7;
            mbVar14 = mbVar8;
            mbVar15 = mbVar12;
            ?? r522222222222222 = bArr48;
            java.lang.Object[] objArr622222222222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-65) - android.text.TextUtils.lastIndexOf(r522222222222222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-43) - ((((java.lang.Integer) java.lang.Class.forName(str2).getMethod(str, java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), android.text.TextUtils.indexOf((java.lang.CharSequence) r522222222222222, (java.lang.CharSequence) r522222222222222) + 78033385, objArr622222222222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr622222222222222[0]).intern());
        } catch (util.h.xy.co.b unused60) {
            mbVar7 = m26038;
            bArr28 = m259732;
            bArr22 = bArr61;
            bArr27 = bArr60;
            bArr21 = bArr4;
            charSequence2 = r274;
            bArr7 = bArr6;
            bArr24 = null;
            bArr29 = null;
            bArr26 = bArr76;
            mbVar5 = mbVar20;
            bArr43 = bArr22;
            bArr44 = bArr7;
            java.lang.Object[] objArr4222222222222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(1724379164 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63), android.graphics.Color.red(0) - 43, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 78033384, objArr4222222222222);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr4222222222222[0]).intern());
        } catch (java.lang.Throwable th36) {
            th = th36;
            mbVar7 = m26038;
            bArr57 = bArr76;
            bArr59 = m259732;
            bArr62 = null;
            bArr28 = bArr59;
            bArr29 = null;
            bArr18 = bArr61;
            bArr14 = bArr60;
            bArr19 = bArr62;
            bArr13 = bArr23;
            bArr15 = bArr57;
            bArr8 = bArr3;
            bArr17 = bArr25;
            bArr9 = bArr4;
            bArr10 = bArr5;
            bArr11 = bArr6;
            bArr16 = bArr28;
            bArr20 = bArr29;
            mbVar6 = mbVar7;
            mbVar5 = mbVar20;
            util.h.xy.cv.ra.m26068(bArr77, bArr12, bArr13, bArr14, bArr78, bArr10, bArr8, bArr9, bArr11, bArr15, bArr16, bArr17, bArr18, bArr19, bArr20);
            contentValues.clear();
            if (mbVar5 != null) {
            }
            if (mbVar6 != null) {
            }
            throw th;
        }
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.ct.mc {
        int i = getOutputSizes + 37;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            if (util.h.xy.cv.ra.m26070(bArr)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724379259 - android.graphics.Color.blue(0), (short) android.text.TextUtils.getOffsetAfter("", 0), (byte) ((-127) - android.widget.ExpandableListView.getPackedPositionType(0L)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 41, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 78033399, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            try {
                util.h.xy.co.a m25988 = util.h.xy.co.ma.m25988();
                m25988.mo25987(this.toString, new java.lang.String(bArr));
                m25988.mo25985(this.toString);
                getOutputSizes = (getInputSizeshNQ4ISI + 39) % 128;
                return;
            } catch (util.h.xy.co.b unused) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.view.KeyEvent.getMaxKeyCode() >> 16), "\u0099\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009e\u008f\u008d\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0083", objArr2);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr2[0]).intern());
            }
        }
        util.h.xy.cv.ra.m26070(bArr);
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoFpsRanges() throws util.h.xy.ct.mc {
        int i = getOutputSizes + 17;
        getInputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 != 0) {
                util.h.xy.co.ma.m25988().mo25985(this.toString);
            } else {
                util.h.xy.co.ma.m25988().mo25985(this.toString);
                throw new java.lang.NullPointerException();
            }
        } catch (util.h.xy.co.b unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u0099\u0093\u0094\u0093\u009c\u008c\u0094\u0095\u0091\u008f\u0090\u0092\u008c\u0096\u0095\u008f\u009e\u008f\u008d\u008c\u0091\u0090\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u008a\u0083", objArr);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr[0]).intern());
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputFormats = new char[]{41970, 41896, 41969, 41906, 41905, 41893, 41982, 41971, 41983, 41909, 41871, 41915, 41907, 41870, 41903, 41917, 41968, 41877, 41912, 41913, 41897, 41902, 41919, 41910, 41898};
        getHighSpeedVideoSizesFor = (char) 38467;
    }

    static void Camera2StreamConfigurationMap() {
        getOutputSizeshNQ4ISI = 2123958148;
        getOutputFormats = -408873070;
        getOutputStallDuration = 486037892;
        getHighSpeedVideoSizes = new byte[]{89, -82, 94, com.visa.cbp.getEncExpo.IResultReceiver, -107, 92, 88, com.visa.cbp.getEncExpo.IResultReceiver, -121, -86, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 83, -34, -2, 0, -18, 87, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, -17, -18, com.google.common.base.Ascii.SUB, 80, -86, -22, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, 16, -31, 16, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -86, -22, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, 16, -31, 16, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -88, -22, 16, 18, -30, 68, -67, 16, -18, 19, 62, -54, 104, -117, 62, -37, -104, -120, 114, -119, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -40, -118, 116, -102, 35, -42, 70, 116, 117, 114, 121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -33, 114, 62, -59, 113, -122, 118, 63, -54, 114, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -35, 116, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 63, -51, -119, -122, com.visa.cbp.getEncExpo.IResultReceiver, 118, -124, 34, -42, 101, -117, 58, -54, Byte.MIN_VALUE, 98, -102, 124, -122, 115, 33, -54, -116, -123, 37, -33, 114, 62, -62, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 122, -115, 98, -43, -11, com.google.common.base.Ascii.VT, -27, 92, -76, com.google.common.base.Ascii.RS, 17, -28, -27, 17, 91, -95, -31, com.google.common.base.Ascii.GS, -21, 13, -10, 75, -93, -31, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, -23, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -74, com.google.common.base.Ascii.ESC, -27, com.google.common.base.Ascii.CAN, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 16, -67, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -69, -80, -3, com.google.common.base.Ascii.SYN, -69, -9, com.google.common.base.Ascii.FF, -72, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -10, 3, -69, -6, com.google.common.base.Ascii.DC4, -67, -71, -10, 4, 64, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -66, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 77, -21, com.google.common.base.Ascii.VT, -71, -77, 68, -85, 84, 116, -118, 100, -35, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -97, -112, 101, 100, -112, -38, 32, com.visa.cbp.getEncExpo.IResultReceiver2, -100, 108, -118, 118, -110, 103, 101, -44, 34, com.visa.cbp.getEncExpo.IResultReceiver2, -102, -104, 104, -50, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -102, 100, com.visa.cbp.getEncExpo.registerForActivityResult, -76, 92, 93, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 81, com.google.common.base.Ascii.FS, -9, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.SYN, -19, 89, -82, 94, com.google.common.base.Ascii.ETB, -30, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.ESC, -11, 92, 88, com.google.common.base.Ascii.ETB, -27, -95, -82, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 94, -84, 10, -22, 88, 82, -91, 74, -40, -40, -40, -40, -40, -40, -40, -40};
        getHighSpeedVideoFpsRangesFor = new char[]{64173, 64146, 64175, 64172, 64150, 64156, 64171, 64163, 64148, 64114, 64113, 64192, 64121, 64136, 64139, 64116, 64143, 64141, 64131, 64124, 64118, 64137, 64125, 64127, 64182, 64119, 64149, 64140, 64130, 64112, 64123, 64195, 64157, 64186, 64168, 64179, 64144, 64169};
        getValidOutputFormatsForInputhNQ4ISI = -1074857248;
        getHighResolutionOutputSizeshNQ4ISI = true;
        getOutputMinFrameDuration = true;
    }
}
