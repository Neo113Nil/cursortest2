package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class JsonConverter {
    public java.lang.String toJson() {
        return new com.google.gson.GsonBuilder().excludeFieldsWithModifiers(128).create().toJson(this);
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(com.google.gson.stream.JsonReader jsonReader, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            jsonReader.skipValue();
        }
        jsonReader.endObject();
    }
}
