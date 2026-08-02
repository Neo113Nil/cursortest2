package o;

/* loaded from: classes4.dex */
public final class decode extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public decode(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.payair.model.AidInfo aidInfo = (com.payair.model.AidInfo) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        java.lang.String str = aidInfo.CVMrequired;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 304);
        jsonWriter.value(aidInfo.CVMrequired);
        com.payair.model.MsdData msdData = aidInfo.MsdData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 66);
        com.payair.model.MsdData msdData2 = aidInfo.MsdData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.MsdData.class, msdData2).write(jsonWriter, msdData2);
        com.payair.model.OdaData odaData = aidInfo.ODAData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
        com.payair.model.OdaData odaData2 = aidInfo.ODAData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.OdaData.class, odaData2).write(jsonWriter, odaData2);
        java.lang.String str2 = aidInfo.aid;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 411);
        jsonWriter.value(aidInfo.aid);
        java.lang.String str3 = aidInfo.appPrgrmID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
        jsonWriter.value(aidInfo.appPrgrmID);
        java.lang.String str4 = aidInfo.applicationLabel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 215);
        jsonWriter.value(aidInfo.applicationLabel);
        java.lang.String str5 = aidInfo.asrpd;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        jsonWriter.value(aidInfo.asrpd);
        java.lang.String str6 = aidInfo.cap;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 343);
        jsonWriter.value(aidInfo.cap);
        java.lang.String str7 = aidInfo.cardHolderNameVCPCS;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 203);
        jsonWriter.value(aidInfo.cardHolderNameVCPCS);
        java.lang.String str8 = aidInfo.countrycode5F55;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
        jsonWriter.value(aidInfo.countrycode5F55);
        java.lang.String str9 = aidInfo.issuerApplicationDiscretionaryData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE);
        jsonWriter.value(aidInfo.issuerApplicationDiscretionaryData);
        java.lang.String str10 = aidInfo.issuerDiscretionaryData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 415);
        jsonWriter.value(aidInfo.issuerDiscretionaryData);
        java.lang.String str11 = aidInfo.issuerIdentificationNumber;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 348);
        jsonWriter.value(aidInfo.issuerIdentificationNumber);
        java.lang.String str12 = aidInfo.kernelIdentifier;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 41);
        jsonWriter.value(aidInfo.kernelIdentifier);
        com.payair.model.Mst mst = aidInfo.mst;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 282);
        com.payair.model.Mst mst2 = aidInfo.mst;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.Mst.class, mst2).write(jsonWriter, mst2);
        java.lang.String str13 = aidInfo.pdol;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 5);
        jsonWriter.value(aidInfo.pdol);
        java.lang.String str14 = aidInfo.priority;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 76);
        jsonWriter.value(aidInfo.priority);
        com.payair.model.QvsdcData qvsdcData = aidInfo.qVSDCData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 174);
        com.payair.model.QvsdcData qvsdcData2 = aidInfo.qVSDCData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.QvsdcData.class, qvsdcData2).write(jsonWriter, qvsdcData2);
        com.payair.model.Track2DataDec track2DataDec = aidInfo.track2DataDec;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
        com.payair.model.Track2DataDec track2DataDec2 = aidInfo.track2DataDec;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.Track2DataDec.class, track2DataDec2).write(jsonWriter, track2DataDec2);
        com.payair.model.Track2DataNotDec track2DataNotDec = aidInfo.track2DataNotDec;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 324);
        com.payair.model.Track2DataNotDec track2DataNotDec2 = aidInfo.track2DataNotDec;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.Track2DataNotDec.class, track2DataNotDec2).write(jsonWriter, track2DataNotDec2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.AidInfo aidInfo = new com.payair.model.AidInfo();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 24:
                    if (!z) {
                        aidInfo.CVMrequired = null;
                        break;
                    } else {
                        aidInfo.CVMrequired = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 30:
                    if (!z) {
                        aidInfo.countrycode5F55 = null;
                        break;
                    } else {
                        aidInfo.countrycode5F55 = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 60:
                    if (!z) {
                        aidInfo.cardHolderNameVCPCS = null;
                        break;
                    } else {
                        aidInfo.cardHolderNameVCPCS = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 125:
                    if (!z) {
                        aidInfo.applicationLabel = null;
                        break;
                    } else {
                        aidInfo.applicationLabel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 156:
                    if (!z) {
                        aidInfo.issuerDiscretionaryData = null;
                        break;
                    } else {
                        aidInfo.issuerDiscretionaryData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 166:
                    if (!z) {
                        aidInfo.cap = null;
                        break;
                    } else {
                        aidInfo.cap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 203:
                    if (!z) {
                        aidInfo.asrpd = null;
                        break;
                    } else {
                        aidInfo.asrpd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    if (!z) {
                        aidInfo.issuerIdentificationNumber = null;
                        break;
                    } else {
                        aidInfo.issuerIdentificationNumber = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    if (!z) {
                        aidInfo.kernelIdentifier = null;
                        break;
                    } else {
                        aidInfo.kernelIdentifier = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 263:
                    if (!z) {
                        aidInfo.mst = null;
                        break;
                    } else {
                        aidInfo.mst = (com.payair.model.Mst) gson.getAdapter(com.payair.model.Mst.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                    if (!z) {
                        aidInfo.MsdData = null;
                        break;
                    } else {
                        aidInfo.MsdData = (com.payair.model.MsdData) gson.getAdapter(com.payair.model.MsdData.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                    if (!z) {
                        aidInfo.qVSDCData = null;
                        break;
                    } else {
                        aidInfo.qVSDCData = (com.payair.model.QvsdcData) gson.getAdapter(com.payair.model.QvsdcData.class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                    if (!z) {
                        aidInfo.issuerApplicationDiscretionaryData = null;
                        break;
                    } else {
                        aidInfo.issuerApplicationDiscretionaryData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        aidInfo.appPrgrmID = null;
                        break;
                    } else {
                        aidInfo.appPrgrmID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 299:
                    if (!z) {
                        aidInfo.aid = null;
                        break;
                    } else {
                        aidInfo.aid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 347:
                    if (!z) {
                        aidInfo.pdol = null;
                        break;
                    } else {
                        aidInfo.pdol = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 380:
                    if (!z) {
                        aidInfo.ODAData = null;
                        break;
                    } else {
                        aidInfo.ODAData = (com.payair.model.OdaData) gson.getAdapter(com.payair.model.OdaData.class).read2(jsonReader);
                        break;
                    }
                case 408:
                    if (!z) {
                        aidInfo.track2DataDec = null;
                        break;
                    } else {
                        aidInfo.track2DataDec = (com.payair.model.Track2DataDec) gson.getAdapter(com.payair.model.Track2DataDec.class).read2(jsonReader);
                        break;
                    }
                case 421:
                    if (!z) {
                        aidInfo.track2DataNotDec = null;
                        break;
                    } else {
                        aidInfo.track2DataNotDec = (com.payair.model.Track2DataNotDec) gson.getAdapter(com.payair.model.Track2DataNotDec.class).read2(jsonReader);
                        break;
                    }
                case 438:
                    if (!z) {
                        aidInfo.priority = null;
                        break;
                    } else {
                        aidInfo.priority = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return aidInfo;
    }
}
