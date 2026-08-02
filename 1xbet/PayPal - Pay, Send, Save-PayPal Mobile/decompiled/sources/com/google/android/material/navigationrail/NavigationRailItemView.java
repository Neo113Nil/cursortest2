package com.google.android.material.navigationrail;

/* loaded from: classes8.dex */
final class NavigationRailItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public NavigationRailItemView(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), java.lang.Math.max(getMeasuredHeight(), android.view.View.MeasureSpec.getSize(i2)));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public final int getItemLayoutResId() {
        return com.google.android.material.R.layout.mtrl_navigation_rail_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public final int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_rail_icon_margin;
    }
}
