package p098n4;

import Y4.D;
import java.util.HashMap;
import p003a.a;
import v4.c;
import v4.e;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f15473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ HashMap f15474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p096n1.e f15475o;

    public p(a aVar, HashMap map, p096n1.e eVar) {
        this.f15473m = aVar;
        this.f15474n = map;
        this.f15475o = eVar;
    }

    @Override // v4.e
    public final void p0(c cVar, r rVar) {
        r rVarQ = D.Q(rVar, this.f15473m.Y(cVar), this.f15474n);
        if (rVarQ != rVar) {
            C0934g c0934g = new C0934g(cVar.f17179a);
            p096n1.e eVar = this.f15475o;
            eVar.f15314b = ((r) eVar.f15314b).q(c0934g, rVarQ);
        }
    }
}
