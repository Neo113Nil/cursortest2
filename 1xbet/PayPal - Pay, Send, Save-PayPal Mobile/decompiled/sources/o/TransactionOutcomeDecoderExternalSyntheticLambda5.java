package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda5 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public TransactionOutcomeDecoderExternalSyntheticLambda5(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.payair.model.DynamicParameters dynamicParameters = (com.payair.model.DynamicParameters) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = dynamicParameters.api;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 259);
        jsonWriter.value(dynamicParameters.api);
        java.lang.String str2 = dynamicParameters.dki;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE);
        jsonWriter.value(dynamicParameters.dki);
        java.lang.String str3 = dynamicParameters.encKeyInfo;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE);
        jsonWriter.value(dynamicParameters.encKeyInfo);
        java.lang.String str4 = dynamicParameters.keyExpTS;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 375);
        jsonWriter.value(dynamicParameters.keyExpTS);
        java.lang.String str5 = dynamicParameters.maxPmts;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 110);
        jsonWriter.value(dynamicParameters.maxPmts);
        com.payair.model.ParamsStatus paramsStatus = dynamicParameters.paramsStatus;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        com.payair.model.ParamsStatus paramsStatus2 = dynamicParameters.paramsStatus;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ParamsStatus.class, paramsStatus2).write(jsonWriter, paramsStatus2);
        java.lang.String str6 = dynamicParameters.sc;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 307);
        jsonWriter.value(dynamicParameters.sc);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.DynamicParameters dynamicParameters = new com.payair.model.DynamicParameters();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 107) {
                if (highResolutionOutputSizeshNQ4ISI != 122) {
                    if (highResolutionOutputSizeshNQ4ISI != 139) {
                        if (highResolutionOutputSizeshNQ4ISI != 226) {
                            if (highResolutionOutputSizeshNQ4ISI != 230) {
                                if (highResolutionOutputSizeshNQ4ISI != 338) {
                                    if (highResolutionOutputSizeshNQ4ISI != 434) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        dynamicParameters.api = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        dynamicParameters.api = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    dynamicParameters.sc = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    dynamicParameters.sc = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                dynamicParameters.maxPmts = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                dynamicParameters.maxPmts = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            dynamicParameters.dki = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            dynamicParameters.dki = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        dynamicParameters.paramsStatus = (com.payair.model.ParamsStatus) gson.getAdapter(com.payair.model.ParamsStatus.class).read2(jsonReader);
                    } else {
                        dynamicParameters.paramsStatus = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    dynamicParameters.encKeyInfo = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    dynamicParameters.encKeyInfo = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                dynamicParameters.keyExpTS = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                dynamicParameters.keyExpTS = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return dynamicParameters;
    }
}
