package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class e extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private util.h.xy.dh.rh Camera2StreamConfigurationMap;
    private util.h.xy.dh.l getHighSpeedVideoFpsRanges;
    private util.h.xy.ed.a getHighSpeedVideoSizes;
    private util.h.xy.dj.md getHighSpeedVideoSizesFor;
    private util.h.xy.dh.f getOutputMinFrameDuration;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(5);
        dVar.m26290(this.getOutputMinFrameDuration);
        dVar.m26290(new util.h.xy.dh.ag(true, 0, this.getHighSpeedVideoSizesFor));
        if (this.Camera2StreamConfigurationMap != null) {
            dVar.m26290(new util.h.xy.dh.ag(true, 1, this.Camera2StreamConfigurationMap));
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i ^ 7) + ((i & 7) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 4;
            }
        }
        dVar.m26290(this.getHighSpeedVideoSizes);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i4 & 113) + (i4 | 113)) % 128;
        return aaVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.l m26371() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 19) + (i | 19)) % 128;
        util.h.xy.dh.l lVar = this.getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 105) % 128;
        return lVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.ed.a m26370() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 65;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.ed.a aVar = this.getHighSpeedVideoSizes;
        if (i % 2 == 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.f m26369() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (((i | 9) << 1) - (i ^ 9)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        util.h.xy.dh.f fVar = this.getOutputMinFrameDuration;
        int i3 = i2 + 57;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return fVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dj.e m26368(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 47) << 1) - (i ^ 47);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!(obj instanceof util.h.xy.dj.e)) {
            if (obj != null) {
                return new util.h.xy.dj.e(util.h.xy.dh.l.m26303(obj));
            }
            return null;
        }
        util.h.xy.dj.e eVar = (util.h.xy.dj.e) obj;
        int i4 = i3 + 5;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.e m26367(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 75;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.dh.l m26304 = util.h.xy.dh.l.m26304(mmVar, z);
        if (i % 2 != 0) {
            m26368(m26304);
            throw null;
        }
        util.h.xy.dj.e m26368 = m26368(m26304);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        return m26368;
    }

    private e(util.h.xy.dh.l lVar) {
        this.getOutputMinFrameDuration = (util.h.xy.dh.f) lVar.mo26287(0);
        this.getHighSpeedVideoSizesFor = util.h.xy.dj.md.m26387((util.h.xy.dh.mm) lVar.mo26287(1), true);
        int i = 2;
        if (lVar.mo26287(2) instanceof util.h.xy.dh.mm) {
            this.Camera2StreamConfigurationMap = util.h.xy.dh.rh.m26336((util.h.xy.dh.mm) lVar.mo26287(2), true);
            i = 3;
        }
        int i2 = i - 43;
        this.getHighSpeedVideoSizes = util.h.xy.ed.a.m26491(lVar.mo26287(i));
        this.getHighSpeedVideoFpsRanges = (util.h.xy.dh.l) lVar.mo26287((i2 & 44) + (i2 | 44));
    }
}
