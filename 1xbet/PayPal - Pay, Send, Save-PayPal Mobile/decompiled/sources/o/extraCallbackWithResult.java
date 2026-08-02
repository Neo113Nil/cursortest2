package o;

/* loaded from: classes4.dex */
public final class extraCallbackWithResult extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public extraCallbackWithResult(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.payair.model.SeCardPerso seCardPerso = (com.payair.model.SeCardPerso) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (seCardPerso != seCardPerso.apduPerso) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
            o.onActivityResized onactivityresized = new o.onActivityResized();
            java.util.List<com.payair.model.ApduPerso> list = seCardPerso.apduPerso;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, onactivityresized, list).write(jsonWriter, list);
        }
        java.lang.String str = seCardPerso.appletInstanceAID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 431);
        jsonWriter.value(seCardPerso.appletInstanceAID);
        java.lang.String str2 = seCardPerso.priorityCode;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 340);
        jsonWriter.value(seCardPerso.priorityCode);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.SeCardPerso seCardPerso = new com.payair.model.SeCardPerso();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 135) {
                if (highResolutionOutputSizeshNQ4ISI != 217) {
                    if (highResolutionOutputSizeshNQ4ISI != 368) {
                        jsonReader.skipValue();
                    } else if (z) {
                        seCardPerso.apduPerso = (java.util.List) gson.getAdapter(new o.onActivityResized()).read2(jsonReader);
                    } else {
                        seCardPerso.apduPerso = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    seCardPerso.priorityCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    seCardPerso.priorityCode = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                seCardPerso.appletInstanceAID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                seCardPerso.appletInstanceAID = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return seCardPerso;
    }
}
