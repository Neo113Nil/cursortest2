package com.google.android.material.appbar;

/* loaded from: classes8.dex */
public class AppBarLayout extends android.widget.LinearLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private com.google.android.material.appbar.AppBarLayout.Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;
    private androidx.core.view.WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;
    private android.animation.ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final android.animation.TimeInterpolator liftOnScrollColorInterpolator;
    private android.animation.ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final java.util.List<com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener> liftOnScrollListeners;
    private java.lang.ref.WeakReference<android.view.View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private java.util.List<com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private android.graphics.drawable.Drawable statusBarForeground;
    private java.lang.Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public interface BaseOnOffsetChangedListener<T extends com.google.android.material.appbar.AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, float f);
    }

    public interface LiftOnScrollListener {
        void onUpdate(float f, int i);
    }

    public interface OnOffsetChangedListener extends com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener<com.google.android.material.appbar.AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(com.google.android.material.appbar.AppBarLayout appBarLayout, int i);
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public AppBarLayout(android.content.Context context) {
        this(context, null);
    }

    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.appBarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new java.util.ArrayList();
        android.content.Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == android.view.ViewOutlineProvider.BACKGROUND) {
            com.google.android.material.appbar.ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        }
        com.google.android.material.appbar.ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attributeSet, i, i2);
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.AppBarLayout, i, i2, new int[0]);
        androidx.core.view.ViewCompat.setBackground(this, obtainStyledAttributes.getDrawable(com.google.android.material.R.styleable.AppBarLayout_android_background));
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context2, obtainStyledAttributes, com.google.android.material.R.styleable.AppBarLayout_liftOnScrollColor);
        this.hasLiftOnScrollColor = colorStateList != null;
        android.content.res.ColorStateList colorStateListOrNull = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            if (colorStateList != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawable, colorStateListOrNull, colorStateList);
            } else {
                initializeLiftOnScrollWithElevation(context2, materialShapeDrawable);
            }
        }
        this.liftOnScrollColorDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context2, com.google.android.material.R.attr.motionDurationMedium2, getResources().getInteger(com.google.android.material.R.integer.app_bar_elevation_anim_duration));
        this.liftOnScrollColorInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context2, com.google.android.material.R.attr.motionEasingStandardInterpolator, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.AppBarLayout_expanded)) {
            setExpanded(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.AppBarLayout_expanded, false), false, false);
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.AppBarLayout_elevation)) {
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.AppBarLayout_elevation, 0));
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster)) {
            setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
            setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        this.appBarElevation = getResources().getDimension(com.google.android.material.R.dimen.design_appbar_elevation);
        this.liftOnScroll = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(obtainStyledAttributes.getDrawable(com.google.android.material.R.styleable.AppBarLayout_statusBarForeground));
        obtainStyledAttributes.recycle();
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.google.android.material.appbar.AppBarLayout.this.onWindowInsetChanged(windowInsetsCompat);
            }
        });
    }

    private void initializeLiftOnScrollWithColor(final com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable, final android.content.res.ColorStateList colorStateList, final android.content.res.ColorStateList colorStateList2) {
        final java.lang.Integer colorOrNull = com.google.android.material.color.MaterialColors.getColorOrNull(getContext(), com.google.android.material.R.attr.colorSurface);
        this.liftOnScrollColorUpdateListener = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.appbar.AppBarLayout.this.m10214x91f594d8(colorStateList, colorStateList2, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
        androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
    }

    /* renamed from: lambda$initializeLiftOnScrollWithColor$0$com-google-android-material-appbar-AppBarLayout, reason: not valid java name */
    /* synthetic */ void m10214x91f594d8(android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2, com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable, java.lang.Integer num, android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num2;
        int layer = com.google.android.material.color.MaterialColors.layer(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(layer));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(this.statusBarForeground, layer);
        }
        if (this.liftOnScrollListeners.isEmpty()) {
            return;
        }
        for (com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, layer);
            }
        }
    }

    private void initializeLiftOnScrollWithElevation(android.content.Context context, final com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.appbar.AppBarLayout.this.m10215x84b6053(materialShapeDrawable, valueAnimator);
            }
        };
        androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
    }

    /* renamed from: lambda$initializeLiftOnScrollWithElevation$1$com-google-android-material-appbar-AppBarLayout, reason: not valid java name */
    /* synthetic */ void m10215x84b6053(com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable, android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        android.graphics.drawable.Drawable drawable = this.statusBarForeground;
        if (drawable instanceof com.google.android.material.shape.MaterialShapeDrawable) {
            ((com.google.android.material.shape.MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        java.util.Iterator<com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(floatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    public void addOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new java.util.ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void removeOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        java.util.List<com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    public void removeOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addLiftOnScrollListener(com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public boolean removeLiftOnScrollListener(com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void setStatusBarForeground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.statusBarForeground = drawable != null ? drawable.mutate() : null;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            android.graphics.drawable.Drawable drawable3 = this.statusBarForeground;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(this.statusBarForeground, androidx.core.view.ViewCompat.getLayoutDirection(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new android.graphics.drawable.ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public android.graphics.drawable.Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    private java.lang.Integer extractStatusBarForegroundColor() {
        android.graphics.drawable.Drawable drawable = this.statusBarForeground;
        if (drawable instanceof com.google.android.material.shape.MaterialShapeDrawable) {
            return java.lang.Integer.valueOf(((com.google.android.material.shape.MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        android.content.res.ColorStateList colorStateListOrNull = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return java.lang.Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        android.graphics.drawable.Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && androidx.core.view.ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = androidx.core.math.MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, android.view.View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                androidx.core.view.ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((com.google.android.material.appbar.AppBarLayout.LayoutParams) getChildAt(i5).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i5++;
        }
        android.graphics.drawable.Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z2 = false;
        }
        setLiftableState(z2);
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((com.google.android.material.appbar.AppBarLayout.LayoutParams) getChildAt(i).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void invalidateScrollRanges() {
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = this.behavior;
        com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState saveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(androidx.customview.view.AbsSavedState.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (saveScrollState != null) {
            this.behavior.restoreScrollState(saveScrollState, false);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new java.lang.IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.appbar.AppBarLayout> getBehavior() {
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = new com.google.android.material.appbar.AppBarLayout.Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeBackground() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.MaterialShapeDrawable) {
            return (com.google.android.material.shape.MaterialShapeDrawable) background;
        }
        return null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, androidx.core.view.ViewCompat.isLaidOut(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        setExpanded(z, z2, true);
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
        this.pendingAction = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public com.google.android.material.appbar.AppBarLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            return new com.google.android.material.appbar.AppBarLayout.LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new com.google.android.material.appbar.AppBarLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 1) == 0) {
                    break;
                }
                i2 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
                if (i3 == 0 && androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                    i2 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i2 -= androidx.core.view.ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i3++;
        }
        int max = java.lang.Math.max(0, i2);
        this.totalScrollRange = max;
        return max;
    }

    boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.downPreScrollRange;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(childAt);
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - androidx.core.view.ViewCompat.getMinimumHeight(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                            i = java.lang.Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = java.lang.Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = java.lang.Math.max(0, i3);
        this.downPreScrollRange = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.downScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.topMargin;
                int i5 = layoutParams.bottomMargin;
                int i6 = layoutParams.scrollFlags;
                if ((i6 & 1) == 0) {
                    break;
                }
                i2 += measuredHeight + i4 + i5;
                if ((i6 & 2) != 0) {
                    i2 -= androidx.core.view.ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i3++;
        }
        int max = java.lang.Math.max(0, i2);
        this.downScrollRange = max;
        return max;
    }

    void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
        java.util.List<com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i2);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? androidx.core.view.ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.liftable ? com.google.android.material.R.attr.state_liftable : -com.google.android.material.R.attr.state_liftable;
        iArr[1] = (this.liftable && this.lifted) ? com.google.android.material.R.attr.state_lifted : -com.google.android.material.R.attr.state_lifted;
        iArr[2] = this.liftable ? com.google.android.material.R.attr.state_collapsible : -com.google.android.material.R.attr.state_collapsible;
        iArr[3] = (this.liftable && this.lifted) ? com.google.android.material.R.attr.state_collapsed : -com.google.android.material.R.attr.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public boolean setLiftable(boolean z) {
        this.liftableOverride = true;
        return setLiftableState(z);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.liftableOverride = z;
    }

    private boolean setLiftableState(boolean z) {
        if (this.liftable == z) {
            return false;
        }
        this.liftable = z;
        refreshDrawableState();
        return true;
    }

    public boolean setLifted(boolean z) {
        return setLiftedState(z, true);
    }

    public boolean isLifted() {
        return this.lifted;
    }

    boolean setLiftedState(boolean z) {
        return setLiftedState(z, !this.liftableOverride);
    }

    boolean setLiftedState(boolean z, boolean z2) {
        if (!z2 || this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.hasLiftOnScrollColor) {
            startLiftOnScrollColorAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z ? 0.0f : this.appBarElevation, z ? this.appBarElevation : 0.0f);
        return true;
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof com.google.android.material.shape.MaterialShapeDrawable;
    }

    private void startLiftOnScrollColorAnimation(float f, float f2) {
        android.animation.ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f, f2);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public void setLiftOnScrollTargetView(android.view.View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new java.lang.ref.WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.liftOnScrollTargetViewId = i;
        clearLiftOnScrollTargetView();
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    boolean shouldLift(android.view.View view) {
        android.view.View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    private android.view.View findLiftOnScrollTargetView(android.view.View view) {
        int i;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            android.view.View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof android.view.ViewGroup)) {
                findViewById = ((android.view.ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (findViewById != null) {
                this.liftOnScrollTargetView = new java.lang.ref.WeakReference<>(findViewById);
            }
        }
        java.lang.ref.WeakReference<android.view.View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void clearLiftOnScrollTargetView() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @java.lang.Deprecated
    public void setTargetElevation(float f) {
        com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f);
    }

    int getPendingAction() {
        return this.pendingAction;
    }

    void resetPendingAction() {
        this.pendingAction = 0;
    }

    final int getTopInset() {
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                return true;
            }
        }
        return false;
    }

    androidx.core.view.WindowInsetsCompat onWindowInsetChanged(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = androidx.core.view.ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!androidx.core.util.ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            updateWillNotDraw();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private com.google.android.material.appbar.AppBarLayout.ChildScrollEffect scrollEffect;
        int scrollFlags;
        android.view.animation.Interpolator scrollInterpolator;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface ScrollEffect {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.scrollFlags = 1;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams) {
            super((android.widget.LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }

        public void setScrollFlags(int i) {
            this.scrollFlags = i;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        private com.google.android.material.appbar.AppBarLayout.ChildScrollEffect createScrollEffectFromInt(int i) {
            if (i != 1) {
                return null;
            }
            return new com.google.android.material.appbar.AppBarLayout.CompressChildScrollEffect();
        }

        public com.google.android.material.appbar.AppBarLayout.ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public void setScrollEffect(com.google.android.material.appbar.AppBarLayout.ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollEffect(int i) {
            this.scrollEffect = createScrollEffectFromInt(i);
        }

        public void setScrollInterpolator(android.view.animation.Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public android.view.animation.Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        boolean isCollapsible() {
            int i = this.scrollFlags;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {

        public static abstract class DragCallback extends com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback<com.google.android.material.appbar.AppBarLayout> {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.os.Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, android.view.View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends com.google.android.material.appbar.HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private java.lang.ref.WeakReference<android.view.View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private android.animation.ValueAnimator offsetAnimator;
        private int offsetDelta;
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback onDragCallback;
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState;

        public static abstract class BaseDragCallback<T extends com.google.android.material.appbar.AppBarLayout> {
            public abstract boolean canDrag(T t);
        }

        private static boolean checkFlag(int i, int i2) {
            return (i & i2) == i2;
        }

        public BaseBehavior() {
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, android.view.View view, android.view.View view2, int i, int i2) {
            android.animation.ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        private boolean canScrollChildren(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, android.view.View view) {
            return t.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, android.view.View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = scroll(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.isLiftOnScroll()) {
                t.setLiftedState(t.shouldLift(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = scroll(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, android.view.View view, int i) {
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(coordinatorLayout, t);
                if (t.isLiftOnScroll()) {
                    t.setLiftedState(t.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new java.lang.ref.WeakReference<>(view);
        }

        public void setDragCallback(com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        private void animateOffsetTo(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int height;
            int abs = java.lang.Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float abs2 = java.lang.Math.abs(f);
            if (abs2 > 0.0f) {
                height = java.lang.Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, t, i, height);
        }

        private void animateOffsetWithDuration(final androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i) {
                android.animation.ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            android.animation.ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                android.animation.ValueAnimator valueAnimator3 = new android.animation.ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator4) {
                        com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t, ((java.lang.Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(java.lang.Math.min(i2, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        private int getChildIndexOnOffset(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private void snapToChildIfNeeded(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                android.view.View childAt = t.getChildAt(childIndexOnOffset);
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && androidx.core.view.ViewCompat.getFitsSystemWindows(t) && androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        i2 += androidx.core.view.ViewCompat.getMinimumHeight(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(childAt) + i2;
                        if (topBottomOffsetForScrollingSibling < minimumHeight) {
                            i = minimumHeight;
                        } else {
                            i2 = minimumHeight;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t, androidx.core.math.MathUtils.clamp(calculateSnapOffset(topBottomOffsetForScrollingSibling, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private int calculateSnapOffset(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) t.getLayoutParams()).height == -2) {
                coordinatorLayout.onMeasureChild(t, i, i2, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) t, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) t, i);
            int pendingAction = t.getPendingAction();
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (this.savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t, 0);
            } else {
                android.view.View childAt = t.getChildAt(this.savedState.firstVisibleChildIndex);
                int i3 = -childAt.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    round = androidx.core.view.ViewCompat.getMinimumHeight(childAt) + t.getTopInset();
                } else {
                    round = java.lang.Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown);
                }
                setHeaderTopBottomOffset(coordinatorLayout, t, i3 + round);
            }
            t.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(androidx.core.math.MathUtils.clamp(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            return onLayoutChild;
        }

        private void addAccessibilityDelegateIfNeeded(final androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, final T t) {
            if (androidx.core.view.ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                return;
            }
            androidx.core.view.ViewCompat.setAccessibilityDelegate(coordinatorLayout, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    android.view.View childWithScrollingBehavior;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(android.widget.ScrollView.class.getName());
                    if (t.getTotalScrollRange() == 0 || (childWithScrollingBehavior = com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) == null || !com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.childrenHaveScrollFlags(t)) {
                        return;
                    }
                    if (com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-t.getTotalScrollRange())) {
                        accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                    }
                    if (com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                        if (childWithScrollingBehavior.canScrollVertically(-1)) {
                            if ((-t.getDownNestedPreScrollRange()) != 0) {
                                accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                accessibilityNodeInfoCompat.setScrollable(true);
                                return;
                            }
                            return;
                        }
                        accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
                    if (i == 4096) {
                        t.setExpanded(false);
                        return true;
                    }
                    if (i == 8192) {
                        if (com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                            android.view.View childWithScrollingBehavior = com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                            if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                int i2 = -t.getDownNestedPreScrollRange();
                                if (i2 != 0) {
                                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.onNestedPreScroll(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) t, childWithScrollingBehavior, 0, i2, new int[]{0, 0}, 1);
                                    return true;
                                }
                            } else {
                                t.setExpanded(true);
                                return true;
                            }
                        }
                        return false;
                    }
                    return super.performAccessibilityAction(view, i, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public android.view.View getChildWithScrollingBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if (((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((com.google.android.material.appbar.AppBarLayout.LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t) {
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t);
            }
            java.lang.ref.WeakReference<android.view.View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            android.view.View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t) {
            snapToChildIfNeeded(coordinatorLayout, t);
            if (t.isLiftOnScroll()) {
                t.setLiftedState(t.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(T t) {
            return (-t.getDownNestedScrollRange()) + t.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i4 = 0;
            if (i2 != 0 && topBottomOffsetForScrollingSibling >= i2 && topBottomOffsetForScrollingSibling <= i3) {
                int clamp = androidx.core.math.MathUtils.clamp(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != clamp) {
                    int interpolateOffset = t.hasChildWithInterpolator() ? interpolateOffset(t, clamp) : clamp;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    this.offsetDelta = clamp - interpolateOffset;
                    if (topAndBottomOffset) {
                        while (i4 < t.getChildCount()) {
                            com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) t.getChildAt(i4).getLayoutParams();
                            com.google.android.material.appbar.AppBarLayout.ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t, t.getChildAt(i4), getTopAndBottomOffset());
                            }
                            i4++;
                        }
                    }
                    if (!topAndBottomOffset && t.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t);
                    }
                    t.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t, clamp, clamp < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i4 = topBottomOffsetForScrollingSibling - clamp;
                }
            } else {
                this.offsetDelta = 0;
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            return i4;
        }

        boolean isOffsetAnimatorRunning() {
            android.animation.ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        private int interpolateOffset(T t, int i) {
            int abs = java.lang.Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                android.view.View childAt = t.getChildAt(i3);
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                android.view.animation.Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        i2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            i2 -= androidx.core.view.ViewCompat.getMinimumHeight(childAt);
                        }
                    }
                    if (androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return java.lang.Integer.signum(i) * (childAt.getTop() + java.lang.Math.round(f * scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        private void updateAppBarLayoutDrawableState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            android.view.View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
            boolean z2 = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((com.google.android.material.appbar.AppBarLayout.LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(appBarChildOnOffset);
                    if (i2 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.isLiftOnScroll()) {
                z2 = t.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t.setLiftedState(z2);
            if (z || (liftedState && shouldJumpElevationState(coordinatorLayout, t))) {
                if (t.getBackground() != null) {
                    t.getBackground().jumpToCurrentState();
                }
                if (t.getForeground() != null) {
                    t.getForeground().jumpToCurrentState();
                }
                if (t.getStateListAnimator() != null) {
                    t.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private boolean shouldJumpElevationState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t) {
            java.util.List<android.view.View> dependents = coordinatorLayout.getDependents(t);
            int size = dependents.size();
            for (int i = 0; i < size; i++) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) dependents.get(i).getLayoutParams()).getBehavior();
                if (behavior instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) {
                    return ((com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) behavior).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private static android.view.View getAppBarChildOnOffset(com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
            int abs = java.lang.Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private android.view.View findFirstScrollingChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof androidx.core.view.NestedScrollingChild) || (childAt instanceof android.widget.AbsListView) || (childAt instanceof android.widget.ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t) {
            android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) t);
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState saveScrollState = saveScrollState(onSaveInstanceState, t);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, T t, android.os.Parcelable parcelable) {
            if (parcelable instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState) {
                restoreScrollState((com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) t, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) t, parcelable);
                this.savedState = null;
            }
        }

        com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState saveScrollState(android.os.Parcelable parcelable, T t) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.AbsSavedState.EMPTY_STATE;
                    }
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcelable);
                    savedState.fullyExpanded = topAndBottomOffset == 0;
                    savedState.fullyScrolled = !savedState.fullyExpanded && (-topAndBottomOffset) >= t.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == androidx.core.view.ViewCompat.getMinimumHeight(childAt) + t.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        void restoreScrollState(com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState, boolean z) {
            if (this.savedState == null || z) {
                this.savedState = savedState;
            }
        }

        protected static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                    return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState createFromParcel(android.os.Parcel parcel) {
                    return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState[] newArray(int i) {
                    return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState[i];
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            public SavedState(android.os.Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.HeaderScrollingViewBehavior {
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* bridge */ /* synthetic */ android.view.View findFirstDependency(java.util.List list) {
            return findFirstDependency((java.util.List<android.view.View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            return view2 instanceof com.google.android.material.appbar.AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                androidx.core.view.ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z) {
            com.google.android.material.appbar.AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                android.graphics.Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        private void offsetChildAsNeeded(android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                int i = ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) behavior).offsetDelta;
                androidx.core.view.ViewCompat.offsetTopAndBottom(view, (((bottom - top) + i) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float getOverlapRatioForOffset(android.view.View view) {
            int i;
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static int getAppBarLayoutOffset(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior) {
                return ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        com.google.android.material.appbar.AppBarLayout findFirstDependency(java.util.List<android.view.View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                android.view.View view = list.get(i);
                if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                    return (com.google.android.material.appbar.AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int getScrollRange(android.view.View view) {
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                return ((com.google.android.material.appbar.AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        private void updateLiftedStateIfNeeded(android.view.View view, android.view.View view2) {
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }
    }

    public static class CompressChildScrollEffect extends com.google.android.material.appbar.AppBarLayout.ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final android.graphics.Rect relativeRect = new android.graphics.Rect();
        private final android.graphics.Rect ghostRect = new android.graphics.Rect();

        private static void updateRelativeRect(android.graphics.Rect rect, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, float f) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float abs = this.relativeRect.top - java.lang.Math.abs(f);
            if (abs <= 0.0f) {
                float clamp = 1.0f - androidx.core.math.MathUtils.clamp(java.lang.Math.abs(abs / this.relativeRect.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.relativeRect.height() * 0.3f) * (1.0f - (clamp * clamp)));
                view.setTranslationY(height);
                view.getDrawingRect(this.ghostRect);
                this.ghostRect.offset(0, (int) (-height));
                if (height >= this.ghostRect.height()) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                androidx.core.view.ViewCompat.setClipBounds(view, this.ghostRect);
                return;
            }
            androidx.core.view.ViewCompat.setClipBounds(view, null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
        }
    }
}
