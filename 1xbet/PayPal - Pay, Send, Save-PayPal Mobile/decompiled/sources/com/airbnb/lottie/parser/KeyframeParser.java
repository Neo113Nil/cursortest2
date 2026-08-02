package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class KeyframeParser {
    private static androidx.collection.SparseArrayCompat<java.lang.ref.WeakReference<android.view.animation.Interpolator>> Camera2StreamConfigurationMap;
    private static final android.view.animation.Interpolator getHighSpeedVideoSizes = new android.view.animation.LinearInterpolator();
    static com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("t", lib.android.paypal.com.magnessdk.g.n2, "e", "o", "i", "h", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "ti");
    static com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("x", "y");

    KeyframeParser() {
    }

    private static java.lang.ref.WeakReference<android.view.animation.Interpolator> Camera2StreamConfigurationMap(int i) {
        java.lang.ref.WeakReference<android.view.animation.Interpolator> weakReference;
        synchronized (com.airbnb.lottie.parser.KeyframeParser.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new androidx.collection.SparseArrayCompat<>();
            }
            weakReference = Camera2StreamConfigurationMap.get(i);
        }
        return weakReference;
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.ref.WeakReference<android.view.animation.Interpolator> weakReference) {
        synchronized (com.airbnb.lottie.parser.KeyframeParser.class) {
            Camera2StreamConfigurationMap.put(i, weakReference);
        }
    }

    private static android.view.animation.Interpolator getHighSpeedVideoFpsRangesFor(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        android.view.animation.Interpolator linearInterpolator;
        pointF.x = com.airbnb.lottie.utils.MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        pointF2.y = com.airbnb.lottie.utils.MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        int hashFor = com.airbnb.lottie.utils.Utils.hashFor(pointF.x, pointF.y, pointF2.x, pointF2.y);
        java.lang.ref.WeakReference<android.view.animation.Interpolator> Camera2StreamConfigurationMap2 = com.airbnb.lottie.L.getDisablePathInterpolatorCache() ? null : Camera2StreamConfigurationMap(hashFor);
        android.view.animation.Interpolator interpolator = Camera2StreamConfigurationMap2 != null ? Camera2StreamConfigurationMap2.get() : null;
        if (Camera2StreamConfigurationMap2 != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = androidx.core.view.animation.PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (java.lang.IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = androidx.core.view.animation.PathInterpolatorCompat.create(java.lang.Math.min(pointF.x, 1.0f), pointF.y, java.lang.Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new android.view.animation.LinearInterpolator();
            }
        }
        if (!com.airbnb.lottie.L.getDisablePathInterpolatorCache()) {
            try {
                getHighSpeedVideoSizes(hashFor, new java.lang.ref.WeakReference(linearInterpolator));
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    static <T> com.airbnb.lottie.value.Keyframe<T> Camera2StreamConfigurationMap(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition, float f, com.airbnb.lottie.parser.ValueParser<T> valueParser, boolean z, boolean z2) throws java.io.IOException {
        android.view.animation.Interpolator interpolator;
        android.view.animation.Interpolator interpolator2;
        T t;
        android.view.animation.Interpolator interpolator3;
        T t2;
        android.view.animation.Interpolator interpolator4;
        android.view.animation.Interpolator highSpeedVideoFpsRangesFor;
        T t3;
        android.graphics.PointF pointF;
        com.airbnb.lottie.value.Keyframe<T> keyframe;
        android.graphics.PointF pointF2;
        android.graphics.PointF pointF3;
        if (!z || !z2) {
            if (z) {
                jsonReader.beginObject();
                android.graphics.PointF pointF4 = null;
                android.graphics.PointF pointF5 = null;
                android.graphics.PointF pointF6 = null;
                android.graphics.PointF pointF7 = null;
                boolean z3 = false;
                T t4 = null;
                float f2 = 0.0f;
                T t5 = null;
                while (jsonReader.hasNext()) {
                    switch (jsonReader.selectName(getHighSpeedVideoFpsRangesFor)) {
                        case 0:
                            f2 = (float) jsonReader.nextDouble();
                            break;
                        case 1:
                            t4 = valueParser.parse(jsonReader, f);
                            break;
                        case 2:
                            t5 = valueParser.parse(jsonReader, f);
                            break;
                        case 3:
                            pointF7 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, 1.0f);
                            break;
                        case 4:
                            pointF4 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, 1.0f);
                            break;
                        case 5:
                            if (jsonReader.nextInt() != 1) {
                                z3 = false;
                                break;
                            } else {
                                z3 = true;
                                break;
                            }
                        case 6:
                            pointF6 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, f);
                            break;
                        case 7:
                            pointF5 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, f);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (z3) {
                    interpolator2 = getHighSpeedVideoSizes;
                    t = t4;
                } else {
                    if (pointF7 != null && pointF4 != null) {
                        interpolator = getHighSpeedVideoFpsRangesFor(pointF7, pointF4);
                    } else {
                        interpolator = getHighSpeedVideoSizes;
                    }
                    interpolator2 = interpolator;
                    t = t5;
                }
                com.airbnb.lottie.value.Keyframe<T> keyframe2 = new com.airbnb.lottie.value.Keyframe<>(lottieComposition, t4, t, interpolator2, f2, null);
                keyframe2.pathCp1 = pointF6;
                keyframe2.pathCp2 = pointF5;
                return keyframe2;
            }
            return new com.airbnb.lottie.value.Keyframe<>(valueParser.parse(jsonReader, f));
        }
        jsonReader.beginObject();
        android.graphics.PointF pointF8 = null;
        android.graphics.PointF pointF9 = null;
        android.graphics.PointF pointF10 = null;
        boolean z4 = false;
        android.graphics.PointF pointF11 = null;
        android.graphics.PointF pointF12 = null;
        android.graphics.PointF pointF13 = null;
        T t6 = null;
        android.graphics.PointF pointF14 = null;
        T t7 = null;
        android.graphics.PointF pointF15 = null;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(getHighSpeedVideoFpsRangesFor)) {
                case 0:
                    pointF2 = pointF9;
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t6 = valueParser.parse(jsonReader, f);
                    continue;
                case 2:
                    t7 = valueParser.parse(jsonReader, f);
                    continue;
                case 3:
                    pointF2 = pointF9;
                    android.graphics.PointF pointF16 = pointF10;
                    T t8 = t7;
                    if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
                            if (selectName != 0) {
                                if (selectName == 1) {
                                    if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER) {
                                        f7 = (float) jsonReader.nextDouble();
                                        f5 = f7;
                                    } else {
                                        jsonReader.beginArray();
                                        f5 = (float) jsonReader.nextDouble();
                                        f7 = jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : f5;
                                        jsonReader.endArray();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER) {
                                f6 = (float) jsonReader.nextDouble();
                                f4 = f6;
                            } else {
                                jsonReader.beginArray();
                                f4 = (float) jsonReader.nextDouble();
                                f6 = jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : f4;
                                jsonReader.endArray();
                            }
                        }
                        pointF14 = new android.graphics.PointF(f4, f5);
                        android.graphics.PointF pointF17 = new android.graphics.PointF(f6, f7);
                        jsonReader.endObject();
                        t7 = t8;
                        pointF10 = pointF16;
                        pointF13 = pointF17;
                        break;
                    } else {
                        pointF11 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, f);
                        t7 = t8;
                        pointF10 = pointF16;
                        break;
                    }
                case 4:
                    T t9 = t7;
                    if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (jsonReader.hasNext()) {
                            android.graphics.PointF pointF18 = pointF9;
                            int selectName2 = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
                            if (selectName2 != 0) {
                                pointF3 = pointF10;
                                if (selectName2 == 1) {
                                    if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER) {
                                        f11 = (float) jsonReader.nextDouble();
                                        pointF10 = pointF3;
                                        f9 = f11;
                                        pointF9 = pointF18;
                                    } else {
                                        jsonReader.beginArray();
                                        f9 = (float) jsonReader.nextDouble();
                                        f11 = jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : f9;
                                        jsonReader.endArray();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                pointF10 = pointF3;
                                pointF9 = pointF18;
                            } else {
                                pointF3 = pointF10;
                                if (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER) {
                                    f10 = (float) jsonReader.nextDouble();
                                    pointF10 = pointF3;
                                    f8 = f10;
                                    pointF9 = pointF18;
                                } else {
                                    jsonReader.beginArray();
                                    f8 = (float) jsonReader.nextDouble();
                                    f10 = jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : f8;
                                    jsonReader.endArray();
                                    pointF10 = pointF3;
                                    pointF9 = pointF18;
                                }
                            }
                        }
                        pointF2 = pointF9;
                        android.graphics.PointF pointF19 = new android.graphics.PointF(f8, f9);
                        pointF8 = new android.graphics.PointF(f10, f11);
                        jsonReader.endObject();
                        t7 = t9;
                        pointF15 = pointF19;
                        break;
                    } else {
                        pointF12 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, f);
                        t7 = t9;
                        break;
                    }
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        continue;
                    }
                case 6:
                    pointF10 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, f);
                    continue;
                case 7:
                    pointF9 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader, f);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            pointF9 = pointF2;
        }
        android.graphics.PointF pointF20 = pointF9;
        android.graphics.PointF pointF21 = pointF10;
        T t10 = t7;
        jsonReader.endObject();
        if (z4) {
            interpolator3 = getHighSpeedVideoSizes;
            t3 = t6;
        } else {
            if (pointF11 != null && pointF12 != null) {
                interpolator3 = getHighSpeedVideoFpsRangesFor(pointF11, pointF12);
            } else {
                if (pointF14 != null && pointF13 != null && pointF15 != null && pointF8 != null) {
                    android.view.animation.Interpolator highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(pointF14, pointF15);
                    t2 = t10;
                    interpolator4 = highSpeedVideoFpsRangesFor2;
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(pointF13, pointF8);
                    interpolator3 = null;
                    if (interpolator4 == null && highSpeedVideoFpsRangesFor != null) {
                        keyframe = new com.airbnb.lottie.value.Keyframe<>(lottieComposition, t6, t2, interpolator4, highSpeedVideoFpsRangesFor, f3, null);
                        pointF = pointF21;
                    } else {
                        pointF = pointF21;
                        keyframe = new com.airbnb.lottie.value.Keyframe<>(lottieComposition, t6, t2, interpolator3, f3, null);
                    }
                    keyframe.pathCp1 = pointF;
                    keyframe.pathCp2 = pointF20;
                    return keyframe;
                }
                interpolator3 = getHighSpeedVideoSizes;
            }
            t3 = t10;
        }
        t2 = t3;
        interpolator4 = null;
        highSpeedVideoFpsRangesFor = null;
        if (interpolator4 == null) {
        }
        pointF = pointF21;
        keyframe = new com.airbnb.lottie.value.Keyframe<>(lottieComposition, t6, t2, interpolator3, f3, null);
        keyframe.pathCp1 = pointF;
        keyframe.pathCp2 = pointF20;
        return keyframe;
    }
}
