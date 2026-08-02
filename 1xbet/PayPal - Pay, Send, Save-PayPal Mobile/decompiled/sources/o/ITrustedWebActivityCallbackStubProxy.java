package o;

/* loaded from: classes5.dex */
public final class ITrustedWebActivityCallbackStubProxy extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public ITrustedWebActivityCallbackStubProxy(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.StatsigOverrides statsigOverrides = (com.statsig.androidsdk.StatsigOverrides) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (statsigOverrides != statsigOverrides.configs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 446);
            o.ITrustedWebActivityCallback iTrustedWebActivityCallback = new o.ITrustedWebActivityCallback();
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap = statsigOverrides.configs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iTrustedWebActivityCallback, concurrentHashMap).write(jsonWriter, concurrentHashMap);
        }
        if (statsigOverrides != statsigOverrides.gates) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 128);
            o.ITrustedWebActivityCallbackStub iTrustedWebActivityCallbackStub = new o.ITrustedWebActivityCallbackStub();
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> concurrentHashMap2 = statsigOverrides.gates;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iTrustedWebActivityCallbackStub, concurrentHashMap2).write(jsonWriter, concurrentHashMap2);
        }
        if (statsigOverrides != statsigOverrides.layers) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 1);
            o.getSmallIconBitmap getsmalliconbitmap = new o.getSmallIconBitmap();
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap3 = statsigOverrides.layers;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, getsmalliconbitmap, concurrentHashMap3).write(jsonWriter, concurrentHashMap3);
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
        com.statsig.androidsdk.StatsigOverrides statsigOverrides = new com.statsig.androidsdk.StatsigOverrides();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 211) {
                if (highResolutionOutputSizeshNQ4ISI != 344) {
                    if (highResolutionOutputSizeshNQ4ISI != 370) {
                        jsonReader.skipValue();
                    } else if (z) {
                        statsigOverrides.layers = (java.util.concurrent.ConcurrentHashMap) gson.getAdapter(new o.getSmallIconBitmap()).read2(jsonReader);
                    } else {
                        statsigOverrides.layers = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    statsigOverrides.configs = (java.util.concurrent.ConcurrentHashMap) gson.getAdapter(new o.ITrustedWebActivityCallback()).read2(jsonReader);
                } else {
                    statsigOverrides.configs = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                statsigOverrides.gates = (java.util.concurrent.ConcurrentHashMap) gson.getAdapter(new o.ITrustedWebActivityCallbackStub()).read2(jsonReader);
            } else {
                statsigOverrides.gates = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return statsigOverrides;
    }
}
