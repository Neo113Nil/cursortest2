package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoFpsRanges extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;

    public getHighSpeedVideoFpsRanges(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.getPaymentInstrument getpaymentinstrument = (com.visa.cbp.getPaymentInstrument) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (getpaymentinstrument != getpaymentinstrument.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 345);
            com.visa.cbp.getEncryptionScheme getencryptionscheme = getpaymentinstrument.Camera2StreamConfigurationMap;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.getEncryptionScheme.class, getencryptionscheme).write(jsonWriter, getencryptionscheme);
        }
        if (getpaymentinstrument != getpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 371);
            com.visa.cbp.getVPanEnrollmentID getvpanenrollmentid = getpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.getVPanEnrollmentID.class, getvpanenrollmentid).write(jsonWriter, getvpanenrollmentid);
        }
        if (getpaymentinstrument != getpaymentinstrument.getHighSpeedVideoSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 453);
            com.visa.cbp.setPaymentInstrument setpaymentinstrument = getpaymentinstrument.getHighSpeedVideoSizes;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.setPaymentInstrument.class, setpaymentinstrument).write(jsonWriter, setpaymentinstrument);
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
        com.visa.cbp.getPaymentInstrument getpaymentinstrument = new com.visa.cbp.getPaymentInstrument();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 113) {
                if (highResolutionOutputSizeshNQ4ISI != 247) {
                    if (highResolutionOutputSizeshNQ4ISI != 287) {
                        jsonReader.skipValue();
                    } else if (z) {
                        getpaymentinstrument.getHighSpeedVideoSizes = (com.visa.cbp.setPaymentInstrument) gson.getAdapter(com.visa.cbp.setPaymentInstrument.class).read2(jsonReader);
                    } else {
                        getpaymentinstrument.getHighSpeedVideoSizes = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    getpaymentinstrument.Camera2StreamConfigurationMap = (com.visa.cbp.getEncryptionScheme) gson.getAdapter(com.visa.cbp.getEncryptionScheme.class).read2(jsonReader);
                } else {
                    getpaymentinstrument.Camera2StreamConfigurationMap = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                getpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI = (com.visa.cbp.getVPanEnrollmentID) gson.getAdapter(com.visa.cbp.getVPanEnrollmentID.class).read2(jsonReader);
            } else {
                getpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return getpaymentinstrument;
    }
}
