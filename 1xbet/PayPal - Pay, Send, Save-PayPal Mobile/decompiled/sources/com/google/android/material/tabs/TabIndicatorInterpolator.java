package com.google.android.material.tabs;

/* loaded from: classes8.dex */
class TabIndicatorInterpolator {
    private static final int MIN_INDICATOR_WIDTH = 24;

    TabIndicatorInterpolator() {
    }

    static android.graphics.RectF calculateTabViewContentBounds(com.google.android.material.tabs.TabLayout.TabView tabView, int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) com.google.android.material.internal.ViewUtils.dpToPx(tabView.getContext(), i);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new android.graphics.RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    static android.graphics.RectF calculateIndicatorWidthForTab(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view) {
        if (view == null) {
            return new android.graphics.RectF();
        }
        if (!tabLayout.isTabIndicatorFullWidth() && (view instanceof com.google.android.material.tabs.TabLayout.TabView)) {
            return calculateTabViewContentBounds((com.google.android.material.tabs.TabLayout.TabView) view, 24);
        }
        return new android.graphics.RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    void setIndicatorBoundsForTab(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.graphics.drawable.Drawable drawable) {
        android.graphics.RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
    }

    void updateIndicatorForOffset(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        android.graphics.RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        android.graphics.RectF calculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds(com.google.android.material.animation.AnimationUtils.lerp((int) calculateIndicatorWidthForTab.left, (int) calculateIndicatorWidthForTab2.left, f), drawable.getBounds().top, com.google.android.material.animation.AnimationUtils.lerp((int) calculateIndicatorWidthForTab.right, (int) calculateIndicatorWidthForTab2.right, f), drawable.getBounds().bottom);
    }
}
