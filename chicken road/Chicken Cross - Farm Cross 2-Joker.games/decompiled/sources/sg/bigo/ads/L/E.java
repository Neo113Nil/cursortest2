package sg.bigo.ads.L;

import android.graphics.Rect;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.InterfaceC5216w;

/* loaded from: classes3.dex */
public final class E implements InterfaceC5216w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f12370a;

    public E(N n) {
        this.f12370a = n;
    }

    @Override // sg.bigo.ads.h.InterfaceC5216w
    public final void a(Rect rect) {
    }

    @Override // sg.bigo.ads.h.InterfaceC5216w
    public final void a() {
        N n = this.f12370a;
        if (n.Y != null) {
            if (n.y()) {
                this.f12370a.a(this.f12370a.B() ? 1 == ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.f12370a.U.e())).E ? 4 : 5 : 2, 2);
                return;
            }
            n = this.f12370a;
        }
        n.c(8);
    }
}
