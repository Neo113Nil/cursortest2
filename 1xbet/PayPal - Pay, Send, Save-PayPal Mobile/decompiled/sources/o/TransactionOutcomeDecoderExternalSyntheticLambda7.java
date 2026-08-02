package o;

/* loaded from: classes4.dex */
public final class TransactionOutcomeDecoderExternalSyntheticLambda7 extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public TransactionOutcomeDecoderExternalSyntheticLambda7(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.payair.model.HceData hceData = (com.payair.model.HceData) obj;
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        com.payair.model.DynamicParameters dynamicParameters = hceData.dynParams;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 159);
        com.payair.model.DynamicParameters dynamicParameters2 = hceData.dynParams;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.DynamicParameters.class, dynamicParameters2).write(jsonWriter, dynamicParameters2);
        com.payair.model.StaticParameters staticParameters = hceData.staticParams;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 126);
        com.payair.model.StaticParameters staticParameters2 = hceData.staticParams;
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, com.payair.model.StaticParameters.class, staticParameters2).write(jsonWriter, staticParameters2);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.payair.model.HceData hceData = new com.payair.model.HceData();
        com.google.gson.Gson gson = this.getHighResolutionOutputSizeshNQ4ISI;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 31) {
                if (highResolutionOutputSizeshNQ4ISI != 191) {
                    jsonReader.skipValue();
                } else if (z) {
                    hceData.dynParams = (com.payair.model.DynamicParameters) gson.getAdapter(com.payair.model.DynamicParameters.class).read2(jsonReader);
                } else {
                    hceData.dynParams = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                hceData.staticParams = (com.payair.model.StaticParameters) gson.getAdapter(com.payair.model.StaticParameters.class).read2(jsonReader);
            } else {
                hceData.staticParams = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return hceData;
    }
}
