package util.h.xy.cw;

/* loaded from: classes5.dex */
public final class mb extends util.h.xy.da.mb {
    private static char Camera2StreamConfigurationMap = 26501;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 1641;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 29652;
    private static char getOutputFormats = 5557;
    private final byte[] getHighSpeedVideoSizesFor;
    private final java.util.Map<java.lang.String, java.lang.Object> getOutputMinFrameDuration;
    private final util.h.xy.da.a getOutputSizes;

    /* synthetic */ mb(util.h.xy.cw.mb.ra raVar, byte b) {
        this(raVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private mb(util.h.xy.cw.mb.ra raVar) {
        if (util.h.xy.cy.ra.m26123()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("匘\u2efb䌌\uf42d輟ᴜ漏￨挂ʣኴ䚩䓩\ue386뮲骼䓩\ue386⾘瓑ꪺ\u1f16䟥쿽ꍁ柚", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        this.getHighSpeedVideoSizesFor = util.h.xy.cw.mb.ra.getHighSpeedVideoFpsRangesFor(raVar);
        this.getOutputSizes = util.h.xy.cw.mb.ra.Camera2StreamConfigurationMap(raVar);
        this.getOutputMinFrameDuration = new java.util.HashMap(util.h.xy.cw.mb.ra.getHighSpeedVideoSizes(raVar).size());
        for (java.util.Map.Entry entry : util.h.xy.cw.mb.ra.getHighSpeedVideoSizes(raVar).entrySet()) {
            this.getOutputMinFrameDuration.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26088() {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 121) % 128;
        if (util.h.xy.cy.ra.m26123()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("匘\u2efb䌌\uf42d輟ᴜ漏￨挂ʣኴ䚩䓩\ue386뮲骼䓩\ue386⾘瓑ꪺ\u1f16䟥쿽ꍁ柚", android.view.View.resolveSizeAndState(0, 0, 0) + 26, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 1) % 128;
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.da.a m26089() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 117;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.da.a aVar = this.getOutputSizes;
        int i3 = i + 111;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.Object m26087(java.lang.String str) {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 91) % 128;
        java.lang.Object obj = this.getOutputMinFrameDuration.get(str);
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 41) % 128;
        return obj;
    }

    public static final class ra implements util.h.xy.da.mb.a {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;
        private final byte[] getInputFormats;
        private static char[] getInputSizeshNQ4ISI = {38464, 38467, 41912, 41864, 41897, 41904, 41913, 41909, 38468, 38465, 38471, 41896, 41905, 41903, 41908, 41972, 41907, 41918, 41917, 41973, 38466, 41919, 41980, 38469, 41906};
        private static char Camera2StreamConfigurationMap = 38467;
        private boolean getOutputMinFrameDuration = false;
        private util.h.xy.da.a getHighSpeedVideoSizesFor = util.h.xy.da.a.f1153;
        private java.util.Map<java.lang.String, java.lang.Object> getOutputFormats = new java.util.HashMap();

        static /* synthetic */ util.h.xy.da.a Camera2StreamConfigurationMap(util.h.xy.cw.mb.ra raVar) {
            int i = getHighSpeedVideoFpsRanges + 9;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            util.h.xy.da.a aVar = raVar.getHighSpeedVideoSizesFor;
            if (i % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.cw.mb.ra raVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 19;
            int i2 = i % 128;
            getHighSpeedVideoFpsRanges = i2;
            byte[] bArr = raVar.getInputFormats;
            if (i % 2 == 0) {
                throw null;
            }
            int i3 = i2 + 77;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        static /* synthetic */ java.util.Map getHighSpeedVideoSizes(util.h.xy.cw.mb.ra raVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 41;
            int i2 = i % 128;
            getHighSpeedVideoFpsRanges = i2;
            java.util.Map<java.lang.String, java.lang.Object> map = raVar.getOutputFormats;
            if (i % 2 == 0) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 85) % 128;
            return map;
        }

        @Override // util.h.xy.da.mb.a
        /* renamed from: ˊ, reason: contains not printable characters */
        public final /* synthetic */ util.h.xy.da.mb.a mo26090(util.h.xy.da.a aVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 3;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                m26092(aVar);
                throw null;
            }
            util.h.xy.cw.mb.ra m26092 = m26092(aVar);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 19) % 128;
            return m26092;
        }

        @Override // util.h.xy.da.mb.a
        /* renamed from: ˎ, reason: contains not printable characters */
        public final /* synthetic */ util.h.xy.da.mb mo26094() {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
            util.h.xy.cw.mb m26093 = m26093();
            int i = getHighSpeedVideoFpsRanges + 11;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return m26093;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // util.h.xy.da.mb.a
        /* renamed from: ᐝ, reason: contains not printable characters */
        public final /* synthetic */ util.h.xy.da.mb.a mo26095(java.lang.String str, java.lang.Object obj) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
            util.h.xy.cw.mb.ra m26091 = m26091(str, obj);
            int i = getHighResolutionOutputSizeshNQ4ISI + 41;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                return m26091;
            }
            throw null;
        }

        public ra(byte[] bArr) {
            this.getInputFormats = bArr;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.cw.mb.ra m26092(util.h.xy.da.a aVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 83;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                getHighSpeedVideoSizes();
                if (aVar != null) {
                    this.getHighSpeedVideoSizesFor = aVar;
                }
                int i2 = getHighSpeedVideoFpsRanges + 65;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return this;
                }
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoSizes();
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.cw.mb.ra m26091(java.lang.String str, java.lang.Object obj) {
            int i = getHighSpeedVideoFpsRanges + 9;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                getHighSpeedVideoSizes();
                this.getOutputFormats.put(str, obj);
                int i2 = getHighSpeedVideoFpsRanges + 41;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            getHighSpeedVideoSizes();
            this.getOutputFormats.put(str, obj);
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.cw.mb m26093() {
            getHighSpeedVideoSizes();
            util.h.xy.cw.mb mbVar = new util.h.xy.cw.mb(this, (byte) 0);
            this.getOutputMinFrameDuration = true;
            this.getHighSpeedVideoSizesFor = null;
            java.util.Iterator<java.lang.String> it = this.getOutputFormats.keySet().iterator();
            while (it.hasNext()) {
                int i = getHighSpeedVideoFpsRanges + 69;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    this.getOutputFormats.put(it.next(), null);
                } else {
                    this.getOutputFormats.put(it.next(), null);
                    throw new java.lang.ArithmeticException();
                }
            }
            this.getOutputFormats = null;
            int i2 = getHighSpeedVideoFpsRanges + 93;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return mbVar;
            }
            throw null;
        }

        private void getHighSpeedVideoSizes() {
            java.lang.Object[] objArr;
            int i;
            if (this.getOutputMinFrameDuration) {
                try {
                    char intValue = (byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 13);
                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    int i2 = argb + 51;
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
                    char[] charArray = "\u0004\r\b\f\u0002\u0011\u000b\u0010\u000b\u0013\u0007\u0002\u0017\u0010㘀㘀\u0015\u0010\u0002\u0016\u0007\u0015\u0017\u0010㘂㘂\u0007\u0001\u0015\u0011\u0014\u0016\u0007\u0015\u0013\u0002\b\u0006\u0000\u0011\u0011\u0018\b\f\u0017\u0016\u000f\b\u0006\u0007㘊".toCharArray();
                    util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                    char[] cArr = getInputSizeshNQ4ISI;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i3 = 0;
                        while (i3 < length) {
                            cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                            i3++;
                            objArr2 = objArr2;
                        }
                        objArr = objArr2;
                        cArr = cArr2;
                    } else {
                        objArr = objArr2;
                    }
                    char c = (char) (Camera2StreamConfigurationMap ^ 4042185467053315654L);
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 21) % 128;
                        i = argb + 50;
                        cArr3[i] = (char) (charArray[i] - intValue);
                    } else {
                        i = i2;
                    }
                    if (i > 1) {
                        int i4 = 0;
                        while (true) {
                            mcVar.f2638 = i4;
                            if (mcVar.f2638 >= i) {
                                break;
                            }
                            mcVar.f2641 = charArray[mcVar.f2638];
                            mcVar.f2636 = charArray[mcVar.f2638 + 1];
                            if (mcVar.f2641 == mcVar.f2636) {
                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 19) % 128;
                                cArr3[mcVar.f2638] = (char) (mcVar.f2641 - intValue);
                                cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - intValue);
                            } else {
                                mcVar.f2639 = mcVar.f2641 / c;
                                mcVar.f2640 = mcVar.f2641 % c;
                                mcVar.f2637 = mcVar.f2636 / c;
                                mcVar.f2635 = mcVar.f2636 % c;
                                if (mcVar.f2640 == mcVar.f2635) {
                                    mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                    mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                    int i5 = mcVar.f2639;
                                    int i6 = mcVar.f2640;
                                    int i7 = mcVar.f2637;
                                    int i8 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                                } else if (mcVar.f2639 == mcVar.f2637) {
                                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 85) % 128;
                                    mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                    mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                    int i9 = mcVar.f2639;
                                    int i10 = mcVar.f2640;
                                    int i11 = mcVar.f2637;
                                    int i12 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                                } else {
                                    int i13 = mcVar.f2639;
                                    int i14 = mcVar.f2635;
                                    int i15 = mcVar.f2637;
                                    int i16 = mcVar.f2640;
                                    cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                                }
                            }
                            i4 = mcVar.f2638 + 2;
                        }
                    }
                    for (int i17 = 0; i17 < i2; i17++) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                        cArr3[i17] = (char) (cArr3[i17] ^ 13722);
                    }
                    objArr[0] = new java.lang.String(cArr3);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        char[] cArr = charArray;
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr2 = new char[cArr.length];
        eVar.f2630 = 0;
        char[] cArr3 = new char[2];
        while (eVar.f2630 < cArr.length) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
            cArr3[0] = cArr[eVar.f2630];
            cArr3[1] = cArr[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr2[eVar.f2630] = cArr3[0];
            cArr2[eVar.f2630 + 1] = cArr3[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }
}
