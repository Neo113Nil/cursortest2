package util.h.xy.bk;

/* loaded from: classes18.dex */
public final class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.bk.mb m25504() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 3) + ((i & 3) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.bk.mb mbVar = util.h.xy.bk.mb.f982;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 31) + ((i3 & 31) << 1)) % 128;
        return mbVar;
    }
}
