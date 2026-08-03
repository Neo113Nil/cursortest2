package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public class ContainerMediaChunk extends com.google.android.exoplayer2.source.chunk.BaseMediaChunk {
    private final int chunkCount;
    private final com.google.android.exoplayer2.source.chunk.ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    protected com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider getTrackOutputProvider(com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    public ContainerMediaChunk(com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.DataSpec dataSpec, com.google.android.exoplayer2.Format format, int i, java.lang.Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, com.google.android.exoplayer2.source.chunk.ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3, j4, j5);
        this.chunkCount = i2;
        this.sampleOffsetUs = j6;
        this.chunkExtractor = chunkExtractor;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + this.chunkCount;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
        if (this.nextLoadPosition == 0) {
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput output = getOutput();
            output.setSampleOffsetUs(this.sampleOffsetUs);
            this.chunkExtractor.init(getTrackOutputProvider(output), this.clippedStartTimeUs == -9223372036854775807L ? -9223372036854775807L : this.clippedStartTimeUs - this.sampleOffsetUs, this.clippedEndTimeUs != -9223372036854775807L ? this.clippedEndTimeUs - this.sampleOffsetUs : -9223372036854775807L);
        }
        try {
            com.google.android.exoplayer2.upstream.DataSpec subrange = this.dataSpec.subrange(this.nextLoadPosition);
            com.google.android.exoplayer2.extractor.DefaultExtractorInput defaultExtractorInput = new com.google.android.exoplayer2.extractor.DefaultExtractorInput(this.dataSource, subrange.position, this.dataSource.open(subrange));
            while (!this.loadCanceled && this.chunkExtractor.read(defaultExtractorInput)) {
                try {
                } finally {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                }
            }
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (java.lang.Throwable th) {
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
            throw th;
        }
    }
}
