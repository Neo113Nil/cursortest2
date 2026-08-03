package com.google.android.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
final class DefaultOggSeeker implements com.google.android.exoplayer2.extractor.ogg.OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final com.google.android.exoplayer2.extractor.ogg.OggPageHeader pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final com.google.android.exoplayer2.extractor.ogg.StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    public DefaultOggSeeker(com.google.android.exoplayer2.extractor.ogg.StreamReader streamReader, long j, long j2, long j3, long j4, boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(j >= 0 && j2 > j);
        this.streamReader = streamReader;
        this.payloadStartPosition = j;
        this.payloadEndPosition = j2;
        if (j3 == j2 - j || z) {
            this.totalGranules = j4;
            this.state = 4;
        } else {
            this.state = 0;
        }
        this.pageHeader = new com.google.android.exoplayer2.extractor.ogg.OggPageHeader();
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public long read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = this.state;
        if (i == 0) {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j = this.payloadEndPosition - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long nextSeekPosition = getNextSeekPosition(extractorInput);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.state = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new java.lang.IllegalStateException();
            }
            skipToPageOfTargetGranule(extractorInput);
            this.state = 4;
            return -(this.startGranule + 2);
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 4;
        return this.positionBeforeSeekToEnd;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.OggSeekMap();
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public void startSeek(long j) {
        this.targetGranule = com.google.android.exoplayer2.util.Util.constrainValue(j, 0L, this.totalGranules - 1);
        this.state = 2;
        this.start = this.payloadStartPosition;
        this.end = this.payloadEndPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }

    private long getNextSeekPosition(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.start == this.end) {
            return -1L;
        }
        long position = extractorInput.getPosition();
        if (!this.pageHeader.skipToNextPage(extractorInput, this.end)) {
            long j = this.start;
            if (j != position) {
                return j;
            }
            throw new java.io.IOException("No ogg page can be found.");
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        long j2 = this.targetGranule - this.pageHeader.granulePosition;
        int i = this.pageHeader.headerSize + this.pageHeader.bodySize;
        if (0 <= j2 && j2 < 72000) {
            return -1L;
        }
        if (j2 < 0) {
            this.end = position;
            this.endGranule = this.pageHeader.granulePosition;
        } else {
            this.start = extractorInput.getPosition() + i;
            this.startGranule = this.pageHeader.granulePosition;
        }
        long j3 = this.end;
        long j4 = this.start;
        if (j3 - j4 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            this.end = j4;
            return j4;
        }
        long position2 = extractorInput.getPosition() - (i * (j2 <= 0 ? 2L : 1L));
        long j5 = this.end;
        long j6 = this.start;
        return com.google.android.exoplayer2.util.Util.constrainValue(position2 + ((j2 * (j5 - j6)) / (this.endGranule - this.startGranule)), j6, j5 - 1);
    }

    private void skipToPageOfTargetGranule(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        while (true) {
            this.pageHeader.skipToNextPage(extractorInput);
            this.pageHeader.populate(extractorInput, false);
            if (this.pageHeader.granulePosition <= this.targetGranule) {
                extractorInput.skipFully(this.pageHeader.headerSize + this.pageHeader.bodySize);
                this.start = extractorInput.getPosition();
                this.startGranule = this.pageHeader.granulePosition;
            } else {
                extractorInput.resetPeekPosition();
                return;
            }
        }
    }

    long readGranuleOfLastPage(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.pageHeader.reset();
        if (!this.pageHeader.skipToNextPage(extractorInput)) {
            throw new java.io.EOFException();
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.skipFully(this.pageHeader.headerSize + this.pageHeader.bodySize);
        long j = this.pageHeader.granulePosition;
        while ((this.pageHeader.type & 4) != 4 && this.pageHeader.skipToNextPage(extractorInput) && extractorInput.getPosition() < this.payloadEndPosition && this.pageHeader.populate(extractorInput, true) && com.google.android.exoplayer2.extractor.ExtractorUtil.skipFullyQuietly(extractorInput, this.pageHeader.headerSize + this.pageHeader.bodySize)) {
            j = this.pageHeader.granulePosition;
        }
        return j;
    }

    private final class OggSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        private OggSeekMap() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new com.google.android.exoplayer2.extractor.SeekPoint(j, com.google.android.exoplayer2.util.Util.constrainValue((com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.payloadStartPosition + ((com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.streamReader.convertTimeToGranule(j) * (com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.payloadEndPosition - com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.payloadStartPosition)) / com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.totalGranules)) - 30000, com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.payloadStartPosition, com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.payloadEndPosition - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.streamReader.convertGranuleToTime(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.this.totalGranules);
        }
    }
}
