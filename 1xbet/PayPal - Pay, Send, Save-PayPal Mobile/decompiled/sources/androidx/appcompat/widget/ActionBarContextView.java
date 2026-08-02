package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbsActionBarView {
    private android.view.View Camera2StreamConfigurationMap;
    private android.view.View getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private android.view.View getHighSpeedVideoSizes;
    private android.widget.TextView getHighSpeedVideoSizesFor;
    private java.lang.CharSequence getInputFormats;
    private int getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private android.widget.LinearLayout getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private android.widget.TextView getOutputSizeshNQ4ISI;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int i) {
        super.animateToVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        return super.setupAnimatorToVisibility(i, j);
    }

    public ActionBarContextView(android.content.Context context) {
        this(context, null);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.actionModeStyle);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.ActionMode, i, 0);
        setBackground(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionMode_background));
        this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionMode_titleTextStyle, 0);
        this.getInputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionMode_height, 0);
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionMode_closeItemLayout, androidx.appcompat.R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.getHighSpeedVideoFpsRanges();
            this.mActionMenuPresenter.getHighSpeedVideoSizes();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.getHighSpeedVideoSizes;
        if (view2 != null) {
            removeView(view2);
        }
        this.getHighSpeedVideoSizes = view;
        if (view != null && (linearLayout = this.getOutputMinFrameDuration) != null) {
            removeView(linearLayout);
            this.getOutputMinFrameDuration = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.getInputFormats = charSequence;
        Camera2StreamConfigurationMap();
        androidx.core.view.ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor = charSequence;
        Camera2StreamConfigurationMap();
    }

    public java.lang.CharSequence getTitle() {
        return this.getInputFormats;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getOutputMinFrameDuration == null) {
            android.view.LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.abc_action_bar_title_item, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.getOutputMinFrameDuration = linearLayout;
            this.getOutputSizeshNQ4ISI = (android.widget.TextView) linearLayout.findViewById(androidx.appcompat.R.id.action_bar_title);
            this.getHighSpeedVideoSizesFor = (android.widget.TextView) this.getOutputMinFrameDuration.findViewById(androidx.appcompat.R.id.action_bar_subtitle);
            if (this.getOutputMinFrameDurationlomOqCM != 0) {
                this.getOutputSizeshNQ4ISI.setTextAppearance(getContext(), this.getOutputMinFrameDurationlomOqCM);
            }
            if (this.getInputSizeshNQ4ISI != 0) {
                this.getHighSpeedVideoSizesFor.setTextAppearance(getContext(), this.getInputSizeshNQ4ISI);
            }
        }
        this.getOutputSizeshNQ4ISI.setText(this.getInputFormats);
        this.getHighSpeedVideoSizesFor.setText(this.getHighSpeedVideoFpsRangesFor);
        boolean isEmpty = android.text.TextUtils.isEmpty(this.getInputFormats);
        boolean isEmpty2 = android.text.TextUtils.isEmpty(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizesFor.setVisibility(!isEmpty2 ? 0 : 8);
        this.getOutputMinFrameDuration.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.getOutputMinFrameDuration.getParent() == null) {
            addView(this.getOutputMinFrameDuration);
        }
    }

    public void initForMode(final androidx.appcompat.view.ActionMode actionMode) {
        android.view.View view = this.getHighResolutionOutputSizeshNQ4ISI;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(this.getHighSpeedVideoFpsRanges, (android.view.ViewGroup) this, false);
            this.getHighResolutionOutputSizeshNQ4ISI = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        android.view.View findViewById = this.getHighResolutionOutputSizeshNQ4ISI.findViewById(androidx.appcompat.R.id.action_mode_close_button);
        this.Camera2StreamConfigurationMap = findViewById;
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                actionMode.finish();
            }
        });
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = (androidx.appcompat.view.menu.MenuBuilder) actionMode.getMenu();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.getHighResolutionOutputSizeshNQ4ISI();
        }
        this.mActionMenuPresenter = new androidx.appcompat.widget.ActionMenuPresenter(getContext());
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        actionMenuPresenter.getInputSizeshNQ4ISI = true;
        actionMenuPresenter.getInputFormats = true;
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        menuBuilder.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        this.mMenuView = (androidx.appcompat.widget.ActionMenuView) this.mActionMenuPresenter.getMenuView(this);
        this.mMenuView.setBackground(null);
        addView(this.mMenuView, layoutParams);
    }

    public void closeMode() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            killMode();
        }
    }

    public void killMode() {
        removeAllViews();
        this.getHighSpeedVideoSizes = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        android.view.View view = this.Camera2StreamConfigurationMap;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.getHighSpeedVideoFpsRangesFor();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.getHighSpeedVideoFpsRanges();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup;
        return (this.mActionMenuPresenter == null || (overflowPopup = this.mActionMenuPresenter.getHighSpeedVideoFpsRanges) == null || !overflowPopup.isShowing()) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = this.mContentHeight > 0 ? this.mContentHeight : android.view.View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        android.view.View view = this.getHighResolutionOutputSizeshNQ4ISI;
        if (view != null) {
            int measureChildView = measureChildView(view, paddingLeft, makeMeasureSpec, 0);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.getHighResolutionOutputSizeshNQ4ISI.getLayoutParams();
            paddingLeft = measureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        if (this.mMenuView != null && this.mMenuView.getParent() == this) {
            paddingLeft = measureChildView(this.mMenuView, paddingLeft, makeMeasureSpec, 0);
        }
        android.widget.LinearLayout linearLayout = this.getOutputMinFrameDuration;
        if (linearLayout != null && this.getHighSpeedVideoSizes == null) {
            if (this.getOutputFormats) {
                this.getOutputMinFrameDuration.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.getOutputMinFrameDuration.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.getOutputMinFrameDuration.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = measureChildView(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        android.view.View view2 = this.getHighSpeedVideoSizes;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = java.lang.Math.min(layoutParams.width, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                i3 = java.lang.Math.min(layoutParams.height, i3);
            }
            this.getHighSpeedVideoSizes.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), android.view.View.MeasureSpec.makeMeasureSpec(i3, i5));
        }
        if (this.mContentHeight <= 0) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i6) {
                    i6 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i6);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean isLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        int paddingRight = isLayoutRtl ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.getHighResolutionOutputSizeshNQ4ISI;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.getHighResolutionOutputSizeshNQ4ISI.getLayoutParams();
            int i5 = isLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = isLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = next(paddingRight, i5, isLayoutRtl);
            paddingRight = next(next + positionChild(this.getHighResolutionOutputSizeshNQ4ISI, next, paddingTop, paddingTop2, isLayoutRtl), i6, isLayoutRtl);
        }
        int i7 = paddingRight;
        android.widget.LinearLayout linearLayout = this.getOutputMinFrameDuration;
        if (linearLayout != null && this.getHighSpeedVideoSizes == null && linearLayout.getVisibility() != 8) {
            i7 += positionChild(this.getOutputMinFrameDuration, i7, paddingTop, paddingTop2, isLayoutRtl);
        }
        int i8 = i7;
        android.view.View view2 = this.getHighSpeedVideoSizes;
        if (view2 != null) {
            positionChild(view2, i8, paddingTop, paddingTop2, isLayoutRtl);
        }
        int paddingLeft = isLayoutRtl ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.mMenuView != null) {
            positionChild(this.mMenuView, paddingLeft, paddingTop, paddingTop2, !isLayoutRtl);
        }
    }

    public void setTitleOptional(boolean z) {
        if (z != this.getOutputFormats) {
            requestLayout();
        }
        this.getOutputFormats = z;
    }

    public boolean isTitleOptional() {
        return this.getOutputFormats;
    }
}
