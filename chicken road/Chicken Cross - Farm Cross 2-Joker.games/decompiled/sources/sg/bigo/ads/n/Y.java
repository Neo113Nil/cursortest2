package sg.bigo.ads.n;

import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.RunnableC5480a;

/* loaded from: classes3.dex */
public final class Y implements sg.bigo.ads.v.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f13155a;
    public final /* synthetic */ U0 b;

    public Y(U0 u0, sg.bigo.ads.v.d dVar) {
        this.b = u0;
        this.f13155a = dVar;
    }

    @Override // sg.bigo.ads.v.t
    public final void a() {
        int a2 = this.b.C.a(this.f13155a.e);
        C5481b c5481b = this.b.I;
        if (c5481b.g) {
            AbstractC5446j.a(2, new RunnableC5480a(c5481b, a2));
        }
    }

    @Override // sg.bigo.ads.v.t
    public final void b() {
        this.f13155a.m = null;
        a();
    }
}
