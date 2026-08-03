package com.google.android.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
final class UserDataReader {
    private static final int USER_DATA_START_CODE = 434;
    private final java.util.List<com.google.android.exoplayer2.Format> closedCaptionFormats;
    private final com.google.android.exoplayer2.extractor.TrackOutput[] outputs;

    public UserDataReader(java.util.List<com.google.android.exoplayer2.Format> list) {
        this.closedCaptionFormats = list;
        this.outputs = new com.google.android.exoplayer2.extractor.TrackOutput[list.size()];
    }

    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.outputs.length; i++) {
            trackIdGenerator.generateNewId();
            com.google.android.exoplayer2.extractor.TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            com.google.android.exoplayer2.Format format = this.closedCaptionFormats.get(i);
            java.lang.String str = format.sampleMimeType;
            com.google.android.exoplayer2.util.Assertions.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            track.format(new com.google.android.exoplayer2.Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i] = track;
        }
    }

    public void consume(long j, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 9) {
            return;
        }
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if (readInt == USER_DATA_START_CODE && readInt2 == 1195456820 && readUnsignedByte == 3) {
            com.google.android.exoplayer2.extractor.CeaUtil.consumeCcData(j, parsableByteArray, this.outputs);
        }
    }
}
