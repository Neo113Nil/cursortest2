package com.google.android.material.textfield;

/* loaded from: classes8.dex */
class DropdownMenuEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 67;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = true;
    private android.view.accessibility.AccessibilityManager accessibilityManager;
    private final int animationFadeInDuration;
    private final android.animation.TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private android.widget.AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private android.animation.ValueAnimator fadeInAnim;
    private android.animation.ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final android.view.View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isBoxBackgroundModeSupported(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivable() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconCheckable() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean shouldTintIconOnError() {
        return true;
    }

    /* renamed from: lambda$new$0$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10296xd03fedd4(android.view.View view) {
        showHideDropdown();
    }

    /* renamed from: lambda$new$1$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10297xac016995(android.view.View view, boolean z) {
        this.editTextHasFocus = z;
        refreshIconState();
        if (z) {
            return;
        }
        setEndIconChecked(false);
        this.dropdownPopupDirty = false;
    }

    /* renamed from: lambda$new$2$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10298x87c2e556(boolean z) {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView == null || com.google.android.material.textfield.EditTextUtils.isEditable(autoCompleteTextView)) {
            return;
        }
        androidx.core.view.ViewCompat.setImportantForAccessibility(this.endIconView, z ? 2 : 1);
    }

    DropdownMenuEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10296xd03fedd4(view);
            }
        };
        this.onEditTextFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10297xac016995(view, z);
            }
        };
        this.touchExplorationStateChangeListener = new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10298x87c2e556(z);
            }
        };
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
        this.animationFadeInDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionDurationShort3, 67);
        this.animationFadeOutDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionDurationShort3, 50);
        this.animationFadeInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), com.google.android.material.R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
        initAnimators();
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) this.context.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (IS_LOLLIPOP) {
                this.autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.touchExplorationStateChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
        return IS_LOLLIPOP ? com.google.android.material.R.drawable.mtrl_dropdown_arrow : com.google.android.material.R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
        return com.google.android.material.R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconChecked() {
        return this.isEndIconChecked;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivated() {
        return this.editTextHasFocus;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(android.widget.EditText editText) {
        this.autoCompleteTextView = castAutoCompleteTextViewOrThrow(editText);
        setUpDropdownShowHideBehavior();
        this.textInputLayout.setErrorIconDrawable((android.graphics.drawable.Drawable) null);
        if (!com.google.android.material.textfield.EditTextUtils.isEditable(editText) && this.accessibilityManager.isTouchExplorationEnabled()) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this.endIconView, 2);
        }
        this.textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(android.text.Editable editable) {
        if (this.accessibilityManager.isTouchExplorationEnabled() && com.google.android.material.textfield.EditTextUtils.isEditable(this.autoCompleteTextView) && !this.endIconView.hasFocus()) {
            this.autoCompleteTextView.dismissDropDown();
        }
        this.autoCompleteTextView.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10294xae660ff2();
            }
        });
    }

    /* renamed from: lambda$afterEditTextChanged$3$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10294xae660ff2() {
        boolean isPopupShowing = this.autoCompleteTextView.isPopupShowing();
        setEndIconChecked(isPopupShowing);
        this.dropdownPopupDirty = isPopupShowing;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onEditTextFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!com.google.android.material.textfield.EditTextUtils.isEditable(this.autoCompleteTextView)) {
            accessibilityNodeInfoCompat.setClassName(android.widget.Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.accessibilityManager.isEnabled() || com.google.android.material.textfield.EditTextUtils.isEditable(this.autoCompleteTextView)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.isEndIconChecked && !this.autoCompleteTextView.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            showHideDropdown();
            updateDropdownPopupDirty();
        }
    }

    private void showHideDropdown() {
        if (this.autoCompleteTextView == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.dropdownPopupDirty = false;
        }
        if (!this.dropdownPopupDirty) {
            if (IS_LOLLIPOP) {
                setEndIconChecked(!this.isEndIconChecked);
            } else {
                this.isEndIconChecked = !this.isEndIconChecked;
                refreshIconState();
            }
            if (this.isEndIconChecked) {
                this.autoCompleteTextView.requestFocus();
                this.autoCompleteTextView.showDropDown();
                return;
            } else {
                this.autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.dropdownPopupDirty = false;
    }

    private void setUpDropdownShowHideBehavior() {
        this.autoCompleteTextView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10299x5f2e2537(view, motionEvent);
            }
        });
        if (IS_LOLLIPOP) {
            this.autoCompleteTextView.setOnDismissListener(new android.widget.AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10300x3aefa0f8();
                }
            });
        }
        this.autoCompleteTextView.setThreshold(0);
    }

    /* renamed from: lambda$setUpDropdownShowHideBehavior$4$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ boolean m10299x5f2e2537(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (isDropdownPopupActive()) {
                this.dropdownPopupDirty = false;
            }
            showHideDropdown();
            updateDropdownPopupDirty();
        }
        return false;
    }

    /* renamed from: lambda$setUpDropdownShowHideBehavior$5$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10300x3aefa0f8() {
        updateDropdownPopupDirty();
        setEndIconChecked(false);
    }

    private boolean isDropdownPopupActive() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    private static android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow(android.widget.EditText editText) {
        if (!(editText instanceof android.widget.AutoCompleteTextView)) {
            throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (android.widget.AutoCompleteTextView) editText;
    }

    private void updateDropdownPopupDirty() {
        this.dropdownPopupDirty = true;
        this.dropdownPopupActivatedAt = java.lang.System.currentTimeMillis();
    }

    private void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(this.animationFadeInDuration, 0.0f, 1.0f);
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(this.animationFadeOutDuration, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.refreshIconState();
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    private android.animation.ValueAnimator getAlphaAnimator(int i, float... fArr) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.animationFadeInterpolator);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.m10295x6b943a83(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: lambda$getAlphaAnimator$6$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m10295x6b943a83(android.animation.ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
