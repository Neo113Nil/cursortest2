package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "Landroidx/activity/FullyDrawnReporterOwner;", "fullyDrawnReporterOwner", "", "set", "(Landroid/view/View;Landroidx/activity/FullyDrawnReporterOwner;)V", "get", "(Landroid/view/View;)Landroidx/activity/FullyDrawnReporterOwner;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class View {
    public static final void set(android.view.View view, androidx.view.FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "");
        view.setTag(androidx.view.R.id.report_drawn, fullyDrawnReporterOwner);
    }

    public static final androidx.view.FullyDrawnReporterOwner get(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        while (view != null) {
            java.lang.Object tag = view.getTag(androidx.view.R.id.report_drawn);
            androidx.view.FullyDrawnReporterOwner fullyDrawnReporterOwner = tag instanceof androidx.view.FullyDrawnReporterOwner ? (androidx.view.FullyDrawnReporterOwner) tag : null;
            if (fullyDrawnReporterOwner != null) {
                return fullyDrawnReporterOwner;
            }
            java.lang.Object parentOrViewTreeDisjointParent = androidx.core.viewtree.ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof android.view.View ? (android.view.View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }
}
