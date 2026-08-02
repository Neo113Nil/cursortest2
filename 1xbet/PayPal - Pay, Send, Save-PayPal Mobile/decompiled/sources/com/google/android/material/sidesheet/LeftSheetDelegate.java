package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
final class LeftSheetDelegate extends com.google.android.material.sidesheet.SheetDelegate {
    final com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> sheetBehavior;

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getSheetEdge() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isExpandingOutwards(float f) {
        return f > 0.0f;
    }

    LeftSheetDelegate(com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getHiddenOffset() {
        return (-this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getExpandedOffset() {
        return java.lang.Math.max(0, this.sheetBehavior.getParentInnerEdge() + this.sheetBehavior.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isReleasedCloseToInnerEdge(android.view.View view) {
        return view.getRight() < (getExpandedOffset() - getHiddenOffset()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isSwipeSignificant(float f, float f2) {
        return com.google.android.material.sidesheet.SheetUtils.isSwipeMostlyHorizontal(f, f2) && java.lang.Math.abs(f) > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean shouldHide(android.view.View view, float f) {
        return java.lang.Math.abs(((float) view.getLeft()) + (f * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final <V extends android.view.View> int getOuterEdge(V v) {
        return v.getRight() + this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final float calculateSlideOffset(int i) {
        float hiddenOffset = getHiddenOffset();
        return (i - hiddenOffset) / (getExpandedOffset() - hiddenOffset);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final void updateCoplanarSiblingLayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.sheetBehavior.getParentWidth()) {
            marginLayoutParams.leftMargin = i2;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final void updateCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int getParentInnerEdge(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int calculateInnerMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getMinViewPositionHorizontal() {
        return -this.sheetBehavior.getChildWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getInnerMargin();
    }
}
