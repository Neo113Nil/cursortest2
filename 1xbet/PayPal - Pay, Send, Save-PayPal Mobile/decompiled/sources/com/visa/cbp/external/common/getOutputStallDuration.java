package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class getOutputStallDuration extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public getOutputStallDuration(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.QVSDCWithODA qVSDCWithODA = (com.visa.cbp.external.common.QVSDCWithODA) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        if (qVSDCWithODA != qVSDCWithODA.afl) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            jsonWriter.value(qVSDCWithODA.afl);
        }
        if (qVSDCWithODA != qVSDCWithODA.aip) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            jsonWriter.value(qVSDCWithODA.aip);
        }
        if (qVSDCWithODA != qVSDCWithODA.appExpDate) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 181);
            jsonWriter.value(qVSDCWithODA.appExpDate);
        }
        if (qVSDCWithODA != qVSDCWithODA.capki) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 145);
            jsonWriter.value(qVSDCWithODA.capki);
        }
        if (qVSDCWithODA != qVSDCWithODA.cardAuthData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 87);
            jsonWriter.value(qVSDCWithODA.cardAuthData);
        }
        if (qVSDCWithODA != qVSDCWithODA.iPubkCert) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 93);
            jsonWriter.value(qVSDCWithODA.iPubkCert);
        }
        if (qVSDCWithODA != qVSDCWithODA.iPubkExpo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 434);
            jsonWriter.value(qVSDCWithODA.iPubkExpo);
        }
        if (qVSDCWithODA != qVSDCWithODA.iPubkRem) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 69);
            jsonWriter.value(qVSDCWithODA.iPubkRem);
        }
        if (qVSDCWithODA != qVSDCWithODA.icc) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 115);
            com.visa.cbp.external.common.ICC icc = qVSDCWithODA.icc;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.ICC.class, icc).write(jsonWriter, icc);
        }
        if (qVSDCWithODA != qVSDCWithODA.sdad) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 46);
            jsonWriter.value(qVSDCWithODA.sdad);
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
        com.visa.cbp.external.common.QVSDCWithODA qVSDCWithODA = new com.visa.cbp.external.common.QVSDCWithODA();
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 59) {
                if (highResolutionOutputSizeshNQ4ISI != 92) {
                    if (highResolutionOutputSizeshNQ4ISI != 121) {
                        if (highResolutionOutputSizeshNQ4ISI != 147) {
                            if (highResolutionOutputSizeshNQ4ISI != 256) {
                                if (highResolutionOutputSizeshNQ4ISI != 310) {
                                    if (highResolutionOutputSizeshNQ4ISI != 314) {
                                        if (highResolutionOutputSizeshNQ4ISI != 372) {
                                            if (highResolutionOutputSizeshNQ4ISI != 376) {
                                                if (highResolutionOutputSizeshNQ4ISI != 418) {
                                                    jsonReader.skipValue();
                                                } else if (z) {
                                                    qVSDCWithODA.iPubkCert = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                                } else {
                                                    qVSDCWithODA.iPubkCert = null;
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                qVSDCWithODA.cardAuthData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                            } else {
                                                qVSDCWithODA.cardAuthData = null;
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            qVSDCWithODA.capki = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            qVSDCWithODA.capki = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        qVSDCWithODA.sdad = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        qVSDCWithODA.sdad = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    qVSDCWithODA.aip = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    qVSDCWithODA.aip = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                qVSDCWithODA.afl = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                qVSDCWithODA.afl = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            qVSDCWithODA.appExpDate = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            qVSDCWithODA.appExpDate = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        qVSDCWithODA.icc = (com.visa.cbp.external.common.ICC) gson.getAdapter(com.visa.cbp.external.common.ICC.class).read2(jsonReader);
                    } else {
                        qVSDCWithODA.icc = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    qVSDCWithODA.iPubkExpo = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    qVSDCWithODA.iPubkExpo = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                qVSDCWithODA.iPubkRem = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                qVSDCWithODA.iPubkRem = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return qVSDCWithODA;
    }
}
