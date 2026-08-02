package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
final class RightSheetDelegate extends com.google.android.material.sidesheet.SheetDelegate {
    final com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> sheetBehavior;

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getSheetEdge() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isExpandingOutwards(float f) {
        return f < 0.0f;
    }

    RightSheetDelegate(com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getHiddenOffset() {
        return this.sheetBehavior.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getExpandedOffset() {
        return java.lang.Math.max(0, (getHiddenOffset() - this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isReleasedCloseToInnerEdge(android.view.View view) {
        return view.getLeft() > (getHiddenOffset() + getExpandedOffset()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isSwipeSignificant(float f, float f2) {
        return com.google.android.material.sidesheet.SheetUtils.isSwipeMostlyHorizontal(f, f2) && java.lang.Math.abs(f) > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean shouldHide(android.view.View view, float f) {
        return java.lang.Math.abs(((float) view.getRight()) + (f * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final <V extends android.view.View> int getOuterEdge(V v) {
        return v.getLeft() - this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final float calculateSlideOffset(int i) {
        float hiddenOffset = getHiddenOffset();
        return (hiddenOffset - i) / (hiddenOffset - getExpandedOffset());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final void updateCoplanarSiblingLayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int parentWidth = this.sheetBehavior.getParentWidth();
        if (i <= parentWidth) {
            marginLayoutParams.rightMargin = parentWidth - i;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final void updateCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int getParentInnerEdge(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int calculateInnerMargin(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getMinViewPositionHorizontal() {
        return getExpandedOffset();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getParentWidth();
    }
}
