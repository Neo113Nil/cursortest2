package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class FlacSeekTableSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
    private final long firstFrameOffset;
    private final com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public FlacSeekTableSeekMap(com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata, long j) {
        this.flacStreamMetadata = flacStreamMetadata;
        this.firstFrameOffset = j;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.flacStreamMetadata.getDurationUs();
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.flacStreamMetadata.seekTable);
        long[] jArr = this.flacStreamMetadata.seekTable.pointSampleNumbers;
        long[] jArr2 = this.flacStreamMetadata.seekTable.pointOffsets;
        int binarySearchFloor = com.google.android.exoplayer2.util.Util.binarySearchFloor(jArr, this.flacStreamMetadata.getSampleNumber(j), true, false);
        com.google.android.exoplayer2.extractor.SeekPoint seekPoint = getSeekPoint(binarySearchFloor == -1 ? 0L : jArr[binarySearchFloor], binarySearchFloor != -1 ? jArr2[binarySearchFloor] : 0L);
        if (seekPoint.timeUs == j || binarySearchFloor == jArr.length - 1) {
            return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekPoint, getSeekPoint(jArr[i], jArr2[i]));
    }

    private com.google.android.exoplayer2.extractor.SeekPoint getSeekPoint(long j, long j2) {
        return new com.google.android.exoplayer2.extractor.SeekPoint((j * 1000000) / this.flacStreamMetadata.sampleRate, this.firstFrameOffset + j2);
    }
}
