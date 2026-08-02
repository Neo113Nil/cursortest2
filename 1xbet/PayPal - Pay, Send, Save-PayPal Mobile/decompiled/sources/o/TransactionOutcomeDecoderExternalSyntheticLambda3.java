package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda3 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;

    public TransactionOutcomeDecoderExternalSyntheticLambda3(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.CardData cardData = (com.payair.model.CardData) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.Camera2StreamConfigurationMap;
        jsonWriter.beginObject();
        java.lang.String str = cardData.chName;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 378);
        jsonWriter.value(cardData.chName);
        java.lang.String str2 = cardData.cvv;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 193);
        jsonWriter.value(cardData.cvv);
        java.lang.String str3 = cardData.expMonth;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 67);
        jsonWriter.value(cardData.expMonth);
        java.lang.String str4 = cardData.expYear;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
        jsonWriter.value(cardData.expYear);
        java.lang.String str5 = cardData.pan;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 263);
        jsonWriter.value(cardData.pan);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.CardData cardData = new com.payair.model.CardData();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 89) {
                if (highResolutionOutputSizeshNQ4ISI != 137) {
                    if (highResolutionOutputSizeshNQ4ISI != 261) {
                        if (highResolutionOutputSizeshNQ4ISI != 323) {
                            if (highResolutionOutputSizeshNQ4ISI != 448) {
                                jsonReader.skipValue();
                            } else if (z) {
                                cardData.pan = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                cardData.pan = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            cardData.expMonth = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            cardData.expMonth = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        cardData.expYear = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        cardData.expYear = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    cardData.chName = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    cardData.chName = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                cardData.cvv = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                cardData.cvv = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return cardData;
    }
}
