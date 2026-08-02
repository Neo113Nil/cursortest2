package o;

/* loaded from: classes4.dex */
public final class IAuthTabCallbackStub extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public IAuthTabCallbackStub(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ProductConfig.OpenMobileAppParameters openMobileAppParameters = (com.payair.model.ProductConfig.OpenMobileAppParameters) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        java.lang.String str = openMobileAppParameters.paymentAppId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 406);
        jsonWriter.value(openMobileAppParameters.paymentAppId);
        java.lang.String str2 = openMobileAppParameters.paymentAppInstanceId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
        jsonWriter.value(openMobileAppParameters.paymentAppInstanceId);
        java.lang.String str3 = openMobileAppParameters.paymentAppProviderId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 376);
        jsonWriter.value(openMobileAppParameters.paymentAppProviderId);
        java.lang.String str4 = openMobileAppParameters.tokenUniqueReference;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 441);
        jsonWriter.value(openMobileAppParameters.tokenUniqueReference);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ProductConfig.OpenMobileAppParameters openMobileAppParameters = new com.payair.model.ProductConfig.OpenMobileAppParameters();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 34) {
                if (highResolutionOutputSizeshNQ4ISI != 209) {
                    if (highResolutionOutputSizeshNQ4ISI != 309) {
                        if (highResolutionOutputSizeshNQ4ISI != 343) {
                            jsonReader.skipValue();
                        } else if (z) {
                            openMobileAppParameters.tokenUniqueReference = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            openMobileAppParameters.tokenUniqueReference = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        openMobileAppParameters.paymentAppInstanceId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        openMobileAppParameters.paymentAppInstanceId = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    openMobileAppParameters.paymentAppId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    openMobileAppParameters.paymentAppId = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                openMobileAppParameters.paymentAppProviderId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                openMobileAppParameters.paymentAppProviderId = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return openMobileAppParameters;
    }
}
