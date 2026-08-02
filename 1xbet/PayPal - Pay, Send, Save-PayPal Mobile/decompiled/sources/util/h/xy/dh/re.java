package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class re extends java.io.IOException {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.Throwable getHighSpeedVideoSizes;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 25) % 128;
        java.lang.Throwable th = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 27) % 128;
        return th;
    }

    public re(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighSpeedVideoSizes = th;
    }

    public re(java.lang.String str) {
        super(str);
    }
}
