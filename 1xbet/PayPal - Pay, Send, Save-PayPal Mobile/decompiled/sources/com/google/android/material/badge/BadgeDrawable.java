package com.google.android.material.badge;

/* loaded from: classes8.dex */
public class BadgeDrawable extends android.graphics.drawable.Drawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @java.lang.Deprecated
    public static final int BOTTOM_END = 8388693;

    @java.lang.Deprecated
    public static final int BOTTOM_START = 8388691;
    static final java.lang.String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final java.lang.String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";
    private static final int DEFAULT_STYLE = com.google.android.material.R.style.Widget_MaterialComponents_Badge;
    private static final int DEFAULT_THEME_ATTR = com.google.android.material.R.attr.badgeStyle;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final java.lang.String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private java.lang.ref.WeakReference<android.view.View> anchorViewRef;
    private final android.graphics.Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final java.lang.ref.WeakReference<android.content.Context> contextRef;
    private float cornerRadius;
    private java.lang.ref.WeakReference<android.widget.FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private final com.google.android.material.badge.BadgeState state;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BadgeGravity {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    com.google.android.material.badge.BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    static com.google.android.material.badge.BadgeDrawable createFromSavedState(android.content.Context context, com.google.android.material.badge.BadgeState.State state) {
        return new com.google.android.material.badge.BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    public static com.google.android.material.badge.BadgeDrawable create(android.content.Context context) {
        return new com.google.android.material.badge.BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static com.google.android.material.badge.BadgeDrawable createFromResource(android.content.Context context, int i) {
        return new com.google.android.material.badge.BadgeDrawable(context, i, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public void setVisible(boolean z) {
        this.state.setVisible(z);
        onVisibilityUpdated();
    }

    private void onVisibilityUpdated() {
        boolean isVisible = this.state.isVisible();
        setVisible(isVisible, false);
        if (!com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || isVisible) {
            return;
        }
        ((android.view.ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    private void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxBadgeLengthUpdated();
        onBadgeContentUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private BadgeDrawable(android.content.Context context, int i, int i2, int i3, com.google.android.material.badge.BadgeState.State state) {
        int badgeShapeAppearanceResId;
        int badgeShapeAppearanceOverlayResId;
        this.contextRef = new java.lang.ref.WeakReference<>(context);
        com.google.android.material.internal.ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new android.graphics.Rect();
        com.google.android.material.internal.TextDrawableHelper textDrawableHelper = new com.google.android.material.internal.TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(android.graphics.Paint.Align.CENTER);
        com.google.android.material.badge.BadgeState badgeState = new com.google.android.material.badge.BadgeState(context, i, i2, i3, state);
        this.state = badgeState;
        if (hasBadgeContent()) {
            badgeShapeAppearanceResId = badgeState.getBadgeWithTextShapeAppearanceResId();
        } else {
            badgeShapeAppearanceResId = badgeState.getBadgeShapeAppearanceResId();
        }
        if (hasBadgeContent()) {
            badgeShapeAppearanceOverlayResId = badgeState.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            badgeShapeAppearanceOverlayResId = badgeState.getBadgeShapeAppearanceOverlayResId();
        }
        this.shapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel.builder(context, badgeShapeAppearanceResId, badgeShapeAppearanceOverlayResId).build());
        restoreState();
    }

    @java.lang.Deprecated
    public void updateBadgeCoordinates(android.view.View view, android.view.ViewGroup viewGroup) {
        if (!(viewGroup instanceof android.widget.FrameLayout)) {
            throw new java.lang.IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (android.widget.FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(android.view.View view) {
        updateBadgeCoordinates(view, (android.widget.FrameLayout) null);
    }

    public void updateBadgeCoordinates(android.view.View view, android.widget.FrameLayout frameLayout) {
        this.anchorViewRef = new java.lang.ref.WeakReference<>(view);
        if (com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT && frameLayout == null) {
            tryWrapAnchorInCompatParent(view);
        } else {
            this.customBadgeParentRef = new java.lang.ref.WeakReference<>(frameLayout);
        }
        if (!com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
            updateAnchorParentToNotClip(view);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }

    private boolean isAnchorViewWrappedInCompatParent() {
        android.widget.FrameLayout customBadgeParent = getCustomBadgeParent();
        return customBadgeParent != null && customBadgeParent.getId() == com.google.android.material.R.id.mtrl_anchor_parent;
    }

    public android.widget.FrameLayout getCustomBadgeParent() {
        java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void tryWrapAnchorInCompatParent(final android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != com.google.android.material.R.id.mtrl_anchor_parent) {
            java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                final android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
                frameLayout.setId(com.google.android.material.R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.customBadgeParentRef = new java.lang.ref.WeakReference<>(frameLayout);
                frameLayout.post(new java.lang.Runnable() { // from class: com.google.android.material.badge.BadgeDrawable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.google.android.material.badge.BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
                    }
                });
            }
        }
    }

    private static void updateAnchorParentToNotClip(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public void setBackgroundColor(int i) {
        this.state.setBackgroundColor(i);
        onBackgroundColorUpdated();
    }

    private void onBackgroundColorUpdated() {
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != valueOf) {
            this.shapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    public void setBadgeTextColor(int i) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i) {
            this.state.setBadgeTextColor(i);
            onBadgeTextColorUpdated();
        }
    }

    private void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    public java.util.Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    public void setBadgeNumberLocale(java.util.Locale locale) {
        if (locale.equals(this.state.getNumberLocale())) {
            return;
        }
        this.state.setNumberLocale(locale);
        invalidateSelf();
    }

    public boolean hasNumber() {
        return !this.state.hasText() && this.state.hasNumber();
    }

    public int getNumber() {
        if (this.state.hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    public void setNumber(int i) {
        int max = java.lang.Math.max(0, i);
        if (this.state.getNumber() != max) {
            this.state.setNumber(max);
            onNumberUpdated();
        }
    }

    public void clearNumber() {
        if (this.state.hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    private void onNumberUpdated() {
        if (hasText()) {
            return;
        }
        onBadgeContentUpdated();
    }

    public boolean hasText() {
        return this.state.hasText();
    }

    public java.lang.String getText() {
        return this.state.getText();
    }

    public void setText(java.lang.String str) {
        if (android.text.TextUtils.equals(this.state.getText(), str)) {
            return;
        }
        this.state.setText(str);
        onTextUpdated();
    }

    public void clearText() {
        if (this.state.hasText()) {
            this.state.clearText();
            onTextUpdated();
        }
    }

    private void onTextUpdated() {
        onBadgeContentUpdated();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public void setMaxCharacterCount(int i) {
        if (this.state.getMaxCharacterCount() != i) {
            this.state.setMaxCharacterCount(i);
            onMaxBadgeLengthUpdated();
        }
    }

    public int getMaxNumber() {
        return this.state.getMaxNumber();
    }

    public void setMaxNumber(int i) {
        if (this.state.getMaxNumber() != i) {
            this.state.setMaxNumber(i);
            onMaxBadgeLengthUpdated();
        }
    }

    private void onMaxBadgeLengthUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextSizeDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    public void setBadgeGravity(int i) {
        if (this.state.getBadgeGravity() != i) {
            this.state.setBadgeGravity(i);
            onBadgeGravityUpdated();
        }
    }

    private void onBadgeGravityUpdated() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        android.view.View view = this.anchorViewRef.get();
        java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.state.setAlpha(i);
        onAlphaUpdated();
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasBadgeContent()) {
            drawBadgeContent(canvas);
        }
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setContentDescriptionForText(java.lang.CharSequence charSequence) {
        this.state.setContentDescriptionForText(charSequence);
    }

    public void setContentDescriptionNumberless(java.lang.CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(int i) {
        this.state.setContentDescriptionQuantityStringsResource(i);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i);
    }

    public java.lang.CharSequence getContentDescription() {
        if (!isVisible()) {
            return null;
        }
        if (hasText()) {
            return getTextContentDescription();
        }
        if (hasNumber()) {
            return getNumberContentDescription();
        }
        return getEmptyContentDescription();
    }

    private java.lang.String getNumberContentDescription() {
        android.content.Context context;
        if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            return context.getResources().getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), java.lang.Integer.valueOf(getNumber()));
        }
        return context.getString(this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource(), java.lang.Integer.valueOf(this.maxBadgeNumber));
    }

    private java.lang.CharSequence getTextContentDescription() {
        java.lang.CharSequence contentDescriptionForText = this.state.getContentDescriptionForText();
        return contentDescriptionForText != null ? contentDescriptionForText : getText();
    }

    private java.lang.CharSequence getEmptyContentDescription() {
        return this.state.getContentDescriptionNumberless();
    }

    public void setHorizontalPadding(int i) {
        if (i != this.state.getBadgeHorizontalPadding()) {
            this.state.setBadgeHorizontalPadding(i);
            updateCenterAndBounds();
        }
    }

    public int getHorizontalPadding() {
        return this.state.getBadgeHorizontalPadding();
    }

    public void setVerticalPadding(int i) {
        if (i != this.state.getBadgeVerticalPadding()) {
            this.state.setBadgeVerticalPadding(i);
            updateCenterAndBounds();
        }
    }

    public int getVerticalPadding() {
        return this.state.getBadgeVerticalPadding();
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public void setHorizontalOffsetWithoutText(int i) {
        this.state.setHorizontalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public void setHorizontalOffsetWithText(int i) {
        this.state.setHorizontalOffsetWithText(i);
        updateCenterAndBounds();
    }

    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    void setAdditionalHorizontalOffset(int i) {
        this.state.setAdditionalHorizontalOffset(i);
        updateCenterAndBounds();
    }

    int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public void setVerticalOffsetWithoutText(int i) {
        this.state.setVerticalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public void setVerticalOffsetWithText(int i) {
        this.state.setVerticalOffsetWithText(i);
        updateCenterAndBounds();
    }

    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    public void setLargeFontVerticalOffsetAdjustment(int i) {
        this.state.setLargeFontVerticalOffsetAdjustment(i);
        updateCenterAndBounds();
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        return this.state.getLargeFontVerticalOffsetAdjustment();
    }

    void setAdditionalVerticalOffset(int i) {
        this.state.setAdditionalVerticalOffset(i);
        updateCenterAndBounds();
    }

    int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean z) {
        if (this.state.isAutoAdjustedToGrandparentBounds() != z) {
            this.state.setAutoAdjustToGrandparentBounds(z);
            java.lang.ref.WeakReference<android.view.View> weakReference = this.anchorViewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            autoAdjustWithinGrandparentBounds(this.anchorViewRef.get());
        }
    }

    public void setTextAppearance(int i) {
        this.state.setTextAppearanceResId(i);
        onBadgeTextAppearanceUpdated();
    }

    private void onBadgeTextAppearanceUpdated() {
        com.google.android.material.resources.TextAppearance textAppearance;
        android.content.Context context = this.contextRef.get();
        if (context == null || this.textDrawableHelper.getTextAppearance() == (textAppearance = new com.google.android.material.resources.TextAppearance(context, this.state.getTextAppearanceResId()))) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    public void setBadgeWithoutTextShapeAppearance(int i) {
        this.state.setBadgeShapeAppearanceResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int i) {
        this.state.setBadgeShapeAppearanceOverlayResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearance(int i) {
        this.state.setBadgeWithTextShapeAppearanceResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int i) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    private void onBadgeShapeAppearanceUpdated() {
        int badgeShapeAppearanceResId;
        int badgeShapeAppearanceOverlayResId;
        android.content.Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (hasBadgeContent()) {
            badgeShapeAppearanceResId = this.state.getBadgeWithTextShapeAppearanceResId();
        } else {
            badgeShapeAppearanceResId = this.state.getBadgeShapeAppearanceResId();
        }
        if (hasBadgeContent()) {
            badgeShapeAppearanceOverlayResId = this.state.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            badgeShapeAppearanceOverlayResId = this.state.getBadgeShapeAppearanceOverlayResId();
        }
        materialShapeDrawable.setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.builder(context, badgeShapeAppearanceResId, badgeShapeAppearanceOverlayResId).build());
        invalidateSelf();
    }

    private void updateCenterAndBounds() {
        android.content.Context context = this.contextRef.get();
        java.lang.ref.WeakReference<android.view.View> weakReference = this.anchorViewRef;
        android.view.View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.set(this.badgeBounds);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view.getDrawingRect(rect2);
        java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference2 = this.customBadgeParentRef;
        android.widget.FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (android.view.ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(rect2, view);
        com.google.android.material.badge.BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        float f = this.cornerRadius;
        if (f != -1.0f) {
            this.shapeDrawable.setCornerSize(f);
        }
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private int getTotalVerticalOffsetForState() {
        int verticalOffsetWithoutText = this.state.getVerticalOffsetWithoutText();
        if (hasBadgeContent()) {
            verticalOffsetWithoutText = this.state.getVerticalOffsetWithText();
            android.content.Context context = this.contextRef.get();
            if (context != null) {
                verticalOffsetWithoutText = com.google.android.material.animation.AnimationUtils.lerp(verticalOffsetWithoutText, verticalOffsetWithoutText - this.state.getLargeFontVerticalOffsetAdjustment(), com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, com.google.android.material.resources.MaterialResources.getFontScale(context) - 1.0f));
            }
        }
        if (this.state.offsetAlignmentMode == 0) {
            verticalOffsetWithoutText -= java.lang.Math.round(this.halfBadgeHeight);
        }
        return verticalOffsetWithoutText + this.state.getAdditionalVerticalOffset();
    }

    private int getTotalHorizontalOffsetForState() {
        int horizontalOffsetWithoutText;
        if (hasBadgeContent()) {
            horizontalOffsetWithoutText = this.state.getHorizontalOffsetWithText();
        } else {
            horizontalOffsetWithoutText = this.state.getHorizontalOffsetWithoutText();
        }
        if (this.state.offsetAlignmentMode == 1) {
            horizontalOffsetWithoutText += hasBadgeContent() ? this.state.horizontalInsetWithText : this.state.horizontalInset;
        }
        return horizontalOffsetWithoutText + this.state.getAdditionalHorizontalOffset();
    }

    private void calculateCenterAndBounds(android.graphics.Rect rect, android.view.View view) {
        float f;
        float f2;
        float f3 = hasBadgeContent() ? this.state.badgeWithTextRadius : this.state.badgeRadius;
        this.cornerRadius = f3;
        if (f3 != -1.0f) {
            this.halfBadgeWidth = f3;
            this.halfBadgeHeight = f3;
        } else {
            this.halfBadgeWidth = java.lang.Math.round((hasBadgeContent() ? this.state.badgeWithTextWidth : this.state.badgeWidth) / 2.0f);
            this.halfBadgeHeight = java.lang.Math.round((hasBadgeContent() ? this.state.badgeWithTextHeight : this.state.badgeHeight) / 2.0f);
        }
        if (hasBadgeContent()) {
            java.lang.String badgeContent = getBadgeContent();
            this.halfBadgeWidth = java.lang.Math.max(this.halfBadgeWidth, (this.textDrawableHelper.getTextWidth(badgeContent) / 2.0f) + this.state.getBadgeHorizontalPadding());
            float max = java.lang.Math.max(this.halfBadgeHeight, (this.textDrawableHelper.getTextHeight(badgeContent) / 2.0f) + this.state.getBadgeVerticalPadding());
            this.halfBadgeHeight = max;
            this.halfBadgeWidth = java.lang.Math.max(this.halfBadgeWidth, max);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity == 8388691 || badgeGravity == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 == 8388659 || badgeGravity2 == 8388691) {
            if (androidx.core.view.ViewCompat.getLayoutDirection(view) == 0) {
                f = (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
            } else {
                f = (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
            }
            this.badgeCenterX = f;
        } else {
            if (androidx.core.view.ViewCompat.getLayoutDirection(view) == 0) {
                f2 = (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
            } else {
                f2 = (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
            }
            this.badgeCenterX = f2;
        }
        if (this.state.isAutoAdjustedToGrandparentBounds()) {
            autoAdjustWithinGrandparentBounds(view);
        }
    }

    private void autoAdjustWithinGrandparentBounds(android.view.View view) {
        float f;
        float f2;
        android.view.View customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            if (!(view.getParent() instanceof android.view.View)) {
                return;
            }
            float y = view.getY();
            f2 = view.getX();
            customBadgeParent = (android.view.View) view.getParent();
            f = y;
        } else if (!isAnchorViewWrappedInCompatParent()) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            if (!(customBadgeParent.getParent() instanceof android.view.View)) {
                return;
            }
            f = customBadgeParent.getY();
            f2 = customBadgeParent.getX();
            customBadgeParent = (android.view.View) customBadgeParent.getParent();
        }
        float topCutOff = getTopCutOff(customBadgeParent, f);
        float leftCutOff = getLeftCutOff(customBadgeParent, f2);
        float bottomCutOff = getBottomCutOff(customBadgeParent, f);
        float rightCutoff = getRightCutoff(customBadgeParent, f2);
        if (topCutOff < 0.0f) {
            this.badgeCenterY += java.lang.Math.abs(topCutOff);
        }
        if (leftCutOff < 0.0f) {
            this.badgeCenterX += java.lang.Math.abs(leftCutOff);
        }
        if (bottomCutOff > 0.0f) {
            this.badgeCenterY -= java.lang.Math.abs(bottomCutOff);
        }
        if (rightCutoff > 0.0f) {
            this.badgeCenterX -= java.lang.Math.abs(rightCutoff);
        }
    }

    private float getTopCutOff(android.view.View view, float f) {
        return (this.badgeCenterY - this.halfBadgeHeight) + view.getY() + f;
    }

    private float getLeftCutOff(android.view.View view, float f) {
        return (this.badgeCenterX - this.halfBadgeWidth) + view.getX() + f;
    }

    private float getBottomCutOff(android.view.View view, float f) {
        if (!(view.getParent() instanceof android.view.View)) {
            return 0.0f;
        }
        return ((this.badgeCenterY + this.halfBadgeHeight) - (((android.view.View) view.getParent()).getHeight() - view.getY())) + f;
    }

    private float getRightCutoff(android.view.View view, float f) {
        if (!(view.getParent() instanceof android.view.View)) {
            return 0.0f;
        }
        return ((this.badgeCenterX + this.halfBadgeWidth) - (((android.view.View) view.getParent()).getWidth() - view.getX())) + f;
    }

    private void drawBadgeContent(android.graphics.Canvas canvas) {
        java.lang.String badgeContent = getBadgeContent();
        if (badgeContent != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.textDrawableHelper.getTextPaint().getTextBounds(badgeContent, 0, badgeContent.length(), rect);
            float exactCenterY = this.badgeCenterY - rect.exactCenterY();
            canvas.drawText(badgeContent, this.badgeCenterX, rect.bottom <= 0 ? (int) exactCenterY : java.lang.Math.round(exactCenterY), this.textDrawableHelper.getTextPaint());
        }
    }

    private boolean hasBadgeContent() {
        return hasText() || hasNumber();
    }

    private java.lang.String getBadgeContent() {
        if (hasText()) {
            return getTextBadgeText();
        }
        if (hasNumber()) {
            return getNumberBadgeText();
        }
        return null;
    }

    private java.lang.String getTextBadgeText() {
        java.lang.String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        android.content.Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return java.lang.String.format(context.getString(com.google.android.material.R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX);
    }

    private java.lang.String getNumberBadgeText() {
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            return java.text.NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
        }
        android.content.Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return java.lang.String.format(this.state.getNumberLocale(), context.getString(com.google.android.material.R.string.mtrl_exceed_max_badge_number_suffix), java.lang.Integer.valueOf(this.maxBadgeNumber), "+");
    }

    private void onBadgeContentUpdated() {
        this.textDrawableHelper.setTextSizeDirty(true);
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void updateMaxBadgeNumber() {
        if (getMaxCharacterCount() != -2) {
            this.maxBadgeNumber = ((int) java.lang.Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
        } else {
            this.maxBadgeNumber = getMaxNumber();
        }
    }
}
