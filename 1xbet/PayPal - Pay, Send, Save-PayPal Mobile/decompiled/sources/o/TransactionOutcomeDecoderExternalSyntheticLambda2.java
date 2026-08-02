package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda2 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;

    public TransactionOutcomeDecoderExternalSyntheticLambda2(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.Asset asset = (com.payair.model.Asset) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        com.payair.model.AssetType assetType = asset.assetType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
        com.payair.model.AssetType assetType2 = asset.assetType;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.AssetType.class, assetType2).write(jsonWriter, assetType2);
        java.lang.Integer num = asset.height;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE);
        java.lang.Integer num2 = asset.height;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num2).write(jsonWriter, num2);
        java.lang.String str = asset.rawData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 94);
        jsonWriter.value(asset.rawData);
        java.lang.Integer num3 = asset.width;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 355);
        java.lang.Integer num4 = asset.width;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num4).write(jsonWriter, num4);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.Asset asset = new com.payair.model.Asset();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 80) {
                if (highResolutionOutputSizeshNQ4ISI != 208) {
                    if (highResolutionOutputSizeshNQ4ISI != 267) {
                        if (highResolutionOutputSizeshNQ4ISI != 420) {
                            jsonReader.skipValue();
                        } else if (z) {
                            asset.height = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                        } else {
                            asset.height = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        asset.assetType = (com.payair.model.AssetType) gson.getAdapter(com.payair.model.AssetType.class).read2(jsonReader);
                    } else {
                        asset.assetType = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    asset.width = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                } else {
                    asset.width = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                asset.rawData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                asset.rawData = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return asset;
    }
}
