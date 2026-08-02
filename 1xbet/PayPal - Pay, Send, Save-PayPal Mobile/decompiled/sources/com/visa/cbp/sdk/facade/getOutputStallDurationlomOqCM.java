package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getOutputStallDurationlomOqCM extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public getOutputStallDurationlomOqCM(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.JwkApu jwkApu = (com.visa.cbp.sdk.facade.JwkApu) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (jwkApu != jwkApu.crv) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 25);
            jsonWriter.value(jwkApu.crv);
        }
        if (jwkApu != jwkApu.kty) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE);
            jsonWriter.value(jwkApu.kty);
        }
        if (jwkApu != jwkApu.x) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 114);
            jsonWriter.value(jwkApu.x);
        }
        if (jwkApu != jwkApu.y) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
            jsonWriter.value(jwkApu.y);
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
        com.visa.cbp.sdk.facade.JwkApu jwkApu = new com.visa.cbp.sdk.facade.JwkApu();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 44) {
                if (highResolutionOutputSizeshNQ4ISI != 332) {
                    if (highResolutionOutputSizeshNQ4ISI != 354) {
                        if (highResolutionOutputSizeshNQ4ISI != 399) {
                            jsonReader.skipValue();
                        } else if (z) {
                            jwkApu.x = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            jwkApu.x = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        jwkApu.crv = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        jwkApu.crv = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    jwkApu.y = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    jwkApu.y = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                jwkApu.kty = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                jwkApu.kty = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return jwkApu;
    }
}
