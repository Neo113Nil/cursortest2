package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class as implements util.h.xy.dh.mk {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dh.rm Camera2StreamConfigurationMap;

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i ^ 89) + ((i & 89) << 1)) % 128;
        try {
            util.h.xy.dh.mi mo26278 = mo26278();
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 31) % 128;
            return mo26278;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 69) % 128;
        util.h.xy.dh.aq highSpeedVideoFpsRanges = util.h.xy.dh.ao.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor());
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i | 47) << 1) - (i ^ 47)) % 128;
        return highSpeedVideoFpsRanges;
    }

    as(util.h.xy.dh.rm rmVar) {
        this.Camera2StreamConfigurationMap = rmVar;
    }
}
