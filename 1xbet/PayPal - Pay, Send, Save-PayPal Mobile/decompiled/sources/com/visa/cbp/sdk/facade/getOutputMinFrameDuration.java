package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getOutputMinFrameDuration extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getOutputMinFrameDuration(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.DkmPart dkmPart = (com.visa.cbp.sdk.facade.DkmPart) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (dkmPart != dkmPart.key_fun) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 104);
            jsonWriter.value(dkmPart.key_fun);
        }
        if (dkmPart != dkmPart.kid) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
            jsonWriter.value(dkmPart.kid);
        }
        if (dkmPart != dkmPart.length) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE);
            java.lang.Integer num = dkmPart.length;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num).write(jsonWriter, num);
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
        com.visa.cbp.sdk.facade.DkmPart dkmPart = new com.visa.cbp.sdk.facade.DkmPart();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 0) {
                if (highResolutionOutputSizeshNQ4ISI != 274) {
                    if (highResolutionOutputSizeshNQ4ISI != 282) {
                        jsonReader.skipValue();
                    } else if (z) {
                        dkmPart.key_fun = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        dkmPart.key_fun = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    dkmPart.kid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    dkmPart.kid = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                dkmPart.length = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
            } else {
                dkmPart.length = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return dkmPart;
    }
}
