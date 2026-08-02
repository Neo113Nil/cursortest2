package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public abstract class BaseLottieAnimator extends android.animation.ValueAnimator {
    private final java.util.Set<android.animation.ValueAnimator.AnimatorUpdateListener> getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<android.animation.Animator.AnimatorListener> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<android.animation.Animator.AnimatorPauseListener> getHighSpeedVideoFpsRanges = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public android.animation.ValueAnimator setDuration(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.getHighSpeedVideoSizes.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.getHighSpeedVideoSizes.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.getHighSpeedVideoSizes.clear();
    }

    @Override // android.animation.Animator
    public void addListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.getHighSpeedVideoFpsRangesFor.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.getHighSpeedVideoFpsRangesFor.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.getHighSpeedVideoFpsRanges.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.getHighSpeedVideoFpsRanges.remove(animatorPauseListener);
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    final void Camera2StreamConfigurationMap(boolean z) {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    void getHighSpeedVideoSizes() {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    final void Camera2StreamConfigurationMap() {
        java.util.Iterator<android.animation.ValueAnimator.AnimatorUpdateListener> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    final void getHighSpeedVideoFpsRangesFor() {
        java.util.Iterator<android.animation.Animator.AnimatorPauseListener> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    final void getHighSpeedVideoFpsRanges() {
        java.util.Iterator<android.animation.Animator.AnimatorPauseListener> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}
