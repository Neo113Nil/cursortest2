package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lcoil3/request/ViewTargetRequestManager;", "getRequestManager", "(Landroid/view/View;)Lcoil3/request/ViewTargetRequestManager;", "requestManager"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.request.ViewTargetRequestManagerKt, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C0300ViewTargetRequestManagerKt {
    public static final coil3.view.ViewTargetRequestManager getRequestManager(android.view.View view) {
        coil3.view.ViewTargetRequestManager viewTargetRequestManager;
        java.lang.Object tag = view.getTag(coil3.core.R.id.coil3_request_manager);
        coil3.view.ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof coil3.view.ViewTargetRequestManager ? (coil3.view.ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            java.lang.Object tag2 = view.getTag(coil3.core.R.id.coil3_request_manager);
            viewTargetRequestManager = tag2 instanceof coil3.view.ViewTargetRequestManager ? (coil3.view.ViewTargetRequestManager) tag2 : null;
            if (viewTargetRequestManager == null) {
                viewTargetRequestManager = new coil3.view.ViewTargetRequestManager(view);
                view.addOnAttachStateChangeListener(viewTargetRequestManager);
                view.setTag(coil3.core.R.id.coil3_request_manager, viewTargetRequestManager);
            }
        }
        return viewTargetRequestManager;
    }
}
