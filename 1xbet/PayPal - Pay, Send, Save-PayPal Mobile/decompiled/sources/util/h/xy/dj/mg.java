package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class mg extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dj.c Camera2StreamConfigurationMap;
    private util.h.xy.dh.rh getHighSpeedVideoFpsRanges;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.Camera2StreamConfigurationMap);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dh.rh m26393() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dj.c m26394() {
        int i = getHighSpeedVideoSizes + 9;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dj.c cVar = this.Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            return cVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dj.mg m26392(java.lang.Object obj) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 49;
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj instanceof util.h.xy.dj.mg) {
            util.h.xy.dj.mg mgVar = (util.h.xy.dj.mg) obj;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 59) % 128;
            return mgVar;
        }
        if (obj != null) {
            return new util.h.xy.dj.mg(util.h.xy.dh.l.m26303(obj));
        }
        getHighSpeedVideoSizes = (i + 61) % 128;
        return null;
    }

    private mg(util.h.xy.dh.l lVar) {
        this.Camera2StreamConfigurationMap = util.h.xy.dj.c.m26358(lVar.mo26287(0));
        this.getHighSpeedVideoFpsRanges = (util.h.xy.dh.rh) lVar.mo26287(1);
    }
}
