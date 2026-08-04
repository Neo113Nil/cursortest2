package p028d6;

import H2.q;
import P2.F;
import U5.AbstractC0438e;
import U5.C0434a;
import U5.C0435b;
import U5.C0453u;
import U5.K;
import U5.N;
import U5.O;
import U5.l0;
import U5.o0;
import U5.p0;
import W5.f2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p113p3.f;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends N {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0434a f12479n = new C0434a("addressTrackerKey");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f12480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0 f12481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f12482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f2 f12483i;
    public final ScheduledExecutorService j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public P2 f12484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f12485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC0438e f12486m;

    public t(AbstractC0438e abstractC0438e) {
        f2 f2Var = f2.f7216b;
        AbstractC0438e abstractC0438eH = abstractC0438e.h();
        this.f12486m = abstractC0438eH;
        this.f12482h = new e(new d(this, abstractC0438e));
        this.f12480f = new m();
        p0 p0VarJ = abstractC0438e.j();
        f.k(p0VarJ, "syncContext");
        this.f12481g = p0VarJ;
        ScheduledExecutorService scheduledExecutorServiceI = abstractC0438e.i();
        f.k(scheduledExecutorServiceI, "timeService");
        this.j = scheduledExecutorServiceI;
        this.f12483i = f2Var;
        abstractC0438eH.l(1, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C0453u) it.next()).f6592a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(m mVar, int i7) {
        ArrayList arrayList = new ArrayList();
        for (l lVar : mVar.values()) {
            if (lVar.c() >= i7) {
                arrayList.add(lVar);
            }
        }
        return arrayList;
    }

    @Override // U5.N
    public final l0 a(K k7) {
        AbstractC0438e abstractC0438e = this.f12486m;
        abstractC0438e.m(1, "Received resolution result: {0}", k7);
        o oVar = (o) k7.f6432c;
        ArrayList<SocketAddress> arrayList = new ArrayList();
        Iterator it = k7.f6430a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C0453u) it.next()).f6592a);
        }
        m mVar = this.f12480f;
        mVar.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) mVar.f12456b).values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).f12449a = oVar;
        }
        for (SocketAddress socketAddress : arrayList) {
            HashMap map = (HashMap) mVar.f12456b;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new l(oVar));
            }
        }
        O o7 = oVar.f12466g.f7095a;
        e eVar = this.f12482h;
        eVar.i(o7);
        if (oVar.f12464e == null && oVar.f12465f == null) {
            P2 p5 = this.f12484k;
            if (p5 != null) {
                p5.d();
                this.f12485l = null;
                for (l lVar : ((HashMap) mVar.f12456b).values()) {
                    if (lVar.d()) {
                        lVar.e();
                    }
                    lVar.f12453e = 0;
                }
            }
        } else {
            Long l7 = this.f12485l;
            Long l8 = oVar.f12460a;
            Long lValueOf = l7 == null ? l8 : Long.valueOf(Math.max(0L, l8.longValue() - (this.f12483i.d() - this.f12485l.longValue())));
            P2 p7 = this.f12484k;
            if (p7 != null) {
                p7.d();
                for (l lVar2 : ((HashMap) mVar.f12456b).values()) {
                    k kVar = lVar2.f12450b;
                    ((AtomicLong) kVar.f12447b).set(0L);
                    ((AtomicLong) kVar.f12448c).set(0L);
                    k kVar2 = lVar2.f12451c;
                    ((AtomicLong) kVar2.f12447b).set(0L);
                    ((AtomicLong) kVar2.f12448c).set(0L);
                }
            }
            q qVar = new q(15, this, oVar, abstractC0438e, false);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l8.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            p0 p0Var = this.f12481g;
            p0Var.getClass();
            F f7 = new F(qVar);
            this.f12484k = new P2(f7, this.j.scheduleWithFixedDelay(new o0(p0Var, f7, qVar, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        C0435b c0435b = C0435b.f6454b;
        eVar.d(new K(k7.f6430a, k7.f6431b, oVar.f12466g.f7096b));
        return l0.f6536e;
    }

    @Override // U5.N
    public final void c(l0 l0Var) {
        this.f12482h.c(l0Var);
    }

    @Override // U5.N
    public final void f() {
        this.f12482h.f();
    }
}
