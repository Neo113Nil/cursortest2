package androidx.media3.extractor.ts;

/* loaded from: classes2.dex */
public final class PassthroughSectionPayloadReader implements androidx.media3.extractor.ts.SectionPayloadReader {
    private androidx.media3.common.Format format;
    private androidx.media3.extractor.TrackOutput output;
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(java.lang.String str) {
        this.format = new androidx.media3.common.Format.Builder().setSampleMimeType(str).build();
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        androidx.media3.extractor.TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = track;
        track.format(this.format);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.timestampAdjuster.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.timestampAdjuster.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == -9223372036854775807L || timestampOffsetUs == -9223372036854775807L) {
            return;
        }
        if (timestampOffsetUs != this.format.subsampleOffsetUs) {
            androidx.media3.common.Format build = this.format.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.format = build;
            this.output.format(build);
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, bytesLeft);
        this.output.sampleMetadata(lastAdjustedTimestampUs, 1, bytesLeft, 0, null);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"timestampAdjuster", "output"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.timestampAdjuster);
        androidx.media3.common.util.Util.castNonNull(this.output);
    }
}
