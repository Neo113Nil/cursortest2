package retrofit2.converter.gson;

/* loaded from: classes5.dex */
public final class GsonConverterFactory extends retrofit2.Converter.Factory {
    private final com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoSizes;

    public static retrofit2.converter.gson.GsonConverterFactory create() {
        return create(new com.google.gson.Gson());
    }

    public static retrofit2.converter.gson.GsonConverterFactory create(com.google.gson.Gson gson) {
        if (gson == null) {
            throw new java.lang.NullPointerException("gson == null");
        }
        return new retrofit2.converter.gson.GsonConverterFactory(gson, false);
    }

    private GsonConverterFactory(com.google.gson.Gson gson, boolean z) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoSizes = z;
    }

    public final retrofit2.converter.gson.GsonConverterFactory withStreaming() {
        return new retrofit2.converter.gson.GsonConverterFactory(this.getHighSpeedVideoFpsRanges, true);
    }

    @Override // retrofit2.Converter.Factory
    public final retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        return new retrofit2.converter.gson.GsonResponseBodyConverter(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges.getAdapter(com.google.gson.reflect.TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public final retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
        return new retrofit2.converter.gson.GsonRequestBodyConverter(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges.getAdapter(com.google.gson.reflect.TypeToken.get(type)), this.getHighSpeedVideoSizes);
    }
}
