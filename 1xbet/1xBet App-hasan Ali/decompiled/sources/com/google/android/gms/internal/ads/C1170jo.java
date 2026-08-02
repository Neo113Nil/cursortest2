package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170jo implements InterfaceC1165jj {

    /* renamed from: k, reason: collision with root package name */
    public boolean f14144k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14145l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14146m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14147n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f14148o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f14149p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f14150q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f14151r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f14152s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f14153t;

    /* renamed from: u, reason: collision with root package name */
    public Object f14154u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14155v;

    public C1170jo(Context context, Wk wk, Wq wq, U2.a aVar, Lq lq, C0634Ld c0634Ld, InterfaceC0677Re interfaceC0677Re, A9 a9, boolean z3, BinderC0857cn binderC0857cn, C1392ol c1392ol, C1482ql c1482ql) {
        this.f14145l = context;
        this.f14146m = wk;
        this.f14147n = wq;
        this.f14148o = aVar;
        this.f14149p = lq;
        this.f14150q = c0634Ld;
        this.f14151r = interfaceC0677Re;
        this.f14152s = a9;
        this.f14144k = z3;
        this.f14153t = binderC0857cn;
        this.f14154u = c1392ol;
        this.f14155v = c1482ql;
    }

    public AbstractC0715Xa a() {
        ArrayList arrayList = (ArrayList) this.f14146m;
        if (arrayList.isEmpty()) {
            return AbstractC0715Xa.f12197a;
        }
        int i = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            CE ce = (CE) arrayList.get(i5);
            ce.f7984d = i;
            i += ce.f7981a.f14983o.f13928b.c();
        }
        return new JE(arrayList, (PG) this.f14155v);
    }

    public AbstractC0715Xa b(int i, int i5, List list) {
        ArrayList arrayList = (ArrayList) this.f14146m;
        AbstractC1668us.S(i >= 0 && i <= i5 && i5 <= arrayList.size());
        AbstractC1668us.S(list.size() == i5 - i);
        for (int i6 = i; i6 < i5; i6++) {
            ((CE) arrayList.get(i6)).f7981a.p((Q3) list.get(i6 - i));
        }
        return a();
    }

    public void c(C1514rH c1514rH) {
        AbstractC1668us.a0(!this.f14144k);
        this.f14154u = c1514rH;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f14146m;
            if (i >= arrayList.size()) {
                this.f14144k = true;
                return;
            }
            CE ce = (CE) arrayList.get(i);
            l(ce);
            ((HashSet) this.f14151r).add(ce);
            i++;
        }
    }

    public void d(InterfaceC1558sG interfaceC1558sG) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f14147n;
        CE ce = (CE) identityHashMap.remove(interfaceC1558sG);
        ce.getClass();
        ce.f7981a.a(interfaceC1558sG);
        ce.f7983c.remove(((C1244lG) interfaceC1558sG).f14369k);
        if (!identityHashMap.isEmpty()) {
            j();
        }
        k(ce);
    }

    public boolean e() {
        return this.f14144k;
    }

    public AbstractC0715Xa f(int i, List list, PG pg) {
        if (!list.isEmpty()) {
            this.f14155v = pg;
            for (int i5 = i; i5 < list.size() + i; i5++) {
                CE ce = (CE) list.get(i5 - i);
                ArrayList arrayList = (ArrayList) this.f14146m;
                if (i5 > 0) {
                    CE ce2 = (CE) arrayList.get(i5 - 1);
                    ce.f7984d = ce2.f7981a.f14983o.f13928b.c() + ce2.f7984d;
                    ce.f7985e = false;
                    ce.f7983c.clear();
                } else {
                    ce.f7984d = 0;
                    ce.f7985e = false;
                    ce.f7983c.clear();
                }
                int c5 = ce.f7981a.f14983o.f13928b.c();
                for (int i6 = i5; i6 < arrayList.size(); i6++) {
                    ((CE) arrayList.get(i6)).f7984d += c5;
                }
                arrayList.add(i5, ce);
                ((HashMap) this.f14148o).put(ce.f7982b, ce);
                if (this.f14144k) {
                    l(ce);
                    if (((IdentityHashMap) this.f14147n).isEmpty()) {
                        ((HashSet) this.f14151r).add(ce);
                    } else {
                        BE be = (BE) ((HashMap) this.f14150q).get(ce);
                        if (be != null) {
                            be.f7796a.e(be.f7797b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public AbstractC0715Xa g(int i, int i5, PG pg) {
        boolean z3 = false;
        if (i >= 0 && i <= i5 && i5 <= ((ArrayList) this.f14146m).size()) {
            z3 = true;
        }
        AbstractC1668us.S(z3);
        this.f14155v = pg;
        m(i, i5);
        return a();
    }

    public AbstractC0715Xa h(List list, PG pg) {
        ArrayList arrayList = (ArrayList) this.f14146m;
        m(0, arrayList.size());
        return f(arrayList.size(), list, pg);
    }

    public AbstractC0715Xa i(PG pg) {
        int size = ((ArrayList) this.f14146m).size();
        if (pg.f11078b.length != size) {
            pg = new PG(new Random(pg.f11077a.nextLong())).a(size);
        }
        this.f14155v = pg;
        return a();
    }

    public void j() {
        Iterator it = ((HashSet) this.f14151r).iterator();
        while (it.hasNext()) {
            CE ce = (CE) it.next();
            if (ce.f7983c.isEmpty()) {
                BE be = (BE) ((HashMap) this.f14150q).get(ce);
                if (be != null) {
                    be.f7796a.e(be.f7797b);
                }
                it.remove();
            }
        }
    }

    public void k(CE ce) {
        if (ce.f7985e && ce.f7983c.isEmpty()) {
            BE be = (BE) ((HashMap) this.f14150q).remove(ce);
            be.getClass();
            C1781xE c1781xE = be.f7797b;
            ZF zf = be.f7796a;
            zf.l(c1781xE);
            AE ae = be.f7798c;
            zf.o(ae);
            zf.n(ae);
            ((HashSet) this.f14151r).remove(ce);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.uG, com.google.android.gms.internal.ads.xE] */
    public void l(CE ce) {
        C1424pG c1424pG = ce.f7981a;
        ?? r1 = new InterfaceC1648uG() { // from class: com.google.android.gms.internal.ads.xE
            @Override // com.google.android.gms.internal.ads.InterfaceC1648uG
            public final void a(ZF zf, AbstractC0715Xa abstractC0715Xa) {
                C1439pn c1439pn = ((C1332nE) C1170jo.this.f14149p).f14636r;
                c1439pn.f15040a.removeMessages(2);
                c1439pn.c(22);
            }
        };
        AE ae = new AE(this, ce);
        ((HashMap) this.f14150q).put(ce, new BE(c1424pG, r1, ae));
        int i = AbstractC1260lo.f14419a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        C1872zF c1872zF = c1424pG.f12475c;
        c1872zF.getClass();
        c1872zF.f16579b.add(new C1738wG(handler, ae));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        C1872zF c1872zF2 = c1424pG.f12476d;
        c1872zF2.getClass();
        c1872zF2.f16579b.add(new C1827yF(ae));
        c1424pG.i(r1, (C1514rH) this.f14154u, (ZE) this.f14145l);
    }

    public void m(int i, int i5) {
        while (true) {
            i5--;
            if (i5 < i) {
                return;
            }
            ArrayList arrayList = (ArrayList) this.f14146m;
            CE ce = (CE) arrayList.remove(i5);
            ((HashMap) this.f14148o).remove(ce.f7982b);
            int i6 = -ce.f7981a.f14983o.f13928b.c();
            for (int i7 = i5; i7 < arrayList.size(); i7++) {
                ((CE) arrayList.get(i7)).f7984d += i6;
            }
            ce.f7985e = true;
            if (this.f14144k) {
                k(ce);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f14151r;
        C0629Kf c0629Kf = (C0629Kf) AbstractC1400ot.n0((C0634Ld) this.f14150q);
        try {
            boolean F02 = interfaceC0677Re.F0();
            Wq wq = (Wq) this.f14147n;
            Lq lq = (Lq) this.f14149p;
            A9 a9 = (A9) this.f14152s;
            boolean z5 = this.f14144k;
            if (F02) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8734O0)).booleanValue()) {
                    interfaceC0677Re = ((Wk) this.f14146m).a(wq.f12099e, null, null);
                    interfaceC0677Re.s0("/reward", new C1417p9(4, (Zi) c0629Kf.f10183P.d()));
                    Oi oi = new Oi(12);
                    ((Vk) c0629Kf.f10184Q.d()).a(interfaceC0677Re, true, z5 ? a9 : null, ((C1392ol) this.f14154u).f14846c);
                    interfaceC0677Re.I().f13619q = new C1529ro(oi, interfaceC0677Re);
                    interfaceC0677Re.I().f13620r = new C1731w9(interfaceC0677Re);
                    Pq pq = lq.f10523s;
                    interfaceC0677Re.S0(pq.f11127b, pq.f11126a);
                }
            }
            InterfaceC0677Re interfaceC0677Re2 = interfaceC0677Re;
            interfaceC0677Re2.p0(true);
            boolean z6 = false;
            boolean c5 = z5 ? a9.c(false) : false;
            T2.L l5 = P2.o.f4767B.f4771c;
            boolean h3 = T2.L.h((Context) this.f14145l);
            if (z5) {
                synchronized (a9) {
                    z6 = a9.f7540b;
                }
            }
            P2.h hVar = new P2.h(c5, h3, z6, z5 ? a9.a() : 0.0f, z3, lq.f10477O, lq.f10478P);
            if (sh != null) {
                sh.c();
            }
            C1077hj c1077hj = (C1077hj) c0629Kf.f10182O.d();
            int i = lq.f10479Q;
            Pq pq2 = lq.f10523s;
            String str = pq2.f11127b;
            BinderC0857cn binderC0857cn = lq.b() ? (BinderC0857cn) this.f14153t : null;
            Q1.j.g(context, new AdOverlayInfoParcel(c1077hj, interfaceC0677Re2, i, (U2.a) this.f14148o, lq.f10466B, hVar, str, pq2.f11126a, wq.f, sh, binderC0857cn, interfaceC0677Re2.t()), true, (C1482ql) this.f14155v);
        } catch (C0719Xe e3) {
            U2.j.g("", e3);
        }
    }

    public C1170jo(C1332nE c1332nE, SE se, C1439pn c1439pn, ZE ze) {
        this.f14145l = ze;
        this.f14149p = c1332nE;
        this.f14155v = new PG();
        this.f14147n = new IdentityHashMap();
        this.f14148o = new HashMap();
        this.f14146m = new ArrayList();
        this.f14152s = se;
        this.f14153t = c1439pn;
        this.f14150q = new HashMap();
        this.f14151r = new HashSet();
    }
}
