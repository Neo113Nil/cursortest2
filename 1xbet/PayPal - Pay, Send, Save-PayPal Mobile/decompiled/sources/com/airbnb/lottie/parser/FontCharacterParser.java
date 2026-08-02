package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class FontCharacterParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("ch", io.ktor.http.ContentDisposition.Parameters.Size, "w", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "fFamily", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("shapes");

    private FontCharacterParser() {
    }

    static com.airbnb.lottie.model.FontCharacter getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginObject();
        java.lang.String str = null;
        java.lang.String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
            if (selectName == 0) {
                c = jsonReader.nextString().charAt(0);
            } else if (selectName == 1) {
                d = jsonReader.nextDouble();
            } else if (selectName == 2) {
                d2 = jsonReader.nextDouble();
            } else if (selectName == 3) {
                str = jsonReader.nextString();
            } else if (selectName == 4) {
                str2 = jsonReader.nextString();
            } else if (selectName == 5) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI) == 0) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add((com.airbnb.lottie.model.content.ShapeGroup) com.airbnb.lottie.parser.ContentModelParser.getHighSpeedVideoSizes(jsonReader, lottieComposition));
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.FontCharacter(arrayList, c, d, d2, str, str2);
    }
}
