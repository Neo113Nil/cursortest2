package com.github.mikephil.charting.animation;

/* loaded from: classes8.dex */
public class ChartAnimator {
    private android.animation.ValueAnimator.AnimatorUpdateListener Camera2StreamConfigurationMap;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator() {
    }

    public ChartAnimator(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Camera2StreamConfigurationMap = animatorUpdateListener;
    }

    public void animateX(int i) {
        animateX(i, com.github.mikephil.charting.animation.Easing.Linear);
    }

    public void animateXY(int i, int i2) {
        com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction = com.github.mikephil.charting.animation.Easing.Linear;
        animateXY(i, i2, easingFunction, easingFunction);
    }

    public void animateY(int i) {
        animateY(i, com.github.mikephil.charting.animation.Easing.Linear);
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPhaseY(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        this.mPhaseY = f;
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPhaseX(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        this.mPhaseX = f;
    }

    public void animateX(int i, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(this.Camera2StreamConfigurationMap);
        ofFloat.start();
    }

    public void animateXY(int i, int i2, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration(i);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat2.setInterpolator(easingFunction);
        ofFloat2.setDuration(i2);
        if (i > i2) {
            ofFloat.addUpdateListener(this.Camera2StreamConfigurationMap);
        } else {
            ofFloat2.addUpdateListener(this.Camera2StreamConfigurationMap);
        }
        ofFloat.start();
        ofFloat2.start();
    }

    public void animateXY(int i, int i2, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction2) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration(i);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat2.setInterpolator(easingFunction2);
        ofFloat2.setDuration(i2);
        if (i > i2) {
            ofFloat.addUpdateListener(this.Camera2StreamConfigurationMap);
        } else {
            ofFloat2.addUpdateListener(this.Camera2StreamConfigurationMap);
        }
        ofFloat.start();
        ofFloat2.start();
    }

    public void animateY(int i, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(this.Camera2StreamConfigurationMap);
        ofFloat.start();
    }
}
