package retrofit2.converter.scalars;

/* loaded from: classes18.dex */
final class ScalarRequestBodyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    static final retrofit2.converter.scalars.ScalarRequestBodyConverter<java.lang.Object> getHighSpeedVideoFpsRangesFor = new retrofit2.converter.scalars.ScalarRequestBodyConverter<>();
    private static final okhttp3.MediaType getHighSpeedVideoSizes = okhttp3.MediaType.get("text/plain; charset=UTF-8");

    private ScalarRequestBodyConverter() {
    }

    @Override // retrofit2.Converter
    public final /* synthetic */ okhttp3.RequestBody convert(java.lang.Object obj) throws java.io.IOException {
        return okhttp3.RequestBody.create(getHighSpeedVideoSizes, java.lang.String.valueOf(obj));
    }
}
