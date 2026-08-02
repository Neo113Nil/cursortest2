package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public class TooltipManager {
    private boolean Camera2StreamConfigurationMap;
    private android.animation.AnimatorSet getHighResolutionOutputSizeshNQ4ISI;
    private android.animation.AnimatorSet getHighSpeedVideoFpsRangesFor;
    private final android.os.CountDownTimer getHighSpeedVideoSizes;
    private final android.view.View getHighSpeedVideoSizesFor;
    private final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.lang.Runnable getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.TooltipManager.5
        @Override // java.lang.Runnable
        public void run() {
            com.microblink.blinkid.fragment.overlay.TooltipManager.this.Camera2StreamConfigurationMap = true;
            com.microblink.blinkid.fragment.overlay.TooltipManager.this.showTooltip();
        }
    };

    public TooltipManager(android.view.View view, long j) {
        this.getHighSpeedVideoSizesFor = view;
        this.getHighSpeedVideoSizes = new android.os.CountDownTimer(j, j) { // from class: com.microblink.blinkid.fragment.overlay.TooltipManager.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighSpeedVideoFpsRanges.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.TooltipManager.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.microblink.blinkid.fragment.overlay.TooltipManager.this.hideTooltip();
                    }
                });
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
            }
        };
    }

    public void cancelDelayedTooltip() {
        this.getHighSpeedVideoFpsRanges.removeCallbacks(this.getInputSizeshNQ4ISI);
    }

    public void hideTooltip() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            android.animation.AnimatorSet highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(true);
            highSpeedVideoFpsRangesFor.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.microblink.blinkid.fragment.overlay.TooltipManager.4
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighSpeedVideoSizesFor.setVisibility(4);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                }
            });
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
        }
        this.getHighSpeedVideoFpsRanges.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.TooltipManager.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighSpeedVideoSizesFor.getVisibility() != 4) {
                    com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighSpeedVideoFpsRangesFor.start();
                }
            }
        });
    }

    public void showTooltip() {
        this.getHighSpeedVideoSizes.cancel();
        this.getHighSpeedVideoSizes.start();
        cancelDelayedTooltip();
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(false);
        }
        this.getHighSpeedVideoFpsRanges.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.TooltipManager.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighSpeedVideoSizesFor.getVisibility() != 0) {
                    com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighSpeedVideoSizesFor.setVisibility(0);
                    com.microblink.blinkid.fragment.overlay.TooltipManager.this.getHighResolutionOutputSizeshNQ4ISI.start();
                }
            }
        });
    }

    public void showTooltipDelayed(long j, boolean z) {
        if (z && this.Camera2StreamConfigurationMap) {
            return;
        }
        cancelDelayedTooltip();
        this.getHighSpeedVideoFpsRanges.postDelayed(this.getInputSizeshNQ4ISI, j);
    }

    private android.animation.AnimatorSet getHighSpeedVideoFpsRangesFor(boolean z) {
        int measuredWidth = this.getHighSpeedVideoSizesFor.getMeasuredWidth();
        float dimension = (measuredWidth / 2.0f) - ((int) this.getHighSpeedVideoSizesFor.getContext().getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_reticle_overlay_onboarding_tooltip_margin_end));
        float measuredHeight = this.getHighSpeedVideoSizesFor.getMeasuredHeight() / 2.0f;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.2f);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(1.0f);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(0.0f);
        return !z ? Camera2StreamConfigurationMap(new android.util.Pair(valueOf, valueOf2), new android.util.Pair(java.lang.Float.valueOf(dimension), valueOf3), new android.util.Pair(java.lang.Float.valueOf(measuredHeight), valueOf3), new android.util.Pair(valueOf3, valueOf2)) : Camera2StreamConfigurationMap(new android.util.Pair(valueOf2, valueOf), new android.util.Pair(valueOf3, java.lang.Float.valueOf(dimension)), new android.util.Pair(valueOf3, java.lang.Float.valueOf(measuredHeight)), new android.util.Pair(valueOf2, valueOf3));
    }

    private android.animation.AnimatorSet Camera2StreamConfigurationMap(android.util.Pair pair, android.util.Pair pair2, android.util.Pair pair3, android.util.Pair pair4) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.getHighSpeedVideoSizesFor, "scaleX", ((java.lang.Float) pair.first).floatValue(), ((java.lang.Float) pair.second).floatValue());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.getHighSpeedVideoSizesFor, "scaleY", ((java.lang.Float) pair.first).floatValue(), ((java.lang.Float) pair.second).floatValue());
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.getHighSpeedVideoSizesFor, "translationX", ((java.lang.Float) pair2.first).floatValue(), ((java.lang.Float) pair2.second).floatValue());
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.getHighSpeedVideoSizesFor, "translationY", ((java.lang.Float) pair3.first).floatValue(), ((java.lang.Float) pair3.second).floatValue());
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this.getHighSpeedVideoSizesFor, "alpha", ((java.lang.Float) pair4.first).floatValue(), ((java.lang.Float) pair4.second).floatValue());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.setDuration(200L);
        return animatorSet;
    }
}
