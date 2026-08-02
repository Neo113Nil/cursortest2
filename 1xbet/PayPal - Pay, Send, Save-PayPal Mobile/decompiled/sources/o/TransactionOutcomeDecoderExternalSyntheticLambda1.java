package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda1 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public TransactionOutcomeDecoderExternalSyntheticLambda1(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.logic.implementation.Certificate certificate = (com.payair.logic.implementation.Certificate) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        java.lang.String str = certificate.alg;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 161);
        jsonWriter.value(certificate.alg);
        java.lang.String str2 = certificate.e;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 146);
        jsonWriter.value(certificate.e);
        java.lang.String str3 = certificate.kid;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
        jsonWriter.value(certificate.kid);
        java.lang.String str4 = certificate.kty;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE);
        jsonWriter.value(certificate.kty);
        java.lang.String str5 = certificate.n;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 306);
        jsonWriter.value(certificate.n);
        java.lang.String str6 = certificate.use;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 96);
        jsonWriter.value(certificate.use);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.logic.implementation.Certificate certificate = new com.payair.logic.implementation.Certificate();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 35) {
                if (highResolutionOutputSizeshNQ4ISI != 44) {
                    if (highResolutionOutputSizeshNQ4ISI != 103) {
                        if (highResolutionOutputSizeshNQ4ISI != 159) {
                            if (highResolutionOutputSizeshNQ4ISI != 180) {
                                if (highResolutionOutputSizeshNQ4ISI != 274) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    certificate.kid = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    certificate.kid = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                certificate.use = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                certificate.use = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            certificate.n = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            certificate.n = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        certificate.alg = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        certificate.alg = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    certificate.kty = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    certificate.kty = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                certificate.e = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                certificate.e = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return certificate;
    }
}
