package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView {
    private int Camera2StreamConfigurationMap;
    private androidx.appcompat.view.menu.MenuPresenter.Callback getHighResolutionOutputSizeshNQ4ISI;
    androidx.appcompat.view.menu.MenuBuilder.Callback getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private androidx.appcompat.view.menu.MenuBuilder getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private android.content.Context getOutputMinFrameDuration;
    private androidx.appcompat.widget.ActionMenuPresenter getOutputSizes;
    private boolean getOutputStallDurationlomOqCM;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem menuItem);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(android.content.Context context) {
        this(context, null);
    }

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.getHighSpeedVideoSizesFor = (int) (56.0f * f);
        this.getOutputFormats = (int) (f * 4.0f);
        this.getOutputMinFrameDuration = context;
        this.getInputSizeshNQ4ISI = 0;
    }

    public void setPopupTheme(int i) {
        if (this.getInputSizeshNQ4ISI != i) {
            this.getInputSizeshNQ4ISI = i;
            if (i == 0) {
                this.getOutputMinFrameDuration = getContext();
            } else {
                this.getOutputMinFrameDuration = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setPresenter(androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter) {
        this.getOutputSizes = actionMenuPresenter;
        actionMenuPresenter.getHighSpeedVideoFpsRangesFor(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup = this.getOutputSizes.getHighSpeedVideoFpsRanges;
            if (overflowPopup == null || !overflowPopup.isShowing()) {
                return;
            }
            this.getOutputSizes.getHighSpeedVideoFpsRanges();
            this.getOutputSizes.getHighSpeedVideoFpsRangesFor();
        }
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener onMenuItemClickListener) {
        this.getHighSpeedVideoSizes = onMenuItemClickListener;
    }

    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        ?? r5;
        androidx.appcompat.view.menu.MenuBuilder menuBuilder;
        boolean z4 = this.getHighSpeedVideoFpsRangesFor;
        boolean z5 = android.view.View.MeasureSpec.getMode(i) == 1073741824;
        this.getHighSpeedVideoFpsRangesFor = z5;
        if (z4 != z5) {
            this.Camera2StreamConfigurationMap = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        if (this.getHighSpeedVideoFpsRangesFor && (menuBuilder = this.getInputFormats) != null && size != this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.getHighSpeedVideoFpsRangesFor || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(i7).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i);
        int size3 = android.view.View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size2 - (paddingLeft + paddingRight);
        int i9 = this.getHighSpeedVideoSizesFor;
        int i10 = i8 / i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i11 = i9 + ((i8 % i9) / i10);
        int childCount2 = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z6 = false;
        long j = 0;
        while (i16 < childCount2) {
            android.view.View childAt = getChildAt(i16);
            int i17 = size3;
            int i18 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView;
                int i19 = i13 + 1;
                if (z7) {
                    int i20 = this.getOutputFormats;
                    i6 = i19;
                    r5 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i6 = i19;
                    r5 = 0;
                }
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt.getLayoutParams();
                layoutParams2.Camera2StreamConfigurationMap = r5;
                layoutParams2.extraPixels = r5;
                layoutParams2.cellsUsed = r5;
                layoutParams2.expandable = r5;
                layoutParams2.leftMargin = r5;
                layoutParams2.rightMargin = r5;
                layoutParams2.preventEdgeOffset = z7 && ((androidx.appcompat.view.menu.ActionMenuItemView) childAt).hasText();
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(childAt, i11, layoutParams2.isOverflowButton ? 1 : i10, childMeasureSpec, paddingTop);
                i14 = java.lang.Math.max(i14, highSpeedVideoFpsRanges);
                if (layoutParams2.expandable) {
                    i15++;
                }
                if (layoutParams2.isOverflowButton) {
                    z6 = true;
                }
                i10 -= highSpeedVideoFpsRanges;
                i12 = java.lang.Math.max(i12, childAt.getMeasuredHeight());
                if (highSpeedVideoFpsRanges == 1) {
                    j |= 1 << i16;
                }
                i13 = i6;
            }
            i16++;
            size3 = i17;
            i8 = i18;
        }
        int i21 = i8;
        int i22 = size3;
        boolean z8 = z6 && i13 == 2;
        boolean z9 = false;
        while (i15 > 0 && i10 > 0) {
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i24 < childCount2) {
                int i26 = i12;
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams3 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(i24).getLayoutParams();
                boolean z10 = z9;
                if (layoutParams3.expandable) {
                    if (layoutParams3.cellsUsed < i23) {
                        j2 = 1 << i24;
                        i23 = layoutParams3.cellsUsed;
                        i25 = 1;
                    } else if (layoutParams3.cellsUsed == i23) {
                        j2 |= 1 << i24;
                        i25++;
                    }
                }
                i24++;
                z9 = z10;
                i12 = i26;
            }
            i3 = i12;
            z = z9;
            j |= j2;
            if (i25 > i10) {
                break;
            }
            int i27 = 0;
            while (i27 < childCount2) {
                android.view.View childAt2 = getChildAt(i27);
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams4 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt2.getLayoutParams();
                int i28 = i15;
                long j3 = 1 << i27;
                if ((j2 & j3) == 0) {
                    if (layoutParams4.cellsUsed == i23 + 1) {
                        j |= j3;
                    }
                    z3 = z8;
                } else {
                    if (z8 && layoutParams4.preventEdgeOffset && i10 == 1) {
                        int i29 = this.getOutputFormats;
                        z3 = z8;
                        childAt2.setPadding(i29 + i11, 0, i29, 0);
                    } else {
                        z3 = z8;
                    }
                    layoutParams4.cellsUsed++;
                    layoutParams4.Camera2StreamConfigurationMap = true;
                    i10--;
                }
                i27++;
                i15 = i28;
                z8 = z3;
            }
            i12 = i3;
            z9 = true;
        }
        i3 = i12;
        z = z9;
        boolean z11 = !z6 && i13 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i13 - 1 && !z11 && i14 <= 1)) {
            z2 = z;
        } else {
            float bitCount = java.lang.Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
                int i30 = childCount2 - 1;
                if ((j & (1 << i30)) != 0 && !((androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(i30).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            }
            int i31 = bitCount > 0.0f ? (int) ((i10 * i11) / bitCount) : 0;
            boolean z12 = z;
            for (int i32 = 0; i32 < childCount2; i32++) {
                if ((j & (1 << i32)) != 0) {
                    android.view.View childAt3 = getChildAt(i32);
                    androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams5 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                        layoutParams5.extraPixels = i31;
                        layoutParams5.Camera2StreamConfigurationMap = true;
                        if (i32 == 0 && !layoutParams5.preventEdgeOffset) {
                            layoutParams5.leftMargin = (-i31) / 2;
                        }
                        z12 = true;
                    } else if (layoutParams5.isOverflowButton) {
                        layoutParams5.extraPixels = i31;
                        layoutParams5.Camera2StreamConfigurationMap = true;
                        layoutParams5.rightMargin = (-i31) / 2;
                        z12 = true;
                    } else {
                        if (i32 != 0) {
                            layoutParams5.leftMargin = i31 / 2;
                        }
                        if (i32 != childCount2 - 1) {
                            layoutParams5.rightMargin = i31 / 2;
                        }
                    }
                }
            }
            z2 = z12;
        }
        if (z2) {
            for (int i33 = 0; i33 < childCount2; i33++) {
                android.view.View childAt4 = getChildAt(i33);
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt4.getLayoutParams();
                if (layoutParams6.Camera2StreamConfigurationMap) {
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((layoutParams6.cellsUsed * i11) + layoutParams6.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode == 1073741824) {
            i5 = i22;
            i4 = i21;
        } else {
            i4 = i21;
            i5 = i3;
        }
        setMeasuredDimension(i4, i5);
    }

    static int getHighSpeedVideoFpsRanges(android.view.View view, int i, int i2, int i3, int i4) {
        int i5;
        androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i3) - i4, android.view.View.MeasureSpec.getMode(i3));
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = view instanceof androidx.appcompat.view.menu.ActionMenuItemView ? (androidx.appcompat.view.menu.ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.hasText();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
                if (!layoutParams.isOverflowButton && z2) {
                    z = true;
                }
                layoutParams.expandable = z;
                layoutParams.cellsUsed = i5;
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!layoutParams.isOverflowButton) {
            z = true;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = i5;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.getHighSpeedVideoFpsRangesFor) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    hasSupportDividerBeforeChildAt(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            android.view.View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = java.lang.Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                android.view.View childAt3 = getChildAt(i15);
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i16 = width2 - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt4 = getChildAt(i18);
            androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams3 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i19 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.Camera2StreamConfigurationMap;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.getOutputFormats = true;
            actionMenuPresenter.getHighSpeedVideoFpsRangesFor = drawable;
        }
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.Camera2StreamConfigurationMap;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (actionMenuPresenter.getOutputFormats) {
            return actionMenuPresenter.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    public boolean isOverflowReserved() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setOverflowReserved(boolean z) {
        this.getOutputStallDurationlomOqCM = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams() {
        androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = new androidx.appcompat.widget.ActionMenuView.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionMenuView.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams) {
                layoutParams2 = new androidx.appcompat.widget.ActionMenuView.LayoutParams((androidx.appcompat.widget.ActionMenuView.LayoutParams) layoutParams);
            } else {
                layoutParams2 = new androidx.appcompat.widget.ActionMenuView.LayoutParams(layoutParams);
            }
            if (layoutParams2.gravity <= 0) {
                layoutParams2.gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams;
    }

    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateOverflowButtonLayoutParams() {
        androidx.appcompat.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return this.getInputFormats.performItemAction(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.getInputFormats = menuBuilder;
    }

    public android.view.Menu getMenu() {
        if (this.getInputFormats == null) {
            android.content.Context context = getContext();
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = new androidx.appcompat.view.menu.MenuBuilder(context);
            this.getInputFormats = menuBuilder;
            menuBuilder.setCallback(new androidx.appcompat.widget.ActionMenuView.MenuBuilderCallback());
            androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = new androidx.appcompat.widget.ActionMenuPresenter(context);
            this.getOutputSizes = actionMenuPresenter;
            actionMenuPresenter.getInputSizeshNQ4ISI = true;
            actionMenuPresenter.getInputFormats = true;
            androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter2 = this.getOutputSizes;
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
            if (callback == null) {
                callback = new androidx.appcompat.widget.ActionMenuView.ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(callback);
            this.getInputFormats.addMenuPresenter(this.getOutputSizes, this.getOutputMinFrameDuration);
            this.getOutputSizes.getHighSpeedVideoFpsRangesFor(this);
        }
        return this.getInputFormats;
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback callback, androidx.appcompat.view.menu.MenuBuilder.Callback callback2) {
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
        this.getHighSpeedVideoFpsRanges = callback2;
    }

    public androidx.appcompat.view.menu.MenuBuilder peekMenu() {
        return this.getInputFormats;
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        return actionMenuPresenter != null && actionMenuPresenter.getHighSpeedVideoFpsRangesFor();
    }

    public boolean hideOverflowMenu() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        return actionMenuPresenter != null && actionMenuPresenter.getHighSpeedVideoFpsRanges();
    }

    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup;
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        return (actionMenuPresenter == null || (overflowPopup = actionMenuPresenter.getHighSpeedVideoFpsRanges) == null || !overflowPopup.isShowing()) ? false : true;
    }

    public boolean isOverflowMenuShowPending() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        if (actionMenuPresenter == null) {
            return false;
        }
        if (actionMenuPresenter.getOutputMinFrameDuration != null) {
            return true;
        }
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup = actionMenuPresenter.getHighSpeedVideoFpsRanges;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    public void dismissPopupMenus() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.getOutputSizes;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    protected boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView)) {
            z = ((androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView)) ? z : ((androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) childAt2).needsDividerBefore() | z;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.getOutputSizes.Camera2StreamConfigurationMap(z);
    }

    class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
            return androidx.appcompat.widget.ActionMenuView.this.getHighSpeedVideoSizes != null && androidx.appcompat.widget.ActionMenuView.this.getHighSpeedVideoSizes.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            if (androidx.appcompat.widget.ActionMenuView.this.getHighSpeedVideoFpsRanges != null) {
                androidx.appcompat.widget.ActionMenuView.this.getHighSpeedVideoFpsRanges.onMenuModeChange(menuBuilder);
            }
        }
    }

    static class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            return false;
        }

        ActionMenuPresenterCallback() {
        }
    }

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {
        boolean Camera2StreamConfigurationMap;

        @android.view.ViewDebug.ExportedProperty
        public int cellsUsed;

        @android.view.ViewDebug.ExportedProperty
        public boolean expandable;

        @android.view.ViewDebug.ExportedProperty
        public int extraPixels;

        @android.view.ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @android.view.ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }
    }
}
