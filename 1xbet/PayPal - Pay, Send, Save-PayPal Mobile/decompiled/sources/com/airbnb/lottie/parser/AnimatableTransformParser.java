package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class AnimatableTransformParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRanges = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("a", "p", lib.android.paypal.com.magnessdk.g.n2, "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("k");

    private AnimatableTransformParser() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.airbnb.lottie.model.animatable.AnimatableTransform parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        boolean z = jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.airbnb.lottie.model.animatable.AnimatablePathValue animatablePathValue = null;
        com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        com.airbnb.lottie.model.animatable.AnimatableScaleValue animatableScaleValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue4 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue5 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue6 = null;
        com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue7 = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue8 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(getHighSpeedVideoFpsRanges)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI) == 0) {
                            animatablePathValue = com.airbnb.lottie.parser.AnimatablePathValueParser.parse(jsonReader, lottieComposition);
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 1:
                    animatableValue = com.airbnb.lottie.parser.AnimatablePathValueParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                    break;
                case 2:
                    animatableScaleValue = com.airbnb.lottie.parser.AnimatableValueParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition);
                    break;
                case 3:
                    animatableFloatValue6 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    Camera2StreamConfigurationMap(animatableFloatValue6, lottieComposition);
                    break;
                case 4:
                    animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    Camera2StreamConfigurationMap(animatableFloatValue, lottieComposition);
                    break;
                case 5:
                    animatableIntegerValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue7 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 7:
                    animatableFloatValue8 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 8:
                    animatableFloatValue2 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 9:
                    animatableFloatValue3 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 10:
                    animatableFloatValue4 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    Camera2StreamConfigurationMap(animatableFloatValue4, lottieComposition);
                    break;
                case 11:
                    animatableFloatValue5 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    Camera2StreamConfigurationMap(animatableFloatValue5, lottieComposition);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        return new com.airbnb.lottie.model.animatable.AnimatableTransform((animatablePathValue == null || (animatablePathValue.isStatic() && animatablePathValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f))) ? null : animatablePathValue, (animatableValue == null || (!(animatableValue instanceof com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue) && animatableValue.isStatic() && animatableValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f))) ? null : animatableValue, (animatableScaleValue == null || (animatableScaleValue.isStatic() && ((com.airbnb.lottie.value.ScaleXY) ((com.airbnb.lottie.value.Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f))) ? null : animatableScaleValue, getHighResolutionOutputSizeshNQ4ISI(animatableFloatValue) ? null : animatableFloatValue, animatableIntegerValue, animatableFloatValue7, animatableFloatValue8, (animatableFloatValue2 == null || (animatableFloatValue2.isStatic() && ((java.lang.Float) ((com.airbnb.lottie.value.Keyframe) animatableFloatValue2.getKeyframes().get(0)).startValue).floatValue() == 0.0f)) ? null : animatableFloatValue2, (animatableFloatValue3 == null || (animatableFloatValue3.isStatic() && ((java.lang.Float) ((com.airbnb.lottie.value.Keyframe) animatableFloatValue3.getKeyframes().get(0)).startValue).floatValue() == 0.0f)) ? null : animatableFloatValue3, getHighResolutionOutputSizeshNQ4ISI(animatableFloatValue4) ? null : animatableFloatValue4, getHighResolutionOutputSizeshNQ4ISI(animatableFloatValue5) ? null : animatableFloatValue5, getHighResolutionOutputSizeshNQ4ISI(animatableFloatValue6) ? null : animatableFloatValue6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((java.lang.Float) ((com.airbnb.lottie.value.Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f;
        }
        return true;
    }

    private static void Camera2StreamConfigurationMap(com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.LottieComposition lottieComposition) {
        boolean isEmpty = animatableFloatValue.getKeyframes().isEmpty();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (isEmpty) {
            animatableFloatValue.getKeyframes().add(new com.airbnb.lottie.value.Keyframe(lottieComposition, valueOf, valueOf, null, 0.0f, java.lang.Float.valueOf(lottieComposition.getEndFrame())));
        } else if (((com.airbnb.lottie.value.Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue == 0) {
            animatableFloatValue.getKeyframes().set(0, new com.airbnb.lottie.value.Keyframe(lottieComposition, valueOf, valueOf, null, 0.0f, java.lang.Float.valueOf(lottieComposition.getEndFrame())));
        }
    }
}
