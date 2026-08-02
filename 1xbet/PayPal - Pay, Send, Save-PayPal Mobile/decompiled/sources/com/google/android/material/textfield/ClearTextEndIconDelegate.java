package com.google.android.material.textfield;

/* loaded from: classes8.dex */
class ClearTextEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private static final int DEFAULT_ANIMATION_FADE_DURATION = 100;
    private static final int DEFAULT_ANIMATION_SCALE_DURATION = 150;
    private final int animationFadeDuration;
    private final android.animation.TimeInterpolator animationFadeInterpolator;
    private final int animationScaleDuration;
    private final android.animation.TimeInterpolator animationScaleInterpolator;
    private android.widget.EditText editText;
    private android.animation.AnimatorSet iconInAnim;
    private android.animation.ValueAnimator iconOutAnim;
    private final android.view.View.OnFocusChangeListener onFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;

    /* renamed from: lambda$new$0$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10291xfc81bd94(android.view.View view) {
        android.widget.EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        android.text.Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        refreshIconState();
    }

    /* renamed from: lambda$new$1$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10292x7ae2c173(android.view.View view, boolean z) {
        animateIcon(shouldBeVisible());
    }

    ClearTextEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.m10291xfc81bd94(view);
            }
        };
        this.onFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.m10292x7ae2c173(view, z);
            }
        };
        this.animationFadeDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionDurationShort3, 100);
        this.animationScaleDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionDurationShort3, 150);
        this.animationFadeInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        this.animationScaleInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
        initAnimators();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            editText.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.material.textfield.ClearTextEndIconDelegate.this.m10293x26d8c5f4();
                }
            });
        }
    }

    /* renamed from: lambda$tearDown$2$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10293x26d8c5f4() {
        animateIcon(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
        return com.google.android.material.R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
        return com.google.android.material.R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onSuffixVisibilityChanged(boolean z) {
        if (this.endLayout.getSuffixText() == null) {
            return;
        }
        animateIcon(z);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(android.widget.EditText editText) {
        this.editText = editText;
        this.textInputLayout.setEndIconVisible(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void afterEditTextChanged(android.text.Editable editable) {
        if (this.endLayout.getSuffixText() != null) {
            return;
        }
        animateIcon(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    private void animateIcon(boolean z) {
        boolean z2 = this.endLayout.isEndIconVisible() == z;
        if (z && !this.iconInAnim.isRunning()) {
            this.iconOutAnim.cancel();
            this.iconInAnim.start();
            if (z2) {
                this.iconInAnim.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.iconInAnim.cancel();
        this.iconOutAnim.start();
        if (z2) {
            this.iconOutAnim.end();
        }
    }

    private void initAnimators() {
        android.animation.ValueAnimator scaleAnimator = getScaleAnimator();
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(scaleAnimator, alphaAnimator);
        this.iconInAnim.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(true);
            }
        });
        android.animation.ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.iconOutAnim = alphaAnimator2;
        alphaAnimator2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(false);
            }
        });
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... fArr) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.animationFadeInterpolator);
        ofFloat.setDuration(this.animationFadeDuration);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.m10289xa5c23ba8(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: lambda$getAlphaAnimator$3$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10289xa5c23ba8(android.animation.ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private android.animation.ValueAnimator getScaleAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.animationScaleInterpolator);
        ofFloat.setDuration(this.animationScaleDuration);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.m10290x3819711b(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: lambda$getScaleAnimator$4$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10290x3819711b(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setScaleX(floatValue);
        this.endIconView.setScaleY(floatValue);
    }

    private boolean shouldBeVisible() {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            return (editText.hasFocus() || this.endIconView.hasFocus()) && this.editText.getText().length() > 0;
        }
        return false;
    }
}
