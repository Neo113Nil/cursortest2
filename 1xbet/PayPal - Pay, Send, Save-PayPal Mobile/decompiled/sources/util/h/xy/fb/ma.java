package util.h.xy.fb;

/* loaded from: classes5.dex */
public final class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static long m26833(long j) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 1) + (i | 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Long.reverse(j);
        }
        throw null;
    }
}
