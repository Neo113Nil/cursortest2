package util.h.xy.ck;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final /* synthetic */ util.h.xy.ck.ra[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getOutputMinFrameDuration = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.ck.ra f1116;
    private java.util.Map<java.lang.String, java.lang.String> getOutputFormats = new java.util.HashMap();
    private final util.h.xy.cq.c getInputFormats = new util.h.xy.cq.c();

    public static util.h.xy.ck.ra valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 77;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ck.ra raVar = (util.h.xy.ck.ra) java.lang.Enum.valueOf(util.h.xy.ck.ra.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = getOutputMinFrameDuration + 3;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.ck.ra[] values() {
        int i = getOutputMinFrameDuration + 97;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ck.ra[] raVarArr = (util.h.xy.ck.ra[]) getHighSpeedVideoFpsRanges.clone();
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        return raVarArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        int i = 0;
        int[] iArr = {0, 8, 0, 2};
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 87;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 11;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001".getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                cArr2[i9] = (char) (cArr[i9] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bytes != null) {
            char[] cArr4 = new char[i6];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i6) {
                if (bytes[maVar.f2631] == 1) {
                    int i10 = getHighSpeedVideoFpsRangesFor + 115;
                    getHighSpeedVideoSizes = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = maVar.f2631;
                        char c2 = cArr3[maVar.f2631];
                        cArr4[i11] = (char) (0 / c);
                    } else {
                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    }
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 31) % 128;
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 69) % 128;
            char[] cArr5 = new char[i6];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i12);
        }
        char[] cArr6 = new char[i6];
        maVar.f2631 = 0;
        while (maVar.f2631 < i6) {
            int i13 = getHighSpeedVideoSizes + 117;
            getHighSpeedVideoFpsRangesFor = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = maVar.f2631;
                int i15 = maVar.f2631;
                throw new java.lang.ArithmeticException();
            }
            cArr6[maVar.f2631] = cArr3[(i6 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i7 > 0) {
            while (true) {
                maVar.f2631 = i;
                if (maVar.f2631 >= i6) {
                    break;
                }
                cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                i = maVar.f2631 + 1;
            }
        }
        util.h.xy.ck.ra raVar = new util.h.xy.ck.ra(new java.lang.String(cArr6).intern());
        f1116 = raVar;
        int i16 = getHighResolutionOutputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i16 + 19) % 128;
        util.h.xy.ck.ra[] raVarArr = {raVar};
        int i17 = i16 + 17;
        int i18 = i17 % 128;
        getOutputMinFrameDuration = i18;
        if (i17 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRanges = raVarArr;
        getHighResolutionOutputSizeshNQ4ISI = (i18 + 9) % 128;
    }

    private ra(java.lang.String str) {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25950() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 71;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            this.getInputFormats.m25997();
            int i2 = getOutputMinFrameDuration + 125;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getInputFormats.m25997();
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25948() throws util.h.xy.ck.rc {
        int i = getOutputMinFrameDuration + 109;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.getInputFormats.m26001();
            int i2 = getOutputMinFrameDuration + 19;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getInputFormats.m26001();
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.ck.b m25949() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 99;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ck.b m26002 = this.getInputFormats.m26002();
        if (i % 2 != 0) {
            return m26002;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ck.a m25952() {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        util.h.xy.ck.a m25998 = this.getInputFormats.m25998();
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 55) % 128;
        return m25998;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.ck.ma m25955() {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
        util.h.xy.ck.ma m25996 = this.getInputFormats.m25996();
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
        return m25996;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final util.h.xy.ck.mc m25954() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 37) % 128;
        util.h.xy.ck.mc m25995 = this.getInputFormats.m25995();
        int i = getOutputMinFrameDuration + 75;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m25995;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m25946() throws util.h.xy.ck.rc {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 79) % 128;
        boolean m25994 = this.getInputFormats.m25994();
        int i = getHighResolutionOutputSizeshNQ4ISI + 5;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return m25994;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final javax.net.ssl.HttpsURLConnection m25951(java.net.URL url) throws java.io.IOException, util.h.xy.ck.rc {
        int i = getOutputMinFrameDuration + 99;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.cq.c cVar = this.getInputFormats;
        if (i % 2 == 0) {
            return cVar.m25999(url);
        }
        cVar.m25999(url);
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final util.h.xy.ck.mb m25945() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 21) % 128;
        util.h.xy.ck.mb m26000 = this.getInputFormats.m26000();
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 99) % 128;
        return m26000;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25953(java.lang.String str, java.lang.String str2) throws util.h.xy.ci.ma {
        int i = getOutputMinFrameDuration + 33;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            if (this.getOutputFormats.containsKey(str)) {
                getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 63) % 128;
                this.getOutputFormats.remove(str);
            }
            this.getOutputFormats.put(str, str2);
            return;
        }
        this.getOutputFormats.containsKey(str);
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.String> m25947() {
        int i = getOutputMinFrameDuration + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return this.getOutputFormats;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m25956() throws util.h.xy.ck.rc {
        synchronized (this) {
            int i = getOutputMinFrameDuration + 31;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                m25950();
                m25948();
                this.getOutputFormats = null;
                int i2 = getOutputMinFrameDuration + 125;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.NullPointerException();
                }
            } else {
                m25950();
                m25948();
                this.getOutputFormats = null;
                throw null;
            }
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new char[]{42362, 42262, 42266, 42265, 42261, 42266, 42263, 42254};
    }
}
