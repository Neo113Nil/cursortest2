package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public interface ChunkExtractor {

    public interface Factory {
        com.google.android.exoplayer2.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, com.google.android.exoplayer2.Format format, boolean z, java.util.List<com.google.android.exoplayer2.Format> list, com.google.android.exoplayer2.extractor.TrackOutput trackOutput, com.google.android.exoplayer2.analytics.PlayerId playerId);
    }

    public interface TrackOutputProvider {
        com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2);
    }

    com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex();

    com.google.android.exoplayer2.Format[] getSampleFormats();

    void init(com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void release();
}
