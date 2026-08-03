package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class SilenceMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final com.google.android.exoplayer2.Format FORMAT;
    public static final java.lang.String MEDIA_ID = "SilenceMediaSource";
    private static final com.google.android.exoplayer2.MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;
    private final com.google.android.exoplayer2.MediaItem mediaItem;

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public static final class Factory {
        private long durationUs;
        private java.lang.Object tag;

        public com.google.android.exoplayer2.source.SilenceMediaSource.Factory setDurationUs(long j) {
            this.durationUs = j;
            return this;
        }

        public com.google.android.exoplayer2.source.SilenceMediaSource.Factory setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public com.google.android.exoplayer2.source.SilenceMediaSource createMediaSource() {
            com.google.android.exoplayer2.util.Assertions.checkState(this.durationUs > 0);
            return new com.google.android.exoplayer2.source.SilenceMediaSource(this.durationUs, com.google.android.exoplayer2.source.SilenceMediaSource.MEDIA_ITEM.buildUpon().setTag(this.tag).build());
        }
    }

    static {
        com.google.android.exoplayer2.Format build = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType("audio/raw").setChannelCount(2).setSampleRate(SAMPLE_RATE_HZ).setPcmEncoding(2).build();
        FORMAT = build;
        MEDIA_ITEM = new com.google.android.exoplayer2.MediaItem.Builder().setMediaId("SilenceMediaSource").setUri(android.net.Uri.EMPTY).setMimeType(build.sampleMimeType).build();
        SILENCE_SAMPLE = new byte[com.google.android.exoplayer2.util.Util.getPcmFrameSize(2, 2) * 1024];
    }

    public SilenceMediaSource(long j) {
        this(j, MEDIA_ITEM);
    }

    private SilenceMediaSource(long j, com.google.android.exoplayer2.MediaItem mediaItem) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(j >= 0);
        this.durationUs = j;
        this.mediaItem = mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        refreshSourceInfo(new com.google.android.exoplayer2.source.SinglePeriodTimeline(this.durationUs, true, false, false, (java.lang.Object) null, this.mediaItem));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        return new com.google.android.exoplayer2.source.SilenceMediaSource.SilenceMediaPeriod(this.durationUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    private static final class SilenceMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod {
        private static final com.google.android.exoplayer2.source.TrackGroupArray TRACKS = new com.google.android.exoplayer2.source.TrackGroupArray(new com.google.android.exoplayer2.source.TrackGroup(com.google.android.exoplayer2.source.SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final java.util.ArrayList<com.google.android.exoplayer2.source.SampleStream> sampleStreams = new java.util.ArrayList<>();

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public /* synthetic */ java.util.List getStreamKeys(java.util.List list) {
            java.util.List emptyList;
            emptyList = java.util.Collections.emptyList();
            return emptyList;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
        }

        public SilenceMediaPeriod(long j) {
            this.durationUs = j;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback, long j) {
            callback.onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            long constrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < exoTrackSelectionArr.length; i++) {
                com.google.android.exoplayer2.source.SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStreamArr[i] = null;
                }
                if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                    com.google.android.exoplayer2.source.SilenceMediaSource.SilenceSampleStream silenceSampleStream = new com.google.android.exoplayer2.source.SilenceMediaSource.SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(constrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i] = silenceSampleStream;
                    zArr2[i] = true;
                }
            }
            return constrainSeekPosition;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j) {
            long constrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < this.sampleStreams.size(); i++) {
                ((com.google.android.exoplayer2.source.SilenceMediaSource.SilenceSampleStream) this.sampleStreams.get(i)).seekTo(constrainSeekPosition);
            }
            return constrainSeekPosition;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, com.google.android.exoplayer2.SeekParameters seekParameters) {
            return constrainSeekPosition(j);
        }

        private long constrainSeekPosition(long j) {
            return com.google.android.exoplayer2.util.Util.constrainValue(j, 0L, this.durationUs);
        }
    }

    private static final class SilenceSampleStream implements com.google.android.exoplayer2.source.SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
        }

        public SilenceSampleStream(long j) {
            this.durationBytes = com.google.android.exoplayer2.source.SilenceMediaSource.getAudioByteCount(j);
            seekTo(0L);
        }

        public void seekTo(long j) {
            this.positionBytes = com.google.android.exoplayer2.util.Util.constrainValue(com.google.android.exoplayer2.source.SilenceMediaSource.getAudioByteCount(j), 0L, this.durationBytes);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            if (!this.sentFormat || (i & 2) != 0) {
                formatHolder.format = com.google.android.exoplayer2.source.SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j = this.durationBytes;
            long j2 = this.positionBytes;
            long j3 = j - j2;
            if (j3 != 0) {
                decoderInputBuffer.timeUs = com.google.android.exoplayer2.source.SilenceMediaSource.getAudioPositionUs(j2);
                decoderInputBuffer.addFlag(1);
                int min = (int) java.lang.Math.min(com.google.android.exoplayer2.source.SilenceMediaSource.SILENCE_SAMPLE.length, j3);
                if ((i & 4) == 0) {
                    decoderInputBuffer.ensureSpaceForWrite(min);
                    decoderInputBuffer.data.put(com.google.android.exoplayer2.source.SilenceMediaSource.SILENCE_SAMPLE, 0, min);
                }
                if ((i & 1) == 0) {
                    this.positionBytes += min;
                }
                return -4;
            }
            decoderInputBuffer.addFlag(4);
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            long j2 = this.positionBytes;
            seekTo(j);
            return (int) ((this.positionBytes - j2) / com.google.android.exoplayer2.source.SilenceMediaSource.SILENCE_SAMPLE.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j) {
        return com.google.android.exoplayer2.util.Util.getPcmFrameSize(2, 2) * ((j * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j) {
        return ((j / com.google.android.exoplayer2.util.Util.getPcmFrameSize(2, 2)) * 1000000) / 44100;
    }
}
