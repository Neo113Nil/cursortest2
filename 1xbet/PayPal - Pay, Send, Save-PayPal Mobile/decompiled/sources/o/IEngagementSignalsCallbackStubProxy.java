package o;

/* loaded from: classes5.dex */
public final class IEngagementSignalsCallbackStubProxy extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public IEngagementSignalsCallbackStubProxy(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.LogEventData logEventData = (com.statsig.androidsdk.LogEventData) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        if (logEventData != logEventData.events) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 380);
            o.warmup warmupVar = new o.warmup();
            java.util.ArrayList<com.statsig.androidsdk.LogEvent> arrayList = logEventData.events;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, warmupVar, arrayList).write(jsonWriter, arrayList);
        }
        com.statsig.androidsdk.StatsigMetadata statsigMetadata = logEventData.statsigMetadata;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 29);
        com.statsig.androidsdk.StatsigMetadata statsigMetadata2 = logEventData.statsigMetadata;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.statsig.androidsdk.StatsigMetadata.class, statsigMetadata2).write(jsonWriter, statsigMetadata2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.LogEventData logEventData = new com.statsig.androidsdk.LogEventData();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 198) {
                if (highResolutionOutputSizeshNQ4ISI != 306) {
                    jsonReader.skipValue();
                } else if (z) {
                    logEventData.events = (java.util.ArrayList) gson.getAdapter(new o.warmup()).read2(jsonReader);
                } else {
                    logEventData.events = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                logEventData.statsigMetadata = (com.statsig.androidsdk.StatsigMetadata) gson.getAdapter(com.statsig.androidsdk.StatsigMetadata.class).read2(jsonReader);
            } else {
                logEventData.statsigMetadata = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return logEventData;
    }
}
