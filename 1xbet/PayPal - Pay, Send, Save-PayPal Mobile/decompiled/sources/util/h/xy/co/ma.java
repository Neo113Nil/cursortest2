package util.h.xy.co;

/* loaded from: classes5.dex */
public final class ma {
    private static util.h.xy.co.a getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.co.mb();
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    static {
        int i = getHighSpeedVideoFpsRangesFor + 13;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.co.a m25988() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 53) + ((i & 53) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        util.h.xy.co.a aVar = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 103;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        throw null;
    }
}
