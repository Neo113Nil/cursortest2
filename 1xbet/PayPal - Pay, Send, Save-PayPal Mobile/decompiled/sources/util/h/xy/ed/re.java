package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class re {
    private static int getInputFormats = 0;
    private static int getOutputStallDurationlomOqCM = 1;
    private static int isOutputSupportedForhNQ4ISI = 1;
    private static int unwrapAs;
    util.h.xy.dw.b Camera2StreamConfigurationMap;
    util.h.xy.dh.ag getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.ag(true, 0, new util.h.xy.dh.f(2));
    util.h.xy.ed.rb getHighSpeedVideoFpsRanges;
    util.h.xy.dw.b getHighSpeedVideoFpsRangesFor;
    util.h.xy.ed.rb getHighSpeedVideoSizes;
    util.h.xy.ed.mc getHighSpeedVideoSizesFor;
    util.h.xy.ed.ra getInputSizeshNQ4ISI;
    util.h.xy.dh.f getOutputFormats;
    util.h.xy.ed.a getOutputMinFrameDuration;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private util.h.xy.dh.rw isOutputSupportedFor;
    private util.h.xy.dh.rw toString;
    private static char[] getOutputStallDuration = {64148, 64151, 64146, 64230, 64161, 64170, 64149, 64162, 64144, 64153, 64172, 64169, 64173, 64147, 64188, 64211, 64178, 64192, 64179, 64163, 64175};
    private static int getOutputSizeshNQ4ISI = -1074857210;
    private static boolean getOutputSizes = true;
    private static boolean getOutputMinFrameDurationlomOqCM = true;

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        getInputFormats = (getOutputStallDurationlomOqCM + 103) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputStallDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getOutputSizeshNQ4ISI);
        if (!getOutputMinFrameDurationlomOqCM) {
            if (!getOutputSizes) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getOutputStallDurationlomOqCM = (getInputFormats + 53) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ed.d m26524() {
        if (this.getOutputFormats != null && this.getOutputMinFrameDuration != null) {
            int i = isOutputSupportedForhNQ4ISI;
            unwrapAs = (i + 91) % 128;
            if (this.Camera2StreamConfigurationMap != null) {
                int i2 = i + 117;
                unwrapAs = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (this.getHighSpeedVideoFpsRanges != null && this.getHighSpeedVideoSizes != null && ((this.getHighSpeedVideoFpsRangesFor != null || this.getValidOutputFormatsForInputhNQ4ISI) && this.getHighSpeedVideoSizesFor != null)) {
                    util.h.xy.dh.d dVar = new util.h.xy.dh.d(10);
                    dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
                    dVar.m26290(this.getOutputFormats);
                    dVar.m26290(this.getOutputMinFrameDuration);
                    dVar.m26290(this.Camera2StreamConfigurationMap);
                    util.h.xy.dh.d dVar2 = new util.h.xy.dh.d(2);
                    dVar2.m26290(this.getHighSpeedVideoFpsRanges);
                    dVar2.m26290(this.getHighSpeedVideoSizes);
                    dVar.m26290(new util.h.xy.dh.aa(dVar2));
                    util.h.xy.dw.b bVar = this.getHighSpeedVideoFpsRangesFor;
                    if (bVar != null) {
                        dVar.m26290(bVar);
                        isOutputSupportedForhNQ4ISI = (unwrapAs + 71) % 128;
                    } else {
                        dVar.m26290(new util.h.xy.dh.aa());
                    }
                    dVar.m26290(this.getHighSpeedVideoSizesFor);
                    util.h.xy.dh.rw rwVar = this.isOutputSupportedFor;
                    if (rwVar != null) {
                        dVar.m26290(new util.h.xy.dh.ag(false, 1, rwVar));
                    }
                    util.h.xy.dh.rw rwVar2 = this.toString;
                    if (rwVar2 != null) {
                        dVar.m26290(new util.h.xy.dh.ag(false, 2, rwVar2));
                    }
                    util.h.xy.ed.ra raVar = this.getInputSizeshNQ4ISI;
                    if (raVar != null) {
                        dVar.m26290(new util.h.xy.dh.ag(true, 3, raVar));
                    }
                    return util.h.xy.ed.d.m26502(new util.h.xy.dh.aa(dVar));
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - android.view.View.resolveSize(0, 0), "\u0089\u0082\u0083\u0085\u0089\u008d\u0081\u008d\u0095\u0084\u008d\u0083\u0085\u0094\u008c\u008b\u008c\u0083\u0089\u008d\u0094\u0093\u0092\u0091\u0084\u0090\u008f\u0084\u0081\u008c\u0084\u0083\u008d\u008e\u0084\u008e\u0088\u0086\u008d\u008c\u008b\u0084\u008a\u0089\u0082\u0083\u0085\u0088\u0081\u0085\u0087\u0084\u0086\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26525(util.h.xy.ed.ra raVar) {
        this.getInputSizeshNQ4ISI = raVar;
        if (raVar != null) {
            unwrapAs = (isOutputSupportedForhNQ4ISI + 17) % 128;
            util.h.xy.ed.ma m26517 = raVar.m26517(util.h.xy.ed.ma.f2093);
            if (m26517 != null) {
                int i = isOutputSupportedForhNQ4ISI + 5;
                unwrapAs = i % 128;
                boolean m26508 = m26517.m26508();
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (m26508) {
                    this.getValidOutputFormatsForInputhNQ4ISI = true;
                }
            }
        }
        int i2 = isOutputSupportedForhNQ4ISI + 47;
        unwrapAs = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26523(util.h.xy.ed.mc mcVar) {
        int i = unwrapAs;
        int i2 = i + 103;
        isOutputSupportedForhNQ4ISI = i2 % 128;
        this.getHighSpeedVideoSizesFor = mcVar;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        isOutputSupportedForhNQ4ISI = (i + 27) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26521(util.h.xy.dw.b bVar) {
        int i = isOutputSupportedForhNQ4ISI + 3;
        int i2 = i % 128;
        unwrapAs = i2;
        this.getHighSpeedVideoFpsRangesFor = bVar;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        isOutputSupportedForhNQ4ISI = (i2 + 25) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26526(util.h.xy.ed.rb rbVar) {
        int i = unwrapAs;
        isOutputSupportedForhNQ4ISI = (i + 13) % 128;
        this.getHighSpeedVideoSizes = rbVar;
        int i2 = i + 107;
        isOutputSupportedForhNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26528(util.h.xy.ed.rb rbVar) {
        int i = (unwrapAs + 117) % 128;
        isOutputSupportedForhNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = rbVar;
        int i2 = i + 83;
        unwrapAs = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26522(util.h.xy.dw.b bVar) {
        int i = (unwrapAs + 59) % 128;
        isOutputSupportedForhNQ4ISI = i;
        this.Camera2StreamConfigurationMap = bVar;
        int i2 = i + 93;
        unwrapAs = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26520(util.h.xy.ed.a aVar) {
        int i = (unwrapAs + 23) % 128;
        isOutputSupportedForhNQ4ISI = i;
        this.getOutputMinFrameDuration = aVar;
        int i2 = i + 51;
        unwrapAs = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26527(util.h.xy.dh.f fVar) {
        int i = unwrapAs + 109;
        int i2 = i % 128;
        isOutputSupportedForhNQ4ISI = i2;
        this.getOutputFormats = fVar;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        unwrapAs = (i2 + 7) % 128;
    }
}
