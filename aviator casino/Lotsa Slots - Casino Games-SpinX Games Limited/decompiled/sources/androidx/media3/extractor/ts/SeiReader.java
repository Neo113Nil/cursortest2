package androidx.media3.extractor.ts;

/* loaded from: classes2.dex */
public final class SeiReader {
    private final java.util.List<androidx.media3.common.Format> closedCaptionFormats;
    private final androidx.media3.extractor.TrackOutput[] outputs;

    public SeiReader(java.util.List<androidx.media3.common.Format> list) {
        this.closedCaptionFormats = list;
        this.outputs = new androidx.media3.extractor.TrackOutput[list.size()];
    }

    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.outputs.length; i++) {
            trackIdGenerator.generateNewId();
            androidx.media3.extractor.TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            androidx.media3.common.Format format = this.closedCaptionFormats.get(i);
            java.lang.String str = format.sampleMimeType;
            androidx.media3.common.util.Assertions.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            track.format(new androidx.media3.common.Format.Builder().setId(format.id != null ? format.id : trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i] = track;
        }
    }

    public void consume(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.extractor.CeaUtil.consume(j, parsableByteArray, this.outputs);
    }
}
