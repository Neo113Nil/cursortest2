package util.h.xy.bt;

/* loaded from: classes18.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static boolean getHighSpeedVideoSizes = false;
    private static int getHighSpeedVideoSizesFor = 1;
    private static boolean getInputFormats = false;
    private static int getInputSizeshNQ4ISI;
    private static char[] getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static char[] getOutputStallDurationlomOqCM;
    private util.h.xy.bt.ra.a getOutputMinFrameDurationlomOqCM;
    private util.h.xy.d.md getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private util.h.xy.bt.a getOutputStallDuration;
    private com.gemalto.mfs.mwsdk.dcm.PaymentType isOutputSupportedFor;

    static /* synthetic */ util.h.xy.bt.a Camera2StreamConfigurationMap(util.h.xy.bt.ra raVar) {
        int i = getHighSpeedVideoSizesFor + 35;
        int i2 = i % 128;
        getInputSizeshNQ4ISI = i2;
        util.h.xy.bt.a aVar = raVar.getOutputStallDuration;
        if (i % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoSizesFor = (i2 + 99) % 128;
        return aVar;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bt.ra raVar) {
        int i = getHighSpeedVideoSizesFor + 115;
        getInputSizeshNQ4ISI = i % 128;
        raVar.Camera2StreamConfigurationMap();
        if (i % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 77;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = getOutputMinFrameDuration;
        getHighSpeedVideoSizesFor = (i + 27) % 128;
        return str;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.bt.ra raVar) {
        int i = getHighSpeedVideoSizesFor + 103;
        getInputSizeshNQ4ISI = i % 128;
        raVar.getHighResolutionOutputSizeshNQ4ISI();
        if (i % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.bt.ra raVar) {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 57) % 128;
        raVar.getHighSpeedVideoFpsRanges();
        int i = getHighSpeedVideoSizesFor + 43;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static {
        getHighSpeedVideoSizes();
        getOutputMinFrameDuration = "ra";
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 11) % 128;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class mb {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static final /* synthetic */ util.h.xy.bt.ra.mb[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int[] getHighSpeedVideoSizes = null;
        private static int getInputFormats = 1;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.mb f1046;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.mb f1047;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.mb f1048;

        private mb(java.lang.String str, int i) {
        }

        public static util.h.xy.bt.ra.mb valueOf(java.lang.String str) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 31) % 128;
            util.h.xy.bt.ra.mb mbVar = (util.h.xy.bt.ra.mb) java.lang.Enum.valueOf(util.h.xy.bt.ra.mb.class, str);
            int i = getHighResolutionOutputSizeshNQ4ISI + 75;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                return mbVar;
            }
            throw null;
        }

        public static util.h.xy.bt.ra.mb[] values() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 23;
            getInputFormats = i % 128;
            util.h.xy.bt.ra.mb[] mbVarArr = getHighSpeedVideoFpsRanges;
            if (i % 2 != 0) {
                return (util.h.xy.bt.ra.mb[]) mbVarArr.clone();
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            util.h.xy.bt.ra.mb[] mbVarArr;
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{772429589, 1479618278, 1620294036, -1235697046, 980717628, -596848808, -914374052, -2075389496}, android.text.TextUtils.getOffsetAfter("", 0) + 15, objArr);
            util.h.xy.bt.ra.mb mbVar = new util.h.xy.bt.ra.mb(((java.lang.String) objArr[0]).intern(), 0);
            f1046 = mbVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{1818333865, -1594031530, 223985601, -1119901041, 802440651, 1793043475}, 9 - android.view.View.getDefaultSize(0, 0), objArr2);
            util.h.xy.bt.ra.mb mbVar2 = new util.h.xy.bt.ra.mb(((java.lang.String) objArr2[0]).intern(), 1);
            f1047 = mbVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{772429589, 1479618278, 1818333865, -1594031530, 223985601, -1119901041, 802440651, 1793043475}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 13, objArr3);
            util.h.xy.bt.ra.mb mbVar3 = new util.h.xy.bt.ra.mb(((java.lang.String) objArr3[0]).intern(), 2);
            f1048 = mbVar3;
            int i = getInputFormats;
            int i2 = i + 49;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                mbVarArr = new util.h.xy.bt.ra.mb[4];
                mbVarArr[0] = mbVar;
                mbVarArr[1] = mbVar2;
                mbVarArr[5] = mbVar3;
            } else {
                mbVarArr = new util.h.xy.bt.ra.mb[]{mbVar, mbVar2, mbVar3};
            }
            int i3 = i + 39;
            int i4 = i3 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            if (i3 % 2 == 0) {
                getHighSpeedVideoFpsRanges = mbVarArr;
                getInputFormats = (i4 + 89) % 128;
                return;
            }
            throw null;
        }

        private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
            util.h.xz.b.c cVar = new util.h.xz.b.c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = getHighSpeedVideoSizes;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = getHighSpeedVideoFpsRangesFor + 15;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 == 0) {
                        iArr3[i2] = (int) (iArr2[i2] % (-5569649899877129369L));
                        i2 %= 1;
                    } else {
                        iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                        i2++;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getHighSpeedVideoSizes;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i4 = 0; i4 < length3; i4++) {
                    iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
                }
                iArr5 = iArr6;
            }
            java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
            cVar.f2626 = 0;
            while (cVar.f2626 < iArr.length) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 121) % 128;
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

        static void getHighSpeedVideoFpsRangesFor() {
            getHighSpeedVideoSizes = new int[]{1870021746, -2135006797, -1214855922, 1028807452, -2101667483, -147858316, -1585628119, -705933230, -1153752907, -1330907273, 1580655516, -1676428637, -1586891335, -2134016586, 1766152673, 224672986, 713607071, -1643932863};
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 79) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i3 = getHighSpeedVideoFpsRangesFor + 125;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                int i4 = rbVar.f2651;
                throw new java.lang.ArithmeticException();
            }
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 35) % 128;
        objArr[0] = str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        private static char Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes = 1;
        private static char getHighSpeedVideoSizesFor;
        private static char getInputSizeshNQ4ISI;
        private static char getOutputFormats;
        private static final /* synthetic */ util.h.xy.bt.ra.a[] getOutputMinFrameDuration;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.a f1043;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.a f1044;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.a f1045;

        private a(java.lang.String str, int i) {
        }

        public static util.h.xy.bt.ra.a valueOf(java.lang.String str) {
            int i = getHighSpeedVideoFpsRanges + 87;
            getHighSpeedVideoSizes = i % 128;
            util.h.xy.bt.ra.a aVar = (util.h.xy.bt.ra.a) java.lang.Enum.valueOf(util.h.xy.bt.ra.a.class, str);
            if (i % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        public static util.h.xy.bt.ra.a[] values() {
            int i = getHighSpeedVideoFpsRanges + 11;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            util.h.xy.bt.ra.a[] aVarArr = (util.h.xy.bt.ra.a[]) getOutputMinFrameDuration.clone();
            int i2 = getHighSpeedVideoSizes + 61;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                return aVarArr;
            }
            throw null;
        }

        static {
            getHighResolutionOutputSizeshNQ4ISI();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("왇둯1훌鉀黌Ṙ\ue81b\ud83e﹇\uf0ea嚽忴⍓ঙ䖼⊃➡", 17 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            util.h.xy.bt.ra.a aVar = new util.h.xy.bt.ra.a(((java.lang.String) objArr[0]).intern(), 0);
            f1043 = aVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("왇둯鬠⁴훂魀", 6 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            util.h.xy.bt.ra.a aVar2 = new util.h.xy.bt.ra.a(((java.lang.String) objArr2[0]).intern(), 1);
            f1045 = aVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("⻢舦\ud91e䜛ꉌᵯ襼\uee07⎃有觱ᱷ㶉셈ꭃꩍ", android.graphics.Color.argb(0, 0, 0, 0) + 15, objArr3);
            util.h.xy.bt.ra.a aVar3 = new util.h.xy.bt.ra.a(((java.lang.String) objArr3[0]).intern(), 2);
            f1044 = aVar3;
            int i = getHighSpeedVideoFpsRanges;
            int i2 = i + 41;
            getHighSpeedVideoSizes = i2 % 128;
            int i3 = i2 % 2;
            util.h.xy.bt.ra.a[] aVarArr = {aVar, aVar2, aVar3};
            int i4 = i + 93;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                getOutputMinFrameDuration = aVarArr;
                int i5 = i + 93;
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
            throw null;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] charArray = str.toCharArray();
            util.h.xz.b.e eVar = new util.h.xz.b.e();
            char[] cArr = new char[charArray.length];
            eVar.f2630 = 0;
            char[] cArr2 = new char[2];
            while (eVar.f2630 < charArray.length) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr2[1];
                    char c2 = cArr2[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                    cArr2[1] = c3;
                    cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                    i2 -= 40503;
                }
                cArr[eVar.f2630] = cArr2[0];
                cArr[eVar.f2630 + 1] = cArr2[1];
                eVar.f2630 += 2;
            }
            objArr[0] = new java.lang.String(cArr, 0, i);
        }

        static void getHighResolutionOutputSizeshNQ4ISI() {
            getInputSizeshNQ4ISI = (char) 39427;
            getHighSpeedVideoSizesFor = (char) 33512;
            Camera2StreamConfigurationMap = (char) 6370;
            getOutputFormats = (char) 205;
        }
    }

    public ra(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, util.h.xy.bt.ra.a aVar, util.h.xy.bt.a aVar2) {
        this.getOutputMinFrameDurationlomOqCM = util.h.xy.bt.ra.a.f1043;
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
        this.getOutputSizes = null;
        this.getOutputStallDuration = null;
        this.getOutputSizeshNQ4ISI = false;
        this.isOutputSupportedFor = paymentType;
        this.getOutputSizes = (util.h.xy.d.md) digitalizedCard;
        this.getOutputMinFrameDurationlomOqCM = aVar;
        this.getOutputStallDuration = aVar2;
        try {
            if (digitalizedCard != null) {
                this.getOutputSizeshNQ4ISI = digitalizedCard.hasAuxiliaryScheme();
                return;
            }
            util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
            if (m26956 != null) {
                this.getOutputSizeshNQ4ISI = m26956.m26179() != null;
            }
        } catch (java.lang.Throwable th) {
            getHighResolutionOutputSizeshNQ4ISI(1, th.getMessage(), th);
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputStallDurationlomOqCM;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRanges);
        if (!getHighSpeedVideoSizes) {
            if (!getInputFormats) {
                throw null;
            }
            int i4 = Camera2StreamConfigurationMap + 29;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public java.lang.Object m25628() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 113) % 128;
        if (this.getOutputMinFrameDurationlomOqCM == util.h.xy.bt.ra.a.f1043) {
            util.h.xy.bg.a.f944.m25451(new java.util.concurrent.CountDownLatch(1));
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bt.ra.1
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoFpsRangesFor;
                private static char[] getInputFormats = {38471, 41902, 41906, 38469, 41865, 41909, 41958, 38468, 41868, 41912, 41896, 41917, 41874, 41907, 41900, 41880, 41885, 41864, 41908, 41871, 41875, 38467, 41919, 38466, 41913};
                private static char getInputSizeshNQ4ISI = 38467;

                @Override // java.lang.Runnable
                public final void run() {
                    long currentTimeMillis;
                    java.lang.Object obj;
                    int i = getHighResolutionOutputSizeshNQ4ISI + 41;
                    getHighSpeedVideoFpsRanges = i % 128;
                    if (i % 2 == 0) {
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                        util.h.xy.bt.ra.getHighSpeedVideoSizes(util.h.xy.bt.ra.this);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((byte) (64 >> android.widget.ExpandableListView.getPackedPositionType(0L)), "\u0012\u0006\u0013\u0000\u0012\u0013\u0004\u0015\u000e\u0006\t\u0010\u000b\f\u0000\u000b\r\u000e\u0007\u0002\u0014\u0015\u0013\u0004\u0006\u0010\u000f\n\f\u0003\u0012\u0013\u0004\u0015\u000e\u0006", 66 >>> android.text.TextUtils.indexOf("", "", 0), objArr);
                        obj = objArr[0];
                    } else {
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                        util.h.xy.bt.ra.getHighSpeedVideoSizes(util.h.xy.bt.ra.this);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 19), "\u0012\u0006\u0013\u0000\u0012\u0013\u0004\u0015\u000e\u0006\t\u0010\u000b\f\u0000\u000b\r\u000e\u0007\u0002\u0014\u0015\u0013\u0004\u0006\u0010\u000f\n\f\u0003\u0012\u0013\u0004\u0015\u000e\u0006", 36 - android.text.TextUtils.indexOf("", "", 0), objArr2);
                        obj = objArr2[0];
                    }
                    util.h.xy.bh.mb.m25480(((java.lang.String) obj).intern(), currentTimeMillis);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
                
                    if (r0.f2641 == r0.f2636) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
                
                    r0.f2639 = r0.f2641 / r2;
                    r0.f2640 = r0.f2641 % r2;
                    r0.f2637 = r0.f2636 / r2;
                    r0.f2635 = r0.f2636 % r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00de, code lost:
                
                    if (r0.f2640 != r0.f2635) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
                
                    r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
                    r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
                    r7 = r0.f2639;
                    r8 = r0.f2640;
                    r9 = r0.f2637;
                    r10 = r0.f2635;
                    r3[r0.f2638] = r1[(r7 * r2) + r8];
                    r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
                
                    if (r0.f2639 != r0.f2637) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x010e, code lost:
                
                    util.h.xy.bt.ra.AnonymousClass1.Camera2StreamConfigurationMap = (util.h.xy.bt.ra.AnonymousClass1.getHighSpeedVideoFpsRangesFor + 55) % 128;
                    r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
                    r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
                    r7 = r0.f2639;
                    r8 = r0.f2640;
                    r9 = r0.f2637;
                    r10 = r0.f2635;
                    r3[r0.f2638] = r1[(r7 * r2) + r8];
                    r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
                    util.h.xy.bt.ra.AnonymousClass1.Camera2StreamConfigurationMap = (util.h.xy.bt.ra.AnonymousClass1.getHighSpeedVideoFpsRangesFor + 13) % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0146, code lost:
                
                    r7 = r0.f2639;
                    r8 = r0.f2635;
                    r9 = r0.f2637;
                    r10 = r0.f2640;
                    r3[r0.f2638] = r1[(r7 * r2) + r8];
                    r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
                
                    r7 = util.h.xy.bt.ra.AnonymousClass1.Camera2StreamConfigurationMap + 11;
                    util.h.xy.bt.ra.AnonymousClass1.getHighSpeedVideoFpsRangesFor = r7 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
                
                    if ((r7 % 2) == 0) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
                
                    r3[r0.f2638] = (char) (r0.f2641 * r12);
                    r3[r0.f2638] = (char) (r0.f2636 * r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
                
                    r3[r0.f2638] = (char) (r0.f2641 - r12);
                    r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
                
                    if (r0.f2641 == r0.f2636) goto L26;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
                    int i2;
                    int i3 = getHighSpeedVideoFpsRangesFor + 111;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                    char[] cArr = getInputFormats;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
                        }
                        cArr = cArr2;
                    }
                    char c = (char) (4042185467053315654L ^ getInputSizeshNQ4ISI);
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr3[i2] = (char) (charArray[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 119) % 128;
                        mcVar.f2638 = 0;
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 111) % 128;
                        while (mcVar.f2638 < i2) {
                            int i5 = Camera2StreamConfigurationMap + 83;
                            getHighSpeedVideoFpsRangesFor = i5 % 128;
                            if (i5 % 2 != 0) {
                                mcVar.f2641 = charArray[mcVar.f2638];
                                mcVar.f2636 = charArray[mcVar.f2638 << 1];
                            } else {
                                mcVar.f2641 = charArray[mcVar.f2638];
                                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                            }
                            mcVar.f2638 += 2;
                        }
                    }
                    int i6 = 0;
                    while (i6 < i) {
                        int i7 = Camera2StreamConfigurationMap + 121;
                        getHighSpeedVideoFpsRangesFor = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr3[i6] = (char) (cArr3[i6] ^ 28463);
                            i6 += 3;
                        } else {
                            cArr3[i6] = (char) (cArr3[i6] ^ 13722);
                            i6++;
                        }
                    }
                    java.lang.String str2 = new java.lang.String(cArr3);
                    int i8 = getHighSpeedVideoFpsRangesFor + 117;
                    Camera2StreamConfigurationMap = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    objArr[0] = str2;
                }
            });
            thread.setPriority(10);
            thread.start();
            util.h.xy.bg.a.f944.m25455(new java.util.concurrent.CountDownLatch(1));
            java.lang.Thread thread2 = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bt.ra.4
                private static int Camera2StreamConfigurationMap = 0;
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static char[] getHighSpeedVideoFpsRangesFor = {42365, 42261, 42263, 42257, 42249, 42243, 42288, 42294, 42302, 42303, 42258, 42336, 42255, 42294, 42291, 42290, 42294, 42295, 42291, 42289, 42291, 42242, 42300, 42285, 42292, 42297, 42289, 42286, 42251, 42251, 42286, 42295, 42292, 42286, 42247, 42267, 42258, 42254, 42243, 42288, 42294, 42302, 42303};
                private static int getHighSpeedVideoSizes = 1;
                private static int getOutputMinFrameDuration;

                @Override // java.lang.Runnable
                public final void run() {
                    util.h.xy.bt.ra.AnonymousClass4 anonymousClass4 = this;
                    getHighSpeedVideoSizes = (getOutputMinFrameDuration + 39) % 128;
                    try {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        util.h.xy.bt.ra.getHighSpeedVideoFpsRangesFor(util.h.xy.bt.ra.this);
                        int[] iArr = {0, 43, 0, 0};
                        byte[] bytes = "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001".getBytes("ISO-8859-1");
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 3) % 128;
                        byte[] bArr = bytes;
                        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int i3 = iArr[2];
                        int i4 = iArr[3];
                        char[] cArr = getHighSpeedVideoFpsRangesFor;
                        if (cArr != null) {
                            try {
                                int length = cArr.length;
                                char[] cArr2 = new char[length];
                                for (int i5 = 0; i5 < length; i5++) {
                                    cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
                                }
                                cArr = cArr2;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                anonymousClass4 = this;
                                if (util.h.xy.bt.ra.Camera2StreamConfigurationMap(util.h.xy.bt.ra.this) != null) {
                                    util.h.xy.bt.ra.Camera2StreamConfigurationMap(util.h.xy.bt.ra.this).mo25566();
                                    int i6 = getOutputMinFrameDuration + 67;
                                    getHighSpeedVideoSizes = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        int i7 = 5 / 5;
                                    }
                                }
                                throw th;
                            }
                        }
                        char[] cArr3 = new char[i2];
                        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
                        if (bArr != null) {
                            char[] cArr4 = new char[i2];
                            maVar.f2631 = 0;
                            char c = 0;
                            while (maVar.f2631 < i2) {
                                if (bArr[maVar.f2631] == 1) {
                                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                                } else {
                                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                                }
                                c = cArr4[maVar.f2631];
                                maVar.f2631++;
                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
                            }
                            cArr3 = cArr4;
                        }
                        if (i4 > 0) {
                            char[] cArr5 = new char[i2];
                            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
                            int i8 = i2 - i4;
                            java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i4);
                            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i8);
                        }
                        if (i3 > 0) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
                            maVar.f2631 = 0;
                            while (maVar.f2631 < i2) {
                                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                                maVar.f2631++;
                            }
                        }
                        java.lang.String str = new java.lang.String(cArr3);
                        java.lang.String str2 = str;
                        util.h.xy.bh.mb.m25480(str.intern(), currentTimeMillis);
                        util.h.xy.bt.ra.getHighSpeedVideoFpsRangesFor();
                        if (util.h.xy.bt.ra.Camera2StreamConfigurationMap(util.h.xy.bt.ra.this) != null) {
                            util.h.xy.bt.ra.Camera2StreamConfigurationMap(util.h.xy.bt.ra.this).mo25566();
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
            });
            thread2.setPriority(10);
            thread2.start();
            return null;
        }
        try {
            util.h.xy.bg.a.f944.m25451(new java.util.concurrent.CountDownLatch(1));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            getHighSpeedVideoFpsRanges();
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((maxKeyCode >> 16) + 36, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr);
            util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
            util.h.xy.bg.a.f944.m25455(new java.util.concurrent.CountDownLatch(1));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            getHighResolutionOutputSizeshNQ4ISI();
            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(43 - (fadingEdgeLength >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36, (char) android.text.TextUtils.getTrimmedLength(""), objArr2);
            util.h.xy.bh.mb.m25480(((java.lang.String) objArr2[0]).intern(), currentTimeMillis2);
            util.h.xy.bt.a aVar = this.getOutputStallDuration;
            if (aVar == null) {
                return null;
            }
            aVar.mo25566();
            return null;
        } catch (java.lang.Throwable th) {
            util.h.xy.bt.a aVar2 = this.getOutputStallDuration;
            if (aVar2 != null) {
                aVar2.mo25566();
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 57) % 128;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x003b, code lost:
    
        if (util.h.xy.bq.b.m25556(r11.isOutputSupportedFor, r11.getOutputSizes) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges() {
        long currentTimeMillis;
        byte[] bArr;
        byte[] m25515;
        int i = getInputSizeshNQ4ISI + 35;
        getHighSpeedVideoSizesFor = i % 128;
        try {
            if (i % 2 == 0) {
                util.h.xy.bt.ra.EnumC0264ra.f1049.m25629(util.h.xy.bt.ra.mb.f1046);
                currentTimeMillis = java.lang.System.currentTimeMillis();
                bArr = new byte[0];
                if (!util.h.xy.bq.b.m25556(this.isOutputSupportedFor, this.getOutputSizes)) {
                    if (this.isOutputSupportedFor != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                        m25515 = util.h.xy.k.b.m26924(this.getOutputSizes.getTokenizedCardID(), this.isOutputSupportedFor);
                    }
                }
                m25515 = util.h.xy.bm.b.f983.m25515(this.isOutputSupportedFor, false);
                if (this.getOutputSizeshNQ4ISI) {
                    bArr = util.h.xy.bm.b.f983.m25515(this.isOutputSupportedFor, true);
                }
            } else {
                util.h.xy.bt.ra.EnumC0264ra.f1049.m25629(util.h.xy.bt.ra.mb.f1046);
                currentTimeMillis = java.lang.System.currentTimeMillis();
                bArr = new byte[0];
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0085\u0084\u0083\u0082\u0081\u008a\u0089\u0085\u0088\u008b\u008a\u0089\u0085\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (byte b : m25515) {
                arrayList.add(java.lang.Byte.valueOf(b));
            }
            if (this.getOutputSizeshNQ4ISI) {
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 59) % 128;
                for (byte b2 : bArr) {
                    arrayList2.add(java.lang.Byte.valueOf(b2));
                }
            }
            util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f972, new util.h.xy.bk.ra(arrayList));
            if (this.isOutputSupportedFor == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS && this.getOutputSizeshNQ4ISI) {
                util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f974, new util.h.xy.bk.ra(arrayList2));
            }
            util.h.xy.bt.ra.EnumC0264ra.f1049.m25629(util.h.xy.bt.ra.mb.f1047);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, "\u0090\u0083\u0082\u008f\u008c\u0089\u0088\u0085\u008e\u008d\u0088\u0085\u0087\u008c\u0082\u008b\u008a\u0089\u0085\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            util.h.xy.bh.mb.m25480(((java.lang.String) objArr2[0]).intern(), currentTimeMillis2);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.Gravity.getAbsoluteGravity(0, 0) + 11, 80 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0), objArr3);
            util.h.xy.bh.mb.m25480(((java.lang.String) objArr3[0]).intern(), currentTimeMillis2);
            util.h.xy.bg.a.f944.m25458().countDown();
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 97) % 128;
        } catch (java.lang.Throwable th) {
            try {
                getHighResolutionOutputSizeshNQ4ISI(1, th.getMessage(), th);
            } finally {
                util.h.xy.bg.a.f944.m25458().countDown();
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        try {
            util.h.xy.u.b m25517 = util.h.xy.bm.ma.f984.m25517();
            if (m25517 != util.h.xy.u.b.f2432) {
                if (m25517 != util.h.xy.u.b.f2435 && m25517 != util.h.xy.u.b.f2433) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0085\u008e\u0097\u008c\u0094\u008a\u0088\u0089\u0084\u0094\u008a\u0085\u008c\u0088\u0082\u008e\u008e\u009a\u0090\u0083\u0099", objArr);
                    getHighResolutionOutputSizeshNQ4ISI(2, ((java.lang.String) objArr[0]).intern(), null);
                    return;
                }
                int i = util.h.xy.bt.ra.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[util.h.xy.bm.ma.f984.m25516().ordinal()];
                if (i == 1) {
                    Camera2StreamConfigurationMap(false);
                    getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 55) % 128;
                    return;
                } else {
                    if (i == 2 || i == 3) {
                        Camera2StreamConfigurationMap(true);
                        return;
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008c\u0083\u0085\u0098\u0097\u0089\u008e\u0094\u0085\u0087\u008c\u0094\u0088\u0082\u0096\u0094\u008a\u0085\u0088\u0085\u008c\u0090\u008f\u0095\u0085\u0088\u0094\u008c\u0082\u0083\u0094\u0093\u0092\u0091", objArr2);
                    getHighResolutionOutputSizeshNQ4ISI(3, ((java.lang.String) objArr2[0]).intern(), null);
                    return;
                }
            }
            int i2 = getInputSizeshNQ4ISI + 7;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                Camera2StreamConfigurationMap(true);
            } else {
                Camera2StreamConfigurationMap(false);
            }
        } catch (java.lang.Throwable th) {
            getHighResolutionOutputSizeshNQ4ISI(1, th.getMessage(), th);
        }
    }

    /* renamed from: util.h.xy.bt.ra$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int Camera2StreamConfigurationMap = 1;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN.ordinal()] = 1;
                int i = Camera2StreamConfigurationMap;
                int i2 = (i & 41) + (i | 41);
                getHighSpeedVideoSizes = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS.ordinal()] = 2;
                int i4 = getHighSpeedVideoSizes;
                int i5 = ((i4 | 113) << 1) - (i4 ^ 113);
                Camera2StreamConfigurationMap = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD.ordinal()] = 3;
                int i7 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i7 & 83) + (i7 | 83)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(3:57|58|(1:60)(3:61|20|21))|5|6|7|8|9|10|11|12|13|14|15|(2:17|18)|23|24|25|(3:27|28|(4:30|(2:32|33)|20|21))|35|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
    
        if (r5.await(200, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Camera2StreamConfigurationMap(boolean z) {
        long currentTimeMillis;
        int intValue;
        int scrollBarFadeDuration;
        try {
            try {
                if (z) {
                    try {
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    if (!getOutputFormats()) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTapTimeout() >> 16) + 39, 130 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
                        getHighResolutionOutputSizeshNQ4ISI(5, ((java.lang.String) objArr[0]).intern(), null);
                        return;
                    }
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(intValue + 41, 90 - (scrollBarFadeDuration >> 16), (char) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 21524), objArr2);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr2[0]).intern(), currentTimeMillis);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.concurrent.CountDownLatch m25454 = util.h.xy.bg.a.f944.m25454();
                if (m25454 != null) {
                    getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 9) % 128;
                }
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 89) % 128;
                getHighResolutionOutputSizeshNQ4ISI(z);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.view.View.combineMeasuredStates(0, 0) + 127, "\u008a\u0089\u0085\u0088\u0087\u0086\u009b\u009d\u009f\u0085\u0095\u0089\u0083\u0089\u0098\u0085\u008c\u0089\u0085\u0088\u0084\u008b\u008a\u0089\u0085\u0088\u0087\u0086\u009e\u0084\u0085\u0087\u0091\u009d\u009c\u009b", objArr3);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr3[0]).intern(), currentTimeMillis2);
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                java.util.concurrent.CountDownLatch m25456 = util.h.xy.bg.a.f944.m25456();
                if (m25456 != null) {
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 101) % 128;
                    if (!m25456.await(200L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        int i = getInputSizeshNQ4ISI + 69;
                        getHighSpeedVideoSizesFor = i % 128;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u0083\u0082\u008f\u008c\u0089¢\u008f\u008c\u0084\u009b\u0083\u0082\u008f\u008c\u0089¢\u008f\u008c\u0089\u0081\u0088\u0082¡\u008c\u008f\u0089 \u008b\u008a\u0089\u0085\u0088\u0087\u0086\u009e\u0084\u0085\u0087\u0091\u009d\u009c\u009b", objArr4);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr4[0]).intern(), currentTimeMillis3);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u008a\u0089\u0085\u0088\u0087\u0086\u009e\u0084\u0085\u0087\u0091\u009d\u009c\u009b", objArr5);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr5[0]).intern(), currentTimeMillis3);
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
            intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue();
            scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
            int i2 = getHighSpeedVideoSizesFor + 35;
            getInputSizeshNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
        util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f981, new util.h.xy.bk.ra(java.lang.Boolean.TRUE));
        currentTimeMillis = java.lang.System.currentTimeMillis();
        util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f978, new util.h.xy.bk.ra(util.h.xy.u.a.f2431.m27487(z, this.isOutputSupportedFor)));
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 79) % 128;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        int i;
        int i2 = getInputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f978);
            throw null;
        }
        util.h.xy.bk.ra m25506 = util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f978);
        if (z) {
            if (m25506.m25508().m27528() == util.h.xy.aa.d.f65) {
                if (this.getOutputMinFrameDurationlomOqCM != util.h.xy.bt.ra.a.f1043) {
                    if (this.getOutputMinFrameDurationlomOqCM != util.h.xy.bt.ra.a.f1045) {
                        util.h.xy.f.b.f2201.m26754(false);
                        Camera2StreamConfigurationMap(true, true);
                        util.h.xy.al.a.m25002(false);
                        util.h.xy.bf.mb.f938.m25426().m25394(true);
                        util.h.xy.bf.mb.f938.m25426().m25400();
                    } else if (util.h.xy.al.a.m25001()) {
                        Camera2StreamConfigurationMap(false, false);
                    } else {
                        Camera2StreamConfigurationMap(true, util.h.xy.bf.mc.m25433());
                    }
                }
                if (util.h.xy.al.a.m25001()) {
                    return;
                }
                if (this.getOutputMinFrameDurationlomOqCM != util.h.xy.bt.ra.a.f1043) {
                    Camera2StreamConfigurationMap();
                    return;
                }
                int i3 = getHighSpeedVideoSizesFor + 85;
                getInputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    getInputSizeshNQ4ISI();
                    return;
                } else {
                    getInputSizeshNQ4ISI();
                    throw new java.lang.ArithmeticException();
                }
            }
            if (m25506.m25508().m27528() != util.h.xy.aa.d.f62) {
                getHighResolutionOutputSizeshNQ4ISI(true, m25506);
                return;
            }
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 85) % 128;
            if (this.getOutputMinFrameDurationlomOqCM != util.h.xy.bt.ra.a.f1043 && this.getOutputMinFrameDurationlomOqCM == util.h.xy.bt.ra.a.f1045) {
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 39) % 128;
                Camera2StreamConfigurationMap(false, false);
            }
            if (this.getOutputMinFrameDurationlomOqCM != util.h.xy.bt.ra.a.f1044) {
                return;
            }
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 11) % 128;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 5) % 128;
            try {
                long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(23 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
                getHighResolutionOutputSizeshNQ4ISI(7, ((java.lang.String) objArr[0]).intern(), null);
                i = getInputSizeshNQ4ISI + 83;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else if (m25506.m25508().m27528() != util.h.xy.aa.d.f65) {
            getHighResolutionOutputSizeshNQ4ISI(false, m25506);
            return;
        } else if (this.getOutputMinFrameDurationlomOqCM != util.h.xy.bt.ra.a.f1043) {
            Camera2StreamConfigurationMap();
            return;
        } else {
            getInputSizeshNQ4ISI();
            i = getInputSizeshNQ4ISI + 115;
        }
        getHighSpeedVideoSizesFor = i % 128;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z, util.h.xy.bk.ra<util.h.xy.u.ma> raVar) {
        java.lang.String intern;
        java.lang.String intern2;
        int i = getHighSpeedVideoSizesFor + 55;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            if ((raVar.m25508().m27530() != null && raVar.m25508().m27528() == util.h.xy.aa.d.f64) || raVar.m25508().m27528() == util.h.xy.aa.d.f66) {
                if (z) {
                    int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(147 - indexOf, (edgeSlop >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                    intern2 = ((java.lang.String) objArr[0]).intern();
                } else {
                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(indexOf2 + 106, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 338, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23086), objArr2);
                    intern2 = ((java.lang.String) objArr2[0]).intern();
                }
                getHighResolutionOutputSizeshNQ4ISI(4, intern2, null);
                return;
            }
            if (raVar.m25508().m27530() != null) {
                intern = raVar.m25508().m27530();
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 55) % 128;
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u0083\u0082\u008f\u008c\u0089\u0088\u0085\u008e\u0082\u0094\u008c\u0083\u0085\u0098\u0097\u0089\u008e\u0094\u008c\u0088\u0082¤\u009b\u0094£\u008a\u0085\u0088\u0088\u009a\u0084\u0084\u0082\u0094\u0088\u0082\u0088\u0088\u0085\u0094\u0083 \u0082\u0083\u009e\u0083\u0099", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
            }
            getHighResolutionOutputSizeshNQ4ISI(6, intern, null);
            return;
        }
        raVar.m25508().m27530();
        throw new java.lang.ArithmeticException();
    }

    private void getInputSizeshNQ4ISI() {
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bt.ra.5
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static char[] getInputFormats = {64353, 64352, 64374, 64355, 64351, 64321, 64338, 64342, 64339};
            private static int getOutputFormats = -1074857033;
            private static boolean getHighResolutionOutputSizeshNQ4ISI = true;
            private static boolean getInputSizeshNQ4ISI = true;

            private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 75) % 128;
                byte[] bytes = str.getBytes("ISO-8859-1");
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 37) % 128;
                byte[] bArr = bytes;
                util.h.xz.b.md mdVar = new util.h.xz.b.md();
                char[] cArr = getInputFormats;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                    }
                    cArr = cArr2;
                }
                int i3 = (int) ((-3299939579226817547L) ^ getOutputFormats);
                if (!getInputSizeshNQ4ISI) {
                    if (!getHighResolutionOutputSizeshNQ4ISI) {
                        throw null;
                    }
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 117) % 128;
                    throw null;
                }
                mdVar.f2642 = bArr.length;
                char[] cArr3 = new char[mdVar.f2642];
                mdVar.f2643 = 0;
                while (mdVar.f2643 < mdVar.f2642) {
                    cArr3[mdVar.f2643] = (char) (cArr[bArr[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                    mdVar.f2643++;
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                long currentTimeMillis;
                java.lang.Object obj;
                int i = getHighSpeedVideoSizesFor + 101;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    util.h.xy.bt.ra.getHighSpeedVideoFpsRangesFor();
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    util.h.xy.bt.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bt.ra.this);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(1 << android.text.TextUtils.indexOf("", "", 0), "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                    obj = objArr[0];
                } else {
                    util.h.xy.bt.ra.getHighSpeedVideoFpsRangesFor();
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    util.h.xy.bt.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bt.ra.this);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 127, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                    obj = objArr2[0];
                }
                util.h.xy.bh.mb.m25480(((java.lang.String) obj).intern(), currentTimeMillis);
                util.h.xy.bt.ra.getHighSpeedVideoFpsRangesFor();
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 29) % 128;
            }
        }).start();
        int i = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void Camera2StreamConfigurationMap() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        try {
            util.h.xy.u.ma maVar = (util.h.xy.u.ma) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f978).m25508();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                if (util.h.xy.bg.a.f944.m25458().await(200L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    util.h.xy.bt.ra.mb m25630 = util.h.xy.bt.ra.EnumC0264ra.f1049.m25630();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0085\u0084\u0083\u0082\u0081\u0088\u0082¡\u008c\u008f\u0089 \u008b\u008a\u0089\u0085\u0088\u0087\u0086\u009b\u009d\u009f", objArr);
                    util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
                    if (util.h.xy.bt.ra.mb.f1047 != m25630) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0085\u0084\u0083\u0082\u0081\u008b\u0085¦¤\u0089¦\u008f\u0089¢\u0089\u0083\u009a\u0094\u0090\u008f\u0094\u008c\u0083\u0085\u0098\u0097\u0089\u008e\u0094\u0088\u0082\u0096\u0094\u008a\u0085\u008a\u0085\u0085\u0083\u0094\u0089\u008c\u0089¥", objArr2);
                        getHighResolutionOutputSizeshNQ4ISI(1, ((java.lang.String) objArr2[0]).intern(), null);
                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 87) % 128;
                        return;
                    }
                    if (util.h.xy.bk.ma.m25504() == null || util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f972) == null) {
                        arrayList = null;
                        arrayList2 = null;
                    } else {
                        arrayList = (java.util.ArrayList) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f972).m25508();
                        if (this.isOutputSupportedFor == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                            int i = getInputSizeshNQ4ISI + 67;
                            getHighSpeedVideoSizesFor = i % 128;
                            if (i % 2 == 0) {
                                throw null;
                            }
                            if (this.getOutputSizeshNQ4ISI && util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f974) != null) {
                                arrayList2 = (java.util.ArrayList) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f974).m25508();
                                int i2 = getHighSpeedVideoSizesFor + 9;
                                getInputSizeshNQ4ISI = i2 % 128;
                                int i3 = i2 % 2;
                            }
                        }
                        arrayList2 = null;
                    }
                    if (arrayList == null) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0085\u0084\u0083\u0082\u0081\u008b\u0085¦¤\u0089¦\u008f\u0089¢\u0089\u0083\u009a\u0094\u0090\u008f\u0094\u008c\u0083\u0085\u0098\u0097\u0089\u008e\u0094\u0088\u0082\u0096\u0094\u008a\u0085\u008a\u0085\u0085\u0083\u0094\u0089\u008c\u0089¥", objArr3);
                        getHighResolutionOutputSizeshNQ4ISI(1, ((java.lang.String) objArr3[0]).intern(), null);
                        return;
                    }
                    byte[] bArr = new byte[arrayList.size()];
                    java.util.Iterator it = arrayList.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 119) % 128;
                        bArr[i4] = ((java.lang.Byte) it.next()).byteValue();
                        i4++;
                    }
                    byte[] bArr2 = new byte[0];
                    if (this.getOutputSizeshNQ4ISI) {
                        bArr2 = new byte[arrayList2.size()];
                        java.util.Iterator it2 = arrayList2.iterator();
                        int i5 = 0;
                        while (it2.hasNext()) {
                            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 49) % 128;
                            bArr2[i5] = ((java.lang.Byte) it2.next()).byteValue();
                            i5++;
                        }
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    try {
                        if (this.getOutputSizeshNQ4ISI) {
                            util.h.xy.u.a.f2431.m27483(bArr2, maVar, true);
                        }
                        util.h.xy.u.a.f2431.m27483(bArr, maVar, false);
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 49) % 128;
                    } catch (util.h.xy.ab.a unused) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(27 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 443 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (30778 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr4);
                        getHighResolutionOutputSizeshNQ4ISI(6, ((java.lang.String) objArr4[0]).intern(), null);
                    }
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0085\u0088\u009a\u008c\u0089\u0083\u0095\u008f\u009d\u009b\u009d\u009f\u008a\u0083\u0085\u009d\u008a\u0083\u009b\u0085\u008c\u009a\u008e\u0098\u0082\u0084\u008b\u008a\u0089\u0085\u0088\u0087\u0086\u009b\u009d\u009f", objArr5);
                    util.h.xy.bh.mb.m25480(((java.lang.String) objArr5[0]).intern(), currentTimeMillis2);
                }
            } catch (java.lang.InterruptedException unused2) {
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
            getHighResolutionOutputSizeshNQ4ISI(1, th.getMessage(), th);
        }
    }

    private static boolean getOutputFormats() {
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m25516 = util.h.xy.bm.ma.f984.m25516();
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        if (m25516 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
            if (m25516 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport m24533 = util.h.xy.aa.rb.m24533(m24558);
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.graphics.Color.rgb(0, 0, 0) + 16777343, "\u008c\u0088\u0082\u008e\u008e\u009a\u009d\u0093\u0092\u0091\u008a\u0088\u0089\u009a\u0095\u0097\u0085\u009c\u0085\u0084\u008f¢\u0085¥\u009e\u0084\u0085\u0087\u0084\u008b\u0085\u008c\u0089\u0084\u008f\u008c\u0083\u0085\u0087\u008c\u009a\u009b\u0083\u0089\u0084", objArr);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
                return m24533 == com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SUPPORTED;
            }
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 75) % 128;
        } else {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 85) % 128;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24535 = util.h.xy.aa.rb.m24535(m24558);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u008c\u0088\u0082\u008e\u008e\u009a\u009d\u0093\u0092\u0091\u008c\u0083\u008f\u0088\u008e\u0088\u0085\u0095\u0083\u008f¡\u0082\u008f§\u009e\u0084\u0085\u0087\u0084\u008b\u0085\u008c\u0089\u0084\u008f\u008c\u0083\u0085\u0087\u008c\u009a\u009b\u0083\u0089\u0084", objArr2);
            util.h.xy.bh.mb.m25480(((java.lang.String) objArr2[0]).intern(), currentTimeMillis2);
            if (m24535 != com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED) {
                return false;
            }
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 45) % 128;
        }
        return true;
    }

    private boolean Camera2StreamConfigurationMap(boolean z, boolean z2) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 125) % 128;
        boolean m26785 = util.h.xy.f.b.f2201.m26785(z, z2, this.getOutputSizeshNQ4ISI);
        int i = getHighSpeedVideoSizesFor + 113;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m26785;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: util.h.xy.bt.ra$ra, reason: collision with other inner class name */
    public static final class EnumC0264ra {
        private static int Camera2StreamConfigurationMap = 1;
        private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static final /* synthetic */ util.h.xy.bt.ra.EnumC0264ra[] getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static final java.lang.String getHighSpeedVideoSizesFor;
        private static int getInputFormats;
        private static boolean getInputSizeshNQ4ISI;
        private static int getOutputFormats;
        private static char[] getOutputMinFrameDuration;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.bt.ra.EnumC0264ra f1049;

        private EnumC0264ra(java.lang.String str) {
        }

        public static util.h.xy.bt.ra.EnumC0264ra valueOf(java.lang.String str) {
            int i = getHighSpeedVideoFpsRanges + 97;
            getInputFormats = i % 128;
            util.h.xy.bt.ra.EnumC0264ra enumC0264ra = (util.h.xy.bt.ra.EnumC0264ra) java.lang.Enum.valueOf(util.h.xy.bt.ra.EnumC0264ra.class, str);
            if (i % 2 == 0) {
                return enumC0264ra;
            }
            throw new java.lang.ArithmeticException();
        }

        public static util.h.xy.bt.ra.EnumC0264ra[] values() {
            int i = getInputFormats + 51;
            getHighSpeedVideoFpsRanges = i % 128;
            util.h.xy.bt.ra.EnumC0264ra[] enumC0264raArr = getHighSpeedVideoFpsRangesFor;
            if (i % 2 != 0) {
                return (util.h.xy.bt.ra.EnumC0264ra[]) enumC0264raArr.clone();
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            Camera2StreamConfigurationMap();
            try {
                int i = 128 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1));
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 67) % 128;
                byte[] bytes = "\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
                util.h.xz.b.md mdVar = new util.h.xz.b.md();
                char[] cArr = getOutputMinFrameDuration;
                int i2 = 0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                    }
                    cArr = cArr2;
                }
                int i4 = (int) ((-3299939579226817547L) ^ getOutputFormats);
                if (!getHighResolutionOutputSizeshNQ4ISI) {
                    if (!getInputSizeshNQ4ISI) {
                        throw null;
                    }
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 83) % 128;
                    throw null;
                }
                mdVar.f2642 = bytes.length;
                char[] cArr3 = new char[mdVar.f2642];
                while (true) {
                    mdVar.f2643 = i2;
                    if (mdVar.f2643 >= mdVar.f2642) {
                        util.h.xy.bt.ra.EnumC0264ra enumC0264ra = new util.h.xy.bt.ra.EnumC0264ra(new java.lang.String(cArr3).intern());
                        f1049 = enumC0264ra;
                        int i5 = (getHighSpeedVideoFpsRanges + 93) % 128;
                        getInputFormats = i5;
                        getHighSpeedVideoFpsRanges = (i5 + 105) % 128;
                        getHighSpeedVideoFpsRangesFor = new util.h.xy.bt.ra.EnumC0264ra[]{enumC0264ra};
                        getHighSpeedVideoSizesFor = util.h.xy.bt.ra.EnumC0264ra.class.getSimpleName();
                        return;
                    }
                    int i6 = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    Camera2StreamConfigurationMap = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr3[mdVar.f2643] = (char) (cArr[bytes[mdVar.f2642 - mdVar.f2643] + i] >> i4);
                        i2 = mdVar.f2643 >> 1;
                    } else {
                        cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
                        i2 = mdVar.f2643 + 1;
                    }
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final void m25629(util.h.xy.bt.ra.mb mbVar) {
            util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f971, new util.h.xy.bk.ra(mbVar));
            getHighSpeedVideoFpsRanges = (getInputFormats + 111) % 128;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final util.h.xy.bt.ra.mb m25630() {
            int i = getInputFormats + 119;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                return (util.h.xy.bt.ra.mb) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f971).m25508();
            }
            throw null;
        }

        static void Camera2StreamConfigurationMap() {
            getOutputMinFrameDuration = new char[]{64173, 64168, 64151, 64150, 64165, 64167, 64161};
            getOutputFormats = -1074857222;
            getInputSizeshNQ4ISI = true;
            getHighResolutionOutputSizeshNQ4ISI = true;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Throwable th) {
        int i2 = (getHighSpeedVideoSizesFor + 125) % 128;
        getInputSizeshNQ4ISI = i2;
        util.h.xy.bt.a aVar = this.getOutputStallDuration;
        if (aVar != null) {
            getHighSpeedVideoSizesFor = (i2 + 83) % 128;
            aVar.mo25464(i, str, th);
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = new char[]{40000, 37760, 33767, 45863, 41745, 54140, 49813, 62163, 58088, 4668, 529, 12713, 8633, 20989, 16669, 29002, 24927, 37007, 32989, 45281, 41008, 53355, 51079, 63395, 59371, 5897, 1871, 14179, 9906, 22210, 17963, 30246, 26195, 38293, 34210, 46582, 40000, 37760, 33767, 45863, 41745, 54140, 49813, 62163, 58088, 4668, 529, 12731, 8622, 20968, 16646, 29000, 24944, 37012, 32986, 45293, 41019, 53364, 51077, 63401, 59386, 5901, 1864, 14201, 9959, 22239, 17931, 30255, 26195, 38276, 34178, 46553, 42294, 54624, 50543, 62628, 58572, 5145, 1071, 40015, 37823, 33741, 45841, 41760, 54080, 49807, 62148, 58092, 4665, 591, 51284, 51087, 55268, 59173, 63289, 34661, 38544, 42697, 46793, 17956, 22093, 25995, 30136, 1516, 5441, 9547, 13678, 50311, 54516, 58623, 62502, 33886, 37762, 41894, 46072, 17166, 21322, 25421, 29373, 729, 4639, 8751, 12870, 49575, 53695, 57827, 61714, 33099, 37238, 41136, 40003, 37817, 33740, 45855, 41760, 54112, 49813, 62175, 58090, 4728, 580, 12680, 8685, 20984, 16650, 29000, 24952, 36995, 32982, 45218, 41017, 53323, 51092, 63405, 59321, 5894, 1876, 14206, 9981, 22223, 17936, 30240, 26183, 38297, 34212, 46567, 42263, 54609, 50531, 40020, 37795, 33734, 45824, 41829, 54138, 49800, 62146, 58025, 4665, 606, 12686, 8613, 20985, 16641, 29002, 24952, 36995, 32978, 45302, 41008, 53312, 40021, 37816, 33734, 45906, 41766, 54133, 49813, 62162, 58106, 4728, 579, 12699, 8635, 20985, 16719, 29020, 24948, 36997, 32989, 45218, 40994, 53325, 51079, 63395, 59389, 5960, 1885, 14181, 9903, 22156, 17932, 30251, 26178, 38277, 34225, 46587, 42257, 54605, 50471, 62628, 58572, 5145, 1080, 13429, 11139, 23503, 19361, 31614, 27508, 39785, 35495, 47818, 43536, 55862, 51767, 63890, 59857, 6637, 2345, 14671, 10461, 22701, 18669, 30731, 26721, 39038, 36748, 49042, 45032, 57147, 53077, 65171, 61161, 7934, 3586, 15956, 11882, 23993, 19933, 32014, 27939, 40265, 35997, 48310, 44213, 56321, 52313, 64628, 62390, 58308, 4887, 815, 13177, 8908, 21206, 17120, 29249, 25156, 37483, 33207, 45445, 41232, 53538, 49504, 61568, 57563, 4334, io.ktor.util.date.GMTDateParser.ZONE, 12354, 10126, 22511, 18423, 30469, 26464, 38779, 34435, 46790, 42660, 54837, 50755, 62876, 58790, 5563, 1306, 13656, 9598, 21682, 17615, 29935, 25653, 37965, 35718, 48041, 44013, 56135, 52063, 64359, 60078, 6858, 2582, 14884, 10872, 22926, 18890, 31220, 26884, 39197, 50810, 51607, 55785, 59773, 63753, 35162, 39098, 43261, 47317, 18519, 22636, 27572, 31636, 3030, 7008, 11123, 15195, 51882, 56050, 60045, 64013, 35426, 40360, 44428, 48594, 19815, 23922, 27978, 31872, 3235, 7203, 11268, 15469, 53162, 57246, 61396, 65342, 36706, 40712, 44683, 48867, 20022, 24087, 28250, 29100, 480, 4494, 8529, 12635, 49478, 53384, 57573, 61503, 32793, 36888, 41858, 46067, 17374, 21255, 25457, 29373, 657, 4821, 8801, 12827, 49745, 54718, 58872, 62921, 34068, 38270, 42172, 46228, 17622, 21542, 25721, 29767, 2003, 6127, 10019, 14174, 51071, 54969, 59039, 63191, 34346, 38518, 42572, 43416, 47603, 18744, 22812, 26898, 30890, 2302, 6359, 10287, 14451, 51269, 56217, 60395, 64303, 35597, 39773, 43752, 58472, 60344, 64473, 52073, 56109, 43846, 47803, 35555, 39635, 27159, 31333, 18867, 22931, 10631, 14650, 2410, 6494, 59643, 63727, 51420, 55296, 43130, 49086, 36764, 40918, 28470, 32612};
        getHighResolutionOutputSizeshNQ4ISI = 2668126113636979664L;
        getOutputStallDurationlomOqCM = new char[]{64268, 64239, 64236, 64251, 64229, 64266, 64230, 64232, 64249, 64250, 64272, 64234, 64271, 64238, 64225, 64235, 64283, 64244, 64269, 64318, 64231, 64228, 64209, 64237, 64245, 64213, 64281, 64259, 64267, 64227, 64264, 64215, 64260, 64212, 64300, 64248, 64282, 64226, 64280};
        getHighSpeedVideoFpsRanges = -1074857122;
        getInputFormats = true;
        getHighSpeedVideoSizes = true;
    }
}
