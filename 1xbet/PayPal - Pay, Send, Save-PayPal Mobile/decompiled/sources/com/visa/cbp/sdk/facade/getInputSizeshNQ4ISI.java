package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getInputSizeshNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public getInputSizeshNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.ApvKey apvKey = (com.visa.cbp.sdk.facade.ApvKey) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (apvKey != apvKey.agr_key_knd) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 309);
            jsonWriter.value(apvKey.agr_key_knd);
        }
        if (apvKey != apvKey.jwk) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 388);
            com.visa.cbp.sdk.facade.JwkApv jwkApv = apvKey.jwk;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.JwkApv.class, jwkApv).write(jsonWriter, jwkApv);
        }
        if (apvKey != apvKey.kid_knd) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 125);
            jsonWriter.value(apvKey.kid_knd);
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
        com.visa.cbp.sdk.facade.ApvKey apvKey = new com.visa.cbp.sdk.facade.ApvKey();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 10) {
                if (highResolutionOutputSizeshNQ4ISI != 253) {
                    if (highResolutionOutputSizeshNQ4ISI != 301) {
                        jsonReader.skipValue();
                    } else if (z) {
                        apvKey.agr_key_knd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        apvKey.agr_key_knd = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    apvKey.kid_knd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    apvKey.kid_knd = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                apvKey.jwk = (com.visa.cbp.sdk.facade.JwkApv) gson.getAdapter(com.visa.cbp.sdk.facade.JwkApv.class).read2(jsonReader);
            } else {
                apvKey.jwk = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return apvKey;
    }
}
