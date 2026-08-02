package com.visa.cbp;

/* loaded from: classes5.dex */
public final class Camera2StreamConfigurationMap extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public Camera2StreamConfigurationMap(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.setDeviceId setdeviceid = (com.visa.cbp.setDeviceId) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (setdeviceid != setdeviceid.getHighSpeedVideoFpsRangesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 430);
            jsonWriter.value(setdeviceid.getHighSpeedVideoFpsRangesFor);
        }
        if (setdeviceid != setdeviceid.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 345);
            jsonWriter.value(setdeviceid.Camera2StreamConfigurationMap);
        }
        if (setdeviceid != setdeviceid.getHighSpeedVideoSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 371);
            jsonWriter.value(setdeviceid.getHighSpeedVideoSizes);
        }
        if (setdeviceid != setdeviceid.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 316);
            jsonWriter.value(setdeviceid.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (setdeviceid != setdeviceid.getHighSpeedVideoFpsRanges) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 179);
            com.visa.cbp.external.common.StaticParams staticParams = setdeviceid.getHighSpeedVideoFpsRanges;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.StaticParams.class, staticParams).write(jsonWriter, staticParams);
        }
        if (setdeviceid != setdeviceid.getHighSpeedVideoSizesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 347);
            com.visa.cbp.sdk.facade.TokenRepersoStatus tokenRepersoStatus = setdeviceid.getHighSpeedVideoSizesFor;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.TokenRepersoStatus.class, tokenRepersoStatus).write(jsonWriter, tokenRepersoStatus);
        }
        if (setdeviceid != setdeviceid.getInputFormats) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 105);
            com.visa.cbp.external.common.ExpirationDate expirationDate = setdeviceid.getInputFormats;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.ExpirationDate.class, expirationDate).write(jsonWriter, expirationDate);
        }
        if (setdeviceid != setdeviceid.getOutputMinFrameDuration) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 57);
            jsonWriter.value(setdeviceid.getOutputMinFrameDuration);
        }
        if (setdeviceid != setdeviceid.getInputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 120);
            jsonWriter.value(setdeviceid.getInputSizeshNQ4ISI);
        }
        if (setdeviceid != setdeviceid.getOutputFormats) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.knotapi.knot.utilities.Constants.ID_KROGER);
            jsonWriter.value(setdeviceid.getOutputFormats);
        }
        if (setdeviceid != setdeviceid.getOutputSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
            com.visa.cbp.external.common.ExpirationDate expirationDate2 = setdeviceid.getOutputSizes;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.ExpirationDate.class, expirationDate2).write(jsonWriter, expirationDate2);
        }
        if (setdeviceid != setdeviceid.getOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 176);
            jsonWriter.value(setdeviceid.getOutputSizeshNQ4ISI);
        }
        if (setdeviceid != setdeviceid.getOutputMinFrameDurationlomOqCM) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 453);
            com.visa.cbp.sdk.facade.data.TokenKey tokenKey = setdeviceid.getOutputMinFrameDurationlomOqCM;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.data.TokenKey.class, tokenKey).write(jsonWriter, tokenKey);
        }
        if (setdeviceid != setdeviceid.getOutputStallDurationlomOqCM) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 389);
            jsonWriter.value(setdeviceid.getOutputStallDurationlomOqCM);
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
        com.visa.cbp.setDeviceId setdeviceid = new com.visa.cbp.setDeviceId();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 33:
                    if (!z) {
                        setdeviceid.getInputFormats = null;
                        break;
                    } else {
                        setdeviceid.getInputFormats = (com.visa.cbp.external.common.ExpirationDate) gson.getAdapter(com.visa.cbp.external.common.ExpirationDate.class).read2(jsonReader);
                        break;
                    }
                case 112:
                    if (!z) {
                        setdeviceid.getOutputMinFrameDuration = null;
                        break;
                    } else {
                        setdeviceid.getOutputMinFrameDuration = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 113:
                    if (!z) {
                        setdeviceid.getHighSpeedVideoSizes = null;
                        break;
                    } else {
                        setdeviceid.getHighSpeedVideoSizes = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 154:
                    if (!z) {
                        setdeviceid.getHighSpeedVideoFpsRanges = null;
                        break;
                    } else {
                        setdeviceid.getHighSpeedVideoFpsRanges = (com.visa.cbp.external.common.StaticParams) gson.getAdapter(com.visa.cbp.external.common.StaticParams.class).read2(jsonReader);
                        break;
                    }
                case 160:
                    if (!z) {
                        setdeviceid.getHighResolutionOutputSizeshNQ4ISI = null;
                        break;
                    } else {
                        setdeviceid.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 163:
                    if (!z) {
                        setdeviceid.getOutputSizes = null;
                        break;
                    } else {
                        setdeviceid.getOutputSizes = (com.visa.cbp.external.common.ExpirationDate) gson.getAdapter(com.visa.cbp.external.common.ExpirationDate.class).read2(jsonReader);
                        break;
                    }
                case 181:
                    if (!z) {
                        setdeviceid.getOutputSizeshNQ4ISI = null;
                        break;
                    } else {
                        setdeviceid.getOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 247:
                    if (!z) {
                        setdeviceid.Camera2StreamConfigurationMap = null;
                        break;
                    } else {
                        setdeviceid.Camera2StreamConfigurationMap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        setdeviceid.getOutputStallDurationlomOqCM = null;
                        break;
                    } else {
                        setdeviceid.getOutputStallDurationlomOqCM = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                    if (!z) {
                        setdeviceid.getOutputMinFrameDurationlomOqCM = null;
                        break;
                    } else {
                        setdeviceid.getOutputMinFrameDurationlomOqCM = (com.visa.cbp.sdk.facade.data.TokenKey) gson.getAdapter(com.visa.cbp.sdk.facade.data.TokenKey.class).read2(jsonReader);
                        break;
                    }
                case 364:
                    if (!z) {
                        setdeviceid.getInputSizeshNQ4ISI = null;
                        break;
                    } else {
                        setdeviceid.getInputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 406:
                    if (!z) {
                        setdeviceid.getHighSpeedVideoSizesFor = null;
                        break;
                    } else {
                        setdeviceid.getHighSpeedVideoSizesFor = (com.visa.cbp.sdk.facade.TokenRepersoStatus) gson.getAdapter(com.visa.cbp.sdk.facade.TokenRepersoStatus.class).read2(jsonReader);
                        break;
                    }
                case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE /* 416 */:
                    if (!z) {
                        setdeviceid.getHighSpeedVideoFpsRangesFor = null;
                        break;
                    } else {
                        setdeviceid.getHighSpeedVideoFpsRangesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 442:
                    if (!z) {
                        setdeviceid.getOutputFormats = null;
                        break;
                    } else {
                        setdeviceid.getOutputFormats = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return setdeviceid;
    }
}
