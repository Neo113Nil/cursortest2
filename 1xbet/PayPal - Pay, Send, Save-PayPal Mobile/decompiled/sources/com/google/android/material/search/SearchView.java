package com.google.android.material.search;

/* loaded from: classes8.dex */
public class SearchView extends android.widget.FrameLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior, com.google.android.material.motion.MaterialBackHandler {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;
    private final com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;
    private final int backgroundColor;
    final android.view.View backgroundView;
    private java.util.Map<android.view.View, java.lang.Integer> childImportantForAccessibilityMap;
    final android.widget.ImageButton clearButton;
    final com.google.android.material.internal.TouchObserverFrameLayout contentContainer;
    private com.google.android.material.search.SearchView.TransitionState currentTransitionState;
    final android.view.View divider;
    final androidx.appcompat.widget.Toolbar dummyToolbar;
    final android.widget.EditText editText;
    private final com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
    final android.widget.FrameLayout headerContainer;
    private final boolean layoutInflated;
    final com.google.android.material.internal.ClippableRoundedCornerLayout rootView;
    final android.view.View scrim;
    private com.google.android.material.search.SearchBar searchBar;
    final android.widget.TextView searchPrefix;
    private final com.google.android.material.search.SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final android.view.View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final com.google.android.material.appbar.MaterialToolbar toolbar;
    final android.widget.FrameLayout toolbarContainer;
    private final java.util.Set<com.google.android.material.search.SearchView.TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    public interface TransitionListener {
        void onStateChanged(com.google.android.material.search.SearchView searchView, com.google.android.material.search.SearchView.TransitionState transitionState, com.google.android.material.search.SearchView.TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    static /* synthetic */ boolean lambda$setUpRootView$0(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialSearchViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.backOrchestrator = new com.google.android.material.motion.MaterialBackOrchestrator(this);
        this.transitionListeners = new java.util.LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = com.google.android.material.search.SearchView.TransitionState.HIDDEN;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.SearchView, i, i2, new int[0]);
        this.backgroundColor = obtainStyledAttributes.getColor(com.google.android.material.R.styleable.SearchView_backgroundTint, 0);
        int resourceId = obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.SearchView_android_textAppearance, -1);
        java.lang.String string = obtainStyledAttributes.getString(com.google.android.material.R.styleable.SearchView_android_text);
        java.lang.String string2 = obtainStyledAttributes.getString(com.google.android.material.R.styleable.SearchView_android_hint);
        java.lang.String string3 = obtainStyledAttributes.getString(com.google.android.material.R.styleable.SearchView_searchPrefixText);
        boolean z = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchView_animateMenuItems, true);
        boolean z2 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SearchView_backHandlingEnabled, true);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context2).inflate(com.google.android.material.R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(com.google.android.material.R.id.open_search_view_scrim);
        this.rootView = (com.google.android.material.internal.ClippableRoundedCornerLayout) findViewById(com.google.android.material.R.id.open_search_view_root);
        this.backgroundView = findViewById(com.google.android.material.R.id.open_search_view_background);
        this.statusBarSpacer = findViewById(com.google.android.material.R.id.open_search_view_status_bar_spacer);
        this.headerContainer = (android.widget.FrameLayout) findViewById(com.google.android.material.R.id.open_search_view_header_container);
        this.toolbarContainer = (android.widget.FrameLayout) findViewById(com.google.android.material.R.id.open_search_view_toolbar_container);
        this.toolbar = (com.google.android.material.appbar.MaterialToolbar) findViewById(com.google.android.material.R.id.open_search_view_toolbar);
        this.dummyToolbar = (androidx.appcompat.widget.Toolbar) findViewById(com.google.android.material.R.id.open_search_view_dummy_toolbar);
        this.searchPrefix = (android.widget.TextView) findViewById(com.google.android.material.R.id.open_search_view_search_prefix);
        this.editText = (android.widget.EditText) findViewById(com.google.android.material.R.id.open_search_view_edit_text);
        this.clearButton = (android.widget.ImageButton) findViewById(com.google.android.material.R.id.open_search_view_clear_button);
        this.divider = findViewById(com.google.android.material.R.id.open_search_view_divider);
        this.contentContainer = (com.google.android.material.internal.TouchObserverFrameLayout) findViewById(com.google.android.material.R.id.open_search_view_content_container);
        this.searchViewAnimationHelper = new com.google.android.material.search.SearchViewAnimationHelper(this);
        this.elevationOverlayProvider = new com.google.android.material.elevation.ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z, z2);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.search.SearchView> getBehavior() {
        return new com.google.android.material.search.SearchView.Behavior();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        if (isHiddenOrHiding() || this.searchBar == null) {
            return;
        }
        this.searchViewAnimationHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        if (isHiddenOrHiding() || this.searchBar == null || android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.updateBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        androidx.view.BackEventCompat onHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (android.os.Build.VERSION.SDK_INT >= 34 && this.searchBar != null && onHandleBackInvoked != null) {
            this.searchViewAnimationHelper.finishBackProgress();
        } else {
            hide();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.cancelBackProgress();
    }

    com.google.android.material.motion.MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.HIDDEN) || this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.HIDING);
    }

    private android.view.Window getActivityWindow() {
        android.app.Activity activity = com.google.android.material.internal.ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private void setUpRootView() {
        this.rootView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.google.android.material.search.SearchView.lambda$setUpRootView$0(view, motionEvent);
            }
        });
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f));
    }

    private float getOverlayElevation() {
        com.google.android.material.search.SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(com.google.android.material.R.dimen.m3_searchview_elevation);
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(android.view.LayoutInflater.from(getContext()).inflate(i, (android.view.ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpEditText(int i, java.lang.String str, java.lang.String str2) {
        if (i != -1) {
            androidx.core.widget.TextViewCompat.setTextAppearance(this.editText, i);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpBackButton(boolean z, boolean z2) {
        if (z2) {
            this.toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.android.material.search.SearchView.this.m10274x40e9b054(view);
            }
        });
        if (z) {
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorOnSurface));
            this.toolbar.setNavigationIcon(drawerArrowDrawable);
        }
    }

    /* renamed from: lambda$setUpBackButton$1$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ void m10274x40e9b054(android.view.View view) {
        hide();
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.android.material.search.SearchView.this.m10275xf4a71c3b(view);
            }
        });
        this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                com.google.android.material.search.SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    /* renamed from: lambda$setUpClearButton$2$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ void m10275xf4a71c3b(android.view.View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.google.android.material.search.SearchView.this.m10276x1cd2d198(view, motionEvent);
            }
        });
    }

    /* renamed from: lambda$setUpContentOnTouchListener$3$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ boolean m10276x1cd2d198(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!isAdjustNothingSoftInputMode()) {
            return false;
        }
        clearFocusAndHideKeyboard();
        return false;
    }

    private void setUpStatusBarSpacer(int i) {
        if (this.statusBarSpacer.getLayoutParams().height != i) {
            this.statusBarSpacer.getLayoutParams().height = i;
            this.statusBarSpacer.requestLayout();
        }
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void updateNavigationIconIfNeeded() {
        com.google.android.material.appbar.MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), defaultNavigationIconResource).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(wrap, this.toolbar.getNavigationIconTint().intValue());
        }
        this.toolbar.setNavigationIcon(new com.google.android.material.internal.FadeThroughDrawable(this.searchBar.getNavigationIcon(), wrap));
        updateNavigationIconProgressIfNeeded();
    }

    private boolean isNavigationIconDrawerArrowDrawable(androidx.appcompat.widget.Toolbar toolbar) {
        return androidx.core.graphics.drawable.DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    private void setUpToolbarInsetListener() {
        com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(this.toolbar, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                return com.google.android.material.search.SearchView.this.m10278x7371bf54(view, windowInsetsCompat, relativePadding);
            }
        });
    }

    /* renamed from: lambda$setUpToolbarInsetListener$4$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ androidx.core.view.WindowInsetsCompat m10278x7371bf54(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
        boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this.toolbar);
        int i = isLayoutRtl ? relativePadding.end : relativePadding.start;
        int i2 = isLayoutRtl ? relativePadding.start : relativePadding.end;
        this.toolbar.setPadding(i + windowInsetsCompat.getSystemWindowInsetLeft(), relativePadding.top, i2 + windowInsetsCompat.getSystemWindowInsetRight(), relativePadding.bottom);
        return windowInsetsCompat;
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this.statusBarSpacer, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda4
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.google.android.material.search.SearchView.this.m10277x941b8403(view, windowInsetsCompat);
            }
        });
    }

    /* renamed from: lambda$setUpStatusBarSpacerInsetListener$5$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ androidx.core.view.WindowInsetsCompat m10277x941b8403(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        setUpStatusBarSpacer(systemWindowInsetTop);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(systemWindowInsetTop > 0);
        }
        return windowInsetsCompat;
    }

    private void setUpDividerInsetListener() {
        final android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this.divider, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.google.android.material.search.SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i, i2, view, windowInsetsCompat);
            }
        });
    }

    static /* synthetic */ androidx.core.view.WindowInsetsCompat lambda$setUpDividerInsetListener$6(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        marginLayoutParams.leftMargin = i + windowInsetsCompat.getSystemWindowInsetLeft();
        marginLayoutParams.rightMargin = i2 + windowInsetsCompat.getSystemWindowInsetRight();
        return windowInsetsCompat;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public void setupWithSearchBar(com.google.android.material.search.SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.material.search.SearchView.this.m10279x986696e6(view);
                }
            });
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.material.search.SearchView.this.show();
                        }
                    });
                    this.editText.setIsHandwritingDelegate(true);
                } catch (java.lang.LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    /* renamed from: lambda$setupWithSearchBar$7$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ void m10279x986696e6(android.view.View view) {
        show();
    }

    public void addHeaderView(android.view.View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void removeHeaderView(android.view.View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.animatedNavigationIcon = z;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public void setMenuItemsAnimated(boolean z) {
        this.animatedMenuItems = z;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.autoShowKeyboard = z;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public void setUseWindowInsetsController(boolean z) {
        this.useWindowInsetsController = z;
    }

    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    public void addTransitionListener(com.google.android.material.search.SearchView.TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    public void removeTransitionListener(com.google.android.material.search.SearchView.TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void inflateMenu(int i) {
        this.toolbar.inflateMenu(i);
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public android.widget.TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    public void setSearchPrefixText(java.lang.CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(android.text.TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public java.lang.CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    public androidx.appcompat.widget.Toolbar getToolbar() {
        return this.toolbar;
    }

    public android.widget.EditText getEditText() {
        return this.editText;
    }

    public android.text.Editable getText() {
        return this.editText.getText();
    }

    public void setText(java.lang.CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setText(int i) {
        this.editText.setText(i);
    }

    public void clearText() {
        this.editText.setText("");
    }

    public java.lang.CharSequence getHint() {
        return this.editText.getHint();
    }

    public void setHint(java.lang.CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setHint(int i) {
        this.editText.setHint(i);
    }

    public int getSoftInputMode() {
        return this.softInputMode;
    }

    public void updateSoftInputMode() {
        android.view.Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.statusBarSpacer.setVisibility(z ? 0 : 8);
    }

    public com.google.android.material.search.SearchView.TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    void setTransitionState(com.google.android.material.search.SearchView.TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    private void setTransitionState(com.google.android.material.search.SearchView.TransitionState transitionState, boolean z) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z) {
            if (transitionState == com.google.android.material.search.SearchView.TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == com.google.android.material.search.SearchView.TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        com.google.android.material.search.SearchView.TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        java.util.Iterator it = new java.util.LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((com.google.android.material.search.SearchView.TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        updateListeningForBackCallbacks(transitionState);
    }

    private void updateListeningForBackCallbacks(com.google.android.material.search.SearchView.TransitionState transitionState) {
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(com.google.android.material.search.SearchView.TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(com.google.android.material.search.SearchView.TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.SHOWN) || this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.SHOWING);
    }

    public void show() {
        if (this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.SHOWN) || this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.show();
    }

    public void hide() {
        if (this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.HIDDEN) || this.currentTransitionState.equals(com.google.android.material.search.SearchView.TransitionState.HIDING)) {
            return;
        }
        this.searchViewAnimationHelper.hide();
    }

    public void setVisible(boolean z) {
        boolean z2 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z ? com.google.android.material.search.SearchView.TransitionState.SHOWN : com.google.android.material.search.SearchView.TransitionState.HIDDEN, z2 != z);
    }

    private void updateNavigationIconProgressIfNeeded() {
        android.widget.ImageButton navigationIconButton = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton != null) {
            int i = this.rootView.getVisibility() == 0 ? 1 : 0;
            android.graphics.drawable.Drawable unwrap = androidx.core.graphics.drawable.DrawableCompat.unwrap(navigationIconButton.getDrawable());
            if (unwrap instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable) {
                ((androidx.appcompat.graphics.drawable.DrawerArrowDrawable) unwrap).setProgress(i);
            }
            if (unwrap instanceof com.google.android.material.internal.FadeThroughDrawable) {
                ((com.google.android.material.internal.FadeThroughDrawable) unwrap).setProgress(i);
            }
        }
    }

    void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.SearchView.this.m10273x2b2700d7();
            }
        }, 100L);
    }

    /* renamed from: lambda$requestFocusAndShowKeyboard$8$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ void m10273x2b2700d7() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        com.google.android.material.internal.ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.SearchView.this.m10272xff5aa7db();
            }
        });
    }

    /* renamed from: lambda$clearFocusAndHideKeyboard$9$com-google-android-material-search-SearchView, reason: not valid java name */
    /* synthetic */ void m10272xff5aa7db() {
        this.editText.clearFocus();
        com.google.android.material.search.SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        com.google.android.material.internal.ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public void setModalForAccessibility(boolean z) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        if (z) {
            this.childImportantForAccessibilityMap = new java.util.HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z);
        if (z) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.toolbar.setTouchscreenBlocksFocus(z);
    }

    private void updateChildImportantForAccessibility(android.view.ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((android.view.ViewGroup) childAt, z);
                } else if (!z) {
                    java.util.Map<android.view.View, java.lang.Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                } else {
                    this.childImportantForAccessibilityMap.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                    androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 4);
                }
            }
        }
    }

    protected int getDefaultNavigationIconResource() {
        return com.google.android.material.R.drawable.ic_arrow_back_black_24;
    }

    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.search.SearchView> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.search.SearchView searchView, android.view.View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof com.google.android.material.search.SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((com.google.android.material.search.SearchBar) view);
            return false;
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.search.SearchView.SavedState savedState = new com.google.android.material.search.SearchView.SavedState(super.onSaveInstanceState());
        android.text.Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.search.SearchView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.search.SearchView.SavedState savedState = (com.google.android.material.search.SearchView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.search.SearchView.SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.search.SearchView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.search.SearchView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.search.SearchView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.search.SearchView.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.search.SearchView.SavedState[] newArray(int i) {
                return new com.google.android.material.search.SearchView.SavedState[i];
            }
        };
        java.lang.String text;
        int visibility;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }
    }
}
