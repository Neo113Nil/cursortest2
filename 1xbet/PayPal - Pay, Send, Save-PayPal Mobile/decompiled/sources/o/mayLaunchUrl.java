package o;

/* loaded from: classes5.dex */
public final class mayLaunchUrl extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRangesFor;

    public mayLaunchUrl(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
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
        com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = (com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRangesFor;
        jsonWriter.beginObject();
        java.lang.String str = crashApiOptions.apiKey;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
        jsonWriter.value(crashApiOptions.apiKey);
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE);
        jsonWriter.value(java.lang.Integer.valueOf(crashApiOptions.projectId));
        java.lang.String str2 = crashApiOptions.release;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 311);
        jsonWriter.value(crashApiOptions.release);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = new com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 155) {
                if (highResolutionOutputSizeshNQ4ISI != 336) {
                    if (highResolutionOutputSizeshNQ4ISI != 355) {
                        jsonReader.skipValue();
                    } else if (z) {
                        try {
                            crashApiOptions.projectId = jsonReader.nextInt();
                        } catch (java.lang.NumberFormatException e) {
                            throw new com.google.gson.JsonSyntaxException(e);
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    crashApiOptions.release = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    crashApiOptions.release = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                crashApiOptions.apiKey = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                crashApiOptions.apiKey = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return crashApiOptions;
    }
}
