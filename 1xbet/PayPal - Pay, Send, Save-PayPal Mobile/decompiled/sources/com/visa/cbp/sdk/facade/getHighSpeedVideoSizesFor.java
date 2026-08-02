package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoSizesFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRangesFor;

    public getHighSpeedVideoSizesFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRangesFor = gson;
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
        com.visa.cbp.sdk.facade.CryptoCredentialClaimSet cryptoCredentialClaimSet = (com.visa.cbp.sdk.facade.CryptoCredentialClaimSet) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (cryptoCredentialClaimSet != cryptoCredentialClaimSet.aud) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 65);
            java.lang.String[] strArr = cryptoCredentialClaimSet.aud;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.String[].class, strArr).write(jsonWriter, strArr);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 211);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(cryptoCredentialClaimSet.exp);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 63);
        java.lang.Class cls2 = java.lang.Long.TYPE;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(cryptoCredentialClaimSet.iat);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls2, valueOf2).write(jsonWriter, valueOf2);
        if (cryptoCredentialClaimSet != cryptoCredentialClaimSet.iss) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 359);
            jsonWriter.value(cryptoCredentialClaimSet.iss);
        }
        if (cryptoCredentialClaimSet != cryptoCredentialClaimSet.iss_knd) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 50);
            jsonWriter.value(cryptoCredentialClaimSet.iss_knd);
        }
        if (cryptoCredentialClaimSet != cryptoCredentialClaimSet.jti) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 327);
            jsonWriter.value(cryptoCredentialClaimSet.jti);
        }
        if (cryptoCredentialClaimSet != cryptoCredentialClaimSet.key_agr) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
            com.visa.cbp.sdk.facade.KeyAgr keyAgr = cryptoCredentialClaimSet.key_agr;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.KeyAgr.class, keyAgr).write(jsonWriter, keyAgr);
        }
        if (cryptoCredentialClaimSet != cryptoCredentialClaimSet.key_dm) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 360);
            com.visa.cbp.sdk.facade.KeyDm keyDm = cryptoCredentialClaimSet.key_dm;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.KeyDm.class, keyDm).write(jsonWriter, keyDm);
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
        com.visa.cbp.sdk.facade.CryptoCredentialClaimSet cryptoCredentialClaimSet = new com.visa.cbp.sdk.facade.CryptoCredentialClaimSet();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRangesFor;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 43) {
                if (highResolutionOutputSizeshNQ4ISI != 148) {
                    if (highResolutionOutputSizeshNQ4ISI != 190) {
                        if (highResolutionOutputSizeshNQ4ISI != 210) {
                            if (highResolutionOutputSizeshNQ4ISI != 268) {
                                if (highResolutionOutputSizeshNQ4ISI != 337) {
                                    if (highResolutionOutputSizeshNQ4ISI != 450) {
                                        if (highResolutionOutputSizeshNQ4ISI != 451) {
                                            jsonReader.skipValue();
                                        } else if (z) {
                                            cryptoCredentialClaimSet.iss = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            cryptoCredentialClaimSet.iss = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        cryptoCredentialClaimSet.aud = (java.lang.String[]) gson.getAdapter(java.lang.String[].class).read2(jsonReader);
                                    } else {
                                        cryptoCredentialClaimSet.aud = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    cryptoCredentialClaimSet.key_agr = (com.visa.cbp.sdk.facade.KeyAgr) gson.getAdapter(com.visa.cbp.sdk.facade.KeyAgr.class).read2(jsonReader);
                                } else {
                                    cryptoCredentialClaimSet.key_agr = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                cryptoCredentialClaimSet.iat = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                            } else {
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            cryptoCredentialClaimSet.key_dm = (com.visa.cbp.sdk.facade.KeyDm) gson.getAdapter(com.visa.cbp.sdk.facade.KeyDm.class).read2(jsonReader);
                        } else {
                            cryptoCredentialClaimSet.key_dm = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        cryptoCredentialClaimSet.jti = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        cryptoCredentialClaimSet.jti = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    cryptoCredentialClaimSet.iss_knd = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    cryptoCredentialClaimSet.iss_knd = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                cryptoCredentialClaimSet.exp = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return cryptoCredentialClaimSet;
    }
}
