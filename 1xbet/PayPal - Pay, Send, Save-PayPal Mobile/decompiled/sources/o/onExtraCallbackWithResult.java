package o;

/* loaded from: classes4.dex */
public final class onExtraCallbackWithResult extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public onExtraCallbackWithResult(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.PersoApplicationData persoApplicationData = (com.payair.model.PersoApplicationData) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = persoApplicationData.dataName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 6);
        jsonWriter.value(persoApplicationData.dataName);
        java.lang.String str2 = persoApplicationData.dataTag;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 353);
        jsonWriter.value(persoApplicationData.dataTag);
        java.lang.String str3 = persoApplicationData.dataValue;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 14);
        jsonWriter.value(persoApplicationData.dataValue);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.PersoApplicationData persoApplicationData = new com.payair.model.PersoApplicationData();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 8) {
                if (highResolutionOutputSizeshNQ4ISI != 275) {
                    if (highResolutionOutputSizeshNQ4ISI != 302) {
                        jsonReader.skipValue();
                    } else if (z) {
                        persoApplicationData.dataName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        persoApplicationData.dataName = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    persoApplicationData.dataTag = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    persoApplicationData.dataTag = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                persoApplicationData.dataValue = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                persoApplicationData.dataValue = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return persoApplicationData;
    }
}
