package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class unwrapAs extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public unwrapAs(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.JwkApv jwkApv = (com.visa.cbp.sdk.facade.JwkApv) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        if (jwkApv != jwkApv.kid) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
            jsonWriter.value(jwkApv.kid);
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
        com.visa.cbp.sdk.facade.JwkApv jwkApv = new com.visa.cbp.sdk.facade.JwkApv();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 274) {
                jsonReader.skipValue();
            } else if (z) {
                jwkApv.kid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                jwkApv.kid = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return jwkApv;
    }
}
