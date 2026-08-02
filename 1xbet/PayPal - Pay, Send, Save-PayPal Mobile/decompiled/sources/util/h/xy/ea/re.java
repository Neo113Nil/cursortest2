package util.h.xy.ea;

/* loaded from: classes18.dex */
public class re extends java.lang.RuntimeException {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    java.lang.Exception getHighSpeedVideoFpsRanges;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        int i = (Camera2StreamConfigurationMap + 59) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.Exception exc = this.getHighSpeedVideoFpsRanges;
        int i2 = i + 41;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return exc;
        }
        throw null;
    }
}
