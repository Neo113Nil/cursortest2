package o;

/* loaded from: classes4.dex */
public final class onTransact extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public onTransact(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.PubKeyCert pubKeyCert = (com.payair.model.PubKeyCert) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = pubKeyCert.certificate;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
        jsonWriter.value(pubKeyCert.certificate);
        com.payair.model.ExpirationDate expirationDate = pubKeyCert.expirationDate;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        com.payair.model.ExpirationDate expirationDate2 = pubKeyCert.expirationDate;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.ExpirationDate.class, expirationDate2).write(jsonWriter, expirationDate2);
        java.lang.String str2 = pubKeyCert.exponent;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 329);
        jsonWriter.value(pubKeyCert.exponent);
        java.lang.String str3 = pubKeyCert.remainder;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 409);
        jsonWriter.value(pubKeyCert.remainder);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.PubKeyCert pubKeyCert = new com.payair.model.PubKeyCert();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
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
                            pubKeyCert.expirationDate = (com.payair.model.ExpirationDate) gson.getAdapter(com.payair.model.ExpirationDate.class).read2(jsonReader);
                        } else {
                            pubKeyCert.expirationDate = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        pubKeyCert.remainder = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        pubKeyCert.remainder = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    pubKeyCert.certificate = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    pubKeyCert.certificate = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                pubKeyCert.exponent = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                pubKeyCert.exponent = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return pubKeyCert;
    }
}
