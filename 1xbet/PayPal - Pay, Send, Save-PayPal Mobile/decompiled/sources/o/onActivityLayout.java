package o;

/* loaded from: classes4.dex */
public final class onActivityLayout extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public onActivityLayout(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.StaticParameters staticParameters = (com.payair.model.StaticParameters) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        com.payair.model.MsdData msdData = staticParameters.MsdData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 66);
        com.payair.model.MsdData msdData2 = staticParameters.MsdData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.MsdData.class, msdData2).write(jsonWriter, msdData2);
        if (staticParameters != staticParameters.aidInfo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 106);
            o.onMinimized onminimized = new o.onMinimized();
            java.util.List<com.payair.model.AidInfo> list = staticParameters.aidInfo;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, onminimized, list).write(jsonWriter, list);
        }
        java.lang.String str = staticParameters.cardHolderNameVCPCS;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 203);
        jsonWriter.value(staticParameters.cardHolderNameVCPCS);
        java.lang.String str2 = staticParameters.countrycode5F55;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
        jsonWriter.value(staticParameters.countrycode5F55);
        java.lang.String str3 = staticParameters.issuerIdentificationNumber;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 348);
        jsonWriter.value(staticParameters.issuerIdentificationNumber);
        java.lang.String str4 = staticParameters.kernelIdentifier;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 41);
        jsonWriter.value(staticParameters.kernelIdentifier);
        java.lang.String str5 = staticParameters.pdol;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 5);
        jsonWriter.value(staticParameters.pdol);
        com.payair.model.QvsdcData qvsdcData = staticParameters.qVSDCData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 174);
        com.payair.model.QvsdcData qvsdcData2 = staticParameters.qVSDCData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.QvsdcData.class, qvsdcData2).write(jsonWriter, qvsdcData2);
        com.payair.model.QrConsumerDeviceData qrConsumerDeviceData = staticParameters.qrConsumerDeviceData;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 12);
        com.payair.model.QrConsumerDeviceData qrConsumerDeviceData2 = staticParameters.qrConsumerDeviceData;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.QrConsumerDeviceData.class, qrConsumerDeviceData2).write(jsonWriter, qrConsumerDeviceData2);
        com.payair.model.Track2DataDec track2DataDec = staticParameters.track2DataDec;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
        com.payair.model.Track2DataDec track2DataDec2 = staticParameters.track2DataDec;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.Track2DataDec.class, track2DataDec2).write(jsonWriter, track2DataDec2);
        com.payair.model.Track2DataNotDec track2DataNotDec = staticParameters.track2DataNotDec;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 324);
        com.payair.model.Track2DataNotDec track2DataNotDec2 = staticParameters.track2DataNotDec;
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
        com.payair.model.StaticParameters staticParameters = new com.payair.model.StaticParameters();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 30) {
                if (highResolutionOutputSizeshNQ4ISI != 60) {
                    if (highResolutionOutputSizeshNQ4ISI != 223) {
                        if (highResolutionOutputSizeshNQ4ISI != 228) {
                            if (highResolutionOutputSizeshNQ4ISI != 233) {
                                if (highResolutionOutputSizeshNQ4ISI != 281) {
                                    if (highResolutionOutputSizeshNQ4ISI != 347) {
                                        if (highResolutionOutputSizeshNQ4ISI != 408) {
                                            if (highResolutionOutputSizeshNQ4ISI != 421) {
                                                if (highResolutionOutputSizeshNQ4ISI != 277) {
                                                    if (highResolutionOutputSizeshNQ4ISI != 278) {
                                                        jsonReader.skipValue();
                                                    } else if (z) {
                                                        staticParameters.qrConsumerDeviceData = (com.payair.model.QrConsumerDeviceData) gson.getAdapter(com.payair.model.QrConsumerDeviceData.class).read2(jsonReader);
                                                    } else {
                                                        staticParameters.qrConsumerDeviceData = null;
                                                        jsonReader.nextNull();
                                                    }
                                                } else if (z) {
                                                    staticParameters.MsdData = (com.payair.model.MsdData) gson.getAdapter(com.payair.model.MsdData.class).read2(jsonReader);
                                                } else {
                                                    staticParameters.MsdData = null;
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                staticParameters.track2DataNotDec = (com.payair.model.Track2DataNotDec) gson.getAdapter(com.payair.model.Track2DataNotDec.class).read2(jsonReader);
                                            } else {
                                                staticParameters.track2DataNotDec = null;
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            staticParameters.track2DataDec = (com.payair.model.Track2DataDec) gson.getAdapter(com.payair.model.Track2DataDec.class).read2(jsonReader);
                                        } else {
                                            staticParameters.track2DataDec = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        staticParameters.pdol = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        staticParameters.pdol = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    staticParameters.qVSDCData = (com.payair.model.QvsdcData) gson.getAdapter(com.payair.model.QvsdcData.class).read2(jsonReader);
                                } else {
                                    staticParameters.qVSDCData = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                staticParameters.kernelIdentifier = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                staticParameters.kernelIdentifier = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            staticParameters.aidInfo = (java.util.List) gson.getAdapter(new o.onMinimized()).read2(jsonReader);
                        } else {
                            staticParameters.aidInfo = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        staticParameters.issuerIdentificationNumber = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        staticParameters.issuerIdentificationNumber = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    staticParameters.cardHolderNameVCPCS = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    staticParameters.cardHolderNameVCPCS = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                staticParameters.countrycode5F55 = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                staticParameters.countrycode5F55 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return staticParameters;
    }
}
