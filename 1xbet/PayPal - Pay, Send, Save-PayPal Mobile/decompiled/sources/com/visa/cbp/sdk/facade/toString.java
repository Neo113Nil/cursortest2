package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class toString extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public toString(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.KeyAgr keyAgr = (com.visa.cbp.sdk.facade.KeyAgr) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (keyAgr != keyAgr.alg) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 161);
            jsonWriter.value(keyAgr.alg);
        }
        if (keyAgr != keyAgr.apu_keys) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
            com.visa.cbp.sdk.facade.getHighSpeedVideoSizes gethighspeedvideosizes = new com.visa.cbp.sdk.facade.getHighSpeedVideoSizes();
            java.util.List<com.visa.cbp.sdk.facade.ApuKey> list = keyAgr.apu_keys;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, gethighspeedvideosizes, list).write(jsonWriter, list);
        }
        if (keyAgr != keyAgr.apv_keys) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 251);
            com.visa.cbp.sdk.facade.getHighResolutionOutputSizeshNQ4ISI gethighresolutionoutputsizeshnq4isi = new com.visa.cbp.sdk.facade.getHighResolutionOutputSizeshNQ4ISI();
            java.util.List<com.visa.cbp.sdk.facade.ApvKey> list2 = keyAgr.apv_keys;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, gethighresolutionoutputsizeshnq4isi, list2).write(jsonWriter, list2);
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
        com.visa.cbp.sdk.facade.KeyAgr keyAgr = new com.visa.cbp.sdk.facade.KeyAgr();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 50) {
                if (highResolutionOutputSizeshNQ4ISI != 103) {
                    if (highResolutionOutputSizeshNQ4ISI != 444) {
                        jsonReader.skipValue();
                    } else if (z) {
                        keyAgr.apu_keys = (java.util.List) gson.getAdapter(new com.visa.cbp.sdk.facade.getHighSpeedVideoSizes()).read2(jsonReader);
                    } else {
                        keyAgr.apu_keys = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    keyAgr.alg = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    keyAgr.alg = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                keyAgr.apv_keys = (java.util.List) gson.getAdapter(new com.visa.cbp.sdk.facade.getHighResolutionOutputSizeshNQ4ISI()).read2(jsonReader);
            } else {
                keyAgr.apv_keys = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return keyAgr;
    }
}
