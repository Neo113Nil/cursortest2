package o;

/* loaded from: classes5.dex */
public final class IResultReceiverStubProxy extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public IResultReceiverStubProxy(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.facade.data.CvmMode cvmMode = (com.visa.cbp.sdk.facade.data.CvmMode) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (cvmMode != cvmMode.verifyingEntity) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 365);
            com.visa.cbp.sdk.facade.data.VerifyingEntity verifyingEntity = cvmMode.verifyingEntity;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.data.VerifyingEntity.class, verifyingEntity).write(jsonWriter, verifyingEntity);
        }
        if (cvmMode != cvmMode.verifyingType) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 201);
            com.visa.cbp.sdk.facade.data.VerifyingType verifyingType = cvmMode.verifyingType;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.visa.cbp.sdk.facade.data.VerifyingType.class, verifyingType).write(jsonWriter, verifyingType);
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
        com.visa.cbp.sdk.facade.data.CvmMode cvmMode = new com.visa.cbp.sdk.facade.data.CvmMode();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 183) {
                if (highResolutionOutputSizeshNQ4ISI != 304) {
                    jsonReader.skipValue();
                } else if (z) {
                    cvmMode.verifyingEntity = (com.visa.cbp.sdk.facade.data.VerifyingEntity) gson.getAdapter(com.visa.cbp.sdk.facade.data.VerifyingEntity.class).read2(jsonReader);
                } else {
                    cvmMode.verifyingEntity = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                cvmMode.verifyingType = (com.visa.cbp.sdk.facade.data.VerifyingType) gson.getAdapter(com.visa.cbp.sdk.facade.data.VerifyingType.class).read2(jsonReader);
            } else {
                cvmMode.verifyingType = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return cvmMode;
    }
}
