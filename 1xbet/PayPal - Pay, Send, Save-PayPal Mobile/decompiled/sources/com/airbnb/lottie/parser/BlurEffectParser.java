package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class BlurEffectParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("ef");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("ty", "v");

    BlurEffectParser() {
    }

    static com.airbnb.lottie.model.content.BlurEffect getHighSpeedVideoFpsRanges(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        com.airbnb.lottie.model.content.BlurEffect blurEffect = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(Camera2StreamConfigurationMap) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    com.airbnb.lottie.model.content.BlurEffect blurEffect2 = null;
                    while (true) {
                        boolean z = false;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
                            if (selectName != 0) {
                                if (selectName != 1) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else if (z) {
                                    blurEffect2 = new com.airbnb.lottie.model.content.BlurEffect(com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition));
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (jsonReader.nextInt() == 0) {
                                z = true;
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (blurEffect2 != null) {
                        blurEffect = blurEffect2;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return blurEffect;
    }
}
