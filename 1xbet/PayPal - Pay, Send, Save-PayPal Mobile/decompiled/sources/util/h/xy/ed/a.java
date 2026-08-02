package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class a extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes = {42317, 42271, 42297, 42293, 42292, 42288, 42286, 42294, 42289, 42260, 42271, 42303, 42252, 42348, 42352, 42258, 42290, 42284, 42291};
    private util.h.xy.dh.c getHighSpeedVideoSizesFor;
    private util.h.xy.dh.i getOutputFormats;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getOutputFormats);
        util.h.xy.dh.c cVar = this.getHighSpeedVideoSizesFor;
        if (cVar != null) {
            int i = getHighSpeedVideoFpsRangesFor + 91;
            Camera2StreamConfigurationMap = i % 128;
            dVar.m26290(cVar);
            if (i % 2 != 0) {
                throw null;
            }
        }
        return new util.h.xy.dh.aa(dVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26493() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 43) % 128;
        util.h.xy.dh.c cVar = this.getHighSpeedVideoSizesFor;
        Camera2StreamConfigurationMap = (i + 45) % 128;
        return cVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.i m26494() {
        int i = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        Camera2StreamConfigurationMap = i;
        util.h.xy.dh.i iVar = this.getOutputFormats;
        getHighSpeedVideoFpsRangesFor = (i + 47) % 128;
        return iVar;
    }

    private a(util.h.xy.dh.l lVar) {
        int i;
        if (lVar.mo26286() > 0 && lVar.mo26286() <= 2) {
            this.getOutputFormats = util.h.xy.dh.i.m26297(lVar.mo26287(0));
            this.getHighSpeedVideoSizesFor = lVar.mo26286() == 2 ? lVar.mo26287(1) : null;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int[] iArr = {0, 19, 0, 13};
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
        byte[] bytes = "\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000".getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 73) % 128;
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 51) % 128;
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i7 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
        } else {
            i = 0;
        }
        char[] cArr6 = new char[i3];
        maVar.f2631 = i;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 105) % 128;
        while (maVar.f2631 < i3) {
            cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i4 > 0) {
            int i8 = 0;
            while (true) {
                maVar.f2631 = i8;
                if (maVar.f2631 >= i3) {
                    break;
                }
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 47;
                getHighSpeedVideoFpsRanges = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] << iArr[3]);
                    i8 = maVar.f2631;
                } else {
                    cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                    i8 = maVar.f2631 + 1;
                }
            }
        }
        objArr[0] = new java.lang.String(cArr6);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(lVar.mo26286());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public a(util.h.xy.dh.i iVar, util.h.xy.dh.c cVar) {
        this.getOutputFormats = iVar;
        this.getHighSpeedVideoSizesFor = cVar;
    }

    public a(util.h.xy.dh.i iVar) {
        this.getOutputFormats = iVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ed.a m26491(java.lang.Object obj) {
        int i = (Camera2StreamConfigurationMap + 5) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        if (!(obj instanceof util.h.xy.ed.a)) {
            if (obj != null) {
                return new util.h.xy.ed.a(util.h.xy.dh.l.m26303(obj));
            }
            return null;
        }
        int i2 = i + 61;
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ed.a aVar = (util.h.xy.ed.a) obj;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ed.a m26492(util.h.xy.dh.mm mmVar, boolean z) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 71) % 128;
        util.h.xy.ed.a m26491 = m26491(util.h.xy.dh.l.m26304(mmVar, z));
        int i = Camera2StreamConfigurationMap + 71;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return m26491;
        }
        throw null;
    }
}
