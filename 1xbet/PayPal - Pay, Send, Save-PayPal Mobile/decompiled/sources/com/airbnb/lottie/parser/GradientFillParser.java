package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class GradientFillParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoSizes = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "g", "o", "t", lib.android.paypal.com.magnessdk.g.n2, "e", "r", "hd");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("p", "k");

    private GradientFillParser() {
    }

    static com.airbnb.lottie.model.content.GradientFill getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue = null;
        android.graphics.Path.FillType fillType = android.graphics.Path.FillType.WINDING;
        java.lang.String str = null;
        com.airbnb.lottie.model.content.GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.AnimatableGradientColorValue animatableGradientColorValue = null;
        com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue = null;
        com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue2 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(getHighSpeedVideoSizes)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
                        if (selectName == 0) {
                            i = jsonReader.nextInt();
                        } else if (selectName == 1) {
                            animatableGradientColorValue = com.airbnb.lottie.parser.AnimatableValueParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition, i);
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    animatableIntegerValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                    break;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? com.airbnb.lottie.model.content.GradientType.LINEAR : com.airbnb.lottie.model.content.GradientType.RADIAL;
                    break;
                case 4:
                    animatablePointValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                    break;
                case 5:
                    animatablePointValue2 = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.GradientFill(str, gradientType, fillType, animatableGradientColorValue, animatableIntegerValue == null ? new com.airbnb.lottie.model.animatable.AnimatableIntegerValue(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(100))) : animatableIntegerValue, animatablePointValue, animatablePointValue2, null, null, z);
    }
}
