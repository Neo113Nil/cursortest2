package com.google.android.exoplayer2.extractor.avi;

/* loaded from: classes3.dex */
final class AviMainHeaderChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    private static final int AVIF_HAS_INDEX = 16;
    public final int flags;
    public final int frameDurationUs;
    public final int streams;
    public final int totalFrames;

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return 1751742049;
    }

    public static com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk parseFrom(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(8);
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        return new com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk(readLittleEndianInt, readLittleEndianInt2, readLittleEndianInt3, readLittleEndianInt4);
    }

    private AviMainHeaderChunk(int i, int i2, int i3, int i4) {
        this.frameDurationUs = i;
        this.flags = i2;
        this.totalFrames = i3;
        this.streams = i4;
    }

    public boolean hasIndex() {
        return (this.flags & 16) == 16;
    }
}
