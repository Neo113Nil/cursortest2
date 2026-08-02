package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class TransformKeyframeAnimation {
    private final android.graphics.Matrix CoroutineDebuggingKt;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> accessartificialFrame;
    private final float[] coroutineBoundary;
    private final android.graphics.Matrix coroutineCreation;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getHighSpeedVideoSizesFor;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getOutputMinFrameDurationlomOqCM;
    private com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getOutputSizes;
    private com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getOutputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getOutputStallDuration;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> getOutputStallDurationlomOqCM;
    private com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getValidOutputFormatsForInputhNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation isOutputSupportedFor;
    private com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation isOutputSupportedForhNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> toString;
    private final android.graphics.Matrix unwrapAs;
    private final android.graphics.Matrix getOutputFormats = new android.graphics.Matrix();
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;
    private float getInputFormats = Float.NaN;
    private float getHighResolutionOutputSizeshNQ4ISI = 1.0f;
    private float Camera2StreamConfigurationMap = 1.0f;
    boolean getHighSpeedVideoSizes = true;

    public TransformKeyframeAnimation(com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform) {
        this.getHighSpeedVideoFpsRanges = animatableTransform.getAnchorPoint() == null ? null : animatableTransform.getAnchorPoint().createAnimation();
        this.getOutputStallDurationlomOqCM = animatableTransform.getPosition() == null ? null : animatableTransform.getPosition().createAnimation();
        this.toString = animatableTransform.getScale() == null ? null : animatableTransform.getScale().createAnimation();
        this.getOutputStallDuration = animatableTransform.getRotation() == null ? null : animatableTransform.getRotation().createAnimation();
        this.isOutputSupportedForhNQ4ISI = animatableTransform.getSkew() == null ? null : animatableTransform.getSkew().createAnimation();
        this.getHighSpeedVideoFpsRangesFor = animatableTransform.isAutoOrient();
        this.getOutputSizeshNQ4ISI = animatableTransform.getRotationX() == null ? null : animatableTransform.getRotationX().createAnimation();
        this.getOutputSizes = animatableTransform.getRotationY() == null ? null : animatableTransform.getRotationY().createAnimation();
        this.getValidOutputFormatsForInputhNQ4ISI = animatableTransform.getRotationZ() == null ? null : animatableTransform.getRotationZ().createAnimation();
        if (this.isOutputSupportedForhNQ4ISI != null) {
            this.unwrapAs = new android.graphics.Matrix();
            this.CoroutineDebuggingKt = new android.graphics.Matrix();
            this.coroutineCreation = new android.graphics.Matrix();
            this.coroutineBoundary = new float[9];
        } else {
            this.unwrapAs = null;
            this.CoroutineDebuggingKt = null;
            this.coroutineCreation = null;
            this.coroutineBoundary = null;
        }
        this.isOutputSupportedFor = animatableTransform.getSkewAngle() == null ? null : animatableTransform.getSkewAngle().createAnimation();
        if (animatableTransform.getOpacity() != null) {
            this.getOutputMinFrameDurationlomOqCM = animatableTransform.getOpacity().createAnimation();
        }
        if (animatableTransform.getStartOpacity() != null) {
            this.accessartificialFrame = animatableTransform.getStartOpacity().createAnimation();
        } else {
            this.accessartificialFrame = null;
        }
        if (animatableTransform.getEndOpacity() != null) {
            this.getHighSpeedVideoSizesFor = animatableTransform.getEndOpacity().createAnimation();
        } else {
            this.getHighSpeedVideoSizesFor = null;
        }
    }

    public void addAnimationsToLayer(com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        baseLayer.addAnimation(this.getOutputMinFrameDurationlomOqCM);
        baseLayer.addAnimation(this.accessartificialFrame);
        baseLayer.addAnimation(this.getHighSpeedVideoSizesFor);
        baseLayer.addAnimation(this.getHighSpeedVideoFpsRanges);
        baseLayer.addAnimation(this.getOutputStallDurationlomOqCM);
        baseLayer.addAnimation(this.toString);
        baseLayer.addAnimation(this.getOutputStallDuration);
        baseLayer.addAnimation(this.isOutputSupportedForhNQ4ISI);
        baseLayer.addAnimation(this.isOutputSupportedFor);
        baseLayer.addAnimation(this.getOutputSizeshNQ4ISI);
        baseLayer.addAnimation(this.getOutputSizes);
        baseLayer.addAnimation(this.getValidOutputFormatsForInputhNQ4ISI);
    }

    public void addListener(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener) {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation = this.getOutputMinFrameDurationlomOqCM;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation2 = this.accessartificialFrame;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation3 = this.getHighSpeedVideoSizesFor;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> baseKeyframeAnimation4 = this.getHighSpeedVideoFpsRanges;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation5 = this.getOutputStallDurationlomOqCM;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> baseKeyframeAnimation6 = this.toString;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation7 = this.getOutputStallDuration;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation = this.isOutputSupportedForhNQ4ISI;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation2 = this.isOutputSupportedFor;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.addUpdateListener(animationListener);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation3 = this.getOutputSizeshNQ4ISI;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.addUpdateListener(animationListener);
            this.getOutputSizeshNQ4ISI.addUpdateListener(new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation$$ExternalSyntheticLambda0
                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation.this.getHighSpeedVideoSizes = true;
                }
            });
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation4 = this.getOutputSizes;
        if (floatKeyframeAnimation4 != null) {
            floatKeyframeAnimation4.addUpdateListener(animationListener);
            this.getOutputSizes.addUpdateListener(new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation$$ExternalSyntheticLambda1
                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation.this.getHighSpeedVideoSizes = true;
                }
            });
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation5 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (floatKeyframeAnimation5 != null) {
            floatKeyframeAnimation5.addUpdateListener(animationListener);
            this.getValidOutputFormatsForInputhNQ4ISI.addUpdateListener(new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation$$ExternalSyntheticLambda2
                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation.this.getHighSpeedVideoSizes = true;
                }
            });
        }
    }

    public void setProgress(float f) {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation = this.getOutputMinFrameDurationlomOqCM;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation2 = this.accessartificialFrame;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation3 = this.getHighSpeedVideoSizesFor;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> baseKeyframeAnimation4 = this.getHighSpeedVideoFpsRanges;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation5 = this.getOutputStallDurationlomOqCM;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> baseKeyframeAnimation6 = this.toString;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation7 = this.getOutputStallDuration;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation = this.isOutputSupportedForhNQ4ISI;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation2 = this.isOutputSupportedFor;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation3 = this.getOutputSizeshNQ4ISI;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation4 = this.getOutputSizes;
        if (floatKeyframeAnimation4 != null) {
            floatKeyframeAnimation4.setProgress(f);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation5 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (floatKeyframeAnimation5 != null) {
            floatKeyframeAnimation5.setProgress(f);
        }
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Integer> getOpacity() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getStartOpacity() {
        return this.accessartificialFrame;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getEndOpacity() {
        return this.getHighSpeedVideoSizesFor;
    }

    public android.graphics.Matrix getMatrix() {
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation2;
        float floatValue;
        android.graphics.PointF value;
        com.airbnb.lottie.value.ScaleXY value2;
        android.graphics.PointF value3;
        this.getOutputFormats.reset();
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation3 = this.getOutputSizeshNQ4ISI;
        if ((floatKeyframeAnimation3 != null && floatKeyframeAnimation3.getFloatValue() != 0.0f) || (((floatKeyframeAnimation = this.getOutputSizes) != null && floatKeyframeAnimation.getFloatValue() != 0.0f) || ((floatKeyframeAnimation2 = this.getValidOutputFormatsForInputhNQ4ISI) != null && floatKeyframeAnimation2.getFloatValue() != 0.0f))) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation4 = this.getOutputSizeshNQ4ISI;
            float floatValue2 = floatKeyframeAnimation4 != null ? floatKeyframeAnimation4.getFloatValue() : 0.0f;
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation5 = this.getOutputSizes;
            float floatValue3 = floatKeyframeAnimation5 != null ? floatKeyframeAnimation5.getFloatValue() : 0.0f;
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation6 = this.getValidOutputFormatsForInputhNQ4ISI;
            float floatValue4 = floatKeyframeAnimation6 != null ? floatKeyframeAnimation6.getFloatValue() : 0.0f;
            if (this.getHighSpeedVideoSizes || floatValue2 != this.getInputSizeshNQ4ISI || floatValue3 != this.getOutputMinFrameDuration || floatValue4 != this.getInputFormats) {
                this.getInputSizeshNQ4ISI = floatValue2;
                this.getOutputMinFrameDuration = floatValue3;
                this.getInputFormats = floatValue4;
                if (floatValue2 != 0.0f) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (float) java.lang.Math.cos(java.lang.Math.toRadians(floatValue2));
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = 1.0f;
                }
                if (floatValue3 != 0.0f) {
                    this.Camera2StreamConfigurationMap = (float) java.lang.Math.cos(java.lang.Math.toRadians(floatValue3));
                } else {
                    this.Camera2StreamConfigurationMap = 1.0f;
                }
                this.getHighSpeedVideoSizes = false;
            }
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> baseKeyframeAnimation = this.getHighSpeedVideoFpsRanges;
            android.graphics.PointF value4 = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation2 = this.getOutputStallDurationlomOqCM;
            android.graphics.PointF value5 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.getValue();
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> baseKeyframeAnimation3 = this.toString;
            com.airbnb.lottie.value.ScaleXY value6 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue() : null;
            com.airbnb.lottie.utils.Transform3D.applyTransform(this.getOutputFormats, value4, value5, value6 != null ? value6.getScaleX() : 1.0f, value6 != null ? value6.getScaleY() : 1.0f, floatValue2, floatValue3, floatValue4, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            return this.getOutputFormats;
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation4 = this.getOutputStallDurationlomOqCM;
        if (baseKeyframeAnimation4 != null && (value3 = baseKeyframeAnimation4.getValue()) != null && (value3.x != 0.0f || value3.y != 0.0f)) {
            this.getOutputFormats.preTranslate(value3.x, value3.y);
        }
        if (!this.getHighSpeedVideoFpsRangesFor) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation5 = this.getOutputStallDuration;
            if (baseKeyframeAnimation5 != null) {
                if (baseKeyframeAnimation5 instanceof com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation) {
                    floatValue = baseKeyframeAnimation5.getValue().floatValue();
                } else {
                    floatValue = ((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) baseKeyframeAnimation5).getFloatValue();
                }
                if (floatValue != 0.0f) {
                    this.getOutputFormats.preRotate(floatValue);
                }
            }
        } else if (baseKeyframeAnimation4 != null) {
            float progress = baseKeyframeAnimation4.getProgress();
            android.graphics.PointF value7 = baseKeyframeAnimation4.getValue();
            float f = value7.x;
            float f2 = value7.y;
            baseKeyframeAnimation4.setProgress(1.0E-4f + progress);
            android.graphics.PointF value8 = baseKeyframeAnimation4.getValue();
            baseKeyframeAnimation4.setProgress(progress);
            this.getOutputFormats.preRotate((float) java.lang.Math.toDegrees(java.lang.Math.atan2(value8.y - f2, value8.x - f)));
        }
        if (this.isOutputSupportedForhNQ4ISI != null) {
            float cos = this.isOutputSupportedFor == null ? 0.0f : (float) java.lang.Math.cos(java.lang.Math.toRadians((-r4.getFloatValue()) + 90.0f));
            float sin = this.isOutputSupportedFor == null ? 1.0f : (float) java.lang.Math.sin(java.lang.Math.toRadians((-r6.getFloatValue()) + 90.0f));
            float tan = (float) java.lang.Math.tan(java.lang.Math.toRadians(r0.getFloatValue()));
            for (int i = 0; i < 9; i++) {
                this.coroutineBoundary[i] = 0.0f;
            }
            float[] fArr = this.coroutineBoundary;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.unwrapAs.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                this.coroutineBoundary[i2] = 0.0f;
            }
            float[] fArr2 = this.coroutineBoundary;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.CoroutineDebuggingKt.setValues(fArr2);
            for (int i3 = 0; i3 < 9; i3++) {
                this.coroutineBoundary[i3] = 0.0f;
            }
            float[] fArr3 = this.coroutineBoundary;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.coroutineCreation.setValues(fArr3);
            this.CoroutineDebuggingKt.preConcat(this.unwrapAs);
            this.coroutineCreation.preConcat(this.CoroutineDebuggingKt);
            this.getOutputFormats.preConcat(this.coroutineCreation);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> baseKeyframeAnimation6 = this.toString;
        if (baseKeyframeAnimation6 != null && (value2 = baseKeyframeAnimation6.getValue()) != null && (value2.getScaleX() != 1.0f || value2.getScaleY() != 1.0f)) {
            this.getOutputFormats.preScale(value2.getScaleX(), value2.getScaleY());
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> baseKeyframeAnimation7 = this.getHighSpeedVideoFpsRanges;
        if (baseKeyframeAnimation7 != null && (value = baseKeyframeAnimation7.getValue()) != null && (value.x != 0.0f || value.y != 0.0f)) {
            this.getOutputFormats.preTranslate(-value.x, -value.y);
        }
        return this.getOutputFormats;
    }

    public android.graphics.Matrix getMatrixForRepeater(float f) {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation = this.getOutputStallDurationlomOqCM;
        android.graphics.PointF value = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> baseKeyframeAnimation2 = this.toString;
        com.airbnb.lottie.value.ScaleXY value2 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.getValue();
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> baseKeyframeAnimation3 = this.getHighSpeedVideoFpsRanges;
        android.graphics.PointF value3 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue() : null;
        this.getOutputFormats.reset();
        if (value != null) {
            this.getOutputFormats.preTranslate(value.x * f, value.y * f);
        }
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation = this.getOutputSizeshNQ4ISI;
        float floatValue = floatKeyframeAnimation != null ? floatKeyframeAnimation.getFloatValue() * f : 0.0f;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation2 = this.getOutputSizes;
        float floatValue2 = floatKeyframeAnimation2 != null ? floatKeyframeAnimation2.getFloatValue() * f : 0.0f;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation3 = this.getValidOutputFormatsForInputhNQ4ISI;
        float floatValue3 = floatKeyframeAnimation3 != null ? floatKeyframeAnimation3.getFloatValue() * f : 0.0f;
        if (floatValue != 0.0f || floatValue2 != 0.0f || floatValue3 != 0.0f) {
            float cos = floatValue != 0.0f ? (float) java.lang.Math.cos(java.lang.Math.toRadians(floatValue)) : 1.0f;
            float cos2 = floatValue2 != 0.0f ? (float) java.lang.Math.cos(java.lang.Math.toRadians(floatValue2)) : 1.0f;
            if (floatValue3 != 0.0f) {
                this.getOutputFormats.preRotate(floatValue3, value3 == null ? 0.0f : value3.x, value3 != null ? value3.y : 0.0f);
            }
            com.airbnb.lottie.utils.Transform3D.apply3DRotations(this.getOutputFormats, floatValue, floatValue2, 0.0f, cos, cos2);
        } else {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation4 = this.getOutputStallDuration;
            if (baseKeyframeAnimation4 != null) {
                this.getOutputFormats.preRotate(baseKeyframeAnimation4.getValue().floatValue() * f, value3 == null ? 0.0f : value3.x, value3 != null ? value3.y : 0.0f);
            }
        }
        if (value2 != null) {
            double d = f;
            this.getOutputFormats.preScale((float) java.lang.Math.pow(value2.getScaleX(), d), (float) java.lang.Math.pow(value2.getScaleY(), d));
        }
        return this.getOutputFormats;
    }

    public <T> boolean applyValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_ANCHOR_POINT) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> baseKeyframeAnimation = this.getHighSpeedVideoFpsRanges;
            if (baseKeyframeAnimation == null) {
                this.getHighSpeedVideoFpsRanges = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, new android.graphics.PointF());
                return true;
            }
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_POSITION) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation2 = this.getOutputStallDurationlomOqCM;
            if (baseKeyframeAnimation2 == null) {
                this.getOutputStallDurationlomOqCM = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, new android.graphics.PointF());
                return true;
            }
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_POSITION_X) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation3 = this.getOutputStallDurationlomOqCM;
            if (baseKeyframeAnimation3 instanceof com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation) {
                ((com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation3).setXValueCallback(lottieValueCallback);
                return true;
            }
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_POSITION_Y) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> baseKeyframeAnimation4 = this.getOutputStallDurationlomOqCM;
            if (baseKeyframeAnimation4 instanceof com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation) {
                ((com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation4).setYValueCallback(lottieValueCallback);
                return true;
            }
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_SCALE) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.value.ScaleXY, com.airbnb.lottie.value.ScaleXY> baseKeyframeAnimation5 = this.toString;
            if (baseKeyframeAnimation5 == null) {
                this.toString = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, new com.airbnb.lottie.value.ScaleXY());
                return true;
            }
            baseKeyframeAnimation5.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_ROTATION) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation6 = this.getOutputStallDuration;
            if (baseKeyframeAnimation6 == null) {
                this.getOutputStallDuration = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, java.lang.Float.valueOf(0.0f));
                return true;
            }
            baseKeyframeAnimation6.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_OPACITY) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation7 = this.getOutputMinFrameDurationlomOqCM;
            if (baseKeyframeAnimation7 == null) {
                this.getOutputMinFrameDurationlomOqCM = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            baseKeyframeAnimation7.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_START_OPACITY) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation8 = this.accessartificialFrame;
            if (baseKeyframeAnimation8 == null) {
                this.accessartificialFrame = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, java.lang.Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation8.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_END_OPACITY) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation9 = this.getHighSpeedVideoSizesFor;
            if (baseKeyframeAnimation9 == null) {
                this.getHighSpeedVideoSizesFor = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback, java.lang.Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation9.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_SKEW) {
            if (this.isOutputSupportedForhNQ4ISI == null) {
                this.isOutputSupportedForhNQ4ISI = new com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(java.lang.Float.valueOf(0.0f))));
            }
            this.isOutputSupportedForhNQ4ISI.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_SKEW_ANGLE) {
            if (this.isOutputSupportedFor == null) {
                this.isOutputSupportedFor = new com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(java.lang.Float.valueOf(0.0f))));
            }
            this.isOutputSupportedFor.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_ROTATION_X) {
            if (this.getOutputSizeshNQ4ISI == null) {
                this.getOutputSizeshNQ4ISI = new com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(java.lang.Float.valueOf(0.0f))));
            }
            this.getOutputSizeshNQ4ISI.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == com.airbnb.lottie.LottieProperty.TRANSFORM_ROTATION_Y) {
            if (this.getOutputSizes == null) {
                this.getOutputSizes = new com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(java.lang.Float.valueOf(0.0f))));
            }
            this.getOutputSizes.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t != com.airbnb.lottie.LottieProperty.TRANSFORM_ROTATION_Z) {
            return false;
        }
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.getValidOutputFormatsForInputhNQ4ISI = new com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(java.lang.Float.valueOf(0.0f))));
        }
        this.getValidOutputFormatsForInputhNQ4ISI.setValueCallback(lottieValueCallback);
        return true;
    }
}
