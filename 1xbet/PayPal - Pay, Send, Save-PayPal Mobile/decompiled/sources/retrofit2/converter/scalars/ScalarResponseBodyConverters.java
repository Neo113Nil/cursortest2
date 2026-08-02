package retrofit2.converter.scalars;

/* loaded from: classes18.dex */
final class ScalarResponseBodyConverters {
    private ScalarResponseBodyConverters() {
    }

    static final class StringResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.String> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter getHighResolutionOutputSizeshNQ4ISI = new retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter();

        StringResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.String convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return responseBody.string();
        }
    }

    static final class BooleanResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Boolean> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter getHighResolutionOutputSizeshNQ4ISI = new retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter();

        BooleanResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Boolean convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Boolean.valueOf(responseBody.string());
        }
    }

    static final class ByteResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Byte> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter getHighSpeedVideoSizes = new retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter();

        ByteResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Byte convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Byte.valueOf(responseBody.string());
        }
    }

    static final class CharacterResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Character> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter getHighSpeedVideoFpsRangesFor = new retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter();

        CharacterResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Character convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            java.lang.String string = responseBody.string();
            if (string.length() != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected body of length 1 for Character conversion but was ");
                sb.append(string.length());
                throw new java.io.IOException(sb.toString());
            }
            return java.lang.Character.valueOf(string.charAt(0));
        }
    }

    static final class DoubleResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Double> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter getHighSpeedVideoSizes = new retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter();

        DoubleResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Double convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Double.valueOf(responseBody.string());
        }
    }

    static final class FloatResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Float> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter Camera2StreamConfigurationMap = new retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter();

        FloatResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Float convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Float.valueOf(responseBody.string());
        }
    }

    static final class IntegerResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Integer> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter getHighResolutionOutputSizeshNQ4ISI = new retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter();

        IntegerResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Integer convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Integer.valueOf(responseBody.string());
        }
    }

    static final class LongResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Long> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter getHighSpeedVideoFpsRanges = new retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter();

        LongResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Long convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Long.valueOf(responseBody.string());
        }
    }

    static final class ShortResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Short> {
        static final retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter getHighResolutionOutputSizeshNQ4ISI = new retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter();

        ShortResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public final /* synthetic */ java.lang.Short convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.lang.Short.valueOf(responseBody.string());
        }
    }
}
