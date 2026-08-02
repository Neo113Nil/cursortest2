package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class d extends java.lang.Exception {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    java.lang.Exception getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 19) << 1) - (i ^ 19);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.Exception exc = this.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | 55) << 1) - (i ^ 55)) % 128;
        return exc;
    }

    public d(java.lang.String str, java.lang.Exception exc) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = exc;
    }

    public d(java.lang.String str) {
        super(str);
    }
}
