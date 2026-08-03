package androidx.media3.exoplayer.source.chunk;

/* loaded from: classes2.dex */
public class ContainerMediaChunk extends androidx.media3.exoplayer.source.chunk.BaseMediaChunk {
    private final int chunkCount;
    private final androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    protected androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider getTrackOutputProvider(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    public ContainerMediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i, java.lang.Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3, j4, j5);
        this.chunkCount = i2;
        this.sampleOffsetUs = j6;
        this.chunkExtractor = chunkExtractor;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + this.chunkCount;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            this.chunkExtractor.init(getTrackOutputProvider(output), this.clippedStartTimeUs == -9223372036854775807L ? -9223372036854775807L : this.clippedStartTimeUs - this.sampleOffsetUs, this.clippedEndTimeUs != -9223372036854775807L ? this.clippedEndTimeUs - this.sampleOffsetUs : -9223372036854775807L);
        }
        try {
            androidx.media3.datasource.DataSpec subrange = this.dataSpec.subrange(this.nextLoadPosition);
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(this.dataSource, subrange.position, this.dataSource.open(subrange));
            while (!this.loadCanceled && this.chunkExtractor.read(defaultExtractorInput)) {
                try {
                } finally {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                }
            }
            maybeWriteEmptySamples(output);
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (java.lang.Throwable th) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            throw th;
        }
    }

    private void maybeWriteEmptySamples(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        if (androidx.media3.common.MimeTypes.isImage(this.trackFormat.containerMimeType)) {
            if ((this.trackFormat.tileCountHorizontal <= 1 && this.trackFormat.tileCountVertical <= 1) || this.trackFormat.tileCountHorizontal == -1 || this.trackFormat.tileCountVertical == -1) {
                return;
            }
            androidx.media3.extractor.TrackOutput track = baseMediaChunkOutput.track(0, 4);
            int i = this.trackFormat.tileCountHorizontal * this.trackFormat.tileCountVertical;
            long j = (this.endTimeUs - this.startTimeUs) / i;
            for (int i2 = 1; i2 < i; i2++) {
                track.sampleData(new androidx.media3.common.util.ParsableByteArray(), 0);
                track.sampleMetadata(i2 * j, 0, 0, 0, null);
            }
        }
    }
}
