package util.h.xy.ex;

/* loaded from: classes5.dex */
public abstract class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static long m26739(long j, long j2, int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i2 + 39) % 128;
        long j3 = j2 & ((j >>> i) ^ j);
        int i3 = (i2 & 21) + (i2 | 21);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return j ^ (j3 ^ (j3 << i));
        }
        throw null;
    }
}
