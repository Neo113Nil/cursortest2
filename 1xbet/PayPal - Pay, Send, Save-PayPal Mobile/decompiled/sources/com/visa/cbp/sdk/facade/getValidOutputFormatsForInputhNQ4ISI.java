package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class getValidOutputFormatsForInputhNQ4ISI extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public getValidOutputFormatsForInputhNQ4ISI(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.JwsAttestationResult jwsAttestationResult = (com.visa.cbp.sdk.facade.JwsAttestationResult) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        if (jwsAttestationResult != jwsAttestationResult.advice) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 8);
            jsonWriter.value(jwsAttestationResult.advice);
        }
        if (jwsAttestationResult != jwsAttestationResult.apkCertificateDigestSha256) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 185);
            com.visa.cbp.sdk.facade.getHighSpeedVideoFpsRangesFor gethighspeedvideofpsrangesfor = new com.visa.cbp.sdk.facade.getHighSpeedVideoFpsRangesFor();
            java.util.List<java.lang.String> list = jwsAttestationResult.apkCertificateDigestSha256;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, gethighspeedvideofpsrangesfor, list).write(jsonWriter, list);
        }
        if (jwsAttestationResult != jwsAttestationResult.apkDigestSha256) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 85);
            jsonWriter.value(jwsAttestationResult.apkDigestSha256);
        }
        if (jwsAttestationResult != jwsAttestationResult.apkPackageName) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 356);
            jsonWriter.value(jwsAttestationResult.apkPackageName);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
        jsonWriter.value(jwsAttestationResult.basicIntegrity);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
        jsonWriter.value(jwsAttestationResult.ctsProfileMatch);
        if (jwsAttestationResult != jwsAttestationResult.error) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 436);
            jsonWriter.value(jwsAttestationResult.error);
        }
        if (jwsAttestationResult != jwsAttestationResult.evaluationType) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 55);
            jsonWriter.value(jwsAttestationResult.evaluationType);
        }
        if (jwsAttestationResult != jwsAttestationResult.extension) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
            jsonWriter.value(jwsAttestationResult.extension);
        }
        if (jwsAttestationResult != jwsAttestationResult.nonce) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 404);
            jsonWriter.value(jwsAttestationResult.nonce);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 3);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(jwsAttestationResult.timestampMs);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.sdk.facade.JwsAttestationResult jwsAttestationResult = new com.visa.cbp.sdk.facade.JwsAttestationResult();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            switch (highResolutionOutputSizeshNQ4ISI) {
                case 25:
                    if (!z) {
                        jwsAttestationResult.evaluationType = null;
                        break;
                    } else {
                        jwsAttestationResult.evaluationType = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 54:
                    if (!z) {
                        jwsAttestationResult.error = null;
                        break;
                    } else {
                        jwsAttestationResult.error = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 152:
                    if (!z) {
                        break;
                    } else {
                        jwsAttestationResult.basicIntegrity = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        jwsAttestationResult.apkPackageName = null;
                        break;
                    } else {
                        jwsAttestationResult.apkPackageName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    if (!z) {
                        break;
                    } else {
                        jwsAttestationResult.ctsProfileMatch = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        break;
                    }
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    if (!z) {
                        jwsAttestationResult.nonce = null;
                        break;
                    } else {
                        jwsAttestationResult.nonce = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 239:
                    if (!z) {
                        jwsAttestationResult.advice = null;
                        break;
                    } else {
                        jwsAttestationResult.advice = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                    if (!z) {
                        break;
                    } else {
                        jwsAttestationResult.timestampMs = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                        break;
                    }
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE:
                    if (!z) {
                        jwsAttestationResult.apkCertificateDigestSha256 = null;
                        break;
                    } else {
                        jwsAttestationResult.apkCertificateDigestSha256 = (java.util.List) gson.getAdapter(new com.visa.cbp.sdk.facade.getHighSpeedVideoFpsRangesFor()).read2(jsonReader);
                        break;
                    }
                case 328:
                    if (!z) {
                        jwsAttestationResult.extension = null;
                        break;
                    } else {
                        jwsAttestationResult.extension = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                case 357:
                    if (!z) {
                        jwsAttestationResult.apkDigestSha256 = null;
                        break;
                    } else {
                        jwsAttestationResult.apkDigestSha256 = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return jwsAttestationResult;
    }
}
