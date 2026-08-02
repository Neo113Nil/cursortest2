package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class MaskParser {
    private MaskParser() {
    }

    static com.airbnb.lottie.model.content.Mask Camera2StreamConfigurationMap(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        char c;
        jsonReader.beginObject();
        com.airbnb.lottie.model.content.Mask.MaskMode maskMode = null;
        com.airbnb.lottie.model.animatable.AnimatableShapeValue animatableShapeValue = null;
        com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            nextName.hashCode();
            int hashCode = nextName.hashCode();
            char c2 = 65535;
            if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 3588) {
                if (nextName.equals("pt")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 104433) {
                if (hashCode == 3357091 && nextName.equals("mode")) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (nextName.equals(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_INTERACTION_TO_NEXT_VIEW)) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                animatableIntegerValue = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
            } else if (c == 1) {
                animatableShapeValue = com.airbnb.lottie.parser.AnimatableValueParser.getOutputMinFrameDuration(jsonReader, lottieComposition);
            } else if (c == 2) {
                z = jsonReader.nextBoolean();
            } else if (c == 3) {
                java.lang.String nextString = jsonReader.nextString();
                nextString.hashCode();
                int hashCode2 = nextString.hashCode();
                if (hashCode2 != 97) {
                    if (hashCode2 != 105) {
                        if (hashCode2 != 110) {
                            if (hashCode2 == 115 && nextString.equals(lib.android.paypal.com.magnessdk.g.n2)) {
                                c2 = 3;
                            }
                        } else if (nextString.equals("n")) {
                            c2 = 2;
                        }
                    } else if (nextString.equals("i")) {
                        c2 = 1;
                    }
                } else if (nextString.equals("a")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    maskMode = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD;
                } else if (c2 == 1) {
                    lottieComposition.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                    maskMode = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT;
                } else if (c2 == 2) {
                    maskMode = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE;
                } else if (c2 == 3) {
                    maskMode = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown mask mode ");
                    sb.append(nextName);
                    sb.append(". Defaulting to Add.");
                    com.airbnb.lottie.utils.Logger.warning(sb.toString());
                    maskMode = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.content.Mask(maskMode, animatableShapeValue, animatableIntegerValue, z);
    }
}
