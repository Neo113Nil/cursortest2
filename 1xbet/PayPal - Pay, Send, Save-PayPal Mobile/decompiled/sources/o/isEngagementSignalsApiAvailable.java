package o;

/* loaded from: classes4.dex */
public final class isEngagementSignalsApiAvailable extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public isEngagementSignalsApiAvailable(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse = (com.paypal.android.threeds.data.model.ChallengeResponse) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = challengeResponse.acsCounterAtoS;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 88);
        jsonWriter.value(challengeResponse.acsCounterAtoS);
        java.lang.String str2 = challengeResponse.acsHtml;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 241);
        jsonWriter.value(challengeResponse.acsHtml);
        java.lang.String str3 = challengeResponse.acsTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        jsonWriter.value(challengeResponse.acsTransId);
        java.lang.String str4 = challengeResponse.acsUiType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 103);
        jsonWriter.value(challengeResponse.acsUiType);
        java.lang.String str5 = challengeResponse.challengeCompletionInd;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 379);
        jsonWriter.value(challengeResponse.challengeCompletionInd);
        java.lang.String str6 = challengeResponse.challengeInfoHeader;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 238);
        jsonWriter.value(challengeResponse.challengeInfoHeader);
        java.lang.String str7 = challengeResponse.challengeInfoLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 116);
        jsonWriter.value(challengeResponse.challengeInfoLabel);
        java.lang.String str8 = challengeResponse.challengeInfoText;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 23);
        jsonWriter.value(challengeResponse.challengeInfoText);
        java.lang.String str9 = challengeResponse.challengeInfoTextIndicator;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 231);
        jsonWriter.value(challengeResponse.challengeInfoTextIndicator);
        if (challengeResponse != challengeResponse.challengeSelectInfo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 149);
            o.ICustomTabsCallbackDefault iCustomTabsCallbackDefault = new o.ICustomTabsCallbackDefault();
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> list = challengeResponse.challengeSelectInfo;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iCustomTabsCallbackDefault, list).write(jsonWriter, list);
        }
        java.lang.String str10 = challengeResponse.expandInfoLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 98);
        jsonWriter.value(challengeResponse.expandInfoLabel);
        java.lang.String str11 = challengeResponse.expandInfoText;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 38);
        jsonWriter.value(challengeResponse.expandInfoText);
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage = challengeResponse.issuerImage;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage2 = challengeResponse.issuerImage;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.paypal.android.threeds.data.model.ChallengeImage.class, challengeImage2).write(jsonWriter, challengeImage2);
        if (challengeResponse != challengeResponse.messageExtension) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 36);
            o.ICustomTabsService iCustomTabsService = new o.ICustomTabsService();
            java.util.List<com.paypal.android.threeds.data.model.MessageExtension> list2 = challengeResponse.messageExtension;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iCustomTabsService, list2).write(jsonWriter, list2);
        }
        java.lang.String str12 = challengeResponse.messageType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 426);
        jsonWriter.value(challengeResponse.messageType);
        java.lang.String str13 = challengeResponse.messageVersion;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.getODAData);
        jsonWriter.value(challengeResponse.messageVersion);
        java.lang.String str14 = challengeResponse.oobContinueLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 418);
        jsonWriter.value(challengeResponse.oobContinueLabel);
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage3 = challengeResponse.psImage;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage4 = challengeResponse.psImage;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.paypal.android.threeds.data.model.ChallengeImage.class, challengeImage4).write(jsonWriter, challengeImage4);
        java.lang.String str15 = challengeResponse.resendInformationLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 427);
        jsonWriter.value(challengeResponse.resendInformationLabel);
        java.lang.String str16 = challengeResponse.sdkCounterStoA;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE);
        jsonWriter.value(challengeResponse.sdkCounterStoA);
        java.lang.String str17 = challengeResponse.sdkTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 270);
        jsonWriter.value(challengeResponse.sdkTransId);
        java.lang.String str18 = challengeResponse.submitAuthenticationLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
        jsonWriter.value(challengeResponse.submitAuthenticationLabel);
        java.lang.String str19 = challengeResponse.threeDsServerTransId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 186);
        jsonWriter.value(challengeResponse.threeDsServerTransId);
        java.lang.String str20 = challengeResponse.transStatus;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 321);
        jsonWriter.value(challengeResponse.transStatus);
        java.lang.String str21 = challengeResponse.whitelistingInfoText;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 26);
        jsonWriter.value(challengeResponse.whitelistingInfoText);
        java.lang.String str22 = challengeResponse.whyInfoLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 70);
        jsonWriter.value(challengeResponse.whyInfoLabel);
        java.lang.String str23 = challengeResponse.whyInfoText;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 73);
        jsonWriter.value(challengeResponse.whyInfoText);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse = new com.paypal.android.threeds.data.model.ChallengeResponse();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 13:
                    if (!z) {
                        challengeResponse.resendInformationLabel = null;
                        break;
                    } else {
                        challengeResponse.resendInformationLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 18:
                    if (!z) {
                        challengeResponse.challengeCompletionInd = null;
                        break;
                    } else {
                        challengeResponse.challengeCompletionInd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 32:
                    if (!z) {
                        challengeResponse.whitelistingInfoText = null;
                        break;
                    } else {
                        challengeResponse.whitelistingInfoText = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 40:
                    if (!z) {
                        challengeResponse.messageType = null;
                        break;
                    } else {
                        challengeResponse.messageType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 47:
                    if (!z) {
                        challengeResponse.challengeSelectInfo = null;
                        break;
                    } else {
                        challengeResponse.challengeSelectInfo = (java.util.List) gson.getAdapter(new o.ICustomTabsCallbackDefault()).read2(jsonReader);
                        break;
                    }
                case 70:
                    if (!z) {
                        challengeResponse.challengeInfoTextIndicator = null;
                        break;
                    } else {
                        challengeResponse.challengeInfoTextIndicator = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 72:
                    if (!z) {
                        challengeResponse.acsUiType = null;
                        break;
                    } else {
                        challengeResponse.acsUiType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 81:
                    if (!z) {
                        challengeResponse.sdkCounterStoA = null;
                        break;
                    } else {
                        challengeResponse.sdkCounterStoA = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 98:
                    if (!z) {
                        challengeResponse.messageVersion = null;
                        break;
                    } else {
                        challengeResponse.messageVersion = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 100:
                    if (!z) {
                        challengeResponse.whyInfoText = null;
                        break;
                    } else {
                        challengeResponse.whyInfoText = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    if (!z) {
                        challengeResponse.submitAuthenticationLabel = null;
                        break;
                    } else {
                        challengeResponse.submitAuthenticationLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 185:
                    if (!z) {
                        challengeResponse.issuerImage = null;
                        break;
                    } else {
                        challengeResponse.issuerImage = (com.paypal.android.threeds.data.model.ChallengeImage) gson.getAdapter(com.paypal.android.threeds.data.model.ChallengeImage.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    if (!z) {
                        challengeResponse.oobContinueLabel = null;
                        break;
                    } else {
                        challengeResponse.oobContinueLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 258:
                    if (!z) {
                        challengeResponse.whyInfoLabel = null;
                        break;
                    } else {
                        challengeResponse.whyInfoLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 259:
                    if (!z) {
                        challengeResponse.challengeInfoLabel = null;
                        break;
                    } else {
                        challengeResponse.challengeInfoLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 270:
                    if (!z) {
                        challengeResponse.challengeInfoHeader = null;
                        break;
                    } else {
                        challengeResponse.challengeInfoHeader = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                    if (!z) {
                        challengeResponse.acsHtml = null;
                        break;
                    } else {
                        challengeResponse.acsHtml = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE:
                    if (!z) {
                        challengeResponse.psImage = null;
                        break;
                    } else {
                        challengeResponse.psImage = (com.paypal.android.threeds.data.model.ChallengeImage) gson.getAdapter(com.paypal.android.threeds.data.model.ChallengeImage.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        challengeResponse.messageExtension = null;
                        break;
                    } else {
                        challengeResponse.messageExtension = (java.util.List) gson.getAdapter(new o.ICustomTabsService()).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE:
                    if (!z) {
                        challengeResponse.acsTransId = null;
                        break;
                    } else {
                        challengeResponse.acsTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 339:
                    if (!z) {
                        challengeResponse.threeDsServerTransId = null;
                        break;
                    } else {
                        challengeResponse.threeDsServerTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 351:
                    if (!z) {
                        challengeResponse.challengeInfoText = null;
                        break;
                    } else {
                        challengeResponse.challengeInfoText = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 365:
                    if (!z) {
                        challengeResponse.expandInfoText = null;
                        break;
                    } else {
                        challengeResponse.expandInfoText = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE /* 413 */:
                    if (!z) {
                        challengeResponse.sdkTransId = null;
                        break;
                    } else {
                        challengeResponse.sdkTransId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 414:
                    if (!z) {
                        challengeResponse.transStatus = null;
                        break;
                    } else {
                        challengeResponse.transStatus = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                    if (!z) {
                        challengeResponse.acsCounterAtoS = null;
                        break;
                    } else {
                        challengeResponse.acsCounterAtoS = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 430:
                    if (!z) {
                        challengeResponse.expandInfoLabel = null;
                        break;
                    } else {
                        challengeResponse.expandInfoLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return challengeResponse;
    }
}
