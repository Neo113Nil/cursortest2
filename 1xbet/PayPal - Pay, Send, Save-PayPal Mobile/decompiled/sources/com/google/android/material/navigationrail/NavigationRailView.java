package com.google.android.material.navigationrail;

/* loaded from: classes8.dex */
public class NavigationRailView extends com.google.android.material.navigation.NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private android.view.View headerView;
    private java.lang.Boolean paddingBottomSystemWindowInsets;
    private java.lang.Boolean paddingStartSystemWindowInsets;
    private java.lang.Boolean paddingTopSystemWindowInsets;
    private final int topMargin;

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public NavigationRailView(android.content.Context context) {
        this(context, null);
    }

    public NavigationRailView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationRailStyle);
    }

    public NavigationRailView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.google.android.material.R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.topMargin = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_navigation_rail_margin);
        android.content.Context context2 = getContext();
        androidx.appcompat.widget.TintTypedArray obtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationRailView, i, i2, new int[0]);
        int resourceId = obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(obtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.NavigationRailView_menuGravity, 49));
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationRailView_itemMinHeight)) {
            setItemMinimumHeight(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationRailView_itemMinHeight, -1));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = java.lang.Boolean.valueOf(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = java.lang.Boolean.valueOf(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.paddingStartSystemWindowInsets = java.lang.Boolean.valueOf(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float lerp = com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, com.google.android.material.resources.MaterialResources.getFontScale(context2) - 1.0f);
        float lerp2 = com.google.android.material.animation.AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, lerp);
        float lerp3 = com.google.android.material.animation.AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, lerp);
        setItemPaddingTop(java.lang.Math.round(lerp2));
        setItemPaddingBottom(java.lang.Math.round(lerp3));
        obtainTintedStyledAttributes.recycle();
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(this, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
                com.google.android.material.navigationrail.NavigationRailView navigationRailView = com.google.android.material.navigationrail.NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.top += insets.top;
                }
                com.google.android.material.navigationrail.NavigationRailView navigationRailView2 = com.google.android.material.navigationrail.NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += insets.bottom;
                }
                com.google.android.material.navigationrail.NavigationRailView navigationRailView3 = com.google.android.material.navigationrail.NavigationRailView.this;
                if (navigationRailView3.shouldApplyWindowInsetPadding(navigationRailView3.paddingStartSystemWindowInsets)) {
                    relativePadding.start += com.google.android.material.internal.ViewUtils.isLayoutRtl(view) ? insets.right : insets.left;
                }
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(java.lang.Boolean bool) {
        return bool != null ? bool.booleanValue() : androidx.core.view.ViewCompat.getFitsSystemWindows(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int makeMinWidthSpec = makeMinWidthSpec(i);
        super.onMeasure(makeMinWidthSpec, i2);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), makeMinWidthSpec, android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        com.google.android.material.navigationrail.NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
            i5 = 0;
        } else {
            if (navigationRailMenuView.isTopGravity()) {
                i5 = this.topMargin;
            }
            i5 = 0;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void addHeaderView(int i) {
        addHeaderView(android.view.LayoutInflater.from(getContext()).inflate(i, (android.view.ViewGroup) this, false));
    }

    public void addHeaderView(android.view.View view) {
        removeHeaderView();
        this.headerView = view;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view, 0, layoutParams);
    }

    public android.view.View getHeaderView() {
        return this.headerView;
    }

    public void removeHeaderView() {
        android.view.View view = this.headerView;
        if (view != null) {
            removeView(view);
            this.headerView = null;
        }
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public int getItemMinimumHeight() {
        return ((com.google.android.material.navigationrail.NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public void setItemMinimumHeight(int i) {
        ((com.google.android.material.navigationrail.NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    private com.google.android.material.navigationrail.NavigationRailMenuView getNavigationRailMenuView() {
        return (com.google.android.material.navigationrail.NavigationRailMenuView) getMenuView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    public com.google.android.material.navigationrail.NavigationRailMenuView createNavigationBarMenuView(android.content.Context context) {
        return new com.google.android.material.navigationrail.NavigationRailMenuView(context);
    }

    private int makeMinWidthSpec(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (android.view.View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    private boolean isHeaderViewVisible() {
        android.view.View view = this.headerView;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }
}
