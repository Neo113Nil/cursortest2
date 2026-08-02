package o;

/* loaded from: classes4.dex */
public final class IAuthTabCallback extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public IAuthTabCallback(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ParamsStatus paramsStatus = (com.payair.model.ParamsStatus) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        java.lang.String str = paramsStatus.reason;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 444);
        jsonWriter.value(paramsStatus.reason);
        java.lang.String str2 = paramsStatus.status;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 28);
        jsonWriter.value(paramsStatus.status);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ParamsStatus paramsStatus = new com.payair.model.ParamsStatus();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 188) {
                if (highResolutionOutputSizeshNQ4ISI != 212) {
                    jsonReader.skipValue();
                } else if (z) {
                    paramsStatus.status = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    paramsStatus.status = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                paramsStatus.reason = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                paramsStatus.reason = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return paramsStatus;
    }
}
