package o;

/* loaded from: classes5.dex */
public final class onGreatestScrollPercentageIncreased extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public onGreatestScrollPercentageIncreased(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (successfulInitializeResponse != successfulInitializeResponse.configs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 283);
            o.requestPostMessageChannelWithExtras requestpostmessagechannelwithextras = new o.requestPostMessageChannelWithExtras();
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map = successfulInitializeResponse.configs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, requestpostmessagechannelwithextras, map).write(jsonWriter, map);
        }
        if (successfulInitializeResponse != successfulInitializeResponse.derivedFields) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 407);
            o.setEngagementSignalsCallback setengagementsignalscallback = new o.setEngagementSignalsCallback();
            java.util.Map<java.lang.String, java.lang.String> map2 = successfulInitializeResponse.derivedFields;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, setengagementsignalscallback, map2).write(jsonWriter, map2);
        }
        if (successfulInitializeResponse != successfulInitializeResponse.featureGates) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 394);
            o.requestPostMessageChannel requestpostmessagechannel = new o.requestPostMessageChannel();
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> map3 = successfulInitializeResponse.featureGates;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, requestpostmessagechannel, map3).write(jsonWriter, map3);
        }
        java.lang.String str = successfulInitializeResponse.fullChecksum;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 90);
        jsonWriter.value(successfulInitializeResponse.fullChecksum);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 95);
        jsonWriter.value(successfulInitializeResponse.hasUpdates);
        com.statsig.androidsdk.HashAlgorithm hashAlgorithm = successfulInitializeResponse.hashUsed;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE);
        com.statsig.androidsdk.HashAlgorithm hashAlgorithm2 = successfulInitializeResponse.hashUsed;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.statsig.androidsdk.HashAlgorithm.class, hashAlgorithm2).write(jsonWriter, hashAlgorithm2);
        if (successfulInitializeResponse != successfulInitializeResponse.layerConfigs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 155);
            o.validateRelationship validaterelationship = new o.validateRelationship();
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map4 = successfulInitializeResponse.layerConfigs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, validaterelationship, map4).write(jsonWriter, map4);
        }
        if (successfulInitializeResponse != successfulInitializeResponse.paramStores) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
            o.updateVisuals updatevisuals = new o.updateVisuals();
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> map5 = successfulInitializeResponse.paramStores;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, updatevisuals, map5).write(jsonWriter, map5);
        }
        if (successfulInitializeResponse != successfulInitializeResponse.sdkConfigs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 136);
            o.ICustomTabsService_Parcel iCustomTabsService_Parcel = new o.ICustomTabsService_Parcel();
            java.util.Map<java.lang.String, java.lang.Object> map6 = successfulInitializeResponse.sdkConfigs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iCustomTabsService_Parcel, map6).write(jsonWriter, map6);
        }
        if (successfulInitializeResponse != successfulInitializeResponse.sdkFlags) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            o.ICustomTabsServiceStubProxy iCustomTabsServiceStubProxy = new o.ICustomTabsServiceStubProxy();
            java.util.Map<java.lang.String, java.lang.Object> map7 = successfulInitializeResponse.sdkFlags;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iCustomTabsServiceStubProxy, map7).write(jsonWriter, map7);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 138);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(successfulInitializeResponse.time);
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
        com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = new com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 12:
                    if (!z) {
                        successfulInitializeResponse.layerConfigs = null;
                        break;
                    } else {
                        successfulInitializeResponse.layerConfigs = (java.util.Map) gson.getAdapter(new o.validateRelationship()).read2(jsonReader);
                        break;
                    }
                case 61:
                    if (!z) {
                        successfulInitializeResponse.derivedFields = null;
                        break;
                    } else {
                        successfulInitializeResponse.derivedFields = (java.util.Map) gson.getAdapter(new o.setEngagementSignalsCallback()).read2(jsonReader);
                        break;
                    }
                case 86:
                    if (!z) {
                        successfulInitializeResponse.featureGates = null;
                        break;
                    } else {
                        successfulInitializeResponse.featureGates = (java.util.Map) gson.getAdapter(new o.requestPostMessageChannel()).read2(jsonReader);
                        break;
                    }
                case 105:
                    if (!z) {
                        successfulInitializeResponse.fullChecksum = null;
                        break;
                    } else {
                        successfulInitializeResponse.fullChecksum = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    if (!z) {
                        successfulInitializeResponse.paramStores = null;
                        break;
                    } else {
                        successfulInitializeResponse.paramStores = (java.util.Map) gson.getAdapter(new o.updateVisuals()).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    if (!z) {
                        break;
                    } else {
                        successfulInitializeResponse.hasUpdates = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    if (!z) {
                        successfulInitializeResponse.configs = null;
                        break;
                    } else {
                        successfulInitializeResponse.configs = (java.util.Map) gson.getAdapter(new o.requestPostMessageChannelWithExtras()).read2(jsonReader);
                        break;
                    }
                case 363:
                    if (!z) {
                        successfulInitializeResponse.hashUsed = null;
                        break;
                    } else {
                        successfulInitializeResponse.hashUsed = (com.statsig.androidsdk.HashAlgorithm) gson.getAdapter(com.statsig.androidsdk.HashAlgorithm.class).read2(jsonReader);
                        break;
                    }
                case my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY /* 392 */:
                    if (!z) {
                        break;
                    } else {
                        successfulInitializeResponse.time = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                        break;
                    }
                case 409:
                    if (!z) {
                        successfulInitializeResponse.sdkFlags = null;
                        break;
                    } else {
                        successfulInitializeResponse.sdkFlags = (java.util.Map) gson.getAdapter(new o.ICustomTabsServiceStubProxy()).read2(jsonReader);
                        break;
                    }
                case 422:
                    if (!z) {
                        successfulInitializeResponse.sdkConfigs = null;
                        break;
                    } else {
                        successfulInitializeResponse.sdkConfigs = (java.util.Map) gson.getAdapter(new o.ICustomTabsService_Parcel()).read2(jsonReader);
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return successfulInitializeResponse;
    }
}
