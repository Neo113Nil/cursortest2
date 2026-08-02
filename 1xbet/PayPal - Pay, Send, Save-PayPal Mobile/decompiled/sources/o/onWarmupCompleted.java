package o;

/* loaded from: classes4.dex */
public final class onWarmupCompleted extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public onWarmupCompleted(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent openIssuerMobileAppAndroidIntent = (com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = openIssuerMobileAppAndroidIntent.action;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 442);
        jsonWriter.value(openIssuerMobileAppAndroidIntent.action);
        com.payair.model.ProductConfig.OpenMobileAppParameters openMobileAppParameters = openIssuerMobileAppAndroidIntent.openMobileAppParameters;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 37);
        com.payair.model.ProductConfig.OpenMobileAppParameters openMobileAppParameters2 = openIssuerMobileAppAndroidIntent.openMobileAppParameters;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ProductConfig.OpenMobileAppParameters.class, openMobileAppParameters2).write(jsonWriter, openMobileAppParameters2);
        java.lang.String str2 = openIssuerMobileAppAndroidIntent.packageName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        jsonWriter.value(openIssuerMobileAppAndroidIntent.packageName);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent openIssuerMobileAppAndroidIntent = new com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 17) {
                if (highResolutionOutputSizeshNQ4ISI != 248) {
                    if (highResolutionOutputSizeshNQ4ISI != 360) {
                        jsonReader.skipValue();
                    } else if (z) {
                        openIssuerMobileAppAndroidIntent.openMobileAppParameters = (com.payair.model.ProductConfig.OpenMobileAppParameters) gson.getAdapter(com.payair.model.ProductConfig.OpenMobileAppParameters.class).read2(jsonReader);
                    } else {
                        openIssuerMobileAppAndroidIntent.openMobileAppParameters = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    openIssuerMobileAppAndroidIntent.action = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    openIssuerMobileAppAndroidIntent.action = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                openIssuerMobileAppAndroidIntent.packageName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                openIssuerMobileAppAndroidIntent.packageName = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return openIssuerMobileAppAndroidIntent;
    }
}
