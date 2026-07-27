package sg.bigo.ads.n;

import android.view.ViewTreeObserver;

/* renamed from: sg.bigo.ads.n.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5384j0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5401s0 f13175a;

    public ViewTreeObserverOnGlobalLayoutListenerC5384j0(C5401s0 c5401s0) {
        this.f13175a = c5401s0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C5401s0 c5401s0 = this.f13175a;
        if (c5401s0.X) {
            return;
        }
        c5401s0.P.getMeasuredWidth();
        c5401s0.c(this.f13175a.P.getMeasuredHeight());
    }
}
