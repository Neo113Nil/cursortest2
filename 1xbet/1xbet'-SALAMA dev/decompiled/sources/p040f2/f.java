package p040f2;

import A1.C0014d0;
import A1.C0016e0;
import A1.C0022h0;
import A1.x0;
import B1.m;
import B1.p;
import B4.V;
import E1.h;
import M4.e;
import Z4.b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import g2.a;
import g2.c;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.AbstractC0755a;
import p018c2.B;
import p018c2.C0756b;
import p018c2.C0774u;
import p018c2.D;
import p018c2.I;
import p072k1.g;
import p146u2.InterfaceC0953l;
import p146u2.InterfaceC0954m;
import p146u2.K;
import p146u2.L;
import p146u2.M;
import p146u2.N;
import p146u2.U;
import p146u2.r;
import p151v2.t;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0755a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public K f12830A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public U f12831B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f12832C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f12833D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0014d0 f12834E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Uri f12835F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Uri f12836G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public c f12837H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f12838I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f12839J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f12840K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f12841L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12842M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f12843N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12844O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0022h0 f12845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12846i;
    public final InterfaceC0953l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p145u1.c f12847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V f12848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f12849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f12850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f12851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f12852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I f12853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final M f12854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0 f12855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f12856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f12857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f12858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f12859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final R4.c f12860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final L f12861y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC0954m f12862z;

    static {
        A1.V.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [f2.c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [f2.c] */
    public f(C0022h0 c0022h0, InterfaceC0953l interfaceC0953l, M m7, p145u1.c cVar, V v6, h hVar, e eVar, long j) {
        this.f12845h = c0022h0;
        this.f12834E = c0022h0.f368c;
        C0016e0 c0016e0 = c0022h0.f367b;
        c0016e0.getClass();
        Uri uri = c0016e0.f345a;
        this.f12835F = uri;
        this.f12836G = uri;
        this.f12837H = null;
        this.j = interfaceC0953l;
        this.f12854r = m7;
        this.f12847k = cVar;
        this.f12849m = hVar;
        this.f12850n = eVar;
        this.f12852p = j;
        this.f12848l = v6;
        this.f12851o = new g(13);
        this.f12846i = false;
        this.f12853q = new I(this.f10298c.f10181c, 0, null, 0L);
        this.f12856t = new Object();
        this.f12857u = new SparseArray();
        this.f12860x = new R4.c(this, 15);
        this.f12843N = -9223372036854775807L;
        this.f12841L = -9223372036854775807L;
        this.f12855s = new x0(this, 14);
        this.f12861y = new p033e3.h(this);
        final int i7 = 0;
        this.f12858v = new Runnable(this) { // from class: f2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12818b;

            {
                this.f12818b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f12818b.t();
                        break;
                    default:
                        this.f12818b.s(false);
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f12859w = new Runnable(this) { // from class: f2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12818b;

            {
                this.f12818b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        this.f12818b.t();
                        break;
                    default:
                        this.f12818b.s(false);
                        break;
                }
            }
        };
    }

    public static boolean q(g2.h hVar) {
        int i7 = 0;
        while (true) {
            List list = hVar.f13150c;
            if (i7 >= list.size()) {
                return false;
            }
            int i8 = ((a) list.get(i7)).f13106b;
            if (i8 == 1 || i8 == 2) {
                return true;
            }
            i7++;
        }
    }

    @Override // p018c2.AbstractC0755a
    public final B a(D d7, r rVar, long j) {
        int iIntValue = ((Integer) d7.f10161a).intValue() - this.f12844O;
        I i7 = new I(this.f10298c.f10181c, 0, d7, this.f12837H.b(iIntValue).f13149b);
        m mVar = new m((CopyOnWriteArrayList) this.f10299d.f1016d, 0, d7, 2);
        int i8 = this.f12844O + iIntValue;
        c cVar = this.f12837H;
        U u4 = this.f12831B;
        long j3 = this.f12841L;
        p pVar = this.f10302g;
        p151v2.a.i(pVar);
        b bVar = new b(i8, cVar, this.f12851o, iIntValue, this.f12847k, u4, this.f12849m, mVar, this.f12850n, i7, j3, this.f12861y, rVar, this.f12848l, this.f12860x, pVar);
        this.f12857u.put(i8, bVar);
        return bVar;
    }

    @Override // p018c2.AbstractC0755a
    public final C0022h0 g() {
        return this.f12845h;
    }

    @Override // p018c2.AbstractC0755a
    public final void h() {
        this.f12861y.c();
    }

    @Override // p018c2.AbstractC0755a
    public final void j(U u4) {
        this.f12831B = u4;
        Looper looperMyLooper = Looper.myLooper();
        p pVar = this.f10302g;
        p151v2.a.i(pVar);
        h hVar = this.f12849m;
        hVar.c(looperMyLooper, pVar);
        hVar.a();
        if (this.f12846i) {
            s(false);
            return;
        }
        this.f12862z = this.j.a();
        this.f12830A = new K("DashMediaSource");
        this.f12833D = t.m(null);
        t();
    }

    @Override // p018c2.AbstractC0755a
    public final void l(B b7) {
        b bVar = (b) b7;
        n nVar = bVar.f12797D;
        nVar.f12905z = true;
        nVar.f12900d.removeCallbacksAndMessages(null);
        for (p032e2.g gVar : bVar.f12802I) {
            gVar.s(bVar);
        }
        bVar.f12801H = null;
        this.f12857u.remove(bVar.f12808a);
    }

    @Override // p018c2.AbstractC0755a
    public final void n() {
        this.f12838I = false;
        this.f12862z = null;
        K k7 = this.f12830A;
        if (k7 != null) {
            k7.e(null);
            this.f12830A = null;
        }
        this.f12839J = 0L;
        this.f12840K = 0L;
        this.f12837H = this.f12846i ? this.f12837H : null;
        this.f12835F = this.f12836G;
        this.f12832C = null;
        Handler handler = this.f12833D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f12833D = null;
        }
        this.f12841L = -9223372036854775807L;
        this.f12842M = 0;
        this.f12843N = -9223372036854775807L;
        this.f12844O = 0;
        this.f12857u.clear();
        g gVar = this.f12851o;
        ((HashMap) gVar.f14680a).clear();
        ((HashMap) gVar.f14681b).clear();
        ((HashMap) gVar.f14682c).clear();
        this.f12849m.release();
    }

    public final void r() {
        boolean z4;
        K k7 = this.f12830A;
        C1010l1 c1010l1 = new C1010l1(this);
        synchronized (p151v2.a.f17097h) {
            z4 = p151v2.a.f17098i;
        }
        if (z4) {
            c1010l1.B();
            return;
        }
        if (k7 == null) {
            k7 = new K("SntpClient");
        }
        k7.f(new V(26), new C1010l1(c1010l1), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ac  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    public final void s(boolean z4) {
        g2.h hVar;
        List list;
        boolean z7;
        long j;
        long j3;
        long j7;
        g gVarC;
        long jMin;
        float f7;
        float f8;
        g2.t tVar;
        long j8;
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f12857u;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i7);
            if (iKeyAt >= this.f12844O) {
                b bVar = (b) sparseArray.valueAt(i7);
                c cVar = this.f12837H;
                int i8 = iKeyAt - this.f12844O;
                bVar.f12805L = cVar;
                bVar.f12806M = i8;
                n nVar = bVar.f12797D;
                nVar.f12904y = z8;
                nVar.f12902f = cVar;
                Iterator it = nVar.f12901e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < nVar.f12902f.f13122h) {
                        it.remove();
                    }
                }
                p032e2.g[] gVarArr = bVar.f12802I;
                if (gVarArr != null) {
                    int length = gVarArr.length;
                    for (?? r10 = z8; r10 < length; r10++) {
                        j jVar = gVarArr[r10].f12630e;
                        h[] hVarArr = jVar.f12877h;
                        try {
                            jVar.j = cVar;
                            jVar.f12879k = i8;
                            long jD = cVar.d(i8);
                            ArrayList arrayListA = jVar.a();
                            for (?? r15 = z8; r15 < hVarArr.length; r15++) {
                                hVarArr[r15] = hVarArr[r15].a(jD, (g2.m) arrayListA.get(jVar.f12878i.f16304c[r15]));
                            }
                        } catch (C0756b e7) {
                            jVar.f12880l = e7;
                        }
                        z8 = false;
                    }
                    bVar.f12801H.b(bVar);
                }
                bVar.f12807N = cVar.b(i8).f13151d;
                for (k kVar : bVar.f12803J) {
                    for (g2.g gVar : bVar.f12807N) {
                        if (gVar.a().equals(kVar.f12886e.a())) {
                            kVar.a(gVar, cVar.f13118d && i8 == cVar.f13126m.size() - 1);
                            break;
                        }
                    }
                }
            }
            i7++;
            z8 = false;
        }
        g2.h hVarB = this.f12837H.b(0);
        int size = this.f12837H.f13126m.size() - 1;
        g2.h hVarB2 = this.f12837H.b(size);
        long jD2 = this.f12837H.d(size);
        long jE = t.E(t.u(this.f12841L));
        long jD3 = this.f12837H.d(0);
        long jE2 = t.E(hVarB.f13149b);
        boolean zQ = q(hVarB);
        long jMax = jE2;
        int i9 = 0;
        while (true) {
            List list2 = hVarB.f13150c;
            hVar = hVarB;
            boolean z9 = zQ;
            if (i9 >= list2.size()) {
                jE2 = jMax;
                break;
            }
            a aVar = (a) list2.get(i9);
            List list3 = aVar.f13107c;
            int i10 = aVar.f13106b;
            boolean z10 = (i10 == 1 || i10 == 2) ? false : true;
            if ((!z9 || !z10) && !list3.isEmpty()) {
                g gVarC2 = ((g2.m) list3.get(0)).c();
                if (gVarC2 == null || gVarC2.w(jD3, jE) == 0) {
                    break;
                } else {
                    jMax = Math.max(jMax, gVarC2.b(gVarC2.f(jD3, jE)) + jE2);
                }
            }
            i9++;
            hVarB = hVar;
            zQ = z9;
        }
        long jE3 = t.E(hVarB2.f13149b);
        boolean zQ2 = q(hVarB2);
        long jMin2 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            list = hVarB2.f13150c;
            if (i11 >= list.size()) {
                jE3 = jMin2;
                break;
            }
            a aVar2 = (a) list.get(i11);
            List list4 = aVar2.f13107c;
            int i12 = aVar2.f13106b;
            g2.h hVar2 = hVarB2;
            boolean z11 = (i12 == 1 || i12 == 2) ? false : true;
            if ((!zQ2 || !z11) && !list4.isEmpty()) {
                g gVarC3 = ((g2.m) list4.get(0)).c();
                if (gVarC3 == null) {
                    jE3 += jD2;
                } else {
                    long jW = gVarC3.w(jD2, jE);
                    if (jW != 0) {
                        long jF = (gVarC3.f(jD2, jE) + jW) - 1;
                        long jB = gVarC3.b(jF) + jE3;
                        j8 = jD2;
                        jMin2 = Math.min(jMin2, gVarC3.e(jF, j8) + jB);
                    }
                }
                break;
            }
            j8 = jD2;
            i11++;
            jD2 = j8;
            hVarB2 = hVar2;
            jE3 = jE3;
        }
        if (!this.f12837H.f13118d) {
            z7 = false;
            break;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= list.size()) {
                z7 = true;
                break;
            }
            g gVarC4 = ((g2.m) ((a) list.get(i13)).f13107c.get(0)).c();
            if (gVarC4 == null || gVarC4.s()) {
                z7 = false;
                break;
            }
            i13++;
        }
        if (z7) {
            long j9 = this.f12837H.f13120f;
            if (j9 != -9223372036854775807L) {
                jE2 = Math.max(jE2, jE3 - t.E(j9));
            }
        }
        long j10 = jE3 - jE2;
        c cVar2 = this.f12837H;
        if (cVar2.f13118d) {
            p151v2.a.h(cVar2.f13115a != -9223372036854775807L);
            long jE4 = (jE - t.E(this.f12837H.f13115a)) - jE2;
            long jN = t.N(jE4);
            C0022h0 c0022h0 = this.f12845h;
            long j11 = c0022h0.f368c.f339c;
            if (j11 != -9223372036854775807L) {
                jMin = Math.min(jN, j11);
            } else {
                g2.t tVar2 = this.f12837H.j;
                if (tVar2 != null) {
                    long j12 = tVar2.f13186c;
                    if (j12 != -9223372036854775807L) {
                        jMin = Math.min(jN, j12);
                    } else {
                        jMin = jN;
                    }
                } else {
                    jMin = jN;
                }
            }
            long jN2 = t.N(jE4 - j10);
            if (jN2 < 0 && jMin > 0) {
                jN2 = 0;
            }
            j = jE2;
            long j13 = this.f12837H.f13117c;
            long jMin3 = j13 != -9223372036854775807L ? Math.min(jN2 + j13, jN) : jN2;
            C0014d0 c0014d0 = c0022h0.f368c;
            long j14 = c0014d0.f338b;
            if (j14 != -9223372036854775807L) {
                jMin3 = t.k(j14, jMin3, jN);
            } else {
                g2.t tVar3 = this.f12837H.j;
                if (tVar3 != null) {
                    long j15 = tVar3.f13185b;
                    if (j15 != -9223372036854775807L) {
                        jMin3 = t.k(j15, jMin3, jN);
                    }
                }
            }
            long j16 = jMin3;
            long j17 = j16 > jMin ? j16 : jMin;
            long jK = this.f12834E.f337a;
            if (jK == -9223372036854775807L) {
                c cVar3 = this.f12837H;
                g2.t tVar4 = cVar3.j;
                if (tVar4 != null) {
                    long j18 = tVar4.f13184a;
                    if (j18 != -9223372036854775807L) {
                        jK = j18;
                    } else {
                        jK = cVar3.f13121g;
                        if (jK == -9223372036854775807L) {
                            jK = this.f12852p;
                        }
                    }
                } else {
                    jK = cVar3.f13121g;
                    if (jK == -9223372036854775807L) {
                        jK = this.f12852p;
                    }
                }
            }
            if (jK < j16) {
                jK = j16;
            }
            if (jK > j17) {
                jK = t.k(t.N(jE4 - Math.min(5000000L, j10 / 2)), j16, j17);
            }
            long j19 = jK;
            float f9 = c0014d0.f340d;
            if (f9 == -3.4028235E38f) {
                g2.t tVar5 = this.f12837H.j;
                f9 = tVar5 != null ? tVar5.f13187d : -3.4028235E38f;
            }
            float f10 = c0014d0.f341e;
            if (f10 == -3.4028235E38f) {
                g2.t tVar6 = this.f12837H.j;
                f10 = tVar6 != null ? tVar6.f13188e : -3.4028235E38f;
            }
            if (f9 == -3.4028235E38f && f10 == -3.4028235E38f && ((tVar = this.f12837H.j) == null || tVar.f13184a == -9223372036854775807L)) {
                f7 = 1.0f;
                f8 = 1.0f;
            } else {
                f7 = f9;
                f8 = f10;
            }
            this.f12834E = new C0014d0(j19, j16, j17, f7, f8);
            long jN3 = t.N(j) + this.f12837H.f13115a;
            long jE5 = jE4 - t.E(this.f12834E.f337a);
            long jMin4 = Math.min(5000000L, j10 / 2);
            j7 = jE5 < jMin4 ? jMin4 : jE5;
            j3 = jN3;
        } else {
            j = jE2;
            j3 = -9223372036854775807L;
            j7 = 0;
        }
        long jE6 = j - t.E(hVar.f13149b);
        c cVar4 = this.f12837H;
        k(new d(cVar4.f13115a, j3, this.f12841L, this.f12844O, jE6, j10, j7, cVar4, this.f12845h, cVar4.f13118d ? this.f12834E : null));
        if (this.f12846i) {
            return;
        }
        Handler handler = this.f12833D;
        c cVar5 = this.f12859w;
        handler.removeCallbacks(cVar5);
        if (z7) {
            Handler handler2 = this.f12833D;
            c cVar6 = this.f12837H;
            long jU = t.u(this.f12841L);
            int size2 = cVar6.f13126m.size() - 1;
            g2.h hVarB3 = cVar6.b(size2);
            long jE7 = t.E(hVarB3.f13149b);
            long jD4 = cVar6.d(size2);
            long jE8 = t.E(jU);
            long jE9 = t.E(cVar6.f13115a);
            long jE10 = t.E(5000L);
            int i14 = 0;
            while (true) {
                List list5 = hVarB3.f13150c;
                if (i14 >= list5.size()) {
                    break;
                }
                List list6 = ((a) list5.get(i14)).f13107c;
                if (!list6.isEmpty() && (gVarC = ((g2.m) list6.get(0)).c()) != null) {
                    long jG = (gVarC.g(jD4, jE8) + (jE9 + jE7)) - jE8;
                    if (jG < jE10 - 100000 || (jG > jE10 && jG < jE10 + 100000)) {
                        jE10 = jG;
                    }
                }
                i14++;
            }
            RoundingMode roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            long j20 = jE10 / 1000;
            long j21 = jE10 - (1000 * j20);
            if (j21 != 0) {
                int i15 = ((int) ((jE10 ^ 1000) >> 63)) | 1;
                switch (G3.c.f2870a[roundingMode.ordinal()]) {
                    case 1:
                        if (j21 != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        if (i15 < 0) {
                            j20 += (long) i15;
                        }
                        break;
                    case 4:
                        j20 += (long) i15;
                        break;
                    case 5:
                        if (i15 > 0) {
                            j20 += (long) i15;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j21);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 != 0 ? jAbs2 > 0 : !(roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (j20 & 1) == 0))) {
                            j20 += (long) i15;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler2.postDelayed(cVar5, j20);
        }
        if (this.f12838I) {
            t();
            return;
        }
        if (z4) {
            c cVar7 = this.f12837H;
            if (cVar7.f13118d) {
                long j22 = cVar7.f13119e;
                if (j22 != -9223372036854775807L) {
                    this.f12833D.postDelayed(this.f12858v, Math.max(0L, (this.f12839J + (j22 == 0 ? 5000L : j22)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void t() {
        Uri uri;
        this.f12833D.removeCallbacks(this.f12858v);
        if (this.f12830A.b()) {
            return;
        }
        if (this.f12830A.d()) {
            this.f12838I = true;
            return;
        }
        synchronized (this.f12856t) {
            uri = this.f12835F;
        }
        this.f12838I = false;
        N n2 = new N(this.f12862z, uri, 4, this.f12854r);
        x0 x0Var = this.f12855s;
        this.f12850n.getClass();
        this.f12830A.f(n2, x0Var, 3);
        this.f12853q.k(new C0774u(n2.f16735b), n2.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
