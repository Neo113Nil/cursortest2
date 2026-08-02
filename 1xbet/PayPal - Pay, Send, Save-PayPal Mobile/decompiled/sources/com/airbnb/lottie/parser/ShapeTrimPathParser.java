package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class ShapeTrimPathParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoSizes = com.airbnb.lottie.parser.moshi.JsonReader.Options.of(lib.android.paypal.com.magnessdk.g.n2, "e", "o", "nm", "m", "hd");

    private ShapeTrimPathParser() {
    }

    static com.airbnb.lottie.model.content.ShapeTrimPath getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.lang.String str = null;
        com.airbnb.lottie.model.content.ShapeTrimPath.Type type = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighSpeedVideoSizes);
            if (selectName == 0) {
                animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
            } else if (selectName == 1) {
                animatableFloatValue2 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
            } else if (selectName == 2) {
                animatableFloatValue3 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
            } else if (selectName == 3) {
                str = jsonReader.nextString();
            } else if (selectName == 4) {
                type = com.airbnb.lottie.model.content.ShapeTrimPath.Type.forId(jsonReader.nextInt());
            } else if (selectName == 5) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.ShapeTrimPath(str, type, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, z);
    }
}
