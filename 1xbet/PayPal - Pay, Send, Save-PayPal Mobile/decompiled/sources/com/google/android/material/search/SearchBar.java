package com.google.android.material.search;

/* loaded from: classes8.dex */
public class SearchBar extends androidx.appcompat.widget.Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Material3_SearchBar;
    private static final java.lang.String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private com.google.android.material.shape.MaterialShapeDrawable backgroundShape;
    private android.view.View centerView;
    private final boolean defaultMarginsEnabled;
    private final android.graphics.drawable.Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    private java.lang.Integer navigationIconTint;
    private android.graphics.drawable.Drawable originalNavigationIconBackground;
    private final com.google.android.material.search.SearchBarAnimationHelper searchBarAnimationHelper;
    private final android.widget.TextView textView;
    private final boolean tintNavigationIcon;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    private int defaultIfZero(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence charSequence) {
    }

    /* renamed from: lambda$new$0$com-google-android-material-search-SearchBar, reason: not valid java name */
    /* synthetic */ void m10269lambda$new$0$comgoogleandroidmaterialsearchSearchBar(boolean z) {
        setFocusableInTouchMode(z);
    }

    public SearchBar(android.content.Context context) {
        this(context, null);
    }

    public SearchBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialSearchBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, r6), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.menuResId = -1;
        this.touchExplorationStateChangeListener = new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                com.google.android.material.search.SearchBar.this.m10269lambda$new$0$comgoogleandroidmaterialsearchSearchBar(z);
            }
        };
        android.content.Context context2 = getContext();
        validateAttributes(attributeSet);
        this.defaultNavigationIcon = androidx.appcompat.content.res.AppCompatResources.getDrawable(context2, getDefaultNavigationIconResource());
        this.searchBarAnimationHelper = new com.google.android.material.search.SearchBarAnimationHelper();
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.SearchBar, i, i2, new int[0]);
        com.google.android.material.shape.ShapeAppearanceModel build = com.google.android.material.shape.ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        int color = obtainStyledAttributes.getColor(com.google.android.material.R.styleable.SearchBar_backgroundTint, 0);
        float dimension = obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.SearchBar_elevation, 0.0f);
        this.defaultMarginsEnabled = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.defaultScrollFlagsEnabled = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchBar_hideNavigationIcon, false);
        this.forceDefaultNavigationOnClickListener = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.tintNavigationIcon = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchBar_tintNavigationIcon, true);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SearchBar_navigationIconTint)) {
            this.navigationIconTint = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(com.google.android.material.R.styleable.SearchBar_navigationIconTint, -1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.SearchBar_android_textAppearance, -1);
        java.lang.String string = obtainStyledAttributes.getString(com.google.android.material.R.styleable.SearchBar_android_text);
        java.lang.String string2 = obtainStyledAttributes.getString(com.google.android.material.R.styleable.SearchBar_android_hint);
        float dimension2 = obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = obtainStyledAttributes.getColor(com.google.android.material.R.styleable.SearchBar_strokeColor, 0);
        obtainStyledAttributes.recycle();
        if (!z) {
            initNavigationIcon();
        }
        setClickable(true);
        setFocusable(true);
        android.view.LayoutInflater.from(context2).inflate(com.google.android.material.R.layout.mtrl_search_bar, this);
        this.layoutInflated = true;
        this.textView = (android.widget.TextView) findViewById(com.google.android.material.R.id.open_search_bar_text_view);
        androidx.core.view.ViewCompat.setElevation(this, dimension);
        initTextView(resourceId, string, string2);
        initBackground(build, color, dimension, dimension2, color2);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setupTouchExplorationStateChangeListener();
    }

    private void setupTouchExplorationStateChangeListener() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view) {
                    androidx.core.view.accessibility.AccessibilityManagerCompat.addTouchExplorationStateChangeListener(com.google.android.material.search.SearchBar.this.accessibilityManager, com.google.android.material.search.SearchBar.this.touchExplorationStateChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view) {
                    androidx.core.view.accessibility.AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(com.google.android.material.search.SearchBar.this.accessibilityManager, com.google.android.material.search.SearchBar.this.touchExplorationStateChangeListener);
                }
            });
        }
    }

    private void validateAttributes(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "title") != null) {
                throw new java.lang.UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") != null) {
                throw new java.lang.UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
    }

    private void initNavigationIcon() {
        setNavigationIcon(getNavigationIcon() == null ? this.defaultNavigationIcon : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void initTextView(int i, java.lang.String str, java.lang.String str2) {
        if (i != -1) {
            androidx.core.widget.TextViewCompat.setTextAppearance(this.textView, i);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart((android.view.ViewGroup.MarginLayoutParams) this.textView.getLayoutParams(), getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    private void initBackground(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, int i, float f, float f2, int i2) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f);
        if (f2 >= 0.0f) {
            this.backgroundShape.setStroke(f2, i2);
        }
        int color = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorControlHighlight);
        this.backgroundShape.setFillColor(android.content.res.ColorStateList.valueOf(i));
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(color);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        androidx.core.view.ViewCompat.setBackground(this, new android.graphics.drawable.RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private android.content.res.ColorStateList getCompatBackgroundColorStateList(int i, int i2) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]};
        int layer = com.google.android.material.color.MaterialColors.layer(i, i2);
        return new android.content.res.ColorStateList(iArr, new int[]{layer, layer, i});
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof androidx.appcompat.widget.ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        java.lang.CharSequence text = getText();
        boolean isEmpty = android.text.TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    private android.graphics.drawable.Drawable maybeTintNavigationIcon(android.graphics.drawable.Drawable drawable) {
        int i;
        int color;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        java.lang.Integer num = this.navigationIconTint;
        if (num != null) {
            color = num.intValue();
        } else {
            if (drawable == this.defaultNavigationIcon) {
                i = com.google.android.material.R.attr.colorOnSurfaceVariant;
            } else {
                i = com.google.android.material.R.attr.colorOnSurface;
            }
            color = com.google.android.material.color.MaterialColors.getColor(this, i);
        }
        android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
        androidx.core.graphics.drawable.DrawableCompat.setTint(wrap, color);
        return wrap;
    }

    private void setNavigationIconDecorative(boolean z) {
        android.widget.ImageButton navigationIconButton = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        boolean z2 = !z;
        navigationIconButton.setClickable(z2);
        navigationIconButton.setFocusable(z2);
        android.graphics.drawable.Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        navigationIconButton.setBackgroundDrawable(z ? null : this.originalNavigationIconBackground);
        setHandwritingBoundsInsets();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
        android.view.Menu menu = getMenu();
        boolean z = menu instanceof androidx.appcompat.view.menu.MenuBuilder;
        if (z) {
            ((androidx.appcompat.view.menu.MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i);
        this.menuResId = i;
        if (z) {
            ((androidx.appcompat.view.menu.MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureCenterView(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        layoutCenterView();
        setHandwritingBoundsInsets();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.content.res.Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.material.R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    protected int getDefaultMarginVerticalResource() {
        return com.google.android.material.R.dimen.m3_searchbar_margin_vertical;
    }

    protected int getDefaultNavigationIconResource() {
        return com.google.android.material.R.drawable.ic_search_black_24;
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams) {
            com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void measureCenterView(int i, int i2) {
        android.view.View view = this.centerView;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    private void layoutCenterView() {
        android.view.View view = this.centerView;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int measuredHeight = this.centerView.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(this.centerView, measuredWidth2, measuredHeight2, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
    }

    private void layoutChild(android.view.View view, int i, int i2, int i3, int i4) {
        if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    private void setHandwritingBoundsInsets() {
        int i;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        int i2 = 0;
        boolean z = getLayoutDirection() == 1;
        android.widget.ImageButton navigationIconButton = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null || !navigationIconButton.isClickable()) {
            i = 0;
        } else {
            i = z ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = com.google.android.material.internal.ToolbarUtils.getActionMenuView(this);
        if (actionMenuView != null) {
            i2 = z ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f = -(z ? i2 : i);
        if (!z) {
            i = i2;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -i, 0.0f);
    }

    public android.view.View getCenterView() {
        return this.centerView;
    }

    public void setCenterView(android.view.View view) {
        android.view.View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public android.widget.TextView getTextView() {
        return this.textView;
    }

    public java.lang.CharSequence getText() {
        return this.textView.getText();
    }

    public void setText(java.lang.CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setText(int i) {
        this.textView.setText(i);
    }

    public void clearText() {
        this.textView.setText("");
    }

    public java.lang.CharSequence getHint() {
        return this.textView.getHint();
    }

    public void setHint(java.lang.CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    public void setHint(int i) {
        this.textView.setHint(i);
    }

    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.backgroundShape.setStrokeColor(android.content.res.ColorStateList.valueOf(i));
        }
    }

    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.backgroundShape.setStrokeWidth(f);
        }
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.defaultScrollFlagsEnabled = z;
        setOrClearDefaultScrollFlags();
    }

    /* renamed from: lambda$startOnLoadAnimation$1$com-google-android-material-search-SearchBar, reason: not valid java name */
    /* synthetic */ void m10270x58362b63() {
        this.searchBarAnimationHelper.startOnLoadAnimation(this);
    }

    public void startOnLoadAnimation() {
        post(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.SearchBar.this.m10270x58362b63();
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(z);
    }

    public void addOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public boolean removeOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean expand(android.view.View view) {
        return expand(view, null);
    }

    public boolean expand(android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public boolean expand(android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, z);
        return true;
    }

    public void addExpandAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean collapse(android.view.View view) {
        return collapse(view, null);
    }

    public boolean collapse(android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    public boolean collapse(android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, z);
        return true;
    }

    public void addCollapseAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeCollapseAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    int getMenuResId() {
        return this.menuResId;
    }

    float getCompatElevation() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : androidx.core.view.ViewCompat.getElevation(this);
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof com.google.android.material.appbar.AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((com.google.android.material.appbar.AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        private void setAppBarLayoutTransparent(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.search.SearchBar.SavedState savedState = new com.google.android.material.search.SearchBar.SavedState(super.onSaveInstanceState());
        java.lang.CharSequence text = getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.search.SearchBar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.search.SearchBar.SavedState savedState = (com.google.android.material.search.SearchBar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchBar.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.search.SearchBar.SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.search.SearchBar.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.search.SearchBar.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.search.SearchBar.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.search.SearchBar.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.search.SearchBar.SavedState[] newArray(int i) {
                return new com.google.android.material.search.SearchBar.SavedState[i];
            }
        };
        java.lang.String text;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
        }
    }
}
