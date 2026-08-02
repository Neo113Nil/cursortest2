package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class rf extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.ed.a Camera2StreamConfigurationMap;
    private util.h.xy.dh.rh getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.ed.a getHighSpeedVideoFpsRanges;
    private util.h.xy.dh.f getHighSpeedVideoSizesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(4);
        dVar.m26290(this.getHighSpeedVideoSizesFor);
        if (this.Camera2StreamConfigurationMap != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 0, this.Camera2StreamConfigurationMap));
        }
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.ed.a m26411() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i + 5) % 128;
        util.h.xy.ed.a aVar = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 51) % 128;
        return aVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.f m26412() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.dh.f fVar = this.getHighSpeedVideoSizesFor;
        int i3 = (i ^ 79) + ((i & 79) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return fVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dj.rf m26410(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj instanceof util.h.xy.dj.rf) {
            int i3 = (i ^ 21) + ((i & 21) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            util.h.xy.dj.rf rfVar = (util.h.xy.dj.rf) obj;
            if (i3 % 2 == 0) {
                return rfVar;
            }
            throw new java.lang.ArithmeticException();
        }
        if (obj == null) {
            getHighSpeedVideoSizes = (i + 77) % 128;
            return null;
        }
        util.h.xy.dj.rf rfVar2 = new util.h.xy.dj.rf(util.h.xy.dh.l.m26303(obj));
        int i4 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i4 & 101) + (i4 | 101)) % 128;
        return rfVar2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.rf m26409(util.h.xy.dh.mm mmVar, boolean z) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        util.h.xy.dj.rf m26410 = m26410(util.h.xy.dh.l.m26304(mmVar, z));
        int i = getHighSpeedVideoSizes + 105;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return m26410;
        }
        throw new java.lang.ArithmeticException();
    }

    private rf(util.h.xy.dh.l lVar) {
        util.h.xy.dh.c mo26287;
        this.getHighSpeedVideoSizesFor = (util.h.xy.dh.f) lVar.mo26287(0);
        if (lVar.mo26287(1) instanceof util.h.xy.dh.mm) {
            this.Camera2StreamConfigurationMap = util.h.xy.ed.a.m26492((util.h.xy.dh.mm) lVar.mo26287(1), false);
            this.getHighSpeedVideoFpsRanges = util.h.xy.ed.a.m26491(lVar.mo26287(2));
            mo26287 = lVar.mo26287(3);
        } else {
            this.getHighSpeedVideoFpsRanges = util.h.xy.ed.a.m26491(lVar.mo26287(1));
            mo26287 = lVar.mo26287(2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.dh.rh) mo26287;
    }
}
