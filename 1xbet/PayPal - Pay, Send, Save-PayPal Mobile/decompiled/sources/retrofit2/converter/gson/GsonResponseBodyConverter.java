package retrofit2.converter.gson;

/* loaded from: classes5.dex */
final class GsonResponseBodyConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, T> {
    private final com.google.gson.TypeAdapter<T> Camera2StreamConfigurationMap;
    private final com.google.gson.Gson getHighSpeedVideoSizes;

    GsonResponseBodyConverter(com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter) {
        this.getHighSpeedVideoSizes = gson;
        this.Camera2StreamConfigurationMap = typeAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // retrofit2.Converter
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public T convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        com.google.gson.stream.JsonReader newJsonReader = this.getHighSpeedVideoSizes.newJsonReader(responseBody.charStream());
        try {
            T read2 = this.Camera2StreamConfigurationMap.read2(newJsonReader);
            if (newJsonReader.peek() == com.google.gson.stream.JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new com.google.gson.JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
