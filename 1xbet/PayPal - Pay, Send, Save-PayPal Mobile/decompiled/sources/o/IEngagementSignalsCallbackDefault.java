package o;

/* loaded from: classes5.dex */
public final class IEngagementSignalsCallbackDefault extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public IEngagementSignalsCallbackDefault(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry = (com.statsig.androidsdk.FallbackInfoEntry) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 336);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(fallbackInfoEntry.expiryTime);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        if (fallbackInfoEntry != fallbackInfoEntry.previous) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 49);
            o.postMessage postmessage = new o.postMessage();
            java.util.List<java.lang.String> list = fallbackInfoEntry.previous;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, postmessage, list).write(jsonWriter, list);
        }
        java.lang.String str = fallbackInfoEntry.url;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 439);
        jsonWriter.value(fallbackInfoEntry.url);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry = new com.statsig.androidsdk.FallbackInfoEntry();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 14) {
                if (highResolutionOutputSizeshNQ4ISI != 173) {
                    if (highResolutionOutputSizeshNQ4ISI != 437) {
                        jsonReader.skipValue();
                    } else if (z) {
                        fallbackInfoEntry.expiryTime = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    fallbackInfoEntry.url = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    fallbackInfoEntry.url = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                fallbackInfoEntry.previous = (java.util.List) gson.getAdapter(new o.postMessage()).read2(jsonReader);
            } else {
                fallbackInfoEntry.previous = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return fallbackInfoEntry;
    }
}
