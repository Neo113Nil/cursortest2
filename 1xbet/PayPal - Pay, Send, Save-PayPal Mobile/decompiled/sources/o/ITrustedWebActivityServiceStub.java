package o;

/* loaded from: classes5.dex */
public final class ITrustedWebActivityServiceStub extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public ITrustedWebActivityServiceStub(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.statsig.androidsdk.evaluator.SpecRule specRule = (com.statsig.androidsdk.evaluator.SpecRule) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (specRule != specRule.conditions) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 305);
            o.INotificationSideChannel iNotificationSideChannel = new o.INotificationSideChannel();
            java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> list = specRule.conditions;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iNotificationSideChannel, list).write(jsonWriter, list);
        }
        java.lang.String str = specRule.configDelegate;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED);
        jsonWriter.value(specRule.configDelegate);
        java.lang.String str2 = specRule.groupName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 341);
        jsonWriter.value(specRule.groupName);
        java.lang.String str3 = specRule.id;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 83);
        jsonWriter.value(specRule.id);
        java.lang.String str4 = specRule.idType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        jsonWriter.value(specRule.idType);
        java.lang.Boolean bool = specRule.isExperimentGroup;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD);
        jsonWriter.value(specRule.isExperimentGroup);
        java.lang.String str5 = specRule.name;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 373);
        jsonWriter.value(specRule.name);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 197);
        java.lang.Class cls = java.lang.Double.TYPE;
        java.lang.Double valueOf = java.lang.Double.valueOf(specRule.passPercentage);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = specRule.returnValue;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue2 = specRule.returnValue;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.statsig.androidsdk.evaluator.ReturnableValue.class, returnableValue2).write(jsonWriter, returnableValue2);
        java.lang.String str6 = specRule.salt;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 300);
        jsonWriter.value(specRule.salt);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.evaluator.SpecRule specRule = new com.statsig.androidsdk.evaluator.SpecRule();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 3) {
                if (highResolutionOutputSizeshNQ4ISI != 11) {
                    if (highResolutionOutputSizeshNQ4ISI != 15) {
                        if (highResolutionOutputSizeshNQ4ISI != 19) {
                            if (highResolutionOutputSizeshNQ4ISI != 48) {
                                if (highResolutionOutputSizeshNQ4ISI != 142) {
                                    if (highResolutionOutputSizeshNQ4ISI != 153) {
                                        if (highResolutionOutputSizeshNQ4ISI != 169) {
                                            if (highResolutionOutputSizeshNQ4ISI != 415) {
                                                if (highResolutionOutputSizeshNQ4ISI != 445) {
                                                    jsonReader.skipValue();
                                                } else if (z) {
                                                    specRule.returnValue = (com.statsig.androidsdk.evaluator.ReturnableValue) gson.getAdapter(com.statsig.androidsdk.evaluator.ReturnableValue.class).read2(jsonReader);
                                                } else {
                                                    specRule.returnValue = null;
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                specRule.passPercentage = ((java.lang.Double) gson.getAdapter(java.lang.Double.class).read2(jsonReader)).doubleValue();
                                            } else {
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            specRule.conditions = (java.util.List) gson.getAdapter(new o.INotificationSideChannel()).read2(jsonReader);
                                        } else {
                                            specRule.conditions = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        specRule.configDelegate = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        specRule.configDelegate = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    specRule.groupName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    specRule.groupName = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                specRule.id = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                specRule.id = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            specRule.salt = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            specRule.salt = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        specRule.name = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        specRule.name = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    specRule.isExperimentGroup = (java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader);
                } else {
                    specRule.isExperimentGroup = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                specRule.idType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                specRule.idType = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return specRule;
    }
}
