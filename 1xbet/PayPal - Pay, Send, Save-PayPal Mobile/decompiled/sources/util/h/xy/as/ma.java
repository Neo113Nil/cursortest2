package util.h.xy.as;

/* loaded from: classes18.dex */
public final class ma extends java.lang.Exception {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private int Camera2StreamConfigurationMap;

    public ma(int i, java.lang.String str) {
        this(str);
        this.Camera2StreamConfigurationMap = i;
    }

    public ma(int i, java.lang.String str, java.lang.Throwable th) {
        this(str, th);
        this.Camera2StreamConfigurationMap = i;
    }

    private ma(java.lang.String str) {
        super(str);
        this.Camera2StreamConfigurationMap = 0;
    }

    private ma(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.Camera2StreamConfigurationMap = 0;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m25115() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 107) + ((i & 107) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = i2 + 49;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }
}
