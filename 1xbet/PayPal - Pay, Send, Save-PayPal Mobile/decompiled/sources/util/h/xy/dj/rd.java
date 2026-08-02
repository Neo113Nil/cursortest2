package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class rd extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.rh Camera2StreamConfigurationMap;
    private util.h.xy.dj.g getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.dh.f getHighSpeedVideoFpsRanges;
    private util.h.xy.ed.a getInputSizeshNQ4ISI;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(4);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        dVar.m26290(this.getInputSizeshNQ4ISI);
        dVar.m26290(this.Camera2StreamConfigurationMap);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoFpsRangesFor + 53;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.ed.a m26404() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 11) + (i | 11)) % 128;
        getHighSpeedVideoSizes = i2;
        util.h.xy.ed.a aVar = this.getInputSizeshNQ4ISI;
        int i3 = (i2 & 63) + (i2 | 63);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dj.g m26405() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i | 27) << 1) - (i ^ 27)) % 128;
        util.h.xy.dj.g gVar = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 87) + (i | 87)) % 128;
        return gVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.f m26406() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 93) + ((i & 93) << 1)) % 128;
        getHighSpeedVideoSizes = i2;
        util.h.xy.dh.f fVar = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i2 + 7) % 128;
        return fVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.rd m26403(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 31) + ((i & 31) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (!(obj instanceof util.h.xy.dj.rd)) {
            if (obj != null) {
                return new util.h.xy.dj.rd(util.h.xy.dh.l.m26303(obj));
            }
            getHighSpeedVideoFpsRangesFor = ((i & 3) + (i | 3)) % 128;
            return null;
        }
        int i3 = i2 + 93;
        int i4 = i3 % 128;
        getHighSpeedVideoSizes = i4;
        util.h.xy.dj.rd rdVar = (util.h.xy.dj.rd) obj;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = (i4 & 41) + (i4 | 41);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 != 0) {
            return rdVar;
        }
        throw null;
    }

    private rd(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoFpsRanges = (util.h.xy.dh.f) lVar.mo26287(0);
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.dj.g.m26373(lVar.mo26287(1));
        this.getInputSizeshNQ4ISI = util.h.xy.ed.a.m26491(lVar.mo26287(2));
        this.Camera2StreamConfigurationMap = (util.h.xy.dh.rh) lVar.mo26287(3);
    }

    public rd(util.h.xy.dj.g gVar, util.h.xy.ed.a aVar, util.h.xy.dh.rh rhVar) {
        this.getHighSpeedVideoFpsRanges = gVar.mo26279() instanceof util.h.xy.dh.mm ? new util.h.xy.dh.f(2L) : new util.h.xy.dh.f(0L);
        this.getHighResolutionOutputSizeshNQ4ISI = gVar;
        this.getInputSizeshNQ4ISI = aVar;
        this.Camera2StreamConfigurationMap = rhVar;
    }
}
