package o;

/* loaded from: classes4.dex */
public final class onRelationshipValidationResult extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public onRelationshipValidationResult(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.Track2DataDec track2DataDec = (com.payair.model.Track2DataDec) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = track2DataDec.svcCode;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
        jsonWriter.value(track2DataDec.svcCode);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.Track2DataDec track2DataDec = new com.payair.model.Track2DataDec();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 84) {
                jsonReader.skipValue();
            } else if (z) {
                track2DataDec.svcCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                track2DataDec.svcCode = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return track2DataDec;
    }
}
