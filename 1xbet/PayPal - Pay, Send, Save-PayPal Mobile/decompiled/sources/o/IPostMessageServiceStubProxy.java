package o;

/* loaded from: classes5.dex */
public final class IPostMessageServiceStubProxy extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;

    public IPostMessageServiceStubProxy(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments = (com.statsig.androidsdk.StickyUserExperiments) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        if (stickyUserExperiments != stickyUserExperiments.experiments) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 389);
            o.areNotificationsEnabled arenotificationsenabled = new o.areNotificationsEnabled();
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map = stickyUserExperiments.experiments;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, arenotificationsenabled, map).write(jsonWriter, map);
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
        com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments = new com.statsig.androidsdk.StickyUserExperiments();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 284) {
                jsonReader.skipValue();
            } else if (z) {
                stickyUserExperiments.experiments = (java.util.Map) gson.getAdapter(new o.areNotificationsEnabled()).read2(jsonReader);
            } else {
                stickyUserExperiments.experiments = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return stickyUserExperiments;
    }
}
