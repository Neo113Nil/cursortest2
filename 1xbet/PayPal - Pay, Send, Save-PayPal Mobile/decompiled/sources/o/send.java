package o;

/* loaded from: classes5.dex */
public final class send extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;

    public send(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.encryptionutils.common.EncDevicePersoData encDevicePersoData = (com.visa.cbp.encryptionutils.common.EncDevicePersoData) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (encDevicePersoData != encDevicePersoData.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 148);
            jsonWriter.value(encDevicePersoData.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (encDevicePersoData != encDevicePersoData.getHighSpeedVideoFpsRangesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 401);
            jsonWriter.value(encDevicePersoData.getHighSpeedVideoFpsRangesFor);
        }
        if (encDevicePersoData != encDevicePersoData.getHighSpeedVideoFpsRanges) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
            jsonWriter.value(encDevicePersoData.getHighSpeedVideoFpsRanges);
        }
        if (encDevicePersoData != encDevicePersoData.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 140);
            jsonWriter.value(encDevicePersoData.Camera2StreamConfigurationMap);
        }
        if (encDevicePersoData != encDevicePersoData.getHighSpeedVideoSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 443);
            jsonWriter.value(encDevicePersoData.getHighSpeedVideoSizes);
        }
        if (encDevicePersoData != encDevicePersoData.getOutputFormats) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 350);
            jsonWriter.value(encDevicePersoData.getOutputFormats);
        }
        if (encDevicePersoData != encDevicePersoData.getInputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 130);
            jsonWriter.value(encDevicePersoData.getInputSizeshNQ4ISI);
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
        com.visa.cbp.encryptionutils.common.EncDevicePersoData encDevicePersoData = new com.visa.cbp.encryptionutils.common.EncDevicePersoData();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 26) {
                if (highResolutionOutputSizeshNQ4ISI != 215) {
                    if (highResolutionOutputSizeshNQ4ISI != 264) {
                        if (highResolutionOutputSizeshNQ4ISI != 315) {
                            if (highResolutionOutputSizeshNQ4ISI != 329) {
                                if (highResolutionOutputSizeshNQ4ISI != 352) {
                                    if (highResolutionOutputSizeshNQ4ISI != 385) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        encDevicePersoData.Camera2StreamConfigurationMap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        encDevicePersoData.Camera2StreamConfigurationMap = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    encDevicePersoData.getHighSpeedVideoFpsRangesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    encDevicePersoData.getHighSpeedVideoFpsRangesFor = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                encDevicePersoData.getHighSpeedVideoSizes = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                encDevicePersoData.getHighSpeedVideoSizes = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            encDevicePersoData.getOutputFormats = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            encDevicePersoData.getOutputFormats = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        encDevicePersoData.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        encDevicePersoData.getHighResolutionOutputSizeshNQ4ISI = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    encDevicePersoData.getHighSpeedVideoFpsRanges = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    encDevicePersoData.getHighSpeedVideoFpsRanges = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                encDevicePersoData.getInputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                encDevicePersoData.getInputSizeshNQ4ISI = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return encDevicePersoData;
    }
}
