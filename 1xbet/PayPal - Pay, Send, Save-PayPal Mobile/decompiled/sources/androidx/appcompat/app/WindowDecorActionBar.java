package androidx.appcompat.app;

/* loaded from: classes3.dex */
public class WindowDecorActionBar extends androidx.appcompat.app.ActionBar implements androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final android.view.animation.Interpolator isOutputSupportedForhNQ4ISI = new android.view.animation.AccelerateInterpolator();
    private static final android.view.animation.Interpolator toString = new android.view.animation.DecelerateInterpolator();
    androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl Camera2StreamConfigurationMap;
    private boolean CoroutineDebuggingKt;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2662a;
    private boolean accessartificialFrame;
    private boolean coroutineBoundary;
    private android.app.Activity coroutineCreation;
    private boolean d;
    private androidx.appcompat.app.WindowDecorActionBar.TabImpl getARTIFICIAL_FRAME_PACKAGE_NAME;
    android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    androidx.appcompat.widget.ActionBarContainer getHighSpeedVideoFpsRanges;
    android.view.View getHighSpeedVideoSizes;
    androidx.appcompat.widget.ActionBarContextView getHighSpeedVideoSizesFor;
    androidx.appcompat.view.ActionMode getInputFormats;
    androidx.appcompat.view.ActionMode.Callback getInputSizeshNQ4ISI;
    androidx.appcompat.view.ViewPropertyAnimatorCompatSet getOutputFormats;
    androidx.appcompat.widget.DecorToolbar getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    androidx.appcompat.widget.ActionBarOverlayLayout getOutputSizes;
    boolean getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    private android.content.Context kernelVersion;
    androidx.appcompat.widget.ScrollingTabContainerView unwrapAs;
    private java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar.TabImpl> AMEXKernel = new java.util.ArrayList<>();
    private int _CREATION = -1;
    private java.util.ArrayList<androidx.appcompat.app.ActionBar.OnMenuVisibilityListener> _BOUNDARY = new java.util.ArrayList<>();
    private int ArtificialStackFrames = 0;
    boolean getHighSpeedVideoFpsRangesFor = true;
    private boolean b = true;
    final androidx.core.view.ViewPropertyAnimatorListener getOutputSizeshNQ4ISI = new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.1
        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            if (androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoFpsRangesFor && androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizes != null) {
                androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizes.setTranslationY(0.0f);
                androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoFpsRanges.setTranslationY(0.0f);
            }
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoFpsRanges.setVisibility(8);
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoFpsRanges.setTransitioning(false);
            androidx.appcompat.app.WindowDecorActionBar.this.getOutputFormats = null;
            androidx.appcompat.app.WindowDecorActionBar windowDecorActionBar = androidx.appcompat.app.WindowDecorActionBar.this;
            androidx.appcompat.view.ActionMode.Callback callback = windowDecorActionBar.getInputSizeshNQ4ISI;
            if (callback != null) {
                callback.onDestroyActionMode(windowDecorActionBar.getInputFormats);
                windowDecorActionBar.getInputFormats = null;
                windowDecorActionBar.getInputSizeshNQ4ISI = null;
            }
            if (androidx.appcompat.app.WindowDecorActionBar.this.getOutputSizes != null) {
                androidx.core.view.ViewCompat.requestApplyInsets(androidx.appcompat.app.WindowDecorActionBar.this.getOutputSizes);
            }
        }
    };
    final androidx.core.view.ViewPropertyAnimatorListener getValidOutputFormatsForInputhNQ4ISI = new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.2
        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            androidx.appcompat.app.WindowDecorActionBar.this.getOutputFormats = null;
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoFpsRanges.requestLayout();
        }
    };
    final androidx.core.view.ViewPropertyAnimatorUpdateListener isOutputSupportedFor = new androidx.core.view.ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(android.view.View view) {
            ((android.view.View) androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoFpsRanges.getParent()).invalidate();
        }
    };

    static boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, boolean z3) {
        return (z || z2) ? false : true;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public WindowDecorActionBar(android.app.Activity activity, boolean z) {
        this.coroutineCreation = activity;
        android.view.View decorView = activity.getWindow().getDecorView();
        Camera2StreamConfigurationMap(decorView);
        if (z) {
            return;
        }
        this.getHighSpeedVideoSizes = decorView.findViewById(android.R.id.content);
    }

    public WindowDecorActionBar(android.app.Dialog dialog) {
        Camera2StreamConfigurationMap(dialog.getWindow().getDecorView());
    }

    public WindowDecorActionBar(android.view.View view) {
        Camera2StreamConfigurationMap(view);
    }

    private void Camera2StreamConfigurationMap(android.view.View view) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) view.findViewById(androidx.appcompat.R.id.decor_content_parent);
        this.getOutputSizes = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor(view.findViewById(androidx.appcompat.R.id.action_bar));
        this.getHighSpeedVideoSizesFor = (androidx.appcompat.widget.ActionBarContextView) view.findViewById(androidx.appcompat.R.id.action_context_bar);
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) view.findViewById(androidx.appcompat.R.id.action_bar_container);
        this.getHighSpeedVideoFpsRanges = actionBarContainer;
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.getOutputMinFrameDuration;
        if (decorToolbar == null || this.getHighSpeedVideoSizesFor == null || actionBarContainer == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = decorToolbar.getContext();
        boolean z = (this.getOutputMinFrameDuration.getDisplayOptions() & 4) != 0;
        if (z) {
            this.CoroutineDebuggingKt = true;
        }
        androidx.appcompat.view.ActionBarPolicy actionBarPolicy = androidx.appcompat.view.ActionBarPolicy.get(this.getHighResolutionOutputSizeshNQ4ISI);
        setHomeButtonEnabled(actionBarPolicy.enableHomeButtonByDefault() || z);
        getHighResolutionOutputSizeshNQ4ISI(actionBarPolicy.hasEmbeddedTabs());
        android.content.res.TypedArray obtainStyledAttributes = this.getHighResolutionOutputSizeshNQ4ISI.obtainStyledAttributes(null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.appcompat.widget.DecorToolbar getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (view instanceof androidx.appcompat.widget.DecorToolbar) {
            return (androidx.appcompat.widget.DecorToolbar) view;
        }
        if (view instanceof androidx.appcompat.widget.Toolbar) {
            return ((androidx.appcompat.widget.Toolbar) view).getWrapper();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f) {
        androidx.core.view.ViewCompat.setElevation(this.getHighSpeedVideoFpsRanges, f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return androidx.core.view.ViewCompat.getElevation(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.view.ActionBarPolicy.get(this.getHighResolutionOutputSizeshNQ4ISI).hasEmbeddedTabs());
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.coroutineBoundary = z;
        if (!z) {
            this.getOutputMinFrameDuration.setEmbeddedTabView(null);
            this.getHighSpeedVideoFpsRanges.setTabContainer(this.unwrapAs);
        } else {
            this.getHighSpeedVideoFpsRanges.setTabContainer(null);
            this.getOutputMinFrameDuration.setEmbeddedTabView(this.unwrapAs);
        }
        boolean z2 = getNavigationMode() == 2;
        androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView = this.unwrapAs;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.getOutputSizes;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.getOutputMinFrameDuration.setCollapsible(!this.coroutineBoundary && z2);
        this.getOutputSizes.setHasNonEmbeddedTabs(!this.coroutineBoundary && z2);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.unwrapAs != null) {
            return;
        }
        androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView = new androidx.appcompat.widget.ScrollingTabContainerView(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.coroutineBoundary) {
            scrollingTabContainerView.setVisibility(0);
            this.getOutputMinFrameDuration.setEmbeddedTabView(scrollingTabContainerView);
        } else {
            if (getNavigationMode() == 2) {
                scrollingTabContainerView.setVisibility(0);
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.getOutputSizes;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.getHighSpeedVideoFpsRanges.setTabContainer(scrollingTabContainerView);
        }
        this.unwrapAs = scrollingTabContainerView;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i) {
        this.ArtificialStackFrames = i;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f2662a = z;
        if (z || (viewPropertyAnimatorCompatSet = this.getOutputFormats) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.cancel();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this._BOUNDARY.add(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this._BOUNDARY.remove(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z != this.accessartificialFrame) {
            this.accessartificialFrame = z;
            int size = this._BOUNDARY.size();
            for (int i = 0; i < size; i++) {
                this._BOUNDARY.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(android.view.LayoutInflater.from(getThemedContext()).inflate(i, this.getOutputMinFrameDuration.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        setDisplayOptions(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        setDisplayOptions(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        setDisplayOptions(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        setDisplayOptions(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
        this.getOutputMinFrameDuration.setHomeButtonEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i) {
        setTitle(this.getHighResolutionOutputSizeshNQ4ISI.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i) {
        setSubtitle(this.getHighResolutionOutputSizeshNQ4ISI.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        int navigationMode = this.getOutputMinFrameDuration.getNavigationMode();
        if (navigationMode == 1) {
            this.getOutputMinFrameDuration.setDropdownSelectedPosition(i);
        } else {
            if (navigationMode == 2) {
                selectTab(this.AMEXKernel.get(i));
                return;
            }
            throw new java.lang.IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDuration.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDuration.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
        android.view.ViewGroup viewGroup = this.getOutputMinFrameDuration.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDuration.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.CoroutineDebuggingKt = true;
        }
        this.getOutputMinFrameDuration.setDisplayOptions(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        int displayOptions = this.getOutputMinFrameDuration.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.CoroutineDebuggingKt = true;
        }
        this.getOutputMinFrameDuration.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRanges.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRanges.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.view.View getCustomView() {
        return this.getOutputMinFrameDuration.getCustomView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getTitle() {
        return this.getOutputMinFrameDuration.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getSubtitle() {
        return this.getOutputMinFrameDuration.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return this.getOutputMinFrameDuration.getNavigationMode();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.getOutputMinFrameDuration.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl actionModeImpl = this.Camera2StreamConfigurationMap;
        if (actionModeImpl != null) {
            actionModeImpl.finish();
        }
        this.getOutputSizes.setHideOnContentScrollEnabled(false);
        this.getHighSpeedVideoSizesFor.killMode();
        androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl actionModeImpl2 = new androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl(this.getHighSpeedVideoSizesFor.getContext(), callback);
        if (!actionModeImpl2.dispatchOnCreate()) {
            return null;
        }
        this.Camera2StreamConfigurationMap = actionModeImpl2;
        actionModeImpl2.invalidate();
        this.getHighSpeedVideoSizesFor.initForMode(actionModeImpl2);
        animateToMode(true);
        return actionModeImpl2;
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.appcompat.app.ActionBar.Tab tab, int i) {
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) tab;
        if (tabImpl.getCallback() == null) {
            throw new java.lang.IllegalStateException("Action Bar Tab must have a Callback");
        }
        tabImpl.setPosition(i);
        this.AMEXKernel.add(i, tabImpl);
        int size = this.AMEXKernel.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.AMEXKernel.get(i).setPosition(i);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab) {
        addTab(tab, this.AMEXKernel.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i) {
        addTab(tab, i, this.AMEXKernel.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI();
        this.unwrapAs.addTab(tab, z);
        getHighSpeedVideoFpsRangesFor(tab, this.AMEXKernel.size());
        if (z) {
            selectTab(tab);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI();
        this.unwrapAs.addTab(tab, i, z);
        getHighSpeedVideoFpsRangesFor(tab, i);
        if (z) {
            selectTab(tab);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab newTab() {
        return new androidx.appcompat.app.WindowDecorActionBar.TabImpl();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(androidx.appcompat.app.ActionBar.Tab tab) {
        removeTabAt(tab.getPosition());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i) {
        if (this.unwrapAs != null) {
            androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            int position = tabImpl != null ? tabImpl.getPosition() : this._CREATION;
            this.unwrapAs.removeTabAt(i);
            androidx.appcompat.app.WindowDecorActionBar.TabImpl remove = this.AMEXKernel.remove(i);
            if (remove != null) {
                remove.setPosition(-1);
            }
            int size = this.AMEXKernel.size();
            for (int i2 = i; i2 < size; i2++) {
                this.AMEXKernel.get(i2).setPosition(i2);
            }
            if (position == i) {
                selectTab(this.AMEXKernel.isEmpty() ? null : this.AMEXKernel.get(java.lang.Math.max(0, i - 1)));
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(androidx.appcompat.app.ActionBar.Tab tab) {
        if (getNavigationMode() != 2) {
            this._CREATION = tab != null ? tab.getPosition() : -1;
            return;
        }
        androidx.fragment.app.FragmentTransaction disallowAddToBackStack = (!(this.coroutineCreation instanceof androidx.fragment.app.FragmentActivity) || this.getOutputMinFrameDuration.getViewGroup().isInEditMode()) ? null : ((androidx.fragment.app.FragmentActivity) this.coroutineCreation).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (tabImpl != tab) {
            this.unwrapAs.setTabSelected(tab != null ? tab.getPosition() : -1);
            androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (tabImpl2 != null) {
                tabImpl2.getCallback().onTabUnselected(this.getARTIFICIAL_FRAME_PACKAGE_NAME, disallowAddToBackStack);
            }
            androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl3 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) tab;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.getCallback().onTabSelected(this.getARTIFICIAL_FRAME_PACKAGE_NAME, disallowAddToBackStack);
            }
        } else if (tabImpl != null) {
            tabImpl.getCallback().onTabReselected(this.getARTIFICIAL_FRAME_PACKAGE_NAME, disallowAddToBackStack);
            this.unwrapAs.animateToTab(tab.getPosition());
        }
        if (disallowAddToBackStack == null || disallowAddToBackStack.isEmpty()) {
            return;
        }
        disallowAddToBackStack.commit();
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getSelectedTab() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges.getHeight();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        if (this.getOutputStallDurationlomOqCM) {
            this.getOutputStallDurationlomOqCM = false;
            getHighSpeedVideoFpsRangesFor(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.getOutputStallDuration) {
            this.getOutputStallDuration = false;
            getHighSpeedVideoFpsRangesFor(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        if (this.getOutputStallDurationlomOqCM) {
            return;
        }
        this.getOutputStallDurationlomOqCM = true;
        getHighSpeedVideoFpsRangesFor(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.getOutputStallDuration) {
            return;
        }
        this.getOutputStallDuration = true;
        getHighSpeedVideoFpsRangesFor(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z) {
        if (z && !this.getOutputSizes.isInOverlayMode()) {
            throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.getOutputMinFrameDurationlomOqCM = z;
        this.getOutputSizes.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.getOutputSizes.isHideOnContentScrollEnabled();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
        return this.getOutputSizes.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int i) {
        if (i != 0 && !this.getOutputSizes.isInOverlayMode()) {
            throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.getOutputSizes.setActionBarHideOffset(i);
    }

    private void getHighSpeedVideoFpsRangesFor(boolean z) {
        boolean z2 = this.getOutputStallDurationlomOqCM;
        boolean z3 = this.getOutputStallDuration;
        if (this.d || (!z2 && !z3)) {
            if (this.b) {
                return;
            }
            this.b = true;
            doShow(z);
            return;
        }
        if (this.b) {
            this.b = false;
            doHide(z);
        }
    }

    public void doShow(boolean z) {
        android.view.View view;
        android.view.View view2;
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.getOutputFormats;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        this.getHighSpeedVideoFpsRanges.setVisibility(0);
        if (this.ArtificialStackFrames == 0 && (this.f2662a || z)) {
            this.getHighSpeedVideoFpsRanges.setTranslationY(0.0f);
            float f = -this.getHighSpeedVideoFpsRanges.getHeight();
            if (z) {
                this.getHighSpeedVideoFpsRanges.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.getHighSpeedVideoFpsRanges.setTranslationY(f);
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet();
            androidx.core.view.ViewPropertyAnimatorCompat translationY = androidx.core.view.ViewCompat.animate(this.getHighSpeedVideoFpsRanges).translationY(0.0f);
            translationY.setUpdateListener(this.isOutputSupportedFor);
            viewPropertyAnimatorCompatSet2.play(translationY);
            if (this.getHighSpeedVideoFpsRangesFor && (view2 = this.getHighSpeedVideoSizes) != null) {
                view2.setTranslationY(f);
                viewPropertyAnimatorCompatSet2.play(androidx.core.view.ViewCompat.animate(this.getHighSpeedVideoSizes).translationY(0.0f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(toString);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.getValidOutputFormatsForInputhNQ4ISI);
            this.getOutputFormats = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
        } else {
            this.getHighSpeedVideoFpsRanges.setAlpha(1.0f);
            this.getHighSpeedVideoFpsRanges.setTranslationY(0.0f);
            if (this.getHighSpeedVideoFpsRangesFor && (view = this.getHighSpeedVideoSizes) != null) {
                view.setTranslationY(0.0f);
            }
            this.getValidOutputFormatsForInputhNQ4ISI.onAnimationEnd(null);
        }
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.getOutputSizes;
        if (actionBarOverlayLayout != null) {
            androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    public void doHide(boolean z) {
        android.view.View view;
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.getOutputFormats;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        if (this.ArtificialStackFrames == 0 && (this.f2662a || z)) {
            this.getHighSpeedVideoFpsRanges.setAlpha(1.0f);
            this.getHighSpeedVideoFpsRanges.setTransitioning(true);
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet();
            float f = -this.getHighSpeedVideoFpsRanges.getHeight();
            if (z) {
                this.getHighSpeedVideoFpsRanges.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            androidx.core.view.ViewPropertyAnimatorCompat translationY = androidx.core.view.ViewCompat.animate(this.getHighSpeedVideoFpsRanges).translationY(f);
            translationY.setUpdateListener(this.isOutputSupportedFor);
            viewPropertyAnimatorCompatSet2.play(translationY);
            if (this.getHighSpeedVideoFpsRangesFor && (view = this.getHighSpeedVideoSizes) != null) {
                viewPropertyAnimatorCompatSet2.play(androidx.core.view.ViewCompat.animate(view).translationY(f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(isOutputSupportedForhNQ4ISI);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.getOutputSizeshNQ4ISI);
            this.getOutputFormats = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
            return;
        }
        this.getOutputSizeshNQ4ISI.onAnimationEnd(null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        int height = getHeight();
        if (this.b) {
            return height == 0 || getHideOffset() < height;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.content.Context getThemedContext() {
        if (this.kernelVersion == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.getHighResolutionOutputSizeshNQ4ISI.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.kernelVersion = new android.view.ContextThemeWrapper(this.getHighResolutionOutputSizeshNQ4ISI, i);
            } else {
                this.kernelVersion = this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        return this.kernelVersion;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.getOutputMinFrameDuration;
        return decorToolbar != null && decorToolbar.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable drawable) {
        this.getOutputMinFrameDuration.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i) {
        this.getOutputMinFrameDuration.setNavigationIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDuration.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i) {
        this.getOutputMinFrameDuration.setNavigationContentDescription(i);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.getOutputFormats;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
            this.getOutputFormats = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.getOutputMinFrameDuration;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.getOutputMinFrameDuration.collapseActionView();
        return true;
    }

    public class ActionModeImpl extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        private androidx.appcompat.view.ActionMode.Callback Camera2StreamConfigurationMap;
        private final androidx.appcompat.view.menu.MenuBuilder getHighResolutionOutputSizeshNQ4ISI;
        private final android.content.Context getHighSpeedVideoFpsRangesFor;
        private java.lang.ref.WeakReference<android.view.View> getHighSpeedVideoSizes;

        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        }

        public void onCloseSubMenu(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        }

        public ActionModeImpl(android.content.Context context, androidx.appcompat.view.ActionMode.Callback callback) {
            this.getHighSpeedVideoFpsRangesFor = context;
            this.Camera2StreamConfigurationMap = callback;
            androidx.appcompat.view.menu.MenuBuilder defaultShowAsAction = new androidx.appcompat.view.menu.MenuBuilder(context).setDefaultShowAsAction(1);
            this.getHighResolutionOutputSizeshNQ4ISI = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.MenuInflater getMenuInflater() {
            return new androidx.appcompat.view.SupportMenuInflater(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.Menu getMenu() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void finish() {
            if (androidx.appcompat.app.WindowDecorActionBar.this.Camera2StreamConfigurationMap != this) {
                return;
            }
            if (!androidx.appcompat.app.WindowDecorActionBar.getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.app.WindowDecorActionBar.this.getOutputStallDurationlomOqCM, androidx.appcompat.app.WindowDecorActionBar.this.getOutputStallDuration, false)) {
                androidx.appcompat.app.WindowDecorActionBar.this.getInputFormats = this;
                androidx.appcompat.app.WindowDecorActionBar.this.getInputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
            } else {
                this.Camera2StreamConfigurationMap.onDestroyActionMode(this);
            }
            this.Camera2StreamConfigurationMap = null;
            androidx.appcompat.app.WindowDecorActionBar.this.animateToMode(false);
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.closeMode();
            androidx.appcompat.app.WindowDecorActionBar.this.getOutputSizes.setHideOnContentScrollEnabled(androidx.appcompat.app.WindowDecorActionBar.this.getOutputMinFrameDurationlomOqCM);
            androidx.appcompat.app.WindowDecorActionBar.this.Camera2StreamConfigurationMap = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void invalidate() {
            if (androidx.appcompat.app.WindowDecorActionBar.this.Camera2StreamConfigurationMap != this) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.stopDispatchingItemsChanged();
            try {
                this.Camera2StreamConfigurationMap.onPrepareActionMode(this, this.getHighResolutionOutputSizeshNQ4ISI);
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI.startDispatchingItemsChanged();
            }
        }

        public boolean dispatchOnCreate() {
            this.getHighResolutionOutputSizeshNQ4ISI.stopDispatchingItemsChanged();
            try {
                return this.Camera2StreamConfigurationMap.onCreateActionMode(this, this.getHighResolutionOutputSizeshNQ4ISI);
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setCustomView(android.view.View view) {
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.setCustomView(view);
            this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(java.lang.CharSequence charSequence) {
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(java.lang.CharSequence charSequence) {
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(int i) {
            setTitle(androidx.appcompat.app.WindowDecorActionBar.this.getHighResolutionOutputSizeshNQ4ISI.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(int i) {
            setSubtitle(androidx.appcompat.app.WindowDecorActionBar.this.getHighResolutionOutputSizeshNQ4ISI.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getTitle() {
            return androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getSubtitle() {
            return androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean z) {
            super.setTitleOptionalHint(z);
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
            return androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.isTitleOptional();
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.View getCustomView() {
            java.lang.ref.WeakReference<android.view.View> weakReference = this.getHighSpeedVideoSizes;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
            androidx.appcompat.view.ActionMode.Callback callback = this.Camera2StreamConfigurationMap;
            if (callback != null) {
                return callback.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
            if (this.Camera2StreamConfigurationMap == null) {
                return false;
            }
            if (!subMenuBuilder.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.MenuPopupHelper(androidx.appcompat.app.WindowDecorActionBar.this.getThemedContext(), subMenuBuilder).show();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            if (this.Camera2StreamConfigurationMap == null) {
                return;
            }
            invalidate();
            androidx.appcompat.app.WindowDecorActionBar.this.getHighSpeedVideoSizesFor.showOverflowMenu();
        }
    }

    /* loaded from: classes5.dex */
    public class TabImpl extends androidx.appcompat.app.ActionBar.Tab {
        private androidx.appcompat.app.ActionBar.TabListener Camera2StreamConfigurationMap;
        private android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
        private android.view.View getHighSpeedVideoFpsRanges;
        private java.lang.CharSequence getHighSpeedVideoSizes;
        private java.lang.Object getInputFormats;
        private java.lang.CharSequence getInputSizeshNQ4ISI;
        private int getOutputMinFrameDuration = -1;

        public TabImpl() {
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.Object getTag() {
            return this.getInputFormats;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTag(java.lang.Object obj) {
            this.getInputFormats = obj;
            return this;
        }

        public androidx.appcompat.app.ActionBar.TabListener getCallback() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTabListener(androidx.appcompat.app.ActionBar.TabListener tabListener) {
            this.Camera2StreamConfigurationMap = tabListener;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.view.View getCustomView() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(android.view.View view) {
            this.getHighSpeedVideoFpsRanges = view;
            if (this.getOutputMinFrameDuration >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.unwrapAs.updateTab(this.getOutputMinFrameDuration);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(int i) {
            return setCustomView(android.view.LayoutInflater.from(androidx.appcompat.app.WindowDecorActionBar.this.getThemedContext()).inflate(i, (android.view.ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.graphics.drawable.Drawable getIcon() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int getPosition() {
            return this.getOutputMinFrameDuration;
        }

        public void setPosition(int i) {
            this.getOutputMinFrameDuration = i;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getText() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable drawable) {
            this.getHighResolutionOutputSizeshNQ4ISI = drawable;
            if (this.getOutputMinFrameDuration >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.unwrapAs.updateTab(this.getOutputMinFrameDuration);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(int i) {
            return setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(androidx.appcompat.app.WindowDecorActionBar.this.getHighResolutionOutputSizeshNQ4ISI, i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(java.lang.CharSequence charSequence) {
            this.getInputSizeshNQ4ISI = charSequence;
            if (this.getOutputMinFrameDuration >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.unwrapAs.updateTab(this.getOutputMinFrameDuration);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(int i) {
            return setText(androidx.appcompat.app.WindowDecorActionBar.this.getHighResolutionOutputSizeshNQ4ISI.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void select() {
            androidx.appcompat.app.WindowDecorActionBar.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(int i) {
            return setContentDescription(androidx.appcompat.app.WindowDecorActionBar.this.getHighResolutionOutputSizeshNQ4ISI.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = charSequence;
            if (this.getOutputMinFrameDuration >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.unwrapAs.updateTab(this.getOutputMinFrameDuration);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getContentDescription() {
            return this.getHighSpeedVideoSizes;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View view) {
        this.getOutputMinFrameDuration.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View view, androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.getOutputMinFrameDuration.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter spinnerAdapter, androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener) {
        this.getOutputMinFrameDuration.setDropdownParams(spinnerAdapter, new androidx.appcompat.app.NavItemSelectedListener(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl;
        int navigationMode = this.getOutputMinFrameDuration.getNavigationMode();
        if (navigationMode == 1) {
            return this.getOutputMinFrameDuration.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (tabImpl = this.getARTIFICIAL_FRAME_PACKAGE_NAME) != null) {
            return tabImpl.getPosition();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        int navigationMode = this.getOutputMinFrameDuration.getNavigationMode();
        if (navigationMode == 1) {
            return this.getOutputMinFrameDuration.getDropdownItemCount();
        }
        if (navigationMode != 2) {
            return 0;
        }
        return this.AMEXKernel.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.AMEXKernel.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.getOutputMinFrameDuration.getNavigationMode();
        if (navigationMode == 2) {
            this._CREATION = getSelectedNavigationIndex();
            selectTab(null);
            this.unwrapAs.setVisibility(8);
        }
        if (navigationMode != i && !this.coroutineBoundary && (actionBarOverlayLayout = this.getOutputSizes) != null) {
            androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
        this.getOutputMinFrameDuration.setNavigationMode(i);
        boolean z = false;
        if (i == 2) {
            getHighResolutionOutputSizeshNQ4ISI();
            this.unwrapAs.setVisibility(0);
            int i2 = this._CREATION;
            if (i2 != -1) {
                setSelectedNavigationItem(i2);
                this._CREATION = -1;
            }
        }
        this.getOutputMinFrameDuration.setCollapsible(i == 2 && !this.coroutineBoundary);
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.getOutputSizes;
        if (i == 2 && !this.coroutineBoundary) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getTabAt(int i) {
        return this.AMEXKernel.get(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i) {
        this.getOutputMinFrameDuration.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.getOutputMinFrameDuration.setIcon(drawable);
    }

    public boolean hasIcon() {
        return this.getOutputMinFrameDuration.hasIcon();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i) {
        this.getOutputMinFrameDuration.setLogo(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(android.graphics.drawable.Drawable drawable) {
        this.getOutputMinFrameDuration.setLogo(drawable);
    }

    public boolean hasLogo() {
        return this.getOutputMinFrameDuration.hasLogo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.CoroutineDebuggingKt) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i, android.view.KeyEvent keyEvent) {
        android.view.Menu menu;
        androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl actionModeImpl = this.Camera2StreamConfigurationMap;
        if (actionModeImpl == null || (menu = actionModeImpl.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }

    public void animateToMode(boolean z) {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            if (!this.d) {
                this.d = true;
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.getOutputSizes;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                getHighSpeedVideoFpsRangesFor(false);
            }
        } else if (this.d) {
            this.d = false;
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.getOutputSizes;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            getHighSpeedVideoFpsRangesFor(false);
        }
        if (!this.getHighSpeedVideoFpsRanges.isLaidOut()) {
            if (z) {
                this.getOutputMinFrameDuration.setVisibility(4);
                this.getHighSpeedVideoSizesFor.setVisibility(0);
                return;
            } else {
                this.getOutputMinFrameDuration.setVisibility(0);
                this.getHighSpeedVideoSizesFor.setVisibility(8);
                return;
            }
        }
        if (z) {
            viewPropertyAnimatorCompat2 = this.getOutputMinFrameDuration.setupAnimatorToVisibility(4, 100L);
            viewPropertyAnimatorCompat = this.getHighSpeedVideoSizesFor.setupAnimatorToVisibility(0, 200L);
        } else {
            viewPropertyAnimatorCompat = this.getOutputMinFrameDuration.setupAnimatorToVisibility(0, 200L);
            viewPropertyAnimatorCompat2 = this.getHighSpeedVideoSizesFor.setupAnimatorToVisibility(8, 100L);
        }
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.playSequentially(viewPropertyAnimatorCompat2, viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompatSet.start();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME != null) {
            selectTab(null);
        }
        this.AMEXKernel.clear();
        androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView = this.unwrapAs;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.removeAllTabs();
        }
        this._CREATION = -1;
    }
}
