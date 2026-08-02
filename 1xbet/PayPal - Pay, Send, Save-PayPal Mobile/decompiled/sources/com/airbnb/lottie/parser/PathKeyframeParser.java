package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class PathKeyframeParser {
    private PathKeyframeParser() {
    }

    static com.airbnb.lottie.animation.keyframe.PathKeyframe getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        return new com.airbnb.lottie.animation.keyframe.PathKeyframe(lottieComposition, com.airbnb.lottie.parser.KeyframeParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition, com.airbnb.lottie.utils.Utils.dpScale(), com.airbnb.lottie.parser.PathParser.INSTANCE, jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT, false));
    }
}
