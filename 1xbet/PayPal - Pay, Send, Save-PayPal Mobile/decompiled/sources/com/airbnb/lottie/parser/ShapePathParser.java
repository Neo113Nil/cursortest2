package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class ShapePathParser {
    static com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "ind", "ks", "hd");

    private ShapePathParser() {
    }

    static com.airbnb.lottie.model.content.ShapePath Camera2StreamConfigurationMap(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.lang.String str = null;
        int i = 0;
        boolean z = false;
        com.airbnb.lottie.model.animatable.AnimatableShapeValue animatableShapeValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                i = jsonReader.nextInt();
            } else if (selectName == 2) {
                animatableShapeValue = com.airbnb.lottie.parser.AnimatableValueParser.getOutputMinFrameDuration(jsonReader, lottieComposition);
            } else if (selectName == 3) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.ShapePath(str, i, animatableShapeValue, z);
    }
}
