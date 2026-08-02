package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class rc extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dw.b getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.dh.f getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 125) + (i | 125);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return aaVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.f m26401() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 121) + ((i & 121) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dw.b m26402() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.dw.b bVar = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = (i3 ^ 7) + ((i3 & 7) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public rc(util.h.xy.dh.l lVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.dw.b.m26430(lVar.mo26287(0));
        this.getHighSpeedVideoFpsRangesFor = (util.h.xy.dh.f) lVar.mo26287(1);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.rc m26400(java.lang.Object obj) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 95) % 128;
        if (obj instanceof util.h.xy.dj.rc) {
            getHighSpeedVideoSizes = (i + 119) % 128;
            return (util.h.xy.dj.rc) obj;
        }
        if (obj == null) {
            return null;
        }
        util.h.xy.dj.rc rcVar = new util.h.xy.dj.rc(util.h.xy.dh.l.m26303(obj));
        int i2 = getHighSpeedVideoSizes + 93;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return rcVar;
        }
        throw null;
    }
}
