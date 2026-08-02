package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getOutputSizeshNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getOutputSizeshNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.visa.cbp.external.common.ODAData oDAData = (com.visa.cbp.external.common.ODAData) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (oDAData != oDAData.appFileLocator) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 61);
            jsonWriter.value(oDAData.appFileLocator);
        }
        if (oDAData != oDAData.appProfile) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 30);
            jsonWriter.value(oDAData.appProfile);
        }
        if (oDAData != oDAData.caPubKeyIndex) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 86);
            jsonWriter.value(oDAData.caPubKeyIndex);
        }
        if (oDAData != oDAData.enciccPrivateKey) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
            jsonWriter.value(oDAData.enciccPrivateKey);
        }
        if (oDAData != oDAData.iccPubKeyCert) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 398);
            com.visa.cbp.external.common.IccPubKeyCert iccPubKeyCert = oDAData.iccPubKeyCert;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.IccPubKeyCert.class, iccPubKeyCert).write(jsonWriter, iccPubKeyCert);
        }
        if (oDAData != oDAData.tokenBinPubKeyCert) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 156);
            com.visa.cbp.external.common.TokenBinPubKeyCert tokenBinPubKeyCert = oDAData.tokenBinPubKeyCert;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.TokenBinPubKeyCert.class, tokenBinPubKeyCert).write(jsonWriter, tokenBinPubKeyCert);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.external.common.ODAData oDAData = new com.visa.cbp.external.common.ODAData();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
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
                                    oDAData.enciccPrivateKey = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    oDAData.enciccPrivateKey = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                oDAData.iccPubKeyCert = (com.visa.cbp.external.common.IccPubKeyCert) gson.getAdapter(com.visa.cbp.external.common.IccPubKeyCert.class).read2(jsonReader);
                            } else {
                                oDAData.iccPubKeyCert = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            oDAData.caPubKeyIndex = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            oDAData.caPubKeyIndex = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        oDAData.appFileLocator = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        oDAData.appFileLocator = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    oDAData.appProfile = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    oDAData.appProfile = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                oDAData.tokenBinPubKeyCert = (com.visa.cbp.external.common.TokenBinPubKeyCert) gson.getAdapter(com.visa.cbp.external.common.TokenBinPubKeyCert.class).read2(jsonReader);
            } else {
                oDAData.tokenBinPubKeyCert = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return oDAData;
    }
}
