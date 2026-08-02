package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class LottieValueAnimator extends com.airbnb.lottie.utils.BaseLottieAnimator implements android.view.Choreographer.FrameCallback {
    private com.airbnb.lottie.LottieComposition getHighSpeedVideoFpsRanges;
    private float getOutputMinFrameDuration = 1.0f;
    private boolean getHighSpeedVideoSizesFor = false;
    private long getHighSpeedVideoSizes = 0;
    private float Camera2StreamConfigurationMap = 0.0f;
    private float getHighSpeedVideoFpsRangesFor = 0.0f;
    private int getInputFormats = 0;
    private float getInputSizeshNQ4ISI = -2.1474836E9f;
    private float getHighResolutionOutputSizeshNQ4ISI = 2.1474836E9f;
    protected boolean running = false;
    private boolean getOutputFormats = false;

    @Override // android.animation.ValueAnimator
    public java.lang.Object getAnimatedValue() {
        return java.lang.Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.getHighSpeedVideoFpsRangesFor - lottieComposition.getStartFrame()) / (this.getHighSpeedVideoFpsRanges.getEndFrame() - this.getHighSpeedVideoFpsRanges.getStartFrame());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.getHighSpeedVideoFpsRanges == null) {
            return 0.0f;
        }
        if (getSpeed() < 0.0f) {
            minFrame = getMaxFrame() - this.getHighSpeedVideoFpsRangesFor;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.getHighSpeedVideoFpsRangesFor - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.getOutputFormats = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        postFrameCallback();
        if (this.getHighSpeedVideoFpsRanges == null || !isRunning()) {
            return;
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("LottieValueAnimator#doFrame");
        }
        long j2 = this.getHighSpeedVideoSizes;
        long j3 = j2 != 0 ? j - j2 : 0L;
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        float frameRate = j3 / (lottieComposition == null ? Float.MAX_VALUE : (1.0E9f / lottieComposition.getFrameRate()) / java.lang.Math.abs(this.getOutputMinFrameDuration));
        float f = this.Camera2StreamConfigurationMap;
        if (getSpeed() < 0.0f) {
            frameRate = -frameRate;
        }
        float f2 = f + frameRate;
        boolean contains = com.airbnb.lottie.utils.MiscUtils.contains(f2, getMinFrame(), getMaxFrame());
        float f3 = this.Camera2StreamConfigurationMap;
        float clamp = com.airbnb.lottie.utils.MiscUtils.clamp(f2, getMinFrame(), getMaxFrame());
        this.Camera2StreamConfigurationMap = clamp;
        if (this.getOutputFormats) {
            clamp = (float) java.lang.Math.floor(clamp);
        }
        this.getHighSpeedVideoFpsRangesFor = clamp;
        this.getHighSpeedVideoSizes = j;
        if (!contains) {
            if (getRepeatCount() != -1 && this.getInputFormats >= getRepeatCount()) {
                float minFrame = this.getOutputMinFrameDuration < 0.0f ? getMinFrame() : getMaxFrame();
                this.Camera2StreamConfigurationMap = minFrame;
                this.getHighSpeedVideoFpsRangesFor = minFrame;
                removeFrameCallback();
                if (!this.getOutputFormats || this.Camera2StreamConfigurationMap != f3) {
                    Camera2StreamConfigurationMap();
                }
                Camera2StreamConfigurationMap(getSpeed() < 0.0f);
            } else {
                if (getRepeatMode() == 2) {
                    this.getHighSpeedVideoSizesFor = !this.getHighSpeedVideoSizesFor;
                    reverseAnimationSpeed();
                } else {
                    float maxFrame = getSpeed() < 0.0f ? getMaxFrame() : getMinFrame();
                    this.Camera2StreamConfigurationMap = maxFrame;
                    this.getHighSpeedVideoFpsRangesFor = maxFrame;
                }
                this.getHighSpeedVideoSizes = j;
                if (!this.getOutputFormats || this.Camera2StreamConfigurationMap != f3) {
                    Camera2StreamConfigurationMap();
                }
                getHighResolutionOutputSizeshNQ4ISI();
                this.getInputFormats++;
            }
        } else if (!this.getOutputFormats || this.Camera2StreamConfigurationMap != f3) {
            Camera2StreamConfigurationMap();
        }
        if (this.getHighSpeedVideoFpsRanges != null) {
            float f4 = this.getHighSpeedVideoFpsRangesFor;
            float f5 = this.getInputSizeshNQ4ISI;
            if (f4 < f5 || f4 > this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Frame must be [%f,%f]. It is %f", java.lang.Float.valueOf(f5), java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Float.valueOf(f4)));
            }
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("LottieValueAnimator#doFrame");
        }
    }

    public void clearComposition() {
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputSizeshNQ4ISI = -2.1474836E9f;
        this.getHighResolutionOutputSizeshNQ4ISI = 2.1474836E9f;
    }

    public void setComposition(com.airbnb.lottie.LottieComposition lottieComposition) {
        boolean z = this.getHighSpeedVideoFpsRanges == null;
        this.getHighSpeedVideoFpsRanges = lottieComposition;
        if (z) {
            setMinAndMaxFrames(java.lang.Math.max(this.getInputSizeshNQ4ISI, lottieComposition.getStartFrame()), java.lang.Math.min(this.getHighResolutionOutputSizeshNQ4ISI, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.Camera2StreamConfigurationMap = 0.0f;
        setFrame((int) f);
        Camera2StreamConfigurationMap();
    }

    public void setFrame(float f) {
        if (this.Camera2StreamConfigurationMap == f) {
            return;
        }
        float clamp = com.airbnb.lottie.utils.MiscUtils.clamp(f, getMinFrame(), getMaxFrame());
        this.Camera2StreamConfigurationMap = clamp;
        if (this.getOutputFormats) {
            clamp = (float) java.lang.Math.floor(clamp);
        }
        this.getHighSpeedVideoFpsRangesFor = clamp;
        this.getHighSpeedVideoSizes = 0L;
        Camera2StreamConfigurationMap();
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames(i, (int) this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.getInputSizeshNQ4ISI, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f > f2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("minFrame (%s) must be <= maxFrame (%s)", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)));
        }
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        float startFrame = lottieComposition == null ? -3.4028235E38f : lottieComposition.getStartFrame();
        com.airbnb.lottie.LottieComposition lottieComposition2 = this.getHighSpeedVideoFpsRanges;
        float endFrame = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.getEndFrame();
        float clamp = com.airbnb.lottie.utils.MiscUtils.clamp(f, startFrame, endFrame);
        float clamp2 = com.airbnb.lottie.utils.MiscUtils.clamp(f2, startFrame, endFrame);
        if (clamp == this.getInputSizeshNQ4ISI && clamp2 == this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getInputSizeshNQ4ISI = clamp;
        this.getHighResolutionOutputSizeshNQ4ISI = clamp2;
        setFrame((int) com.airbnb.lottie.utils.MiscUtils.clamp(this.getHighSpeedVideoFpsRangesFor, clamp, clamp2));
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setSpeed(float f) {
        this.getOutputMinFrameDuration = f;
    }

    public float getSpeed() {
        return this.getOutputMinFrameDuration;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.getHighSpeedVideoSizesFor) {
            return;
        }
        this.getHighSpeedVideoSizesFor = false;
        reverseAnimationSpeed();
    }

    public void playAnimation() {
        this.running = true;
        getHighResolutionOutputSizeshNQ4ISI(getSpeed() < 0.0f);
        setFrame((int) (getSpeed() < 0.0f ? getMaxFrame() : getMinFrame()));
        this.getHighSpeedVideoSizes = 0L;
        this.getInputFormats = 0;
        postFrameCallback();
    }

    public void endAnimation() {
        removeFrameCallback();
        Camera2StreamConfigurationMap(getSpeed() < 0.0f);
    }

    public void pauseAnimation() {
        removeFrameCallback();
        getHighSpeedVideoFpsRangesFor();
    }

    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.getHighSpeedVideoSizes = 0L;
        if (getSpeed() < 0.0f && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (getSpeed() >= 0.0f && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        getHighSpeedVideoFpsRanges();
    }

    public float getMinFrame() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.getInputSizeshNQ4ISI;
        return f == -2.1474836E9f ? lottieComposition.getStartFrame() : f;
    }

    public float getMaxFrame() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.getHighResolutionOutputSizeshNQ4ISI;
        return f == 2.1474836E9f ? lottieComposition.getEndFrame() : f;
    }

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    final void getHighSpeedVideoSizes() {
        super.getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap(getSpeed() < 0.0f);
    }

    protected void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void removeFrameCallback() {
        removeFrameCallback(true);
    }

    protected void removeFrameCallback(boolean z) {
        android.view.Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        super.getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap(getSpeed() < 0.0f);
        removeFrameCallback();
    }
}
