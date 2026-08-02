package o;

/* loaded from: classes5.dex */
public final class ITrustedWebActivityServiceDefault extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public ITrustedWebActivityServiceDefault(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.evaluator.SpecsResponse specsResponse = (com.statsig.androidsdk.evaluator.SpecsResponse) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = specsResponse.defaultEnvironment;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 362);
        jsonWriter.value(specsResponse.defaultEnvironment);
        if (specsResponse != specsResponse.diagnostics) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 119);
            o.INotificationSideChannelDefault iNotificationSideChannelDefault = new o.INotificationSideChannelDefault();
            java.util.Map<java.lang.String, java.lang.Integer> map = specsResponse.diagnostics;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iNotificationSideChannelDefault, map).write(jsonWriter, map);
        }
        if (specsResponse != specsResponse.dynamicConfigs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 283);
            o.read readVar = new o.read();
            java.util.List<com.statsig.androidsdk.evaluator.Spec> list = specsResponse.dynamicConfigs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, readVar, list).write(jsonWriter, list);
        }
        if (specsResponse != specsResponse.featureGates) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 394);
            o.write writeVar = new o.write();
            java.util.List<com.statsig.androidsdk.evaluator.Spec> list2 = specsResponse.featureGates;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, writeVar, list2).write(jsonWriter, list2);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 95);
        jsonWriter.value(specsResponse.hasUpdates);
        if (specsResponse != specsResponse.layerConfigs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 155);
            o.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new o.RemoteActionCompatParcelizer();
            java.util.List<com.statsig.androidsdk.evaluator.Spec> list3 = specsResponse.layerConfigs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, remoteActionCompatParcelizer, list3).write(jsonWriter, list3);
        }
        if (specsResponse != specsResponse.layers) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 1);
            o.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = new o.INotificationSideChannelStubProxy();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2 = specsResponse.layers;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iNotificationSideChannelStubProxy, map2).write(jsonWriter, map2);
        }
        if (specsResponse != specsResponse.paramStores) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
            o.INotificationSideChannelStub iNotificationSideChannelStub = new o.INotificationSideChannelStub();
            java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> map3 = specsResponse.paramStores;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iNotificationSideChannelStub, map3).write(jsonWriter, map3);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 138);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(specsResponse.time);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.evaluator.SpecsResponse specsResponse = new com.statsig.androidsdk.evaluator.SpecsResponse();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 12) {
                if (highResolutionOutputSizeshNQ4ISI != 86) {
                    if (highResolutionOutputSizeshNQ4ISI != 221) {
                        if (highResolutionOutputSizeshNQ4ISI != 243) {
                            if (highResolutionOutputSizeshNQ4ISI != 245) {
                                if (highResolutionOutputSizeshNQ4ISI != 345) {
                                    if (highResolutionOutputSizeshNQ4ISI != 361) {
                                        if (highResolutionOutputSizeshNQ4ISI != 370) {
                                            if (highResolutionOutputSizeshNQ4ISI != 392) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                specsResponse.time = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                                            } else {
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            specsResponse.layers = (java.util.Map) gson.getAdapter(new o.INotificationSideChannelStubProxy()).read2(jsonReader);
                                        } else {
                                            specsResponse.layers = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        specsResponse.defaultEnvironment = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        specsResponse.defaultEnvironment = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    specsResponse.diagnostics = (java.util.Map) gson.getAdapter(new o.INotificationSideChannelDefault()).read2(jsonReader);
                                } else {
                                    specsResponse.diagnostics = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                specsResponse.dynamicConfigs = (java.util.List) gson.getAdapter(new o.read()).read2(jsonReader);
                            } else {
                                specsResponse.dynamicConfigs = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            specsResponse.hasUpdates = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        specsResponse.paramStores = (java.util.Map) gson.getAdapter(new o.INotificationSideChannelStub()).read2(jsonReader);
                    } else {
                        specsResponse.paramStores = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    specsResponse.featureGates = (java.util.List) gson.getAdapter(new o.write()).read2(jsonReader);
                } else {
                    specsResponse.featureGates = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                specsResponse.layerConfigs = (java.util.List) gson.getAdapter(new o.RemoteActionCompatParcelizer()).read2(jsonReader);
            } else {
                specsResponse.layerConfigs = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return specsResponse;
    }
}
