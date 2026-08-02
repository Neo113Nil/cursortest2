package o;

/* loaded from: classes4.dex */
public final class extraCallback extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public extraCallback(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.TokenInfoModel tokenInfoModel = (com.payair.model.TokenInfoModel) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        java.lang.String str = tokenInfoModel.accountExpiryMonth;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 165);
        jsonWriter.value(tokenInfoModel.accountExpiryMonth);
        java.lang.String str2 = tokenInfoModel.accountExpiryYear;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
        jsonWriter.value(tokenInfoModel.accountExpiryYear);
        java.lang.String str3 = tokenInfoModel.accountPanSuffix;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
        jsonWriter.value(tokenInfoModel.accountPanSuffix);
        java.lang.String str4 = tokenInfoModel.appPrgrmID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
        jsonWriter.value(tokenInfoModel.appPrgrmID);
        java.lang.String str5 = tokenInfoModel.atc;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 54);
        jsonWriter.value(tokenInfoModel.atc);
        java.lang.Boolean bool = tokenInfoModel.dsrpCapable;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 226);
        jsonWriter.value(tokenInfoModel.dsrpCapable);
        java.lang.String str6 = tokenInfoModel.encTokenInfo;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 129);
        jsonWriter.value(tokenInfoModel.encTokenInfo);
        com.payair.model.HceData hceData = tokenInfoModel.hceData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 387);
        com.payair.model.HceData hceData2 = tokenInfoModel.hceData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.HceData.class, hceData2).write(jsonWriter, hceData2);
        com.payair.model.Mst mst = tokenInfoModel.mst;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 282);
        com.payair.model.Mst mst2 = tokenInfoModel.mst;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.Mst.class, mst2).write(jsonWriter, mst2);
        com.payair.model.SeCardPerso seCardPerso = tokenInfoModel.seCardPerso;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 20);
        com.payair.model.SeCardPerso seCardPerso2 = tokenInfoModel.seCardPerso;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.SeCardPerso.class, seCardPerso2).write(jsonWriter, seCardPerso2);
        com.payair.model.SePersoData sePersoData = tokenInfoModel.sePersoData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 4);
        com.payair.model.SePersoData sePersoData2 = tokenInfoModel.sePersoData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.SePersoData.class, sePersoData2).write(jsonWriter, sePersoData2);
        java.lang.Integer num = tokenInfoModel.tokenAssuranceLevel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 71);
        java.lang.Integer num2 = tokenInfoModel.tokenAssuranceLevel;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num2).write(jsonWriter, num2);
        java.lang.String str7 = tokenInfoModel.tokenExpiryMonth;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 202);
        jsonWriter.value(tokenInfoModel.tokenExpiryMonth);
        java.lang.String str8 = tokenInfoModel.tokenExpiryYear;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 121);
        jsonWriter.value(tokenInfoModel.tokenExpiryYear);
        java.lang.String str9 = tokenInfoModel.tokenPanSuffix;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 323);
        jsonWriter.value(tokenInfoModel.tokenPanSuffix);
        java.lang.String str10 = tokenInfoModel.tokenReferenceID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 9);
        jsonWriter.value(tokenInfoModel.tokenReferenceID);
        java.lang.String str11 = tokenInfoModel.tokenRequestorID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 391);
        jsonWriter.value(tokenInfoModel.tokenRequestorID);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.TokenInfoModel tokenInfoModel = new com.payair.model.TokenInfoModel();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 2:
                    if (!z) {
                        tokenInfoModel.accountExpiryMonth = null;
                        break;
                    } else {
                        tokenInfoModel.accountExpiryMonth = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 67:
                    if (!z) {
                        tokenInfoModel.encTokenInfo = null;
                        break;
                    } else {
                        tokenInfoModel.encTokenInfo = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 94:
                    if (!z) {
                        tokenInfoModel.tokenAssuranceLevel = null;
                        break;
                    } else {
                        tokenInfoModel.tokenAssuranceLevel = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                        break;
                    }
                case 95:
                    if (!z) {
                        tokenInfoModel.hceData = null;
                        break;
                    } else {
                        tokenInfoModel.hceData = (com.payair.model.HceData) gson.getAdapter(com.payair.model.HceData.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                    if (!z) {
                        tokenInfoModel.tokenRequestorID = null;
                        break;
                    } else {
                        tokenInfoModel.tokenRequestorID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 129:
                    if (!z) {
                        tokenInfoModel.tokenExpiryYear = null;
                        break;
                    } else {
                        tokenInfoModel.tokenExpiryYear = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 151:
                    if (!z) {
                        tokenInfoModel.seCardPerso = null;
                        break;
                    } else {
                        tokenInfoModel.seCardPerso = (com.payair.model.SeCardPerso) gson.getAdapter(com.payair.model.SeCardPerso.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    if (!z) {
                        tokenInfoModel.atc = null;
                        break;
                    } else {
                        tokenInfoModel.atc = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 199:
                    if (!z) {
                        tokenInfoModel.accountExpiryYear = null;
                        break;
                    } else {
                        tokenInfoModel.accountExpiryYear = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    if (!z) {
                        tokenInfoModel.sePersoData = null;
                        break;
                    } else {
                        tokenInfoModel.sePersoData = (com.payair.model.SePersoData) gson.getAdapter(com.payair.model.SePersoData.class).read2(jsonReader);
                        break;
                    }
                case 263:
                    if (!z) {
                        tokenInfoModel.mst = null;
                        break;
                    } else {
                        tokenInfoModel.mst = (com.payair.model.Mst) gson.getAdapter(com.payair.model.Mst.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                    if (!z) {
                        tokenInfoModel.tokenExpiryMonth = null;
                        break;
                    } else {
                        tokenInfoModel.tokenExpiryMonth = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        tokenInfoModel.appPrgrmID = null;
                        break;
                    } else {
                        tokenInfoModel.appPrgrmID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 307:
                    if (!z) {
                        tokenInfoModel.dsrpCapable = null;
                        break;
                    } else {
                        tokenInfoModel.dsrpCapable = (java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader);
                        break;
                    }
                case 318:
                    if (!z) {
                        tokenInfoModel.tokenPanSuffix = null;
                        break;
                    } else {
                        tokenInfoModel.tokenPanSuffix = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 320:
                    if (!z) {
                        tokenInfoModel.tokenReferenceID = null;
                        break;
                    } else {
                        tokenInfoModel.tokenReferenceID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 398:
                    if (!z) {
                        tokenInfoModel.accountPanSuffix = null;
                        break;
                    } else {
                        tokenInfoModel.accountPanSuffix = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return tokenInfoModel;
    }
}
