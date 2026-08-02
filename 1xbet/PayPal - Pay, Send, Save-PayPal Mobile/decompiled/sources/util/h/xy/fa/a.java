package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class a extends java.lang.IllegalStateException {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.Throwable Camera2StreamConfigurationMap;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = (getHighSpeedVideoFpsRanges + 11) % 128;
        getHighSpeedVideoSizes = i;
        java.lang.Throwable th = this.Camera2StreamConfigurationMap;
        int i2 = i + 75;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return th;
        }
        throw null;
    }

    a(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.Camera2StreamConfigurationMap = th;
    }
}
