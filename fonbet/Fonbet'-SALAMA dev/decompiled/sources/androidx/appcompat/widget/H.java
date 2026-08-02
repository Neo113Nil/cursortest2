package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class H implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0656p f8352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f8353b;

    public H(I i7, ViewTreeObserverOnGlobalLayoutListenerC0656p viewTreeObserverOnGlobalLayoutListenerC0656p) {
        this.f8353b = i7;
        this.f8352a = viewTreeObserverOnGlobalLayoutListenerC0656p;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f8353b.f8360W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8352a);
        }
    }
}
