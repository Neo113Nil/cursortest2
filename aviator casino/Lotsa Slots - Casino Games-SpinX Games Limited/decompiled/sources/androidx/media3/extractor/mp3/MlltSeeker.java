package androidx.media3.extractor.mp3;

/* loaded from: classes2.dex */
final class MlltSeeker implements androidx.media3.extractor.mp3.Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return -2147483647;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static androidx.media3.extractor.mp3.MlltSeeker create(long j, androidx.media3.extractor.metadata.id3.MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.bytesDeviations.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i3];
            j3 += mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new androidx.media3.extractor.mp3.MlltSeeker(jArr, jArr2, j2);
    }

    private MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j == -9223372036854775807L ? androidx.media3.common.util.Util.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        android.util.Pair<java.lang.Long, java.lang.Long> linearlyInterpolate = linearlyInterpolate(androidx.media3.common.util.Util.usToMs(androidx.media3.common.util.Util.constrainValue(j, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(androidx.media3.common.util.Util.msToUs(((java.lang.Long) linearlyInterpolate.first).longValue()), ((java.lang.Long) linearlyInterpolate.second).longValue()));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return androidx.media3.common.util.Util.msToUs(((java.lang.Long) linearlyInterpolate(j, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    private static android.util.Pair<java.lang.Long, java.lang.Long> linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int binarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, j, true, true);
        long j2 = jArr[binarySearchFloor];
        long j3 = jArr2[binarySearchFloor];
        int i = binarySearchFloor + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3));
        }
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
