package util.h.xy.s;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getOutputFormats = 1;
    private java.util.Map<java.lang.String, byte[]> getInputFormats;
    private util.h.xy.s.a.b getInputSizeshNQ4ISI;
    private util.h.xy.s.f[] getOutputSizeshNQ4ISI;
    private static char[] getHighSpeedVideoSizes = {64279, 64242, 64250, 64271, 64240, 64247, 64264, 64332, 64252, 64254, 64243, 64267, 64248, 64335, 64303, 64296, 64266, 64253, 64249, 64231, 64319, 64306, 64316, 64265, 64275, 64286, 64283, 64251, 64297, 64281, 64244, 64241};
    private static int getOutputMinFrameDuration = -1074857108;
    private static boolean getHighSpeedVideoFpsRanges = true;
    private static boolean getHighSpeedVideoSizesFor = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static int Camera2StreamConfigurationMap = 1;
        private static long getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static final /* synthetic */ util.h.xy.s.a.b[] getHighSpeedVideoSizes;
        private static int getInputSizeshNQ4ISI;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.s.a.b f2295;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.s.a.b f2296;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.s.a.b f2297;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.s.a.b f2298;
        private final byte getInputFormats;
        private java.lang.String getOutputMinFrameDuration;

        public static util.h.xy.s.a.b valueOf(java.lang.String str) {
            getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
            util.h.xy.s.a.b bVar = (util.h.xy.s.a.b) java.lang.Enum.valueOf(util.h.xy.s.a.b.class, str);
            int i = getInputSizeshNQ4ISI + 63;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        public static util.h.xy.s.a.b[] values() {
            int i = getInputSizeshNQ4ISI + 31;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            util.h.xy.s.a.b[] bVarArr = (util.h.xy.s.a.b[]) getHighSpeedVideoSizes.clone();
            Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 117) % 128;
            return bVarArr;
        }

        static {
            util.h.xy.s.a.b[] bVarArr;
            getHighResolutionOutputSizeshNQ4ISI();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("鈉\ue8f5隐ໄ鉜㹋㭛諚줦\uda92鸞", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("鈉\ue8f5隐ໄ鉜㹋㭛諚줦\uda92鸞", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr2);
                util.h.xy.s.a.b bVar = new util.h.xy.s.a.b(intern, 0, (byte) 0, ((java.lang.String) objArr2[0]).intern());
                f2295 = bVar;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\uf300ছ捡\uf451\uf34d\udf2a캲灕ꠥ㯹毂⮀䗲蒯", 1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\uf300ছ捡\uf451\uf34d\udf2a캲灕ꠥ㯹毂⮀䗲蒯", android.text.TextUtils.getCapsMode("", 0, 0), objArr4);
                util.h.xy.s.a.b bVar2 = new util.h.xy.s.a.b(intern2, 1, (byte) 1, ((java.lang.String) objArr4[0]).intern());
                f2297 = bVar2;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("뒭鞉璃咤듻䄰\ud950킵", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
                java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("뒭鞉璃咤듻䄰\ud950킵", android.text.TextUtils.getOffsetBefore("", 0), objArr6);
                util.h.xy.s.a.b bVar3 = new util.h.xy.s.a.b(intern3, 2, (byte) 2, ((java.lang.String) objArr6[0]).intern());
                f2296 = bVar3;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ࡸヶ嚄쮣ࠨ\ue653ﭖ侶", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr7);
                java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ࡸヶ嚄쮣ࠨ\ue653ﭖ侶", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1, objArr8);
                util.h.xy.s.a.b bVar4 = new util.h.xy.s.a.b(intern4, 3, (byte) 3, ((java.lang.String) objArr8[0]).intern());
                f2298 = bVar4;
                int i = getInputSizeshNQ4ISI + 9;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                    bVarArr = new util.h.xy.s.a.b[3];
                    bVarArr[1] = bVar;
                    bVarArr[1] = bVar2;
                    bVarArr[2] = bVar3;
                    bVarArr[4] = bVar4;
                } else {
                    bVarArr = new util.h.xy.s.a.b[]{bVar, bVar2, bVar3, bVar4};
                }
                getHighSpeedVideoSizes = bVarArr;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private b(java.lang.String str, int i, byte b, java.lang.String str2) {
            this.getInputFormats = b;
            this.getOutputMinFrameDuration = str2;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final byte m27068() {
            int i = getInputSizeshNQ4ISI + 87;
            Camera2StreamConfigurationMap = i % 128;
            byte b = this.getInputFormats;
            if (i % 2 != 0) {
                return b;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int i = getInputSizeshNQ4ISI + 1;
            Camera2StreamConfigurationMap = i % 128;
            java.lang.String str = this.getOutputMinFrameDuration;
            if (i % 2 != 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = getHighSpeedVideoFpsRanges + 115;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
                aVar.f2623++;
            }
            java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            objArr[0] = str2;
        }

        static void getHighResolutionOutputSizeshNQ4ISI() {
            getHighResolutionOutputSizeshNQ4ISI = -6947847024512848136L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r6.get(util.h.xy.s.md.f2380) != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r6.get(util.h.xy.s.md.f2381) == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(java.util.Map<java.lang.String, byte[]> map, boolean z, util.h.xy.s.a.b bVar, boolean z2, java.lang.String str) throws org.json.JSONException {
        boolean z3;
        this.getInputSizeshNQ4ISI = util.h.xy.s.a.b.f2295;
        if (map == null || map.isEmpty() || !map.containsKey(util.h.xy.s.ma.f2360)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getCapsMode("", 0, 0) + 127, "\u008e\u008a\u008c\u008d\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (util.h.xy.ar.b.m25070(map.get(util.h.xy.s.ma.f2360)) && !z) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u008e\u0094\u008d\u0089\u008b\u008c\u0088\u0093\u0086\u0088\u0090\u0081\u008f", objArr2);
            throw new org.json.JSONException(((java.lang.String) objArr2[0]).intern());
        }
        if (bVar == util.h.xy.s.a.b.f2297) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0097\u0096\u0095", objArr3);
            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                if (map.containsKey(util.h.xy.s.md.f2381)) {
                    if (map.get(util.h.xy.s.md.f2381) != null) {
                        if (map.containsKey(util.h.xy.s.md.f2380)) {
                        }
                    }
                }
                z3 = false;
            } else {
                if (!map.containsKey(util.h.xy.s.md.f2381)) {
                }
                z3 = false;
            }
        } else {
            if (bVar == util.h.xy.s.a.b.f2296) {
                if (map.containsKey(util.h.xy.s.rh.f2414)) {
                    int i = getOutputFormats + 83;
                    getHighSpeedVideoFpsRangesFor = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 4 / 2;
                    }
                }
                z3 = false;
            } else {
                if (bVar != util.h.xy.s.a.b.f2298) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u008e\u008c\u008b\u008c\u009f\u0098\u009e\u0088\u0087\u008a\u0084\u009d\u0088\u0087\u008c\u008d\u008a\u0092\u0089\u0089\u009c\u0093\u0082\u009b", objArr4);
                    throw new org.json.JSONException(((java.lang.String) objArr4[0]).intern());
                }
                if (!z && !z2) {
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                    if (!map.containsKey(util.h.xy.s.g.f2316) || map.get(util.h.xy.s.g.f2316) == null) {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u008e\u0084\u008d\u0084\u0087\u0088\u0085\u0092\u008a\u008d\u0082\u0092\u0098\u0088\u0082\u0092\u0086\u008d\u0084\u0098\u0086\u0085\u0089\u0089\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                        throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
                    }
                }
                if (map.containsKey(util.h.xy.s.g.f2348) && !map.containsKey(util.h.xy.s.g.f2354)) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(127 - android.graphics.Color.alpha(0), "\u008e\u0084\u008d\u0084\u0087\u0088\u009a\u0081\u0099\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                    throw new org.json.JSONException(((java.lang.String) objArr6[0]).intern());
                }
            }
            z3 = true;
        }
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 99) % 128;
        if (z3) {
            this.getInputSizeshNQ4ISI = bVar;
            this.getInputFormats = map;
        } else {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.resolveSize(0, 0) + 127, "\u0084\u008d\u0084\u0090\u0088\u0092\u0091\u0082\u0081\u0090\u0081\u008f\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
            throw new org.json.JSONException(((java.lang.String) objArr7[0]).intern());
        }
    }

    public a(util.h.xy.s.a.b bVar) {
        util.h.xy.s.a.b bVar2 = util.h.xy.s.a.b.f2295;
        this.getInputSizeshNQ4ISI = bVar;
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 5;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
        byte[] bArr = bytes;
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getHighSpeedVideoSizes;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 1;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr3[i3] = (char) (cArr2[i3] / (-3299939579226817547L));
                } else {
                    cArr3[i3] = (char) (cArr2[i3] ^ (-3299939579226817547L));
                    i3++;
                }
            }
            cArr2 = cArr3;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDuration);
        if (!getHighSpeedVideoSizesFor) {
            if (!getHighSpeedVideoFpsRanges) {
                throw null;
            }
            int i6 = Camera2StreamConfigurationMap + 15;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            throw null;
        }
        int i7 = getHighResolutionOutputSizeshNQ4ISI + 63;
        Camera2StreamConfigurationMap = i7 % 128;
        if (i7 % 2 != 0) {
            mdVar.f2642 = bArr.length;
            cArr = new char[mdVar.f2642];
            mdVar.f2643 = 1;
        } else {
            mdVar.f2642 = bArr.length;
            cArr = new char[mdVar.f2642];
            mdVar.f2643 = 0;
        }
        while (mdVar.f2643 < mdVar.f2642) {
            cArr[mdVar.f2643] = (char) (cArr2[bArr[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m27067(java.lang.String str) throws org.json.JSONException {
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 121) % 128;
        if (this.getInputFormats.containsKey(str)) {
            byte[] bArr = this.getInputFormats.get(str);
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 85) % 128;
            return bArr;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008e\u0094\u008c \u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new org.json.JSONException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.s.a.b m27066() {
        int i = getHighSpeedVideoFpsRangesFor;
        getOutputFormats = (i + 103) % 128;
        util.h.xy.s.a.b bVar = this.getInputSizeshNQ4ISI;
        getOutputFormats = (i + 47) % 128;
        return bVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.s.f[] m27065() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 59;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.s.f[] fVarArr = this.getOutputSizeshNQ4ISI;
        int i3 = i + 45;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            return fVarArr;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27064(util.h.xy.s.f[] fVarArr) {
        int i = getOutputFormats;
        int i2 = i + 87;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputSizeshNQ4ISI = fVarArr;
            getHighSpeedVideoFpsRangesFor = (i + 25) % 128;
        } else {
            this.getOutputSizeshNQ4ISI = fVarArr;
            throw null;
        }
    }
}
