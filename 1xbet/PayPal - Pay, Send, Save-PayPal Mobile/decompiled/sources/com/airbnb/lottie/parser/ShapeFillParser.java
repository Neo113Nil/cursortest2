package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class ShapeFillParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoSizes = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "c", "o", "fillEnabled", "r", "hd");

    private ShapeFillParser() {
    }

    static com.airbnb.lottie.model.content.ShapeFill getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue = null;
        java.lang.String str = null;
        com.airbnb.lottie.model.animatable.AnimatableColorValue animatableColorValue = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighSpeedVideoSizes);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                animatableColorValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
            } else if (selectName == 2) {
                animatableIntegerValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
            } else if (selectName == 3) {
                z = jsonReader.nextBoolean();
            } else if (selectName == 4) {
                i = jsonReader.nextInt();
            } else if (selectName == 5) {
                z2 = jsonReader.nextBoolean();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (animatableIntegerValue == null) {
            animatableIntegerValue = new com.airbnb.lottie.model.animatable.AnimatableIntegerValue(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(100)));
        }
        return new com.airbnb.lottie.model.content.ShapeFill(str, z, i == 1 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD, animatableColorValue, animatableIntegerValue, z2);
    }
}
