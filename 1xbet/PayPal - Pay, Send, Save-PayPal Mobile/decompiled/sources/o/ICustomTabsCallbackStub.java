package o;

/* loaded from: classes4.dex */
public final class ICustomTabsCallbackStub extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public ICustomTabsCallbackStub(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest = (com.paypal.android.threeds.data.model.ChallengeRequest) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = challengeRequest.acsTransactionId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        jsonWriter.value(challengeRequest.acsTransactionId);
        java.lang.String str2 = challengeRequest.challengeCancel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 132);
        jsonWriter.value(challengeRequest.challengeCancel);
        java.lang.String str3 = challengeRequest.challengeDataEntry;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 89);
        jsonWriter.value(challengeRequest.challengeDataEntry);
        java.lang.String str4 = challengeRequest.challengeHTMLDataEntry;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 377);
        jsonWriter.value(challengeRequest.challengeHTMLDataEntry);
        java.lang.String str5 = challengeRequest.challengeNoEntry;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 428);
        jsonWriter.value(challengeRequest.challengeNoEntry);
        java.lang.String str6 = challengeRequest.messageType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 426);
        jsonWriter.value(challengeRequest.messageType);
        java.lang.String str7 = challengeRequest.messageVersion;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.getODAData);
        jsonWriter.value(challengeRequest.messageVersion);
        java.lang.Boolean bool = challengeRequest.oobContinue;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 167);
        jsonWriter.value(challengeRequest.oobContinue);
        java.lang.String str8 = challengeRequest.resendChallenge;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
        jsonWriter.value(challengeRequest.resendChallenge);
        java.lang.String str9 = challengeRequest.sdkCounterStoA;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE);
        jsonWriter.value(challengeRequest.sdkCounterStoA);
        java.lang.String str10 = challengeRequest.sdkTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 270);
        jsonWriter.value(challengeRequest.sdkTransId);
        java.lang.String str11 = challengeRequest.threeDsRequestorAppUrl;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
        jsonWriter.value(challengeRequest.threeDsRequestorAppUrl);
        java.lang.String str12 = challengeRequest.threeDsServerTransactionId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 186);
        jsonWriter.value(challengeRequest.threeDsServerTransactionId);
        java.lang.String str13 = challengeRequest.whitelistingDataEntry;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 302);
        jsonWriter.value(challengeRequest.whitelistingDataEntry);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest = new com.paypal.android.threeds.data.model.ChallengeRequest();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 40:
                    if (!z) {
                        challengeRequest.messageType = null;
                        break;
                    } else {
                        challengeRequest.messageType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 41:
                    if (!z) {
                        challengeRequest.threeDsRequestorAppUrl = null;
                        break;
                    } else {
                        challengeRequest.threeDsRequestorAppUrl = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 81:
                    if (!z) {
                        challengeRequest.sdkCounterStoA = null;
                        break;
                    } else {
                        challengeRequest.sdkCounterStoA = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 98:
                    if (!z) {
                        challengeRequest.messageVersion = null;
                        break;
                    } else {
                        challengeRequest.messageVersion = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 111:
                    if (!z) {
                        challengeRequest.challengeCancel = null;
                        break;
                    } else {
                        challengeRequest.challengeCancel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                    if (!z) {
                        challengeRequest.challengeDataEntry = null;
                        break;
                    } else {
                        challengeRequest.challengeDataEntry = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    if (!z) {
                        challengeRequest.challengeNoEntry = null;
                        break;
                    } else {
                        challengeRequest.challengeNoEntry = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 255:
                    if (!z) {
                        challengeRequest.challengeHTMLDataEntry = null;
                        break;
                    } else {
                        challengeRequest.challengeHTMLDataEntry = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE:
                    if (!z) {
                        challengeRequest.acsTransactionId = null;
                        break;
                    } else {
                        challengeRequest.acsTransactionId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 327:
                    if (!z) {
                        challengeRequest.oobContinue = null;
                        break;
                    } else {
                        challengeRequest.oobContinue = (java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader);
                        break;
                    }
                case 339:
                    if (!z) {
                        challengeRequest.threeDsServerTransactionId = null;
                        break;
                    } else {
                        challengeRequest.threeDsServerTransactionId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 384:
                    if (!z) {
                        challengeRequest.resendChallenge = null;
                        break;
                    } else {
                        challengeRequest.resendChallenge = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 387:
                    if (!z) {
                        challengeRequest.whitelistingDataEntry = null;
                        break;
                    } else {
                        challengeRequest.whitelistingDataEntry = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE /* 413 */:
                    if (!z) {
                        challengeRequest.sdkTransId = null;
                        break;
                    } else {
                        challengeRequest.sdkTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return challengeRequest;
    }
}
