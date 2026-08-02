package o;

/* loaded from: classes4.dex */
public final class getInterfaceVersion extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public getInterfaceVersion(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ProductConfig.MobileAppActivationParameters mobileAppActivationParameters = (com.payair.model.ProductConfig.MobileAppActivationParameters) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = mobileAppActivationParameters.accountExpiry;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
        jsonWriter.value(mobileAppActivationParameters.accountExpiry);
        java.lang.String str2 = mobileAppActivationParameters.accountPanSuffix;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
        jsonWriter.value(mobileAppActivationParameters.accountPanSuffix);
        java.lang.String str3 = mobileAppActivationParameters.paymentAppInstanceId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
        jsonWriter.value(mobileAppActivationParameters.paymentAppInstanceId);
        java.lang.String str4 = mobileAppActivationParameters.paymentAppProviderId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 376);
        jsonWriter.value(mobileAppActivationParameters.paymentAppProviderId);
        java.lang.String str5 = mobileAppActivationParameters.tokenUniqueReference;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 441);
        jsonWriter.value(mobileAppActivationParameters.tokenUniqueReference);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ProductConfig.MobileAppActivationParameters mobileAppActivationParameters = new com.payair.model.ProductConfig.MobileAppActivationParameters();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 34) {
                if (highResolutionOutputSizeshNQ4ISI != 309) {
                    if (highResolutionOutputSizeshNQ4ISI != 343) {
                        if (highResolutionOutputSizeshNQ4ISI != 398) {
                            if (highResolutionOutputSizeshNQ4ISI != 410) {
                                jsonReader.skipValue();
                            } else if (z) {
                                mobileAppActivationParameters.accountExpiry = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                mobileAppActivationParameters.accountExpiry = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            mobileAppActivationParameters.accountPanSuffix = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            mobileAppActivationParameters.accountPanSuffix = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        mobileAppActivationParameters.tokenUniqueReference = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        mobileAppActivationParameters.tokenUniqueReference = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    mobileAppActivationParameters.paymentAppInstanceId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    mobileAppActivationParameters.paymentAppInstanceId = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                mobileAppActivationParameters.paymentAppProviderId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                mobileAppActivationParameters.paymentAppProviderId = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return mobileAppActivationParameters;
    }
}
