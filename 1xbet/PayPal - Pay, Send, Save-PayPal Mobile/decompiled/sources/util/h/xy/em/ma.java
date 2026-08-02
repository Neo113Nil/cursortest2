package util.h.xy.em;

/* loaded from: classes18.dex */
public class ma extends java.io.IOException {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final long serialVersionUID = 1;
    private final java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 75) + ((i & 75) << 1)) % 128;
        java.lang.Throwable th = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i ^ 97) + ((i & 97) << 1)) % 128;
        return th;
    }

    public ma(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }
}
