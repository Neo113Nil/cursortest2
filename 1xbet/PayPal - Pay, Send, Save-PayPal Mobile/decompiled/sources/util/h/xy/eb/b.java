package util.h.xy.eb;

/* loaded from: classes18.dex */
public final class b extends util.h.xy.dh.mh implements util.h.xy.eb.c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private util.h.xy.dh.mi getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.dh.i getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoFpsRanges + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return aaVar;
        }
        throw new java.lang.ArithmeticException();
    }
}
