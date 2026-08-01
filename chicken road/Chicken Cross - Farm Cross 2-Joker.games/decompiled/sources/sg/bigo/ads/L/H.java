package sg.bigo.ads.L;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class H implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f12373a;

    public H(N n) {
        this.f12373a = n;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        N n = this.f12373a;
        if (n.U.u) {
            return;
        }
        boolean isAttachedToWindow = n.b0.isAttachedToWindow();
        if (!z || !isAttachedToWindow) {
            N n2 = this.f12373a;
            sg.bigo.ads.M.F f = n2.Q;
            if (f != null) {
                f.a(false);
            }
            sg.bigo.ads.M.E e = n2.S;
            if (e != null) {
                e.a(false);
            }
            K k = n2.h0;
            if (k != null) {
                k.d();
            }
            this.f12373a.D();
            return;
        }
        N n3 = this.f12373a;
        sg.bigo.ads.M.F f2 = n3.Q;
        if (f2 != null) {
            f2.a(true);
        }
        sg.bigo.ads.M.E e2 = n3.S;
        if (e2 != null) {
            e2.a(true);
        }
        K k2 = n3.h0;
        if (k2 != null && k2.b()) {
            n3.h0.e();
        }
        this.f12373a.E();
    }
}
