package util.h.xy.ef;

/* loaded from: classes5.dex */
public class c extends java.lang.Exception {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 77) + (i | 77);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }

    public c(java.lang.String str) {
        super(str);
    }

    public c() {
    }
}
