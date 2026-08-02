package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class RoundedCornersParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "r", "hd");

    private RoundedCornersParser() {
    }

    static com.airbnb.lottie.model.content.RoundedCorners getHighSpeedVideoFpsRanges(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        boolean z = false;
        java.lang.String str = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, true);
            } else if (selectName == 2) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        if (z) {
            return null;
        }
        return new com.airbnb.lottie.model.content.RoundedCorners(str, animatableFloatValue);
    }
}
