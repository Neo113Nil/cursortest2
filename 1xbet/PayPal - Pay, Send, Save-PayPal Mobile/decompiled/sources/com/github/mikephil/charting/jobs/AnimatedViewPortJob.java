package com.github.mikephil.charting.jobs;

/* loaded from: classes8.dex */
public abstract class AnimatedViewPortJob extends com.github.mikephil.charting.jobs.ViewPortJob implements android.animation.ValueAnimator.AnimatorUpdateListener, android.animation.Animator.AnimatorListener {
    protected android.animation.ObjectAnimator animator;
    protected float phase;
    protected float xOrigin;
    protected float yOrigin;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }

    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    }

    public abstract void recycleSelf();

    public AnimatedViewPortJob(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, com.github.mikephil.charting.utils.Transformer transformer, android.view.View view, float f3, float f4, long j) {
        super(viewPortHandler, f, f2, transformer, view);
        this.xOrigin = f3;
        this.yOrigin = f4;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, 0.0f, 1.0f);
        this.animator = ofFloat;
        ofFloat.setDuration(j);
        this.animator.addUpdateListener(this);
        this.animator.addListener(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.animator.start();
    }

    public float getPhase() {
        return this.phase;
    }

    public void setPhase(float f) {
        this.phase = f;
    }

    public float getXOrigin() {
        return this.xOrigin;
    }

    public float getYOrigin() {
        return this.yOrigin;
    }

    protected void resetAnimator() {
        this.animator.removeAllListeners();
        this.animator.removeAllUpdateListeners();
        this.animator.reverse();
        this.animator.addUpdateListener(this);
        this.animator.addListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        try {
            recycleSelf();
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        try {
            recycleSelf();
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }
}
