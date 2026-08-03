package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public final class BundledChunkExtractor implements com.google.android.exoplayer2.extractor.ExtractorOutput, com.google.android.exoplayer2.source.chunk.ChunkExtractor {
    public static final com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory FACTORY = new com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory() { // from class: com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
        public final com.google.android.exoplayer2.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, com.google.android.exoplayer2.Format format, boolean z, java.util.List list, com.google.android.exoplayer2.extractor.TrackOutput trackOutput, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            return com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
        }
    };
    private static final com.google.android.exoplayer2.extractor.PositionHolder POSITION_HOLDER = new com.google.android.exoplayer2.extractor.PositionHolder();
    private final android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput> bindingTrackOutputs = new android.util.SparseArray<>();
    private long endTimeUs;
    private final com.google.android.exoplayer2.extractor.Extractor extractor;
    private boolean extractorInitialized;
    private final com.google.android.exoplayer2.Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private com.google.android.exoplayer2.Format[] sampleFormats;
    private com.google.android.exoplayer2.extractor.SeekMap seekMap;
    private com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;

    static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor lambda$static$0(int i, com.google.android.exoplayer2.Format format, boolean z, java.util.List list, com.google.android.exoplayer2.extractor.TrackOutput trackOutput, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        com.google.android.exoplayer2.extractor.Extractor fragmentedMp4Extractor;
        java.lang.String str = format.containerMimeType;
        if (com.google.android.exoplayer2.util.MimeTypes.isText(str)) {
            return null;
        }
        if (com.google.android.exoplayer2.util.MimeTypes.isMatroska(str)) {
            fragmentedMp4Extractor = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor(1);
        } else {
            fragmentedMp4Extractor = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor(z ? 4 : 0, null, null, list, trackOutput);
        }
        return new com.google.android.exoplayer2.source.chunk.BundledChunkExtractor(fragmentedMp4Extractor, i, format);
    }

    public BundledChunkExtractor(com.google.android.exoplayer2.extractor.Extractor extractor, int i, com.google.android.exoplayer2.Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i;
        this.primaryTrackManifestFormat = format;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex() {
        com.google.android.exoplayer2.extractor.SeekMap seekMap = this.seekMap;
        if (seekMap instanceof com.google.android.exoplayer2.extractor.ChunkIndex) {
            return (com.google.android.exoplayer2.extractor.ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public com.google.android.exoplayer2.Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j2;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j != -9223372036854775807L) {
                this.extractor.seek(0L, j);
            }
            this.extractorInitialized = true;
            return;
        }
        com.google.android.exoplayer2.extractor.Extractor extractor = this.extractor;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        extractor.seek(0L, j);
        for (int i = 0; i < this.bindingTrackOutputs.size(); i++) {
            this.bindingTrackOutputs.valueAt(i).bind(trackOutputProvider, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int read = this.extractor.read(extractorInput, POSITION_HOLDER);
        com.google.android.exoplayer2.util.Assertions.checkState(read != 1);
        return read == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2) {
        com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i);
        if (bindingTrackOutput == null) {
            com.google.android.exoplayer2.util.Assertions.checkState(this.sampleFormats == null);
            bindingTrackOutput = new com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput(i, i2, i2 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            bindingTrackOutput.bind(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        com.google.android.exoplayer2.Format[] formatArr = new com.google.android.exoplayer2.Format[this.bindingTrackOutputs.size()];
        for (int i = 0; i < this.bindingTrackOutputs.size(); i++) {
            formatArr[i] = (com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.bindingTrackOutputs.valueAt(i).sampleFormat);
        }
        this.sampleFormats = formatArr;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(com.google.android.exoplayer2.extractor.SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    private static final class BindingTrackOutput implements com.google.android.exoplayer2.extractor.TrackOutput {
        private long endTimeUs;
        private final com.google.android.exoplayer2.extractor.DummyTrackOutput fakeTrackOutput = new com.google.android.exoplayer2.extractor.DummyTrackOutput();
        private final int id;
        private final com.google.android.exoplayer2.Format manifestFormat;
        public com.google.android.exoplayer2.Format sampleFormat;
        private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;
        private final int type;

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader dataReader, int i, boolean z) {
            int sampleData;
            sampleData = sampleData(dataReader, i, z, 0);
            return sampleData;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
            sampleData(parsableByteArray, i, 0);
        }

        public BindingTrackOutput(int i, int i2, com.google.android.exoplayer2.Format format) {
            this.id = i;
            this.type = i2;
            this.manifestFormat = format;
        }

        public void bind(com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j;
            com.google.android.exoplayer2.extractor.TrackOutput track = trackOutputProvider.track(this.id, this.type);
            this.trackOutput = track;
            com.google.android.exoplayer2.Format format = this.sampleFormat;
            if (format != null) {
                track.format(format);
            }
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(com.google.android.exoplayer2.Format format) {
            com.google.android.exoplayer2.Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.trackOutput)).format(this.sampleFormat);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(com.google.android.exoplayer2.upstream.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
            return ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.trackOutput)).sampleData(dataReader, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2) {
            ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.trackOutput)).sampleData(parsableByteArray, i);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData) {
            long j2 = this.endTimeUs;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.trackOutput = this.fakeTrackOutput;
            }
            ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.trackOutput)).sampleMetadata(j, i, i2, i3, cryptoData);
        }
    }
}
