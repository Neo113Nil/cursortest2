package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class md extends util.h.xy.dh.mh implements util.h.xy.dh.mc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.c getHighSpeedVideoSizesFor;
    private static char[] getOutputFormats = {64394, 64360, 64351, 64406, 64325, 64425, 64336, 64348, 64345, 64349, 64362, 64320, 64342, 64382, 64347, 64350, 64368, 64341, 64340, 64343, 64370, 64327, 64387};
    private static int getHighSpeedVideoFpsRangesFor = -1074857015;
    private static boolean getInputFormats = true;
    private static boolean getInputSizeshNQ4ISI = true;

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        int i3 = Camera2StreamConfigurationMap;
        int i4 = i3 + 43;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRanges = (i3 + 23) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getOutputFormats;
        if (cArr2 != null) {
            int i5 = getHighSpeedVideoFpsRanges + 109;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = Camera2StreamConfigurationMap + 17;
                getHighSpeedVideoFpsRanges = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr[i2] = (char) (cArr2[i2] % (-3299939579226817547L));
                    i2 = 0;
                } else {
                    cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                    i2++;
                }
            }
            cArr2 = cArr;
        }
        int i7 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRangesFor);
        if (!getInputSizeshNQ4ISI) {
            if (!getInputFormats) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i7);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoSizes + 103;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoSizesFor.mo26279();
        if (i % 2 != 0) {
            return mo26279;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dj.md m26386(java.lang.Object obj) {
        if (obj == null || (obj instanceof util.h.xy.dj.md)) {
            util.h.xy.dj.md mdVar = (util.h.xy.dj.md) obj;
            int i = getHighResolutionOutputSizeshNQ4ISI + 37;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                return mdVar;
            }
            throw null;
        }
        if (!(obj instanceof util.h.xy.dj.rc)) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 119;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!(obj instanceof util.h.xy.dh.l)) {
                if (obj instanceof util.h.xy.dh.mm) {
                    util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) obj;
                    if (mmVar.m26330() == 0) {
                        return new util.h.xy.dj.md(util.h.xy.ed.c.m26500(mmVar, false));
                    }
                    if (mmVar.m26330() == 1) {
                        return new util.h.xy.dj.md(util.h.xy.dj.re.m26408(mmVar, false));
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0086\u0097\u008c\u0093\u0095\u008f\u008e\u008f\u0093\u0087\u0094\u0087\u0085\u0083\u0093\u0092\u0091\u008f\u0090\u0085\u0082\u0083\u0087\u008d\u0087\u008f\u008e\u0086\u0092\u0087\u008a\u0082\u0096\u0083\u0091", objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return new util.h.xy.dj.md(util.h.xy.dj.rc.m26400(obj));
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dj.md m26387(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getHighSpeedVideoSizes + 41;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (!z) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u008c\u0093\u0095\u008f\u008e\u008f\u0093\u0087\u0094\u0087\u0085\u0083\u0093\u0092\u0091\u008f\u0090\u0085\u0082\u0083\u0087\u008d\u0087\u008f\u008e\u0086\u008d\u0082\u0085\u0086\u008c\u008a\u0085\u0087\u008b\u0087\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dj.md m26386 = m26386(mmVar.m26329());
        int i2 = getHighSpeedVideoSizes + 57;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return m26386;
        }
        throw new java.lang.ArithmeticException();
    }

    public md(util.h.xy.dj.re reVar) {
        this.getHighSpeedVideoSizesFor = new util.h.xy.dh.ag(false, 1, reVar);
    }

    public md(util.h.xy.ed.c cVar) {
        this.getHighSpeedVideoSizesFor = new util.h.xy.dh.ag(false, 0, cVar);
    }

    public md(util.h.xy.dj.rc rcVar) {
        this.getHighSpeedVideoSizesFor = rcVar;
    }
}
