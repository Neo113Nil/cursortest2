package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class coroutineBoundary extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public coroutineBoundary(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.Params params = (com.visa.cbp.sdk.facade.Params) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        if (params != params.hash) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
            jsonWriter.value(params.hash);
        }
        if (params != params.names) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 227);
            com.visa.cbp.sdk.facade.accessartificialFrame accessartificialframe = new com.visa.cbp.sdk.facade.accessartificialFrame();
            java.util.List<java.lang.String> list = params.names;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, accessartificialframe, list).write(jsonWriter, list);
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
        com.visa.cbp.sdk.facade.Params params = new com.visa.cbp.sdk.facade.Params();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 118) {
                if (highResolutionOutputSizeshNQ4ISI != 227) {
                    jsonReader.skipValue();
                } else if (z) {
                    params.hash = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    params.hash = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                params.names = (java.util.List) gson.getAdapter(new com.visa.cbp.sdk.facade.accessartificialFrame()).read2(jsonReader);
            } else {
                params.names = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return params;
    }
}
