package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public final class MediaParserChunkExtractor implements com.google.android.exoplayer2.source.chunk.ChunkExtractor {
    public static final com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory FACTORY = new com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory() { // from class: com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
        public final com.google.android.exoplayer2.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, com.google.android.exoplayer2.Format format, boolean z, java.util.List list, com.google.android.exoplayer2.extractor.TrackOutput trackOutput, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            return com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
        }
    };
    private static final java.lang.String TAG = "MediaPrsrChunkExtractor";
    private final com.google.android.exoplayer2.extractor.DummyTrackOutput dummyTrackOutput;
    private final com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;
    private com.google.android.exoplayer2.Format[] sampleFormats;
    private com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.TrackOutputProviderAdapter trackOutputProviderAdapter;

    static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor lambda$static$0(int i, com.google.android.exoplayer2.Format format, boolean z, java.util.List list, com.google.android.exoplayer2.extractor.TrackOutput trackOutput, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        if (!com.google.android.exoplayer2.util.MimeTypes.isText(format.containerMimeType)) {
            return new com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor(i, format, list, playerId);
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring an unsupported text track.");
        return null;
    }

    public MediaParserChunkExtractor(int i, com.google.android.exoplayer2.Format format, java.util.List<com.google.android.exoplayer2.Format> list, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        java.lang.String str;
        com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30(format, i, true);
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30();
        if (com.google.android.exoplayer2.util.MimeTypes.isMatroska((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(format.containerMimeType))) {
            str = "android.media.mediaparser.MatroskaParser";
        } else {
            str = "android.media.mediaparser.FragmentedMp4Parser";
        }
        outputConsumerAdapterV30.setSelectedParserName(str);
        android.media.MediaParser createByName = android.media.MediaParser.createByName(str, outputConsumerAdapterV30);
        this.mediaParser = createByName;
        createByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", true);
        createByName.setParameter("android.media.mediaparser.inBandCryptoInfo", true);
        createByName.setParameter("android.media.mediaparser.includeSupplementalData", true);
        createByName.setParameter("android.media.mediaparser.eagerlyExposeTrackType", true);
        createByName.setParameter("android.media.mediaparser.exposeDummySeekMap", true);
        createByName.setParameter("android.media.mediaParser.exposeChunkIndexAsMediaFormat", true);
        createByName.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(list.get(i2)));
        }
        this.mediaParser.setParameter("android.media.mediaParser.exposeCaptionFormats", arrayList);
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
        this.outputConsumerAdapter.setMuxedCaptionFormats(list);
        this.trackOutputProviderAdapter = new com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.TrackOutputProviderAdapter();
        this.dummyTrackOutput = new com.google.android.exoplayer2.extractor.DummyTrackOutput();
        this.pendingSeekUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2) {
        this.trackOutputProvider = trackOutputProvider;
        this.outputConsumerAdapter.setSampleTimestampUpperLimitFilterUs(j2);
        this.outputConsumerAdapter.setExtractorOutput(this.trackOutputProviderAdapter);
        this.pendingSeekUs = j;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        maybeExecutePendingSeek();
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex() {
        return this.outputConsumerAdapter.getChunkIndex();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public com.google.android.exoplayer2.Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    private void maybeExecutePendingSeek() {
        android.media.MediaParser.SeekMap dummySeekMap = this.outputConsumerAdapter.getDummySeekMap();
        long j = this.pendingSeekUs;
        if (j == -9223372036854775807L || dummySeekMap == null) {
            return;
        }
        this.mediaParser.seek((android.media.MediaParser.SeekPoint) dummySeekMap.getSeekPoints(j).first);
        this.pendingSeekUs = -9223372036854775807L;
    }

    private class TrackOutputProviderAdapter implements com.google.android.exoplayer2.extractor.ExtractorOutput {
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(com.google.android.exoplayer2.extractor.SeekMap seekMap) {
        }

        private TrackOutputProviderAdapter() {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2) {
            return com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.this.trackOutputProvider != null ? com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.this.trackOutputProvider.track(i, i2) : com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.this.dummyTrackOutput;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor mediaParserChunkExtractor = com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.this;
            mediaParserChunkExtractor.sampleFormats = mediaParserChunkExtractor.outputConsumerAdapter.getSampleFormats();
        }
    }
}
