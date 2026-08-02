package util.h.xy.bm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class ma {
    private static boolean Camera2StreamConfigurationMap = false;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static boolean getOutputFormats;
    private static final /* synthetic */ util.h.xy.bm.ma[] getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bm.ma f984;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.lang.String f985;

    private ma(java.lang.String str) {
    }

    public static util.h.xy.bm.ma valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 11;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.bm.ma maVar = (util.h.xy.bm.ma) java.lang.Enum.valueOf(util.h.xy.bm.ma.class, str);
        if (i % 2 != 0) {
            return maVar;
        }
        throw null;
    }

    public static util.h.xy.bm.ma[] values() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 31) % 128;
        util.h.xy.bm.ma[] maVarArr = (util.h.xy.bm.ma[]) getOutputMinFrameDuration.clone();
        int i = getHighSpeedVideoSizes + 85;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return maVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.bm.ma[] maVarArr;
        int length;
        char[] cArr;
        int i;
        getHighSpeedVideoSizes();
        int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0) + 127;
        int i2 = getHighSpeedVideoFpsRangesFor + 87;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bytes = "\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
            util.h.xz.b.md mdVar = new util.h.xz.b.md();
            char[] cArr2 = getInputFormats;
            if (cArr2 != null) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 7;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 0;
                }
                while (i < length) {
                    cArr[i] = (char) (cArr2[i] ^ (-3299939579226817547L));
                    i++;
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                }
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                cArr2 = cArr;
            }
            int i4 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
            if (getOutputFormats) {
                mdVar.f2642 = bytes.length;
                char[] cArr3 = new char[mdVar.f2642];
                mdVar.f2643 = 0;
                while (mdVar.f2643 < mdVar.f2642) {
                    cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + offsetAfter] - i4);
                    mdVar.f2643++;
                }
                util.h.xy.bm.ma maVar = new util.h.xy.bm.ma(new java.lang.String(cArr3).intern());
                f984 = maVar;
                int i5 = getHighSpeedVideoSizes + 7;
                int i6 = i5 % 128;
                getHighSpeedVideoFpsRanges = i6;
                if (i5 % 2 != 0) {
                    maVarArr = new util.h.xy.bm.ma[0];
                    maVarArr[0] = maVar;
                } else {
                    maVarArr = new util.h.xy.bm.ma[]{maVar};
                }
                getOutputMinFrameDuration = maVarArr;
                f985 = "ma";
                getHighSpeedVideoSizes = (i6 + 105) % 128;
                return;
            }
            if (Camera2StreamConfigurationMap) {
                throw null;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m25516() {
        int i = getHighSpeedVideoFpsRanges + 57;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            byte[] m24981 = util.h.xy.ak.ma.f84.m24981();
            if (m24981 != null && m24981.length > 0) {
                int length = m24981.length;
                return util.h.xy.ap.mb.m25037(m24981);
            }
            com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 31) % 128;
            return cHVerificationMethod;
        }
        util.h.xy.ak.ma.f84.m24981();
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.u.b m25517() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 51) % 128;
        util.h.xy.u.b bVar = util.h.xy.u.b.f2434;
        byte[] m24995 = util.h.xy.ak.ma.f84.m24995();
        if (m24995 != null && m24995.length > 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 85) % 128;
            byte b = m24995[0];
            if (b == 1) {
                bVar = util.h.xy.u.b.f2435;
            } else if (b == 2) {
                bVar = util.h.xy.u.b.f2432;
            } else if (b == 3) {
                bVar = util.h.xy.u.b.f2433;
            }
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 3) % 128;
        return bVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.d.b m25518(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 67;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            util.h.xy.k.b.m26923(str);
            throw null;
        }
        util.h.xy.d.b m26923 = util.h.xy.k.b.m26923(str);
        int i2 = getHighSpeedVideoFpsRanges + 121;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return m26923;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoSizes() {
        getInputFormats = new char[]{64299, 64278, 64285, 64284, 64291, 64301, 64303};
        getInputSizeshNQ4ISI = -1074857120;
        Camera2StreamConfigurationMap = true;
        getOutputFormats = true;
    }
}
