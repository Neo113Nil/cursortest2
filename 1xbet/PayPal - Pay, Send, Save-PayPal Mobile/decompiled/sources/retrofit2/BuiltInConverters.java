package retrofit2;

/* loaded from: classes5.dex */
final class BuiltInConverters extends retrofit2.Converter.Factory {
    BuiltInConverters() {
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (type == okhttp3.ResponseBody.class) {
            if (retrofit2.Utils.Camera2StreamConfigurationMap(annotationArr, (java.lang.Class<? extends java.lang.annotation.Annotation>) retrofit2.http.Streaming.class)) {
                return retrofit2.BuiltInConverters.StreamingResponseBodyConverter.getHighSpeedVideoFpsRanges;
            }
            return retrofit2.BuiltInConverters.BufferingResponseBodyConverter.Camera2StreamConfigurationMap;
        }
        if (type == java.lang.Void.class) {
            return retrofit2.BuiltInConverters.VoidResponseBodyConverter.getHighSpeedVideoFpsRangesFor;
        }
        if (retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI(type)) {
            return retrofit2.BuiltInConverters.UnitResponseBodyConverter.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
        if (okhttp3.RequestBody.class.isAssignableFrom(retrofit2.Utils.Camera2StreamConfigurationMap(type))) {
            return retrofit2.BuiltInConverters.RequestBodyConverter.getHighResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }

    static final class VoidResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Void> {
        static final retrofit2.BuiltInConverters.VoidResponseBodyConverter getHighSpeedVideoFpsRangesFor = new retrofit2.BuiltInConverters.VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Void convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            responseBody.close();
            return null;
        }
    }

    static final class UnitResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, kotlin.Unit> {
        static final retrofit2.BuiltInConverters.UnitResponseBodyConverter getHighSpeedVideoFpsRangesFor = new retrofit2.BuiltInConverters.UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ kotlin.Unit convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            responseBody.close();
            return kotlin.Unit.INSTANCE;
        }
    }

    static final class RequestBodyConverter implements retrofit2.Converter<okhttp3.RequestBody, okhttp3.RequestBody> {
        static final retrofit2.BuiltInConverters.RequestBodyConverter getHighResolutionOutputSizeshNQ4ISI = new retrofit2.BuiltInConverters.RequestBodyConverter();

        RequestBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* bridge */ /* synthetic */ okhttp3.RequestBody convert(okhttp3.RequestBody requestBody) throws java.io.IOException {
            return requestBody;
        }
    }

    static final class StreamingResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, okhttp3.ResponseBody> {
        static final retrofit2.BuiltInConverters.StreamingResponseBodyConverter getHighSpeedVideoFpsRanges = new retrofit2.BuiltInConverters.StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* bridge */ /* synthetic */ okhttp3.ResponseBody convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return responseBody;
        }
    }

    static final class BufferingResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, okhttp3.ResponseBody> {
        static final retrofit2.BuiltInConverters.BufferingResponseBodyConverter Camera2StreamConfigurationMap = new retrofit2.BuiltInConverters.BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ okhttp3.ResponseBody convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return getHighSpeedVideoSizes(responseBody);
        }

        private static okhttp3.ResponseBody getHighSpeedVideoSizes(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            try {
                return retrofit2.Utils.getHighSpeedVideoFpsRangesFor(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    static final class ToStringConverter implements retrofit2.Converter<java.lang.Object, java.lang.String> {
        static final retrofit2.BuiltInConverters.ToStringConverter getHighResolutionOutputSizeshNQ4ISI = new retrofit2.BuiltInConverters.ToStringConverter();

        ToStringConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.String convert(java.lang.Object obj) throws java.io.IOException {
            return obj.toString();
        }
    }
}
