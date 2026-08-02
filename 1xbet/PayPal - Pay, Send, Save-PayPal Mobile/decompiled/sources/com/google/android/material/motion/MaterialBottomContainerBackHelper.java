package com.google.android.material.motion;

/* loaded from: classes8.dex */
public class MaterialBottomContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.maxScaleXDistance = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.maxScaleYDistance = resources.getDimension(com.google.android.material.R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress());
    }

    public void updateBackProgress(float f) {
        float interpolateProgress = interpolateProgress(f);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.maxScaleXDistance / width;
        float f3 = this.maxScaleYDistance / height;
        float lerp = 1.0f - com.google.android.material.animation.AnimationUtils.lerp(0.0f, f2, interpolateProgress);
        float lerp2 = 1.0f - com.google.android.material.animation.AnimationUtils.lerp(0.0f, f3, interpolateProgress);
        this.view.setScaleX(lerp);
        this.view.setPivotY(height);
        this.view.setScaleY(lerp2);
        if (this.view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(lerp2 != 0.0f ? lerp / lerp2 : 1.0f);
            }
        }
    }

    public void finishBackProgressPersistent(androidx.view.BackEventCompat backEventCompat, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.Animator createResetScaleAnimator = createResetScaleAnimator();
        createResetScaleAnimator.setDuration(com.google.android.material.animation.AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        if (animatorListener != null) {
            createResetScaleAnimator.addListener(animatorListener);
        }
        createResetScaleAnimator.start();
    }

    public void finishBackProgressNotPersistent(androidx.view.BackEventCompat backEventCompat, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.TRANSLATION_Y, this.view.getHeight() * this.view.getScaleY());
        ofFloat.setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
        ofFloat.setDuration(com.google.android.material.animation.AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.motion.MaterialBottomContainerBackHelper.this.view.setTranslationY(0.0f);
                com.google.android.material.motion.MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
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
        android.animation.Animator createResetScaleAnimator = createResetScaleAnimator();
        createResetScaleAnimator.setDuration(this.cancelDuration);
        createResetScaleAnimator.start();
    }

    private android.animation.Animator createResetScaleAnimator() {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<V, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
        if (this.view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
        return animatorSet;
    }
}
