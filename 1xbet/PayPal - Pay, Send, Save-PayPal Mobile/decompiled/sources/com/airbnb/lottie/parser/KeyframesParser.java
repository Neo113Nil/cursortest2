package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class KeyframesParser {
    static com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("k");

    private KeyframesParser() {
    }

    static <T> java.util.List<com.airbnb.lottie.value.Keyframe<T>> getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition, float f, com.airbnb.lottie.parser.ValueParser<T> valueParser, boolean z) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.STRING) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(getHighSpeedVideoFpsRangesFor) == 0) {
                if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER) {
                        arrayList.add(com.airbnb.lottie.parser.KeyframeParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition, f, valueParser, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(com.airbnb.lottie.parser.KeyframeParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition, f, valueParser, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(com.airbnb.lottie.parser.KeyframeParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition, f, valueParser, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        getHighSpeedVideoFpsRangesFor(arrayList);
        return arrayList;
    }

    public static <T> void getHighSpeedVideoFpsRangesFor(java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.airbnb.lottie.value.Keyframe<T> keyframe = list.get(i2);
            i2++;
            com.airbnb.lottie.value.Keyframe<T> keyframe2 = list.get(i2);
            keyframe.endFrame = java.lang.Float.valueOf(keyframe2.startFrame);
            if (keyframe.endValue == null && keyframe2.startValue != null) {
                keyframe.endValue = keyframe2.startValue;
                if (keyframe instanceof com.airbnb.lottie.animation.keyframe.PathKeyframe) {
                    ((com.airbnb.lottie.animation.keyframe.PathKeyframe) keyframe).createPath();
                }
            }
        }
        com.airbnb.lottie.value.Keyframe<T> keyframe3 = list.get(i);
        if ((keyframe3.startValue == null || keyframe3.endValue == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}
