package androidx.media3.exoplayer.source.chunk;

/* loaded from: classes2.dex */
public interface ChunkExtractor {

    public interface Factory {

        /* renamed from: androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory $default$experimentalParseSubtitlesDuringExtraction(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory _this, boolean z) {
                return _this;
            }

            public static androidx.media3.common.Format $default$getOutputTextFormat(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory _this, androidx.media3.common.Format format) {
                return format;
            }

            public static androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory $default$setSubtitleParserFactory(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory _this, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
                return _this;
            }
        }

        androidx.media3.exoplayer.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, androidx.media3.common.Format format, boolean z, java.util.List<androidx.media3.common.Format> list, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.exoplayer.analytics.PlayerId playerId);

        androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory experimentalParseSubtitlesDuringExtraction(boolean z);

        androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format);

        androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory);
    }

    public interface TrackOutputProvider {
        androidx.media3.extractor.TrackOutput track(int i, int i2);
    }

    androidx.media3.extractor.ChunkIndex getChunkIndex();

    androidx.media3.common.Format[] getSampleFormats();

    void init(androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void release();
}
