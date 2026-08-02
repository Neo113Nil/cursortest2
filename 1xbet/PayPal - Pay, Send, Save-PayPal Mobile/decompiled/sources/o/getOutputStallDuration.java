package o;

/* loaded from: classes9.dex */
public class getOutputStallDuration {
    static long[] getHighSpeedVideoFpsRanges(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + i3;
        }
        return jArr;
    }

    static void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, long[] jArr2, int i) {
        long j = jArr[i % 4] * 2147483085;
        long j2 = jArr2[(i + 2) % 4];
        long j3 = (j + j2) % androidx.collection.SieveCacheKt.NodeLinkMask;
        int i2 = (i + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j2) / androidx.collection.SieveCacheKt.NodeLinkMask;
        jArr[i2] = j3;
    }
}
