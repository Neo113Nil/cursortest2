package o;

/* loaded from: classes5.dex */
public final class notifyNotificationWithChannel extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public notifyNotificationWithChannel(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.statsig.androidsdk.evaluator.Spec spec = (com.statsig.androidsdk.evaluator.Spec) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = spec.defaultValue;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue2 = spec.defaultValue;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.statsig.androidsdk.evaluator.ReturnableValue.class, returnableValue2).write(jsonWriter, returnableValue2);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 127);
        jsonWriter.value(spec.enabled);
        java.lang.String str = spec.entity;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 68);
        jsonWriter.value(spec.entity);
        if (spec != spec.explicitParameters) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
            o.cancelAll cancelall = new o.cancelAll();
            java.util.List<java.lang.String> list = spec.explicitParameters;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, cancelall, list).write(jsonWriter, list);
        }
        java.lang.Boolean bool = spec.hasSharedParams;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
        jsonWriter.value(spec.hasSharedParams);
        java.lang.String str2 = spec.idType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        jsonWriter.value(spec.idType);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE);
        jsonWriter.value(spec.isActive);
        java.lang.String str3 = spec.name;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 373);
        jsonWriter.value(spec.name);
        if (spec != spec.rules) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 199);
            o.cancel cancelVar = new o.cancel();
            java.util.List<com.statsig.androidsdk.evaluator.SpecRule> list2 = spec.rules;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, cancelVar, list2).write(jsonWriter, list2);
        }
        java.lang.String str4 = spec.salt;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 300);
        jsonWriter.value(spec.salt);
        if (spec != spec.targetAppIDs) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 10);
            o.IResultReceiverDefault iResultReceiverDefault = new o.IResultReceiverDefault();
            java.util.List<java.lang.String> list3 = spec.targetAppIDs;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iResultReceiverDefault, list3).write(jsonWriter, list3);
        }
        java.lang.String str5 = spec.type;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 183);
        jsonWriter.value(spec.type);
        java.lang.Integer num = spec.version;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.getAucAID);
        java.lang.Integer num2 = spec.version;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num2).write(jsonWriter, num2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.evaluator.Spec spec = new com.statsig.androidsdk.evaluator.Spec();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 3:
                    if (!z) {
                        spec.idType = null;
                        break;
                    } else {
                        spec.idType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 15:
                    if (!z) {
                        spec.name = null;
                        break;
                    } else {
                        spec.name = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 19:
                    if (!z) {
                        spec.salt = null;
                        break;
                    } else {
                        spec.salt = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 27:
                    if (!z) {
                        break;
                    } else {
                        spec.isActive = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 37:
                    if (!z) {
                        spec.version = null;
                        break;
                    } else {
                        spec.version = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                        break;
                    }
                case 57:
                    if (!z) {
                        spec.targetAppIDs = null;
                        break;
                    } else {
                        spec.targetAppIDs = (java.util.List) gson.getAdapter(new o.IResultReceiverDefault()).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    if (!z) {
                        spec.type = null;
                        break;
                    } else {
                        spec.type = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                    if (!z) {
                        spec.rules = null;
                        break;
                    } else {
                        spec.rules = (java.util.List) gson.getAdapter(new o.cancel()).read2(jsonReader);
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                    if (!z) {
                        spec.entity = null;
                        break;
                    } else {
                        spec.entity = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case com.visa.cbp.getCertUsage.getAucAID /* 331 */:
                    if (!z) {
                        spec.hasSharedParams = null;
                        break;
                    } else {
                        spec.hasSharedParams = (java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader);
                        break;
                    }
                case 356:
                    if (!z) {
                        break;
                    } else {
                        spec.enabled = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case 404:
                    if (!z) {
                        spec.explicitParameters = null;
                        break;
                    } else {
                        spec.explicitParameters = (java.util.List) gson.getAdapter(new o.cancelAll()).read2(jsonReader);
                        break;
                    }
                case 440:
                    if (!z) {
                        spec.defaultValue = null;
                        break;
                    } else {
                        spec.defaultValue = (com.statsig.androidsdk.evaluator.ReturnableValue) gson.getAdapter(com.statsig.androidsdk.evaluator.ReturnableValue.class).read2(jsonReader);
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return spec;
    }
}
