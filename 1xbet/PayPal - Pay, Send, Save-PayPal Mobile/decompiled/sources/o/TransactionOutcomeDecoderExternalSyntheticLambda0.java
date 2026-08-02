package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda0 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public TransactionOutcomeDecoderExternalSyntheticLambda0(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.logic.implementation.Certificate.Companion companion = new com.payair.logic.implementation.Certificate.Companion();
        com.payair.logic.implementation.Certificate.Companion.Camera2StreamConfigurationMap(jsonReader, this.getHighSpeedVideoFpsRangesFor);
        return companion;
    }
}
