package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoSizes extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public getHighSpeedVideoSizes(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((com.visa.cbp.external.common.AidInfo) obj).getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, jsonWriter, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.external.common.AidInfo aidInfo = new com.visa.cbp.external.common.AidInfo();
        aidInfo.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, jsonReader, this.getHighSpeedVideoSizes);
        return aidInfo;
    }
}
