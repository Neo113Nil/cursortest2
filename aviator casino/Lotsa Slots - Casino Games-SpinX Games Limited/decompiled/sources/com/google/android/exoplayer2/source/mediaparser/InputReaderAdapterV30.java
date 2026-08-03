package com.google.android.exoplayer2.source.mediaparser;

/* loaded from: classes3.dex */
public final class InputReaderAdapterV30 implements android.media.MediaParser.SeekableInputReader {
    private long currentPosition;
    private com.google.android.exoplayer2.upstream.DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public void setDataReader(com.google.android.exoplayer2.upstream.DataReader dataReader, long j) {
        this.dataReader = dataReader;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = ((com.google.android.exoplayer2.upstream.DataReader) com.google.android.exoplayer2.util.Util.castNonNull(this.dataReader)).read(bArr, i, i2);
        this.currentPosition += read;
        return read;
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
        return this.currentPosition;
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.resourceLength;
    }
}
