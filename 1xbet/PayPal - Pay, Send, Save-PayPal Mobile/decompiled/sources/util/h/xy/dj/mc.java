package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class mc extends util.h.xy.dh.mh {
    private static char[] Camera2StreamConfigurationMap = {42361, 42246, 42287, 42294, 42299, 42295, 42299, 42271, 42344, 42261, 42261, 42263, 42251, 42297, 42292, 42284, 42291, 42298, 42298, 42298, 42294, 42304, 42352, 42345, 42246, 42287, 42294, 42299, 42295, 42299, 42271, 42344, 42261, 42261, 42263, 42251, 42297, 42292, 42284, 42291, 42298, 42298, 42298, 42294};
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dj.f getHighSpeedVideoSizesFor;
    private util.h.xy.dh.rh getInputFormats;
    private util.h.xy.dh.me getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRanges + 11;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
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
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 109) % 128;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i7 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 49) % 128;
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(3);
        dVar.m26290(this.getInputFormats);
        util.h.xy.dh.me meVar = this.getOutputMinFrameDuration;
        if (meVar != null) {
            dVar.m26290(meVar);
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        }
        util.h.xy.dj.f fVar = this.getHighSpeedVideoSizesFor;
        if (fVar != null) {
            int i = getHighSpeedVideoSizes + 105;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            dVar.m26290(fVar);
            if (i % 2 == 0) {
                throw null;
            }
        }
        return new util.h.xy.dh.aa(dVar);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dh.rh m26385() {
        int i = (getHighSpeedVideoSizes + 45) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        util.h.xy.dh.rh rhVar = this.getInputFormats;
        getHighSpeedVideoSizes = (i + 1) % 128;
        return rhVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dj.mc m26384(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 85) % 128;
        if (obj != null) {
            int i2 = i + 11;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (!(obj instanceof util.h.xy.dj.mc)) {
                if (obj instanceof util.h.xy.dh.l) {
                    return new util.h.xy.dj.mc((util.h.xy.dh.l) obj);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{21, 23, 0, 2}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        util.h.xy.dj.mc mcVar = (util.h.xy.dj.mc) obj;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 7;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return mcVar;
        }
        throw null;
    }

    private mc(util.h.xy.dh.l lVar) {
        this.getInputFormats = (util.h.xy.dh.rh) lVar.mo26287(0);
        int mo26286 = lVar.mo26286();
        if (mo26286 != 1) {
            if (mo26286 != 2) {
                if (mo26286 == 3) {
                    this.getOutputMinFrameDuration = (util.h.xy.dh.me) lVar.mo26287(1);
                    this.getHighSpeedVideoSizesFor = util.h.xy.dj.f.m26372(lVar.mo26287(2));
                    return;
                } else {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{0, 21, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", objArr);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                }
            }
            boolean z = lVar.mo26287(1) instanceof util.h.xy.dh.me;
            util.h.xy.dh.c mo26287 = lVar.mo26287(1);
            if (z) {
                this.getOutputMinFrameDuration = (util.h.xy.dh.me) mo26287;
            } else {
                this.getHighSpeedVideoSizesFor = util.h.xy.dj.f.m26372(mo26287);
            }
        }
    }
}
