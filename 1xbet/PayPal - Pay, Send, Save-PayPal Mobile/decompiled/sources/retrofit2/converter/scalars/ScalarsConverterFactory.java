package retrofit2.converter.scalars;

/* loaded from: classes18.dex */
public final class ScalarsConverterFactory extends retrofit2.Converter.Factory {
    public static retrofit2.converter.scalars.ScalarsConverterFactory create() {
        return new retrofit2.converter.scalars.ScalarsConverterFactory();
    }

    private ScalarsConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
        if (type == java.lang.String.class || type == java.lang.Boolean.TYPE || type == java.lang.Boolean.class || type == java.lang.Byte.TYPE || type == java.lang.Byte.class || type == java.lang.Character.TYPE || type == java.lang.Character.class || type == java.lang.Double.TYPE || type == java.lang.Double.class || type == java.lang.Float.TYPE || type == java.lang.Float.class || type == java.lang.Integer.TYPE || type == java.lang.Integer.class || type == java.lang.Long.TYPE || type == java.lang.Long.class || type == java.lang.Short.TYPE || type == java.lang.Short.class) {
            return retrofit2.converter.scalars.ScalarRequestBodyConverter.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public final retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (type == java.lang.String.class) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (type == java.lang.Boolean.class || type == java.lang.Boolean.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (type == java.lang.Byte.class || type == java.lang.Byte.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter.getHighSpeedVideoSizes;
        }
        if (type == java.lang.Character.class || type == java.lang.Character.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter.getHighSpeedVideoFpsRangesFor;
        }
        if (type == java.lang.Double.class || type == java.lang.Double.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter.getHighSpeedVideoSizes;
        }
        if (type == java.lang.Float.class || type == java.lang.Float.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter.Camera2StreamConfigurationMap;
        }
        if (type == java.lang.Integer.class || type == java.lang.Integer.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (type == java.lang.Long.class || type == java.lang.Long.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter.getHighSpeedVideoFpsRanges;
        }
        if (type == java.lang.Short.class || type == java.lang.Short.TYPE) {
            return retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter.getHighResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }
}
