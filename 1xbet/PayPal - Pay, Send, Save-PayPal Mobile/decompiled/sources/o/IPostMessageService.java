package o;

/* loaded from: classes5.dex */
public final class IPostMessageService extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public IPostMessageService(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.statsig.androidsdk.StatsigOfflineRequest statsigOfflineRequest = (com.statsig.androidsdk.StatsigOfflineRequest) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = statsigOfflineRequest.eventCount;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 315);
        jsonWriter.value(statsigOfflineRequest.eventCount);
        java.lang.String str2 = statsigOfflineRequest.requestBody;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        jsonWriter.value(statsigOfflineRequest.requestBody);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 367);
        jsonWriter.value(java.lang.Integer.valueOf(statsigOfflineRequest.retryCount));
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 91);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(statsigOfflineRequest.timestamp);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.StatsigOfflineRequest statsigOfflineRequest = new com.statsig.androidsdk.StatsigOfflineRequest();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 127) {
                if (highResolutionOutputSizeshNQ4ISI != 131) {
                    if (highResolutionOutputSizeshNQ4ISI != 236) {
                        if (highResolutionOutputSizeshNQ4ISI != 348) {
                            jsonReader.skipValue();
                        } else if (z) {
                            statsigOfflineRequest.eventCount = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            statsigOfflineRequest.eventCount = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        statsigOfflineRequest.timestamp = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    try {
                        statsigOfflineRequest.retryCount = jsonReader.nextInt();
                    } catch (java.lang.NumberFormatException e) {
                        throw new com.google.gson.JsonSyntaxException(e);
                    }
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                statsigOfflineRequest.requestBody = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                statsigOfflineRequest.requestBody = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return statsigOfflineRequest;
    }
}
