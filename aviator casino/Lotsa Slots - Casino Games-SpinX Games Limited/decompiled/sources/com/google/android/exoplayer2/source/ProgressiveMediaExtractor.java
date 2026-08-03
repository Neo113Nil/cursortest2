package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public interface ProgressiveMediaExtractor {

    public interface Factory {
        com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(com.google.android.exoplayer2.analytics.PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(com.google.android.exoplayer2.upstream.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) throws java.io.IOException;

    int read(com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException;

    void release();

    void seek(long j, long j2);
}
