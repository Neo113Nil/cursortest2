package com.google.android.material.card;

/* loaded from: classes8.dex */
class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final android.graphics.drawable.Drawable CHECKED_ICON_NONE;
    private static final double COS_45 = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));
    public static final int DEFAULT_FADE_ANIM_DURATION = 300;
    private static final int DEFAULT_STROKE_VALUE = -1;
    private final com.google.android.material.shape.MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    private android.graphics.drawable.Drawable checkedIcon;
    private int checkedIconGravity;
    private int checkedIconMargin;
    private int checkedIconSize;
    private android.content.res.ColorStateList checkedIconTint;
    private android.graphics.drawable.LayerDrawable clickableForegroundDrawable;
    private com.google.android.material.shape.MaterialShapeDrawable compatRippleDrawable;
    private android.graphics.drawable.Drawable fgDrawable;
    private final com.google.android.material.shape.MaterialShapeDrawable foregroundContentDrawable;
    private com.google.android.material.shape.MaterialShapeDrawable foregroundShapeDrawable;
    private android.animation.ValueAnimator iconAnimator;
    private final android.animation.TimeInterpolator iconFadeAnimInterpolator;
    private final int iconFadeInAnimDuration;
    private final int iconFadeOutAnimDuration;
    private final com.google.android.material.card.MaterialCardView materialCardView;
    private android.content.res.ColorStateList rippleColor;
    private android.graphics.drawable.Drawable rippleDrawable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.content.res.ColorStateList strokeColor;
    private int strokeWidth;
    private final android.graphics.Rect userContentPadding = new android.graphics.Rect();
    private boolean isBackgroundOverwritten = false;
    private float checkedAnimationProgress = 0.0f;

    static {
        CHECKED_ICON_NONE = android.os.Build.VERSION.SDK_INT <= 28 ? new android.graphics.drawable.ColorDrawable() : null;
    }

    public MaterialCardViewHelper(com.google.android.material.card.MaterialCardView materialCardView, android.util.AttributeSet attributeSet, int i, int i2) {
        this.materialCardView = materialCardView;
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.bgDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        com.google.android.material.shape.ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        android.content.res.TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.CardView, i, com.google.android.material.R.style.CardView);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CardView_cardCornerRadius)) {
            builder.setAllCornerSizes(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.foregroundContentDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        setShapeAppearanceModel(builder.build());
        this.iconFadeAnimInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(materialCardView.getContext(), com.google.android.material.R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        this.iconFadeInAnimDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(materialCardView.getContext(), com.google.android.material.R.attr.motionDurationShort2, 300);
        this.iconFadeOutAnimDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(materialCardView.getContext(), com.google.android.material.R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    void loadFromAttributes(android.content.res.TypedArray typedArray) {
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_strokeColor);
        this.strokeColor = colorStateList;
        if (colorStateList == null) {
            this.strokeColor = android.content.res.ColorStateList.valueOf(-1);
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(com.google.android.material.R.styleable.MaterialCardView_android_checkable, false);
        this.checkable = z;
        this.materialCardView.setLongClickable(z);
        this.checkedIconTint = com.google.android.material.resources.MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_checkedIconTint);
        setCheckedIcon(com.google.android.material.resources.MaterialResources.getDrawable(this.materialCardView.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_checkedIcon));
        setCheckedIconSize(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconSize, 0));
        setCheckedIconMargin(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.checkedIconGravity = typedArray.getInteger(com.google.android.material.R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        android.content.res.ColorStateList colorStateList2 = com.google.android.material.resources.MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_rippleColor);
        this.rippleColor = colorStateList2;
        if (colorStateList2 == null) {
            this.rippleColor = android.content.res.ColorStateList.valueOf(com.google.android.material.color.MaterialColors.getColor(this.materialCardView, com.google.android.material.R.attr.colorControlHighlight));
        }
        setCardForegroundColor(com.google.android.material.resources.MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor));
        updateRippleColor();
        updateElevation();
        updateStroke();
        this.materialCardView.setBackgroundInternal(insetDrawable(this.bgDrawable));
        android.graphics.drawable.Drawable clickableForeground = shouldUseClickableForeground() ? getClickableForeground() : this.foregroundContentDrawable;
        this.fgDrawable = clickableForeground;
        this.materialCardView.setForeground(insetDrawable(clickableForeground));
    }

    boolean isBackgroundOverwritten() {
        return this.isBackgroundOverwritten;
    }

    void setBackgroundOverwritten(boolean z) {
        this.isBackgroundOverwritten = z;
    }

    void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        if (this.strokeColor == colorStateList) {
            return;
        }
        this.strokeColor = colorStateList;
        updateStroke();
    }

    int getStrokeColor() {
        android.content.res.ColorStateList colorStateList = this.strokeColor;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    android.content.res.ColorStateList getStrokeColorStateList() {
        return this.strokeColor;
    }

    void setStrokeWidth(int i) {
        if (i == this.strokeWidth) {
            return;
        }
        this.strokeWidth = i;
        updateStroke();
    }

    int getStrokeWidth() {
        return this.strokeWidth;
    }

    com.google.android.material.shape.MaterialShapeDrawable getBackground() {
        return this.bgDrawable;
    }

    void setCardBackgroundColor(android.content.res.ColorStateList colorStateList) {
        this.bgDrawable.setFillColor(colorStateList);
    }

    android.content.res.ColorStateList getCardBackgroundColor() {
        return this.bgDrawable.getFillColor();
    }

    void setCardForegroundColor(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    android.content.res.ColorStateList getCardForegroundColor() {
        return this.foregroundContentDrawable.getFillColor();
    }

    void setUserContentPadding(int i, int i2, int i3, int i4) {
        this.userContentPadding.set(i, i2, i3, i4);
        updateContentPadding();
    }

    android.graphics.Rect getUserContentPadding() {
        return this.userContentPadding;
    }

    void updateClickable() {
        android.graphics.drawable.Drawable drawable = this.fgDrawable;
        android.graphics.drawable.Drawable clickableForeground = shouldUseClickableForeground() ? getClickableForeground() : this.foregroundContentDrawable;
        this.fgDrawable = clickableForeground;
        if (drawable != clickableForeground) {
            updateInsetForeground(clickableForeground);
        }
    }

    public void animateCheckedIcon(boolean z) {
        int i;
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? 1.0f - this.checkedAnimationProgress : this.checkedAnimationProgress;
        android.animation.ValueAnimator valueAnimator = this.iconAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.iconAnimator = null;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.checkedAnimationProgress, f);
        this.iconAnimator = ofFloat;
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.MaterialCardViewHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.google.android.material.card.MaterialCardViewHelper.this.m10217xa4d79c2b(valueAnimator2);
            }
        });
        this.iconAnimator.setInterpolator(this.iconFadeAnimInterpolator);
        android.animation.ValueAnimator valueAnimator2 = this.iconAnimator;
        if (z) {
            i = this.iconFadeInAnimDuration;
        } else {
            i = this.iconFadeOutAnimDuration;
        }
        valueAnimator2.setDuration((long) (i * f2));
        this.iconAnimator.start();
    }

    /* renamed from: lambda$animateCheckedIcon$0$com-google-android-material-card-MaterialCardViewHelper, reason: not valid java name */
    /* synthetic */ void m10217xa4d79c2b(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.checkedIcon.setAlpha((int) (255.0f * floatValue));
        this.checkedAnimationProgress = floatValue;
    }

    void setCornerRadius(float f) {
        setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(f));
        this.fgDrawable.invalidateSelf();
        if (shouldAddCornerPaddingOutsideCardBackground() || shouldAddCornerPaddingInsideCardBackground()) {
            updateContentPadding();
        }
        if (shouldAddCornerPaddingOutsideCardBackground()) {
            updateInsets();
        }
    }

    float getCornerRadius() {
        return this.bgDrawable.getTopLeftCornerResolvedSize();
    }

    void setProgress(float f) {
        this.bgDrawable.setInterpolation(f);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = this.foregroundShapeDrawable;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    float getProgress() {
        return this.bgDrawable.getInterpolation();
    }

    void updateElevation() {
        this.bgDrawable.setElevation(this.materialCardView.getCardElevation());
    }

    void updateInsets() {
        if (!isBackgroundOverwritten()) {
            this.materialCardView.setBackgroundInternal(insetDrawable(this.bgDrawable));
        }
        this.materialCardView.setForeground(insetDrawable(this.fgDrawable));
    }

    void updateStroke() {
        this.foregroundContentDrawable.setStroke(this.strokeWidth, this.strokeColor);
    }

    void updateContentPadding() {
        int calculateActualCornerPadding = (int) (((shouldAddCornerPaddingInsideCardBackground() || shouldAddCornerPaddingOutsideCardBackground()) ? calculateActualCornerPadding() : 0.0f) - getParentCardViewCalculatedCornerPadding());
        this.materialCardView.setAncestorContentPadding(this.userContentPadding.left + calculateActualCornerPadding, this.userContentPadding.top + calculateActualCornerPadding, this.userContentPadding.right + calculateActualCornerPadding, this.userContentPadding.bottom + calculateActualCornerPadding);
    }

    void setCheckable(boolean z) {
        this.checkable = z;
    }

    boolean isCheckable() {
        return this.checkable;
    }

    void setRippleColor(android.content.res.ColorStateList colorStateList) {
        this.rippleColor = colorStateList;
        updateRippleColor();
    }

    void setCheckedIconTint(android.content.res.ColorStateList colorStateList) {
        this.checkedIconTint = colorStateList;
        android.graphics.drawable.Drawable drawable = this.checkedIcon;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    android.content.res.ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    android.content.res.ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    android.graphics.drawable.Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    void setCheckedIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            this.checkedIcon = mutate;
            androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, this.checkedIconTint);
            setChecked(this.materialCardView.isChecked());
        } else {
            this.checkedIcon = CHECKED_ICON_NONE;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = this.clickableForegroundDrawable;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.material.R.id.mtrl_card_checked_layer_id, this.checkedIcon);
        }
    }

    int getCheckedIconSize() {
        return this.checkedIconSize;
    }

    void setCheckedIconSize(int i) {
        this.checkedIconSize = i;
    }

    int getCheckedIconMargin() {
        return this.checkedIconMargin;
    }

    void setCheckedIconMargin(int i) {
        this.checkedIconMargin = i;
    }

    void recalculateCheckedIconPosition(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.clickableForegroundDrawable != null) {
            if (this.materialCardView.getUseCompatPadding()) {
                i3 = (int) java.lang.Math.ceil(calculateVerticalBackgroundPadding() * 2.0f);
                i4 = (int) java.lang.Math.ceil(calculateHorizontalBackgroundPadding() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (isCheckedIconEnd()) {
                i5 = ((i - this.checkedIconMargin) - this.checkedIconSize) - i4;
            } else {
                i5 = this.checkedIconMargin;
            }
            if (isCheckedIconBottom()) {
                i6 = this.checkedIconMargin;
            } else {
                i6 = ((i2 - this.checkedIconMargin) - this.checkedIconSize) - i3;
            }
            int i11 = i6;
            if (isCheckedIconEnd()) {
                i7 = this.checkedIconMargin;
            } else {
                i7 = ((i - this.checkedIconMargin) - this.checkedIconSize) - i4;
            }
            if (isCheckedIconBottom()) {
                i8 = ((i2 - this.checkedIconMargin) - this.checkedIconSize) - i3;
            } else {
                i8 = this.checkedIconMargin;
            }
            int i12 = i8;
            if (androidx.core.view.ViewCompat.getLayoutDirection(this.materialCardView) != 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.clickableForegroundDrawable.setLayerInset(2, i9, i12, i10, i11);
        }
    }

    void forceRippleRedraw() {
        android.graphics.drawable.Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            android.graphics.Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.rippleDrawable.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.rippleDrawable.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.bgDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        this.bgDrawable.setShadowBitmapDrawingEnable(!r0.isRoundRect());
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = this.foregroundShapeDrawable;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable3 = this.compatRippleDrawable;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    private void updateInsetForeground(android.graphics.drawable.Drawable drawable) {
        if (this.materialCardView.getForeground() instanceof android.graphics.drawable.InsetDrawable) {
            ((android.graphics.drawable.InsetDrawable) this.materialCardView.getForeground()).setDrawable(drawable);
        } else {
            this.materialCardView.setForeground(insetDrawable(drawable));
        }
    }

    private android.graphics.drawable.Drawable insetDrawable(android.graphics.drawable.Drawable drawable) {
        int i;
        int i2;
        if (this.materialCardView.getUseCompatPadding()) {
            i2 = (int) java.lang.Math.ceil(calculateVerticalBackgroundPadding());
            i = (int) java.lang.Math.ceil(calculateHorizontalBackgroundPadding());
        } else {
            i = 0;
            i2 = 0;
        }
        return new android.graphics.drawable.InsetDrawable(drawable, i, i2, i, i2) { // from class: com.google.android.material.card.MaterialCardViewHelper.1
            @Override // android.graphics.drawable.Drawable
            public int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public boolean getPadding(android.graphics.Rect rect) {
                return false;
            }
        };
    }

    private float calculateVerticalBackgroundPadding() {
        return (this.materialCardView.getMaxCardElevation() * 1.5f) + (shouldAddCornerPaddingOutsideCardBackground() ? calculateActualCornerPadding() : 0.0f);
    }

    private float calculateHorizontalBackgroundPadding() {
        return this.materialCardView.getMaxCardElevation() + (shouldAddCornerPaddingOutsideCardBackground() ? calculateActualCornerPadding() : 0.0f);
    }

    private boolean canClipToOutline() {
        return this.bgDrawable.isRoundRect();
    }

    private float getParentCardViewCalculatedCornerPadding() {
        if (this.materialCardView.getPreventCornerOverlap() && this.materialCardView.getUseCompatPadding()) {
            return (float) ((1.0d - COS_45) * this.materialCardView.getCardViewRadius());
        }
        return 0.0f;
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
        return this.materialCardView.getPreventCornerOverlap() && !canClipToOutline();
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
        return this.materialCardView.getPreventCornerOverlap() && canClipToOutline() && this.materialCardView.getUseCompatPadding();
    }

    private float calculateActualCornerPadding() {
        return java.lang.Math.max(java.lang.Math.max(calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getTopLeftCorner(), this.bgDrawable.getTopLeftCornerResolvedSize()), calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getTopRightCorner(), this.bgDrawable.getTopRightCornerResolvedSize())), java.lang.Math.max(calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getBottomRightCorner(), this.bgDrawable.getBottomRightCornerResolvedSize()), calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getBottomLeftCorner(), this.bgDrawable.getBottomLeftCornerResolvedSize())));
    }

    private float calculateCornerPaddingForCornerTreatment(com.google.android.material.shape.CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof com.google.android.material.shape.RoundedCornerTreatment) {
            return (float) ((1.0d - COS_45) * f);
        }
        if (cornerTreatment instanceof com.google.android.material.shape.CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private boolean shouldUseClickableForeground() {
        if (this.materialCardView.isClickable()) {
            return true;
        }
        android.view.View view = this.materialCardView;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof android.view.View)) {
            view = (android.view.View) view.getParent();
        }
        return view.isClickable();
    }

    private android.graphics.drawable.Drawable getClickableForeground() {
        if (this.rippleDrawable == null) {
            this.rippleDrawable = createForegroundRippleDrawable();
        }
        if (this.clickableForegroundDrawable == null) {
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.rippleDrawable, this.foregroundContentDrawable, this.checkedIcon});
            this.clickableForegroundDrawable = layerDrawable;
            layerDrawable.setId(2, com.google.android.material.R.id.mtrl_card_checked_layer_id);
        }
        return this.clickableForegroundDrawable;
    }

    private android.graphics.drawable.Drawable createForegroundRippleDrawable() {
        if (com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE) {
            this.foregroundShapeDrawable = createForegroundShapeDrawable();
            return new android.graphics.drawable.RippleDrawable(this.rippleColor, null, this.foregroundShapeDrawable);
        }
        return createCompatRippleDrawable();
    }

    private android.graphics.drawable.Drawable createCompatRippleDrawable() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        com.google.android.material.shape.MaterialShapeDrawable createForegroundShapeDrawable = createForegroundShapeDrawable();
        this.compatRippleDrawable = createForegroundShapeDrawable;
        createForegroundShapeDrawable.setFillColor(this.rippleColor);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.compatRippleDrawable);
        return stateListDrawable;
    }

    private void updateRippleColor() {
        android.graphics.drawable.Drawable drawable;
        if (com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = this.rippleDrawable) != null) {
            ((android.graphics.drawable.RippleDrawable) drawable).setColor(this.rippleColor);
            return;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.compatRippleDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(this.rippleColor);
        }
    }

    private com.google.android.material.shape.MaterialShapeDrawable createForegroundShapeDrawable() {
        return new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
    }

    public void setChecked(boolean z) {
        setChecked(z, false);
    }

    public void setChecked(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.checkedIcon;
        if (drawable != null) {
            if (z2) {
                animateCheckedIcon(z);
            } else {
                drawable.setAlpha(z ? 255 : 0);
                this.checkedAnimationProgress = z ? 1.0f : 0.0f;
            }
        }
    }

    int getCheckedIconGravity() {
        return this.checkedIconGravity;
    }

    void setCheckedIconGravity(int i) {
        this.checkedIconGravity = i;
        recalculateCheckedIconPosition(this.materialCardView.getMeasuredWidth(), this.materialCardView.getMeasuredHeight());
    }

    private boolean isCheckedIconEnd() {
        return (this.checkedIconGravity & androidx.core.view.GravityCompat.END) == 8388613;
    }

    private boolean isCheckedIconBottom() {
        return (this.checkedIconGravity & 80) == 80;
    }
}
