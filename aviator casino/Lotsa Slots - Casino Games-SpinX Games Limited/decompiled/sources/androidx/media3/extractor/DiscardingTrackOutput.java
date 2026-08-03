package androidx.media3.extractor;

/* loaded from: classes2.dex */
public final class DiscardingTrackOutput implements androidx.media3.extractor.TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public void format(androidx.media3.common.Format format) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public /* synthetic */ int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z) {
        int sampleData;
        sampleData = sampleData(dataReader, i, z, 0);
        return sampleData;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public /* synthetic */ void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
        int read = dataReader.read(this.readBuffer, 0, java.lang.Math.min(this.readBuffer.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.skipBytes(i);
    }
}
