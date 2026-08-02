package o;

/* loaded from: classes5.dex */
public final class IconCompatParcelizer extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;

    public IconCompatParcelizer(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.encryptionutils.common.DPM dpm = (com.visa.cbp.encryptionutils.common.DPM) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = dpm.getHighResolutionOutputSizeshNQ4ISI;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 399);
        jsonWriter.value(dpm.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.String str2 = dpm.Camera2StreamConfigurationMap;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 62);
        jsonWriter.value(dpm.Camera2StreamConfigurationMap);
        java.lang.String str3 = dpm.getHighSpeedVideoSizes;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 63);
        jsonWriter.value(dpm.getHighSpeedVideoSizes);
        java.lang.String str4 = dpm.getHighSpeedVideoFpsRangesFor;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 236);
        jsonWriter.value(dpm.getHighSpeedVideoFpsRangesFor);
        java.lang.String str5 = dpm.getHighSpeedVideoFpsRanges;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 19);
        jsonWriter.value(dpm.getHighSpeedVideoFpsRanges);
        java.lang.String str6 = dpm.getOutputFormats;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
        jsonWriter.value(dpm.getOutputFormats);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.encryptionutils.common.DPM dpm = new com.visa.cbp.encryptionutils.common.DPM();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 69) {
                if (highResolutionOutputSizeshNQ4ISI != 175) {
                    if (highResolutionOutputSizeshNQ4ISI != 268) {
                        if (highResolutionOutputSizeshNQ4ISI != 311) {
                            if (highResolutionOutputSizeshNQ4ISI != 367) {
                                if (highResolutionOutputSizeshNQ4ISI != 371) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    dpm.Camera2StreamConfigurationMap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    dpm.Camera2StreamConfigurationMap = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                dpm.getOutputFormats = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                dpm.getOutputFormats = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            dpm.getHighSpeedVideoFpsRangesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            dpm.getHighSpeedVideoFpsRangesFor = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        dpm.getHighSpeedVideoSizes = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        dpm.getHighSpeedVideoSizes = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    dpm.getHighSpeedVideoFpsRanges = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    dpm.getHighSpeedVideoFpsRanges = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                dpm.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                dpm.getHighResolutionOutputSizeshNQ4ISI = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return dpm;
    }
}
