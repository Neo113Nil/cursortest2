package com.google.android.exoplayer2.extractor.wav;

/* loaded from: classes3.dex */
final class WavSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final com.google.android.exoplayer2.extractor.wav.WavFormat wavFormat;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public WavSeekMap(com.google.android.exoplayer2.extractor.wav.WavFormat wavFormat, int i, long j, long j2) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i;
        this.firstBlockPosition = j;
        long j3 = (j2 - j) / wavFormat.blockSize;
        this.blockCount = j3;
        this.durationUs = blockIndexToTimeUs(j3);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        long constrainValue = com.google.android.exoplayer2.util.Util.constrainValue((this.wavFormat.frameRateHz * j) / (this.framesPerBlock * 1000000), 0L, this.blockCount - 1);
        long j2 = this.firstBlockPosition + (this.wavFormat.blockSize * constrainValue);
        long blockIndexToTimeUs = blockIndexToTimeUs(constrainValue);
        com.google.android.exoplayer2.extractor.SeekPoint seekPoint = new com.google.android.exoplayer2.extractor.SeekPoint(blockIndexToTimeUs, j2);
        if (blockIndexToTimeUs >= j || constrainValue == this.blockCount - 1) {
            return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekPoint);
        }
        long j3 = constrainValue + 1;
        return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekPoint, new com.google.android.exoplayer2.extractor.SeekPoint(blockIndexToTimeUs(j3), this.firstBlockPosition + (this.wavFormat.blockSize * j3)));
    }

    private long blockIndexToTimeUs(long j) {
        return com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j * this.framesPerBlock, 1000000L, this.wavFormat.frameRateHz);
    }
}
