package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class isOutputSupportedForhNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public isOutputSupportedForhNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((com.visa.cbp.external.common.StaticParams) obj).getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, jsonWriter, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.external.common.StaticParams staticParams = new com.visa.cbp.external.common.StaticParams();
        staticParams.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, jsonReader, this.getHighResolutionOutputSizeshNQ4ISI);
        return staticParams;
    }
}
