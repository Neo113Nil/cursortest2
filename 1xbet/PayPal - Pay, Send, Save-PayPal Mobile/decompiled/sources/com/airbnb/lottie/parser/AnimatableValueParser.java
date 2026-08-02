package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class AnimatableValueParser {
    private AnimatableValueParser() {
    }

    public static com.airbnb.lottie.model.animatable.AnimatableFloatValue parseFloat(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return parseFloat(jsonReader, lottieComposition, true);
    }

    public static com.airbnb.lottie.model.animatable.AnimatableFloatValue parseFloat(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition, boolean z) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableFloatValue(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, z ? com.airbnb.lottie.utils.Utils.dpScale() : 1.0f, com.airbnb.lottie.parser.FloatParser.INSTANCE, false));
    }

    static com.airbnb.lottie.model.animatable.AnimatableIntegerValue getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableIntegerValue(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, 1.0f, com.airbnb.lottie.parser.IntegerParser.INSTANCE, false));
    }

    static com.airbnb.lottie.model.animatable.AnimatablePointValue getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatablePointValue(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, com.airbnb.lottie.utils.Utils.dpScale(), com.airbnb.lottie.parser.PointFParser.INSTANCE, true));
    }

    static com.airbnb.lottie.model.animatable.AnimatableScaleValue Camera2StreamConfigurationMap(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableScaleValue((java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.value.ScaleXY>>) com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, 1.0f, com.airbnb.lottie.parser.ScaleXYParser.INSTANCE, false));
    }

    static com.airbnb.lottie.model.animatable.AnimatableShapeValue getOutputMinFrameDuration(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableShapeValue(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, com.airbnb.lottie.utils.Utils.dpScale(), com.airbnb.lottie.parser.ShapeDataParser.INSTANCE, false));
    }

    static com.airbnb.lottie.model.animatable.AnimatableTextFrame getHighSpeedVideoFpsRanges(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableTextFrame(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, com.airbnb.lottie.utils.Utils.dpScale(), com.airbnb.lottie.parser.DocumentDataParser.INSTANCE, false));
    }

    static com.airbnb.lottie.model.animatable.AnimatableColorValue getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableColorValue(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, 1.0f, com.airbnb.lottie.parser.ColorParser.INSTANCE, false));
    }

    static com.airbnb.lottie.model.animatable.AnimatableGradientColorValue Camera2StreamConfigurationMap(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition, int i) throws java.io.IOException {
        return new com.airbnb.lottie.model.animatable.AnimatableGradientColorValue(com.airbnb.lottie.parser.KeyframesParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, 1.0f, new com.airbnb.lottie.parser.GradientColorParser(i), false));
    }
}
