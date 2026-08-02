package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class PolystarContent implements com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent {
    private boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getHighSpeedVideoSizes;
    private final com.airbnb.lottie.LottieDrawable getHighSpeedVideoSizesFor;
    private final java.lang.String getOutputMinFrameDuration;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOutputMinFrameDurationlomOqCM;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOutputSizes;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> getOutputStallDuration;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOutputStallDurationlomOqCM;
    private final com.airbnb.lottie.model.content.PolystarShape.Type toString;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> unwrapAs;
    private final android.graphics.Path getOutputSizeshNQ4ISI = new android.graphics.Path();
    private final android.graphics.Path getInputFormats = new android.graphics.Path();
    private final android.graphics.PathMeasure getInputSizeshNQ4ISI = new android.graphics.PathMeasure();
    private final float[] getOutputFormats = new float[2];
    private final com.airbnb.lottie.animation.content.CompoundTrimPathContent getValidOutputFormatsForInputhNQ4ISI = new com.airbnb.lottie.animation.content.CompoundTrimPathContent();

    public PolystarContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.PolystarShape polystarShape) {
        this.getHighSpeedVideoSizesFor = lottieDrawable;
        this.getOutputMinFrameDuration = polystarShape.getName();
        com.airbnb.lottie.model.content.PolystarShape.Type type = polystarShape.getType();
        this.toString = type;
        this.getHighResolutionOutputSizeshNQ4ISI = polystarShape.isHidden();
        this.getHighSpeedVideoFpsRangesFor = polystarShape.isReversed();
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation = polystarShape.getPoints().createAnimation();
        this.getOutputSizes = createAnimation;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation2 = polystarShape.getPosition().createAnimation();
        this.getOutputStallDuration = createAnimation2;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation3 = polystarShape.getRotation().createAnimation();
        this.unwrapAs = createAnimation3;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.getOutputMinFrameDurationlomOqCM = createAnimation4;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.getOutputStallDurationlomOqCM = createAnimation5;
        if (type == com.airbnb.lottie.model.content.PolystarShape.Type.STAR) {
            this.getHighSpeedVideoSizes = polystarShape.getInnerRadius().createAnimation();
            this.getHighSpeedVideoFpsRanges = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
        }
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        baseLayer.addAnimation(createAnimation4);
        baseLayer.addAnimation(createAnimation5);
        if (type == com.airbnb.lottie.model.content.PolystarShape.Type.STAR) {
            baseLayer.addAnimation(this.getHighSpeedVideoSizes);
            baseLayer.addAnimation(this.getHighSpeedVideoFpsRanges);
        }
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
        createAnimation4.addUpdateListener(this);
        createAnimation5.addUpdateListener(this);
        if (type == com.airbnb.lottie.model.content.PolystarShape.Type.STAR) {
            this.getHighSpeedVideoSizes.addUpdateListener(this);
            this.getHighSpeedVideoFpsRanges.addUpdateListener(this);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list.get(i);
            if (content instanceof com.airbnb.lottie.animation.content.TrimPathContent) {
                com.airbnb.lottie.animation.content.TrimPathContent trimPathContent = (com.airbnb.lottie.animation.content.TrimPathContent) content;
                if (trimPathContent.getHighResolutionOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoFpsRangesFor.add(trimPathContent);
                    trimPathContent.Camera2StreamConfigurationMap.add(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        float f;
        float cos;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        double d2;
        int i;
        float f8;
        float f9;
        double d3;
        double d4;
        float f10;
        boolean z;
        if (this.Camera2StreamConfigurationMap) {
            return this.getOutputSizeshNQ4ISI;
        }
        this.getOutputSizeshNQ4ISI.reset();
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap = true;
            return this.getOutputSizeshNQ4ISI;
        }
        int i2 = com.airbnb.lottie.animation.content.PolystarContent.AnonymousClass1.Camera2StreamConfigurationMap[this.toString.ordinal()];
        if (i2 == 1) {
            float floatValue = this.getOutputSizes.getValue().floatValue();
            double radians = java.lang.Math.toRadians((this.unwrapAs == null ? 0.0d : r2.getValue().floatValue()) - 90.0d);
            double d5 = floatValue;
            float f11 = (float) (6.283185307179586d / d5);
            if (this.getHighSpeedVideoFpsRangesFor) {
                f11 *= -1.0f;
            }
            float f12 = f11 / 2.0f;
            float f13 = floatValue - ((int) floatValue);
            if (f13 != 0.0f) {
                radians += (1.0f - f13) * f12;
            }
            float floatValue2 = this.getOutputMinFrameDurationlomOqCM.getValue().floatValue();
            float floatValue3 = this.getHighSpeedVideoSizes.getValue().floatValue();
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation = this.getHighSpeedVideoFpsRanges;
            float floatValue4 = baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() / 100.0f : 0.0f;
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation2 = this.getOutputStallDurationlomOqCM;
            float floatValue5 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
            if (f13 != 0.0f) {
                float f14 = ((floatValue2 - floatValue3) * f13) + floatValue3;
                f = floatValue2;
                double d6 = f14;
                cos = (float) (d6 * java.lang.Math.cos(radians));
                float sin = (float) (d6 * java.lang.Math.sin(radians));
                this.getOutputSizeshNQ4ISI.moveTo(cos, sin);
                d = radians + ((f11 * f13) / 2.0f);
                f3 = sin;
                f4 = f14;
                f2 = f12;
            } else {
                double d7 = floatValue2;
                f = floatValue2;
                cos = (float) (java.lang.Math.cos(radians) * d7);
                float sin2 = (float) (d7 * java.lang.Math.sin(radians));
                this.getOutputSizeshNQ4ISI.moveTo(cos, sin2);
                f2 = f12;
                d = radians + f2;
                f3 = sin2;
                f4 = 0.0f;
            }
            double ceil = java.lang.Math.ceil(d5) * 2.0d;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                double d8 = i3;
                if (d8 >= ceil) {
                    break;
                }
                float f15 = z2 ? f : floatValue3;
                if (f4 == 0.0f || d8 != ceil - 2.0d) {
                    f5 = f11;
                    f6 = f2;
                } else {
                    f5 = f11;
                    f6 = (f11 * f13) / 2.0f;
                }
                if (f4 == 0.0f || d8 != ceil - 1.0d) {
                    f7 = f4;
                    d2 = d8;
                    f4 = f15;
                } else {
                    f7 = f4;
                    d2 = d8;
                }
                double d9 = f4;
                double d10 = ceil;
                float cos2 = (float) (d9 * java.lang.Math.cos(d));
                float sin3 = (float) (d9 * java.lang.Math.sin(d));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.getOutputSizeshNQ4ISI.lineTo(cos2, sin3);
                    i = i3;
                    f8 = floatValue5;
                    f9 = floatValue4;
                } else {
                    i = i3;
                    double atan2 = (float) (java.lang.Math.atan2(f3, cos) - 1.5707963267948966d);
                    float cos3 = (float) java.lang.Math.cos(atan2);
                    float sin4 = (float) java.lang.Math.sin(atan2);
                    f8 = floatValue5;
                    f9 = floatValue4;
                    double atan22 = (float) (java.lang.Math.atan2(sin3, cos2) - 1.5707963267948966d);
                    float cos4 = (float) java.lang.Math.cos(atan22);
                    float sin5 = (float) java.lang.Math.sin(atan22);
                    float f16 = z2 ? f9 : f8;
                    float f17 = z2 ? f8 : f9;
                    float f18 = (z2 ? floatValue3 : f) * f16 * 0.47829f;
                    float f19 = cos3 * f18;
                    float f20 = f18 * sin4;
                    float f21 = (z2 ? f : floatValue3) * f17 * 0.47829f;
                    float f22 = cos4 * f21;
                    float f23 = f21 * sin5;
                    if (f13 != 0.0f) {
                        if (i == 0) {
                            f19 *= f13;
                            f20 *= f13;
                        } else {
                            if (d2 == d10 - 1.0d) {
                                f22 *= f13;
                                f23 *= f13;
                            }
                            this.getOutputSizeshNQ4ISI.cubicTo(cos - f19, f3 - f20, cos2 + f22, sin3 + f23, cos2, sin3);
                        }
                    }
                    this.getOutputSizeshNQ4ISI.cubicTo(cos - f19, f3 - f20, cos2 + f22, sin3 + f23, cos2, sin3);
                }
                d += f6;
                z2 = !z2;
                i3 = i + 1;
                cos = cos2;
                f3 = sin3;
                f4 = f7;
                f11 = f5;
                floatValue4 = f9;
                floatValue5 = f8;
                ceil = d10;
            }
            android.graphics.PointF value = this.getOutputStallDuration.getValue();
            this.getOutputSizeshNQ4ISI.offset(value.x, value.y);
            this.getOutputSizeshNQ4ISI.close();
        } else if (i2 == 2) {
            int floor = (int) java.lang.Math.floor(this.getOutputSizes.getValue().floatValue());
            double radians2 = java.lang.Math.toRadians((this.unwrapAs == null ? 0.0d : r7.getValue().floatValue()) - 90.0d);
            double d11 = floor;
            float floatValue6 = this.getOutputStallDurationlomOqCM.getValue().floatValue() / 100.0f;
            float floatValue7 = this.getOutputMinFrameDurationlomOqCM.getValue().floatValue();
            double d12 = floatValue7;
            float cos5 = (float) (java.lang.Math.cos(radians2) * d12);
            float sin6 = (float) (java.lang.Math.sin(radians2) * d12);
            this.getOutputSizeshNQ4ISI.moveTo(cos5, sin6);
            double d13 = (float) (6.283185307179586d / d11);
            double ceil2 = java.lang.Math.ceil(d11);
            double d14 = radians2 + d13;
            int i4 = 0;
            while (true) {
                double d15 = i4;
                if (d15 >= ceil2) {
                    break;
                }
                double d16 = d13;
                int i5 = i4;
                float cos6 = (float) (d12 * java.lang.Math.cos(d14));
                float sin7 = (float) (java.lang.Math.sin(d14) * d12);
                if (floatValue6 != 0.0f) {
                    d4 = d12;
                    f10 = floatValue7;
                    double atan23 = (float) (java.lang.Math.atan2(sin6, cos5) - 1.5707963267948966d);
                    float cos7 = (float) java.lang.Math.cos(atan23);
                    float sin8 = (float) java.lang.Math.sin(atan23);
                    d3 = d14;
                    float f24 = cos5;
                    float f25 = sin6;
                    double atan24 = (float) (java.lang.Math.atan2(sin7, cos6) - 1.5707963267948966d);
                    float f26 = f10 * floatValue6 * 0.25f;
                    float f27 = f26 * cos7;
                    float f28 = sin8 * f26;
                    float cos8 = ((float) java.lang.Math.cos(atan24)) * f26;
                    float sin9 = f26 * ((float) java.lang.Math.sin(atan24));
                    if (d15 == ceil2 - 1.0d) {
                        this.getInputFormats.reset();
                        this.getInputFormats.moveTo(f24, f25);
                        float f29 = f24 - f27;
                        float f30 = f25 - f28;
                        float f31 = cos8 + cos6;
                        float f32 = sin9 + sin7;
                        this.getInputFormats.cubicTo(f29, f30, f31, f32, cos6, sin7);
                        z = false;
                        this.getInputSizeshNQ4ISI.setPath(this.getInputFormats, false);
                        android.graphics.PathMeasure pathMeasure = this.getInputSizeshNQ4ISI;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.getOutputFormats, null);
                        android.graphics.Path path = this.getOutputSizeshNQ4ISI;
                        float[] fArr = this.getOutputFormats;
                        path.cubicTo(f29, f30, f31, f32, fArr[0], fArr[1]);
                    } else {
                        z = false;
                        this.getOutputSizeshNQ4ISI.cubicTo(f24 - f27, f25 - f28, cos6 + cos8, sin7 + sin9, cos6, sin7);
                    }
                } else {
                    d3 = d14;
                    d4 = d12;
                    f10 = floatValue7;
                    if (d15 != ceil2 - 1.0d) {
                        this.getOutputSizeshNQ4ISI.lineTo(cos6, sin7);
                    } else {
                        d14 = d3;
                        cos5 = cos6;
                        sin6 = sin7;
                        i4 = i5 + 1;
                        floatValue7 = f10;
                        d12 = d4;
                        d13 = d16;
                    }
                }
                d14 = d3 + d16;
                cos5 = cos6;
                sin6 = sin7;
                i4 = i5 + 1;
                floatValue7 = f10;
                d12 = d4;
                d13 = d16;
            }
            android.graphics.PointF value2 = this.getOutputStallDuration.getValue();
            this.getOutputSizeshNQ4ISI.offset(value2.x, value2.y);
            this.getOutputSizeshNQ4ISI.close();
        }
        this.getOutputSizeshNQ4ISI.close();
        this.getValidOutputFormatsForInputhNQ4ISI.apply(this.getOutputSizeshNQ4ISI);
        this.Camera2StreamConfigurationMap = true;
        return this.getOutputSizeshNQ4ISI;
    }

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.PolystarShape.Type.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getOutputMinFrameDuration;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation2;
        if (t == com.airbnb.lottie.LottieProperty.POLYSTAR_POINTS) {
            this.getOutputSizes.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.POLYSTAR_ROTATION) {
            this.unwrapAs.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.POSITION) {
            this.getOutputStallDuration.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.getHighSpeedVideoSizes) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.getOutputMinFrameDurationlomOqCM.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.getHighSpeedVideoFpsRanges) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t == com.airbnb.lottie.LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.getOutputStallDurationlomOqCM.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoSizesFor.invalidateSelf();
    }
}
