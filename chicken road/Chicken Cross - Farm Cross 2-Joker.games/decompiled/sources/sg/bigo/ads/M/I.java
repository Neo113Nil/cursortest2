package sg.bigo.ads.M;

import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.RunnableC5480a;

/* loaded from: classes3.dex */
public final class I implements sg.bigo.ads.v.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f12428a;

    public I(Q q) {
        this.f12428a = q;
    }

    @Override // sg.bigo.ads.v.t
    public final void a() {
        Q q = this.f12428a;
        int a2 = q.d.a(q.h.e);
        C5481b c5481b = this.f12428a.g;
        if (c5481b.g) {
            AbstractC5446j.a(2, new RunnableC5480a(c5481b, a2));
        }
    }

    @Override // sg.bigo.ads.v.t
    public final void b() {
        this.f12428a.h.m = null;
        a();
    }
}
