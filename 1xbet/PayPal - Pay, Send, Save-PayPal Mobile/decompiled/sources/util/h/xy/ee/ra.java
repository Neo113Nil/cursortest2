package util.h.xy.ee;

/* loaded from: classes5.dex */
public final class ra extends java.io.IOException {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 79) + ((i & 79) << 1)) % 128;
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        int i2 = i + 97;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return th;
        }
        throw null;
    }

    public ra(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = th;
    }
}
