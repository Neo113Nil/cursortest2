package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getOutputSizes extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public getOutputSizes(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.IccCRTPrivateKey iccCRTPrivateKey = (com.visa.cbp.sdk.facade.IccCRTPrivateKey) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (iccCRTPrivateKey != iccCRTPrivateKey.CoefDmodP) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 171);
            jsonWriter.value(iccCRTPrivateKey.CoefDmodP);
        }
        if (iccCRTPrivateKey != iccCRTPrivateKey.CoefDmodQ) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 256);
            jsonWriter.value(iccCRTPrivateKey.CoefDmodQ);
        }
        if (iccCRTPrivateKey != iccCRTPrivateKey.CoefQinvModP) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 374);
            jsonWriter.value(iccCRTPrivateKey.CoefQinvModP);
        }
        if (iccCRTPrivateKey != iccCRTPrivateKey.exponent) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 329);
            jsonWriter.value(iccCRTPrivateKey.exponent);
        }
        if (iccCRTPrivateKey != iccCRTPrivateKey.modulus) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            jsonWriter.value(iccCRTPrivateKey.modulus);
        }
        if (iccCRTPrivateKey != iccCRTPrivateKey.primeP) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
            jsonWriter.value(iccCRTPrivateKey.primeP);
        }
        if (iccCRTPrivateKey != iccCRTPrivateKey.primeQ) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 386);
            jsonWriter.value(iccCRTPrivateKey.primeQ);
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
        com.visa.cbp.sdk.facade.IccCRTPrivateKey iccCRTPrivateKey = new com.visa.cbp.sdk.facade.IccCRTPrivateKey();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 46) {
                if (highResolutionOutputSizeshNQ4ISI != 88) {
                    if (highResolutionOutputSizeshNQ4ISI != 91) {
                        if (highResolutionOutputSizeshNQ4ISI != 97) {
                            if (highResolutionOutputSizeshNQ4ISI != 202) {
                                if (highResolutionOutputSizeshNQ4ISI != 216) {
                                    if (highResolutionOutputSizeshNQ4ISI != 260) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        iccCRTPrivateKey.primeP = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        iccCRTPrivateKey.primeP = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    iccCRTPrivateKey.modulus = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    iccCRTPrivateKey.modulus = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                iccCRTPrivateKey.primeQ = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                iccCRTPrivateKey.primeQ = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            iccCRTPrivateKey.CoefQinvModP = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            iccCRTPrivateKey.CoefQinvModP = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        iccCRTPrivateKey.CoefDmodQ = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        iccCRTPrivateKey.CoefDmodQ = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    iccCRTPrivateKey.exponent = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    iccCRTPrivateKey.exponent = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                iccCRTPrivateKey.CoefDmodP = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                iccCRTPrivateKey.CoefDmodP = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return iccCRTPrivateKey;
    }
}
