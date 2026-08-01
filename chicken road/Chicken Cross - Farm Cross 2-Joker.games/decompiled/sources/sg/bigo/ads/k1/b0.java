package sg.bigo.ads.k1;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f13029a;

    public b0(d0 d0Var) {
        this.f13029a = d0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d0 d0Var = this.f13029a;
        if (!d0Var.f && d0Var.i) {
            d0Var.f = true;
            d0Var.c.removeCallbacks(d0Var.b);
            d0Var.c.postDelayed(d0Var.b, 500L);
        }
        return true;
    }
}
