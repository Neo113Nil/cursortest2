package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "set", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "get", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.ViewTreeLifecycleOwner, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276ViewTreeLifecycleOwner {
    public static final void set(android.view.View view, androidx.view.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setTag(androidx.view.runtime.R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }

    public static final androidx.view.LifecycleOwner get(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        while (view != null) {
            java.lang.Object tag = view.getTag(androidx.view.runtime.R.id.view_tree_lifecycle_owner);
            androidx.view.LifecycleOwner lifecycleOwner = tag instanceof androidx.view.LifecycleOwner ? (androidx.view.LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            java.lang.Object parentOrViewTreeDisjointParent = androidx.core.viewtree.ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof android.view.View ? (android.view.View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }
}
