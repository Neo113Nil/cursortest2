package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class ShapeStrokeParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("n", "v");

    private ShapeStrokeParser() {
    }

    static com.airbnb.lottie.model.content.ShapeStroke getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        char c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float f = 0.0f;
        java.lang.String str = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        com.airbnb.lottie.model.animatable.AnimatableColorValue animatableColorValue = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2 = null;
        com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue = null;
        boolean z = false;
        com.airbnb.lottie.model.content.ShapeStroke.LineCapType lineCapType = null;
        com.airbnb.lottie.model.content.ShapeStroke.LineJoinType lineJoinType = null;
        while (true) {
            int i = 100;
            if (jsonReader.hasNext()) {
                int i2 = 1;
                switch (jsonReader.selectName(getHighSpeedVideoFpsRangesFor)) {
                    case 0:
                        str = jsonReader.nextString();
                        break;
                    case 1:
                        animatableColorValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
                        break;
                    case 2:
                        animatableFloatValue2 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                        break;
                    case 3:
                        animatableIntegerValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                        break;
                    case 4:
                        lineCapType = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                        break;
                    case 5:
                        lineJoinType = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                        break;
                    case 6:
                        f = (float) jsonReader.nextDouble();
                        break;
                    case 7:
                        z = jsonReader.nextBoolean();
                        break;
                    case 8:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3 = null;
                            java.lang.String str2 = null;
                            while (jsonReader.hasNext()) {
                                int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
                                if (selectName == 0) {
                                    str2 = jsonReader.nextString();
                                } else if (selectName == i2) {
                                    animatableFloatValue3 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                } else {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            if (hashCode == i) {
                                if (str2.equals("d")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else if (hashCode != 103) {
                                if (hashCode == 111 && str2.equals("o")) {
                                    c = 2;
                                }
                                c = 65535;
                            } else {
                                if (str2.equals("g")) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c == 0 || c == 1) {
                                lottieComposition.setHasDashPattern(true);
                                arrayList.add(animatableFloatValue3);
                            } else if (c == 2) {
                                animatableFloatValue = animatableFloatValue3;
                            }
                            i2 = 1;
                            i = 100;
                        }
                        int i3 = i2;
                        jsonReader.endArray();
                        if (arrayList.size() != i3) {
                            break;
                        } else {
                            arrayList.add((com.airbnb.lottie.model.animatable.AnimatableFloatValue) arrayList.get(0));
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                if (animatableIntegerValue == null) {
                    animatableIntegerValue = new com.airbnb.lottie.model.animatable.AnimatableIntegerValue(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(100)));
                }
                if (lineCapType == null) {
                    lineCapType = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT;
                }
                if (lineJoinType == null) {
                    lineJoinType = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER;
                }
                return new com.airbnb.lottie.model.content.ShapeStroke(str, animatableFloatValue, arrayList, animatableColorValue, animatableIntegerValue, animatableFloatValue2, lineCapType, lineJoinType, f, z);
            }
        }
    }
}
