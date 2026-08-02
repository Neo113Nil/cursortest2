package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class InnerReticleAnimator {
    final android.animation.ValueAnimator getHighResolutionOutputSizeshNQ4ISI;
    final android.animation.AnimatorSet getHighSpeedVideoFpsRanges;
    final android.animation.ValueAnimator getHighSpeedVideoSizes;
    float Camera2StreamConfigurationMap = 0.0f;
    float getHighSpeedVideoFpsRangesFor = 0.0f;

    InnerReticleAnimator(final com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView innerReticleView) {
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1400L);
        this.getHighResolutionOutputSizeshNQ4ISI = duration;
        duration.setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
        duration.setStartDelay(400L);
        duration.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator.$r8$lambda$1LIHZjyzwIywmkWYr2iyNyNuPBk(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator.this, innerReticleView, valueAnimator);
            }
        });
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(600L);
        this.getHighSpeedVideoSizes = duration2;
        duration2.setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
        duration2.setStartDelay(2000L);
        duration2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator.$r8$lambda$0pfuREYQTIYJNHKTAioa689Deu0(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator.this, innerReticleView, valueAnimator);
            }
        });
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.getHighSpeedVideoFpsRanges = animatorSet;
        animatorSet.playTogether(duration, duration2);
    }

    public void addListener(com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener animationEndListener) {
        this.getHighSpeedVideoFpsRanges.addListener(animationEndListener);
    }

    public static /* synthetic */ void $r8$lambda$0pfuREYQTIYJNHKTAioa689Deu0(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator innerReticleAnimator, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        innerReticleAnimator.getHighSpeedVideoFpsRangesFor = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        view.postInvalidate();
    }

    public static /* synthetic */ void $r8$lambda$1LIHZjyzwIywmkWYr2iyNyNuPBk(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator innerReticleAnimator, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        innerReticleAnimator.Camera2StreamConfigurationMap = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        view.postInvalidate();
    }
}
