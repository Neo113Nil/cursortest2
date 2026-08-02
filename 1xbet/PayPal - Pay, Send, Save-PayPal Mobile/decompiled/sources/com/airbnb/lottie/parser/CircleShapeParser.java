package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class CircleShapeParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "p", lib.android.paypal.com.magnessdk.g.n2, "hd", "d");

    private CircleShapeParser() {
    }

    static com.airbnb.lottie.model.content.CircleShape getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition, int i) throws java.io.IOException {
        boolean z = i == 3;
        boolean z2 = false;
        java.lang.String str = null;
        com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue = null;
        com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighSpeedVideoFpsRangesFor);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                animatableValue = com.airbnb.lottie.parser.AnimatablePathValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
            } else if (selectName == 2) {
                animatablePointValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
            } else if (selectName == 3) {
                z2 = jsonReader.nextBoolean();
            } else if (selectName == 4) {
                z = jsonReader.nextInt() == 3;
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.CircleShape(str, animatableValue, animatablePointValue, z, z2);
    }
}
