package sg.bigo.ads.n;

import android.view.ViewTreeObserver;
import sg.bigo.ads.K0.AbstractC4963u;

/* renamed from: sg.bigo.ads.n.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5393o implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5408w f13182a;

    public ViewTreeObserverOnGlobalLayoutListenerC5393o(C5408w c5408w) {
        this.f13182a = c5408w;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int a2 = AbstractC4963u.a(this.f13182a.F.getContext(), 12);
        C5408w c5408w = this.f13182a;
        c5408w.a(c5408w.F.getMeasuredWidth(), this.f13182a.F.getMeasuredHeight(), a2, a2);
        C5408w c5408w2 = this.f13182a;
        sg.bigo.ads.K0.X.a(c5408w2.F, new ViewTreeObserverOnGlobalLayoutListenerC5395p(c5408w2));
    }
}
