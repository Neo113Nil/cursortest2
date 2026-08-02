package o;

/* loaded from: classes4.dex */
public final class asBinder extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public asBinder(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.ProductConfig productConfig = (com.payair.model.ProductConfig) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        java.lang.String str = productConfig.backgroundColor;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 314);
        jsonWriter.value(productConfig.backgroundColor);
        java.lang.String str2 = productConfig.bankAppName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
        jsonWriter.value(productConfig.bankAppName);
        java.lang.String str3 = productConfig.brandLogoAssetId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 0);
        jsonWriter.value(productConfig.brandLogoAssetId);
        java.lang.String str4 = productConfig.cardBackgroundAssetId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 40);
        jsonWriter.value(productConfig.cardBackgroundAssetId);
        java.lang.String str5 = productConfig.cardBackgroundCombinedAssetId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 151);
        jsonWriter.value(productConfig.cardBackgroundCombinedAssetId);
        java.lang.String str6 = productConfig.coBrandLogoAssetId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 47);
        jsonWriter.value(productConfig.coBrandLogoAssetId);
        java.lang.String str7 = productConfig.coBrandName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 395);
        jsonWriter.value(productConfig.coBrandName);
        java.lang.String str8 = productConfig.contactName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 225);
        jsonWriter.value(productConfig.contactName);
        java.lang.String str9 = productConfig.contactWebsite;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 397);
        jsonWriter.value(productConfig.contactWebsite);
        java.lang.String str10 = productConfig.customerServiceEmail;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 269);
        jsonWriter.value(productConfig.customerServiceEmail);
        java.lang.String str11 = productConfig.customerServicePhoneNr;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 153);
        jsonWriter.value(productConfig.customerServicePhoneNr);
        java.lang.String str12 = productConfig.customerServiceUrl;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE);
        jsonWriter.value(productConfig.customerServiceUrl);
        java.lang.String str13 = productConfig.foregroundColor;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 72);
        jsonWriter.value(productConfig.foregroundColor);
        java.lang.String str14 = productConfig.iconAssetId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 363);
        jsonWriter.value(productConfig.iconAssetId);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 79);
        jsonWriter.value(productConfig.isCoBranded);
        java.lang.String str15 = productConfig.issuerLogoAssetId;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 166);
        jsonWriter.value(productConfig.issuerLogoAssetId);
        com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp = productConfig.issuerMobileApp;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 51);
        com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp2 = productConfig.issuerMobileApp;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ProductConfig.IssuerMobileApp.class, issuerMobileApp2).write(jsonWriter, issuerMobileApp2);
        java.lang.String str16 = productConfig.issuerName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 349);
        jsonWriter.value(productConfig.issuerName);
        java.lang.String str17 = productConfig.issuerProductConfigCode;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 131);
        jsonWriter.value(productConfig.issuerProductConfigCode);
        java.lang.String str18 = productConfig.labelColor;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 109);
        jsonWriter.value(productConfig.labelColor);
        java.lang.String str19 = productConfig.longDescription;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 45);
        jsonWriter.value(productConfig.longDescription);
        java.lang.String str20 = productConfig.onlineBankingLoginUrl;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 35);
        jsonWriter.value(productConfig.onlineBankingLoginUrl);
        java.lang.String str21 = productConfig.privacyPolicyUrl;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
        jsonWriter.value(productConfig.privacyPolicyUrl);
        java.lang.String str22 = productConfig.shortDescription;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 317);
        jsonWriter.value(productConfig.shortDescription);
        java.lang.String str23 = productConfig.termsAndConditionsUrl;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 412);
        jsonWriter.value(productConfig.termsAndConditionsUrl);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.ProductConfig productConfig = new com.payair.model.ProductConfig();
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 6:
                    if (!z) {
                        productConfig.contactName = null;
                        break;
                    } else {
                        productConfig.contactName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 28:
                    if (!z) {
                        productConfig.longDescription = null;
                        break;
                    } else {
                        productConfig.longDescription = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 39:
                    if (!z) {
                        productConfig.coBrandLogoAssetId = null;
                        break;
                    } else {
                        productConfig.coBrandLogoAssetId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 58:
                    if (!z) {
                        break;
                    } else {
                        productConfig.isCoBranded = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 68:
                    if (!z) {
                        productConfig.issuerLogoAssetId = null;
                        break;
                    } else {
                        productConfig.issuerLogoAssetId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 75:
                    if (!z) {
                        productConfig.coBrandName = null;
                        break;
                    } else {
                        productConfig.coBrandName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 77:
                    if (!z) {
                        productConfig.customerServiceUrl = null;
                        break;
                    } else {
                        productConfig.customerServiceUrl = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    if (!z) {
                        productConfig.issuerMobileApp = null;
                        break;
                    } else {
                        productConfig.issuerMobileApp = (com.payair.model.ProductConfig.IssuerMobileApp) gson.getAdapter(com.payair.model.ProductConfig.IssuerMobileApp.class).read2(jsonReader);
                        break;
                    }
                case 150:
                    if (!z) {
                        productConfig.backgroundColor = null;
                        break;
                    } else {
                        productConfig.backgroundColor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 161:
                    if (!z) {
                        productConfig.iconAssetId = null;
                        break;
                    } else {
                        productConfig.iconAssetId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 176:
                    if (!z) {
                        productConfig.contactWebsite = null;
                        break;
                    } else {
                        productConfig.contactWebsite = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 204:
                    if (!z) {
                        productConfig.issuerProductConfigCode = null;
                        break;
                    } else {
                        productConfig.issuerProductConfigCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    if (!z) {
                        productConfig.issuerName = null;
                        break;
                    } else {
                        productConfig.issuerName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    if (!z) {
                        productConfig.onlineBankingLoginUrl = null;
                        break;
                    } else {
                        productConfig.onlineBankingLoginUrl = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    if (!z) {
                        productConfig.customerServicePhoneNr = null;
                        break;
                    } else {
                        productConfig.customerServicePhoneNr = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    if (!z) {
                        productConfig.termsAndConditionsUrl = null;
                        break;
                    } else {
                        productConfig.termsAndConditionsUrl = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                    if (!z) {
                        productConfig.privacyPolicyUrl = null;
                        break;
                    } else {
                        productConfig.privacyPolicyUrl = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 341:
                    if (!z) {
                        productConfig.bankAppName = null;
                        break;
                    } else {
                        productConfig.bankAppName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 349:
                    if (!z) {
                        productConfig.foregroundColor = null;
                        break;
                    } else {
                        productConfig.foregroundColor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 350:
                    if (!z) {
                        productConfig.cardBackgroundCombinedAssetId = null;
                        break;
                    } else {
                        productConfig.cardBackgroundCombinedAssetId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 383:
                    if (!z) {
                        productConfig.shortDescription = null;
                        break;
                    } else {
                        productConfig.shortDescription = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 388:
                    if (!z) {
                        productConfig.customerServiceEmail = null;
                        break;
                    } else {
                        productConfig.customerServiceEmail = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 396:
                    if (!z) {
                        productConfig.brandLogoAssetId = null;
                        break;
                    } else {
                        productConfig.brandLogoAssetId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 443:
                    if (!z) {
                        productConfig.cardBackgroundAssetId = null;
                        break;
                    } else {
                        productConfig.cardBackgroundAssetId = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 449:
                    if (!z) {
                        productConfig.labelColor = null;
                        break;
                    } else {
                        productConfig.labelColor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return productConfig;
    }
}
