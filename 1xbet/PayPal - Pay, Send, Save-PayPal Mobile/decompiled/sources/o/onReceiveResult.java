package o;

/* loaded from: classes5.dex */
public final class onReceiveResult extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public onReceiveResult(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(jsonWriter, obj == com.visa.cbp.sdk.facade.data.VerifyingType.MOBILE_DEVICE ? 144 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.BIOMETRIC_FINGERPRINT ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE : obj == com.visa.cbp.sdk.facade.data.VerifyingType.FINGER_BIOMETRIC ? androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY : obj == com.visa.cbp.sdk.facade.data.VerifyingType.FACIAL_BIOMETRIC ? 361 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.MOBILE_DEVICE_PATTERN ? 43 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.PASSCODE ? 301 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.IRIS_BIOMETRIC ? 447 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.VOICE_BIOMETRIC ? 417 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.MOBILE_DEVICE_PATTERN_LOCK ? 101 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.OTHER_CD_CVM ? 200 : obj == com.visa.cbp.sdk.facade.data.VerifyingType.NO_CD_CVM ? 435 : -1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        int highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(jsonReader);
        if (highSpeedVideoSizes == 7) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.FACIAL_BIOMETRIC;
        }
        if (highSpeedVideoSizes == 36) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.IRIS_BIOMETRIC;
        }
        if (highSpeedVideoSizes == 115) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.PASSCODE;
        }
        if (highSpeedVideoSizes == 138) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.MOBILE_DEVICE_PATTERN_LOCK;
        }
        if (highSpeedVideoSizes == 393) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.VOICE_BIOMETRIC;
        }
        if (highSpeedVideoSizes == 401) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.MOBILE_DEVICE_PATTERN;
        }
        if (highSpeedVideoSizes == 439) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.MOBILE_DEVICE;
        }
        if (highSpeedVideoSizes == 73) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.FINGER_BIOMETRIC;
        }
        if (highSpeedVideoSizes == 74) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.NO_CD_CVM;
        }
        if (highSpeedVideoSizes == 109) {
            return com.visa.cbp.sdk.facade.data.VerifyingType.BIOMETRIC_FINGERPRINT;
        }
        if (highSpeedVideoSizes != 110) {
            return null;
        }
        return com.visa.cbp.sdk.facade.data.VerifyingType.OTHER_CD_CVM;
    }
}
