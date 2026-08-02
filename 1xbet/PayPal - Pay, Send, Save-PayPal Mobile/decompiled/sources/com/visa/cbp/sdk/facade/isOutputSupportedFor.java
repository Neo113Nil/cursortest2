package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class isOutputSupportedFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public isOutputSupportedFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.POPTokenPayload pOPTokenPayload = (com.visa.cbp.sdk.facade.POPTokenPayload) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (pOPTokenPayload != pOPTokenPayload.aud) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 65);
            java.lang.String[] strArr = pOPTokenPayload.aud;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.String[].class, strArr).write(jsonWriter, strArr);
        }
        if (pOPTokenPayload != pOPTokenPayload.auth) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 204);
            com.visa.cbp.sdk.facade.Auth auth = pOPTokenPayload.auth;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.Auth.class, auth).write(jsonWriter, auth);
        }
        if (pOPTokenPayload != pOPTokenPayload.body_hash) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 13);
            jsonWriter.value(pOPTokenPayload.body_hash);
        }
        if (pOPTokenPayload != pOPTokenPayload.cnf) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 81);
            com.visa.cbp.sdk.facade.Cnf cnf = pOPTokenPayload.cnf;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.Cnf.class, cnf).write(jsonWriter, cnf);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 211);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(pOPTokenPayload.exp);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        if (pOPTokenPayload != pOPTokenPayload.headers) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE);
            com.visa.cbp.sdk.facade.Headers headers = pOPTokenPayload.headers;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.Headers.class, headers).write(jsonWriter, headers);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 63);
        java.lang.Class cls2 = java.lang.Long.TYPE;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(pOPTokenPayload.iat);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls2, valueOf2).write(jsonWriter, valueOf2);
        if (pOPTokenPayload != pOPTokenPayload.iss) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 359);
            jsonWriter.value(pOPTokenPayload.iss);
        }
        if (pOPTokenPayload != pOPTokenPayload.jti) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 327);
            jsonWriter.value(pOPTokenPayload.jti);
        }
        if (pOPTokenPayload != pOPTokenPayload.method) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 325);
            jsonWriter.value(pOPTokenPayload.method);
        }
        if (pOPTokenPayload != pOPTokenPayload.path) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 24);
            jsonWriter.value(pOPTokenPayload.path);
        }
        if (pOPTokenPayload != pOPTokenPayload.sub) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
            jsonWriter.value(pOPTokenPayload.sub);
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
        com.visa.cbp.sdk.facade.POPTokenPayload pOPTokenPayload = new com.visa.cbp.sdk.facade.POPTokenPayload();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 43) {
                if (highResolutionOutputSizeshNQ4ISI != 85) {
                    if (highResolutionOutputSizeshNQ4ISI != 164) {
                        if (highResolutionOutputSizeshNQ4ISI != 190) {
                            if (highResolutionOutputSizeshNQ4ISI != 241) {
                                if (highResolutionOutputSizeshNQ4ISI != 268) {
                                    if (highResolutionOutputSizeshNQ4ISI != 279) {
                                        if (highResolutionOutputSizeshNQ4ISI != 312) {
                                            if (highResolutionOutputSizeshNQ4ISI != 321) {
                                                if (highResolutionOutputSizeshNQ4ISI != 325) {
                                                    if (highResolutionOutputSizeshNQ4ISI != 450) {
                                                        if (highResolutionOutputSizeshNQ4ISI != 451) {
                                                            jsonReader.skipValue();
                                                        } else if (z) {
                                                            pOPTokenPayload.iss = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                                        } else {
                                                            pOPTokenPayload.iss = null;
                                                            jsonReader.nextNull();
                                                        }
                                                    } else if (z) {
                                                        pOPTokenPayload.aud = (java.lang.String[]) gson.getAdapter(java.lang.String[].class).read2(jsonReader);
                                                    } else {
                                                        pOPTokenPayload.aud = null;
                                                        jsonReader.nextNull();
                                                    }
                                                } else if (z) {
                                                    pOPTokenPayload.method = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                                } else {
                                                    pOPTokenPayload.method = null;
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                pOPTokenPayload.sub = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                            } else {
                                                pOPTokenPayload.sub = null;
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            pOPTokenPayload.cnf = (com.visa.cbp.sdk.facade.Cnf) gson.getAdapter(com.visa.cbp.sdk.facade.Cnf.class).read2(jsonReader);
                                        } else {
                                            pOPTokenPayload.cnf = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        pOPTokenPayload.auth = (com.visa.cbp.sdk.facade.Auth) gson.getAdapter(com.visa.cbp.sdk.facade.Auth.class).read2(jsonReader);
                                    } else {
                                        pOPTokenPayload.auth = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    pOPTokenPayload.iat = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                                } else {
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                pOPTokenPayload.path = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                pOPTokenPayload.path = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            pOPTokenPayload.jti = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            pOPTokenPayload.jti = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        pOPTokenPayload.body_hash = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        pOPTokenPayload.body_hash = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    pOPTokenPayload.headers = (com.visa.cbp.sdk.facade.Headers) gson.getAdapter(com.visa.cbp.sdk.facade.Headers.class).read2(jsonReader);
                } else {
                    pOPTokenPayload.headers = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                pOPTokenPayload.exp = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return pOPTokenPayload;
    }
}
