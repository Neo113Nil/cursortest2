package o;

/* loaded from: classes5.dex */
public final class ResultReceiver extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public ResultReceiver(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.data.VisaCAKeys visaCAKeys = (com.visa.cbp.sdk.facade.data.VisaCAKeys) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        if (visaCAKeys != visaCAKeys.keys) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 160);
            o.ResultReceiver1 resultReceiver1 = new o.ResultReceiver1();
            java.util.List<com.visa.cbp.sdk.facade.data.Keys> list = visaCAKeys.keys;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, resultReceiver1, list).write(jsonWriter, list);
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
        com.visa.cbp.sdk.facade.data.VisaCAKeys visaCAKeys = new com.visa.cbp.sdk.facade.data.VisaCAKeys();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 297) {
                jsonReader.skipValue();
            } else if (z) {
                visaCAKeys.keys = (java.util.List) gson.getAdapter(new o.ResultReceiver1()).read2(jsonReader);
            } else {
                visaCAKeys.keys = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return visaCAKeys;
    }
}
