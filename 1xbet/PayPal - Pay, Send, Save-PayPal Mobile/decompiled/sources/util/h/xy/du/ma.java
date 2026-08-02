package util.h.xy.du;

/* loaded from: classes18.dex */
public final class ma extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats = 1;
    private static int getOutputSizeshNQ4ISI;
    util.h.xy.dh.rk Camera2StreamConfigurationMap;
    util.h.xy.ed.mc getHighSpeedVideoFpsRanges;
    util.h.xy.dh.f getHighSpeedVideoFpsRangesFor;
    util.h.xy.dw.b getHighSpeedVideoSizes;
    private static char[] getHighSpeedVideoSizesFor = {64395, 64362, 64337, 64421, 64356, 64361, 64360, 64363, 64353, 64343, 64348, 64355, 64364, 64352, 64342, 64390, 64358, 64375, 64340, 64336, 64396, 64354, 64427, 64365, 64373, 64338, 64359, 64339};
    private static int getOutputMinFrameDuration = -1074857019;
    private static boolean getOutputMinFrameDurationlomOqCM = true;
    private static boolean getInputFormats = true;

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
            int i2 = 0;
            while (i2 < length) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 11;
                getInputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr2[i2] = (char) (cArr[i2] | (-3299939579226817547L));
                } else {
                    cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                    i2++;
                }
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDuration);
        if (!getInputFormats) {
            if (!getOutputMinFrameDurationlomOqCM) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        while (true) {
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI + 111;
                getInputSizeshNQ4ISI = i5 % 128;
                if (i5 % 2 == 0) {
                    break;
                }
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) % mdVar.f2643] % i] / i4);
            int i6 = mdVar.f2643;
        }
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(4);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        dVar.m26290(this.getHighSpeedVideoSizes);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        if (this.Camera2StreamConfigurationMap != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 0, this.Camera2StreamConfigurationMap));
            getOutputSizeshNQ4ISI = (getOutputFormats + 85) % 128;
        }
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getOutputSizeshNQ4ISI + 83;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    public ma(util.h.xy.ed.e eVar, util.h.xy.ed.mc mcVar, util.h.xy.dh.rk rkVar) {
        this(util.h.xy.dw.b.m26430(eVar.mo26279()), mcVar, rkVar);
    }

    public ma(util.h.xy.dw.b bVar, util.h.xy.ed.mc mcVar, util.h.xy.dh.rk rkVar) {
        this.getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.f(0L);
        this.Camera2StreamConfigurationMap = null;
        if (bVar == null || mcVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0097\u008a\u0082\u0083\u0085\u008a\u008e\u0088\u008e\u0096\u0084\u0082\u008c\u0088\u0095\u0083\u008f\u008e\u0094\u0093\u008e\u0092\u0088\u0082\u008d\u0083\u0085\u0091\u008d\u008c\u008d\u0083\u008a\u008e\u0090\u0084\u0088\u008d\u0084\u0083\u008e\u008f\u0084\u008f\u0089\u0086\u008e\u008d\u008c\u0084\u008b\u008a\u0082\u0083\u0085\u0089\u0088\u0085\u0087\u0084\u0086\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (rkVar != null) {
            java.util.Enumeration m26344 = rkVar.m26344();
            while (m26344.hasMoreElements()) {
                getOutputSizeshNQ4ISI = (getOutputFormats + 71) % 128;
                util.h.xy.du.a m26415 = util.h.xy.du.a.m26415(m26344.nextElement());
                if (m26415.m26416().m26325(util.h.xy.du.ra.f1679) && m26415.m26417().m26342() != 1) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008e\u0094\u0086\u0085\u009c\u0084\u008e\u0088\u0082\u0084\u008e\u009c\u0085\u0098\u0084\u0083\u008f\u0094\u0087\u0084\u008e\u0083\u0094\u009b\u008d\u008a\u0083\u0083\u0085\u0084\u0089\u008a\u0082\u009a\u008f\u008f\u0085\u0099\u008e\u0096\u0088\u008e\u0086\u0086\u0085\u0098\u0091", objArr2);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                }
                getOutputSizeshNQ4ISI = (getOutputFormats + 119) % 128;
            }
        }
        this.getHighSpeedVideoSizes = bVar;
        this.getHighSpeedVideoFpsRanges = mcVar;
        this.Camera2StreamConfigurationMap = rkVar;
    }
}
