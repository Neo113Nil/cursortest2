package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class StaticParams extends com.visa.cbp.external.common.StaticParamsAbstraction {

    @com.visa.cbp.external.common.NullValueValidate
    private java.util.List<com.visa.cbp.external.common.AidInfo> aidInfo = new java.util.ArrayList();

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.DigitalTicket digitalTicket;

    public java.util.List<com.visa.cbp.external.common.AidInfo> getAidInfo() {
        return this.aidInfo;
    }

    public void setAidInfo(java.util.List<com.visa.cbp.external.common.AidInfo> list) {
        this.aidInfo = list;
    }

    public com.visa.cbp.external.common.DigitalTicket getDigitalTicket() {
        return this.digitalTicket;
    }

    public void setDigitalTicket(com.visa.cbp.external.common.DigitalTicket digitalTicket) {
        this.digitalTicket = digitalTicket;
    }

    public final /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.google.gson.Gson gson, com.google.gson.stream.JsonWriter jsonWriter, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        jsonWriter.beginObject();
        if (this != this.aidInfo) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 106);
            com.visa.cbp.external.common.ArtificialStackFrames artificialStackFrames = new com.visa.cbp.external.common.ArtificialStackFrames();
            java.util.List<com.visa.cbp.external.common.AidInfo> list = this.aidInfo;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, artificialStackFrames, list).write(jsonWriter, list);
        }
        if (this != this.digitalTicket) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.visa.cbp.getCertUsage.setAppPrgrmID);
            com.visa.cbp.external.common.DigitalTicket digitalTicket = this.digitalTicket;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.external.common.DigitalTicket.class, digitalTicket).write(jsonWriter, digitalTicket);
        }
        getHighResolutionOutputSizeshNQ4ISI(gson, jsonWriter, getinputsizeshnq4isi);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void getHighSpeedVideoSizes(com.google.gson.Gson gson, com.google.gson.stream.JsonReader jsonReader, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 179) {
                if (highResolutionOutputSizeshNQ4ISI != 228) {
                    getHighSpeedVideoSizes(gson, jsonReader, highResolutionOutputSizeshNQ4ISI);
                } else if (z) {
                    this.aidInfo = (java.util.List) gson.getAdapter(new com.visa.cbp.external.common.ArtificialStackFrames()).read2(jsonReader);
                } else {
                    this.aidInfo = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.digitalTicket = (com.visa.cbp.external.common.DigitalTicket) gson.getAdapter(com.visa.cbp.external.common.DigitalTicket.class).read2(jsonReader);
            } else {
                this.digitalTicket = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }
}
