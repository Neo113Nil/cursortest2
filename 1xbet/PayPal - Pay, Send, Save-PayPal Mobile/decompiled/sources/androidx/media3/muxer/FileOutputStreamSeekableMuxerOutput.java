package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class FileOutputStreamSeekableMuxerOutput implements androidx.media3.muxer.SeekableMuxerOutput {
    private final java.io.FileOutputStream getHighSpeedVideoFpsRanges;
    private final java.nio.channels.FileChannel getHighSpeedVideoFpsRangesFor;

    public FileOutputStreamSeekableMuxerOutput(java.io.FileOutputStream fileOutputStream) {
        this.getHighSpeedVideoFpsRanges = fileOutputStream;
        this.getHighSpeedVideoFpsRangesFor = fileOutputStream.getChannel();
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public final long getPosition() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.position();
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public final void setPosition(long j) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.position(j);
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public final long getSize() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public final void truncate(long j) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.truncate(j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.write(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.getHighSpeedVideoFpsRangesFor.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.close();
    }
}
