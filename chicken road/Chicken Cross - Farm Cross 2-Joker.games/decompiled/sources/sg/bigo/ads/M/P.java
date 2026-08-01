package sg.bigo.ads.M;

import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.RunnableC5480a;

/* loaded from: classes3.dex */
public final class P implements sg.bigo.ads.v.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f12435a;
    public final /* synthetic */ Q b;

    public P(Q q, sg.bigo.ads.v.d dVar) {
        this.b = q;
        this.f12435a = dVar;
    }

    @Override // sg.bigo.ads.v.t
    public final void a() {
        int a2 = this.b.d.a(this.f12435a.e);
        C5481b c5481b = this.b.g;
        if (c5481b.g) {
            AbstractC5446j.a(2, new RunnableC5480a(c5481b, a2));
        }
    }

    @Override // sg.bigo.ads.v.t
    public final void b() {
        this.f12435a.m = null;
        a();
    }
}
