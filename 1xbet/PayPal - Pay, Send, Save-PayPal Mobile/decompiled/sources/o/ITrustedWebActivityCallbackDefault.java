package o;

/* loaded from: classes5.dex */
public final class ITrustedWebActivityCallbackDefault extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public ITrustedWebActivityCallbackDefault(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.StatsigPendingRequests statsigPendingRequests = (com.statsig.androidsdk.StatsigPendingRequests) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (statsigPendingRequests != statsigPendingRequests.requests) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
            o.cancelNotification cancelnotification = new o.cancelNotification();
            java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> list = statsigPendingRequests.requests;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, cancelnotification, list).write(jsonWriter, list);
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
        com.statsig.androidsdk.StatsigPendingRequests statsigPendingRequests = new com.statsig.androidsdk.StatsigPendingRequests();
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 42) {
                jsonReader.skipValue();
            } else if (z) {
                statsigPendingRequests.requests = (java.util.List) gson.getAdapter(new o.cancelNotification()).read2(jsonReader);
            } else {
                statsigPendingRequests.requests = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return statsigPendingRequests;
    }
}
