package o;

/* loaded from: classes5.dex */
public final class onSessionEnded extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public onSessionEnded(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(jsonWriter, obj == com.statsig.androidsdk.HashAlgorithm.SHA256 ? 346 : obj == com.statsig.androidsdk.HashAlgorithm.DJB2 ? 451 : obj == com.statsig.androidsdk.HashAlgorithm.NONE ? 99 : -1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        int highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(jsonReader);
        if (highSpeedVideoSizes == 23) {
            return com.statsig.androidsdk.HashAlgorithm.NONE;
        }
        if (highSpeedVideoSizes == 319) {
            return com.statsig.androidsdk.HashAlgorithm.SHA256;
        }
        if (highSpeedVideoSizes != 446) {
            return null;
        }
        return com.statsig.androidsdk.HashAlgorithm.DJB2;
    }
}
