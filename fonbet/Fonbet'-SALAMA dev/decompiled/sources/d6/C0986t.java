package d6;

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
import w1.P2;

/* renamed from: d6.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0986t extends N {

    /* renamed from: n, reason: collision with root package name */
    public static final C0434a f12473n = new C0434a("addressTrackerKey");

    /* renamed from: f, reason: collision with root package name */
    public final C0979m f12474f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f12475g;

    /* renamed from: h, reason: collision with root package name */
    public final C0971e f12476h;

    /* renamed from: i, reason: collision with root package name */
    public final f2 f12477i;
    public final ScheduledExecutorService j;

    /* renamed from: k, reason: collision with root package name */
    public P2 f12478k;

    /* renamed from: l, reason: collision with root package name */
    public Long f12479l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0438e f12480m;

    public C0986t(AbstractC0438e abstractC0438e) {
        f2 f2Var = f2.f7216b;
        AbstractC0438e h6 = abstractC0438e.h();
        this.f12480m = h6;
        this.f12476h = new C0971e(new C0970d(this, abstractC0438e));
        this.f12474f = new C0979m();
        p0 j = abstractC0438e.j();
        p3.f.k(j, "syncContext");
        this.f12475g = j;
        ScheduledExecutorService i7 = abstractC0438e.i();
        p3.f.k(i7, "timeService");
        this.j = i7;
        this.f12477i = f2Var;
        h6.l(1, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((C0453u) it.next()).f6592a.size();
            if (i7 > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(C0979m c0979m, int i7) {
        ArrayList arrayList = new ArrayList();
        for (C0978l c0978l : c0979m.values()) {
            if (c0978l.c() >= i7) {
                arrayList.add(c0978l);
            }
        }
        return arrayList;
    }

    @Override // U5.N
    public final l0 a(K k7) {
        AbstractC0438e abstractC0438e = this.f12480m;
        abstractC0438e.m(1, "Received resolution result: {0}", k7);
        C0981o c0981o = (C0981o) k7.f6432c;
        ArrayList arrayList = new ArrayList();
        Iterator it = k7.f6430a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C0453u) it.next()).f6592a);
        }
        C0979m c0979m = this.f12474f;
        c0979m.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) c0979m.f12450b).values().iterator();
        while (it2.hasNext()) {
            ((C0978l) it2.next()).f12443a = c0981o;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            HashMap hashMap = (HashMap) c0979m.f12450b;
            if (!hashMap.containsKey(socketAddress)) {
                hashMap.put(socketAddress, new C0978l(c0981o));
            }
        }
        O o7 = c0981o.f12460g.f7095a;
        C0971e c0971e = this.f12476h;
        c0971e.i(o7);
        if (c0981o.f12458e == null && c0981o.f12459f == null) {
            P2 p22 = this.f12478k;
            if (p22 != null) {
                p22.d();
                this.f12479l = null;
                for (C0978l c0978l : ((HashMap) c0979m.f12450b).values()) {
                    if (c0978l.d()) {
                        c0978l.e();
                    }
                    c0978l.f12447e = 0;
                }
            }
        } else {
            Long l7 = this.f12479l;
            Long l8 = c0981o.f12454a;
            Long valueOf = l7 == null ? l8 : Long.valueOf(Math.max(0L, l8.longValue() - (this.f12477i.d() - this.f12479l.longValue())));
            P2 p23 = this.f12478k;
            if (p23 != null) {
                p23.d();
                for (C0978l c0978l2 : ((HashMap) c0979m.f12450b).values()) {
                    C0977k c0977k = c0978l2.f12444b;
                    ((AtomicLong) c0977k.f12441b).set(0L);
                    ((AtomicLong) c0977k.f12442c).set(0L);
                    C0977k c0977k2 = c0978l2.f12445c;
                    ((AtomicLong) c0977k2.f12441b).set(0L);
                    ((AtomicLong) c0977k2.f12442c).set(0L);
                }
            }
            H2.q qVar = new H2.q(15, this, c0981o, abstractC0438e, false);
            long longValue = valueOf.longValue();
            long longValue2 = l8.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            p0 p0Var = this.f12475g;
            p0Var.getClass();
            F f7 = new F(qVar);
            this.f12478k = new P2(f7, this.j.scheduleWithFixedDelay(new o0(p0Var, f7, qVar, longValue2), longValue, longValue2, timeUnit));
        }
        C0435b c0435b = C0435b.f6454b;
        c0971e.d(new K(k7.f6430a, k7.f6431b, c0981o.f12460g.f7096b));
        return l0.f6536e;
    }

    @Override // U5.N
    public final void c(l0 l0Var) {
        this.f12476h.c(l0Var);
    }

    @Override // U5.N
    public final void f() {
        this.f12476h.f();
    }
}
