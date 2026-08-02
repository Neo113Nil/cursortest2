package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class f extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.c Camera2StreamConfigurationMap;
    private util.h.xy.dh.i getHighSpeedVideoFpsRanges;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        dVar.m26290(this.Camera2StreamConfigurationMap);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        return aaVar;
    }

    private f(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoFpsRanges = (util.h.xy.dh.i) lVar.mo26287(0);
        this.Camera2StreamConfigurationMap = lVar.mo26287(1);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dj.f m26372(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i + 57) % 128;
        getHighSpeedVideoSizes = i2;
        if (!(obj instanceof util.h.xy.dj.f)) {
            if (obj != null) {
                return new util.h.xy.dj.f(util.h.xy.dh.l.m26303(obj));
            }
            getHighSpeedVideoFpsRangesFor = ((i2 ^ 71) + ((i2 & 71) << 1)) % 128;
            return null;
        }
        getHighSpeedVideoSizes = (((i | 81) << 1) - (i ^ 81)) % 128;
        util.h.xy.dj.f fVar = (util.h.xy.dj.f) obj;
        int i3 = ((i | 25) << 1) - (i ^ 25);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return fVar;
        }
        throw new java.lang.ArithmeticException();
    }
}
