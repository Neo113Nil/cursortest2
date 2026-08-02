package util.h.xy.cw;

/* loaded from: classes5.dex */
public final class rb {
    private static char Camera2StreamConfigurationMap = 20717;
    private static char getHighResolutionOutputSizeshNQ4ISI = 25389;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 65449;
    private static int getInputFormats = 0;
    private static char getOutputMinFrameDuration = 21118;

    /* renamed from: util.h.xy.cw.rb$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[util.h.xy.da.ma.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[util.h.xy.da.ma.f1155.ordinal()] = 1;
                int i = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i ^ 69) + ((i & 69) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.da.ma.f1154.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.da.ma.f1156.ordinal()] = 3;
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 47;
                Camera2StreamConfigurationMap = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int i4 = Camera2StreamConfigurationMap;
            int i5 = (i4 ^ 95) + ((i4 & 95) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.da.ra m26096(util.h.xy.da.ma maVar, java.lang.String str) throws util.h.xy.da.b {
        int i = getInputFormats + 51;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (str != null && str.length() != 0) {
            int i2 = getInputFormats + 79;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (maVar != null) {
                int i3 = util.h.xy.cw.rb.AnonymousClass3.getHighSpeedVideoFpsRanges[maVar.ordinal()];
                if (i3 == 1) {
                    return new util.h.xy.cw.md(str);
                }
                if (i3 == 2) {
                    return new util.h.xy.cw.ra(str);
                }
                if (i3 != 3) {
                    int i4 = getHighSpeedVideoFpsRangesFor + 85;
                    getInputFormats = i4 % 128;
                    if (i4 % 2 == 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.cw.a aVar = new util.h.xy.cw.a(str);
                int i5 = getHighSpeedVideoFpsRangesFor + 35;
                getInputFormats = i5 % 128;
                if (i5 % 2 == 0) {
                    return aVar;
                }
                throw null;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("⏞䥽ꍰ\ue01f醝\uebd9㒌删왥萪㒌删䢃﵄\u2e62㽷Ꮀ贾週ᡑ焚\udcaf\ue2b6跴橵푰醝\uebd9䨎쾺灕믻唫骛ꎙ촢㐍\uf862㒌删⇰誮앇酪ɋ劋", 46 - android.graphics.Color.green(0), objArr);
        throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10310);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 83) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 89) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }
}
