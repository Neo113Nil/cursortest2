package util.h.xy.dh;

/* loaded from: classes5.dex */
final class n {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final int Camera2StreamConfigurationMap = 0;
    private final int getHighSpeedVideoFpsRangesFor;

    private n(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    static util.h.xy.dh.n getHighResolutionOutputSizeshNQ4ISI(int i) {
        util.h.xy.dh.n nVar = new util.h.xy.dh.n(0, i);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i2 & 81) + (i2 | 81)) % 128;
        return nVar;
    }
}
