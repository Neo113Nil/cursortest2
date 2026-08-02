package util.h.xy.c;

/* loaded from: classes5.dex */
public final class ma extends java.lang.RuntimeException {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char getHighSpeedVideoSizes = 0;
    private static long getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static char getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private int getOutputStallDurationlomOqCM;

    public ma() {
        this.getOutputStallDurationlomOqCM = 100;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ಂ\udff9挸橎ᯗ쟸\ue930ङ揟姑㏄\udee6뱿돝ਚ练齅눥", 17 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        this.getOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr[0]).intern()).intern();
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i = getInputFormats;
        int i2 = i + 11;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 5;
        }
        int i4 = getOutputMinFrameDuration + 109;
        getOutputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        getInputSizeshNQ4ISI = (i + 55) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] m25282 = util.h.xy.b.a.m25282(getHighSpeedVideoSizesFor, cArr);
        getOutputFormats = (getOutputMinFrameDuration + 27) % 128;
        int i5 = 4;
        while (i5 < m25282.length) {
            int i6 = getOutputMinFrameDuration + 93;
            getOutputFormats = i6 % 128;
            if (i6 % 2 == 0) {
                m25282[i5] = (char) ((m25282[i5] ^ m25282[i5 >>> 2]) & ((i5 << 5) ^ getHighSpeedVideoSizesFor));
                i5 += 14;
            } else {
                m25282[i5] = (char) ((m25282[i5] ^ m25282[i5 % 4]) ^ ((i5 - 4) * getHighSpeedVideoSizesFor));
                i5++;
            }
        }
        return new java.lang.String(m25282, 4, m25282.length - 4);
    }

    public ma(int i, java.lang.String str) {
        this.getOutputStallDurationlomOqCM = 100;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ಂ\udff9挸橎ᯗ쟸\ue930ङ揟姑㏄\udee6뱿돝ਚ练齅눥", 17 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr);
            getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr[0]).intern()).intern();
            this.getOutputStallDurationlomOqCM = i;
            this.getOutputSizeshNQ4ISI = str;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m25832() {
        int i;
        int i2 = (getInputSizeshNQ4ISI + 39) % 128;
        getInputFormats = i2;
        int i3 = i2 + 53;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = getOutputMinFrameDuration;
            int i5 = (i4 | 74) >> 1;
            int i6 = -(i4 ^ 74);
            i = ((i5 & i6) - (i6 | i5)) + 32606;
        } else {
            int i7 = getOutputMinFrameDuration;
            int i8 = (i7 | 93) << 1;
            int i9 = -(i7 ^ 93);
            i = ((i8 & i9) + (i9 | i8)) % 128;
        }
        getOutputFormats = i;
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        int i10 = i2 + 59;
        getInputSizeshNQ4ISI = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = getOutputMinFrameDuration;
            int i12 = (i11 & 91) % (i11 | 91);
            getOutputFormats = i12 - 18634;
            int i13 = i12 / 5;
        } else {
            int i14 = getOutputMinFrameDuration;
            getOutputFormats = ((i14 & 15) + (i14 | 15)) % 128;
        }
        return str;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 79;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
        char[] cArr = charArray;
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr2 = new char[cArr.length];
        eVar.f2630 = 0;
        char[] cArr3 = new char[2];
        while (eVar.f2630 < cArr.length) {
            cArr3[0] = cArr[eVar.f2630];
            cArr3[1] = cArr[eVar.f2630 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getOutputSizes ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr2[eVar.f2630] = cArr3[0];
            cArr2[eVar.f2630 + 1] = cArr3[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getOutputMinFrameDuration = 0;
        getOutputFormats = 1;
        getHighSpeedVideoSizesFor = 2500450181784712692L;
        int i = getInputFormats + 13;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizes = (char) 11777;
        getHighSpeedVideoFpsRanges = (char) 52442;
        getOutputSizes = (char) 21304;
        Camera2StreamConfigurationMap = (char) 7184;
    }
}
