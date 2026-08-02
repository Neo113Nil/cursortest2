package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<K> getOutputMinFrameDuration;
    protected com.airbnb.lottie.value.LottieValueCallback<A> valueCallback;
    final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(1);
    private boolean getHighSpeedVideoSizes = false;
    protected float progress = 0.0f;
    private A Camera2StreamConfigurationMap = null;
    private float getHighSpeedVideoFpsRangesFor = -1.0f;
    private float getHighSpeedVideoFpsRanges = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    interface KeyframesWrapper<T> {
        float getHighResolutionOutputSizeshNQ4ISI();

        boolean getHighSpeedVideoFpsRanges();

        boolean getHighSpeedVideoFpsRanges(float f);

        float getHighSpeedVideoFpsRangesFor();

        boolean getHighSpeedVideoFpsRangesFor(float f);

        com.airbnb.lottie.value.Keyframe<T> getHighSpeedVideoSizes();
    }

    abstract A getValue(com.airbnb.lottie.value.Keyframe<K> keyframe, float f);

    protected boolean skipCache() {
        return false;
    }

    BaseKeyframeAnimation(java.util.List<? extends com.airbnb.lottie.value.Keyframe<K>> list) {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper keyframesWrapperImpl;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper keyframesWrapper;
        byte b = 0;
        if (list.isEmpty()) {
            keyframesWrapper = new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.EmptyKeyframeWrapper(b);
        } else {
            if (list.size() == 1) {
                keyframesWrapperImpl = new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.SingleKeyframeWrapper(list);
            } else {
                keyframesWrapperImpl = new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapperImpl(list);
            }
            keyframesWrapper = keyframesWrapperImpl;
        }
        this.getOutputMinFrameDuration = keyframesWrapper;
    }

    public void setIsDiscrete() {
        this.getHighSpeedVideoSizes = true;
    }

    public void addUpdateListener(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(animationListener);
    }

    public void setProgress(float f) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("BaseKeyframeAnimation#setProgress");
        }
        if (this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges()) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor == -1.0f) {
            this.getHighSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor();
        }
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.getHighSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor();
            }
            f = this.getHighSpeedVideoFpsRangesFor;
        } else if (f > Camera2StreamConfigurationMap()) {
            f = Camera2StreamConfigurationMap();
        }
        if (f == this.progress) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.progress = f;
            if (this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(f)) {
                notifyListeners();
            }
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void notifyListeners() {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.get(i).onValueChanged();
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("BaseKeyframeAnimation#notifyListeners");
        }
    }

    protected com.airbnb.lottie.value.Keyframe<K> getCurrentKeyframe() {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        com.airbnb.lottie.value.Keyframe<K> highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes();
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return highSpeedVideoSizes;
    }

    final float getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizes) {
            return 0.0f;
        }
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    protected float getInterpolatedCurrentKeyframeProgress() {
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe == null || currentKeyframe.isStatic() || currentKeyframe.interpolator == null) {
            return 0.0f;
        }
        return currentKeyframe.interpolator.getInterpolation(getHighSpeedVideoSizes());
    }

    float Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoFpsRanges == -1.0f) {
            this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI();
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public A getValue() {
        A value;
        float highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (this.valueCallback == null && this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(highSpeedVideoSizes) && !skipCache()) {
            return this.Camera2StreamConfigurationMap;
        }
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.xInterpolator != null && currentKeyframe.yInterpolator != null) {
            value = getValue(currentKeyframe, highSpeedVideoSizes, currentKeyframe.xInterpolator.getInterpolation(highSpeedVideoSizes), currentKeyframe.yInterpolator.getInterpolation(highSpeedVideoSizes));
        } else {
            value = getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress());
        }
        this.Camera2StreamConfigurationMap = value;
        return value;
    }

    public float getProgress() {
        return this.progress;
    }

    public void setValueCallback(com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback) {
        com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public boolean hasValueCallback() {
        return this.valueCallback != null;
    }

    protected A getValue(com.airbnb.lottie.value.Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new java.lang.UnsupportedOperationException("This animation does not support split dimensions!");
    }

    static final class EmptyKeyframeWrapper<T> implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float getHighResolutionOutputSizeshNQ4ISI() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRanges() {
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float getHighSpeedVideoFpsRangesFor() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRangesFor(float f) {
            return false;
        }

        private EmptyKeyframeWrapper() {
        }

        /* synthetic */ EmptyKeyframeWrapper(byte b) {
            this();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final com.airbnb.lottie.value.Keyframe<T> getHighSpeedVideoSizes() {
            throw new java.lang.IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRanges(float f) {
            throw new java.lang.IllegalStateException("not implemented");
        }
    }

    static final class SingleKeyframeWrapper<T> implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> {
        private final com.airbnb.lottie.value.Keyframe<T> getHighResolutionOutputSizeshNQ4ISI;
        private float getHighSpeedVideoFpsRangesFor = -1.0f;

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRanges() {
            return false;
        }

        SingleKeyframeWrapper(java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list) {
            this.getHighResolutionOutputSizeshNQ4ISI = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRangesFor(float f) {
            return !this.getHighResolutionOutputSizeshNQ4ISI.isStatic();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final com.airbnb.lottie.value.Keyframe<T> getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRanges(float f) {
            if (this.getHighSpeedVideoFpsRangesFor == f) {
                return true;
            }
            this.getHighSpeedVideoFpsRangesFor = f;
            return false;
        }
    }

    static final class KeyframesWrapperImpl<T> implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> {
        private final java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> getHighSpeedVideoFpsRangesFor;
        private com.airbnb.lottie.value.Keyframe<T> Camera2StreamConfigurationMap = null;
        private float getHighResolutionOutputSizeshNQ4ISI = -1.0f;
        private com.airbnb.lottie.value.Keyframe<T> getHighSpeedVideoSizes = Camera2StreamConfigurationMap(0.0f);

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRanges() {
            return false;
        }

        KeyframesWrapperImpl(java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list) {
            this.getHighSpeedVideoFpsRangesFor = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRangesFor(float f) {
            if (this.getHighSpeedVideoSizes.containsProgress(f)) {
                return !this.getHighSpeedVideoSizes.isStatic();
            }
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap(f);
            return true;
        }

        private com.airbnb.lottie.value.Keyframe<T> Camera2StreamConfigurationMap(float f) {
            com.airbnb.lottie.value.Keyframe<T> keyframe = this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = this.getHighSpeedVideoFpsRangesFor.size() - 2; size > 0; size--) {
                com.airbnb.lottie.value.Keyframe<T> keyframe2 = this.getHighSpeedVideoFpsRangesFor.get(size);
                if (this.getHighSpeedVideoSizes != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
            }
            return this.getHighSpeedVideoFpsRangesFor.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final com.airbnb.lottie.value.Keyframe<T> getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor.get(0).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean getHighSpeedVideoFpsRanges(float f) {
            com.airbnb.lottie.value.Keyframe<T> keyframe = this.Camera2StreamConfigurationMap;
            com.airbnb.lottie.value.Keyframe<T> keyframe2 = this.getHighSpeedVideoSizes;
            if (keyframe == keyframe2 && this.getHighResolutionOutputSizeshNQ4ISI == f) {
                return true;
            }
            this.Camera2StreamConfigurationMap = keyframe2;
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            return false;
        }
    }
}
