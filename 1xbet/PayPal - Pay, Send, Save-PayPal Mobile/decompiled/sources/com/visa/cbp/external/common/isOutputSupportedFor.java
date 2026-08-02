package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public final class isOutputSupportedFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private com.google.gson.Gson getHighSpeedVideoSizes;

    public isOutputSupportedFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.common.TokenBinPubKeyCert tokenBinPubKeyCert = (com.visa.cbp.external.common.TokenBinPubKeyCert) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        if (tokenBinPubKeyCert != tokenBinPubKeyCert.certificate) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
            jsonWriter.value(tokenBinPubKeyCert.certificate);
        }
        if (tokenBinPubKeyCert != tokenBinPubKeyCert.expirationDate) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
            com.visa.cbp.external.common.ExpirationDate expirationDate = tokenBinPubKeyCert.expirationDate;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.ExpirationDate.class, expirationDate).write(jsonWriter, expirationDate);
        }
        if (tokenBinPubKeyCert != tokenBinPubKeyCert.exponent) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 329);
            jsonWriter.value(tokenBinPubKeyCert.exponent);
        }
        if (tokenBinPubKeyCert != tokenBinPubKeyCert.remainder) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 409);
            jsonWriter.value(tokenBinPubKeyCert.remainder);
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
        com.visa.cbp.external.common.TokenBinPubKeyCert tokenBinPubKeyCert = new com.visa.cbp.external.common.TokenBinPubKeyCert();
        com.google.gson.Gson gson = this.getHighSpeedVideoSizes;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 88) {
                if (highResolutionOutputSizeshNQ4ISI != 189) {
                    if (highResolutionOutputSizeshNQ4ISI != 249) {
                        if (highResolutionOutputSizeshNQ4ISI != 454) {
                            jsonReader.skipValue();
                        } else if (z) {
                            tokenBinPubKeyCert.expirationDate = (com.visa.cbp.external.common.ExpirationDate) gson.getAdapter(com.visa.cbp.external.common.ExpirationDate.class).read2(jsonReader);
                        } else {
                            tokenBinPubKeyCert.expirationDate = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        tokenBinPubKeyCert.remainder = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        tokenBinPubKeyCert.remainder = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    tokenBinPubKeyCert.certificate = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    tokenBinPubKeyCert.certificate = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                tokenBinPubKeyCert.exponent = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                tokenBinPubKeyCert.exponent = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return tokenBinPubKeyCert;
    }
}
