package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getOutputSizes extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public getOutputSizes(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.QVSDCData qVSDCData = (com.visa.cbp.external.common.QVSDCData) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (qVSDCData != qVSDCData.auc) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 77);
            jsonWriter.value(qVSDCData.auc);
        }
        if (qVSDCData != qVSDCData.ced) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 382);
            jsonWriter.value(qVSDCData.ced);
        }
        if (qVSDCData != qVSDCData.cid) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE);
            jsonWriter.value(qVSDCData.cid);
        }
        if (qVSDCData != qVSDCData.countryCode) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 102);
            jsonWriter.value(qVSDCData.countryCode);
        }
        if (qVSDCData != qVSDCData.ctq) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 58);
            jsonWriter.value(qVSDCData.ctq);
        }
        if (qVSDCData != qVSDCData.cvn) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 322);
            jsonWriter.value(qVSDCData.cvn);
        }
        if (qVSDCData != qVSDCData.digitalWalletID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 135);
            jsonWriter.value(qVSDCData.digitalWalletID);
        }
        if (qVSDCData != qVSDCData.ffi) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE);
            jsonWriter.value(qVSDCData.ffi);
        }
        if (qVSDCData != qVSDCData.psn) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
            jsonWriter.value(qVSDCData.psn);
        }
        if (qVSDCData != qVSDCData.qVSDCWithODA) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 175);
            com.visa.cbp.external.common.QVSDCWithODA qVSDCWithODA = qVSDCData.qVSDCWithODA;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.QVSDCWithODA.class, qVSDCWithODA).write(jsonWriter, qVSDCWithODA);
        }
        if (qVSDCData != qVSDCData.qVSDCWithoutODA) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
            com.visa.cbp.external.common.QVSDCWithoutODA qVSDCWithoutODA = qVSDCData.qVSDCWithoutODA;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.QVSDCWithoutODA.class, qVSDCWithoutODA).write(jsonWriter, qVSDCWithoutODA);
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
        com.visa.cbp.external.common.QVSDCData qVSDCData = new com.visa.cbp.external.common.QVSDCData();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 16:
                    if (!z) {
                        qVSDCData.digitalWalletID = null;
                        break;
                    } else {
                        qVSDCData.digitalWalletID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 21:
                    if (!z) {
                        qVSDCData.ctq = null;
                        break;
                    } else {
                        qVSDCData.ctq = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 96:
                    if (!z) {
                        qVSDCData.qVSDCWithoutODA = null;
                        break;
                    } else {
                        qVSDCData.qVSDCWithoutODA = (com.visa.cbp.external.common.QVSDCWithoutODA) gson.getAdapter(com.visa.cbp.external.common.QVSDCWithoutODA.class).read2(jsonReader);
                        break;
                    }
                case 117:
                    if (!z) {
                        qVSDCData.qVSDCWithODA = null;
                        break;
                    } else {
                        qVSDCData.qVSDCWithODA = (com.visa.cbp.external.common.QVSDCWithODA) gson.getAdapter(com.visa.cbp.external.common.QVSDCWithODA.class).read2(jsonReader);
                        break;
                    }
                case 165:
                    if (!z) {
                        qVSDCData.psn = null;
                        break;
                    } else {
                        qVSDCData.psn = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 197:
                    if (!z) {
                        qVSDCData.auc = null;
                        break;
                    } else {
                        qVSDCData.auc = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 238:
                    if (!z) {
                        qVSDCData.cid = null;
                        break;
                    } else {
                        qVSDCData.cid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 326:
                    if (!z) {
                        qVSDCData.ced = null;
                        break;
                    } else {
                        qVSDCData.ced = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 374:
                    if (!z) {
                        qVSDCData.countryCode = null;
                        break;
                    } else {
                        qVSDCData.countryCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                    if (!z) {
                        qVSDCData.ffi = null;
                        break;
                    } else {
                        qVSDCData.ffi = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 453:
                    if (!z) {
                        qVSDCData.cvn = null;
                        break;
                    } else {
                        qVSDCData.cvn = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return qVSDCData;
    }
}
