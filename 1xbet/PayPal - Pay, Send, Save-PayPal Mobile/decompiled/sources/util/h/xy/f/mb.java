package util.h.xy.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static final /* synthetic */ util.h.xy.f.mb[] getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.f.mb f2209;
    private java.util.Map<java.lang.String, byte[]> getOutputStallDuration = new java.util.HashMap();
    private java.util.Map<java.lang.String, java.lang.String> getOutputSizeshNQ4ISI = new java.util.HashMap();

    private mb(java.lang.String str) {
    }

    public static util.h.xy.f.mb valueOf(java.lang.String str) {
        int i = getInputFormats + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.f.mb mbVar = (util.h.xy.f.mb) java.lang.Enum.valueOf(util.h.xy.f.mb.class, str);
        if (i % 2 == 0) {
            return mbVar;
        }
        throw null;
    }

    public static util.h.xy.f.mb[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 99;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.f.mb[] mbVarArr = (util.h.xy.f.mb[]) getOutputMinFrameDuration.clone();
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 89) % 128;
        return mbVarArr;
    }

    static {
        getHighSpeedVideoSizes();
        int i = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8;
        char[] charArray = "疁핳룥㗹\u12d7⸮誳곳".toCharArray();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
        char[] cArr = charArray;
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr2 = new char[cArr.length];
        eVar.f2630 = 0;
        char[] cArr3 = new char[2];
        while (eVar.f2630 < cArr.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 33) % 128;
            cArr3[0] = cArr[eVar.f2630];
            cArr3[1] = cArr[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr2[eVar.f2630] = cArr3[0];
            cArr2[eVar.f2630 + 1] = cArr3[1];
            eVar.f2630 += 2;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
        }
        java.lang.String str = new java.lang.String(cArr2, 0, i);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 83;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        util.h.xy.f.mb mbVar = new util.h.xy.f.mb(str.intern());
        f2209 = mbVar;
        int i5 = (getInputFormats + 21) % 128;
        getHighSpeedVideoFpsRangesFor = i5;
        getInputFormats = (i5 + 55) % 128;
        getOutputMinFrameDuration = new util.h.xy.f.mb[]{mbVar};
        getInputSizeshNQ4ISI = util.h.xy.f.mb.class.getName();
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 69) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26789(java.lang.String str) {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 55) % 128;
        byte[] bArr = this.getOutputStallDuration.get(str);
        if (bArr != null) {
            int i = (getHighSpeedVideoFpsRangesFor + 105) % 128;
            getInputFormats = i;
            if (bArr.length > 0) {
                int i2 = i + 121;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ar.b.m25074(bArr);
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.ar.b.m25074(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26791(java.lang.String str, byte[] bArr) {
        int i = (getInputFormats + 121) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        if (bArr != null) {
            int i2 = (i + 3) % 128;
            getInputFormats = i2;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRangesFor = (i2 + 79) % 128;
                util.h.xy.ar.b.m25074(bArr);
            }
        }
        this.getOutputStallDuration.put(str, bArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m26790(java.lang.String str) {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 125) % 128;
        java.lang.String str2 = this.getOutputSizeshNQ4ISI.get(str);
        int i = getHighSpeedVideoFpsRangesFor + 53;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26788(java.lang.String str, java.lang.String str2) {
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 91) % 128;
        this.getOutputSizeshNQ4ISI.put(str, str2);
        int i = getHighSpeedVideoFpsRangesFor + 117;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26792(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 61;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            this.getOutputStallDuration.remove(str);
            this.getOutputSizeshNQ4ISI.remove(str);
            int i2 = getInputFormats + 115;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputStallDuration.remove(str);
        this.getOutputSizeshNQ4ISI.remove(str);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26793() {
        int i = getInputFormats + 31;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            this.getOutputStallDuration.clear();
            this.getOutputSizeshNQ4ISI.clear();
        } else {
            this.getOutputStallDuration.clear();
            this.getOutputSizeshNQ4ISI.clear();
            throw null;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = (char) 15513;
        Camera2StreamConfigurationMap = (char) 52595;
        getHighSpeedVideoFpsRanges = (char) 62353;
        getOutputFormats = (char) 59048;
    }
}
