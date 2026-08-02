package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class FadeThroughUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas = new float[2];
    private final android.view.View fadeInView;
    private final android.view.View fadeOutView;

    public FadeThroughUpdateListener(android.view.View view, android.view.View view2) {
        this.fadeOutView = view;
        this.fadeInView = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.google.android.material.internal.FadeThroughUtils.calculateFadeOutAndInAlphas(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), this.alphas);
        android.view.View view = this.fadeOutView;
        if (view != null) {
            view.setAlpha(this.alphas[0]);
        }
        android.view.View view2 = this.fadeInView;
        if (view2 != null) {
            view2.setAlpha(this.alphas[1]);
        }
    }
}
