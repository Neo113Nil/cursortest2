package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class AnimatableTextPropertiesParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of(lib.android.paypal.com.magnessdk.g.n2, "a");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of(lib.android.paypal.com.magnessdk.g.n2, "e", "o", "r");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoSizes = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("fc", "sc", "sw", "t", "o");

    private AnimatableTextPropertiesParser() {
    }

    public static com.airbnb.lottie.model.animatable.AnimatableTextProperties parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        jsonReader.beginObject();
        com.airbnb.lottie.model.animatable.AnimatableTextStyle animatableTextStyle = null;
        com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector animatableTextRangeSelector = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighSpeedVideoFpsRangesFor);
            if (selectName == 0) {
                jsonReader.beginObject();
                com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue = null;
                com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue2 = null;
                com.airbnb.lottie.model.content.TextRangeUnits textRangeUnits = null;
                com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue3 = null;
                while (jsonReader.hasNext()) {
                    int selectName2 = jsonReader.selectName(Camera2StreamConfigurationMap);
                    if (selectName2 == 0) {
                        animatableIntegerValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                    } else if (selectName2 == 1) {
                        animatableIntegerValue2 = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                    } else if (selectName2 == 2) {
                        animatableIntegerValue3 = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                    } else if (selectName2 == 3) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt != 1 && nextInt != 2) {
                            lottieComposition.addWarning("Unsupported text range units: ".concat(java.lang.String.valueOf(nextInt)));
                            textRangeUnits = com.airbnb.lottie.model.content.TextRangeUnits.INDEX;
                        } else {
                            textRangeUnits = nextInt == 1 ? com.airbnb.lottie.model.content.TextRangeUnits.PERCENT : com.airbnb.lottie.model.content.TextRangeUnits.INDEX;
                        }
                    } else {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (animatableIntegerValue == null && animatableIntegerValue2 != null) {
                    animatableIntegerValue = new com.airbnb.lottie.model.animatable.AnimatableIntegerValue(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(0)));
                }
                animatableTextRangeSelector = new com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector(animatableIntegerValue, animatableIntegerValue2, animatableIntegerValue3, textRangeUnits);
            } else if (selectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                com.airbnb.lottie.model.animatable.AnimatableColorValue animatableColorValue = null;
                com.airbnb.lottie.model.animatable.AnimatableColorValue animatableColorValue2 = null;
                com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
                com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2 = null;
                com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue4 = null;
                while (jsonReader.hasNext()) {
                    int selectName3 = jsonReader.selectName(getHighSpeedVideoSizes);
                    if (selectName3 == 0) {
                        animatableColorValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
                    } else if (selectName3 == 1) {
                        animatableColorValue2 = com.airbnb.lottie.parser.AnimatableValueParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
                    } else if (selectName3 == 2) {
                        animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    } else if (selectName3 == 3) {
                        animatableFloatValue2 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    } else if (selectName3 == 4) {
                        animatableIntegerValue4 = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                    } else {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                animatableTextStyle = new com.airbnb.lottie.model.animatable.AnimatableTextStyle(animatableColorValue, animatableColorValue2, animatableFloatValue, animatableFloatValue2, animatableIntegerValue4);
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.animatable.AnimatableTextProperties(animatableTextStyle, animatableTextRangeSelector);
    }
}
