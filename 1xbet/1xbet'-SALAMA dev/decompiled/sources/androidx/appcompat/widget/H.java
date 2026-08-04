package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class H implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0635p f8352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f8353b;

    public H(I i7, ViewTreeObserverOnGlobalLayoutListenerC0635p viewTreeObserverOnGlobalLayoutListenerC0635p) {
        this.f8353b = i7;
        this.f8352a = viewTreeObserverOnGlobalLayoutListenerC0635p;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f8353b.f8360W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8352a);
        }
    }
}
