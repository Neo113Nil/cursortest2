package com.google.android.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class PassthroughSectionPayloadReader implements com.google.android.exoplayer2.extractor.ts.SectionPayloadReader {
    private com.google.android.exoplayer2.Format format;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(java.lang.String str) {
        this.format = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType(str).build();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void init(com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        com.google.android.exoplayer2.extractor.TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = track;
        track.format(this.format);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.timestampAdjuster.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.timestampAdjuster.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == -9223372036854775807L || timestampOffsetUs == -9223372036854775807L) {
            return;
        }
        if (timestampOffsetUs != this.format.subsampleOffsetUs) {
            com.google.android.exoplayer2.Format build = this.format.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.format = build;
            this.output.format(build);
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, bytesLeft);
        this.output.sampleMetadata(lastAdjustedTimestampUs, 1, bytesLeft, 0, null);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"timestampAdjuster", "output"})
    private void assertInitialized() {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.timestampAdjuster);
        com.google.android.exoplayer2.util.Util.castNonNull(this.output);
    }
}
