package o;

/* loaded from: classes5.dex */
public final class IPostMessageServiceDefault extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public IPostMessageServiceDefault(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.statsig.androidsdk.StatsigMetadata statsigMetadata = (com.statsig.androidsdk.StatsigMetadata) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        java.lang.String str = statsigMetadata.appIdentifier;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 449);
        jsonWriter.value(statsigMetadata.appIdentifier);
        java.lang.String str2 = statsigMetadata.appVersion;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 11);
        jsonWriter.value(statsigMetadata.appVersion);
        java.lang.String str3 = statsigMetadata.deviceManufacturer;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 82);
        jsonWriter.value(statsigMetadata.deviceManufacturer);
        java.lang.String str4 = statsigMetadata.deviceModel;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 369);
        jsonWriter.value(statsigMetadata.deviceModel);
        java.lang.String str5 = statsigMetadata.deviceOS;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 143);
        jsonWriter.value(statsigMetadata.deviceOS);
        java.lang.String str6 = statsigMetadata.language;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 187);
        jsonWriter.value(statsigMetadata.language);
        java.lang.String str7 = statsigMetadata.locale;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 368);
        jsonWriter.value(statsigMetadata.locale);
        java.lang.String str8 = statsigMetadata.sdkType;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 372);
        jsonWriter.value(statsigMetadata.sdkType);
        java.lang.String str9 = statsigMetadata.sdkVersion;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 339);
        jsonWriter.value(statsigMetadata.sdkVersion);
        java.lang.String str10 = statsigMetadata.sessionID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 48);
        jsonWriter.value(statsigMetadata.sessionID);
        java.lang.String str11 = statsigMetadata.stableID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 384);
        jsonWriter.value(statsigMetadata.stableID);
        java.lang.String str12 = statsigMetadata.systemName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 303);
        jsonWriter.value(statsigMetadata.systemName);
        java.lang.String str13 = statsigMetadata.systemVersion;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 419);
        jsonWriter.value(statsigMetadata.systemVersion);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.statsig.androidsdk.StatsigMetadata statsigMetadata = new com.statsig.androidsdk.StatsigMetadata();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 52:
                    if (!z) {
                        statsigMetadata.stableID = null;
                        break;
                    } else {
                        statsigMetadata.stableID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 65:
                    if (!z) {
                        statsigMetadata.sdkVersion = null;
                        break;
                    } else {
                        statsigMetadata.sdkVersion = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 82:
                    if (!z) {
                        statsigMetadata.sessionID = null;
                        break;
                    } else {
                        statsigMetadata.sessionID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 145:
                    if (!z) {
                        statsigMetadata.sdkType = null;
                        break;
                    } else {
                        statsigMetadata.sdkType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    if (!z) {
                        statsigMetadata.systemName = null;
                        break;
                    } else {
                        statsigMetadata.systemName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        statsigMetadata.appVersion = null;
                        break;
                    } else {
                        statsigMetadata.appVersion = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    if (!z) {
                        statsigMetadata.deviceManufacturer = null;
                        break;
                    } else {
                        statsigMetadata.deviceManufacturer = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ICON_PIN_VALUE:
                    if (!z) {
                        statsigMetadata.appIdentifier = null;
                        break;
                    } else {
                        statsigMetadata.appIdentifier = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 251:
                    if (!z) {
                        statsigMetadata.deviceModel = null;
                        break;
                    } else {
                        statsigMetadata.deviceModel = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    if (!z) {
                        statsigMetadata.language = null;
                        break;
                    } else {
                        statsigMetadata.language = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 389:
                    if (!z) {
                        statsigMetadata.systemVersion = null;
                        break;
                    } else {
                        statsigMetadata.systemVersion = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 391:
                    if (!z) {
                        statsigMetadata.deviceOS = null;
                        break;
                    } else {
                        statsigMetadata.deviceOS = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                    if (!z) {
                        statsigMetadata.locale = null;
                        break;
                    } else {
                        statsigMetadata.locale = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return statsigMetadata;
    }
}
