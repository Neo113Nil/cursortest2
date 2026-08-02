package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoSizesFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;

    public getHighSpeedVideoSizesFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.setPaymentInstrument setpaymentinstrument = (com.visa.cbp.setPaymentInstrument) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        if (setpaymentinstrument != setpaymentinstrument.getHighSpeedVideoSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 430);
            jsonWriter.value(setpaymentinstrument.getHighSpeedVideoSizes);
        }
        if (setpaymentinstrument != setpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 345);
            jsonWriter.value(setpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (setpaymentinstrument != setpaymentinstrument.getHighSpeedVideoFpsRangesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 371);
            jsonWriter.value(setpaymentinstrument.getHighSpeedVideoFpsRangesFor);
        }
        if (setpaymentinstrument != setpaymentinstrument.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 453);
            jsonWriter.value(setpaymentinstrument.Camera2StreamConfigurationMap);
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
        com.visa.cbp.setPaymentInstrument setpaymentinstrument = new com.visa.cbp.setPaymentInstrument();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 113) {
                if (highResolutionOutputSizeshNQ4ISI != 247) {
                    if (highResolutionOutputSizeshNQ4ISI != 287) {
                        if (highResolutionOutputSizeshNQ4ISI != 416) {
                            jsonReader.skipValue();
                        } else if (z) {
                            setpaymentinstrument.getHighSpeedVideoSizes = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            setpaymentinstrument.getHighSpeedVideoSizes = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        setpaymentinstrument.Camera2StreamConfigurationMap = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        setpaymentinstrument.Camera2StreamConfigurationMap = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    setpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    setpaymentinstrument.getHighResolutionOutputSizeshNQ4ISI = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                setpaymentinstrument.getHighSpeedVideoFpsRangesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                setpaymentinstrument.getHighSpeedVideoFpsRangesFor = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return setpaymentinstrument;
    }
}
