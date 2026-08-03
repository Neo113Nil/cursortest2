package androidx.media3.extractor;

/* loaded from: classes2.dex */
public final class FlacSeekTableSeekMap implements androidx.media3.extractor.SeekMap {
    private final long firstFrameOffset;
    private final androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public FlacSeekTableSeekMap(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, long j) {
        this.flacStreamMetadata = flacStreamMetadata;
        this.firstFrameOffset = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.flacStreamMetadata.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.flacStreamMetadata.seekTable);
        long[] jArr = this.flacStreamMetadata.seekTable.pointSampleNumbers;
        long[] jArr2 = this.flacStreamMetadata.seekTable.pointOffsets;
        int binarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, this.flacStreamMetadata.getSampleNumber(j), true, false);
        androidx.media3.extractor.SeekPoint seekPoint = getSeekPoint(binarySearchFloor == -1 ? 0L : jArr[binarySearchFloor], binarySearchFloor != -1 ? jArr2[binarySearchFloor] : 0L);
        if (seekPoint.timeUs == j || binarySearchFloor == jArr.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, getSeekPoint(jArr[i], jArr2[i]));
    }

    private androidx.media3.extractor.SeekPoint getSeekPoint(long j, long j2) {
        return new androidx.media3.extractor.SeekPoint((j * 1000000) / this.flacStreamMetadata.sampleRate, this.firstFrameOffset + j2);
    }
}
