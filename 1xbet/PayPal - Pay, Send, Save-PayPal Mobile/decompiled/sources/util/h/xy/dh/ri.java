package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ri extends java.lang.IllegalStateException {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = getHighSpeedVideoFpsRanges + 17;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.Throwable th = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i2 | 67) << 1) - (i2 ^ 67)) % 128;
        return th;
    }

    public ri(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public ri(java.lang.String str) {
        super(str);
    }
}
