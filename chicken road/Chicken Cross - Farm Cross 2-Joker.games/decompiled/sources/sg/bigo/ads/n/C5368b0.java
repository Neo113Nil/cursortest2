package sg.bigo.ads.n;

import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.RunnableC5480a;

/* renamed from: sg.bigo.ads.n.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5368b0 implements sg.bigo.ads.v.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f13160a;

    public C5368b0(U0 u0) {
        this.f13160a = u0;
    }

    @Override // sg.bigo.ads.v.t
    public final void a() {
        U0 u0 = this.f13160a;
        int a2 = u0.C.a(u0.J.e);
        C5481b c5481b = this.f13160a.I;
        if (c5481b.g) {
            AbstractC5446j.a(2, new RunnableC5480a(c5481b, a2));
        }
    }

    @Override // sg.bigo.ads.v.t
    public final void b() {
        this.f13160a.J.m = null;
        a();
    }
}
