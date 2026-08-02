package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class FontParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("fFamily", "fName", "fStyle", "ascent");

    private FontParser() {
    }

    static com.airbnb.lottie.model.Font getHighSpeedVideoFpsRanges(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginObject();
        java.lang.String str = null;
        java.lang.String str2 = null;
        float f = 0.0f;
        java.lang.String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighSpeedVideoFpsRangesFor);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                str3 = jsonReader.nextString();
            } else if (selectName == 2) {
                str2 = jsonReader.nextString();
            } else if (selectName == 3) {
                f = (float) jsonReader.nextDouble();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.Font(str, str3, str2, f);
    }
}
