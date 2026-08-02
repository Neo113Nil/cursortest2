package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0755u6 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0570p6 f7688j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0792v6 f7689k;

    public C0755u6(C0792v6 c0792v6, ViewTreeObserverOnGlobalLayoutListenerC0570p6 viewTreeObserverOnGlobalLayoutListenerC0570p6) {
        this.f7689k = c0792v6;
        this.f7688j = viewTreeObserverOnGlobalLayoutListenerC0570p6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f7689k.f8105M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f7688j);
        }
    }
}
