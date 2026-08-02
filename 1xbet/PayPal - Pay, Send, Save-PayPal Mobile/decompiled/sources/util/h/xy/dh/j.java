package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class j extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static char getOutputMinFrameDuration;
    final byte[] getHighSpeedVideoSizes;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRanges = new util.h.xy.dh.p(util.h.xy.dh.j.class) { // from class: util.h.xy.dh.j.1
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i ^ 95) + ((i & 95) << 1)) % 128;
                util.h.xy.dh.j highSpeedVideoSizes = util.h.xy.dh.j.getHighSpeedVideoSizes(mzVar.m26337());
                int i2 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = (((i2 | 25) << 1) - (i2 ^ 25)) % 128;
                return highSpeedVideoSizes;
            }
        };
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 71) % 128;
    }

    static util.h.xy.dh.j getHighSpeedVideoSizes(byte[] bArr) {
        util.h.xy.dh.rz rzVar = new util.h.xy.dh.rz(bArr);
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
        return rzVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m26301(java.lang.String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 83) % 128;
            char charAt = str.charAt(length);
            if (charAt > 127) {
                getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != ' ' && charAt != ':' && charAt != '=' && charAt != '?'))) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (charAt) {
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                return false;
                        }
                }
            }
        }
        return true;
    }

    public java.lang.String toString() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 37;
        getOutputFormats = i % 128;
        java.lang.String mo26276 = mo26276();
        if (i % 2 != 0) {
            return mo26276;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 99;
        getOutputFormats = i % 128;
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (i % 2 != 0) {
            return util.h.xy.fb.a.m26817(bArr);
        }
        util.h.xy.fb.a.m26817(bArr);
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getOutputFormats;
        int i2 = i + 73;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(miVar instanceof util.h.xy.dh.j)) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 49) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoSizes, ((util.h.xy.dh.j) miVar).getHighSpeedVideoSizes);
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 101;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            return m26820;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 49) % 128;
        rjVar.getHighSpeedVideoSizes(z, 19, this.getHighSpeedVideoSizes);
        int i = getOutputFormats + 27;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getOutputFormats + 75;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
            throw new java.lang.ArithmeticException();
        }
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 81) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getOutputFormats = (i + 11) % 128;
        getOutputFormats = (i + 23) % 128;
        return false;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoSizes);
        int i = getOutputFormats + 77;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m26855;
        }
        throw new java.lang.ArithmeticException();
    }

    j(byte[] bArr, boolean z) {
        this.getHighSpeedVideoSizes = bArr;
    }

    j(java.lang.String str, boolean z) {
        if (!z || m26301(str)) {
            this.getHighSpeedVideoSizes = util.h.xy.fb.rd.m26856(str);
            return;
        }
        char c = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        java.lang.Object[] objArr = new java.lang.Object[1];
        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
        int i = getHighSpeedVideoFpsRangesFor + 107;
        Camera2StreamConfigurationMap = i % 128;
        int i2 = 2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray2 = "䒒飨쮻낸".toCharArray();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 57) % 128;
        char[] charArray3 = "쉊룅䊐抨℁Ơ䜃㧻岊옿칇볼췝䱠宄鷌ᏽ둯Ⱶ哲\ueaf3\uf3da\uefa3⪹ۄ騤⸓▃스ᷞ೮焢쿂懰".toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (c ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) scrollDefaultDelay));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 115) % 128;
            int i3 = (rcVar.f2652 + i2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getInputFormats ^ 2457411417541981002L))) ^ ((char) (getOutputMinFrameDuration ^ 2457411417541981002L)));
            rcVar.f2652++;
            i2 = 2;
        }
        objArr[0] = new java.lang.String(cArr3);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = 2457411417541981002L;
        getInputSizeshNQ4ISI = 294925130;
        getOutputMinFrameDuration = (char) 19652;
    }
}
