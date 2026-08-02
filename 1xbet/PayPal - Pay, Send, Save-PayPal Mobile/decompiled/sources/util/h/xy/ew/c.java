package util.h.xy.ew;

/* loaded from: classes18.dex */
public final class c extends java.lang.Exception {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 111) << 1) - (i ^ 111);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 125) + (i | 125)) % 128;
        return th;
    }

    public c(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }
}
