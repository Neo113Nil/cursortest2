package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class a extends util.h.xy.ea.re {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    java.lang.Exception getHighSpeedVideoSizes;

    @Override // util.h.xy.ea.re, java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }
}
