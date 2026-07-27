package sg.bigo.ads.K0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class S implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12349a;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;

    public S(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f12349a = view;
        this.b = onGlobalLayoutListener;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.f12349a.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.b.onGlobalLayout();
    }
}
