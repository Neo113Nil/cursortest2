package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getHighResolutionOutputSizeshNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public getHighResolutionOutputSizeshNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.getVPanEnrollmentID getvpanenrollmentid = (com.visa.cbp.getVPanEnrollmentID) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (getvpanenrollmentid != getvpanenrollmentid.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 345);
            jsonWriter.value(getvpanenrollmentid.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (getvpanenrollmentid != getvpanenrollmentid.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 453);
            jsonWriter.value(getvpanenrollmentid.Camera2StreamConfigurationMap);
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
        com.visa.cbp.getVPanEnrollmentID getvpanenrollmentid = new com.visa.cbp.getVPanEnrollmentID();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 247) {
                if (highResolutionOutputSizeshNQ4ISI != 287) {
                    jsonReader.skipValue();
                } else if (z) {
                    getvpanenrollmentid.Camera2StreamConfigurationMap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    getvpanenrollmentid.Camera2StreamConfigurationMap = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                getvpanenrollmentid.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                getvpanenrollmentid.getHighResolutionOutputSizeshNQ4ISI = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return getvpanenrollmentid;
    }
}
