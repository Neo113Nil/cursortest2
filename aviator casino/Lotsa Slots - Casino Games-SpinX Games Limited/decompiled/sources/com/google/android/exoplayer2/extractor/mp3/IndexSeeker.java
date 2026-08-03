package com.google.android.exoplayer2.extractor.mp3;

/* loaded from: classes3.dex */
final class IndexSeeker implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final long dataEndPosition;
    private long durationUs;
    private final com.google.android.exoplayer2.util.LongArray positions;
    private final com.google.android.exoplayer2.util.LongArray timesUs;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public IndexSeeker(long j, long j2, long j3) {
        this.durationUs = j;
        this.dataEndPosition = j3;
        com.google.android.exoplayer2.util.LongArray longArray = new com.google.android.exoplayer2.util.LongArray();
        this.timesUs = longArray;
        com.google.android.exoplayer2.util.LongArray longArray2 = new com.google.android.exoplayer2.util.LongArray();
        this.positions = longArray2;
        longArray.add(0L);
        longArray2.add(j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs.get(com.google.android.exoplayer2.util.Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = com.google.android.exoplayer2.util.Util.binarySearchFloor(this.timesUs, j, true, true);
        com.google.android.exoplayer2.extractor.SeekPoint seekPoint = new com.google.android.exoplayer2.extractor.SeekPoint(this.timesUs.get(binarySearchFloor), this.positions.get(binarySearchFloor));
        if (seekPoint.timeUs == j || binarySearchFloor == this.timesUs.size() - 1) {
            return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekPoint, new com.google.android.exoplayer2.extractor.SeekPoint(this.timesUs.get(i), this.positions.get(i)));
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.timesUs.add(j);
        this.positions.add(j2);
    }

    public boolean isTimeUsInIndex(long j) {
        com.google.android.exoplayer2.util.LongArray longArray = this.timesUs;
        return j - longArray.get(longArray.size() - 1) < 100000;
    }

    void setDurationUs(long j) {
        this.durationUs = j;
    }
}
