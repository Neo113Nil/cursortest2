package o;

/* loaded from: classes4.dex */
public final class asInterface extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public asInterface(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.payair.model.QrConsumerDeviceData qrConsumerDeviceData = (com.payair.model.QrConsumerDeviceData) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = qrConsumerDeviceData.aip;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        jsonWriter.value(qrConsumerDeviceData.aip);
        java.lang.String str2 = qrConsumerDeviceData.ced;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 382);
        jsonWriter.value(qrConsumerDeviceData.ced);
        java.lang.String str3 = qrConsumerDeviceData.cvn;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 322);
        jsonWriter.value(qrConsumerDeviceData.cvn);
        java.lang.String str4 = qrConsumerDeviceData.digitalWalletID;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 135);
        jsonWriter.value(qrConsumerDeviceData.digitalWalletID);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.QrConsumerDeviceData qrConsumerDeviceData = new com.payair.model.QrConsumerDeviceData();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 16) {
                if (highResolutionOutputSizeshNQ4ISI != 310) {
                    if (highResolutionOutputSizeshNQ4ISI != 326) {
                        if (highResolutionOutputSizeshNQ4ISI != 453) {
                            jsonReader.skipValue();
                        } else if (z) {
                            qrConsumerDeviceData.cvn = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            qrConsumerDeviceData.cvn = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        qrConsumerDeviceData.ced = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        qrConsumerDeviceData.ced = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    qrConsumerDeviceData.aip = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    qrConsumerDeviceData.aip = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                qrConsumerDeviceData.digitalWalletID = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                qrConsumerDeviceData.digitalWalletID = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return qrConsumerDeviceData;
    }
}
