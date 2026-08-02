package o;

/* loaded from: classes5.dex */
public final class IResultReceiver2 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public IResultReceiver2(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.lcm.LcmTokenRequest lcmTokenRequest = (com.visa.cbp.external.lcm.LcmTokenRequest) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        if (lcmTokenRequest != lcmTokenRequest.updateReason) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 385);
            com.visa.cbp.external.common.UpdateReason updateReason = lcmTokenRequest.updateReason;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.UpdateReason.class, updateReason).write(jsonWriter, updateReason);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.external.lcm.LcmTokenRequest lcmTokenRequest = new com.visa.cbp.external.lcm.LcmTokenRequest();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 316) {
                jsonReader.skipValue();
            } else if (z) {
                lcmTokenRequest.updateReason = (com.visa.cbp.external.common.UpdateReason) gson.getAdapter(com.visa.cbp.external.common.UpdateReason.class).read2(jsonReader);
            } else {
                lcmTokenRequest.updateReason = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return lcmTokenRequest;
    }
}
