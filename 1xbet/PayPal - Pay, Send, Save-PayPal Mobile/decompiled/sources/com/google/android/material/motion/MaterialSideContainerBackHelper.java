package com.google.android.material.motion;

/* loaded from: classes8.dex */
public class MaterialSideContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat, int i) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i);
    }

    public void updateBackProgress(float f, boolean z, int i) {
        int i2;
        float interpolateProgress = interpolateProgress(f);
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i, 3);
        boolean z2 = z == checkAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 > 0.0f) {
                float f4 = this.maxScaleXDistanceShrink / f2;
                float f5 = this.maxScaleXDistanceGrow / f2;
                float f6 = this.maxScaleYDistance / f3;
                V v = this.view;
                if (checkAbsoluteGravity) {
                    f2 = 0.0f;
                }
                v.setPivotX(f2);
                if (!z2) {
                    f5 = -f4;
                }
                float lerp = com.google.android.material.animation.AnimationUtils.lerp(0.0f, f5, interpolateProgress);
                float f7 = lerp + 1.0f;
                this.view.setScaleX(f7);
                float lerp2 = 1.0f - com.google.android.material.animation.AnimationUtils.lerp(0.0f, f6, interpolateProgress);
                this.view.setScaleY(lerp2);
                if (this.view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.view;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        android.view.View childAt = viewGroup.getChildAt(i3);
                        if (checkAbsoluteGravity) {
                            i2 = (width - childAt.getRight()) + childAt.getWidth();
                        } else {
                            i2 = -childAt.getLeft();
                        }
                        childAt.setPivotX(i2);
                        childAt.setPivotY(-childAt.getTop());
                        float f8 = z2 ? 1.0f - lerp : 1.0f;
                        float f9 = lerp2 != 0.0f ? (f7 / lerp2) * f8 : 1.0f;
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }

    public void finishBackProgress(androidx.view.BackEventCompat backEventCompat, final int i, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z = backEventCompat.getSwipeEdge() == 0;
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i, 3);
        float width = (this.view.getWidth() * this.view.getScaleX()) + getEdgeMargin(checkAbsoluteGravity);
        V v = this.view;
        android.util.Property property = android.view.View.TRANSLATION_X;
        if (checkAbsoluteGravity) {
            width = -width;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(v, (android.util.Property<V, java.lang.Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
        ofFloat.setDuration(com.google.android.material.animation.AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.motion.MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                com.google.android.material.motion.MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z, i);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
        if (this.view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    private boolean checkAbsoluteGravity(int i, int i2) {
        return (androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this.view)) & i2) == i2;
    }

    private int getEdgeMargin(boolean z) {
        android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }
}
