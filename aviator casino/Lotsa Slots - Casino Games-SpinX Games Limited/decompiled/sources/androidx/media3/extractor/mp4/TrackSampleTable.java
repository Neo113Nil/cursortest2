package androidx.media3.extractor.mp4;

/* loaded from: classes2.dex */
final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final long[] timestampsUs;
    public final androidx.media3.extractor.mp4.Track track;

    public TrackSampleTable(androidx.media3.extractor.mp4.Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        androidx.media3.common.util.Assertions.checkArgument(iArr.length == jArr2.length);
        androidx.media3.common.util.Assertions.checkArgument(jArr.length == jArr2.length);
        androidx.media3.common.util.Assertions.checkArgument(iArr2.length == jArr2.length);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.durationUs = j;
        this.sampleCount = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j) {
        for (int binarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.timestampsUs, j, true, false); binarySearchFloor >= 0; binarySearchFloor--) {
            if ((this.flags[binarySearchFloor] & 1) != 0) {
                return binarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j) {
        for (int binarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.timestampsUs, j, true, false); binarySearchCeil < this.timestampsUs.length; binarySearchCeil++) {
            if ((this.flags[binarySearchCeil] & 1) != 0) {
                return binarySearchCeil;
            }
        }
        return -1;
    }
}
