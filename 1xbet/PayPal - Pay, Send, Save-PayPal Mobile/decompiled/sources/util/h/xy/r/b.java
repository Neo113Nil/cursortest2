package util.h.xy.r;

/* loaded from: classes18.dex */
public final class b extends java.lang.Exception {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private int getHighSpeedVideoFpsRanges;

    public b(java.lang.String str, int i) {
        super(str);
        this.getHighSpeedVideoFpsRanges = i;
    }

    public b(java.lang.String str, int i, java.lang.Throwable th) {
        super(str, th);
        this.getHighSpeedVideoFpsRanges = i;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m27063() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 81) + (i | 81)) % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 21) + ((i2 & 21) << 1)) % 128;
        return i3;
    }
}
