package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class rg extends util.h.xy.ea.mi {
    static java.util.Map getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    static java.util.Map getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dj.rf Camera2StreamConfigurationMap;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put(util.h.xy.ea.mb.f1925, util.h.xy.fb.b.m26828(8));
        getHighSpeedVideoFpsRanges.put(util.h.xy.ea.mb.f1913, util.h.xy.fb.b.m26828(16));
        getHighSpeedVideoFpsRanges.put(util.h.xy.ea.mb.f1911, util.h.xy.fb.b.m26828(16));
        getHighSpeedVideoFpsRanges.put(util.h.xy.ea.mb.f1912, util.h.xy.fb.b.m26828(16));
        getHighResolutionOutputSizeshNQ4ISI.put(util.h.xy.ea.mb.f1925, util.h.xy.fb.b.m26828(192));
        getHighResolutionOutputSizeshNQ4ISI.put(util.h.xy.ea.mb.f1913, util.h.xy.fb.b.m26828(128));
        getHighResolutionOutputSizeshNQ4ISI.put(util.h.xy.ea.mb.f1911, util.h.xy.fb.b.m26828(192));
        getHighResolutionOutputSizeshNQ4ISI.put(util.h.xy.ea.mb.f1912, util.h.xy.fb.b.m26828(256));
        int i = getHighSpeedVideoSizes + 75;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    rg(util.h.xy.dj.rf rfVar, util.h.xy.ed.a aVar, util.h.xy.ea.me meVar, util.h.xy.ea.ma maVar) {
        super(rfVar.m26411(), aVar, meVar, null);
        this.Camera2StreamConfigurationMap = rfVar;
        this.f1971 = new util.h.xy.ea.h();
    }
}
