package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class TextKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<com.airbnb.lottie.model.DocumentData> {
    public TextKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.DocumentData>> list) {
        super(list);
    }

    public void setStringValueCallback(final com.airbnb.lottie.value.LottieValueCallback<java.lang.String> lottieValueCallback) {
        final com.airbnb.lottie.value.LottieFrameInfo lottieFrameInfo = new com.airbnb.lottie.value.LottieFrameInfo();
        final com.airbnb.lottie.model.DocumentData documentData = new com.airbnb.lottie.model.DocumentData();
        super.setValueCallback(new com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.DocumentData>() { // from class: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public /* synthetic */ com.airbnb.lottie.model.DocumentData getValue(com.airbnb.lottie.value.LottieFrameInfo<com.airbnb.lottie.model.DocumentData> lottieFrameInfo2) {
                lottieFrameInfo.set(lottieFrameInfo2.getStartFrame(), lottieFrameInfo2.getEndFrame(), lottieFrameInfo2.getStartValue().text, lottieFrameInfo2.getEndValue().text, lottieFrameInfo2.getLinearKeyframeProgress(), lottieFrameInfo2.getInterpolatedKeyframeProgress(), lottieFrameInfo2.getOverallProgress());
                java.lang.String str = (java.lang.String) lottieValueCallback.getValue(lottieFrameInfo);
                com.airbnb.lottie.model.DocumentData endValue = lottieFrameInfo2.getInterpolatedKeyframeProgress() == 1.0f ? lottieFrameInfo2.getEndValue() : lottieFrameInfo2.getStartValue();
                documentData.set(str, endValue.fontName, endValue.size, endValue.justification, endValue.tracking, endValue.lineHeight, endValue.baselineShift, endValue.color, endValue.strokeColor, endValue.strokeWidth, endValue.strokeOverFill, endValue.boxPosition, endValue.boxSize);
                return documentData;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        if (this.valueCallback != null) {
            return (com.airbnb.lottie.model.DocumentData) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame == null ? Float.MAX_VALUE : keyframe.endFrame.floatValue(), (com.airbnb.lottie.model.DocumentData) keyframe.startValue, keyframe.endValue == 0 ? keyframe.startValue : keyframe.endValue, f, getInterpolatedCurrentKeyframeProgress(), getProgress());
        }
        if (f != 1.0f || keyframe.endValue == 0) {
            return (com.airbnb.lottie.model.DocumentData) keyframe.startValue;
        }
        return (com.airbnb.lottie.model.DocumentData) keyframe.endValue;
    }
}
