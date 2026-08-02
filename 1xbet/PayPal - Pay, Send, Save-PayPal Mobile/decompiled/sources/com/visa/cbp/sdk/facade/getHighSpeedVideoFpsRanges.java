package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoFpsRanges extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getHighSpeedVideoFpsRanges(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.visa.cbp.sdk.facade.ApuKey apuKey = (com.visa.cbp.sdk.facade.ApuKey) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (apuKey != apuKey.agr_key_knd) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 309);
            jsonWriter.value(apuKey.agr_key_knd);
        }
        if (apuKey != apuKey.jwk) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 388);
            com.visa.cbp.sdk.facade.JwkApu jwkApu = apuKey.jwk;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.JwkApu.class, jwkApu).write(jsonWriter, jwkApu);
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
        com.visa.cbp.sdk.facade.ApuKey apuKey = new com.visa.cbp.sdk.facade.ApuKey();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 10) {
                if (highResolutionOutputSizeshNQ4ISI != 301) {
                    jsonReader.skipValue();
                } else if (z) {
                    apuKey.agr_key_knd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    apuKey.agr_key_knd = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                apuKey.jwk = (com.visa.cbp.sdk.facade.JwkApu) gson.getAdapter(com.visa.cbp.sdk.facade.JwkApu.class).read2(jsonReader);
            } else {
                apuKey.jwk = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return apuKey;
    }
}
