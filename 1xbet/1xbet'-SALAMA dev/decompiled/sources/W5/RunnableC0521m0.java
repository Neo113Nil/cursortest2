package W5;

import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p098n4.C0934g;
import p098n4.C0939l;
import p098n4.C0940m;
import p098n4.RunnableC0936i;
import p155w1.C1017n0;

/* JADX INFO: renamed from: W5.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0521m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7280d;

    public /* synthetic */ RunnableC0521m0(int i7, Object obj, Object obj2, boolean z4) {
        this.f7277a = i7;
        this.f7280d = obj;
        this.f7279c = obj2;
        this.f7278b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p063i4.c cVarA;
        B3.g gVar;
        v4.r rVar;
        switch (this.f7277a) {
            case 0:
                ((C0538s0) this.f7280d).f7358t.o((C0527o0) this.f7279c, this.f7278b);
                break;
            case 1:
                if (!this.f7278b) {
                    ((C0726v) this.f7279c).e((EnumC0718m) this.f7280d);
                    this.f7278b = true;
                }
                break;
            default:
                p063i4.f fVar = (p063i4.f) this.f7280d;
                C0940m c0940m = (C0940m) fVar.f1723b;
                android.support.v4.media.session.t tVar = c0940m.f15461i;
                boolean zR0 = tVar.r0();
                C0934g c0934g = (C0934g) fVar.f1725d;
                if (zR0) {
                    tVar.W(null, "transaction: " + c0934g, new Object[0]);
                }
                if (c0940m.f15462k.r0()) {
                    tVar.W(null, "transaction: " + c0934g, new Object[0]);
                }
                if (c0940m.f15460h.f15414i && !c0940m.f15466o) {
                    c0940m.f15466o = true;
                    android.support.v4.media.session.t tVar2 = c0940m.j;
                    String strA0 = tVar2.A0("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.", new Object[0]);
                    System.currentTimeMillis();
                    ((B.v) tVar2.f8076b).l(2, (String) tVar2.f8077c, strA0);
                }
                p063i4.f fVar2 = new p063i4.f(c0940m, c0934g);
                p036e6.c cVar = new p036e6.c(20);
                c0940m.f(new p098n4.J(c0940m, cVar, fVar2.i()));
                long j = c0940m.f15467p;
                c0940m.f15467p = j + 1;
                C0939l c0939l = new C0939l();
                c0939l.f15444a = c0934g;
                B1.m mVar = (B1.m) this.f7279c;
                c0939l.f15445b = mVar;
                c0939l.f15446c = cVar;
                c0939l.f15447d = 1;
                c0939l.f15450x = 0;
                boolean z4 = this.f7278b;
                c0939l.f15449f = z4;
                c0939l.f15448e = j;
                c0939l.f15451y = null;
                c0939l.f15441A = null;
                c0939l.f15442B = null;
                c0939l.f15443C = null;
                v4.r rVarI = c0940m.f15465n.i(c0934g, new ArrayList());
                if (rVarI == null) {
                    rVarI = v4.j.f17190e;
                }
                c0939l.f15441A = rVarI;
                try {
                    gVar = mVar.j(new p063i4.k(rVarI));
                    cVarA = null;
                    rVar = null;
                } catch (Throwable th) {
                    tVar.a0("Caught Throwable.", th);
                    cVarA = p063i4.c.a(th);
                    rVar = null;
                    gVar = new B3.g(false, null, 7);
                }
                if (!gVar.f1063b) {
                    c0939l.f15442B = rVar;
                    c0939l.f15443C = rVar;
                    c0940m.l(new RunnableC0936i(mVar, cVarA, new p063i4.b(fVar2, v4.l.m(c0939l.f15441A)), 0));
                } else {
                    c0939l.f15447d = 2;
                    C1017n0 c1017n0K = c0940m.f15458f.K(c0934g);
                    List arrayList = ((p120q4.i) c1017n0K.f17813d).f15869b;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0939l);
                    ((p120q4.i) c1017n0K.f17813d).f15869b = arrayList;
                    c1017n0K.M();
                    HashMap mapP = Y4.D.p(c0940m.f15454b);
                    v4.r rVar2 = c0939l.f15441A;
                    v4.r rVar3 = (v4.r) gVar.f1064c;
                    v4.r rVarQ = Y4.D.Q(rVar3, new p098n4.L(rVar2), mapP);
                    c0939l.f15442B = rVar3;
                    c0939l.f15443C = rVarQ;
                    long j3 = c0940m.f15463l;
                    c0940m.f15463l = 1 + j3;
                    c0939l.f15452z = j3;
                    c0940m.m(c0940m.f15465n.h(c0934g, rVar3, rVarQ, j3, z4, false));
                    C1017n0 c1017n0 = c0940m.f15458f;
                    c0940m.n(c1017n0);
                    c0940m.r(c1017n0);
                }
                break;
        }
    }

    public RunnableC0521m0(C0726v c0726v, EnumC0718m enumC0718m) {
        this.f7277a = 1;
        t6.h.e(c0726v, "registry");
        t6.h.e(enumC0718m, "event");
        this.f7279c = c0726v;
        this.f7280d = enumC0718m;
    }
}
