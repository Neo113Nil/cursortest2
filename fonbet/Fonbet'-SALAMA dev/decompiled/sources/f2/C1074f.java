package f2;

import A1.C0014d0;
import A1.C0016e0;
import A1.C0022h0;
import A1.x0;
import B1.p;
import B4.V;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import c2.AbstractC0795a;
import c2.C0796b;
import c2.C0814u;
import c2.D;
import c2.I;
import c2.InterfaceC0794B;
import e2.C1010g;
import e3.C1023h;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.InterfaceC1635l;
import u2.InterfaceC1636m;
import u2.K;
import u2.L;
import u2.M;
import u2.N;
import u2.U;
import u2.r;
import v2.AbstractC1664a;
import v2.t;
import w1.C1719l1;

/* renamed from: f2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074f extends AbstractC0795a {

    /* renamed from: A, reason: collision with root package name */
    public K f12824A;

    /* renamed from: B, reason: collision with root package name */
    public U f12825B;

    /* renamed from: C, reason: collision with root package name */
    public Z4.b f12826C;

    /* renamed from: D, reason: collision with root package name */
    public Handler f12827D;

    /* renamed from: E, reason: collision with root package name */
    public C0014d0 f12828E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f12829F;

    /* renamed from: G, reason: collision with root package name */
    public final Uri f12830G;

    /* renamed from: H, reason: collision with root package name */
    public g2.c f12831H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f12832I;

    /* renamed from: J, reason: collision with root package name */
    public long f12833J;

    /* renamed from: K, reason: collision with root package name */
    public long f12834K;

    /* renamed from: L, reason: collision with root package name */
    public long f12835L;

    /* renamed from: M, reason: collision with root package name */
    public int f12836M;

    /* renamed from: N, reason: collision with root package name */
    public long f12837N;

    /* renamed from: O, reason: collision with root package name */
    public int f12838O;

    /* renamed from: h, reason: collision with root package name */
    public final C0022h0 f12839h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12840i;
    public final InterfaceC1635l j;

    /* renamed from: k, reason: collision with root package name */
    public final u1.c f12841k;

    /* renamed from: l, reason: collision with root package name */
    public final V f12842l;

    /* renamed from: m, reason: collision with root package name */
    public final E1.h f12843m;

    /* renamed from: n, reason: collision with root package name */
    public final M4.e f12844n;

    /* renamed from: o, reason: collision with root package name */
    public final k1.g f12845o;

    /* renamed from: p, reason: collision with root package name */
    public final long f12846p;

    /* renamed from: q, reason: collision with root package name */
    public final I f12847q;

    /* renamed from: r, reason: collision with root package name */
    public final M f12848r;

    /* renamed from: s, reason: collision with root package name */
    public final x0 f12849s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f12850t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f12851u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC1071c f12852v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC1071c f12853w;

    /* renamed from: x, reason: collision with root package name */
    public final R4.c f12854x;

    /* renamed from: y, reason: collision with root package name */
    public final L f12855y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1636m f12856z;

    static {
        A1.V.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [f2.c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [f2.c] */
    public C1074f(C0022h0 c0022h0, InterfaceC1635l interfaceC1635l, M m7, u1.c cVar, V v6, E1.h hVar, M4.e eVar, long j) {
        this.f12839h = c0022h0;
        this.f12828E = c0022h0.f368c;
        C0016e0 c0016e0 = c0022h0.f367b;
        c0016e0.getClass();
        Uri uri = c0016e0.f345a;
        this.f12829F = uri;
        this.f12830G = uri;
        this.f12831H = null;
        this.j = interfaceC1635l;
        this.f12848r = m7;
        this.f12841k = cVar;
        this.f12843m = hVar;
        this.f12844n = eVar;
        this.f12846p = j;
        this.f12842l = v6;
        this.f12845o = new k1.g(13);
        this.f12840i = false;
        this.f12847q = new I(this.f10298c.f10181c, 0, null, 0L);
        this.f12850t = new Object();
        this.f12851u = new SparseArray();
        this.f12854x = new R4.c(this, 15);
        this.f12837N = -9223372036854775807L;
        this.f12835L = -9223372036854775807L;
        this.f12849s = new x0(this, 14);
        this.f12855y = new C1023h(this);
        final int i7 = 0;
        this.f12852v = new Runnable(this) { // from class: f2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1074f f12812b;

            {
                this.f12812b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f12812b.t();
                        break;
                    default:
                        this.f12812b.s(false);
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f12853w = new Runnable(this) { // from class: f2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1074f f12812b;

            {
                this.f12812b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        this.f12812b.t();
                        break;
                    default:
                        this.f12812b.s(false);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(g2.h hVar) {
        int i7 = 0;
        while (true) {
            List list = hVar.f13144c;
            if (i7 >= list.size()) {
                return false;
            }
            int i8 = ((g2.a) list.get(i7)).f13100b;
            if (i8 == 1 || i8 == 2) {
                break;
            }
            i7++;
        }
    }

    @Override // c2.AbstractC0795a
    public final InterfaceC0794B a(D d7, r rVar, long j) {
        int intValue = ((Integer) d7.f10161a).intValue() - this.f12838O;
        I i7 = new I(this.f10298c.f10181c, 0, d7, this.f12831H.b(intValue).f13143b);
        B1.m mVar = new B1.m((CopyOnWriteArrayList) this.f10299d.f1016d, 0, d7, 2);
        int i8 = this.f12838O + intValue;
        g2.c cVar = this.f12831H;
        U u4 = this.f12825B;
        long j3 = this.f12835L;
        p pVar = this.f10302g;
        AbstractC1664a.i(pVar);
        C1070b c1070b = new C1070b(i8, cVar, this.f12845o, intValue, this.f12841k, u4, this.f12843m, mVar, this.f12844n, i7, j3, this.f12855y, rVar, this.f12842l, this.f12854x, pVar);
        this.f12851u.put(i8, c1070b);
        return c1070b;
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return this.f12839h;
    }

    @Override // c2.AbstractC0795a
    public final void h() {
        this.f12855y.c();
    }

    @Override // c2.AbstractC0795a
    public final void j(U u4) {
        this.f12825B = u4;
        Looper myLooper = Looper.myLooper();
        p pVar = this.f10302g;
        AbstractC1664a.i(pVar);
        E1.h hVar = this.f12843m;
        hVar.c(myLooper, pVar);
        hVar.a();
        if (this.f12840i) {
            s(false);
            return;
        }
        this.f12856z = this.j.a();
        this.f12824A = new K("DashMediaSource");
        this.f12827D = t.m(null);
        t();
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
        C1070b c1070b = (C1070b) interfaceC0794B;
        C1082n c1082n = c1070b.f12791D;
        c1082n.f12899z = true;
        c1082n.f12894d.removeCallbacksAndMessages(null);
        for (C1010g c1010g : c1070b.f12796I) {
            c1010g.s(c1070b);
        }
        c1070b.f12795H = null;
        this.f12851u.remove(c1070b.f12802a);
    }

    @Override // c2.AbstractC0795a
    public final void n() {
        this.f12832I = false;
        this.f12856z = null;
        K k7 = this.f12824A;
        if (k7 != null) {
            k7.e(null);
            this.f12824A = null;
        }
        this.f12833J = 0L;
        this.f12834K = 0L;
        this.f12831H = this.f12840i ? this.f12831H : null;
        this.f12829F = this.f12830G;
        this.f12826C = null;
        Handler handler = this.f12827D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f12827D = null;
        }
        this.f12835L = -9223372036854775807L;
        this.f12836M = 0;
        this.f12837N = -9223372036854775807L;
        this.f12838O = 0;
        this.f12851u.clear();
        k1.g gVar = this.f12845o;
        ((HashMap) gVar.f14674a).clear();
        ((HashMap) gVar.f14675b).clear();
        ((HashMap) gVar.f14676c).clear();
        this.f12843m.release();
    }

    public final void r() {
        boolean z4;
        K k7 = this.f12824A;
        C1719l1 c1719l1 = new C1719l1(this);
        synchronized (AbstractC1664a.f17091h) {
            z4 = AbstractC1664a.f17092i;
        }
        if (z4) {
            c1719l1.B();
            return;
        }
        if (k7 == null) {
            k7 = new K("SntpClient");
        }
        k7.f(new V(26), new C1719l1(c1719l1), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c5, code lost:
    
        r2 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04a7, code lost:
    
        if (r10 > 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04aa, code lost:
    
        if (r10 < 0) goto L239;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z4) {
        g2.h hVar;
        List list;
        C1074f c1074f;
        boolean z7;
        g2.c cVar;
        long j;
        long j3;
        g2.h hVar2;
        long j7;
        InterfaceC1075g c3;
        long j8;
        float f7;
        float f8;
        g2.t tVar;
        boolean z8;
        InterfaceC1075g c4;
        long j9;
        long j10;
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f12851u;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i7);
            if (keyAt >= this.f12838O) {
                C1070b c1070b = (C1070b) sparseArray.valueAt(i7);
                g2.c cVar2 = this.f12831H;
                int i8 = keyAt - this.f12838O;
                c1070b.f12799L = cVar2;
                c1070b.f12800M = i8;
                C1082n c1082n = c1070b.f12791D;
                c1082n.f12898y = z9;
                c1082n.f12896f = cVar2;
                Iterator it = c1082n.f12895e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < c1082n.f12896f.f13116h) {
                        it.remove();
                    }
                }
                C1010g[] c1010gArr = c1070b.f12796I;
                if (c1010gArr != null) {
                    int length = c1010gArr.length;
                    for (?? r10 = z9; r10 < length; r10++) {
                        C1078j c1078j = c1010gArr[r10].f12624e;
                        C1076h[] c1076hArr = c1078j.f12871h;
                        try {
                            c1078j.j = cVar2;
                            c1078j.f12873k = i8;
                            long d7 = cVar2.d(i8);
                            ArrayList a2 = c1078j.a();
                            for (?? r15 = z9; r15 < c1076hArr.length; r15++) {
                                c1076hArr[r15] = c1076hArr[r15].a(d7, (g2.m) a2.get(c1078j.f12872i.f16298c[r15]));
                            }
                        } catch (C0796b e7) {
                            c1078j.f12874l = e7;
                        }
                        z9 = false;
                    }
                    c1070b.f12795H.b(c1070b);
                }
                c1070b.f12801N = cVar2.b(i8).f13145d;
                for (C1079k c1079k : c1070b.f12797J) {
                    Iterator it2 = c1070b.f12801N.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            g2.g gVar = (g2.g) it2.next();
                            if (gVar.a().equals(c1079k.f12880e.a())) {
                                c1079k.a(gVar, cVar2.f13112d && i8 == cVar2.f13120m.size() - 1);
                            }
                        }
                    }
                }
            }
            i7++;
            z9 = false;
        }
        g2.h b7 = this.f12831H.b(0);
        int size = this.f12831H.f13120m.size() - 1;
        g2.h b8 = this.f12831H.b(size);
        long d8 = this.f12831H.d(size);
        long E7 = t.E(t.u(this.f12835L));
        long d9 = this.f12831H.d(0);
        long E8 = t.E(b7.f13143b);
        boolean q7 = q(b7);
        long j11 = E8;
        int i9 = 0;
        while (true) {
            List list2 = b7.f13144c;
            hVar = b7;
            boolean z10 = q7;
            if (i9 >= list2.size()) {
                E8 = j11;
                break;
            }
            g2.a aVar = (g2.a) list2.get(i9);
            List list3 = aVar.f13101c;
            int i10 = aVar.f13100b;
            boolean z11 = (i10 == 1 || i10 == 2) ? false : true;
            if ((!z10 || !z11) && !list3.isEmpty()) {
                InterfaceC1075g c7 = ((g2.m) list3.get(0)).c();
                if (c7 == null || c7.w(d9, E7) == 0) {
                    break;
                } else {
                    j11 = Math.max(j11, c7.b(c7.f(d9, E7)) + E8);
                }
            }
            i9++;
            b7 = hVar;
            q7 = z10;
        }
        long E9 = t.E(b8.f13143b);
        boolean q8 = q(b8);
        long j12 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            list = b8.f13144c;
            if (i11 >= list.size()) {
                c1074f = this;
                E9 = j12;
                break;
            }
            g2.a aVar2 = (g2.a) list.get(i11);
            List list4 = aVar2.f13101c;
            int i12 = aVar2.f13100b;
            g2.h hVar3 = b8;
            if (i12 != 1 && i12 != 2) {
                z8 = true;
                if ((q8 || !z8) && !list4.isEmpty()) {
                    c4 = ((g2.m) list4.get(0)).c();
                    if (c4 != null) {
                        E9 += d8;
                        break;
                    }
                    long w7 = c4.w(d8, E7);
                    if (w7 == 0) {
                        break;
                    }
                    long f9 = (c4.f(d8, E7) + w7) - 1;
                    long b9 = c4.b(f9) + E9;
                    j9 = E9;
                    j10 = d8;
                    j12 = Math.min(j12, c4.e(f9, j10) + b9);
                } else {
                    j9 = E9;
                    j10 = d8;
                }
                i11++;
                d8 = j10;
                b8 = hVar3;
                E9 = j9;
            }
            z8 = false;
            if (q8) {
            }
            c4 = ((g2.m) list4.get(0)).c();
            if (c4 != null) {
            }
        }
        if (c1074f.f12831H.f13112d) {
            for (int i13 = 0; i13 < list.size(); i13++) {
                InterfaceC1075g c8 = ((g2.m) ((g2.a) list.get(i13)).f13101c.get(0)).c();
                if (c8 != null && !c8.s()) {
                }
            }
            z7 = true;
            if (z7) {
                long j13 = c1074f.f12831H.f13114f;
                if (j13 != -9223372036854775807L) {
                    E8 = Math.max(E8, E9 - t.E(j13));
                }
            }
            long j14 = E9 - E8;
            cVar = c1074f.f12831H;
            if (cVar.f13112d) {
                j = E8;
                j3 = -9223372036854775807L;
                hVar2 = hVar;
                j7 = 0;
            } else {
                AbstractC1664a.h(cVar.f13109a != -9223372036854775807L);
                long E10 = (E7 - t.E(c1074f.f12831H.f13109a)) - E8;
                long N7 = t.N(E10);
                C0022h0 c0022h0 = c1074f.f12839h;
                long j15 = c0022h0.f368c.f339c;
                if (j15 != -9223372036854775807L) {
                    j8 = Math.min(N7, j15);
                } else {
                    g2.t tVar2 = c1074f.f12831H.j;
                    if (tVar2 != null) {
                        long j16 = tVar2.f13180c;
                        if (j16 != -9223372036854775807L) {
                            j8 = Math.min(N7, j16);
                        }
                    }
                    j8 = N7;
                }
                long N8 = t.N(E10 - j14);
                if (N8 < 0 && j8 > 0) {
                    N8 = 0;
                }
                j = E8;
                long j17 = c1074f.f12831H.f13111c;
                long min = j17 != -9223372036854775807L ? Math.min(N8 + j17, N7) : N8;
                C0014d0 c0014d0 = c0022h0.f368c;
                long j18 = c0014d0.f338b;
                if (j18 != -9223372036854775807L) {
                    min = t.k(j18, min, N7);
                } else {
                    g2.t tVar3 = c1074f.f12831H.j;
                    if (tVar3 != null) {
                        long j19 = tVar3.f13179b;
                        if (j19 != -9223372036854775807L) {
                            min = t.k(j19, min, N7);
                        }
                    }
                }
                long j20 = min;
                long j21 = j20 > j8 ? j20 : j8;
                long j22 = c1074f.f12828E.f337a;
                if (j22 == -9223372036854775807L) {
                    g2.c cVar3 = c1074f.f12831H;
                    g2.t tVar4 = cVar3.j;
                    if (tVar4 != null) {
                        long j23 = tVar4.f13178a;
                        if (j23 != -9223372036854775807L) {
                            j22 = j23;
                        }
                    }
                    j22 = cVar3.f13115g;
                    if (j22 == -9223372036854775807L) {
                        j22 = c1074f.f12846p;
                    }
                }
                if (j22 < j20) {
                    j22 = j20;
                }
                if (j22 > j21) {
                    j22 = t.k(t.N(E10 - Math.min(5000000L, j14 / 2)), j20, j21);
                }
                long j24 = j22;
                float f10 = c0014d0.f340d;
                if (f10 == -3.4028235E38f) {
                    g2.t tVar5 = c1074f.f12831H.j;
                    f10 = tVar5 != null ? tVar5.f13181d : -3.4028235E38f;
                }
                float f11 = c0014d0.f341e;
                if (f11 == -3.4028235E38f) {
                    g2.t tVar6 = c1074f.f12831H.j;
                    f11 = tVar6 != null ? tVar6.f13182e : -3.4028235E38f;
                }
                if (f10 == -3.4028235E38f && f11 == -3.4028235E38f && ((tVar = c1074f.f12831H.j) == null || tVar.f13178a == -9223372036854775807L)) {
                    f7 = 1.0f;
                    f8 = 1.0f;
                } else {
                    f7 = f10;
                    f8 = f11;
                }
                c1074f.f12828E = new C0014d0(j24, j20, j21, f7, f8);
                long N9 = t.N(j) + c1074f.f12831H.f13109a;
                long E11 = E10 - t.E(c1074f.f12828E.f337a);
                long min2 = Math.min(5000000L, j14 / 2);
                j7 = E11 < min2 ? min2 : E11;
                j3 = N9;
                hVar2 = hVar;
            }
            long E12 = j - t.E(hVar2.f13143b);
            g2.c cVar4 = c1074f.f12831H;
            c1074f.k(new C1072d(cVar4.f13109a, j3, c1074f.f12835L, c1074f.f12838O, E12, j14, j7, cVar4, c1074f.f12839h, !cVar4.f13112d ? c1074f.f12828E : null));
            if (c1074f.f12840i) {
                Handler handler = c1074f.f12827D;
                RunnableC1071c runnableC1071c = c1074f.f12853w;
                handler.removeCallbacks(runnableC1071c);
                if (z7) {
                    Handler handler2 = c1074f.f12827D;
                    g2.c cVar5 = c1074f.f12831H;
                    long u4 = t.u(c1074f.f12835L);
                    int size2 = cVar5.f13120m.size() - 1;
                    g2.h b10 = cVar5.b(size2);
                    long E13 = t.E(b10.f13143b);
                    long d10 = cVar5.d(size2);
                    long E14 = t.E(u4);
                    long E15 = t.E(cVar5.f13109a);
                    long E16 = t.E(5000L);
                    int i14 = 0;
                    while (true) {
                        List list5 = b10.f13144c;
                        if (i14 >= list5.size()) {
                            break;
                        }
                        List list6 = ((g2.a) list5.get(i14)).f13101c;
                        if (!list6.isEmpty() && (c3 = ((g2.m) list6.get(0)).c()) != null) {
                            long g3 = (c3.g(d10, E14) + (E15 + E13)) - E14;
                            if (g3 < E16 - 100000 || (g3 > E16 && g3 < E16 + 100000)) {
                                E16 = g3;
                            }
                        }
                        i14++;
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j25 = E16 / 1000;
                    long j26 = E16 - (1000 * j25);
                    if (j26 != 0) {
                        int i15 = ((int) ((E16 ^ 1000) >> 63)) | 1;
                        switch (G3.c.f2870a[roundingMode.ordinal()]) {
                            case 1:
                                if (j26 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j25 += i15;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j26);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == 0) {
                                    break;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    handler2.postDelayed(runnableC1071c, j25);
                }
                if (c1074f.f12832I) {
                    t();
                    return;
                }
                if (z4) {
                    g2.c cVar6 = c1074f.f12831H;
                    if (cVar6.f13112d) {
                        long j27 = cVar6.f13113e;
                        if (j27 != -9223372036854775807L) {
                            c1074f.f12827D.postDelayed(c1074f.f12852v, Math.max(0L, (c1074f.f12833J + (j27 == 0 ? 5000L : j27)) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z7 = false;
        if (z7) {
        }
        long j142 = E9 - E8;
        cVar = c1074f.f12831H;
        if (cVar.f13112d) {
        }
        long E122 = j - t.E(hVar2.f13143b);
        g2.c cVar42 = c1074f.f12831H;
        c1074f.k(new C1072d(cVar42.f13109a, j3, c1074f.f12835L, c1074f.f12838O, E122, j142, j7, cVar42, c1074f.f12839h, !cVar42.f13112d ? c1074f.f12828E : null));
        if (c1074f.f12840i) {
        }
    }

    public final void t() {
        Uri uri;
        this.f12827D.removeCallbacks(this.f12852v);
        if (this.f12824A.b()) {
            return;
        }
        if (this.f12824A.d()) {
            this.f12832I = true;
            return;
        }
        synchronized (this.f12850t) {
            uri = this.f12829F;
        }
        this.f12832I = false;
        N n2 = new N(this.f12856z, uri, 4, this.f12848r);
        x0 x0Var = this.f12849s;
        this.f12844n.getClass();
        this.f12824A.f(n2, x0Var, 3);
        this.f12847q.k(new C0814u(n2.f16729b), n2.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
