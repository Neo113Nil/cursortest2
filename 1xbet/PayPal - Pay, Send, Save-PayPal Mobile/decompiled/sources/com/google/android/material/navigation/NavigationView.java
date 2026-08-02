package com.google.android.material.navigation;

/* loaded from: classes8.dex */
public class NavigationView extends com.google.android.material.internal.ScrimInsetsFrameLayout implements com.google.android.material.motion.MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final androidx.drawerlayout.widget.DrawerLayout.DrawerListener backDrawerListener;
    private final com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final com.google.android.material.internal.NavigationMenu menu;
    private android.view.MenuInflater menuInflater;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final com.google.android.material.internal.NavigationMenuPresenter presenter;
    private final com.google.android.material.shape.ShapeableDelegate shapeableDelegate;
    private final com.google.android.material.motion.MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem menuItem);
    }

    public NavigationView(android.content.Context context) {
        this(context, null);
    }

    public NavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, r9), attributeSet, i);
        android.content.res.ColorStateList createDefaultColorStateList;
        int i2;
        int i3;
        int i4 = DEF_STYLE_RES;
        com.google.android.material.internal.NavigationMenuPresenter navigationMenuPresenter = new com.google.android.material.internal.NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = com.google.android.material.shape.ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new com.google.android.material.motion.MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new com.google.android.material.motion.MaterialBackOrchestrator(this);
        this.backDrawerListener = new androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerOpened(android.view.View view) {
                com.google.android.material.navigation.NavigationView navigationView = com.google.android.material.navigation.NavigationView.this;
                if (view == navigationView) {
                    final com.google.android.material.motion.MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    java.util.Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new java.lang.Runnable() { // from class: com.google.android.material.navigation.NavigationView$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.material.motion.MaterialBackOrchestrator.this.startListeningForBackCallbacksWithPriorityOverlay();
                        }
                    });
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(android.view.View view) {
                com.google.android.material.navigation.NavigationView navigationView = com.google.android.material.navigation.NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    com.google.android.material.navigation.NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }
        };
        android.content.Context context2 = getContext();
        com.google.android.material.internal.NavigationMenu navigationMenu = new com.google.android.material.internal.NavigationMenu(context2);
        this.menu = navigationMenu;
        androidx.appcompat.widget.TintTypedArray obtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i, i4, new int[0]);
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_android_background)) {
            androidx.core.view.ViewCompat.setBackground(this, obtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.NavigationView_android_background));
        }
        int dimensionPixelSize = obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.drawerLayoutCornerSize = dimensionPixelSize;
        this.drawerLayoutCornerSizeBackAnimationEnabled = dimensionPixelSize == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size);
        android.graphics.drawable.Drawable background = getBackground();
        android.content.res.ColorStateList colorStateListOrNull = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel.builder(context2, attributeSet, i, i4).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_elevation)) {
            setElevation(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        android.content.res.ColorStateList colorStateList = obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_subheaderColor) ? obtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.NavigationView_subheaderColor) : null;
        int resourceId = obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance) ? obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance, 0) : 0;
        if (resourceId == 0 && colorStateList == null) {
            colorStateList = createDefaultColorStateList(android.R.attr.textColorSecondary);
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemIconTint)) {
            createDefaultColorStateList = obtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.NavigationView_itemIconTint);
        } else {
            createDefaultColorStateList = createDefaultColorStateList(android.R.attr.textColorSecondary);
        }
        int resourceId2 = obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemTextAppearance) ? obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationView_itemTextAppearance, 0) : 0;
        boolean z = obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconSize, 0));
        }
        android.content.res.ColorStateList colorStateList2 = obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemTextColor) ? obtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.NavigationView_itemTextColor) : null;
        if (resourceId2 == 0 && colorStateList2 == null) {
            colorStateList2 = createDefaultColorStateList(android.R.attr.textColorPrimary);
        }
        android.graphics.drawable.Drawable drawable = obtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawable == null && hasShapeAppearance(obtainTintedStyledAttributes)) {
            drawable = createDefaultItemBackground(obtainTintedStyledAttributes);
            android.content.res.ColorStateList colorStateList3 = com.google.android.material.resources.MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList3 != null) {
                navigationMenuPresenter.setItemForeground(new android.graphics.drawable.RippleDrawable(com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(colorStateList3), null, createDefaultItemDrawable(obtainTintedStyledAttributes, null)));
            }
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding)) {
            i2 = 0;
            setItemHorizontalPadding(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding, 0));
        } else {
            i2 = 0;
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding)) {
            setItemVerticalPadding(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding, i2));
        }
        setDividerInsetStart(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i2));
        setDividerInsetEnd(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i2));
        setSubheaderInsetStart(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i2));
        setSubheaderInsetEnd(obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i2));
        setTopInsetScrimEnabled(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(obtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        int dimensionPixelSize2 = obtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, i2);
        setItemMaxLines(obtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
                return com.google.android.material.navigation.NavigationView.this.listener != null && com.google.android.material.navigation.NavigationView.this.listener.onNavigationItemSelected(menuItem);
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateList);
        navigationMenuPresenter.setItemIconTintList(createDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(resourceId2);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z);
        navigationMenuPresenter.setItemTextColor(colorStateList2);
        navigationMenuPresenter.setItemBackground(drawable);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((android.view.View) navigationMenuPresenter.getMenuView(this));
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_menu)) {
            i3 = 0;
            inflateMenu(obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationView_menu, 0));
        } else {
            i3 = 0;
        }
        if (obtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(obtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationView_headerLayout, i3));
        }
        obtainTintedStyledAttributes.recycle();
        setupInsetScrimsListener();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        com.google.android.material.internal.NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if ((getParent() instanceof androidx.drawerlayout.widget.DrawerLayout) && (getLayoutParams() instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof com.google.android.material.shape.MaterialShapeDrawable)) {
                boolean z = androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(this)) == 3;
                com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = (com.google.android.material.shape.MaterialShapeDrawable) getBackground();
                com.google.android.material.shape.ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                com.google.android.material.shape.ShapeAppearanceModel build = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(build);
                this.shapeableDelegate.onShapeAppearanceChanged(this, build);
                this.shapeableDelegate.onMaskChanged(this, new android.graphics.RectF(0.0f, 0.0f, i, i2));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private boolean hasShapeAppearance(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
        android.view.ViewParent parent = getParent();
        if ((parent instanceof androidx.drawerlayout.widget.DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) parent;
            drawerLayout.removeDrawerListener(this.backDrawerListener);
            drawerLayout.addDrawerListener(this.backDrawerListener);
            if (drawerLayout.isDrawerOpen(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        android.view.ViewParent parent = getParent();
        if (parent instanceof androidx.drawerlayout.widget.DrawerLayout) {
            ((androidx.drawerlayout.widget.DrawerLayout) parent).removeDrawerListener(this.backDrawerListener);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    private android.graphics.drawable.Drawable createDefaultItemBackground(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        return createDefaultItemDrawable(tintTypedArray, com.google.android.material.resources.MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    private android.graphics.drawable.Drawable createDefaultItemDrawable(androidx.appcompat.widget.TintTypedArray tintTypedArray, android.content.res.ColorStateList colorStateList) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) materialShapeDrawable, tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.navigation.NavigationView.SavedState savedState = new com.google.android.material.navigation.NavigationView.SavedState(super.onSaveInstanceState());
        savedState.menuState = new android.os.Bundle();
        this.menu.savePresenterStates(savedState.menuState);
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.navigation.NavigationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.navigation.NavigationView.SavedState savedState = (com.google.android.material.navigation.NavigationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public void setNavigationItemSelectedListener(com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new com.google.android.material.canvas.CanvasCompat.CanvasOperation() { // from class: com.google.android.material.navigation.NavigationView$$ExternalSyntheticLambda0
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(android.graphics.Canvas canvas2) {
                com.google.android.material.navigation.NavigationView.this.m10268xb790515(canvas2);
            }
        });
    }

    /* renamed from: lambda$dispatchDraw$0$com-google-android-material-navigation-NavigationView, reason: not valid java name */
    /* synthetic */ void m10268xb790515(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public android.view.Menu getMenu() {
        return this.menu;
    }

    public android.view.View inflateHeaderView(int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void addHeaderView(android.view.View view) {
        this.presenter.addHeaderView(view);
    }

    public void removeHeaderView(android.view.View view) {
        this.presenter.removeHeaderView(view);
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public android.view.View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public android.content.res.ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public void setItemIconTintList(android.content.res.ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public void setItemHorizontalPadding(int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public void setItemVerticalPadding(int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public void setItemIconPadding(int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setCheckedItem(int i) {
        android.view.MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.setCheckedItem((androidx.appcompat.view.menu.MenuItemImpl) findItem);
        }
    }

    public void setCheckedItem(android.view.MenuItem menuItem) {
        android.view.MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((androidx.appcompat.view.menu.MenuItemImpl) findItem);
            return;
        }
        throw new java.lang.IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public android.view.MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public void setItemTextAppearance(int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemIconSize(int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public void setDividerInsetStart(int i) {
        this.presenter.setDividerInsetStart(i);
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public void setDividerInsetEnd(int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public void setSubheaderInsetStart(int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public void setSubheaderInsetEnd(int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        this.sideContainerBackHelper.updateBackProgress(backEventCompat, ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) requireDrawerLayoutParent().second).gravity);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = com.google.android.material.animation.AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(backEventCompat.getProgress()));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        android.util.Pair<androidx.drawerlayout.widget.DrawerLayout, androidx.drawerlayout.widget.DrawerLayout.LayoutParams> requireDrawerLayoutParent = requireDrawerLayoutParent();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) requireDrawerLayoutParent.first;
        androidx.view.BackEventCompat onHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || android.os.Build.VERSION.SDK_INT < 34) {
            drawerLayout.closeDrawer(this);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) requireDrawerLayoutParent.second).gravity, com.google.android.material.navigation.DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), com.google.android.material.navigation.DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    private android.util.Pair<androidx.drawerlayout.widget.DrawerLayout, androidx.drawerlayout.widget.DrawerLayout.LayoutParams> requireDrawerLayoutParent() {
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof androidx.drawerlayout.widget.DrawerLayout) && (layoutParams instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams)) {
            return new android.util.Pair<>((androidx.drawerlayout.widget.DrawerLayout) parent, (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) layoutParams);
        }
        throw new java.lang.IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    com.google.android.material.motion.MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    private android.view.MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new androidx.appcompat.view.SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private android.content.res.ColorStateList createDefaultColorStateList(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        android.content.res.ColorStateList colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new android.content.res.ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                com.google.android.material.navigation.NavigationView navigationView = com.google.android.material.navigation.NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z = true;
                boolean z2 = com.google.android.material.navigation.NavigationView.this.tmpLocation[1] == 0;
                com.google.android.material.navigation.NavigationView.this.presenter.setBehindStatusBar(z2);
                com.google.android.material.navigation.NavigationView navigationView2 = com.google.android.material.navigation.NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z2 && navigationView2.isTopInsetScrimEnabled());
                com.google.android.material.navigation.NavigationView.this.setDrawLeftInsetForeground(com.google.android.material.navigation.NavigationView.this.tmpLocation[0] == 0 || com.google.android.material.navigation.NavigationView.this.tmpLocation[0] + com.google.android.material.navigation.NavigationView.this.getWidth() == 0);
                android.app.Activity activity = com.google.android.material.internal.ContextUtils.getActivity(com.google.android.material.navigation.NavigationView.this.getContext());
                if (activity != null) {
                    android.graphics.Rect currentWindowBounds = com.google.android.material.internal.WindowUtils.getCurrentWindowBounds(activity);
                    boolean z3 = currentWindowBounds.height() - com.google.android.material.navigation.NavigationView.this.getHeight() == com.google.android.material.navigation.NavigationView.this.tmpLocation[1];
                    boolean z4 = android.graphics.Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    com.google.android.material.navigation.NavigationView navigationView3 = com.google.android.material.navigation.NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z3 && z4 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != com.google.android.material.navigation.NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - com.google.android.material.navigation.NavigationView.this.getWidth() != com.google.android.material.navigation.NavigationView.this.tmpLocation[0]) {
                        z = false;
                    }
                    com.google.android.material.navigation.NavigationView.this.setDrawRightInsetForeground(z);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.navigation.NavigationView.SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.navigation.NavigationView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.navigation.NavigationView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.navigation.NavigationView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationView.SavedState[] newArray(int i) {
                return new com.google.android.material.navigation.NavigationView.SavedState[i];
            }
        };
        public android.os.Bundle menuState;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }
}
