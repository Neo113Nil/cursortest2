package androidx.media3.extractor.avi;

/* loaded from: classes2.dex */
final class StreamNameChunk implements androidx.media3.extractor.avi.AviChunk {
    public final java.lang.String name;

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 1852994675;
    }

    public static androidx.media3.extractor.avi.StreamNameChunk parseFrom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return new androidx.media3.extractor.avi.StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    private StreamNameChunk(java.lang.String str) {
        this.name = str;
    }
}
