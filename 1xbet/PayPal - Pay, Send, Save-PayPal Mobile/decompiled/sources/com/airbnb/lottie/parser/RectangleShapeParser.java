package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class RectangleShapeParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "p", lib.android.paypal.com.magnessdk.g.n2, "r", "hd");

    private RectangleShapeParser() {
    }

    static com.airbnb.lottie.model.content.RectangleShape getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.lang.String str = null;
        com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue = null;
        com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                animatableValue = com.airbnb.lottie.parser.AnimatablePathValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
            } else if (selectName == 2) {
                animatablePointValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
            } else if (selectName == 3) {
                animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
            } else if (selectName == 4) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.RectangleShape(str, animatableValue, animatablePointValue, animatableFloatValue, z);
    }
}
