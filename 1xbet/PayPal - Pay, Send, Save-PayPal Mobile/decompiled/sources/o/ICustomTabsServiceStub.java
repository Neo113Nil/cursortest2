package o;

/* loaded from: classes5.dex */
public final class ICustomTabsServiceStub extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public ICustomTabsServiceStub(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.APIDynamicConfig aPIDynamicConfig = (com.statsig.androidsdk.APIDynamicConfig) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = aPIDynamicConfig.allocatedExperimentName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET);
        jsonWriter.value(aPIDynamicConfig.allocatedExperimentName);
        java.lang.String[] strArr = aPIDynamicConfig.explicitParameters;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 352);
        java.lang.String[] strArr2 = aPIDynamicConfig.explicitParameters;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.String[].class, strArr2).write(jsonWriter, strArr2);
        java.lang.String str2 = aPIDynamicConfig.groupName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 59);
        jsonWriter.value(aPIDynamicConfig.groupName);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
        jsonWriter.value(aPIDynamicConfig.isDeviceBased);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 326);
        jsonWriter.value(aPIDynamicConfig.isExperimentActive);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 188);
        jsonWriter.value(aPIDynamicConfig.isUserInExperiment);
        java.lang.String str3 = aPIDynamicConfig.name;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 373);
        jsonWriter.value(aPIDynamicConfig.name);
        if (aPIDynamicConfig != aPIDynamicConfig.parameterRuleIDs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 354);
            o.newSession newsession = new o.newSession();
            java.util.Map<java.lang.String, java.lang.String> map = aPIDynamicConfig.parameterRuleIDs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, newsession, map).write(jsonWriter, map);
        }
        java.lang.String str4 = aPIDynamicConfig.ruleID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 310);
        jsonWriter.value(aPIDynamicConfig.ruleID);
        java.lang.Boolean bool = aPIDynamicConfig.rulePassed;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 320);
        jsonWriter.value(aPIDynamicConfig.rulePassed);
        if (aPIDynamicConfig != aPIDynamicConfig.secondaryExposures) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE);
            java.util.Map<java.lang.String, java.lang.String>[] mapArr = aPIDynamicConfig.secondaryExposures;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.util.Map[].class, mapArr).write(jsonWriter, mapArr);
        }
        if (aPIDynamicConfig != aPIDynamicConfig.undelegatedSecondaryExposures) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            java.util.Map<java.lang.String, java.lang.String>[] mapArr2 = aPIDynamicConfig.undelegatedSecondaryExposures;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.util.Map[].class, mapArr2).write(jsonWriter, mapArr2);
        }
        if (aPIDynamicConfig != aPIDynamicConfig.value) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 7);
            o.prefetchWithMultipleUrls prefetchwithmultipleurls = new o.prefetchWithMultipleUrls();
            java.util.Map<java.lang.String, java.lang.Object> map2 = aPIDynamicConfig.value;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, prefetchwithmultipleurls, map2).write(jsonWriter, map2);
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
        com.statsig.androidsdk.APIDynamicConfig aPIDynamicConfig = new com.statsig.androidsdk.APIDynamicConfig();
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 15:
                    if (!z) {
                        aPIDynamicConfig.name = null;
                        break;
                    } else {
                        aPIDynamicConfig.name = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 45:
                    if (!z) {
                        aPIDynamicConfig.allocatedExperimentName = null;
                        break;
                    } else {
                        aPIDynamicConfig.allocatedExperimentName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 87:
                    if (!z) {
                        aPIDynamicConfig.value = null;
                        break;
                    } else {
                        aPIDynamicConfig.value = (java.util.Map) gson.getAdapter(new o.prefetchWithMultipleUrls()).read2(jsonReader);
                        break;
                    }
                case 93:
                    if (!z) {
                        aPIDynamicConfig.secondaryExposures = null;
                        break;
                    } else {
                        aPIDynamicConfig.secondaryExposures = (java.util.Map[]) gson.getAdapter(new o.prefetch()).read2(jsonReader);
                        break;
                    }
                case 99:
                    if (!z) {
                        aPIDynamicConfig.undelegatedSecondaryExposures = null;
                        break;
                    } else {
                        aPIDynamicConfig.undelegatedSecondaryExposures = (java.util.Map[]) gson.getAdapter(new o.newSessionWithExtras()).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    if (!z) {
                        aPIDynamicConfig.parameterRuleIDs = null;
                        break;
                    } else {
                        aPIDynamicConfig.parameterRuleIDs = (java.util.Map) gson.getAdapter(new o.newSession()).read2(jsonReader);
                        break;
                    }
                case 200:
                    if (!z) {
                        aPIDynamicConfig.explicitParameters = null;
                        break;
                    } else {
                        aPIDynamicConfig.explicitParameters = (java.lang.String[]) gson.getAdapter(java.lang.String[].class).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                    if (!z) {
                        break;
                    } else {
                        aPIDynamicConfig.isExperimentActive = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 305:
                    if (!z) {
                        break;
                    } else {
                        aPIDynamicConfig.isUserInExperiment = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 366:
                    if (!z) {
                        break;
                    } else {
                        aPIDynamicConfig.isDeviceBased = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 407:
                    if (!z) {
                        aPIDynamicConfig.rulePassed = null;
                        break;
                    } else {
                        aPIDynamicConfig.rulePassed = (java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader);
                        break;
                    }
                case 427:
                    if (!z) {
                        aPIDynamicConfig.ruleID = null;
                        break;
                    } else {
                        aPIDynamicConfig.ruleID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 452:
                    if (!z) {
                        aPIDynamicConfig.groupName = null;
                        break;
                    } else {
                        aPIDynamicConfig.groupName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return aPIDynamicConfig;
    }
}
