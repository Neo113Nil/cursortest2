package androidx.media3.muxer;

/* loaded from: classes7.dex */
public interface Muxer extends java.lang.AutoCloseable {

    public interface Factory {
        androidx.media3.muxer.Muxer create(java.lang.String str) throws androidx.media3.muxer.MuxerException;

        com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i);

        default boolean supportsWritingNegativeTimestampsInEditList() {
            return false;
        }
    }

    void addMetadataEntry(androidx.media3.common.Metadata.Entry entry);

    int addTrack(androidx.media3.common.Format format) throws androidx.media3.muxer.MuxerException;

    @Override // java.lang.AutoCloseable
    void close() throws androidx.media3.muxer.MuxerException;

    void writeSampleData(int i, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) throws androidx.media3.muxer.MuxerException;
}
