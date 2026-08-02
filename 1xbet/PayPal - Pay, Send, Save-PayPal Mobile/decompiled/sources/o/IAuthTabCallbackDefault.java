package o;

/* loaded from: classes4.dex */
public final class IAuthTabCallbackDefault extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public IAuthTabCallbackDefault(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.Camera2StreamConfigurationMap = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.QvsdcData qvsdcData = (com.payair.model.QvsdcData) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = qvsdcData.auc;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 77);
        jsonWriter.value(qvsdcData.auc);
        java.lang.String str2 = qvsdcData.ced;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 382);
        jsonWriter.value(qvsdcData.ced);
        java.lang.String str3 = qvsdcData.cid;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        jsonWriter.value(qvsdcData.cid);
        java.lang.String str4 = qvsdcData.countryCode;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 102);
        jsonWriter.value(qvsdcData.countryCode);
        java.lang.String str5 = qvsdcData.ctq;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 58);
        jsonWriter.value(qvsdcData.ctq);
        java.lang.String str6 = qvsdcData.cvn;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 322);
        jsonWriter.value(qvsdcData.cvn);
        java.lang.String str7 = qvsdcData.digitalWalletID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 135);
        jsonWriter.value(qvsdcData.digitalWalletID);
        java.lang.String str8 = qvsdcData.ffi;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE);
        jsonWriter.value(qvsdcData.ffi);
        java.lang.String str9 = qvsdcData.psn;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
        jsonWriter.value(qvsdcData.psn);
        com.payair.model.QvsdcWithoutOda qvsdcWithoutOda = qvsdcData.qVSDCWithoutODA;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
        com.payair.model.QvsdcWithoutOda qvsdcWithoutOda2 = qvsdcData.qVSDCWithoutODA;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.QvsdcWithoutOda.class, qvsdcWithoutOda2).write(jsonWriter, qvsdcWithoutOda2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.QvsdcData qvsdcData = new com.payair.model.QvsdcData();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 16) {
                if (highResolutionOutputSizeshNQ4ISI != 21) {
                    if (highResolutionOutputSizeshNQ4ISI != 96) {
                        if (highResolutionOutputSizeshNQ4ISI != 165) {
                            if (highResolutionOutputSizeshNQ4ISI != 197) {
                                if (highResolutionOutputSizeshNQ4ISI != 238) {
                                    if (highResolutionOutputSizeshNQ4ISI != 326) {
                                        if (highResolutionOutputSizeshNQ4ISI != 374) {
                                            if (highResolutionOutputSizeshNQ4ISI != 424) {
                                                if (highResolutionOutputSizeshNQ4ISI != 453) {
                                                    jsonReader.skipValue();
                                                } else if (z) {
                                                    qvsdcData.cvn = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                                } else {
                                                    qvsdcData.cvn = null;
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                qvsdcData.ffi = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                            } else {
                                                qvsdcData.ffi = null;
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            qvsdcData.countryCode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            qvsdcData.countryCode = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        qvsdcData.ced = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        qvsdcData.ced = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    qvsdcData.cid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    qvsdcData.cid = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                qvsdcData.auc = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                qvsdcData.auc = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            qvsdcData.psn = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            qvsdcData.psn = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        qvsdcData.qVSDCWithoutODA = (com.payair.model.QvsdcWithoutOda) gson.getAdapter(com.payair.model.QvsdcWithoutOda.class).read2(jsonReader);
                    } else {
                        qvsdcData.qVSDCWithoutODA = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    qvsdcData.ctq = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    qvsdcData.ctq = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                qvsdcData.digitalWalletID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                qvsdcData.digitalWalletID = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return qvsdcData;
    }
}
