package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public final class SingleSampleMediaChunk extends com.google.android.exoplayer2.source.chunk.BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final com.google.android.exoplayer2.Format sampleFormat;
    private final int trackType;

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    public SingleSampleMediaChunk(com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.DataSpec dataSpec, com.google.android.exoplayer2.Format format, int i, java.lang.Object obj, long j, long j2, long j3, int i2, com.google.android.exoplayer2.Format format2) {
        super(dataSource, dataSpec, format, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.trackType = i2;
        this.sampleFormat = format2;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws java.io.IOException {
        com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput output = getOutput();
        output.setSampleOffsetUs(0L);
        com.google.android.exoplayer2.extractor.TrackOutput track = output.track(0, this.trackType);
        track.format(this.sampleFormat);
        try {
            long open = this.dataSource.open(this.dataSpec.subrange(this.nextLoadPosition));
            if (open != -1) {
                open += this.nextLoadPosition;
            }
            com.google.android.exoplayer2.extractor.DefaultExtractorInput defaultExtractorInput = new com.google.android.exoplayer2.extractor.DefaultExtractorInput(this.dataSource, this.nextLoadPosition, open);
            for (int i = 0; i != -1; i = track.sampleData((com.google.android.exoplayer2.upstream.DataReader) defaultExtractorInput, Integer.MAX_VALUE, true)) {
                this.nextLoadPosition += i;
            }
            track.sampleMetadata(this.startTimeUs, 1, (int) this.nextLoadPosition, 0, null);
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = true;
        } catch (java.lang.Throwable th) {
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
            throw th;
        }
    }
}
