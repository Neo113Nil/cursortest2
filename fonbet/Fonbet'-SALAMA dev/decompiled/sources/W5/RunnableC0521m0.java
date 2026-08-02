package W5;

import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0739m;
import e6.C1054c;
import i4.C1265b;
import i4.C1266c;
import i4.C1269f;
import i4.C1274k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n4.C1473g;
import n4.C1478l;
import n4.C1479m;
import n4.RunnableC1475i;
import w1.C1726n0;

/* renamed from: W5.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0521m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7278b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7279c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7280d;

    public /* synthetic */ RunnableC0521m0(int i7, Object obj, Object obj2, boolean z4) {
        this.f7277a = i7;
        this.f7280d = obj;
        this.f7279c = obj2;
        this.f7278b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1266c a2;
        B3.g gVar;
        v4.r rVar;
        switch (this.f7277a) {
            case 0:
                ((C0538s0) this.f7280d).f7358t.o((C0527o0) this.f7279c, this.f7278b);
                break;
            case 1:
                if (!this.f7278b) {
                    ((C0747v) this.f7279c).e((EnumC0739m) this.f7280d);
                    this.f7278b = true;
                    break;
                }
                break;
            default:
                C1269f c1269f = (C1269f) this.f7280d;
                C1479m c1479m = (C1479m) c1269f.f1723b;
                android.support.v4.media.session.t tVar = c1479m.f15455i;
                boolean r02 = tVar.r0();
                C1473g c1473g = (C1473g) c1269f.f1725d;
                if (r02) {
                    tVar.W(null, "transaction: " + c1473g, new Object[0]);
                }
                if (c1479m.f15456k.r0()) {
                    tVar.W(null, "transaction: " + c1473g, new Object[0]);
                }
                if (c1479m.f15454h.f15408i && !c1479m.f15460o) {
                    c1479m.f15460o = true;
                    android.support.v4.media.session.t tVar2 = c1479m.j;
                    String A02 = tVar2.A0("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.", new Object[0]);
                    System.currentTimeMillis();
                    ((B.v) tVar2.f8076b).l(2, (String) tVar2.f8077c, A02);
                }
                C1269f c1269f2 = new C1269f(c1479m, c1473g);
                C1054c c1054c = new C1054c(20);
                c1479m.f(new n4.J(c1479m, c1054c, c1269f2.i()));
                long j = c1479m.f15461p;
                c1479m.f15461p = j + 1;
                C1478l c1478l = new C1478l();
                c1478l.f15438a = c1473g;
                B1.m mVar = (B1.m) this.f7279c;
                c1478l.f15439b = mVar;
                c1478l.f15440c = c1054c;
                c1478l.f15441d = 1;
                c1478l.f15444x = 0;
                boolean z4 = this.f7278b;
                c1478l.f15443f = z4;
                c1478l.f15442e = j;
                c1478l.f15445y = null;
                c1478l.f15435A = null;
                c1478l.f15436B = null;
                c1478l.f15437C = null;
                v4.r i7 = c1479m.f15459n.i(c1473g, new ArrayList());
                if (i7 == null) {
                    i7 = v4.j.f17184e;
                }
                c1478l.f15435A = i7;
                try {
                    gVar = mVar.j(new C1274k(i7));
                    a2 = null;
                    rVar = null;
                } catch (Throwable th) {
                    tVar.a0("Caught Throwable.", th);
                    a2 = C1266c.a(th);
                    rVar = null;
                    gVar = new B3.g(false, null, 7);
                }
                if (!gVar.f1063b) {
                    c1478l.f15436B = rVar;
                    c1478l.f15437C = rVar;
                    c1479m.l(new RunnableC1475i(mVar, a2, new C1265b(c1269f2, v4.l.m(c1478l.f15435A)), 0));
                    break;
                } else {
                    c1478l.f15441d = 2;
                    C1726n0 K7 = c1479m.f15452f.K(c1473g);
                    List list = ((q4.i) K7.f17807d).f15863b;
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(c1478l);
                    ((q4.i) K7.f17807d).f15863b = list;
                    K7.M();
                    HashMap p5 = Y4.D.p(c1479m.f15448b);
                    v4.r rVar2 = c1478l.f15435A;
                    v4.r rVar3 = (v4.r) gVar.f1064c;
                    v4.r Q6 = Y4.D.Q(rVar3, new n4.L(rVar2), p5);
                    c1478l.f15436B = rVar3;
                    c1478l.f15437C = Q6;
                    long j3 = c1479m.f15457l;
                    c1479m.f15457l = 1 + j3;
                    c1478l.f15446z = j3;
                    c1479m.m(c1479m.f15459n.h(c1473g, rVar3, Q6, j3, z4, false));
                    C1726n0 c1726n0 = c1479m.f15452f;
                    c1479m.n(c1726n0);
                    c1479m.r(c1726n0);
                    break;
                }
                break;
        }
    }

    public RunnableC0521m0(C0747v c0747v, EnumC0739m enumC0739m) {
        this.f7277a = 1;
        t6.h.e(c0747v, "registry");
        t6.h.e(enumC0739m, "event");
        this.f7279c = c0747v;
        this.f7280d = enumC0739m;
    }
}
