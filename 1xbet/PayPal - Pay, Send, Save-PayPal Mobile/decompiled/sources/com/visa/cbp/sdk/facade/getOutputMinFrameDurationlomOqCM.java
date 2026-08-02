package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getOutputMinFrameDurationlomOqCM extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;

    public getOutputMinFrameDurationlomOqCM(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.IccKey iccKey = (com.visa.cbp.sdk.facade.IccKey) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (iccKey != iccKey.iccCRTPrivateKey) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 410);
            com.visa.cbp.sdk.facade.IccCRTPrivateKey iccCRTPrivateKey = iccKey.iccCRTPrivateKey;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.IccCRTPrivateKey.class, iccCRTPrivateKey).write(jsonWriter, iccCRTPrivateKey);
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
        com.visa.cbp.sdk.facade.IccKey iccKey = new com.visa.cbp.sdk.facade.IccKey();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 381) {
                jsonReader.skipValue();
            } else if (z) {
                iccKey.iccCRTPrivateKey = (com.visa.cbp.sdk.facade.IccCRTPrivateKey) gson.getAdapter(com.visa.cbp.sdk.facade.IccCRTPrivateKey.class).read2(jsonReader);
            } else {
                iccKey.iccCRTPrivateKey = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return iccKey;
    }
}
