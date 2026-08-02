package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoSizes extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public getHighSpeedVideoSizes(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.getEncryptionScheme getencryptionscheme = (com.visa.cbp.getEncryptionScheme) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (getencryptionscheme != getencryptionscheme.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 430);
            jsonWriter.value(getencryptionscheme.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (getencryptionscheme != getencryptionscheme.getHighSpeedVideoFpsRangesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 345);
            jsonWriter.value(getencryptionscheme.getHighSpeedVideoFpsRangesFor);
        }
        if (getencryptionscheme != getencryptionscheme.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 371);
            jsonWriter.value(getencryptionscheme.Camera2StreamConfigurationMap);
        }
        if (getencryptionscheme != getencryptionscheme.getHighSpeedVideoSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 105);
            jsonWriter.value(getencryptionscheme.getHighSpeedVideoSizes);
        }
        if (getencryptionscheme != getencryptionscheme.getHighSpeedVideoFpsRanges) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
            jsonWriter.value(getencryptionscheme.getHighSpeedVideoFpsRanges);
        }
        if (getencryptionscheme != getencryptionscheme.getInputFormats) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 176);
            jsonWriter.value(getencryptionscheme.getInputFormats);
        }
        if (getencryptionscheme != getencryptionscheme.getOutputFormats) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 453);
            jsonWriter.value(getencryptionscheme.getOutputFormats);
        }
        if (getencryptionscheme != getencryptionscheme.getInputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 389);
            jsonWriter.value(getencryptionscheme.getInputSizeshNQ4ISI);
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
        com.visa.cbp.getEncryptionScheme getencryptionscheme = new com.visa.cbp.getEncryptionScheme();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 33) {
                if (highResolutionOutputSizeshNQ4ISI != 113) {
                    if (highResolutionOutputSizeshNQ4ISI != 163) {
                        if (highResolutionOutputSizeshNQ4ISI != 181) {
                            if (highResolutionOutputSizeshNQ4ISI != 247) {
                                if (highResolutionOutputSizeshNQ4ISI != 284) {
                                    if (highResolutionOutputSizeshNQ4ISI != 287) {
                                        if (highResolutionOutputSizeshNQ4ISI != 416) {
                                            jsonReader.skipValue();
                                        } else if (z) {
                                            getencryptionscheme.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            getencryptionscheme.getHighResolutionOutputSizeshNQ4ISI = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        getencryptionscheme.getOutputFormats = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        getencryptionscheme.getOutputFormats = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    getencryptionscheme.getInputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    getencryptionscheme.getInputSizeshNQ4ISI = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                getencryptionscheme.getHighSpeedVideoFpsRangesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                getencryptionscheme.getHighSpeedVideoFpsRangesFor = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            getencryptionscheme.getInputFormats = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            getencryptionscheme.getInputFormats = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        getencryptionscheme.getHighSpeedVideoFpsRanges = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        getencryptionscheme.getHighSpeedVideoFpsRanges = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    getencryptionscheme.Camera2StreamConfigurationMap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    getencryptionscheme.Camera2StreamConfigurationMap = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                getencryptionscheme.getHighSpeedVideoSizes = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                getencryptionscheme.getHighSpeedVideoSizes = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return getencryptionscheme;
    }
}
