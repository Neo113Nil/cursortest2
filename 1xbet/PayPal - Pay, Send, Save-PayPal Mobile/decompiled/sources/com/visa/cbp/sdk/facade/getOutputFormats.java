package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getOutputFormats extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;

    public getOutputFormats(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.Auth auth = (com.visa.cbp.sdk.facade.Auth) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        if (auth != auth.params) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 113);
            com.visa.cbp.sdk.facade.Params params = auth.params;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.Params.class, params).write(jsonWriter, params);
        }
        if (auth != auth.scheme) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 448);
            jsonWriter.value(auth.scheme);
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
        com.visa.cbp.sdk.facade.Auth auth = new com.visa.cbp.sdk.facade.Auth();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 136) {
                if (highResolutionOutputSizeshNQ4ISI != 417) {
                    jsonReader.skipValue();
                } else if (z) {
                    auth.params = (com.visa.cbp.sdk.facade.Params) gson.getAdapter(com.visa.cbp.sdk.facade.Params.class).read2(jsonReader);
                } else {
                    auth.params = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                auth.scheme = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                auth.scheme = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return auth;
    }
}
