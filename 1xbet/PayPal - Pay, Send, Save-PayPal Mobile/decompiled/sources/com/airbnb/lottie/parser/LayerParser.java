package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class LayerParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.SR_TRACK_NAME, "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("d", "a");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoSizes = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("ty", "nm");

    private LayerParser() {
    }

    public static com.airbnb.lottie.model.layer.Layer parse(com.airbnb.lottie.LottieComposition lottieComposition) {
        android.graphics.Rect bounds = lottieComposition.getBounds();
        return new com.airbnb.lottie.model.layer.Layer(java.util.Collections.emptyList(), lottieComposition, "__container", -1L, com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP, -1L, null, java.util.Collections.emptyList(), new com.airbnb.lottie.model.animatable.AnimatableTransform(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, java.util.Collections.emptyList(), com.airbnb.lottie.model.layer.Layer.MatteType.NONE, null, false, null, null, com.airbnb.lottie.model.content.LBlendMode.NORMAL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.layer.Layer parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        java.util.ArrayList arrayList;
        boolean z;
        java.lang.String str;
        com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform;
        boolean z2;
        com.airbnb.lottie.model.layer.Layer.LayerType layerType;
        java.util.ArrayList arrayList2;
        boolean z3;
        boolean z4;
        int i;
        com.airbnb.lottie.model.layer.Layer.MatteType matteType = com.airbnb.lottie.model.layer.Layer.MatteType.NONE;
        com.airbnb.lottie.model.content.LBlendMode lBlendMode = com.airbnb.lottie.model.content.LBlendMode.NORMAL;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        jsonReader.beginObject();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(1.0f);
        boolean z5 = false;
        com.airbnb.lottie.model.layer.Layer.MatteType matteType2 = matteType;
        com.airbnb.lottie.model.content.LBlendMode lBlendMode2 = lBlendMode;
        float f = 1.0f;
        boolean z6 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z7 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        long j = -1;
        com.airbnb.lottie.model.layer.Layer.LayerType layerType2 = null;
        java.lang.String str2 = null;
        com.airbnb.lottie.model.animatable.AnimatableTextFrame animatableTextFrame = null;
        com.airbnb.lottie.model.animatable.AnimatableTextProperties animatableTextProperties = null;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = null;
        com.airbnb.lottie.model.content.BlurEffect blurEffect = null;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = null;
        com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform2 = null;
        float f6 = 0.0f;
        long j2 = 0;
        java.lang.String str3 = "UNSET";
        java.lang.String str4 = null;
        while (jsonReader.hasNext()) {
            int i5 = 1;
            switch (jsonReader.selectName(Camera2StreamConfigurationMap)) {
                case 0:
                    z2 = z6;
                    str3 = jsonReader.nextString();
                    z6 = z2;
                    z5 = false;
                    break;
                case 1:
                    z2 = z6;
                    j2 = jsonReader.nextInt();
                    z6 = z2;
                    z5 = false;
                    break;
                case 2:
                    z2 = z6;
                    str2 = jsonReader.nextString();
                    z6 = z2;
                    z5 = false;
                    break;
                case 3:
                    z2 = z6;
                    int nextInt = jsonReader.nextInt();
                    if (nextInt < com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN.ordinal()) {
                        layerType = com.airbnb.lottie.model.layer.Layer.LayerType.values()[nextInt];
                    } else {
                        layerType = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN;
                    }
                    layerType2 = layerType;
                    z6 = z2;
                    z5 = false;
                    break;
                case 4:
                    z2 = z6;
                    j = jsonReader.nextInt();
                    z6 = z2;
                    z5 = false;
                    break;
                case 5:
                    z2 = z6;
                    i2 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.Utils.dpScale());
                    z6 = z2;
                    z5 = false;
                    break;
                case 6:
                    z2 = z6;
                    i3 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.Utils.dpScale());
                    z6 = z2;
                    z5 = false;
                    break;
                case 7:
                    z2 = z6;
                    i4 = android.graphics.Color.parseColor(jsonReader.nextString());
                    z6 = z2;
                    z5 = false;
                    break;
                case 8:
                    z2 = z6;
                    animatableTransform2 = com.airbnb.lottie.parser.AnimatableTransformParser.parse(jsonReader, lottieComposition);
                    z6 = z2;
                    z5 = false;
                    break;
                case 9:
                    z2 = z6;
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= com.airbnb.lottie.model.layer.Layer.MatteType.values().length) {
                        lottieComposition.addWarning("Unsupported matte type: ".concat(java.lang.String.valueOf(nextInt2)));
                    } else {
                        matteType2 = com.airbnb.lottie.model.layer.Layer.MatteType.values()[nextInt2];
                        int i6 = com.airbnb.lottie.parser.LayerParser.AnonymousClass1.Camera2StreamConfigurationMap[matteType2.ordinal()];
                        if (i6 == 1) {
                            lottieComposition.addWarning("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            lottieComposition.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.incrementMatteOrMaskCount(1);
                    }
                    z6 = z2;
                    z5 = false;
                    break;
                case 10:
                    z2 = z6;
                    java.util.ArrayList arrayList5 = arrayList3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList5.add(com.airbnb.lottie.parser.MaskParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition));
                    }
                    arrayList3 = arrayList5;
                    lottieComposition.incrementMatteOrMaskCount(arrayList3.size());
                    jsonReader.endArray();
                    z6 = z2;
                    z5 = false;
                    break;
                case 11:
                    z2 = z6;
                    arrayList2 = arrayList3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.airbnb.lottie.model.content.ContentModel highSpeedVideoSizes = com.airbnb.lottie.parser.ContentModelParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                        if (highSpeedVideoSizes != null) {
                            arrayList4.add(highSpeedVideoSizes);
                        }
                    }
                    jsonReader.endArray();
                    arrayList3 = arrayList2;
                    z6 = z2;
                    z5 = false;
                    break;
                case 12:
                    z2 = z6;
                    arrayList2 = arrayList3;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(getHighSpeedVideoFpsRangesFor);
                        if (selectName == 0) {
                            animatableTextFrame = com.airbnb.lottie.parser.AnimatableValueParser.getHighSpeedVideoFpsRanges(jsonReader, lottieComposition);
                        } else if (selectName == 1) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                animatableTextProperties = com.airbnb.lottie.parser.AnimatableTextPropertiesParser.parse(jsonReader, lottieComposition);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    arrayList3 = arrayList2;
                    z6 = z2;
                    z5 = false;
                    break;
                case 13:
                    arrayList2 = arrayList3;
                    jsonReader.beginArray();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(getHighSpeedVideoSizes);
                            if (selectName2 == 0) {
                                int nextInt3 = jsonReader.nextInt();
                                if (nextInt3 == 29) {
                                    blurEffect = com.airbnb.lottie.parser.BlurEffectParser.getHighSpeedVideoFpsRanges(jsonReader, lottieComposition);
                                } else if (nextInt3 == 25) {
                                    com.airbnb.lottie.parser.DropShadowEffectParser dropShadowEffectParser = new com.airbnb.lottie.parser.DropShadowEffectParser();
                                    while (jsonReader.hasNext()) {
                                        if (jsonReader.selectName(com.airbnb.lottie.parser.DropShadowEffectParser.getHighResolutionOutputSizeshNQ4ISI) == 0) {
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                jsonReader.beginObject();
                                                java.lang.String str5 = "";
                                                while (jsonReader.hasNext()) {
                                                    int selectName3 = jsonReader.selectName(com.airbnb.lottie.parser.DropShadowEffectParser.getHighSpeedVideoSizes);
                                                    if (selectName3 != 0) {
                                                        if (selectName3 == i5) {
                                                            str5.hashCode();
                                                            switch (str5.hashCode()) {
                                                                case 353103893:
                                                                    if (str5.equals("Distance")) {
                                                                        i = 0;
                                                                        break;
                                                                    }
                                                                    i = -1;
                                                                    break;
                                                                case 397447147:
                                                                    if (str5.equals("Opacity")) {
                                                                        i = i5;
                                                                        break;
                                                                    }
                                                                    i = -1;
                                                                    break;
                                                                case 1041377119:
                                                                    if (str5.equals("Direction")) {
                                                                        i = 2;
                                                                        break;
                                                                    }
                                                                    i = -1;
                                                                    break;
                                                                case 1379387491:
                                                                    if (str5.equals("Shadow Color")) {
                                                                        i = 3;
                                                                        break;
                                                                    }
                                                                    i = -1;
                                                                    break;
                                                                case 1383710113:
                                                                    if (str5.equals("Softness")) {
                                                                        i = 4;
                                                                        break;
                                                                    }
                                                                    i = -1;
                                                                    break;
                                                                default:
                                                                    i = -1;
                                                                    break;
                                                            }
                                                            if (i == 0) {
                                                                z4 = false;
                                                                dropShadowEffectParser.getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                                            } else if (i == i5) {
                                                                z4 = false;
                                                                dropShadowEffectParser.getOutputFormats = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                                                            } else if (i == 2) {
                                                                z4 = false;
                                                                dropShadowEffectParser.getHighSpeedVideoFpsRanges = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                                                            } else if (i == 3) {
                                                                dropShadowEffectParser.Camera2StreamConfigurationMap = com.airbnb.lottie.parser.AnimatableValueParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
                                                            } else if (i == 4) {
                                                                dropShadowEffectParser.getInputSizeshNQ4ISI = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                                            } else {
                                                                jsonReader.skipValue();
                                                            }
                                                        } else {
                                                            jsonReader.skipName();
                                                            jsonReader.skipValue();
                                                        }
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                        str5 = jsonReader.nextString();
                                                    }
                                                    z5 = z4;
                                                    i5 = 1;
                                                }
                                                jsonReader.endObject();
                                                i5 = 1;
                                            }
                                            jsonReader.endArray();
                                            i5 = 1;
                                        } else {
                                            jsonReader.skipName();
                                            jsonReader.skipValue();
                                        }
                                    }
                                    if (dropShadowEffectParser.Camera2StreamConfigurationMap == null || dropShadowEffectParser.getOutputFormats == null || dropShadowEffectParser.getHighSpeedVideoFpsRanges == null || dropShadowEffectParser.getHighSpeedVideoFpsRangesFor == null || dropShadowEffectParser.getInputSizeshNQ4ISI == null) {
                                        z3 = z6;
                                        dropShadowEffect = null;
                                    } else {
                                        z3 = z6;
                                        dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(dropShadowEffectParser.Camera2StreamConfigurationMap, dropShadowEffectParser.getOutputFormats, dropShadowEffectParser.getHighSpeedVideoFpsRanges, dropShadowEffectParser.getHighSpeedVideoFpsRangesFor, dropShadowEffectParser.getInputSizeshNQ4ISI);
                                    }
                                    z6 = z3;
                                    i5 = 1;
                                    z5 = false;
                                }
                            } else if (selectName2 == i5) {
                                arrayList6.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            }
                            z3 = z6;
                            z6 = z3;
                            i5 = 1;
                            z5 = false;
                        }
                        jsonReader.endObject();
                        i5 = 1;
                        z5 = false;
                    }
                    z2 = z6;
                    jsonReader.endArray();
                    lottieComposition.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(java.lang.String.valueOf(arrayList6)));
                    arrayList3 = arrayList2;
                    z6 = z2;
                    z5 = false;
                    break;
                case 14:
                    f = (float) jsonReader.nextDouble();
                    z2 = z6;
                    z6 = z2;
                    z5 = false;
                    break;
                case 15:
                    f2 = (float) jsonReader.nextDouble();
                    z2 = z6;
                    z6 = z2;
                    z5 = false;
                    break;
                case 16:
                    arrayList2 = arrayList3;
                    f3 = (float) (jsonReader.nextDouble() * com.airbnb.lottie.utils.Utils.dpScale());
                    z2 = z6;
                    arrayList3 = arrayList2;
                    z6 = z2;
                    z5 = false;
                    break;
                case 17:
                    arrayList2 = arrayList3;
                    f4 = (float) (jsonReader.nextDouble() * com.airbnb.lottie.utils.Utils.dpScale());
                    z2 = z6;
                    arrayList3 = arrayList2;
                    z6 = z2;
                    z5 = false;
                    break;
                case 18:
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    animatableFloatValue = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z5);
                    break;
                case 21:
                    str4 = jsonReader.nextString();
                    break;
                case 22:
                    z7 = jsonReader.nextBoolean();
                    break;
                case 23:
                    if (jsonReader.nextInt() != 1) {
                        z6 = z5;
                        break;
                    } else {
                        z6 = true;
                        break;
                    }
                case 24:
                    int nextInt4 = jsonReader.nextInt();
                    if (nextInt4 >= com.airbnb.lottie.model.content.LBlendMode.values().length) {
                        lottieComposition.addWarning("Unsupported Blend Mode: ".concat(java.lang.String.valueOf(nextInt4)));
                        lBlendMode2 = com.airbnb.lottie.model.content.LBlendMode.NORMAL;
                        break;
                    } else {
                        lBlendMode2 = com.airbnb.lottie.model.content.LBlendMode.values()[nextInt4];
                        break;
                    }
                default:
                    z2 = z6;
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    z6 = z2;
                    z5 = false;
                    break;
            }
        }
        boolean z8 = z6;
        jsonReader.endObject();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        if (f6 > 0.0f) {
            z = z8;
            arrayList = arrayList3;
            str = str4;
            arrayList7.add(new com.airbnb.lottie.value.Keyframe(lottieComposition, valueOf, valueOf, null, 0.0f, java.lang.Float.valueOf(f6)));
        } else {
            arrayList = arrayList3;
            z = z8;
            str = str4;
        }
        if (f5 <= 0.0f) {
            f5 = lottieComposition.getEndFrame();
        }
        arrayList7.add(new com.airbnb.lottie.value.Keyframe(lottieComposition, valueOf2, valueOf2, null, f6, java.lang.Float.valueOf(f5)));
        arrayList7.add(new com.airbnb.lottie.value.Keyframe(lottieComposition, valueOf, valueOf, null, f5, java.lang.Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str)) {
            lottieComposition.addWarning("Convert your Illustrator layers to shape layers.");
        }
        boolean z9 = z;
        if (z9) {
            if (animatableTransform2 == null) {
                animatableTransform2 = new com.airbnb.lottie.model.animatable.AnimatableTransform();
            }
            com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform3 = animatableTransform2;
            animatableTransform3.setAutoOrient(z9);
            animatableTransform = animatableTransform3;
        } else {
            animatableTransform = animatableTransform2;
        }
        return new com.airbnb.lottie.model.layer.Layer(arrayList4, lottieComposition, str3, j2, layerType2, j, str2, arrayList, animatableTransform, i2, i3, i4, f, f2, f3, f4, animatableTextFrame, animatableTextProperties, arrayList7, matteType2, animatableFloatValue, z7, blurEffect, dropShadowEffect, lBlendMode2);
    }

    /* renamed from: com.airbnb.lottie.parser.LayerParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.layer.Layer.MatteType.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.airbnb.lottie.model.layer.Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
