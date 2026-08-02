package o;

/* loaded from: classes5.dex */
public final class getActiveNotifications extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getActiveNotifications(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.evaluator.SpecParamStore specParamStore = (com.statsig.androidsdk.evaluator.SpecParamStore) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (specParamStore != specParamStore.parameters) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 403);
            o.ITrustedWebActivityServiceStubProxy iTrustedWebActivityServiceStubProxy = new o.ITrustedWebActivityServiceStubProxy();
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map = specParamStore.parameters;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iTrustedWebActivityServiceStubProxy, map).write(jsonWriter, map);
        }
        if (specParamStore != specParamStore.targetAppIDs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 10);
            o.notify notifyVar = new o.notify();
            java.util.List<java.lang.String> list = specParamStore.targetAppIDs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, notifyVar, list).write(jsonWriter, list);
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
        com.statsig.androidsdk.evaluator.SpecParamStore specParamStore = new com.statsig.androidsdk.evaluator.SpecParamStore();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 57) {
                if (highResolutionOutputSizeshNQ4ISI != 76) {
                    jsonReader.skipValue();
                } else if (z) {
                    specParamStore.parameters = (java.util.Map) gson.getAdapter(new o.ITrustedWebActivityServiceStubProxy()).read2(jsonReader);
                } else {
                    specParamStore.parameters = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                specParamStore.targetAppIDs = (java.util.List) gson.getAdapter(new o.notify()).read2(jsonReader);
            } else {
                specParamStore.targetAppIDs = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return specParamStore;
    }
}
