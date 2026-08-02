package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda4 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public TransactionOutcomeDecoderExternalSyntheticLambda4(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(jsonWriter, obj == com.payair.model.AssetType.IMAGE ? 92 : obj == com.payair.model.AssetType.PDF ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE : obj == com.payair.model.AssetType.HTML ? 39 : obj == com.payair.model.AssetType.TEXT ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE : obj == com.payair.model.AssetType.UNKNOWN ? 80 : -1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        int highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(jsonReader);
        if (highSpeedVideoSizes == 102) {
            return com.payair.model.AssetType.IMAGE;
        }
        if (highSpeedVideoSizes == 194) {
            return com.payair.model.AssetType.TEXT;
        }
        if (highSpeedVideoSizes == 289) {
            return com.payair.model.AssetType.HTML;
        }
        if (highSpeedVideoSizes == 313) {
            return com.payair.model.AssetType.PDF;
        }
        if (highSpeedVideoSizes != 435) {
            return null;
        }
        return com.payair.model.AssetType.UNKNOWN;
    }
}
