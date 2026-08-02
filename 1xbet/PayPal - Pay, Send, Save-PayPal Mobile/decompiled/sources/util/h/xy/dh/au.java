package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class au implements util.h.xy.dh.ml {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private util.h.xy.dh.rm getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 83) << 1) - (i ^ 83)) % 128;
        try {
            util.h.xy.dh.mi mo26278 = mo26278();
            int i2 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (((i2 | 77) << 1) - (i2 ^ 77)) % 128;
            return mo26278;
        } catch (java.io.IOException e) {
            throw new util.h.xy.dh.ri(e.getMessage(), e);
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 73) + (i | 73)) % 128;
        util.h.xy.dh.av highSpeedVideoSizes = util.h.xy.dh.ao.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor());
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
        return highSpeedVideoSizes;
    }

    au(util.h.xy.dh.rm rmVar) {
        this.getHighSpeedVideoFpsRangesFor = rmVar;
    }
}
