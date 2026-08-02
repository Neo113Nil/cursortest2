package com.google.android.material.expandable;

/* loaded from: classes8.dex */
public final class ExpandableWidgetHelper {
    private boolean expanded = false;
    private int expandedComponentIdHint = 0;
    private final android.view.View widget;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidgetHelper(com.google.android.material.expandable.ExpandableWidget expandableWidget) {
        this.widget = (android.view.View) expandableWidget;
    }

    public final boolean setExpanded(boolean z) {
        if (this.expanded == z) {
            return false;
        }
        this.expanded = z;
        dispatchExpandedStateChanged();
        return true;
    }

    public final boolean isExpanded() {
        return this.expanded;
    }

    public final android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("expanded", this.expanded);
        bundle.putInt("expandedComponentIdHint", this.expandedComponentIdHint);
        return bundle;
    }

    public final void onRestoreInstanceState(android.os.Bundle bundle) {
        this.expanded = bundle.getBoolean("expanded", false);
        this.expandedComponentIdHint = bundle.getInt("expandedComponentIdHint", 0);
        if (this.expanded) {
            dispatchExpandedStateChanged();
        }
    }

    public final void setExpandedComponentIdHint(int i) {
        this.expandedComponentIdHint = i;
    }

    public final int getExpandedComponentIdHint() {
        return this.expandedComponentIdHint;
    }

    private void dispatchExpandedStateChanged() {
        android.view.ViewParent parent = this.widget.getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout) parent).dispatchDependentViewsChanged(this.widget);
        }
    }
}
