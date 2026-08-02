package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
abstract class SheetDelegate {
    abstract int calculateInnerMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract float calculateSlideOffset(int i);

    abstract int getCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract int getExpandedOffset();

    abstract int getHiddenOffset();

    abstract int getMaxViewPositionHorizontal();

    abstract int getMinViewPositionHorizontal();

    abstract <V extends android.view.View> int getOuterEdge(V v);

    abstract int getParentInnerEdge(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout);

    abstract int getSheetEdge();

    abstract boolean isExpandingOutwards(float f);

    abstract boolean isReleasedCloseToInnerEdge(android.view.View view);

    abstract boolean isSwipeSignificant(float f, float f2);

    abstract boolean shouldHide(android.view.View view, float f);

    abstract void updateCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    abstract void updateCoplanarSiblingLayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    SheetDelegate() {
    }
}
