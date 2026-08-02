package o;

/* loaded from: classes4.dex */
public final class onNavigationEvent extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;

    public onNavigationEvent(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent activateWithIssuerMobileAppAndroidIntent = (com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = activateWithIssuerMobileAppAndroidIntent.action;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 442);
        jsonWriter.value(activateWithIssuerMobileAppAndroidIntent.action);
        com.payair.model.ProductConfig.MobileAppActivationParameters mobileAppActivationParameters = activateWithIssuerMobileAppAndroidIntent.mobileAppActivationParameters;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 44);
        com.payair.model.ProductConfig.MobileAppActivationParameters mobileAppActivationParameters2 = activateWithIssuerMobileAppAndroidIntent.mobileAppActivationParameters;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ProductConfig.MobileAppActivationParameters.class, mobileAppActivationParameters2).write(jsonWriter, mobileAppActivationParameters2);
        java.lang.String str2 = activateWithIssuerMobileAppAndroidIntent.packageName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        jsonWriter.value(activateWithIssuerMobileAppAndroidIntent.packageName);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent activateWithIssuerMobileAppAndroidIntent = new com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 17) {
                if (highResolutionOutputSizeshNQ4ISI != 248) {
                    if (highResolutionOutputSizeshNQ4ISI != 429) {
                        jsonReader.skipValue();
                    } else if (z) {
                        activateWithIssuerMobileAppAndroidIntent.mobileAppActivationParameters = (com.payair.model.ProductConfig.MobileAppActivationParameters) gson.getAdapter(com.payair.model.ProductConfig.MobileAppActivationParameters.class).read2(jsonReader);
                    } else {
                        activateWithIssuerMobileAppAndroidIntent.mobileAppActivationParameters = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    activateWithIssuerMobileAppAndroidIntent.action = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    activateWithIssuerMobileAppAndroidIntent.action = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                activateWithIssuerMobileAppAndroidIntent.packageName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                activateWithIssuerMobileAppAndroidIntent.packageName = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return activateWithIssuerMobileAppAndroidIntent;
    }
}
