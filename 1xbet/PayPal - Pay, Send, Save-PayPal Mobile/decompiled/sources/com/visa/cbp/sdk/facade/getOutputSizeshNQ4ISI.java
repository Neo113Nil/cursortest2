package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getOutputSizeshNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getOutputSizeshNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.EndPointEnum endPointEnum = (com.visa.cbp.sdk.facade.EndPointEnum) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (endPointEnum != endPointEnum.CERT) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 313);
            jsonWriter.value(endPointEnum.CERT);
        }
        if (endPointEnum != endPointEnum.DEV) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 18);
            jsonWriter.value(endPointEnum.DEV);
        }
        if (endPointEnum != endPointEnum.PROD) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 34);
            jsonWriter.value(endPointEnum.PROD);
        }
        if (endPointEnum != endPointEnum.QA) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 440);
            jsonWriter.value(endPointEnum.QA);
        }
        if (endPointEnum != endPointEnum.SBX) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            jsonWriter.value(endPointEnum.SBX);
        }
        if (endPointEnum != endPointEnum.TEST) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 207);
            jsonWriter.value(endPointEnum.TEST);
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
        com.visa.cbp.sdk.facade.EndPointEnum endPointEnum = new com.visa.cbp.sdk.facade.EndPointEnum();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 79) {
                if (highResolutionOutputSizeshNQ4ISI != 104) {
                    if (highResolutionOutputSizeshNQ4ISI != 106) {
                        if (highResolutionOutputSizeshNQ4ISI != 288) {
                            if (highResolutionOutputSizeshNQ4ISI != 428) {
                                if (highResolutionOutputSizeshNQ4ISI != 441) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    endPointEnum.TEST = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    endPointEnum.TEST = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                endPointEnum.PROD = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                endPointEnum.PROD = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            endPointEnum.DEV = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            endPointEnum.DEV = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        endPointEnum.CERT = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        endPointEnum.CERT = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    endPointEnum.SBX = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    endPointEnum.SBX = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                endPointEnum.QA = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                endPointEnum.QA = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return endPointEnum;
    }
}
