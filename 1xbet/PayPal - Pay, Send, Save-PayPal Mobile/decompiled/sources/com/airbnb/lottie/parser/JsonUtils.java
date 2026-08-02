package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class JsonUtils {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("x", "y");

    private JsonUtils() {
    }

    static int getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return android.graphics.Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static java.util.List<android.graphics.PointF> Camera2StreamConfigurationMap(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(getHighSpeedVideoSizes(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: com.airbnb.lottie.parser.JsonUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.airbnb.lottie.parser.moshi.JsonReader.Token.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static android.graphics.PointF getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        int i = com.airbnb.lottie.parser.JsonUtils.AnonymousClass1.Camera2StreamConfigurationMap[jsonReader.peek().ordinal()];
        if (i == 1) {
            float nextDouble = (float) jsonReader.nextDouble();
            float nextDouble2 = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return new android.graphics.PointF(nextDouble * f, nextDouble2 * f);
        }
        if (i == 2) {
            jsonReader.beginArray();
            float nextDouble3 = (float) jsonReader.nextDouble();
            float nextDouble4 = (float) jsonReader.nextDouble();
            while (jsonReader.peek() != com.airbnb.lottie.parser.moshi.JsonReader.Token.END_ARRAY) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return new android.graphics.PointF(nextDouble3 * f, nextDouble4 * f);
        }
        if (i != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown point starts with ");
            sb.append(jsonReader.peek());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
            if (selectName == 0) {
                f2 = getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            } else if (selectName == 1) {
                f3 = getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new android.graphics.PointF(f2 * f, f3 * f);
    }

    static float getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        com.airbnb.lottie.parser.moshi.JsonReader.Token peek = jsonReader.peek();
        int i = com.airbnb.lottie.parser.JsonUtils.AnonymousClass1.Camera2StreamConfigurationMap[peek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        }
        throw new java.lang.IllegalArgumentException("Unknown value for token of type ".concat(java.lang.String.valueOf(peek)));
    }
}
