package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ToolbarWidgetWrapper implements androidx.appcompat.widget.DecorToolbar {
    androidx.appcompat.widget.Toolbar Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    android.view.Window.Callback getHighSpeedVideoFpsRanges;
    private androidx.appcompat.widget.ActionMenuPresenter getHighSpeedVideoFpsRangesFor;
    java.lang.CharSequence getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private android.view.View getInputFormats;
    private java.lang.CharSequence getInputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getOutputFormats;
    private int getOutputMinFrameDuration;
    private android.graphics.drawable.Drawable getOutputMinFrameDurationlomOqCM;
    private android.widget.Spinner getOutputSizes;
    private android.graphics.drawable.Drawable getOutputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private android.view.View isOutputSupportedForhNQ4ISI;
    private java.lang.CharSequence unwrapAs;

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z) {
    }

    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar toolbar, boolean z) {
        this(toolbar, z, androidx.appcompat.R.string.abc_action_bar_up_description, androidx.appcompat.R.drawable.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar toolbar, boolean z, int i, int i2) {
        int i3;
        android.graphics.drawable.Drawable drawable;
        this.getOutputStallDurationlomOqCM = 0;
        this.getOutputMinFrameDuration = 0;
        this.Camera2StreamConfigurationMap = toolbar;
        this.getHighSpeedVideoSizes = toolbar.getTitle();
        this.unwrapAs = toolbar.getSubtitle();
        this.getValidOutputFormatsForInputhNQ4ISI = this.getHighSpeedVideoSizes != null;
        this.getOutputSizeshNQ4ISI = toolbar.getNavigationIcon();
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        this.getOutputFormats = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            java.lang.CharSequence text = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.ActionBar_title);
            if (!android.text.TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            java.lang.CharSequence text2 = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.ActionBar_subtitle);
            if (!android.text.TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_logo);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            android.graphics.drawable.Drawable drawable3 = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_icon);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.getOutputSizeshNQ4ISI == null && (drawable = this.getOutputFormats) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActionBar_displayOptions, 0));
            int resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(android.view.LayoutInflater.from(this.Camera2StreamConfigurationMap.getContext()).inflate(resourceId, (android.view.ViewGroup) this.Camera2StreamConfigurationMap, false));
                setDisplayOptions(this.getHighSpeedVideoSizesFor | 16);
            }
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = this.Camera2StreamConfigurationMap.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.Camera2StreamConfigurationMap.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.Camera2StreamConfigurationMap.setContentInsetsRelative(java.lang.Math.max(dimensionPixelOffset, 0), java.lang.Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                androidx.appcompat.widget.Toolbar toolbar2 = this.Camera2StreamConfigurationMap;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                androidx.appcompat.widget.Toolbar toolbar3 = this.Camera2StreamConfigurationMap;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                this.Camera2StreamConfigurationMap.setPopupTheme(resourceId4);
            }
        } else {
            if (this.Camera2StreamConfigurationMap.getNavigationIcon() != null) {
                this.getOutputFormats = this.Camera2StreamConfigurationMap.getNavigationIcon();
                i3 = 15;
            } else {
                i3 = 11;
            }
            this.getHighSpeedVideoSizesFor = i3;
        }
        obtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i);
        this.getInputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getNavigationContentDescription();
        this.Camera2StreamConfigurationMap.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1
            final androidx.appcompat.view.menu.ActionMenuItem getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.view.menu.ActionMenuItem(androidx.appcompat.widget.ToolbarWidgetWrapper.this.Camera2StreamConfigurationMap.getContext(), 0, android.R.id.home, 0, 0, androidx.appcompat.widget.ToolbarWidgetWrapper.this.getHighSpeedVideoSizes);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (androidx.appcompat.widget.ToolbarWidgetWrapper.this.getHighSpeedVideoFpsRanges == null || !androidx.appcompat.widget.ToolbarWidgetWrapper.this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                androidx.appcompat.widget.ToolbarWidgetWrapper.this.getHighSpeedVideoFpsRanges.onMenuItemSelected(0, this.getHighResolutionOutputSizeshNQ4ISI);
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i) {
        if (i != this.getOutputMinFrameDuration) {
            this.getOutputMinFrameDuration = i;
            if (android.text.TextUtils.isEmpty(this.Camera2StreamConfigurationMap.getNavigationContentDescription())) {
                setNavigationContentDescription(this.getOutputMinFrameDuration);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.ViewGroup getViewGroup() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.content.Context getContext() {
        return this.Camera2StreamConfigurationMap.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.Camera2StreamConfigurationMap.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.Camera2StreamConfigurationMap.collapseActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(android.view.Window.Callback callback) {
        this.getHighSpeedVideoFpsRanges = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            return;
        }
        Camera2StreamConfigurationMap(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getTitle() {
        return this.Camera2StreamConfigurationMap.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(java.lang.CharSequence charSequence) {
        this.getValidOutputFormatsForInputhNQ4ISI = true;
        Camera2StreamConfigurationMap(charSequence);
    }

    private void Camera2StreamConfigurationMap(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes = charSequence;
        if ((this.getHighSpeedVideoSizesFor & 8) != 0) {
            this.Camera2StreamConfigurationMap.setTitle(charSequence);
            if (this.getValidOutputFormatsForInputhNQ4ISI) {
                androidx.core.view.ViewCompat.setAccessibilityPaneTitle(this.Camera2StreamConfigurationMap.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getSubtitle() {
        return this.Camera2StreamConfigurationMap.getSubtitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.unwrapAs = charSequence;
        if ((this.getHighSpeedVideoSizesFor & 8) != 0) {
            this.Camera2StreamConfigurationMap.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
        return this.getOutputStallDuration != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
        return this.getOutputMinFrameDurationlomOqCM != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i) {
        setIcon(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.getOutputStallDuration = drawable;
        getHighSpeedVideoSizes();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int i) {
        setLogo(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(android.graphics.drawable.Drawable drawable) {
        this.getOutputMinFrameDurationlomOqCM = drawable;
        getHighSpeedVideoSizes();
    }

    private void getHighSpeedVideoSizes() {
        android.graphics.drawable.Drawable drawable;
        int i = this.getHighSpeedVideoSizesFor;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.getOutputMinFrameDurationlomOqCM;
            if (drawable == null) {
                drawable = this.getOutputStallDuration;
            }
        } else {
            drawable = this.getOutputStallDuration;
        }
        this.Camera2StreamConfigurationMap.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.Camera2StreamConfigurationMap.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.Camera2StreamConfigurationMap.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.Camera2StreamConfigurationMap.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.Camera2StreamConfigurationMap.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.Camera2StreamConfigurationMap.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(android.view.Menu menu, androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = new androidx.appcompat.widget.ActionMenuPresenter(this.Camera2StreamConfigurationMap.getContext());
            this.getHighSpeedVideoFpsRangesFor = actionMenuPresenter;
            actionMenuPresenter.setId(androidx.appcompat.R.id.action_menu_presenter);
        }
        this.getHighSpeedVideoFpsRangesFor.setCallback(callback);
        this.Camera2StreamConfigurationMap.setMenu((androidx.appcompat.view.menu.MenuBuilder) menu, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.Camera2StreamConfigurationMap.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int i) {
        android.view.View view;
        int i2 = this.getHighSpeedVideoSizesFor ^ i;
        this.getHighSpeedVideoSizesFor = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    getHighResolutionOutputSizeshNQ4ISI();
                }
                getHighSpeedVideoFpsRanges();
            }
            if ((i2 & 3) != 0) {
                getHighSpeedVideoSizes();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.Camera2StreamConfigurationMap.setTitle(this.getHighSpeedVideoSizes);
                    this.Camera2StreamConfigurationMap.setSubtitle(this.unwrapAs);
                } else {
                    this.Camera2StreamConfigurationMap.setTitle((java.lang.CharSequence) null);
                    this.Camera2StreamConfigurationMap.setSubtitle((java.lang.CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.getInputFormats) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.Camera2StreamConfigurationMap.addView(view);
            } else {
                this.Camera2StreamConfigurationMap.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView) {
        android.view.View view = this.isOutputSupportedForhNQ4ISI;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            androidx.appcompat.widget.Toolbar toolbar = this.Camera2StreamConfigurationMap;
            if (parent == toolbar) {
                toolbar.removeView(this.isOutputSupportedForhNQ4ISI);
            }
        }
        this.isOutputSupportedForhNQ4ISI = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.getOutputStallDurationlomOqCM != 2) {
            return;
        }
        this.Camera2StreamConfigurationMap.addView(scrollingTabContainerView, 0);
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) this.isOutputSupportedForhNQ4ISI.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        return this.isOutputSupportedForhNQ4ISI != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.Camera2StreamConfigurationMap.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean z) {
        this.Camera2StreamConfigurationMap.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int i) {
        android.view.View view;
        int i2 = this.getOutputStallDurationlomOqCM;
        if (i != i2) {
            if (i2 == 1) {
                android.widget.Spinner spinner = this.getOutputSizes;
                if (spinner != null) {
                    android.view.ViewParent parent = spinner.getParent();
                    androidx.appcompat.widget.Toolbar toolbar = this.Camera2StreamConfigurationMap;
                    if (parent == toolbar) {
                        toolbar.removeView(this.getOutputSizes);
                    }
                }
            } else if (i2 == 2 && (view = this.isOutputSupportedForhNQ4ISI) != null) {
                android.view.ViewParent parent2 = view.getParent();
                androidx.appcompat.widget.Toolbar toolbar2 = this.Camera2StreamConfigurationMap;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.isOutputSupportedForhNQ4ISI);
                }
            }
            this.getOutputStallDurationlomOqCM = i;
            if (i != 0) {
                if (i == 1) {
                    getHighSpeedVideoFpsRangesFor();
                    this.Camera2StreamConfigurationMap.addView(this.getOutputSizes, 0);
                } else {
                    if (i == 2) {
                        android.view.View view2 = this.isOutputSupportedForhNQ4ISI;
                        if (view2 != null) {
                            this.Camera2StreamConfigurationMap.addView(view2, 0);
                            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) this.isOutputSupportedForhNQ4ISI.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.gravity = 8388691;
                            return;
                        }
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("Invalid navigation mode ".concat(java.lang.String.valueOf(i)));
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getOutputSizes == null) {
            this.getOutputSizes = new androidx.appcompat.widget.AppCompatSpinner(getContext(), null, androidx.appcompat.R.attr.actionDropDownStyle);
            this.getOutputSizes.setLayoutParams(new androidx.appcompat.widget.Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(android.widget.SpinnerAdapter spinnerAdapter, android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        getHighSpeedVideoFpsRangesFor();
        this.getOutputSizes.setAdapter(spinnerAdapter);
        this.getOutputSizes.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i) {
        android.widget.Spinner spinner = this.getOutputSizes;
        if (spinner == null) {
            throw new java.lang.IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        android.widget.Spinner spinner = this.getOutputSizes;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
        android.widget.Spinner spinner = this.getOutputSizes;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(android.view.View view) {
        android.view.View view2 = this.getInputFormats;
        if (view2 != null && (this.getHighSpeedVideoSizesFor & 16) != 0) {
            this.Camera2StreamConfigurationMap.removeView(view2);
        }
        this.getInputFormats = view;
        if (view == null || (this.getHighSpeedVideoSizesFor & 16) == 0) {
            return;
        }
        this.Camera2StreamConfigurationMap.addView(view);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.View getCustomView() {
        return this.getInputFormats;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int i) {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = setupAnimatorToVisibility(i, 200L);
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.start();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int i, long j) {
        return androidx.core.view.ViewCompat.animate(this.Camera2StreamConfigurationMap).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2
            private boolean getHighSpeedVideoFpsRangesFor = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationStart(android.view.View view) {
                androidx.appcompat.widget.ToolbarWidgetWrapper.this.Camera2StreamConfigurationMap.setVisibility(0);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(android.view.View view) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                androidx.appcompat.widget.ToolbarWidgetWrapper.this.Camera2StreamConfigurationMap.setVisibility(i);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationCancel(android.view.View view) {
                this.getHighSpeedVideoFpsRangesFor = true;
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        this.getOutputSizeshNQ4ISI = drawable;
        getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (this.getOutputFormats != drawable) {
            this.getOutputFormats = drawable;
            getHighSpeedVideoFpsRanges();
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        if ((this.getHighSpeedVideoSizesFor & 4) != 0) {
            androidx.appcompat.widget.Toolbar toolbar = this.Camera2StreamConfigurationMap;
            android.graphics.drawable.Drawable drawable = this.getOutputSizeshNQ4ISI;
            if (drawable == null) {
                drawable = this.getOutputFormats;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.Camera2StreamConfigurationMap.setNavigationIcon((android.graphics.drawable.Drawable) null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        this.getInputSizeshNQ4ISI = charSequence;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if ((this.getHighSpeedVideoSizesFor & 4) != 0) {
            if (android.text.TextUtils.isEmpty(this.getInputSizeshNQ4ISI)) {
                this.Camera2StreamConfigurationMap.setNavigationContentDescription(this.getOutputMinFrameDuration);
            } else {
                this.Camera2StreamConfigurationMap.setNavigationContentDescription(this.getInputSizeshNQ4ISI);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        this.Camera2StreamConfigurationMap.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        this.Camera2StreamConfigurationMap.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.Camera2StreamConfigurationMap.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
        return this.Camera2StreamConfigurationMap.getHeight();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i) {
        this.Camera2StreamConfigurationMap.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
        return this.Camera2StreamConfigurationMap.getVisibility();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback callback, androidx.appcompat.view.menu.MenuBuilder.Callback callback2) {
        this.Camera2StreamConfigurationMap.setMenuCallbacks(callback, callback2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.Menu getMenu() {
        return this.Camera2StreamConfigurationMap.getMenu();
    }
}
