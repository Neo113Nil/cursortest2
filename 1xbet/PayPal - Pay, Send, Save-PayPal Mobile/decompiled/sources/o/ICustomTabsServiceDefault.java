package o;

/* loaded from: classes5.dex */
public final class ICustomTabsServiceDefault extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;

    public ICustomTabsServiceDefault(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.APIFeatureGate aPIFeatureGate = (com.statsig.androidsdk.APIFeatureGate) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        java.lang.String str = aPIFeatureGate.groupName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 59);
        jsonWriter.value(aPIFeatureGate.groupName);
        java.lang.String str2 = aPIFeatureGate.idType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE);
        jsonWriter.value(aPIFeatureGate.idType);
        java.lang.String str3 = aPIFeatureGate.name;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 373);
        jsonWriter.value(aPIFeatureGate.name);
        java.lang.String str4 = aPIFeatureGate.ruleID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 310);
        jsonWriter.value(aPIFeatureGate.ruleID);
        if (aPIFeatureGate != aPIFeatureGate.secondaryExposures) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE);
            java.util.Map<java.lang.String, java.lang.String>[] mapArr = aPIFeatureGate.secondaryExposures;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.util.Map[].class, mapArr).write(jsonWriter, mapArr);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 7);
        jsonWriter.value(aPIFeatureGate.value);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.APIFeatureGate aPIFeatureGate = new com.statsig.androidsdk.APIFeatureGate();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 15) {
                if (highResolutionOutputSizeshNQ4ISI != 87) {
                    if (highResolutionOutputSizeshNQ4ISI != 93) {
                        if (highResolutionOutputSizeshNQ4ISI != 342) {
                            if (highResolutionOutputSizeshNQ4ISI != 427) {
                                if (highResolutionOutputSizeshNQ4ISI != 452) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    aPIFeatureGate.groupName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    aPIFeatureGate.groupName = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                aPIFeatureGate.ruleID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                aPIFeatureGate.ruleID = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            aPIFeatureGate.idType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            aPIFeatureGate.idType = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        aPIFeatureGate.secondaryExposures = (java.util.Map[]) gson.getAdapter(new o.receiveFile()).read2(jsonReader);
                    } else {
                        aPIFeatureGate.secondaryExposures = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    aPIFeatureGate.value = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                aPIFeatureGate.name = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                aPIFeatureGate.name = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return aPIFeatureGate;
    }
}
