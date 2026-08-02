package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
abstract class IndeterminateAnimatorDelegate<T extends android.animation.Animator> {
    protected final java.util.List<com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator> activeIndicators = new java.util.ArrayList();
    protected com.google.android.material.progressindicator.IndeterminateDrawable drawable;

    abstract void cancelAnimatorImmediately();

    protected float getFractionInRange(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback);

    abstract void requestCancelAnimatorAfterCurrentCycle();

    abstract void resetPropertiesForNewStart();

    abstract void setAnimationFraction(float f);

    abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();

    protected IndeterminateAnimatorDelegate(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.activeIndicators.add(new com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator());
        }
    }

    protected void registerDrawable(com.google.android.material.progressindicator.IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }
}
