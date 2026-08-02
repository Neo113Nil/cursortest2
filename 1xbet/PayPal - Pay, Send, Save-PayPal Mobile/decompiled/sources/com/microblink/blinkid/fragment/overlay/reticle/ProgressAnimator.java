package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class ProgressAnimator {
    final android.animation.AnimatorSet Camera2StreamConfigurationMap;
    float getHighSpeedVideoFpsRanges = 0.0f;
    float getHighResolutionOutputSizeshNQ4ISI = 0.0f;
    int getHighSpeedVideoSizes = 0;

    ProgressAnimator(final com.microblink.blinkid.fragment.overlay.reticle.ProgressView progressView) {
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(600L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator.m10894$r8$lambda$_zxHK9RQazvLwvEL_1lRroSi50(com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator.this, progressView, valueAnimator);
            }
        });
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(600L);
        duration2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator.$r8$lambda$r0NdstXOekChVepvbpfbUBpsMY4(com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator.this, progressView, valueAnimator);
            }
        });
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.Camera2StreamConfigurationMap = animatorSet;
        animatorSet.playTogether(duration2, duration);
    }

    public void addListener(com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener animationEndListener) {
        this.Camera2StreamConfigurationMap.addListener(animationEndListener);
    }

    /* renamed from: $r8$lambda$_zxHK9RQazvLwvEL-_1lRroSi50, reason: not valid java name */
    public static /* synthetic */ void m10894$r8$lambda$_zxHK9RQazvLwvEL_1lRroSi50(com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator progressAnimator, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        progressAnimator.getHighSpeedVideoFpsRanges = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        view.postInvalidate();
    }

    public static /* synthetic */ void $r8$lambda$r0NdstXOekChVepvbpfbUBpsMY4(com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator progressAnimator, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        if (progressAnimator.getHighResolutionOutputSizeshNQ4ISI != 1.0f) {
            progressAnimator.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            view.postInvalidate();
        }
    }
}
