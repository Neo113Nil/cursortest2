package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class ArtificialStackFrames extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public ArtificialStackFrames(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.ValidateDeviceRequest validateDeviceRequest = (com.visa.cbp.sdk.facade.ValidateDeviceRequest) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (validateDeviceRequest != validateDeviceRequest.jwsDevicePayload) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 206);
            jsonWriter.value(validateDeviceRequest.jwsDevicePayload);
        }
        if (validateDeviceRequest != validateDeviceRequest.jwsServerData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 33);
            jsonWriter.value(validateDeviceRequest.jwsServerData);
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
        com.visa.cbp.sdk.facade.ValidateDeviceRequest validateDeviceRequest = new com.visa.cbp.sdk.facade.ValidateDeviceRequest();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 158) {
                if (highResolutionOutputSizeshNQ4ISI != 378) {
                    jsonReader.skipValue();
                } else if (z) {
                    validateDeviceRequest.jwsDevicePayload = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    validateDeviceRequest.jwsDevicePayload = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                validateDeviceRequest.jwsServerData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                validateDeviceRequest.jwsServerData = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return validateDeviceRequest;
    }
}
