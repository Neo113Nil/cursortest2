package androidx.core.viewtree;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "Landroid/view/ViewParent;", "getParentOrViewTreeDisjointParent", "(Landroid/view/View;)Landroid/view/ViewParent;", "parent", "", "setViewTreeDisjointParent", "(Landroid/view/View;Landroid/view/ViewParent;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewTree {
    public static final void setViewTreeDisjointParent(android.view.View view, android.view.ViewParent viewParent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setTag(androidx.core.viewtree.R.id.view_tree_disjoint_parent, viewParent);
    }

    public static final android.view.ViewParent getParentOrViewTreeDisjointParent(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        java.lang.Object tag = view.getTag(androidx.core.viewtree.R.id.view_tree_disjoint_parent);
        if (tag instanceof android.view.ViewParent) {
            return (android.view.ViewParent) tag;
        }
        return null;
    }
}
