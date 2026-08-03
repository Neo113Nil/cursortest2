package androidx.media3.extractor.ts;

/* loaded from: classes2.dex */
final class UserDataReader {
    private static final int USER_DATA_START_CODE = 434;
    private final java.util.List<androidx.media3.common.Format> closedCaptionFormats;
    private final androidx.media3.extractor.TrackOutput[] outputs;

    public UserDataReader(java.util.List<androidx.media3.common.Format> list) {
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
            track.format(new androidx.media3.common.Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i] = track;
        }
    }

    public void consume(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 9) {
            return;
        }
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if (readInt == USER_DATA_START_CODE && readInt2 == 1195456820 && readUnsignedByte == 3) {
            androidx.media3.extractor.CeaUtil.consumeCcData(j, parsableByteArray, this.outputs);
        }
    }
}
