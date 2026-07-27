package sg.bigo.ads.m;

import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.RunnableC5480a;

/* renamed from: sg.bigo.ads.m.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5326e implements sg.bigo.ads.v.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f13078a;
    public final /* synthetic */ e0 b;

    public C5326e(e0 e0Var, sg.bigo.ads.v.d dVar) {
        this.b = e0Var;
        this.f13078a = dVar;
    }

    @Override // sg.bigo.ads.v.t
    public final void a() {
        int a2 = this.b.q.a(this.f13078a.e);
        C5481b c5481b = this.b.w;
        if (c5481b.g) {
            AbstractC5446j.a(2, new RunnableC5480a(c5481b, a2));
        }
    }

    @Override // sg.bigo.ads.v.t
    public final void b() {
        this.f13078a.m = null;
        a();
    }
}
