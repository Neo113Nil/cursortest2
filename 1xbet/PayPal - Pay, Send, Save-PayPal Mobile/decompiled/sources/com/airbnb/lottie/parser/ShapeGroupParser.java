package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class ShapeGroupParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "hd", "it");

    private ShapeGroupParser() {
    }

    static com.airbnb.lottie.model.content.ShapeGroup getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                z = jsonReader.nextBoolean();
            } else if (selectName == 2) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.airbnb.lottie.model.content.ContentModel highSpeedVideoSizes = com.airbnb.lottie.parser.ContentModelParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                    if (highSpeedVideoSizes != null) {
                        arrayList.add(highSpeedVideoSizes);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.ShapeGroup(str, arrayList, z);
    }
}
