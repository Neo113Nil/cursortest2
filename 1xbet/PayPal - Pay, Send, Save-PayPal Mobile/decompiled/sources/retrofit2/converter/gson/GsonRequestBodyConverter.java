package retrofit2.converter.gson;

/* loaded from: classes5.dex */
final class GsonRequestBodyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    static final okhttp3.MediaType Camera2StreamConfigurationMap = okhttp3.MediaType.get(com.statsig.androidsdk.HttpUtils.CONTENT_TYPE_HEADER_VALUE);
    private final com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final com.google.gson.TypeAdapter<T> getHighSpeedVideoSizes;

    GsonRequestBodyConverter(com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoSizes = typeAdapter;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    static <T> void getHighSpeedVideoFpsRanges(okio.BufferedSink bufferedSink, com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter, T t) throws java.io.IOException {
        com.google.gson.stream.JsonWriter newJsonWriter = gson.newJsonWriter(new java.io.OutputStreamWriter(bufferedSink.outputStream(), java.nio.charset.StandardCharsets.UTF_8));
        typeAdapter.write(newJsonWriter, t);
        newJsonWriter.close();
    }

    @Override // retrofit2.Converter
    public final /* synthetic */ okhttp3.RequestBody convert(java.lang.Object obj) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return new retrofit2.converter.gson.GsonStreamingRequestBody(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, obj);
        }
        okio.Buffer buffer = new okio.Buffer();
        getHighSpeedVideoFpsRanges(buffer, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, obj);
        return okhttp3.RequestBody.create(Camera2StreamConfigurationMap, buffer.readByteString());
    }
}
