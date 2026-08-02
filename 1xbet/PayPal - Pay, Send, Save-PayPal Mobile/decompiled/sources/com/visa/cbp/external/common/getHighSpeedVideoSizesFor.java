package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoSizesFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public getHighSpeedVideoSizesFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.IDVResponse iDVResponse = (com.visa.cbp.external.common.IDVResponse) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (iDVResponse != iDVResponse.codeExpiration) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 22);
            jsonWriter.value(iDVResponse.codeExpiration);
        }
        if (iDVResponse != iDVResponse.maxOTPRequestsAllowed) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 364);
            jsonWriter.value(iDVResponse.maxOTPRequestsAllowed);
        }
        if (iDVResponse != iDVResponse.maxOTPVerificationAllowed) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 438);
            jsonWriter.value(iDVResponse.maxOTPVerificationAllowed);
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
        com.visa.cbp.external.common.IDVResponse iDVResponse = new com.visa.cbp.external.common.IDVResponse();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 1) {
                if (highResolutionOutputSizeshNQ4ISI != 340) {
                    if (highResolutionOutputSizeshNQ4ISI != 431) {
                        jsonReader.skipValue();
                    } else if (z) {
                        iDVResponse.codeExpiration = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        iDVResponse.codeExpiration = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    iDVResponse.maxOTPRequestsAllowed = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    iDVResponse.maxOTPRequestsAllowed = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                iDVResponse.maxOTPVerificationAllowed = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                iDVResponse.maxOTPVerificationAllowed = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return iDVResponse;
    }
}
