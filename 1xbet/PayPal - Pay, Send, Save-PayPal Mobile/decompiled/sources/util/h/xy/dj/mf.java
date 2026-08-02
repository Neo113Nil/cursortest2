package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class mf extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private util.h.xy.dh.c Camera2StreamConfigurationMap;
    private util.h.xy.dh.i getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        dVar.m26290(this.Camera2StreamConfigurationMap);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 3) << 1) - (i ^ 3);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dj.mf m26390(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 77) + ((i & 77) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (obj instanceof util.h.xy.dj.mf) {
            int i3 = (i2 + 15) % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            util.h.xy.dj.mf mfVar = (util.h.xy.dj.mf) obj;
            int i4 = i3 + 57;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                return mfVar;
            }
            throw null;
        }
        if (obj == null) {
            getHighSpeedVideoFpsRanges = ((i & 75) + (i | 75)) % 128;
            return null;
        }
        util.h.xy.dj.mf mfVar2 = new util.h.xy.dj.mf(util.h.xy.dh.l.m26303(obj));
        int i5 = getHighSpeedVideoFpsRangesFor + 75;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 != 0) {
            return mfVar2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dj.mf m26391(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 59) + ((i & 59) << 1)) % 128;
        util.h.xy.dj.mf m26390 = m26390(util.h.xy.dh.l.m26304(mmVar, z));
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 37) % 128;
        return m26390;
    }

    private mf(util.h.xy.dh.l lVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.dh.i.m26297(lVar.mo26287(0));
        this.Camera2StreamConfigurationMap = lVar.mo26287(1);
    }
}
