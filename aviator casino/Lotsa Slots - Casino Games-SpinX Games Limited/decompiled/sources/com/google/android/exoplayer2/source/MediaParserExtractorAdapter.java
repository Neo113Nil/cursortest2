package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class MediaParserExtractorAdapter implements com.google.android.exoplayer2.source.ProgressiveMediaExtractor {
    public static final com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory FACTORY = new com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory() { // from class: com.google.android.exoplayer2.source.MediaParserExtractorAdapter$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
        public final com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(com.google.android.exoplayer2.analytics.PlayerId playerId) {
            return new com.google.android.exoplayer2.source.MediaParserExtractorAdapter(playerId);
        }
    };
    private final com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private java.lang.String parserName;

    public MediaParserExtractorAdapter(com.google.android.exoplayer2.analytics.PlayerId playerId) {
        com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30();
        android.media.MediaParser create = android.media.MediaParser.create(outputConsumerAdapterV30, new java.lang.String[0]);
        this.mediaParser = create;
        create.setParameter("android.media.mediaparser.eagerlyExposeTrackType", true);
        create.setParameter("android.media.mediaparser.inBandCryptoInfo", true);
        create.setParameter("android.media.mediaparser.includeSupplementalData", true);
        this.parserName = "android.media.mediaparser.UNKNOWN";
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(create, playerId);
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void init(com.google.android.exoplayer2.upstream.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) throws java.io.IOException {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j2);
        this.inputReaderAdapter.setCurrentPosition(j);
        java.lang.String parserName = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            java.lang.String parserName2 = this.mediaParser.getParserName();
            this.parserName = parserName2;
            this.outputConsumerAdapter.setSelectedParserName(parserName2);
            return;
        }
        if (parserName.equals(this.parserName)) {
            return;
        }
        java.lang.String parserName3 = this.mediaParser.getParserName();
        this.parserName = parserName3;
        this.outputConsumerAdapter.setSelectedParserName(parserName3);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        this.inputReaderAdapter.setCurrentPosition(j);
        android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j2);
        this.mediaParser.seek((android.media.MediaParser.SeekPoint) (((android.media.MediaParser.SeekPoint) seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public int read(com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean advance = this.mediaParser.advance(this.inputReaderAdapter);
        positionHolder.position = this.inputReaderAdapter.getAndResetSeekPosition();
        if (advance) {
            return positionHolder.position != -1 ? 1 : 0;
        }
        return -1;
    }
}
