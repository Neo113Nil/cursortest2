package com.google.android.exoplayer2.extractor.avi;

/* loaded from: classes3.dex */
final class StreamNameChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    public final java.lang.String name;

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return 1852994675;
    }

    public static com.google.android.exoplayer2.extractor.avi.StreamNameChunk parseFrom(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        return new com.google.android.exoplayer2.extractor.avi.StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    private StreamNameChunk(java.lang.String str) {
        this.name = str;
    }
}
