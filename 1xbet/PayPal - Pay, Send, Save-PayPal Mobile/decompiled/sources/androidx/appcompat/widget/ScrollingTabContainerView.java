package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {
    private static final android.view.animation.Interpolator Camera2StreamConfigurationMap = new android.view.animation.DecelerateInterpolator();
    java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    androidx.appcompat.widget.LinearLayoutCompat getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private androidx.appcompat.widget.ScrollingTabContainerView.TabClickListener getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private android.widget.Spinner getOutputMinFrameDuration;
    protected final androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener;
    protected android.view.ViewPropertyAnimator mVisibilityAnim;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
    }

    public ScrollingTabContainerView(android.content.Context context) {
        super(context);
        this.mVisAnimListener = new androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.ActionBarPolicy actionBarPolicy = androidx.appcompat.view.ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.getHighSpeedVideoFpsRanges = actionBarPolicy.getStackedTabMaxWidth();
        androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = new androidx.appcompat.widget.LinearLayoutCompat(getContext(), null, androidx.appcompat.R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-2, -1));
        this.getHighSpeedVideoFpsRangesFor = linearLayoutCompat;
        addView(linearLayoutCompat, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.getHighSpeedVideoFpsRangesFor.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.getHighSpeedVideoSizes = (int) (android.view.View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.getHighSpeedVideoSizes = android.view.View.MeasureSpec.getSize(i) / 2;
            }
            this.getHighSpeedVideoSizes = java.lang.Math.min(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        } else {
            this.getHighSpeedVideoSizes = -1;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.getInputFormats, 1073741824);
        if (!z && this.getInputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor.measure(0, makeMeasureSpec);
            if (this.getHighSpeedVideoFpsRangesFor.getMeasuredWidth() <= android.view.View.MeasureSpec.getSize(i)) {
                getHighSpeedVideoSizes();
            } else {
                android.widget.Spinner spinner = this.getOutputMinFrameDuration;
                if (spinner == null || spinner.getParent() != this) {
                    if (this.getOutputMinFrameDuration == null) {
                        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = new androidx.appcompat.widget.AppCompatSpinner(getContext(), null, androidx.appcompat.R.attr.actionDropDownStyle);
                        appCompatSpinner.setLayoutParams(new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner.setOnItemSelectedListener(this);
                        this.getOutputMinFrameDuration = appCompatSpinner;
                    }
                    removeView(this.getHighSpeedVideoFpsRangesFor);
                    addView(this.getOutputMinFrameDuration, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (this.getOutputMinFrameDuration.getAdapter() == null) {
                        this.getOutputMinFrameDuration.setAdapter((android.widget.SpinnerAdapter) new androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter());
                    }
                    java.lang.Runnable runnable = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                    }
                    this.getOutputMinFrameDuration.setSelection(this.getOutputFormats);
                }
            }
        } else {
            getHighSpeedVideoSizes();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.getOutputFormats);
    }

    public void setAllowCollapse(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public void setTabSelected(int i) {
        this.getOutputFormats = i;
        int childCount = this.getHighSpeedVideoFpsRangesFor.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            android.view.View childAt = this.getHighSpeedVideoFpsRangesFor.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
            i2++;
        }
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }

    public void setContentHeight(int i) {
        this.getInputFormats = i;
        requestLayout();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.ActionBarPolicy actionBarPolicy = androidx.appcompat.view.ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.getHighSpeedVideoFpsRanges = actionBarPolicy.getStackedTabMaxWidth();
    }

    public void animateToVisibility(int i) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            android.view.ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(Camera2StreamConfigurationMap);
            alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
            alpha.start();
            return;
        }
        android.view.ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(Camera2StreamConfigurationMap);
        alpha2.setListener(this.mVisAnimListener.withFinalVisibility(alpha2, i));
        alpha2.start();
    }

    public void animateToTab(int i) {
        final android.view.View childAt = this.getHighSpeedVideoFpsRangesFor.getChildAt(i);
        java.lang.Runnable runnable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: androidx.appcompat.widget.ScrollingTabContainerView.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((androidx.appcompat.widget.ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                androidx.appcompat.widget.ScrollingTabContainerView.this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = runnable2;
        post(runnable2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.Runnable runnable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    final androidx.appcompat.widget.ScrollingTabContainerView.TabView getHighSpeedVideoFpsRanges(androidx.appcompat.app.ActionBar.Tab tab, boolean z) {
        androidx.appcompat.widget.ScrollingTabContainerView.TabView tabView = new androidx.appcompat.widget.ScrollingTabContainerView.TabView(getContext(), tab, z);
        if (z) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, this.getInputFormats));
            return tabView;
        }
        tabView.setFocusable(true);
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new androidx.appcompat.widget.ScrollingTabContainerView.TabClickListener();
        }
        tabView.setOnClickListener(this.getHighSpeedVideoSizesFor);
        return tabView;
    }

    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, boolean z) {
        androidx.appcompat.widget.ScrollingTabContainerView.TabView highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(tab, false);
        this.getHighSpeedVideoFpsRangesFor.addView(highSpeedVideoFpsRanges, new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner != null) {
            ((androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            highSpeedVideoFpsRanges.setSelected(true);
        }
        if (this.getInputSizeshNQ4ISI) {
            requestLayout();
        }
    }

    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i, boolean z) {
        androidx.appcompat.widget.ScrollingTabContainerView.TabView highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(tab, false);
        this.getHighSpeedVideoFpsRangesFor.addView(highSpeedVideoFpsRanges, i, new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner != null) {
            ((androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            highSpeedVideoFpsRanges.setSelected(true);
        }
        if (this.getInputSizeshNQ4ISI) {
            requestLayout();
        }
    }

    public void updateTab(int i) {
        ((androidx.appcompat.widget.ScrollingTabContainerView.TabView) this.getHighSpeedVideoFpsRangesFor.getChildAt(i)).getHighResolutionOutputSizeshNQ4ISI();
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner != null) {
            ((androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.getInputSizeshNQ4ISI) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.getHighSpeedVideoFpsRangesFor.removeViewAt(i);
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner != null) {
            ((androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.getInputSizeshNQ4ISI) {
            requestLayout();
        }
    }

    public void removeAllTabs() {
        this.getHighSpeedVideoFpsRangesFor.removeAllViews();
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner != null) {
            ((androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.getInputSizeshNQ4ISI) {
            requestLayout();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        ((androidx.appcompat.widget.ScrollingTabContainerView.TabView) view).getHighSpeedVideoFpsRangesFor.select();
    }

    class TabView extends android.widget.LinearLayout {
        private android.widget.ImageView Camera2StreamConfigurationMap;
        private android.view.View getHighSpeedVideoFpsRanges;
        androidx.appcompat.app.ActionBar.Tab getHighSpeedVideoFpsRangesFor;
        private final int[] getHighSpeedVideoSizes;
        private android.widget.TextView getOutputMinFrameDuration;

        public TabView(android.content.Context context, androidx.appcompat.app.ActionBar.Tab tab, boolean z) {
            super(context, null, androidx.appcompat.R.attr.actionBarTabStyle);
            int[] iArr = {android.R.attr.background};
            this.getHighSpeedVideoSizes = iArr;
            this.getHighSpeedVideoFpsRangesFor = tab;
            androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, null, iArr, androidx.appcompat.R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoSizes <= 0 || getMeasuredWidth() <= androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoSizes) {
                return;
            }
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoSizes, 1073741824), i2);
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            androidx.appcompat.app.ActionBar.Tab tab = this.getHighSpeedVideoFpsRangesFor;
            android.view.View customView = tab.getCustomView();
            if (customView != null) {
                android.view.ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((android.view.ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.getHighSpeedVideoFpsRanges = customView;
                android.widget.TextView textView = this.getOutputMinFrameDuration;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.widget.ImageView imageView = this.Camera2StreamConfigurationMap;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.Camera2StreamConfigurationMap.setImageDrawable(null);
                    return;
                }
                return;
            }
            android.view.View view = this.getHighSpeedVideoFpsRanges;
            if (view != null) {
                removeView(view);
                this.getHighSpeedVideoFpsRanges = null;
            }
            android.graphics.drawable.Drawable icon = tab.getIcon();
            java.lang.CharSequence text = tab.getText();
            if (icon != null) {
                if (this.Camera2StreamConfigurationMap == null) {
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView = new androidx.appcompat.widget.AppCompatImageView(getContext());
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.Camera2StreamConfigurationMap = appCompatImageView;
                }
                this.Camera2StreamConfigurationMap.setImageDrawable(icon);
                this.Camera2StreamConfigurationMap.setVisibility(0);
            } else {
                android.widget.ImageView imageView2 = this.Camera2StreamConfigurationMap;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.Camera2StreamConfigurationMap.setImageDrawable(null);
                }
            }
            boolean isEmpty = android.text.TextUtils.isEmpty(text);
            if (!isEmpty) {
                if (this.getOutputMinFrameDuration == null) {
                    androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext(), null, androidx.appcompat.R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.getOutputMinFrameDuration = appCompatTextView;
                }
                this.getOutputMinFrameDuration.setText(text);
                this.getOutputMinFrameDuration.setVisibility(0);
            } else {
                android.widget.TextView textView2 = this.getOutputMinFrameDuration;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.getOutputMinFrameDuration.setText((java.lang.CharSequence) null);
                }
            }
            android.widget.ImageView imageView3 = this.Camera2StreamConfigurationMap;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.getContentDescription());
            }
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, isEmpty ? tab.getContentDescription() : null);
        }
    }

    class TabAdapter extends android.widget.BaseAdapter {
        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        TabAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoFpsRangesFor.getChildCount();
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            return ((androidx.appcompat.widget.ScrollingTabContainerView.TabView) androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoFpsRangesFor.getChildAt(i)).getHighSpeedVideoFpsRangesFor;
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            if (view == null) {
                return androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoFpsRanges((androidx.appcompat.app.ActionBar.Tab) getItem(i), true);
            }
            androidx.appcompat.widget.ScrollingTabContainerView.TabView tabView = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) view;
            tabView.getHighSpeedVideoFpsRangesFor = (androidx.appcompat.app.ActionBar.Tab) getItem(i);
            tabView.getHighResolutionOutputSizeshNQ4ISI();
            return view;
        }
    }

    class TabClickListener implements android.view.View.OnClickListener {
        TabClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            ((androidx.appcompat.widget.ScrollingTabContainerView.TabView) view).getHighSpeedVideoFpsRangesFor.select();
            int childCount = androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoFpsRangesFor.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = androidx.appcompat.widget.ScrollingTabContainerView.this.getHighSpeedVideoFpsRangesFor.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes5.dex */
    protected class VisibilityAnimListener extends android.animation.AnimatorListenerAdapter {
        private boolean getHighSpeedVideoFpsRanges = false;
        private int getHighSpeedVideoFpsRangesFor;

        protected VisibilityAnimListener() {
        }

        public androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(android.view.ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            androidx.appcompat.widget.ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.appcompat.widget.ScrollingTabContainerView.this.setVisibility(0);
            this.getHighSpeedVideoFpsRanges = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            androidx.appcompat.widget.ScrollingTabContainerView.this.mVisibilityAnim = null;
            androidx.appcompat.widget.ScrollingTabContainerView.this.setVisibility(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.getHighSpeedVideoFpsRanges = true;
        }
    }

    private boolean getHighSpeedVideoSizes() {
        android.widget.Spinner spinner = this.getOutputMinFrameDuration;
        if (spinner != null && spinner.getParent() == this) {
            removeView(this.getOutputMinFrameDuration);
            addView(this.getHighSpeedVideoFpsRangesFor, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.getOutputMinFrameDuration.getSelectedItemPosition());
        }
        return false;
    }
}
