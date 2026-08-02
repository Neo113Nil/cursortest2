package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class RepeaterParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "c", "o", "tr", "hd");

    private RepeaterParser() {
    }

    static com.airbnb.lottie.model.content.Repeater getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.lang.String str = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2 = null;
        com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
            } else if (selectName == 2) {
                animatableFloatValue2 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
            } else if (selectName == 3) {
                animatableTransform = com.airbnb.lottie.parser.AnimatableTransformParser.parse(jsonReader, lottieComposition);
            } else if (selectName == 4) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.Repeater(str, animatableFloatValue, animatableFloatValue2, animatableTransform, z);
    }
}
