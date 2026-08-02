package o;

/* loaded from: classes5.dex */
public final class onVerticalScrollEvent extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public onVerticalScrollEvent(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.Cache cache = (com.statsig.androidsdk.Cache) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        java.lang.Long l = cache.evaluationTime;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.setAucAID);
        java.lang.Long l2 = cache.evaluationTime;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Long.class, l2).write(jsonWriter, l2);
        com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments = cache.stickyUserExperiments;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 108);
        com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments2 = cache.stickyUserExperiments;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.statsig.androidsdk.StickyUserExperiments.class, stickyUserExperiments2).write(jsonWriter, stickyUserExperiments2);
        java.lang.String str = cache.userHash;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 250);
        jsonWriter.value(cache.userHash);
        com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = cache.values;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 389);
        com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse2 = cache.values;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse.class, successfulInitializeResponse2).write(jsonWriter, successfulInitializeResponse2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.Cache cache = new com.statsig.androidsdk.Cache();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 207) {
                if (highResolutionOutputSizeshNQ4ISI != 284) {
                    if (highResolutionOutputSizeshNQ4ISI != 373) {
                        if (highResolutionOutputSizeshNQ4ISI != 411) {
                            jsonReader.skipValue();
                        } else if (z) {
                            cache.userHash = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            cache.userHash = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        cache.stickyUserExperiments = (com.statsig.androidsdk.StickyUserExperiments) gson.getAdapter(com.statsig.androidsdk.StickyUserExperiments.class).read2(jsonReader);
                    } else {
                        cache.stickyUserExperiments = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    cache.values = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) gson.getAdapter(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse.class).read2(jsonReader);
                } else {
                    cache.values = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                cache.evaluationTime = (java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader);
            } else {
                cache.evaluationTime = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return cache;
    }
}
