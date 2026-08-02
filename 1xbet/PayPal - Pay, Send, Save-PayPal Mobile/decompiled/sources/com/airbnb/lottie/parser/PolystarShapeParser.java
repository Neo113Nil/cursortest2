package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class PolystarShapeParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    private PolystarShapeParser() {
    }

    static com.airbnb.lottie.model.content.PolystarShape getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition, int i) throws java.io.IOException {
        boolean z = false;
        boolean z2 = i == 3;
        java.lang.String str = null;
        com.airbnb.lottie.model.content.PolystarShape.Type type = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue4 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue5 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(Camera2StreamConfigurationMap)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    type = com.airbnb.lottie.model.content.PolystarShape.Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 3:
                    animatableValue = com.airbnb.lottie.parser.AnimatablePathValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                    break;
                case 4:
                    animatableFloatValue2 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 5:
                    animatableFloatValue4 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue6 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 7:
                    animatableFloatValue3 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 8:
                    animatableFloatValue5 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 9:
                    z = jsonReader.nextBoolean();
                    break;
                case 10:
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.PolystarShape(str, type, animatableFloatValue, animatableValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4, animatableFloatValue5, animatableFloatValue6, z, z2);
    }
}
