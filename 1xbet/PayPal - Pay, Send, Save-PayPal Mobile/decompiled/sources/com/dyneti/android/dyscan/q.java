package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class q implements android.view.ViewGroup.OnHierarchyChangeListener {
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        if (view != null) {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        }
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
    }
}
