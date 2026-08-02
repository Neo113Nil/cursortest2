package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoFpsRangesFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public getHighSpeedVideoFpsRangesFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.DigitalTicket digitalTicket = (com.visa.cbp.external.common.DigitalTicket) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (digitalTicket != digitalTicket.ticketMetaData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 117);
            jsonWriter.value(digitalTicket.ticketMetaData);
        }
        if (digitalTicket != digitalTicket.vdtContainer) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 16);
            jsonWriter.value(digitalTicket.vdtContainer);
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
        com.visa.cbp.external.common.DigitalTicket digitalTicket = new com.visa.cbp.external.common.DigitalTicket();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 4) {
                if (highResolutionOutputSizeshNQ4ISI != 379) {
                    jsonReader.skipValue();
                } else if (z) {
                    digitalTicket.vdtContainer = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    digitalTicket.vdtContainer = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                digitalTicket.ticketMetaData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                digitalTicket.ticketMetaData = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return digitalTicket;
    }
}
