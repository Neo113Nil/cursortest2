package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoFpsRanges extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getHighSpeedVideoFpsRanges(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.ExpirationDate expirationDate = (com.visa.cbp.external.common.ExpirationDate) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (expirationDate != expirationDate.month) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 328);
            jsonWriter.value(expirationDate.month);
        }
        if (expirationDate != expirationDate.year) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 150);
            jsonWriter.value(expirationDate.year);
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
        com.visa.cbp.external.common.ExpirationDate expirationDate = new com.visa.cbp.external.common.ExpirationDate();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 146) {
                if (highResolutionOutputSizeshNQ4ISI != 397) {
                    jsonReader.skipValue();
                } else if (z) {
                    expirationDate.month = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    expirationDate.month = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                expirationDate.year = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                expirationDate.year = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return expirationDate;
    }
}
