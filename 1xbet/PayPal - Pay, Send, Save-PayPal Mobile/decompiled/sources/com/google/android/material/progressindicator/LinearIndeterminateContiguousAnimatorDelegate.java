package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = new android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate, java.lang.Float>(java.lang.Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.2
        @Override // android.util.Property
        public java.lang.Float get(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return java.lang.Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, java.lang.Float f) {
            linearIndeterminateContiguousAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };
    private static final int DURATION_PER_CYCLE_IN_MS = 333;
    private static final int TOTAL_DURATION_IN_MS = 667;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private boolean dirtyColors;
    private androidx.interpolator.view.animation.FastOutSlowInInterpolator interpolator;
    private int newIndicatorColorIndex;

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void registerAnimatorsCompleteCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void requestCancelAnimatorAfterCurrentCycle() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void unregisterAnimatorsCompleteCallback() {
    }

    public LinearIndeterminateContiguousAnimatorDelegate(com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.newIndicatorColorIndex = 1;
        this.baseSpec = linearProgressIndicatorSpec;
        this.interpolator = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration(333L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animator) {
                    super.onAnimationRepeat(animator);
                    com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex = (linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex + 1) % com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void cancelAnimatorImmediately() {
        android.animation.ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    private void updateSegmentPositions(int i) {
        this.activeIndicators.get(0).startFraction = 0.0f;
        float fractionInRange = getFractionInRange(i, 0, TOTAL_DURATION_IN_MS);
        com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(0);
        com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator2 = this.activeIndicators.get(1);
        float interpolation = this.interpolator.getInterpolation(fractionInRange);
        activeIndicator2.startFraction = interpolation;
        activeIndicator.endFraction = interpolation;
        com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator3 = this.activeIndicators.get(1);
        com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator4 = this.activeIndicators.get(2);
        float interpolation2 = this.interpolator.getInterpolation(fractionInRange + 0.49925038f);
        activeIndicator4.startFraction = interpolation2;
        activeIndicator3.endFraction = interpolation2;
        this.activeIndicators.get(2).endFraction = 1.0f;
    }

    private void maybeUpdateSegmentColors() {
        if (!this.dirtyColors || this.activeIndicators.get(1).endFraction >= 1.0f) {
            return;
        }
        this.activeIndicators.get(2).color = this.activeIndicators.get(1).color;
        this.activeIndicators.get(1).color = this.activeIndicators.get(0).color;
        this.activeIndicators.get(0).color = this.baseSpec.indicatorColors[this.newIndicatorColorIndex];
        this.dirtyColors = false;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    final void resetPropertiesForNewStart() {
        this.dirtyColors = true;
        this.newIndicatorColorIndex = 1;
        for (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator : this.activeIndicators) {
            activeIndicator.color = this.baseSpec.indicatorColors[0];
            activeIndicator.gapSize = this.baseSpec.indicatorTrackGapSize / 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    final void setAnimationFraction(float f) {
        this.animationFraction = f;
        updateSegmentPositions((int) (f * 333.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }
}
