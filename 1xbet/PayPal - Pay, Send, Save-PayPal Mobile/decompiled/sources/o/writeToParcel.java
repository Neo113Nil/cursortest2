package o;

/* loaded from: classes5.dex */
public final class writeToParcel extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public writeToParcel(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(jsonWriter, obj == com.visa.cbp.sdk.facade.data.VerifyingEntity.MOBILE_APP ? 112 : obj == com.visa.cbp.sdk.facade.data.VerifyingEntity.VERIFIED_CLOUD ? 414 : obj == com.visa.cbp.sdk.facade.data.VerifyingEntity.VERIFIED_MOBILE_DEVICE ? 31 : obj == com.visa.cbp.sdk.facade.data.VerifyingEntity.NO_CD_CVM ? 435 : -1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        int highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(jsonReader);
        if (highSpeedVideoSizes == 74) {
            return com.visa.cbp.sdk.facade.data.VerifyingEntity.NO_CD_CVM;
        }
        if (highSpeedVideoSizes == 130) {
            return com.visa.cbp.sdk.facade.data.VerifyingEntity.VERIFIED_MOBILE_DEVICE;
        }
        if (highSpeedVideoSizes == 250) {
            return com.visa.cbp.sdk.facade.data.VerifyingEntity.MOBILE_APP;
        }
        if (highSpeedVideoSizes != 382) {
            return null;
        }
        return com.visa.cbp.sdk.facade.data.VerifyingEntity.VERIFIED_CLOUD;
    }
}
