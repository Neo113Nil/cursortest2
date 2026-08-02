package util.h.xy.dh;

/* loaded from: classes5.dex */
final class ar extends util.h.xy.dh.mv {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private final boolean getOutputFormats;

    @Override // util.h.xy.dh.mv, util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 7) << 1) - (i ^ 7);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        util.h.xy.dh.rm rmVar = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i2 % 2 != 0) {
            return rmVar.getHighResolutionOutputSizeshNQ4ISI(i3, this.Camera2StreamConfigurationMap, this.getOutputFormats);
        }
        rmVar.getHighResolutionOutputSizeshNQ4ISI(i3, this.Camera2StreamConfigurationMap, this.getOutputFormats);
        throw null;
    }

    ar(int i, int i2, boolean z, util.h.xy.dh.rm rmVar) {
        super(i, i2, rmVar);
        this.getOutputFormats = z;
    }
}
