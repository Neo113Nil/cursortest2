package o;

/* loaded from: classes4.dex */
public final class valueOf extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public valueOf(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.OdaData odaData = (com.payair.model.OdaData) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = odaData.appFileLocator;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 61);
        jsonWriter.value(odaData.appFileLocator);
        java.lang.String str2 = odaData.appProfile;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 30);
        jsonWriter.value(odaData.appProfile);
        java.lang.String str3 = odaData.caPubKeyIndex;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 86);
        jsonWriter.value(odaData.caPubKeyIndex);
        java.lang.String str4 = odaData.enciccPrivateKey;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
        jsonWriter.value(odaData.enciccPrivateKey);
        com.payair.model.PubKeyCert pubKeyCert = odaData.iccPubKeyCert;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 398);
        com.payair.model.PubKeyCert pubKeyCert2 = odaData.iccPubKeyCert;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.PubKeyCert.class, pubKeyCert2).write(jsonWriter, pubKeyCert2);
        com.payair.model.PubKeyCert pubKeyCert3 = odaData.tokenBinPubKeyCert;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 156);
        com.payair.model.PubKeyCert pubKeyCert4 = odaData.tokenBinPubKeyCert;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.PubKeyCert.class, pubKeyCert4).write(jsonWriter, pubKeyCert4);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.OdaData odaData = new com.payair.model.OdaData();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 56) {
                if (highResolutionOutputSizeshNQ4ISI != 149) {
                    if (highResolutionOutputSizeshNQ4ISI != 186) {
                        if (highResolutionOutputSizeshNQ4ISI != 193) {
                            if (highResolutionOutputSizeshNQ4ISI != 296) {
                                if (highResolutionOutputSizeshNQ4ISI != 353) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    odaData.enciccPrivateKey = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    odaData.enciccPrivateKey = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                odaData.iccPubKeyCert = (com.payair.model.PubKeyCert) gson.getAdapter(com.payair.model.PubKeyCert.class).read2(jsonReader);
                            } else {
                                odaData.iccPubKeyCert = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            odaData.caPubKeyIndex = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            odaData.caPubKeyIndex = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        odaData.appFileLocator = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        odaData.appFileLocator = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    odaData.appProfile = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    odaData.appProfile = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                odaData.tokenBinPubKeyCert = (com.payair.model.PubKeyCert) gson.getAdapter(com.payair.model.PubKeyCert.class).read2(jsonReader);
            } else {
                odaData.tokenBinPubKeyCert = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return odaData;
    }
}
