package util.h.xy.eb;

/* loaded from: classes18.dex */
public final class mb extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private final util.h.xy.dh.rh getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i ^ 103) + ((i & 103) << 1)) % 128;
        util.h.xy.dh.rh rhVar = this.getHighSpeedVideoSizes;
        int i2 = i + 125;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return rhVar;
        }
        throw new java.lang.ArithmeticException();
    }
}
