package com.google.android.gms.internal.ads;

import I.C0160m;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12931a;

    /* renamed from: b, reason: collision with root package name */
    public final M4.d f12932b;

    /* renamed from: c, reason: collision with root package name */
    public C1407p f12933c;

    /* renamed from: d, reason: collision with root package name */
    public long f12934d;

    /* renamed from: e, reason: collision with root package name */
    public long f12935e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f12936g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12937h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f12938j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1452q f12939k;

    /* renamed from: l, reason: collision with root package name */
    public Executor f12940l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0959f f12941m;

    public C0825c(C0959f c0959f, Context context) {
        this.f12941m = c0959f;
        AbstractC1260lo.d(context);
        this.f12931a = new ArrayList();
        this.f12932b = new M4.d();
        this.f12936g = -9223372036854775807L;
        this.f12939k = InterfaceC1452q.f15068d;
        this.f12940l = C0959f.f13392n;
    }

    public final void a() {
        if (this.f12933c == null) {
            return;
        }
        new ArrayList(this.f12931a);
        C1407p c1407p = this.f12933c;
        c1407p.getClass();
        C1649uH c1649uH = new C1649uH(c1407p);
        C1242lE c1242lE = c1407p.f14885A;
        if (c1242lE == null || !c1242lE.d()) {
            c1242lE = C1242lE.f14331h;
        }
        c1649uH.f15862z = c1242lE;
        new C1407p(c1649uH);
        AbstractC1668us.F(null);
        throw null;
    }

    public final void b(boolean z3) {
        this.f12937h = false;
        this.f12936g = -9223372036854775807L;
        C0959f c0959f = this.f12941m;
        if (c0959f.f13403m == 1) {
            c0959f.f13402l++;
            Fx fx = c0959f.f;
            if (z3) {
                C1004g c1004g = (C1004g) fx.f9145m;
                C1137j c1137j = c1004g.f13537b;
                c1137j.f14038m = 0L;
                c1137j.f14041p = -1L;
                c1137j.f14039n = -1L;
                c1004g.f13541g = -9223372036854775807L;
                c1004g.f13540e = -9223372036854775807L;
                c1004g.f(1);
                c1004g.f13542h = -9223372036854775807L;
            }
            C1182k c1182k = (C1182k) fx.f9143k;
            C0160m c0160m = c1182k.f14202e;
            c0160m.f2498b = 0;
            c0160m.f2499c = 0;
            c1182k.i = -9223372036854775807L;
            M0.e eVar = c1182k.f14201d;
            if (eVar.n() > 0) {
                AbstractC1668us.S(eVar.n() > 0);
                while (eVar.n() > 1) {
                    eVar.o();
                }
                Object o5 = eVar.o();
                o5.getClass();
                eVar.r(0L, (Long) o5);
            }
            C1519re c1519re = c1182k.f;
            M0.e eVar2 = c1182k.f14200c;
            if (c1519re != null) {
                eVar2.s();
            } else if (eVar2.n() > 0) {
                AbstractC1668us.S(eVar2.n() > 0);
                while (eVar2.n() > 1) {
                    eVar2.o();
                }
                Object o6 = eVar2.o();
                o6.getClass();
                c1182k.f = (C1519re) o6;
            }
            C1439pn c1439pn = c0959f.f13400j;
            AbstractC1668us.F(c1439pn);
            c1439pn.b(new RunnableC1303mm(22, c0959f));
        }
        this.f12938j = -9223372036854775807L;
    }

    public final void c(C1407p c1407p) {
        C0959f c0959f = this.f12941m;
        AbstractC1668us.a0(c0959f.f13403m == 0);
        C1242lE c1242lE = c1407p.f14885A;
        if (c1242lE == null || !c1242lE.d()) {
            c1242lE = C1242lE.f14331h;
        }
        if (c1242lE.f14334c != 7 || AbstractC1260lo.f14419a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        AbstractC1668us.F(myLooper);
        c0959f.f13400j = c0959f.f13398g.a(myLooper, null);
        try {
            C0914e c0914e = c0959f.f13396d;
            C1761wv c1761wv = C1761wv.f16184o;
            c0914e.a();
            Pair pair = c0959f.f13401k;
            if (pair == null) {
                throw null;
            }
            ((Bm) pair.second).getClass();
            throw null;
        } catch (C1788xd e3) {
            throw new r(e3, c1407p);
        }
    }

    public final void d(boolean z3) {
        C1004g c1004g = (C1004g) this.f12941m.f.f9145m;
        c1004g.i = z3;
        c1004g.f13542h = -9223372036854775807L;
    }

    public final void e(int i) {
        C1137j c1137j = ((C1004g) this.f12941m.f.f9145m).f13537b;
        if (c1137j.f14035j == i) {
            return;
        }
        c1137j.f14035j = i;
        c1137j.d(true);
    }

    public final void f(Surface surface, Bm bm) {
        C0959f c0959f = this.f12941m;
        Pair pair = c0959f.f13401k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Bm) c0959f.f13401k.second).equals(bm)) {
            return;
        }
        c0959f.f13401k = Pair.create(surface, bm);
        bm.getClass();
    }

    public final void g(float f) {
        ((C1004g) this.f12941m.f.f9145m).d(f);
    }

    public final void h(long j5, long j6, long j7, long j8) {
        this.f12934d = j5;
        this.f12935e = j7;
        this.f = j8;
    }

    public final void i(List list) {
        ArrayList arrayList = this.f12931a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f12941m.f13397e);
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8 >= r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(long j5, boolean z3, long j6, long j7, G3 g32) {
        C0959f c0959f = this.f12941m;
        AbstractC1668us.a0(false);
        long j8 = j5 - this.f12935e;
        try {
            if (c0959f.f13394b.a(j8, j6, j7, this.f12934d, z3, this.f12932b) != 4) {
                if (j8 < this.f && !z3) {
                    ((AH) g32.f9167n).m0((KF) g32.f9166m, g32.f9165l);
                    return true;
                }
                C0959f.a(c0959f, j6, j7);
                if (this.i) {
                    long j9 = this.f12938j;
                    if (j9 != -9223372036854775807L) {
                        if (c0959f.f13402l == 0) {
                            long j10 = c0959f.f13395c.i;
                            if (j10 != -9223372036854775807L) {
                            }
                        }
                    }
                    a();
                    this.i = false;
                    this.f12938j = -9223372036854775807L;
                }
                AbstractC1668us.F(null);
                throw null;
            }
            return false;
        } catch (XD e3) {
            C1407p c1407p = this.f12933c;
            AbstractC1668us.F(c1407p);
            throw new r(e3, c1407p);
        }
    }
}
