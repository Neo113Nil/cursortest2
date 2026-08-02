package com.google.android.material.navigationrail;

/* loaded from: classes8.dex */
public class NavigationRailMenuView extends com.google.android.material.navigation.NavigationBarMenuView {
    private int itemMinimumHeight;
    private final android.widget.FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(android.content.Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measureSharedChildHeights;
        int size = android.view.View.MeasureSpec.getSize(i2);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 > 1 && isShifting(getLabelVisibilityMode(), size2)) {
            measureSharedChildHeights = measureShiftingChildHeights(i, size, size2);
        } else {
            measureSharedChildHeights = measureSharedChildHeights(i, size, size2, null);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.resolveSizeAndState(measureSharedChildHeights, i2, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i5;
                childAt.layout(0, i5, i3 - i, measuredHeight);
                i5 = measuredHeight;
            }
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(android.content.Context context) {
        return new com.google.android.material.navigationrail.NavigationRailItemView(context);
    }

    private int makeSharedHeightSpec(int i, int i2, int i3) {
        int max = i2 / java.lang.Math.max(1, i3);
        int i4 = this.itemMinimumHeight;
        if (i4 == -1) {
            i4 = android.view.View.MeasureSpec.getSize(i);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4, max), 0);
    }

    private int measureShiftingChildHeights(int i, int i2, int i3) {
        int i4;
        android.view.View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = measureChildHeight(childAt, i, makeSharedHeightSpec(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + measureSharedChildHeights(i, i2, i3, childAt);
    }

    private int measureSharedChildHeights(int i, int i2, int i3, android.view.View view) {
        int makeMeasureSpec;
        if (view == null) {
            makeMeasureSpec = makeSharedHeightSpec(i, i2, i3);
        } else {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += measureChildHeight(childAt, i, makeMeasureSpec);
            }
        }
        return i4;
    }

    private int measureChildHeight(android.view.View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    void setMenuGravity(int i) {
        if (this.layoutParams.gravity != i) {
            this.layoutParams.gravity = i;
            setLayoutParams(this.layoutParams);
        }
    }

    int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    public void setItemMinimumHeight(int i) {
        if (this.itemMinimumHeight != i) {
            this.itemMinimumHeight = i;
            requestLayout();
        }
    }

    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    boolean isTopGravity() {
        return (this.layoutParams.gravity & 112) == 48;
    }
}
