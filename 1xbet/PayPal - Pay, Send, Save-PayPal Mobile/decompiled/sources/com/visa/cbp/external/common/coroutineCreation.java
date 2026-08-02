package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class coroutineCreation extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public coroutineCreation(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.Track2DataNotDec track2DataNotDec = (com.visa.cbp.external.common.Track2DataNotDec) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (track2DataNotDec != track2DataNotDec.pinVerField) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 52);
            jsonWriter.value(track2DataNotDec.pinVerField);
        }
        if (track2DataNotDec != track2DataNotDec.svcCode) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
            jsonWriter.value(track2DataNotDec.svcCode);
        }
        if (track2DataNotDec != track2DataNotDec.track2DiscData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
            jsonWriter.value(track2DataNotDec.track2DiscData);
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
        com.visa.cbp.external.common.Track2DataNotDec track2DataNotDec = new com.visa.cbp.external.common.Track2DataNotDec();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 84) {
                if (highResolutionOutputSizeshNQ4ISI != 126) {
                    if (highResolutionOutputSizeshNQ4ISI != 324) {
                        jsonReader.skipValue();
                    } else if (z) {
                        track2DataNotDec.pinVerField = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        track2DataNotDec.pinVerField = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    track2DataNotDec.track2DiscData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    track2DataNotDec.track2DiscData = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                track2DataNotDec.svcCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                track2DataNotDec.svcCode = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return track2DataNotDec;
    }
}
