package androidx.media3.muxer;

/* loaded from: classes7.dex */
public interface SeekableMuxerOutput extends java.nio.channels.WritableByteChannel {
    long getPosition() throws java.io.IOException;

    long getSize() throws java.io.IOException;

    void setPosition(long j) throws java.io.IOException;

    void truncate(long j) throws java.io.IOException;

    static androidx.media3.muxer.SeekableMuxerOutput of(java.io.FileOutputStream fileOutputStream) {
        return new androidx.media3.muxer.FileOutputStreamSeekableMuxerOutput(fileOutputStream);
    }

    static androidx.media3.muxer.SeekableMuxerOutput of(java.lang.String str) throws java.io.FileNotFoundException {
        return new androidx.media3.muxer.FileOutputStreamSeekableMuxerOutput(new java.io.FileOutputStream(str));
    }
}
