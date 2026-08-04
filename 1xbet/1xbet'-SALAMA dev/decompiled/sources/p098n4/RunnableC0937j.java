package p098n4;

import A1.C0011c;
import A1.x0;
import B.v;
import B1.c;
import E4.y;
import G4.M;
import L4.b;
import W5.AbstractC0486a1;
import Y3.i;
import Y4.D;
import android.content.Context;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p028d6.k;
import p033e3.h;
import p048g4.o;
import p063i4.d;
import p069j4.e;
import p069j4.g;
import p083l4.s;
import p114p4.a;
import p155w1.C1010l1;
import p155w1.C1017n0;
import v4.j;
import v4.r;

/* JADX INFO: renamed from: n4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0937j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0940m f15435b;

    public /* synthetic */ RunnableC0937j(C0940m c0940m, int i7) {
        this.f15434a = i7;
        this.f15435b = c0940m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a yVar;
        switch (this.f15434a) {
            case 0:
                C0940m c0940m = this.f15435b;
                C0941n c0941n = c0940m.f15453a;
                C0011c c0011c = new C0011c(c0941n.f15468a, c0941n.f15470c, c0941n.f15469b, 6);
                C0932e c0932e = c0940m.f15460h;
                C1017n0 c1017n0D = c0932e.d();
                v vVar = c0932e.f15406a;
                c cVar = new c(23, c0932e.f15408c, c0932e.b());
                c cVar2 = new c(23, c0932e.f15409d, c0932e.b());
                b bVarB = c0932e.b();
                boolean z4 = c0932e.f15414i;
                String str = c0932e.f15412g;
                i iVar = c0932e.f15415k;
                iVar.b();
                A0.b bVar = new A0.b(vVar, cVar, cVar2, bVarB, z4, str, iVar.f7665c.f7673b, ((Context) c0932e.d().f17811b).getApplicationContext().getDir("sslcache", 0).getAbsolutePath());
                c1017n0D.getClass();
                s sVar = new s(bVar, c0011c, c0940m);
                ((i) c1017n0D.f17813d).a(new e(sVar));
                c0940m.f15455c = sVar;
                k kVar = c0932e.f15408c;
                b bVar2 = (b) c0932e.f15410e.f8076b;
                C1010l1 c1010l1 = new C1010l1(c0940m);
                kVar.getClass();
                ((o) kVar.f12447b).a(new p069j4.a(bVar2, c1010l1, 2));
                w wVar = c0932e.f15409d;
                b bVar3 = (b) c0932e.f15410e.f8076b;
                R4.c cVar3 = new R4.c(c0940m, 21);
                wVar.getClass();
                ((o) wVar.f11335b).a(new p069j4.a(bVar3, cVar3, 0));
                c0940m.f15455c.q();
                String str2 = c0941n.f15468a;
                if (c0932e.f15414i) {
                    C1017n0 c1017n0 = c0932e.f15417m;
                    c1017n0.getClass();
                    String str3 = c0932e.f15411f;
                    String strF = p031e1.k.f(str2, "_", str3);
                    HashSet hashSet = (HashSet) c1017n0.f17812c;
                    if (hashSet.contains(strF)) {
                        throw new d(AbstractC0486a1.h("SessionPersistenceKey '", str3, "' has already been used."));
                    }
                    hashSet.add(strF);
                    g gVar = new g((Context) c1017n0.f17811b, c0932e, strF);
                    long j = c0932e.j;
                    y yVar2 = new y();
                    yVar2.f2247a = j;
                    yVar = new M(c0932e, gVar, yVar2);
                } else {
                    yVar = new F1.y();
                }
                p096n1.e eVar = new p096n1.e(18);
                eVar.f15314b = j.f17190e;
                c0940m.f15456d = eVar;
                c0940m.f15457e = new r();
                Object obj = null;
                c0940m.f15458f = new C1017n0(obj, obj, new p120q4.i(), 22);
                c0940m.f15464m = new D(c0932e, new F1.y(), new x0(c0940m, 18));
                c0940m.f15465n = new D(c0932e, yVar, new h(c0940m));
                List<H> listO = yVar.o();
                HashMap mapP = D.p(c0940m.f15454b);
                long j3 = Long.MIN_VALUE;
                for (H h6 : listO) {
                    k kVar2 = new k(10, (Object) c0940m, (Object) h6, false);
                    long j7 = h6.f15375a;
                    if (j3 >= j7) {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                    c0940m.f15463l = 1 + j7;
                    boolean zC = h6.c();
                    t tVar = c0940m.f15461i;
                    long j8 = h6.f15375a;
                    C0934g c0934g = h6.f15376b;
                    if (zC) {
                        if (tVar.r0()) {
                            tVar.W(null, AbstractC0486a1.g("Restoring overwrite with id ", j8), new Object[0]);
                        }
                        c0940m.f15455c.f("p", c0934g.l(), h6.b().u(true), null, kVar2);
                        r rVarQ = D.Q(h6.b(), new K(c0940m.f15465n, c0934g), mapP);
                        c0940m.f15465n.h(h6.f15376b, h6.b(), rVarQ, h6.f15375a, true, false);
                    } else {
                        if (tVar.r0()) {
                            tVar.W(null, AbstractC0486a1.g("Restoring merge with id ", j8), new Object[0]);
                        }
                        c0940m.f15455c.f("m", c0934g.l(), h6.a().D(), null, kVar2);
                        C0929b c0929bP = D.P(h6.a(), c0940m.f15465n, c0934g, mapP);
                        D d7 = c0940m.f15465n;
                        C0929b c0929bA = h6.a();
                        d7.getClass();
                    }
                    j3 = j7;
                }
                v4.c cVar4 = AbstractC0930c.f15401c;
                Boolean bool = Boolean.FALSE;
                c0940m.t(cVar4, bool);
                c0940m.t(AbstractC0930c.f15402d, bool);
                return;
            case 1:
                this.f15435b.f15455c.d("repo_interrupt");
                return;
            default:
                this.f15435b.f15455c.i("repo_interrupt");
                return;
        }
    }
}
