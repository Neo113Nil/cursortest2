package com.google.android.material.bottomnavigation;

/* loaded from: classes8.dex */
public class BottomNavigationMenuView extends com.google.android.material.navigation.NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final java.util.List<java.lang.Integer> tempChildWidths;

    public BottomNavigationMenuView(android.content.Context context) {
        super(context);
        this.tempChildWidths = new java.util.ArrayList();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        android.content.res.Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        androidx.appcompat.view.menu.MenuBuilder menu = getMenu();
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int size3 = android.view.View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            android.view.View childAt = getChildAt(getSelectedItemPosition());
            int i5 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = java.lang.Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = java.lang.Math.min(size - (this.inactiveItemMinWidth * i6), java.lang.Math.min(i5, this.activeItemMaxWidth));
            int i7 = size - min;
            int min2 = java.lang.Math.min(i7 / (i6 != 0 ? i6 : 1), this.inactiveItemMaxWidth);
            int i8 = i7 - (i6 * min2);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    i4 = i9 == getSelectedItemPosition() ? min : min2;
                    if (i8 > 0) {
                        i4++;
                        i8--;
                    }
                } else {
                    i4 = 0;
                }
                this.tempChildWidths.add(java.lang.Integer.valueOf(i4));
                i9++;
            }
        } else {
            int min3 = java.lang.Math.min(size / (size2 != 0 ? size2 : 1), this.activeItemMaxWidth);
            int i10 = size - (size2 * min3);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getVisibility() == 8) {
                    i3 = 0;
                } else if (i10 > 0) {
                    i3 = min3 + 1;
                    i10--;
                } else {
                    i3 = min3;
                }
                this.tempChildWidths.add(java.lang.Integer.valueOf(i3));
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i13).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i12 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i12, size3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i4 - i2;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
                    int i8 = (i3 - i) - i6;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i5);
                } else {
                    childAt.layout(i6, 0, childAt.getMeasuredWidth() + i6, i5);
                }
                i6 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.itemHorizontalTranslationEnabled = z;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(android.content.Context context) {
        return new com.google.android.material.bottomnavigation.BottomNavigationItemView(context);
    }
}
