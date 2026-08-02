package retrofit2;

/* loaded from: classes5.dex */
public final class OptionalConverterFactory extends retrofit2.Converter.Factory {
    public static retrofit2.OptionalConverterFactory create() {
        return new retrofit2.OptionalConverterFactory();
    }

    OptionalConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != java.util.Optional.class) {
            return null;
        }
        return new retrofit2.OptionalConverterFactory.OptionalConverter(retrofit.responseBodyConverter(getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type), annotationArr));
    }

    static final class OptionalConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, java.util.Optional<T>> {
        private final retrofit2.Converter<okhttp3.ResponseBody, T> getHighSpeedVideoSizes;

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Object convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.util.Optional.ofNullable(this.getHighSpeedVideoSizes.convert(responseBody));
        }

        OptionalConverter(retrofit2.Converter<okhttp3.ResponseBody, T> converter) {
            this.getHighSpeedVideoSizes = converter;
        }
    }
}
