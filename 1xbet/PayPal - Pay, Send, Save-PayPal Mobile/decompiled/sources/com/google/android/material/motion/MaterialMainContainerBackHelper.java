package com.google.android.material.motion;

/* loaded from: classes8.dex */
public class MaterialMainContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private static final float MIN_SCALE = 0.9f;
    private java.lang.Integer expandedCornerSize;
    private android.graphics.Rect initialHideFromClipBounds;
    private android.graphics.Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public android.graphics.Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public android.graphics.Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    public void startBackProgress(androidx.view.BackEventCompat backEventCompat, android.view.View view) {
        super.onStartBackProgress(backEventCompat);
        startBackProgress(backEventCompat.getTouchY(), view);
    }

    public void startBackProgress(float f, android.view.View view) {
        this.initialHideToClipBounds = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            this.initialHideFromClipBounds = com.google.android.material.internal.ViewUtils.calculateOffsetRectFromBounds(this.view, view);
        }
        this.initialTouchY = f;
    }

    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat, android.view.View view, float f) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, backEventCompat.getTouchY(), f);
    }

    public void updateBackProgress(float f, boolean z, float f2, float f3) {
        float interpolateProgress = interpolateProgress(f);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float lerp = com.google.android.material.animation.AnimationUtils.lerp(1.0f, 0.9f, interpolateProgress);
        float lerp2 = com.google.android.material.animation.AnimationUtils.lerp(0.0f, java.lang.Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.minEdgeGap), interpolateProgress);
        int i = z ? 1 : -1;
        float min = java.lang.Math.min(java.lang.Math.max(0.0f, ((height - (lerp * height)) / 2.0f) - this.minEdgeGap), this.maxTranslationY);
        float f4 = f2 - this.initialTouchY;
        float abs = java.lang.Math.abs(f4) / height;
        float signum = java.lang.Math.signum(f4);
        float lerp3 = com.google.android.material.animation.AnimationUtils.lerp(0.0f, min, abs);
        this.view.setScaleX(lerp);
        this.view.setScaleY(lerp);
        this.view.setTranslationX(lerp2 * i);
        this.view.setTranslationY(lerp3 * signum);
        if (this.view instanceof com.google.android.material.internal.ClippableRoundedCornerLayout) {
            ((com.google.android.material.internal.ClippableRoundedCornerLayout) this.view).updateCornerRadius(com.google.android.material.animation.AnimationUtils.lerp(getExpandedCornerSize(), f3, interpolateProgress));
        }
    }

    public void finishBackProgress(long j, android.view.View view) {
        android.animation.AnimatorSet createResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        createResetScaleAndTranslationAnimator.setDuration(j);
        createResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public void cancelBackProgress(android.view.View view) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        android.animation.AnimatorSet createResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        if (this.view instanceof com.google.android.material.internal.ClippableRoundedCornerLayout) {
            createResetScaleAndTranslationAnimator.playTogether(createCornerAnimator((com.google.android.material.internal.ClippableRoundedCornerLayout) this.view));
        }
        createResetScaleAndTranslationAnimator.setDuration(this.cancelDuration);
        createResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    private android.animation.AnimatorSet createResetScaleAndTranslationAnimator(final android.view.View view) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.SCALE_Y, 1.0f), android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f), android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                android.view.View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private android.animation.ValueAnimator createCornerAnimator(final com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), getExpandedCornerSize());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.internal.ClippableRoundedCornerLayout.this.updateCornerRadius(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    public int getExpandedCornerSize() {
        if (this.expandedCornerSize == null) {
            this.expandedCornerSize = java.lang.Integer.valueOf(isAtTopOfScreen() ? getMaxDeviceCornerRadius() : 0);
        }
        return this.expandedCornerSize.intValue();
    }

    private boolean isAtTopOfScreen() {
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private int getMaxDeviceCornerRadius() {
        android.view.WindowInsets rootWindowInsets;
        if (android.os.Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.view.getRootWindowInsets()) == null) {
            return 0;
        }
        return java.lang.Math.max(java.lang.Math.max(getRoundedCornerRadius(rootWindowInsets, 0), getRoundedCornerRadius(rootWindowInsets, 1)), java.lang.Math.max(getRoundedCornerRadius(rootWindowInsets, 3), getRoundedCornerRadius(rootWindowInsets, 2)));
    }

    private int getRoundedCornerRadius(android.view.WindowInsets windowInsets, int i) {
        android.view.RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }
}
