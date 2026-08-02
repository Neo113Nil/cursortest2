package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class unwrapAs extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public unwrapAs(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.TermsAndConditions termsAndConditions = (com.visa.cbp.external.common.TermsAndConditions) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        if (termsAndConditions != termsAndConditions.date) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 224);
            jsonWriter.value(termsAndConditions.date);
        }
        if (termsAndConditions != termsAndConditions.id) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 83);
            jsonWriter.value(termsAndConditions.id);
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
        com.visa.cbp.external.common.TermsAndConditions termsAndConditions = new com.visa.cbp.external.common.TermsAndConditions();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 48) {
                if (highResolutionOutputSizeshNQ4ISI != 55) {
                    jsonReader.skipValue();
                } else if (z) {
                    termsAndConditions.date = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    termsAndConditions.date = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                termsAndConditions.id = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                termsAndConditions.id = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return termsAndConditions;
    }
}
