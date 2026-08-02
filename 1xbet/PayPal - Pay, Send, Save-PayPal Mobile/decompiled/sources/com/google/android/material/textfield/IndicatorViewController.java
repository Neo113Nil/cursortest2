package com.google.android.material.textfield;

/* loaded from: classes8.dex */
final class IndicatorViewController {
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    static final int COUNTER_INDEX = 2;
    private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
    private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;
    private android.animation.Animator captionAnimator;
    private android.widget.FrameLayout captionArea;
    private int captionDisplayed;
    private final int captionFadeInAnimationDuration;
    private final android.animation.TimeInterpolator captionFadeInAnimationInterpolator;
    private final int captionFadeOutAnimationDuration;
    private final android.animation.TimeInterpolator captionFadeOutAnimationInterpolator;
    private int captionToShow;
    private final int captionTranslationYAnimationDuration;
    private final android.animation.TimeInterpolator captionTranslationYAnimationInterpolator;
    private final float captionTranslationYPx;
    private final android.content.Context context;
    private boolean errorEnabled;
    private java.lang.CharSequence errorText;
    private int errorTextAppearance;
    private android.widget.TextView errorView;
    private int errorViewAccessibilityLiveRegion;
    private java.lang.CharSequence errorViewContentDescription;
    private android.content.res.ColorStateList errorViewTextColor;
    private java.lang.CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private android.widget.TextView helperTextView;
    private android.content.res.ColorStateList helperTextViewTextColor;
    private android.widget.LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final com.google.android.material.textfield.TextInputLayout textInputView;
    private android.graphics.Typeface typeface;

    final boolean isCaptionView(int i) {
        return i == 0 || i == 1;
    }

    public IndicatorViewController(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        android.content.Context context = textInputLayout.getContext();
        this.context = context;
        this.textInputView = textInputLayout;
        this.captionTranslationYPx = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_textinput_caption_translate_y);
        this.captionTranslationYAnimationDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationShort4, 217);
        this.captionFadeInAnimationDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationMedium4, 167);
        this.captionFadeOutAnimationDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationShort4, 167);
        this.captionTranslationYAnimationInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.captionFadeInAnimationInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        this.captionFadeOutAnimationInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, com.google.android.material.R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
    }

    final void showHelper(java.lang.CharSequence charSequence) {
        cancelCaptionAnimator();
        this.helperText = charSequence;
        this.helperTextView.setText(charSequence);
        int i = this.captionDisplayed;
        if (i != 2) {
            this.captionToShow = 2;
        }
        updateCaptionViewsVisibility(i, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, charSequence));
    }

    final void hideHelperText() {
        cancelCaptionAnimator();
        int i = this.captionDisplayed;
        if (i == 2) {
            this.captionToShow = 0;
        }
        updateCaptionViewsVisibility(i, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, ""));
    }

    final void showError(java.lang.CharSequence charSequence) {
        cancelCaptionAnimator();
        this.errorText = charSequence;
        this.errorView.setText(charSequence);
        int i = this.captionDisplayed;
        if (i != 1) {
            this.captionToShow = 1;
        }
        updateCaptionViewsVisibility(i, this.captionToShow, shouldAnimateCaptionView(this.errorView, charSequence));
    }

    final void hideError() {
        this.errorText = null;
        cancelCaptionAnimator();
        if (this.captionDisplayed == 1) {
            if (this.helperTextEnabled && !android.text.TextUtils.isEmpty(this.helperText)) {
                this.captionToShow = 2;
            } else {
                this.captionToShow = 0;
            }
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, ""));
    }

    private boolean shouldAnimateCaptionView(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (androidx.core.view.ViewCompat.isLaidOut(this.textInputView) && this.textInputView.isEnabled()) {
            return (this.captionToShow == this.captionDisplayed && textView != null && android.text.TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void updateCaptionViewsVisibility(final int i, final int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.captionAnimator = animatorSet;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            createCaptionAnimators(arrayList, this.helperTextEnabled, this.helperTextView, 2, i, i2);
            createCaptionAnimators(arrayList, this.errorEnabled, this.errorView, 1, i, i2);
            com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
            final android.widget.TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i);
            final android.widget.TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i2);
            animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.google.android.material.textfield.IndicatorViewController.this.captionDisplayed = i2;
                    com.google.android.material.textfield.IndicatorViewController.this.captionAnimator = null;
                    android.widget.TextView textView = captionViewFromDisplayState;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i == 1 && com.google.android.material.textfield.IndicatorViewController.this.errorView != null) {
                            com.google.android.material.textfield.IndicatorViewController.this.errorView.setText((java.lang.CharSequence) null);
                        }
                    }
                    android.widget.TextView textView2 = captionViewFromDisplayState2;
                    if (textView2 != null) {
                        textView2.setTranslationY(0.0f);
                        captionViewFromDisplayState2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    android.widget.TextView textView = captionViewFromDisplayState2;
                    if (textView != null) {
                        textView.setVisibility(0);
                        captionViewFromDisplayState2.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else {
            setCaptionViewVisibilities(i, i2);
        }
        this.textInputView.updateEditTextBackground();
        this.textInputView.updateLabelState(z);
        this.textInputView.updateTextInputBoxState();
    }

    private void setCaptionViewVisibilities(int i, int i2) {
        android.widget.TextView captionViewFromDisplayState;
        android.widget.TextView captionViewFromDisplayState2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i2)) != null) {
            captionViewFromDisplayState2.setVisibility(0);
            captionViewFromDisplayState2.setAlpha(1.0f);
        }
        if (i != 0 && (captionViewFromDisplayState = getCaptionViewFromDisplayState(i)) != null) {
            captionViewFromDisplayState.setVisibility(4);
            if (i == 1) {
                captionViewFromDisplayState.setText((java.lang.CharSequence) null);
            }
        }
        this.captionDisplayed = i2;
    }

    private void createCaptionAnimators(java.util.List<android.animation.Animator> list, boolean z, android.widget.TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            android.animation.ObjectAnimator createCaptionOpacityAnimator = createCaptionOpacityAnimator(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                createCaptionOpacityAnimator.setStartDelay(this.captionFadeOutAnimationDuration);
            }
            list.add(createCaptionOpacityAnimator);
            if (i3 != i || i2 == 0) {
                return;
            }
            android.animation.ObjectAnimator createCaptionTranslationYAnimator = createCaptionTranslationYAnimator(textView);
            createCaptionTranslationYAnimator.setStartDelay(this.captionFadeOutAnimationDuration);
            list.add(createCaptionTranslationYAnimator);
        }
    }

    private android.animation.ObjectAnimator createCaptionOpacityAnimator(android.widget.TextView textView, boolean z) {
        int i;
        android.animation.TimeInterpolator timeInterpolator;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, z ? 1.0f : 0.0f);
        if (z) {
            i = this.captionFadeInAnimationDuration;
        } else {
            i = this.captionFadeOutAnimationDuration;
        }
        ofFloat.setDuration(i);
        if (z) {
            timeInterpolator = this.captionFadeInAnimationInterpolator;
        } else {
            timeInterpolator = this.captionFadeOutAnimationInterpolator;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    private android.animation.ObjectAnimator createCaptionTranslationYAnimator(android.widget.TextView textView) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.captionTranslationYPx, 0.0f);
        ofFloat.setDuration(this.captionTranslationYAnimationDuration);
        ofFloat.setInterpolator(this.captionTranslationYAnimationInterpolator);
        return ofFloat;
    }

    final void cancelCaptionAnimator() {
        android.animation.Animator animator = this.captionAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    private android.widget.TextView getCaptionViewFromDisplayState(int i) {
        if (i == 1) {
            return this.errorView;
        }
        if (i != 2) {
            return null;
        }
        return this.helperTextView;
    }

    final void adjustIndicatorPadding() {
        if (canAdjustIndicatorPadding()) {
            android.widget.EditText editText = this.textInputView.getEditText();
            boolean isFontScaleAtLeast1_3 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(this.context);
            androidx.core.view.ViewCompat.setPaddingRelative(this.indicatorArea, getIndicatorPadding(isFontScaleAtLeast1_3, com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_horizontal, androidx.core.view.ViewCompat.getPaddingStart(editText)), getIndicatorPadding(isFontScaleAtLeast1_3, com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_top, this.context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_helper_text_default_padding_top)), getIndicatorPadding(isFontScaleAtLeast1_3, com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_horizontal, androidx.core.view.ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    private boolean canAdjustIndicatorPadding() {
        return (this.indicatorArea == null || this.textInputView.getEditText() == null) ? false : true;
    }

    private int getIndicatorPadding(boolean z, int i, int i2) {
        return z ? this.context.getResources().getDimensionPixelSize(i) : i2;
    }

    final void addIndicator(android.widget.TextView textView, int i) {
        if (this.indicatorArea == null && this.captionArea == null) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.context);
            this.indicatorArea = linearLayout;
            linearLayout.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new android.widget.FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.textInputView.getEditText() != null) {
                adjustIndicatorPadding();
            }
        }
        if (isCaptionView(i)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(textView);
        } else {
            this.indicatorArea.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded++;
    }

    final void removeIndicator(android.widget.TextView textView, int i) {
        android.widget.FrameLayout frameLayout;
        if (this.indicatorArea == null) {
            return;
        }
        if (isCaptionView(i) && (frameLayout = this.captionArea) != null) {
            frameLayout.removeView(textView);
        } else {
            this.indicatorArea.removeView(textView);
        }
        int i2 = this.indicatorsAdded - 1;
        this.indicatorsAdded = i2;
        setViewGroupGoneIfEmpty(this.indicatorArea, i2);
    }

    private void setViewGroupGoneIfEmpty(android.view.ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    final void setErrorEnabled(boolean z) {
        if (this.errorEnabled == z) {
            return;
        }
        cancelCaptionAnimator();
        if (z) {
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(this.context);
            this.errorView = appCompatTextView;
            appCompatTextView.setId(com.google.android.material.R.id.textinput_error);
            this.errorView.setTextAlignment(5);
            android.graphics.Typeface typeface = this.typeface;
            if (typeface != null) {
                this.errorView.setTypeface(typeface);
            }
            setErrorTextAppearance(this.errorTextAppearance);
            setErrorViewTextColor(this.errorViewTextColor);
            setErrorContentDescription(this.errorViewContentDescription);
            setErrorAccessibilityLiveRegion(this.errorViewAccessibilityLiveRegion);
            this.errorView.setVisibility(4);
            addIndicator(this.errorView, 0);
        } else {
            hideError();
            removeIndicator(this.errorView, 0);
            this.errorView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }
        this.errorEnabled = z;
    }

    final boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    final boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    final void setHelperTextEnabled(boolean z) {
        if (this.helperTextEnabled == z) {
            return;
        }
        cancelCaptionAnimator();
        if (z) {
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(this.context);
            this.helperTextView = appCompatTextView;
            appCompatTextView.setId(com.google.android.material.R.id.textinput_helper_text);
            this.helperTextView.setTextAlignment(5);
            android.graphics.Typeface typeface = this.typeface;
            if (typeface != null) {
                this.helperTextView.setTypeface(typeface);
            }
            this.helperTextView.setVisibility(4);
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
            setHelperTextAppearance(this.helperTextTextAppearance);
            setHelperTextViewTextColor(this.helperTextViewTextColor);
            addIndicator(this.helperTextView, 1);
            this.helperTextView.setAccessibilityDelegate(new android.view.View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    android.widget.EditText editText = com.google.android.material.textfield.IndicatorViewController.this.textInputView.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            hideHelperText();
            removeIndicator(this.helperTextView, 1);
            this.helperTextView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }
        this.helperTextEnabled = z;
    }

    final android.view.View getHelperTextView() {
        return this.helperTextView;
    }

    final boolean errorIsDisplayed() {
        return isCaptionStateError(this.captionDisplayed);
    }

    final boolean errorShouldBeShown() {
        return isCaptionStateError(this.captionToShow);
    }

    private boolean isCaptionStateError(int i) {
        return (i != 1 || this.errorView == null || android.text.TextUtils.isEmpty(this.errorText)) ? false : true;
    }

    final boolean helperTextIsDisplayed() {
        return isCaptionStateHelperText(this.captionDisplayed);
    }

    final boolean helperTextShouldBeShown() {
        return isCaptionStateHelperText(this.captionToShow);
    }

    private boolean isCaptionStateHelperText(int i) {
        return (i != 2 || this.helperTextView == null || android.text.TextUtils.isEmpty(this.helperText)) ? false : true;
    }

    final java.lang.CharSequence getErrorText() {
        return this.errorText;
    }

    final java.lang.CharSequence getHelperText() {
        return this.helperText;
    }

    final void setTypefaces(android.graphics.Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            setTextViewTypeface(this.errorView, typeface);
            setTextViewTypeface(this.helperTextView, typeface);
        }
    }

    private void setTextViewTypeface(android.widget.TextView textView, android.graphics.Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    final int getErrorViewCurrentTextColor() {
        android.widget.TextView textView = this.errorView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    final android.content.res.ColorStateList getErrorViewTextColors() {
        android.widget.TextView textView = this.errorView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    final void setErrorViewTextColor(android.content.res.ColorStateList colorStateList) {
        this.errorViewTextColor = colorStateList;
        android.widget.TextView textView = this.errorView;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    final void setErrorTextAppearance(int i) {
        this.errorTextAppearance = i;
        android.widget.TextView textView = this.errorView;
        if (textView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    final void setErrorContentDescription(java.lang.CharSequence charSequence) {
        this.errorViewContentDescription = charSequence;
        android.widget.TextView textView = this.errorView;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    final void setErrorAccessibilityLiveRegion(int i) {
        this.errorViewAccessibilityLiveRegion = i;
        android.widget.TextView textView = this.errorView;
        if (textView != null) {
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(textView, i);
        }
    }

    final java.lang.CharSequence getErrorContentDescription() {
        return this.errorViewContentDescription;
    }

    final int getErrorAccessibilityLiveRegion() {
        return this.errorViewAccessibilityLiveRegion;
    }

    final int getHelperTextViewCurrentTextColor() {
        android.widget.TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    final android.content.res.ColorStateList getHelperTextViewColors() {
        android.widget.TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    final void setHelperTextViewTextColor(android.content.res.ColorStateList colorStateList) {
        this.helperTextViewTextColor = colorStateList;
        android.widget.TextView textView = this.helperTextView;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    final void setHelperTextAppearance(int i) {
        this.helperTextTextAppearance = i;
        android.widget.TextView textView = this.helperTextView;
        if (textView != null) {
            androidx.core.widget.TextViewCompat.setTextAppearance(textView, i);
        }
    }
}
