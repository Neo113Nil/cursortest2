package g0;

import A0.C0058t;
import A0.F;
import r.C2316B;
import r.C2322H;
import r.P;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962g {

    /* renamed from: a, reason: collision with root package name */
    public final C1965j f17023a;

    /* renamed from: b, reason: collision with root package name */
    public final F f17024b;

    /* renamed from: c, reason: collision with root package name */
    public final C2322H f17025c;

    /* renamed from: d, reason: collision with root package name */
    public final C2322H f17026d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17027e;

    public C1962g(C1965j c1965j, F f) {
        this.f17023a = c1965j;
        this.f17024b = f;
        int i = P.f18958a;
        this.f17025c = new C2322H();
        this.f17026d = new C2322H();
    }

    public final void a() {
        if (this.f17027e) {
            return;
        }
        C0058t c0058t = new C0058t(0, this, C1962g.class, "invalidateNodes", "invalidateNodes()V", 0, 9);
        C2316B c2316b = this.f17024b.f200F0;
        if (c2316b.f(c0058t) < 0) {
            c2316b.a(c0058t);
        }
        this.f17027e = true;
    }
}
