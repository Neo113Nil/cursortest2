package n4;

import a.AbstractC0603a;
import java.util.HashMap;
import n1.C1450e;

/* loaded from: classes2.dex */
public final class p extends v4.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0603a f15467m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ HashMap f15468n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1450e f15469o;

    public p(AbstractC0603a abstractC0603a, HashMap hashMap, C1450e c1450e) {
        this.f15467m = abstractC0603a;
        this.f15468n = hashMap;
        this.f15469o = c1450e;
    }

    @Override // v4.e
    public final void p0(v4.c cVar, v4.r rVar) {
        v4.r Q6 = Y4.D.Q(rVar, this.f15467m.Y(cVar), this.f15468n);
        if (Q6 != rVar) {
            C1473g c1473g = new C1473g(cVar.f17173a);
            C1450e c1450e = this.f15469o;
            c1450e.f15308b = ((v4.r) c1450e.f15308b).q(c1473g, Q6);
        }
    }
}
