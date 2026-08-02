package util.h.xy.dh;

/* loaded from: classes5.dex */
abstract class be extends java.io.InputStream {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private int Camera2StreamConfigurationMap;
    protected final java.io.InputStream getHighResolutionOutputSizeshNQ4ISI;

    protected final void getHighSpeedVideoSizes(boolean z) {
        int i = getHighSpeedVideoFpsRanges + 69;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.io.InputStream inputStream = this.getHighResolutionOutputSizeshNQ4ISI;
        if (inputStream instanceof util.h.xy.dh.ay) {
            ((util.h.xy.dh.ay) inputStream).getHighSpeedVideoFpsRangesFor(z);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 65) % 128;
        }
    }

    final int Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return this.Camera2StreamConfigurationMap;
        }
        throw null;
    }

    be(java.io.InputStream inputStream, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = inputStream;
        this.Camera2StreamConfigurationMap = i;
    }
}
