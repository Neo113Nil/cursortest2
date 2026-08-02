package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getHighResolutionOutputSizeshNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public getHighResolutionOutputSizeshNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.visa.cbp.external.common.ICC icc = (com.visa.cbp.external.common.ICC) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (icc != icc.iccCRTCoeffDModP) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 247);
            jsonWriter.value(icc.iccCRTCoeffDModP);
        }
        if (icc != icc.iccCRTCoeffDModQ) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
            jsonWriter.value(icc.iccCRTCoeffDModQ);
        }
        if (icc != icc.iccCRTCoeffQModP) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 338);
            jsonWriter.value(icc.iccCRTCoeffQModP);
        }
        if (icc != icc.iccCRTprimep) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 408);
            jsonWriter.value(icc.iccCRTprimep);
        }
        if (icc != icc.iccCRTprimeq) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 84);
            jsonWriter.value(icc.iccCRTprimeq);
        }
        if (icc != icc.iccKeymod) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.setODAData);
            jsonWriter.value(icc.iccKeymod);
        }
        if (icc != icc.iccPrivKExpo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 60);
            jsonWriter.value(icc.iccPrivKExpo);
        }
        if (icc != icc.iccPubKCert) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 381);
            jsonWriter.value(icc.iccPubKCert);
        }
        if (icc != icc.iccPubKExpo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 258);
            jsonWriter.value(icc.iccPubKExpo);
        }
        if (icc != icc.iccPubKRem) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 64);
            jsonWriter.value(icc.iccPubKRem);
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
        com.visa.cbp.external.common.ICC icc = new com.visa.cbp.external.common.ICC();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 64) {
                if (highResolutionOutputSizeshNQ4ISI != 116) {
                    if (highResolutionOutputSizeshNQ4ISI != 144) {
                        if (highResolutionOutputSizeshNQ4ISI != 157) {
                            if (highResolutionOutputSizeshNQ4ISI != 246) {
                                if (highResolutionOutputSizeshNQ4ISI != 262) {
                                    if (highResolutionOutputSizeshNQ4ISI != 269) {
                                        if (highResolutionOutputSizeshNQ4ISI != 292) {
                                            if (highResolutionOutputSizeshNQ4ISI != 358) {
                                                if (highResolutionOutputSizeshNQ4ISI != 400) {
                                                    jsonReader.skipValue();
                                                } else if (z) {
                                                    icc.iccPubKCert = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                                } else {
                                                    icc.iccPubKCert = null;
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                icc.iccCRTCoeffDModQ = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                            } else {
                                                icc.iccCRTCoeffDModQ = null;
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            icc.iccCRTprimeq = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            icc.iccCRTprimeq = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        icc.iccCRTCoeffDModP = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        icc.iccCRTCoeffDModP = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    icc.iccCRTCoeffQModP = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    icc.iccCRTCoeffQModP = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                icc.iccPubKExpo = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                icc.iccPubKExpo = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            icc.iccCRTprimep = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            icc.iccCRTprimep = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        icc.iccKeymod = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        icc.iccKeymod = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    icc.iccPrivKExpo = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    icc.iccPrivKExpo = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                icc.iccPubKRem = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                icc.iccPubKRem = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return icc;
    }
}
