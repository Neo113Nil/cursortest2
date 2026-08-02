package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class isOutputSupportedForhNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public isOutputSupportedForhNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.KeyDm keyDm = (com.visa.cbp.sdk.facade.KeyDm) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (keyDm != keyDm.alg) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 161);
            jsonWriter.value(keyDm.alg);
        }
        if (keyDm != keyDm.dkm_parts) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 239);
            com.visa.cbp.sdk.facade.Camera2StreamConfigurationMap camera2StreamConfigurationMap = new com.visa.cbp.sdk.facade.Camera2StreamConfigurationMap();
            java.util.List<com.visa.cbp.sdk.facade.DkmPart> list = keyDm.dkm_parts;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, camera2StreamConfigurationMap, list).write(jsonWriter, list);
        }
        if (keyDm != keyDm.mac_tag_alg) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 192);
            jsonWriter.value(keyDm.mac_tag_alg);
        }
        if (keyDm != keyDm.nonce) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 404);
            jsonWriter.value(keyDm.nonce);
        }
        if (keyDm != keyDm.op_profile) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 142);
            jsonWriter.value(keyDm.op_profile);
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
        com.visa.cbp.sdk.facade.KeyDm keyDm = new com.visa.cbp.sdk.facade.KeyDm();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 103) {
                if (highResolutionOutputSizeshNQ4ISI != 174) {
                    if (highResolutionOutputSizeshNQ4ISI != 213) {
                        if (highResolutionOutputSizeshNQ4ISI != 222) {
                            if (highResolutionOutputSizeshNQ4ISI != 300) {
                                jsonReader.skipValue();
                            } else if (z) {
                                keyDm.dkm_parts = (java.util.List) gson.getAdapter(new com.visa.cbp.sdk.facade.Camera2StreamConfigurationMap()).read2(jsonReader);
                            } else {
                                keyDm.dkm_parts = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            keyDm.nonce = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            keyDm.nonce = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        keyDm.op_profile = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        keyDm.op_profile = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    keyDm.mac_tag_alg = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    keyDm.mac_tag_alg = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                keyDm.alg = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                keyDm.alg = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return keyDm;
    }
}
