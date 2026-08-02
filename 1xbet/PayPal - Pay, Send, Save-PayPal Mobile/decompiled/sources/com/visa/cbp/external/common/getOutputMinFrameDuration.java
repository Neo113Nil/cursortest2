package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getOutputMinFrameDuration extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;

    public getOutputMinFrameDuration(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.IDVRequest iDVRequest = (com.visa.cbp.external.common.IDVRequest) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        if (iDVRequest != iDVRequest.date) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 224);
            jsonWriter.value(iDVRequest.date);
        }
        if (iDVRequest != iDVRequest.stepUpRequestID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 257);
            jsonWriter.value(iDVRequest.stepUpRequestID);
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
        com.visa.cbp.external.common.IDVRequest iDVRequest = new com.visa.cbp.external.common.IDVRequest();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 55) {
                if (highResolutionOutputSizeshNQ4ISI != 224) {
                    jsonReader.skipValue();
                } else if (z) {
                    iDVRequest.stepUpRequestID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    iDVRequest.stepUpRequestID = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                iDVRequest.date = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                iDVRequest.date = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return iDVRequest;
    }
}
