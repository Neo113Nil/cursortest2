package o;

/* loaded from: classes5.dex */
public final class IResultReceiverStub extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public IResultReceiverStub(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.external.enp.EnrollPanRequest enrollPanRequest = (com.visa.cbp.external.enp.EnrollPanRequest) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        if (enrollPanRequest != enrollPanRequest.clientAppID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 118);
            jsonWriter.value(enrollPanRequest.clientAppID);
        }
        if (enrollPanRequest != enrollPanRequest.clientWalletAccountID) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 100);
            jsonWriter.value(enrollPanRequest.clientWalletAccountID);
        }
        if (enrollPanRequest != enrollPanRequest.consumerEntryMode) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            jsonWriter.value(enrollPanRequest.consumerEntryMode);
        }
        if (enrollPanRequest != enrollPanRequest.encPaymentInstrument) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 366);
            jsonWriter.value(enrollPanRequest.encPaymentInstrument);
        }
        if (enrollPanRequest != enrollPanRequest.encryptionMetaData) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
            jsonWriter.value(enrollPanRequest.encryptionMetaData);
        }
        if (enrollPanRequest != enrollPanRequest.locale) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 368);
            jsonWriter.value(enrollPanRequest.locale);
        }
        if (enrollPanRequest != enrollPanRequest.panSource) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 137);
            jsonWriter.value(enrollPanRequest.panSource);
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
        com.visa.cbp.external.enp.EnrollPanRequest enrollPanRequest = new com.visa.cbp.external.enp.EnrollPanRequest();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 78) {
                if (highResolutionOutputSizeshNQ4ISI != 90) {
                    if (highResolutionOutputSizeshNQ4ISI != 108) {
                        if (highResolutionOutputSizeshNQ4ISI != 235) {
                            if (highResolutionOutputSizeshNQ4ISI != 335) {
                                if (highResolutionOutputSizeshNQ4ISI != 346) {
                                    if (highResolutionOutputSizeshNQ4ISI != 425) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        enrollPanRequest.locale = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        enrollPanRequest.locale = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    enrollPanRequest.encPaymentInstrument = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    enrollPanRequest.encPaymentInstrument = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                enrollPanRequest.consumerEntryMode = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                enrollPanRequest.consumerEntryMode = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            enrollPanRequest.panSource = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            enrollPanRequest.panSource = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        enrollPanRequest.clientAppID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        enrollPanRequest.clientAppID = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    enrollPanRequest.clientWalletAccountID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    enrollPanRequest.clientWalletAccountID = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                enrollPanRequest.encryptionMetaData = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                enrollPanRequest.encryptionMetaData = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return enrollPanRequest;
    }
}
