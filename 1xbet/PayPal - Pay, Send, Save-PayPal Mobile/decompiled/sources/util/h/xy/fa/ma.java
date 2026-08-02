package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class ma extends java.lang.IllegalStateException {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = getHighSpeedVideoFpsRangesFor + 51;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.Throwable th = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i2 & 97) + (i2 | 97)) % 128;
        return th;
    }

    ma(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }
}
