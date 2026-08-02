package o;

/* loaded from: classes4.dex */
public final class onExtraCallback extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;

    public onExtraCallback(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp = (com.payair.model.ProductConfig.IssuerMobileApp) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent activateWithIssuerMobileAppAndroidIntent = issuerMobileApp.activateWithIssuerMobileAppAndroidIntent;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 390);
        com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent activateWithIssuerMobileAppAndroidIntent2 = issuerMobileApp.activateWithIssuerMobileAppAndroidIntent;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent.class, activateWithIssuerMobileAppAndroidIntent2).write(jsonWriter, activateWithIssuerMobileAppAndroidIntent2);
        com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent openIssuerMobileAppAndroidIntent = issuerMobileApp.openIssuerMobileAppAndroidIntent;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 21);
        com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent openIssuerMobileAppAndroidIntent2 = issuerMobileApp.openIssuerMobileAppAndroidIntent;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent.class, openIssuerMobileAppAndroidIntent2).write(jsonWriter, openIssuerMobileAppAndroidIntent2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp = new com.payair.model.ProductConfig.IssuerMobileApp();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 71) {
                if (highResolutionOutputSizeshNQ4ISI != 322) {
                    jsonReader.skipValue();
                } else if (z) {
                    issuerMobileApp.openIssuerMobileAppAndroidIntent = (com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent) gson.getAdapter(com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent.class).read2(jsonReader);
                } else {
                    issuerMobileApp.openIssuerMobileAppAndroidIntent = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                issuerMobileApp.activateWithIssuerMobileAppAndroidIntent = (com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent) gson.getAdapter(com.payair.model.ProductConfig.IssuerMobileApp.ActivateWithIssuerMobileAppAndroidIntent.class).read2(jsonReader);
            } else {
                issuerMobileApp.activateWithIssuerMobileAppAndroidIntent = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return issuerMobileApp;
    }
}
