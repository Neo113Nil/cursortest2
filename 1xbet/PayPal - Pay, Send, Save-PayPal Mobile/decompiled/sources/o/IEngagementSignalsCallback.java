package o;

/* loaded from: classes5.dex */
public final class IEngagementSignalsCallback extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public IEngagementSignalsCallback(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(jsonWriter, obj == com.statsig.androidsdk.Endpoint.Rgstr ? 147 : obj == com.statsig.androidsdk.Endpoint.Initialize ? 107 : -1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        int highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(jsonReader);
        if (highSpeedVideoSizes == 225) {
            return com.statsig.androidsdk.Endpoint.Rgstr;
        }
        if (highSpeedVideoSizes != 395) {
            return null;
        }
        return com.statsig.androidsdk.Endpoint.Initialize;
    }
}
