package util.h.xy.dh;

/* loaded from: classes5.dex */
public class mv implements util.h.xy.dh.rn {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    final int Camera2StreamConfigurationMap;
    final util.h.xy.dh.rm getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoSizes + 53;
        getHighSpeedVideoFpsRangesFor = i % 128;
        try {
            if (i % 2 == 0) {
                mo26278();
                throw new java.lang.NullPointerException();
            }
            util.h.xy.dh.mi mo26278 = mo26278();
            int i2 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i2 & 77) + (i2 | 77)) % 128;
            return mo26278;
        } catch (java.io.IOException e) {
            throw new util.h.xy.dh.ri(e.getMessage());
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 107) + (i | 107);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            throw null;
        }
        util.h.xy.dh.mi highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        int i3 = getHighSpeedVideoSizes + 115;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    mv(int i, int i2, util.h.xy.dh.rm rmVar) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = rmVar;
    }
}
