package o;

/* loaded from: classes5.dex */
public final class ITrustedWebActivityService extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public ITrustedWebActivityService(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.evaluator.SpecCondition specCondition = (com.statsig.androidsdk.evaluator.SpecCondition) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (specCondition != specCondition.additionalValues) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 78);
            o.getSmallIconId getsmalliconid = new o.getSmallIconId();
            java.util.Map<java.lang.String, java.lang.Object> map = specCondition.additionalValues;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, getsmalliconid, map).write(jsonWriter, map);
        }
        java.lang.String str = specCondition.field;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 56);
        jsonWriter.value(specCondition.field);
        java.lang.String str2 = specCondition.idType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        jsonWriter.value(specCondition.idType);
        java.lang.String str3 = specCondition.operator;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 152);
        jsonWriter.value(specCondition.operator);
        if (specCondition != specCondition.targetValue) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 396);
            java.lang.Object obj2 = specCondition.targetValue;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Object.class, obj2).write(jsonWriter, obj2);
        }
        java.lang.String str4 = specCondition.type;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 183);
        jsonWriter.value(specCondition.type);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.evaluator.SpecCondition specCondition = new com.statsig.androidsdk.evaluator.SpecCondition();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 3) {
                if (highResolutionOutputSizeshNQ4ISI != 29) {
                    if (highResolutionOutputSizeshNQ4ISI != 49) {
                        if (highResolutionOutputSizeshNQ4ISI != 119) {
                            if (highResolutionOutputSizeshNQ4ISI != 229) {
                                if (highResolutionOutputSizeshNQ4ISI != 436) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    specCondition.additionalValues = (java.util.Map) gson.getAdapter(new o.getSmallIconId()).read2(jsonReader);
                                } else {
                                    specCondition.additionalValues = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                specCondition.type = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                specCondition.type = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            specCondition.targetValue = gson.getAdapter(java.lang.Object.class).read2(jsonReader);
                        } else {
                            specCondition.targetValue = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        specCondition.operator = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        specCondition.operator = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    specCondition.field = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    specCondition.field = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                specCondition.idType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                specCondition.idType = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return specCondition;
    }
}
