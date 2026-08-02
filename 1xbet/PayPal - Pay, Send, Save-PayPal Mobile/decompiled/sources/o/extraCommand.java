package o;

/* loaded from: classes4.dex */
public final class extraCommand extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public extraCommand(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.paypal.android.threeds.data.model.ErrorMessage errorMessage = (com.paypal.android.threeds.data.model.ErrorMessage) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        java.lang.String str = errorMessage.acsTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        jsonWriter.value(errorMessage.acsTransId);
        java.lang.String str2 = errorMessage.dsTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 53);
        jsonWriter.value(errorMessage.dsTransId);
        java.lang.String str3 = errorMessage.errorCode;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 421);
        jsonWriter.value(errorMessage.errorCode);
        java.lang.String str4 = errorMessage.errorComponent;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 32);
        jsonWriter.value(errorMessage.errorComponent);
        java.lang.String str5 = errorMessage.errorDescription;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.isReperso);
        jsonWriter.value(errorMessage.errorDescription);
        java.lang.String str6 = errorMessage.errorDetail;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 445);
        jsonWriter.value(errorMessage.errorDetail);
        java.lang.String str7 = errorMessage.errorMessageType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 2);
        jsonWriter.value(errorMessage.errorMessageType);
        java.lang.String str8 = errorMessage.messageType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 426);
        jsonWriter.value(errorMessage.messageType);
        java.lang.String str9 = errorMessage.messageVersion;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.getODAData);
        jsonWriter.value(errorMessage.messageVersion);
        java.lang.String str10 = errorMessage.sdkTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 270);
        jsonWriter.value(errorMessage.sdkTransId);
        java.lang.String str11 = errorMessage.threeDSServerTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 186);
        jsonWriter.value(errorMessage.threeDSServerTransId);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.paypal.android.threeds.data.model.ErrorMessage errorMessage = new com.paypal.android.threeds.data.model.ErrorMessage();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 40:
                    if (!z) {
                        errorMessage.messageType = null;
                        break;
                    } else {
                        errorMessage.messageType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 98:
                    if (!z) {
                        errorMessage.messageVersion = null;
                        break;
                    } else {
                        errorMessage.messageVersion = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 128:
                    if (!z) {
                        errorMessage.errorMessageType = null;
                        break;
                    } else {
                        errorMessage.errorMessageType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 143:
                    if (!z) {
                        errorMessage.errorDetail = null;
                        break;
                    } else {
                        errorMessage.errorDetail = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 201:
                    if (!z) {
                        errorMessage.dsTransId = null;
                        break;
                    } else {
                        errorMessage.dsTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE:
                    if (!z) {
                        errorMessage.acsTransId = null;
                        break;
                    } else {
                        errorMessage.acsTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 339:
                    if (!z) {
                        errorMessage.threeDSServerTransId = null;
                        break;
                    } else {
                        errorMessage.threeDSServerTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 386:
                    if (!z) {
                        errorMessage.errorCode = null;
                        break;
                    } else {
                        errorMessage.errorCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED /* 405 */:
                    if (!z) {
                        errorMessage.errorComponent = null;
                        break;
                    } else {
                        errorMessage.errorComponent = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE /* 413 */:
                    if (!z) {
                        errorMessage.sdkTransId = null;
                        break;
                    } else {
                        errorMessage.sdkTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 447:
                    if (!z) {
                        errorMessage.errorDescription = null;
                        break;
                    } else {
                        errorMessage.errorDescription = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return errorMessage;
    }
}
