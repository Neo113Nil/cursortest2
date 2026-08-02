package util.h.xy.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static final /* synthetic */ util.h.xy.t.mb[] Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 0;
    private static char getOutputFormats = 0;
    private static char getOutputMinFrameDuration = 0;
    private static int getOutputStallDurationlomOqCM = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.t.mb f2417;

    /* renamed from: ˏ, reason: contains not printable characters */
    public android.content.Context f2420 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.ac.a f2422 = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    public util.h.xy.ac.a f2419 = null;

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.ac.a f2418 = null;

    /* renamed from: ͺ, reason: contains not printable characters */
    public util.h.xy.ac.a f2421 = null;

    /* renamed from: ι, reason: contains not printable characters */
    public util.h.xy.ac.a f2423 = null;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.t.mb valueOf(java.lang.String str) {
        getInputFormats = (getOutputStallDurationlomOqCM + 99) % 128;
        util.h.xy.t.mb mbVar = (util.h.xy.t.mb) java.lang.Enum.valueOf(util.h.xy.t.mb.class, str);
        getOutputStallDurationlomOqCM = (getInputFormats + 27) % 128;
        return mbVar;
    }

    public static util.h.xy.t.mb[] values() {
        int i = getInputFormats + 61;
        getOutputStallDurationlomOqCM = i % 128;
        util.h.xy.t.mb[] mbVarArr = Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            return (util.h.xy.t.mb[]) mbVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.t.mb[] mbVarArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("錆氛\u2d75\udad4䫧峘Я쫊", 7 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
        util.h.xy.t.mb mbVar = new util.h.xy.t.mb(((java.lang.String) objArr[0]).intern());
        f2417 = mbVar;
        int i = getOutputStallDurationlomOqCM + 65;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            mbVarArr = new util.h.xy.t.mb[0];
            mbVarArr[0] = mbVar;
        } else {
            mbVarArr = new util.h.xy.t.mb[]{mbVar};
        }
        Camera2StreamConfigurationMap = mbVarArr;
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.t.mb.class.getName();
        getInputFormats = (getOutputStallDurationlomOqCM + 57) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27466(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getInputFormats = (getOutputStallDurationlomOqCM + 125) % 128;
            this.f2420 = context;
            if (util.h.xy.n.mb.f2254.m26984()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(util.h.xy.al.ra.f716);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{1349577079, 2118670336, -1345662546, -1925102658, -1598574741, -171642445, -795550190, -712202143, 491812501, 2055067699, -1360125489, 856472387, 1138952048, -2077234397, -1534664356, -1183974922, -865459429, 36696793}, 33 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
            }
            int i = getOutputStallDurationlomOqCM + 17;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                m27422();
                throw new java.lang.NullPointerException();
            }
            m27422();
            try {
                if (util.h.xy.n.ra.f2261.m26987()) {
                    getInputFormats = (getOutputStallDurationlomOqCM + 23) % 128;
                    getHighSpeedVideoSizes();
                    util.h.xy.n.ma.f2247.m26982(this.f2420, false);
                    util.h.xy.ac.d.m24541(util.h.xy.n.ma.f2247.f2249, this.f2419);
                    util.h.xy.ac.d.m24541(util.h.xy.n.ma.f2247.f2253, this.f2418);
                    util.h.xy.ac.d.m24541(util.h.xy.n.ma.f2247.f2252, this.f2421);
                    util.h.xy.ac.d.m24541(util.h.xy.n.ma.f2247.f2248, this.f2423);
                    util.h.xy.ac.d.m24541(util.h.xy.n.ma.f2247.f2250, this.f2422);
                    util.h.xy.n.ra.f2261.m26988();
                }
                int i2 = getOutputStallDurationlomOqCM + 49;
                int i3 = i2 % 128;
                getInputFormats = i3;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i4 = i3 + 113;
                getOutputStallDurationlomOqCM = i4 % 128;
                if (i4 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (util.h.xy.ac.mc e) {
                e = e;
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2227, e);
            } catch (util.h.xy.da.b e2) {
                e = e2;
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2227, e);
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoFpsRangesFor;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 93) % 128;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRangesFor;
        if (iArr5 != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 13) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i3 = 0;
            while (i3 < length3) {
                int i4 = getHighSpeedVideoFpsRanges + 27;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 == 0) {
                    iArr6[i3] = (int) (iArr5[i3] / (-5569649899877129369L));
                    i3 %= 1;
                } else {
                    iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                    i3++;
                }
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 73) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i5 = 0; i5 < 16; i5++) {
                cVar.f2627 ^= iArr4[i5];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 45;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 49) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 91) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static long getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ util.h.xy.t.mb.b[] getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static int getHighSpeedVideoSizesFor;
        private static char getInputFormats;
        private static int getOutputFormats;

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2424;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2425;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2426;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2427;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2428;

        /* renamed from: ͺ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2429;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.t.mb.b f2430;

        private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 59) % 128;
            char[] charArray = str3.toCharArray();
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
                int i2 = (rcVar.f2652 + 2) % 4;
                int i3 = (rcVar.f2652 + 3) % 4;
                rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
                cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
                cArr[i3] = rcVar.f2653;
                cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getInputFormats ^ 2457411417541981002L)));
                rcVar.f2652++;
            }
            java.lang.String str4 = new java.lang.String(cArr3);
            int i4 = getHighSpeedVideoSizes + 93;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
        }

        private b(java.lang.String str, int i) {
        }

        public static util.h.xy.t.mb.b valueOf(java.lang.String str) {
            int i = getOutputFormats + 83;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            util.h.xy.t.mb.b bVar = (util.h.xy.t.mb.b) java.lang.Enum.valueOf(util.h.xy.t.mb.b.class, str);
            if (i % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        public static util.h.xy.t.mb.b[] values() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 3;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            util.h.xy.t.mb.b[] bVarArr = (util.h.xy.t.mb.b[]) getHighSpeedVideoFpsRangesFor.clone();
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 65) % 128;
            return bVarArr;
        }

        static {
            util.h.xy.t.mb.b[] bVarArr;
            getHighSpeedVideoFpsRanges();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("톐畧氕꾰", (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2968), 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "쎀σ顄䰋", "\u0000\u0000\u0000\u0000", objArr);
            util.h.xy.t.mb.b bVar = new util.h.xy.t.mb.b(((java.lang.String) objArr[0]).intern(), 0);
            f2426 = bVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ٞ墌肾", (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 35550), android.view.KeyEvent.keyCodeFromString("") + 1082966437, "ꖀ賁\ude40ﮊ", "\u0000\u0000\u0000\u0000", objArr2);
            util.h.xy.t.mb.b bVar2 = new util.h.xy.t.mb.b(((java.lang.String) objArr2[0]).intern(), 1);
            f2428 = bVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("旖\u0af6ꑋ昢룮ф", (char) (android.view.KeyEvent.getDeadChar(0, 0) + 21928), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "쎺⩙ꡧ襕", "\u0000\u0000\u0000\u0000", objArr3);
            util.h.xy.t.mb.b bVar3 = new util.h.xy.t.mb.b(((java.lang.String) objArr3[0]).intern(), 2);
            f2425 = bVar3;
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("㫾䮓\u12b7둾痰ꎎ㾳\udad5ꀇ丼紒ꪢ펃", (char) (24907 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 48442747 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "筀\ue32d䬂蕡", "\u0000\u0000\u0000\u0000", objArr4);
                util.h.xy.t.mb.b bVar4 = new util.h.xy.t.mb.b(((java.lang.String) objArr4[0]).intern(), 3);
                f2430 = bVar4;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("얀ヌ\ue270껑鉳ᖰ\ue5d1左ꦃ", (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1789054593, "脉ꋎ詪勐", "\u0000\u0000\u0000\u0000", objArr5);
                util.h.xy.t.mb.b bVar5 = new util.h.xy.t.mb.b(((java.lang.String) objArr5[0]).intern(), 4);
                f2427 = bVar5;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\ueabe\ud85c卩ⷙ秏燛\uf0c3㪬Ꮁ\u0605ꏯ焋僀矸\uea70ⲷ씀퇏", (char) (15683 - android.graphics.Color.alpha(0)), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, "\ue904东䏍쌽", "\u0000\u0000\u0000\u0000", objArr6);
                util.h.xy.t.mb.b bVar6 = new util.h.xy.t.mb.b(((java.lang.String) objArr6[0]).intern(), 5);
                f2424 = bVar6;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("쫱孃貳묎꓅㍒Ԑ❉\uee63\ue111羹Ḥ냸⫣穣\ue4f9", (char) (android.graphics.Color.alpha(0) + 10492), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "셧\uea8eﳑ䄨", "\u0000\u0000\u0000\u0000", objArr7);
                util.h.xy.t.mb.b bVar7 = new util.h.xy.t.mb.b(((java.lang.String) objArr7[0]).intern(), 6);
                f2429 = bVar7;
                int i = getOutputFormats + 33;
                int i2 = i % 128;
                getHighResolutionOutputSizeshNQ4ISI = i2;
                if (i % 2 == 0) {
                    bVarArr = new util.h.xy.t.mb.b[63];
                    bVarArr[1] = bVar;
                    bVarArr[1] = bVar2;
                    bVarArr[2] = bVar3;
                    bVarArr[2] = bVar4;
                    bVarArr[5] = bVar5;
                    bVarArr[5] = bVar6;
                    bVarArr[97] = bVar7;
                } else {
                    bVarArr = new util.h.xy.t.mb.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
                }
                getOutputFormats = (i2 + 71) % 128;
                getHighSpeedVideoFpsRangesFor = bVarArr;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static void getHighSpeedVideoFpsRanges() {
            getHighSpeedVideoFpsRanges = 2457411417541981002L;
            getHighSpeedVideoSizesFor = 294925130;
            getInputFormats = (char) 44460;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27446() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr;
        int i = getInputFormats + 1;
        getOutputStallDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(util.h.xy.o.b.f2276);
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoSizes, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(highSpeedVideoSizes);
                return Camera2StreamConfigurationMap2;
            }
            bArr = getHighSpeedVideoSizes(util.h.xy.o.b.f2276);
            try {
                Camera2StreamConfigurationMap(bArr, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27457(byte[] bArr, util.h.xy.d.ma maVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] m26993;
        try {
            if (maVar == util.h.xy.d.ma.f1140) {
                m26993 = util.h.xy.o.ra.m27004(bArr);
            } else {
                try {
                    if (maVar != util.h.xy.d.ma.f1142) {
                        if (maVar == util.h.xy.d.ma.f1143) {
                            int i = getOutputStallDurationlomOqCM + 59;
                            getInputFormats = i % 128;
                            if (i % 2 != 0) {
                                util.h.xy.o.ra.m26991(bArr);
                                throw new java.lang.NullPointerException();
                            }
                            m26993 = util.h.xy.o.ra.m26991(bArr);
                        } else if (maVar == util.h.xy.d.ma.f1141) {
                            getOutputStallDurationlomOqCM = (getInputFormats + 27) % 128;
                            m26993 = util.h.xy.o.ra.m26993(bArr);
                        } else {
                            throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2225);
                        }
                    } else {
                        int i2 = getOutputStallDurationlomOqCM + 105;
                        getInputFormats = i2 % 128;
                        if (i2 % 2 != 0) {
                            util.h.xy.o.ra.m27014(bArr);
                            throw new java.lang.NullPointerException();
                        }
                        m26993 = util.h.xy.o.ra.m27014(bArr);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    util.h.xy.ar.b.m25095(bArr);
                    throw th;
                }
            }
            byte[] bArr2 = m26993;
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m27473(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 87) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27008(bArr);
        } catch (java.lang.Throwable th) {
            th = th;
            bArr2 = null;
        }
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
            getInputFormats = (getOutputStallDurationlomOqCM + 79) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27439(byte[] bArr, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i2 = getOutputStallDurationlomOqCM + 63;
        getInputFormats = i2 % 128;
        byte[] bArr2 = null;
        try {
            try {
                if (i2 % 2 == 0) {
                    byte[] m27012 = util.h.xy.o.ra.m27012(bArr, util.h.xy.ar.b.m25088(i));
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27012, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(m27012);
                    int i3 = getOutputStallDurationlomOqCM + 107;
                    getInputFormats = i3 % 128;
                    if (i3 % 2 == 0) {
                        return Camera2StreamConfigurationMap2;
                    }
                    throw null;
                }
                byte[] m270122 = util.h.xy.o.ra.m27012(bArr, util.h.xy.ar.b.m25088(i));
                Camera2StreamConfigurationMap(m270122, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m270122);
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr2 = bArr;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27430(byte[] bArr, byte[] bArr2, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27009;
        byte[] bArr3 = null;
        try {
            if (mgVar != util.h.xy.d.mg.f1145) {
                m27009 = util.h.xy.o.ra.m27009(bArr, null);
                getOutputStallDurationlomOqCM = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            } else {
                getOutputStallDurationlomOqCM = (getInputFormats + 87) % 128;
                m27009 = util.h.xy.o.ra.m27009(bArr, bArr2);
            }
            bArr3 = m27009;
            return Camera2StreamConfigurationMap(bArr3, util.h.xy.t.mb.b.f2426);
        } finally {
            util.h.xy.ar.b.m25095(bArr3);
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27458(byte[] bArr, byte[] bArr2, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getOutputStallDurationlomOqCM + 109) % 128;
        byte[] bArr3 = null;
        try {
            byte[] m27005 = util.h.xy.o.ra.m27005(bArr, bArr2);
            try {
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27005, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27005);
                int i = getOutputStallDurationlomOqCM + 113;
                getInputFormats = i % 128;
                if (i % 2 == 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                th = th;
                bArr3 = m27005;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27449(byte[] bArr, byte[] bArr2, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i = getOutputStallDurationlomOqCM + 37;
        getInputFormats = i % 128;
        byte[] bArr3 = null;
        try {
            try {
                if (i % 2 == 0) {
                    byte[] m27017 = util.h.xy.o.ra.m27017(bArr, bArr2);
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27017, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(m27017);
                    int i2 = getOutputStallDurationlomOqCM + 63;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        return Camera2StreamConfigurationMap2;
                    }
                    throw null;
                }
                byte[] m270172 = util.h.xy.o.ra.m27017(bArr, bArr2);
                Camera2StreamConfigurationMap(m270172, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m270172);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr3 = bArr;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            util.h.xy.ar.b.m25095(bArr3);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], int] */
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m27471() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 67;
        getOutputStallDurationlomOqCM = i % 128;
        ?? r0 = i % 2;
        try {
            if (r0 != 0) {
                byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(util.h.xy.o.b.f2285);
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoSizes, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(highSpeedVideoSizes);
                return Camera2StreamConfigurationMap2;
            }
            byte[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(util.h.xy.o.b.f2285);
            Camera2StreamConfigurationMap(highSpeedVideoSizes2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(highSpeedVideoSizes2);
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) r0);
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27470(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr3;
        int i = getOutputStallDurationlomOqCM + 97;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27014 = util.h.xy.o.ra.m27014(bArr);
                getHighSpeedVideoFpsRanges(m27014, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27014);
                getInputFormats = (getOutputStallDurationlomOqCM + 7) % 128;
                return;
            }
            bArr3 = util.h.xy.o.ra.m27014(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr3 = null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27431(util.h.xy.o.b bVar, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 93) % 128;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bVar);
        try {
            if (!util.h.xy.ar.b.m25070(bArr)) {
                getHighSpeedVideoFpsRanges(highSpeedVideoSizes, bArr, util.h.xy.t.mb.b.f2426);
                getInputFormats = (getOutputStallDurationlomOqCM + 27) % 128;
            } else {
                getInputFormats = (getOutputStallDurationlomOqCM + 21) % 128;
                getHighSpeedVideoFpsRanges(highSpeedVideoSizes, util.h.xy.t.mb.b.f2426);
            }
        } finally {
            util.h.xy.ar.b.m25095(highSpeedVideoSizes);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27445(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputStallDurationlomOqCM + 23;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27001 = util.h.xy.o.ra.m27001(bArr);
                getHighSpeedVideoFpsRanges(m27001, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27001);
                getInputFormats = (getOutputStallDurationlomOqCM + 35) % 128;
                return;
            }
            byte[] m270012 = util.h.xy.o.ra.m27001(bArr);
            getHighSpeedVideoFpsRanges(m270012, bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(m270012);
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) null);
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27426(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i = getInputFormats + 89;
        getOutputStallDurationlomOqCM = i % 128;
        byte[] bArr3 = null;
        try {
            try {
                if (i % 2 != 0) {
                    byte[] m27016 = util.h.xy.o.ra.m27016(bArr);
                    getHighSpeedVideoFpsRanges(m27016, bArr2, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(m27016);
                    int i2 = getInputFormats + 77;
                    getOutputStallDurationlomOqCM = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                byte[] m270162 = util.h.xy.o.ra.m27016(bArr);
                getHighSpeedVideoFpsRanges(m270162, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m270162);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr3 = bArr;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            util.h.xy.ar.b.m25095(bArr3);
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27454(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr3;
        int i = getInputFormats + 75;
        getOutputStallDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27011 = util.h.xy.o.ra.m27011(bArr);
                getHighSpeedVideoFpsRanges(m27011, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27011);
                getOutputStallDurationlomOqCM = (getInputFormats + 27) % 128;
                return;
            }
            bArr3 = util.h.xy.o.ra.m27011(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr3 = null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27434(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr3;
        getOutputStallDurationlomOqCM = (getInputFormats + 21) % 128;
        try {
            bArr3 = util.h.xy.o.ra.m27004(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                getInputFormats = (getOutputStallDurationlomOqCM + 107) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr3 = null;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m27460(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr3;
        getOutputStallDurationlomOqCM = (getInputFormats + 21) % 128;
        util.h.xy.ar.b.m25074(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE.toString().getBytes());
        util.h.xy.ar.b.m25074(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED.toString().getBytes());
        util.h.xy.ar.b.m25074(bArr2);
        try {
            bArr3 = util.h.xy.o.ra.m26995(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                int i = getInputFormats + 105;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 5;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr3 = null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27438(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getOutputStallDurationlomOqCM + 111) % 128;
        byte[] bArr2 = null;
        try {
            byte[] m26995 = util.h.xy.o.ra.m26995(bArr);
            try {
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m26995, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m26995);
                int i = getInputFormats + 109;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 != 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                bArr2 = m26995;
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m27414(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr3;
        int i = getOutputStallDurationlomOqCM + 75;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                util.h.xy.ar.b.m25074(bArr2);
                byte[] m27008 = util.h.xy.o.ra.m27008(bArr);
                getHighSpeedVideoFpsRanges(m27008, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27008);
                return;
            }
            util.h.xy.ar.b.m25074(bArr2);
            bArr3 = util.h.xy.o.ra.m27008(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr3 = null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27452(byte[] bArr, int i, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i2 = getInputFormats + 105;
        getOutputStallDurationlomOqCM = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                byte[] m27012 = util.h.xy.o.ra.m27012(bArr, util.h.xy.ar.b.m25088(i));
                getHighSpeedVideoFpsRanges(m27012, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27012);
                getOutputStallDurationlomOqCM = (getInputFormats + 39) % 128;
                return;
            }
            byte[] m270122 = util.h.xy.o.ra.m27012(bArr, util.h.xy.ar.b.m25088(i));
            getHighSpeedVideoFpsRanges(m270122, bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(m270122);
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) null);
            throw th;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m27411(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr3;
        getInputFormats = (getOutputStallDurationlomOqCM + 61) % 128;
        try {
            bArr3 = util.h.xy.o.ra.m27014(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                getInputFormats = (getOutputStallDurationlomOqCM + 19) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr3 = null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m27408(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr3;
        int i = getOutputStallDurationlomOqCM + 47;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m26991 = util.h.xy.o.ra.m26991(bArr);
                getHighSpeedVideoFpsRanges(m26991, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m26991);
            } else {
                bArr3 = util.h.xy.o.ra.m26991(bArr);
                try {
                    getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(bArr3);
                    throw null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    util.h.xy.ar.b.m25095(bArr3);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr3 = null;
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m27477(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr3;
        try {
            bArr3 = util.h.xy.o.ra.m26993(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr3, bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr3);
                int i = getInputFormats;
                getOutputStallDurationlomOqCM = (i + 61) % 128;
                getOutputStallDurationlomOqCM = (i + 15) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr3 = null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27425(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10);
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25088(i));
        util.h.xy.ar.b.m25074(highSpeedVideoFpsRanges);
        byte[] bArr11 = null;
        try {
            if (mgVar == util.h.xy.d.mg.f1145) {
                byte[] m25088 = util.h.xy.ar.b.m25088(i);
                bArr11 = util.h.xy.o.ra.m27009(bArr, m25088);
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.ar.b.m25074(m25088);
                util.h.xy.d.mg mgVar2 = util.h.xy.d.mg.f1145;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("㲦橻戁퀶懅乵", 4 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                util.h.xy.am.ma.m25030(((java.lang.String) objArr[0]).intern(), bArr3);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{11346063, -1200050106, -1741898332, 889125230}, 6 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                util.h.xy.am.ma.m25030(((java.lang.String) objArr2[0]).intern(), bArr2);
            } else if (mgVar == util.h.xy.d.mg.f1144) {
                bArr11 = util.h.xy.o.ra.m27009(bArr, null);
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.d.mg mgVar3 = util.h.xy.d.mg.f1144;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1687255236, -1934415016, -2087154976, 1914967672}, 5 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), bArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1687255236, -1934415016, -1741898332, 889125230}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 7, objArr4);
                util.h.xy.am.ma.m25030(((java.lang.String) objArr4[0]).intern(), bArr2);
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1974089793, 1518341268}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, objArr5);
            util.h.xy.am.ma.m25030(((java.lang.String) objArr5[0]).intern(), bArr10);
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            getHighSpeedVideoFpsRanges(bArr11, highSpeedVideoFpsRanges, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr11);
            int i2 = getOutputStallDurationlomOqCM;
            getInputFormats = (i2 + 87) % 128;
            getInputFormats = (i2 + 5) % 128;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr11);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27432(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 57) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10);
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25088(i));
        util.h.xy.ar.b.m25074(highSpeedVideoFpsRanges);
        byte[] bArr11 = null;
        try {
            bArr11 = util.h.xy.o.ra.m27005(bArr, util.h.xy.ar.b.m25088(i));
            getHighSpeedVideoFpsRanges(bArr11, highSpeedVideoFpsRanges, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr11);
            int i2 = getInputFormats + 75;
            getOutputStallDurationlomOqCM = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 5;
            }
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr11);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27444(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getOutputStallDurationlomOqCM + 17) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10);
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25088(i));
        util.h.xy.ar.b.m25074(highSpeedVideoFpsRanges);
        byte[] bArr11 = null;
        try {
            byte[] m25088 = util.h.xy.ar.b.m25088(i);
            bArr11 = util.h.xy.o.ra.m27017(bArr, m25088);
            util.h.xy.ar.b.m25074(bArr);
            util.h.xy.ar.b.m25074(m25088);
            util.h.xy.d.mg mgVar2 = util.h.xy.d.mg.f1145;
            getHighSpeedVideoFpsRanges(bArr11, highSpeedVideoFpsRanges, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr11);
            getInputFormats = (getOutputStallDurationlomOqCM + 87) % 128;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr11);
            throw th;
        }
    }

    @util.h.xy.a.a
    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9) {
        int i = getInputFormats;
        getOutputStallDurationlomOqCM = (i + 47) % 128;
        byte[] bArr10 = null;
        if (bArr != null) {
            int i2 = i + 71;
            getOutputStallDurationlomOqCM = i2 % 128;
            if (i2 % 2 == 0) {
                getHighSpeedVideoFpsRangesFor(bArr);
                throw null;
            }
            bArr10 = getHighSpeedVideoFpsRangesFor(bArr);
        }
        util.h.xy.aw.b bVar = new util.h.xy.aw.b();
        util.h.xy.aw.ra.m25249(bArr2, bVar, 42);
        byte[] m25241 = bVar.m25241();
        getInputFormats = (getOutputStallDurationlomOqCM + 101) % 128;
        byte[] m25107 = util.h.xy.ar.mb.m25107(new byte[]{1}, bArr10);
        byte[] m251072 = util.h.xy.ar.mb.m25107(new byte[]{2}, m25241);
        byte[] m251073 = util.h.xy.ar.mb.m25107(new byte[]{3}, bArr3);
        byte[] m251074 = util.h.xy.ar.mb.m25107(new byte[]{4}, bArr4);
        byte[] m251075 = util.h.xy.ar.mb.m25107(new byte[]{5}, bArr5);
        byte[] m251076 = util.h.xy.ar.mb.m25107(new byte[]{17}, bArr6);
        byte[] m251077 = util.h.xy.ar.mb.m25107(new byte[]{18}, bArr7);
        byte[] m251078 = util.h.xy.ar.mb.m25107(new byte[]{19}, bArr8);
        byte[] m251079 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.DC4}, bArr9);
        byte[] m25090 = util.h.xy.ar.b.m25090(m25107, m251072, m251073, m251074, m251075, m251076, m251077, m251078, m251079);
        util.h.xy.ar.b.m25100(m25107, m251072, m251073, m251074, m251075, m251076, m251077, m251078, m251079);
        return m25090;
    }

    @util.h.xy.a.a
    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        util.h.xy.aw.b bVar = new util.h.xy.aw.b();
        util.h.xy.aw.ra.m25249(bArr, bVar, 42);
        byte[] m25241 = bVar.m25241();
        getOutputStallDurationlomOqCM = (getInputFormats + 13) % 128;
        return m25241;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27436(util.h.xy.o.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 61) % 128;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bVar);
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoSizes, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(highSpeedVideoSizes);
            int i = getOutputStallDurationlomOqCM + 61;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(highSpeedVideoSizes);
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27456(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr2;
        int i = getOutputStallDurationlomOqCM + 117;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27001 = util.h.xy.o.ra.m27001(bArr);
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27001, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27001);
                getInputFormats = (getOutputStallDurationlomOqCM + 83) % 128;
                return Camera2StreamConfigurationMap2;
            }
            bArr2 = util.h.xy.o.ra.m27001(bArr);
            try {
                Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr2 = null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27448(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getInputFormats = (getOutputStallDurationlomOqCM + 99) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27016(bArr);
        } catch (java.lang.Throwable th) {
            th = th;
            bArr2 = null;
        }
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
            getOutputStallDurationlomOqCM = (getInputFormats + 63) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27429(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i = getOutputStallDurationlomOqCM + 55;
        getInputFormats = i % 128;
        byte[] bArr2 = null;
        try {
            try {
                if (i % 2 == 0) {
                    byte[] m27011 = util.h.xy.o.ra.m27011(bArr);
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27011, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(m27011);
                    int i2 = getInputFormats + 93;
                    getOutputStallDurationlomOqCM = i2 % 128;
                    if (i2 % 2 != 0) {
                        return Camera2StreamConfigurationMap2;
                    }
                    throw null;
                }
                byte[] m270112 = util.h.xy.o.ra.m27011(bArr);
                Camera2StreamConfigurationMap(m270112, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m270112);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr2 = bArr;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final byte[] m27479(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 3) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27004(bArr);
        } catch (java.lang.Throwable th) {
            th = th;
            bArr2 = null;
        }
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
            getOutputStallDurationlomOqCM = (getInputFormats + 37) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m27462(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr2;
        int i = getOutputStallDurationlomOqCM + 125;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27008 = util.h.xy.o.ra.m27008(bArr);
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27008, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27008);
                return Camera2StreamConfigurationMap2;
            }
            bArr2 = util.h.xy.o.ra.m27008(bArr);
            try {
                Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr2 = null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m27410(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr2;
        int i = getOutputStallDurationlomOqCM + 17;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27014 = util.h.xy.o.ra.m27014(bArr);
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27014, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27014);
                getInputFormats = (getOutputStallDurationlomOqCM + 13) % 128;
                return Camera2StreamConfigurationMap2;
            }
            bArr2 = util.h.xy.o.ra.m27014(bArr);
            try {
                Camera2StreamConfigurationMap(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr2 = null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m27417(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i = getInputFormats + 31;
        getOutputStallDurationlomOqCM = i % 128;
        byte[] bArr2 = null;
        try {
            try {
                if (i % 2 != 0) {
                    byte[] m26991 = util.h.xy.o.ra.m26991(bArr);
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m26991, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(m26991);
                    int i2 = getOutputStallDurationlomOqCM + 15;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        return Camera2StreamConfigurationMap2;
                    }
                    throw null;
                }
                byte[] m269912 = util.h.xy.o.ra.m26991(bArr);
                Camera2StreamConfigurationMap(m269912, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m269912);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr2 = bArr;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final byte[] m27413(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 23) % 128;
        byte[] bArr2 = null;
        try {
            byte[] m26993 = util.h.xy.o.ra.m26993(bArr);
            try {
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m26993, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m26993);
                int i = getInputFormats + 109;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 != 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                bArr2 = m26993;
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m27421(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        try {
            bArr2 = util.h.xy.o.ra.m26993(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                int i = getInputFormats;
                getOutputStallDurationlomOqCM = (i + 99) % 128;
                getOutputStallDurationlomOqCM = (i + 35) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27467(util.h.xy.o.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputStallDurationlomOqCM + 119;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bVar);
                getHighSpeedVideoFpsRanges(highSpeedVideoSizes, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(highSpeedVideoSizes);
                getOutputStallDurationlomOqCM = (getInputFormats + 63) % 128;
                return;
            }
            byte[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(bVar);
            getHighSpeedVideoFpsRanges(highSpeedVideoSizes2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(highSpeedVideoSizes2);
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) bVar);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* renamed from: ʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27420(byte[] bArr) {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 41) % 128;
        byte[] bArr3 = null;
        try {
            try {
                bArr2 = util.h.xy.o.ra.m27001(bArr);
                try {
                    getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                    util.h.xy.ar.b.m25095(bArr2);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e = e;
                    e.printStackTrace();
                    util.h.xy.ar.b.m25095(bArr2);
                    int i = getInputFormats + 1;
                    getOutputStallDurationlomOqCM = i % 128;
                    bArr = i % 2;
                    if (bArr != 0) {
                    }
                }
            } catch (java.lang.Throwable th) {
                bArr3 = bArr;
                th = th;
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            e = e2;
            bArr2 = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr3);
            throw th;
        }
        int i2 = getInputFormats + 1;
        getOutputStallDurationlomOqCM = i2 % 128;
        bArr = i2 % 2;
        if (bArr != 0) {
            throw null;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m27423(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 83) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m26995(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                getOutputStallDurationlomOqCM = (getInputFormats + 61) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m27418(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 81) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27016(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                int i = getInputFormats + 121;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m27441(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 27) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27011(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                int i = (getInputFormats + 119) % 128;
                getOutputStallDurationlomOqCM = i;
                int i2 = i + 33;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    /* renamed from: ˍ, reason: contains not printable characters */
    public final void m27442(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 69) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27004(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                getOutputStallDurationlomOqCM = (getInputFormats + 11) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public final void m27465(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getOutputStallDurationlomOqCM + 21) % 128;
        byte[] bArr2 = null;
        try {
            byte[] m27008 = util.h.xy.o.ra.m27008(bArr);
            try {
                getHighSpeedVideoFpsRanges(m27008, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27008);
                int i = getOutputStallDurationlomOqCM + 111;
                getInputFormats = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                bArr2 = m27008;
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27451(byte[] bArr, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 99) % 128;
        byte[] bArr2 = null;
        try {
            bArr2 = util.h.xy.o.ra.m27012(bArr, util.h.xy.ar.b.m25088(i));
            getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
            getInputFormats = (getOutputStallDurationlomOqCM + 121) % 128;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public final void m27459(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr2;
        int i = getInputFormats + 79;
        getOutputStallDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27014 = util.h.xy.o.ra.m27014(bArr);
                getHighSpeedVideoFpsRanges(m27014, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27014);
                int i2 = getInputFormats + 15;
                getOutputStallDurationlomOqCM = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
            bArr2 = util.h.xy.o.ra.m27014(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr2 = null;
        }
    }

    /* renamed from: ᐨ, reason: contains not printable characters */
    public final void m27475(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getOutputStallDurationlomOqCM = (getInputFormats + 21) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m26991(bArr);
            try {
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                getInputFormats = (getOutputStallDurationlomOqCM + 55) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27443(byte[] bArr, int i, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27009;
        int i2 = getOutputStallDurationlomOqCM + 75;
        getInputFormats = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                if (mgVar != util.h.xy.d.mg.f1144) {
                    m27009 = util.h.xy.o.ra.m27009(bArr, util.h.xy.ar.b.m25088(i));
                    getInputFormats = (getOutputStallDurationlomOqCM + 39) % 128;
                } else {
                    getOutputStallDurationlomOqCM = (getInputFormats + 3) % 128;
                    m27009 = util.h.xy.o.ra.m27009(bArr, null);
                }
                byte[] bArr2 = m27009;
                getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(bArr2);
                return;
            }
            util.h.xy.d.mg mgVar2 = util.h.xy.d.mg.f1144;
            throw new java.lang.NullPointerException();
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) null);
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27424(byte[] bArr, int i, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 101) % 128;
        byte[] bArr2 = null;
        try {
            bArr2 = util.h.xy.o.ra.m27005(bArr, util.h.xy.ar.b.m25088(i));
            getHighSpeedVideoFpsRanges(bArr2, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
            getInputFormats = (getOutputStallDurationlomOqCM + 103) % 128;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27468(byte[] bArr, int i, util.h.xy.d.mg mgVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] m27017;
        getInputFormats = (getOutputStallDurationlomOqCM + 7) % 128;
        byte[] bArr2 = null;
        try {
            if (mgVar == util.h.xy.d.mg.f1144) {
                m27017 = util.h.xy.o.ra.m27017(bArr, null);
            } else {
                m27017 = util.h.xy.o.ra.m27017(bArr, util.h.xy.ar.b.m25088(i));
            }
            try {
                getHighSpeedVideoFpsRanges(m27017, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27017);
                int i2 = getInputFormats + 61;
                getOutputStallDurationlomOqCM = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr2 = m27017;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐧ, reason: contains not printable characters */
    public final void m27474(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        try {
            bArr2 = util.h.xy.o.ra.m27015();
            try {
                util.h.xy.aw.b bVar = new util.h.xy.aw.b();
                util.h.xy.aw.ra.m25249(bArr, bVar, 42);
                getHighSpeedVideoFpsRanges(bArr2, bVar.m25241(), util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(bArr2);
                getInputFormats = (getOutputStallDurationlomOqCM + 103) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27435() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr;
        try {
            bArr = util.h.xy.o.ra.m27015();
        } catch (java.lang.Throwable th) {
            th = th;
            bArr = null;
        }
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, util.h.xy.t.mb.b.f2428);
            util.h.xy.ar.b.m25095(bArr);
            int i = (getOutputStallDurationlomOqCM + 83) % 128;
            getInputFormats = i;
            getOutputStallDurationlomOqCM = (i + 51) % 128;
            util.h.xy.ar.b.m25098(Camera2StreamConfigurationMap2);
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    @util.h.xy.a.a
    /* renamed from: ՙ, reason: contains not printable characters */
    public final void m27463(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputStallDurationlomOqCM + 79;
        getInputFormats = i % 128;
        ?? r0 = i % 2;
        byte[] bArr2 = null;
        try {
            try {
                if (r0 == 0) {
                    byte[] m27000 = util.h.xy.o.ra.m27000();
                    getHighSpeedVideoFpsRanges(m27000, bArr, util.h.xy.t.mb.b.f2428);
                    util.h.xy.ar.b.m25095(m27000);
                    int i2 = getOutputStallDurationlomOqCM + 33;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                byte[] m270002 = util.h.xy.o.ra.m27000();
                getHighSpeedVideoFpsRanges(m270002, bArr, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(m270002);
                throw null;
            } catch (java.lang.Throwable th) {
                th = th;
                bArr2 = r0;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ﹳ, reason: contains not printable characters */
    public final void m27480(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 57) % 128;
        byte[] bArr2 = null;
        try {
            byte[] m27010 = util.h.xy.o.ra.m27010();
            try {
                getHighSpeedVideoFpsRanges(m27010, bArr, util.h.xy.t.mb.b.f2429);
                util.h.xy.ar.b.m25095(m27010);
                int i = getInputFormats + 35;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bArr2 = m27010;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27427() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr = null;
        try {
            byte[] m27000 = util.h.xy.o.ra.m27000();
            try {
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27000, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(m27000);
                int i = getOutputStallDurationlomOqCM;
                getInputFormats = (i + 3) % 128;
                int i2 = i + 119;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                th = th;
                bArr = m27000;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27455() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i = getOutputStallDurationlomOqCM + 37;
        getInputFormats = i % 128;
        ?? r0 = i % 2;
        byte[] bArr = null;
        try {
            try {
                if (r0 == 0) {
                    byte[] m27010 = util.h.xy.o.ra.m27010();
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27010, util.h.xy.t.mb.b.f2428);
                    util.h.xy.ar.b.m25095(m27010);
                    int i2 = getOutputStallDurationlomOqCM;
                    getInputFormats = (i2 + 13) % 128;
                    int i3 = i2 + 17;
                    getInputFormats = i3 % 128;
                    if (i3 % 2 == 0) {
                        return Camera2StreamConfigurationMap2;
                    }
                    throw null;
                }
                byte[] m270102 = util.h.xy.o.ra.m27010();
                Camera2StreamConfigurationMap(m270102, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(m270102);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            bArr = r0;
            th = th3;
            util.h.xy.ar.b.m25095(bArr);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* renamed from: ι, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m27478() {
        byte[] bArr;
        ?? r1;
        getOutputStallDurationlomOqCM = (getInputFormats + 59) % 128;
        byte[] bArr2 = null;
        try {
            try {
                bArr = util.h.xy.o.ra.m27000();
                try {
                    getHighSpeedVideoFpsRanges(bArr, util.h.xy.t.mb.b.f2428);
                    util.h.xy.ar.b.m25095(bArr);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e = e;
                    e.printStackTrace();
                    util.h.xy.ar.b.m25095(bArr);
                    int i = getOutputStallDurationlomOqCM + 99;
                    getInputFormats = i % 128;
                    r1 = i % 2;
                    if (r1 != 0) {
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bArr2 = r1;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            e = e2;
            bArr = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
        int i2 = getOutputStallDurationlomOqCM + 99;
        getInputFormats = i2 % 128;
        r1 = i2 % 2;
        if (r1 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m27409() {
        com.gemalto.mfs.mwsdk.exception.InternalComponentException e;
        int i = getOutputStallDurationlomOqCM + 33;
        getInputFormats = i % 128;
        byte[] bArr = i % 2;
        byte[] bArr2 = null;
        try {
            try {
                try {
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                    e = e2;
                    e.printStackTrace();
                    util.h.xy.ar.b.m25095(bArr);
                    getOutputStallDurationlomOqCM = (getInputFormats + 35) % 128;
                    return null;
                }
            } catch (java.lang.Throwable th) {
                bArr2 = bArr;
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
            e = e3;
            bArr = 0;
            e.printStackTrace();
            util.h.xy.ar.b.m25095(bArr);
            getOutputStallDurationlomOqCM = (getInputFormats + 35) % 128;
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
        if (bArr != 0) {
            byte[] m27010 = util.h.xy.o.ra.m27010();
            getHighSpeedVideoFpsRanges(m27010, util.h.xy.t.mb.b.f2428);
            util.h.xy.ar.b.m25095(m27010);
            throw new java.lang.ArithmeticException();
        }
        byte[] m270102 = util.h.xy.o.ra.m27010();
        getHighSpeedVideoFpsRanges(m270102, util.h.xy.t.mb.b.f2428);
        util.h.xy.ar.b.m25095(m270102);
        getOutputStallDurationlomOqCM = (getInputFormats + 35) % 128;
        return null;
    }

    @util.h.xy.a.a
    /* renamed from: ʹ, reason: contains not printable characters */
    public final void m27407(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        getInputFormats = (getOutputStallDurationlomOqCM + 27) % 128;
        try {
            bArr2 = util.h.xy.o.ra.m27007();
            try {
                getHighSpeedVideoFpsRanges(bArr2, bArr, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(bArr2);
                getInputFormats = (getOutputStallDurationlomOqCM + 49) % 128;
            } catch (java.lang.Throwable th) {
                th = th;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m27461() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr;
        int i = getInputFormats + 51;
        getOutputStallDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27007 = util.h.xy.o.ra.m27007();
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27007, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(m27007);
                getOutputStallDurationlomOqCM = (getInputFormats + 9) % 128;
                return Camera2StreamConfigurationMap2;
            }
            bArr = util.h.xy.o.ra.m27007();
            try {
                Camera2StreamConfigurationMap(bArr, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(bArr);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* renamed from: ʼ, reason: contains not printable characters */
    public final byte[] m27412() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        int i = getInputFormats + 41;
        getOutputStallDurationlomOqCM = i % 128;
        ?? r0 = i % 2;
        byte[] bArr = null;
        try {
            try {
                if (r0 != 0) {
                    byte[] m27007 = util.h.xy.o.ra.m27007();
                    getHighSpeedVideoFpsRanges(m27007, util.h.xy.t.mb.b.f2428);
                    util.h.xy.ar.b.m25095(m27007);
                    getOutputStallDurationlomOqCM = (getInputFormats + 111) % 128;
                    return null;
                }
                byte[] m270072 = util.h.xy.o.ra.m27007();
                getHighSpeedVideoFpsRanges(m270072, util.h.xy.t.mb.b.f2428);
                util.h.xy.ar.b.m25095(m270072);
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            bArr = r0;
            th = th3;
            util.h.xy.ar.b.m25095(bArr);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27469(byte[] bArr, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26994;
        getInputFormats = (getOutputStallDurationlomOqCM + 35) % 128;
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = null;
        try {
            if (z) {
                m26994 = util.h.xy.o.ra.m27018();
                int i = getInputFormats + 85;
                getOutputStallDurationlomOqCM = i % 128;
                int i2 = i % 2;
            } else {
                m26994 = util.h.xy.o.ra.m26994();
            }
            bArr2 = m26994;
            getHighSpeedVideoFpsRanges(bArr2, bArr, util.h.xy.t.mb.b.f2426);
        } finally {
            util.h.xy.ar.b.m25095(bArr2);
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27428(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputStallDurationlomOqCM + 105;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27018 = z ? util.h.xy.o.ra.m27018() : util.h.xy.o.ra.m26994();
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m27018, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m27018);
                getInputFormats = (getOutputStallDurationlomOqCM + 55) % 128;
                util.h.xy.ar.b.m25074(Camera2StreamConfigurationMap2);
                return Camera2StreamConfigurationMap2;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) null);
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m27472(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26994;
        byte[] bArr = null;
        try {
            if (z) {
                m26994 = util.h.xy.o.ra.m27018();
            } else {
                m26994 = util.h.xy.o.ra.m26994();
                getInputFormats = (getOutputStallDurationlomOqCM + 109) % 128;
            }
            try {
                getHighSpeedVideoFpsRanges(m26994, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m26994);
                int i = getOutputStallDurationlomOqCM + 65;
                getInputFormats = i % 128;
                if (i % 2 == 0) {
                    return null;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                bArr = m26994;
                th = th;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27433(byte[] bArr, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26997;
        getOutputStallDurationlomOqCM = (getInputFormats + 75) % 128;
        util.h.xy.ar.b.m25074(bArr);
        try {
            if (!z) {
                m26997 = util.h.xy.o.ra.m26997();
            } else {
                int i = getOutputStallDurationlomOqCM + 105;
                getInputFormats = i % 128;
                if (i % 2 == 0) {
                    m26997 = util.h.xy.o.ra.m27006();
                } else {
                    util.h.xy.o.ra.m27006();
                    throw new java.lang.NullPointerException();
                }
            }
            byte[] bArr2 = m26997;
            getHighSpeedVideoFpsRanges(bArr2, bArr, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr2);
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) null);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27437(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26997;
        int i = (getInputFormats + 97) % 128;
        getOutputStallDurationlomOqCM = i;
        byte[] bArr = null;
        try {
            if (z) {
                getInputFormats = (i + 3) % 128;
                m26997 = util.h.xy.o.ra.m27006();
            } else {
                m26997 = util.h.xy.o.ra.m26997();
            }
            bArr = m26997;
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr);
            util.h.xy.ar.b.m25074(Camera2StreamConfigurationMap2);
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr);
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27450(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26997;
        getInputFormats = (getOutputStallDurationlomOqCM + 89) % 128;
        byte[] bArr = null;
        try {
            if (z) {
                m26997 = util.h.xy.o.ra.m27006();
            } else {
                m26997 = util.h.xy.o.ra.m26997();
                getOutputStallDurationlomOqCM = (getInputFormats + 29) % 128;
            }
            bArr = m26997;
            getHighSpeedVideoFpsRanges(bArr, util.h.xy.t.mb.b.f2426);
        } finally {
            util.h.xy.ar.b.m25095(bArr);
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27453(byte[] bArr, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26998;
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = null;
        try {
            if (!z) {
                m26998 = util.h.xy.o.ra.m26998();
            } else {
                int i = getInputFormats + 31;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 != 0) {
                    m26998 = util.h.xy.o.ra.m26999();
                } else {
                    util.h.xy.o.ra.m26999();
                    throw null;
                }
            }
            try {
                getHighSpeedVideoFpsRanges(m26998, bArr, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m26998);
                int i2 = getOutputStallDurationlomOqCM;
                getInputFormats = (i2 + 97) % 128;
                int i3 = i2 + 23;
                getInputFormats = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bArr2 = m26998;
                util.h.xy.ar.b.m25095(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27447(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26998;
        try {
            if (!z) {
                m26998 = util.h.xy.o.ra.m26998();
            } else {
                int i = getInputFormats + 37;
                getOutputStallDurationlomOqCM = i % 128;
                if (i % 2 != 0) {
                    m26998 = util.h.xy.o.ra.m26999();
                } else {
                    util.h.xy.o.ra.m26999();
                    throw new java.lang.NullPointerException();
                }
            }
            byte[] bArr = m26998;
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, util.h.xy.t.mb.b.f2426);
            util.h.xy.ar.b.m25095(bArr);
            getInputFormats = (getOutputStallDurationlomOqCM + 117) % 128;
            util.h.xy.ar.b.m25074(Camera2StreamConfigurationMap2);
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) null);
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m27416(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26998;
        byte[] bArr = null;
        try {
            if (z) {
                m26998 = util.h.xy.o.ra.m26999();
                getInputFormats = (getOutputStallDurationlomOqCM + 31) % 128;
            } else {
                m26998 = util.h.xy.o.ra.m26998();
                int i = getOutputStallDurationlomOqCM + 21;
                getInputFormats = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 / 2;
                }
            }
            try {
                getHighSpeedVideoFpsRanges(m26998, util.h.xy.t.mb.b.f2426);
                util.h.xy.ar.b.m25095(m26998);
                return null;
            } catch (java.lang.Throwable th) {
                bArr = m26998;
                th = th;
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public final void m27481(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputStallDurationlomOqCM + 95;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.o.ra.m27002(), bArr, util.h.xy.t.mb.b.f2426);
            getInputFormats = (getOutputStallDurationlomOqCM + 73) % 128;
        } else {
            getHighSpeedVideoFpsRanges(util.h.xy.o.ra.m27002(), bArr, util.h.xy.t.mb.b.f2426);
            throw null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m27415() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 79;
        getOutputStallDurationlomOqCM = i % 128;
        byte[] m27002 = util.h.xy.o.ra.m27002();
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(m27002, util.h.xy.t.mb.b.f2426);
        }
        Camera2StreamConfigurationMap(m27002, util.h.xy.t.mb.b.f2426);
        throw null;
    }

    /* renamed from: י, reason: contains not printable characters */
    public final void m27464(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 65) % 128;
        getHighSpeedVideoFpsRanges(util.h.xy.o.ra.m26992(), bArr, util.h.xy.t.mb.b.f2425);
        int i = getInputFormats + 113;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final byte[] m27422() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 27;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(util.h.xy.o.ra.m26992(), util.h.xy.t.mb.b.f2425);
        }
        Camera2StreamConfigurationMap(util.h.xy.o.ra.m26992(), util.h.xy.t.mb.b.f2425);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public final void m27476(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputStallDurationlomOqCM + 121;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.o.ra.m26990(), bArr, util.h.xy.t.mb.b.f2425);
        } else {
            getHighSpeedVideoFpsRanges(util.h.xy.o.ra.m26990(), bArr, util.h.xy.t.mb.b.f2425);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final byte[] m27419() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getOutputStallDurationlomOqCM + 83) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.o.ra.m26990(), util.h.xy.t.mb.b.f2425);
        getInputFormats = (getOutputStallDurationlomOqCM + 7) % 128;
        return Camera2StreamConfigurationMap2;
    }

    private final util.h.xy.ac.a getHighSpeedVideoFpsRangesFor(util.h.xy.t.mb.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        Camera2StreamConfigurationMap(bVar);
        if (bVar == util.h.xy.t.mb.b.f2428) {
            util.h.xy.ac.a aVar = this.f2419;
            getOutputStallDurationlomOqCM = (getInputFormats + 29) % 128;
            return aVar;
        }
        if (bVar == util.h.xy.t.mb.b.f2426) {
            getOutputStallDurationlomOqCM = (getInputFormats + 125) % 128;
            return this.f2422;
        }
        if (bVar == util.h.xy.t.mb.b.f2425) {
            getOutputStallDurationlomOqCM = (getInputFormats + 39) % 128;
            return this.f2418;
        }
        if (bVar == util.h.xy.t.mb.b.f2430) {
            return this.f2421;
        }
        if (bVar == util.h.xy.t.mb.b.f2424) {
            getInputFormats = (getOutputStallDurationlomOqCM + 89) % 128;
            return this.f2423;
        }
        if (bVar == util.h.xy.t.mb.b.f2429) {
            return this.f2419;
        }
        return null;
    }

    private final void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, util.h.xy.t.mb.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 119) % 128;
        if (util.h.xy.ar.b.m25070(bArr)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{13054852, -777848939, -1666589058, 1413915560, -43123361, 1289397940, 841453252, -154073377, -998670795, -1737750061, 1548573069, 1420007015, -1065654179, 1444503053, 1487486467, 543102944, 222565449, 511583898, 2136305446, -1048413939, -417611456, -1562216141, 1715964921, -1102053852, 1807756233, -262506236, -1435011203, -1308636447, -146333561, -562305735}, 58 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (util.h.xy.ar.b.m25070(bArr2)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1983076123, 242665363, 1490754152, 771090033, -856136584, 1140428113, -1860598499, -1264936188, 1941260214, -440050598, 1026157285, -1715758007, -470580376, 1857726336, -1754230280, 1694032545, 1883596152, -1279548818, -528779277, 1291923465, -684048657, -861276298, -946156443, 1840620865, -1805410833, -512562240, 1511989912, 1397915885, 513375270, 119860597}, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 61, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(bArr2);
        try {
            getHighSpeedVideoFpsRangesFor(bVar).m24537(bArr, bArr2);
            getOutputStallDurationlomOqCM = (getInputFormats + 13) % 128;
            util.h.xy.ar.b.m25074(bArr);
            util.h.xy.ar.b.m25074(bArr2);
            int i = getInputFormats + 87;
            getOutputStallDurationlomOqCM = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (util.h.xy.ac.mc e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2231, e.getCause());
        }
    }

    @util.h.xy.a.a
    private final byte[] Camera2StreamConfigurationMap(byte[] bArr, util.h.xy.t.mb.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 5;
        getOutputStallDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m24538 = getHighSpeedVideoFpsRangesFor(bVar).m24538(bArr);
                int i2 = getOutputStallDurationlomOqCM;
                getInputFormats = (i2 + 79) % 128;
                if (m24538 != null) {
                    return m24538;
                }
                int i3 = i2 + 7;
                getInputFormats = i3 % 128;
                return i3 % 2 != 0 ? new byte[0] : new byte[0];
            }
            getHighSpeedVideoFpsRangesFor(bVar).m24538(bArr);
            throw new java.lang.NullPointerException();
        } catch (util.h.xy.ac.mc e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2225, e.getCause());
        }
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, util.h.xy.t.mb.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputStallDurationlomOqCM = (getInputFormats + 117) % 128;
        getHighSpeedVideoFpsRangesFor(bVar).m24539(bArr);
        getInputFormats = (getOutputStallDurationlomOqCM + 21) % 128;
    }

    private static byte[] getHighSpeedVideoSizes(util.h.xy.o.b bVar) {
        int i = getInputFormats + 93;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            int i2 = util.h.xy.t.mb.AnonymousClass4.getHighSpeedVideoFpsRanges[bVar.ordinal()];
            throw new java.lang.ArithmeticException();
        }
        int i3 = util.h.xy.t.mb.AnonymousClass4.getHighSpeedVideoFpsRanges[bVar.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            byte[] m27003 = util.h.xy.o.ra.m27003(bVar);
            int i4 = getInputFormats + 105;
            getOutputStallDurationlomOqCM = i4 % 128;
            if (i4 % 2 != 0) {
                return m27003;
            }
            throw null;
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2240);
    }

    private void Camera2StreamConfigurationMap(util.h.xy.t.mb.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (this.f2420 == null) {
            int i = getInputFormats + 5;
            getOutputStallDurationlomOqCM = i % 128;
            if (i % 2 != 0) {
                if (util.h.xy.ag.a.m24556().m24558() == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-901262262, -251561690, -1291049102, -957483442, -634361323, 15971395, -1673328069, 1567655464, 1018188139, 412619281, 881777295, 1511728516, 1766110510, 1198098910, -300787343, 2047133965, 1119335255, 763783257, -1803245647, 78641150, -810080211, 1445354859, -1768752347, 71173897, -856136584, 1140428113, 783953621, -2112706778, 1446093268, -396098264, -867330200, 1395727990}, 62 - android.view.MotionEvent.axisFromString(""), objArr);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
                }
                int i2 = getOutputStallDurationlomOqCM + 67;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    this.f2420 = util.h.xy.ag.a.m24556().m24558();
                    throw new java.lang.ArithmeticException();
                }
                this.f2420 = util.h.xy.ag.a.m24556().m24558();
            } else {
                util.h.xy.ag.a.m24556().m24558();
                throw new java.lang.ArithmeticException();
            }
        }
        switch (util.h.xy.t.mb.AnonymousClass4.Camera2StreamConfigurationMap[bVar.ordinal()]) {
            case 1:
                if (this.f2422 == null) {
                    util.h.xy.ac.c Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
                    android.content.Context context = this.f2420;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("냲㪳軕툚", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, objArr2);
                    this.f2422 = new util.h.xy.ac.a(context, ((java.lang.String) objArr2[0]).intern(), Camera2StreamConfigurationMap2);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{364068026, -465933162, -240629271, -1710301746}, 5 - android.graphics.Color.red(0), objArr3);
                    util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), Camera2StreamConfigurationMap2.m24540());
                    return;
                }
                return;
            case 2:
                if (this.f2423 == null) {
                    util.h.xy.ac.c Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap();
                    android.content.Context context2 = this.f2420;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("냲㪳舃ࡗ", 4 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                    this.f2423 = new util.h.xy.ac.a(context2, ((java.lang.String) objArr4[0]).intern(), Camera2StreamConfigurationMap3);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{621642905, 1210119658, -240629271, -1710301746}, android.view.View.MeasureSpec.getSize(0) + 5, objArr5);
                    util.h.xy.am.ma.m25030(((java.lang.String) objArr5[0]).intern(), Camera2StreamConfigurationMap3.m24540());
                    getOutputStallDurationlomOqCM = (getInputFormats + 61) % 128;
                    return;
                }
                return;
            case 3:
            case 4:
                if (this.f2419 == null) {
                    util.h.xy.ac.c Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap();
                    android.content.Context context3 = this.f2420;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{1595486306, -812524313}, 4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr6);
                    this.f2419 = new util.h.xy.ac.a(context3, ((java.lang.String) objArr6[0]).intern(), Camera2StreamConfigurationMap4);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\ud9bd链⨲퍐", 3 - android.view.MotionEvent.axisFromString(""), objArr7);
                    util.h.xy.am.ma.m25030(((java.lang.String) objArr7[0]).intern(), Camera2StreamConfigurationMap4.m24540());
                    return;
                }
                return;
            case 5:
                if (this.f2418 == null) {
                    util.h.xy.ac.c Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap();
                    android.content.Context context4 = this.f2420;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("냲㪳뛠倈", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4, objArr8);
                    this.f2418 = new util.h.xy.ac.a(context4, ((java.lang.String) objArr8[0]).intern(), Camera2StreamConfigurationMap5);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("ᧁἶ\ue90e䐡", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr9);
                    util.h.xy.am.ma.m25030(((java.lang.String) objArr9[0]).intern(), Camera2StreamConfigurationMap5.m24540());
                    return;
                }
                return;
            case 6:
                if (this.f2421 == null) {
                    util.h.xy.ac.c Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap();
                    android.content.Context context5 = this.f2420;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("냲㪳ࠇ踡", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5, objArr10);
                    this.f2421 = new util.h.xy.ac.a(context5, ((java.lang.String) objArr10[0]).intern(), Camera2StreamConfigurationMap6);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("鄞炩⨲퍐", android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr11);
                    util.h.xy.am.ma.m25030(((java.lang.String) objArr11[0]).intern(), Camera2StreamConfigurationMap6.m24540());
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: util.h.xy.t.mb$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.t.mb.b.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[util.h.xy.t.mb.b.f2426.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.t.mb.b.f2424.ordinal()] = 2;
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i | 61) << 1) - (i ^ 61)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.t.mb.b.f2428.ordinal()] = 3;
                int i2 = getHighSpeedVideoSizes;
                int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.t.mb.b.f2429.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.t.mb.b.f2425.ordinal()] = 5;
                int i5 = getHighSpeedVideoSizes;
                int i6 = (i5 & 99) + (i5 | 99);
                getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.t.mb.b.f2430.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[util.h.xy.o.b.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[util.h.xy.o.b.f2285.ordinal()] = 1;
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 65;
                getHighSpeedVideoSizes = i8 % 128;
                int i9 = i8 % 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.o.b.f2276.ordinal()] = 2;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 49) % 128;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.o.b.f2281.ordinal()] = 3;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i10 = ~currentTimeMillis;
                int i11 = ~((i10 ^ (-2067487221)) | (i10 & (-2067487221)));
                int i12 = ~((currentTimeMillis ^ (-53916641)) | (currentTimeMillis & (-53916641)));
                int i13 = ((i11 ^ i12) | (i11 & i12)) * (-370);
                int i14 = (i13 ^ 1061816892) + ((i13 & 1061816892) << 1) + (((~(currentTimeMillis | (-2067487221))) | (~((i10 ^ (-53916641)) | (i10 & (-53916641)))) | (-2067790837)) * (-370));
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i15 = -(-(((~(((-163302780) ^ currentTimeMillis2) | (currentTimeMillis2 & (-163302780)))) | 151650353) * (-283)));
                if ((i14 & (-578431002)) + ((-578431002) | i14) <= (i15 ^ (-1379471120)) + ((i15 & (-1379471120)) << 1) + 217387008 + ((~(currentTimeMillis2 | (-11652427))) * 283)) {
                    int i16 = 5 / 4;
                }
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 79) % 128;
        }
    }

    private void getHighSpeedVideoSizes() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 9;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2428);
            Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2426);
            Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2425);
            Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2430);
            Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2424);
            return;
        }
        Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2428);
        Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2426);
        Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2425);
        Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2430);
        Camera2StreamConfigurationMap(util.h.xy.t.mb.b.f2424);
        throw null;
    }

    private static util.h.xy.ac.c Camera2StreamConfigurationMap() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m24548 = util.h.xy.ad.a.m24548(util.h.xy.z.mb.m27715());
        util.h.xy.al.rb.m25016(m24548);
        util.h.xy.ac.c cVar = new util.h.xy.ac.c(m24548);
        int i = getOutputStallDurationlomOqCM + 27;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return cVar;
        }
        throw null;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m27440() {
        int i = getOutputStallDurationlomOqCM + 119;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoSizes();
            util.h.xy.ac.a aVar = this.f2422;
            if (aVar != null) {
                int i2 = getOutputStallDurationlomOqCM + 91;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    aVar.m24536();
                    this.f2422 = null;
                } else {
                    aVar.m24536();
                    this.f2422 = null;
                    throw new java.lang.ArithmeticException();
                }
            }
            util.h.xy.ac.a aVar2 = this.f2419;
            if (aVar2 != null) {
                aVar2.m24536();
                this.f2419 = null;
            }
            util.h.xy.ac.a aVar3 = this.f2418;
            if (aVar3 != null) {
                int i3 = getInputFormats + 109;
                getOutputStallDurationlomOqCM = i3 % 128;
                if (i3 % 2 != 0) {
                    aVar3.m24536();
                    this.f2418 = null;
                } else {
                    aVar3.m24536();
                    this.f2418 = null;
                    throw null;
                }
            }
            util.h.xy.ac.a aVar4 = this.f2421;
            if (aVar4 != null) {
                aVar4.m24536();
                this.f2421 = null;
            }
            util.h.xy.ac.a aVar5 = this.f2423;
            if (aVar5 != null) {
                aVar5.m24536();
                this.f2423 = null;
                return;
            }
            return;
        }
        getHighSpeedVideoSizes();
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRangesFor = new int[]{1705065362, 1472548014, -1621577347, 587087196, -351284160, -305624469, -1861452747, -245610181, -1176678962, 235539860, 2129431569, -1169197347, 1273980679, -679894834, -1382347390, 2054563007, -1691395420, -1027735014};
        getOutputMinFrameDuration = (char) 62078;
        getHighSpeedVideoSizesFor = (char) 16580;
        getInputSizeshNQ4ISI = (char) 33908;
        getOutputFormats = (char) 62649;
    }
}
