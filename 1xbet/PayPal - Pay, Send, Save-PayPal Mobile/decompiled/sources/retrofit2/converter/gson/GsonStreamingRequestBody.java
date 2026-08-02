package retrofit2.converter.gson;

/* loaded from: classes5.dex */
final class GsonStreamingRequestBody<T> extends okhttp3.RequestBody {
    private final com.google.gson.TypeAdapter<T> getHighSpeedVideoFpsRanges;
    private final T getHighSpeedVideoFpsRangesFor;
    private final com.google.gson.Gson getHighSpeedVideoSizes;

    public GsonStreamingRequestBody(com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter, T t) {
        this.getHighSpeedVideoSizes = gson;
        this.getHighSpeedVideoFpsRanges = typeAdapter;
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final okhttp3.MediaType getContentType() {
        return retrofit2.converter.gson.GsonRequestBodyConverter.Camera2StreamConfigurationMap;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink bufferedSink) throws java.io.IOException {
        retrofit2.converter.gson.GsonRequestBodyConverter.getHighSpeedVideoFpsRanges(bufferedSink, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }
}
