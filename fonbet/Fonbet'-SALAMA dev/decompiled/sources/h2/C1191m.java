package h2;

import A1.C0014d0;
import A1.C0016e0;
import A1.C0022h0;
import A1.x0;
import B4.V;
import E3.AbstractC0167z;
import android.net.Uri;
import android.os.Looper;
import c2.AbstractC0795a;
import c2.C0814u;
import c2.D;
import c2.I;
import c2.InterfaceC0794B;
import c2.d0;
import i2.C1246b;
import i2.C1247c;
import i2.C1248d;
import i2.C1249e;
import i2.C1251g;
import i2.C1253i;
import i2.C1254j;
import i2.C1257m;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.InterfaceC1635l;
import u2.K;
import u2.N;
import u2.U;
import v2.AbstractC1664a;
import v2.t;
import w1.C1718l0;
import w1.C1719l1;

/* renamed from: h2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191m extends AbstractC0795a {

    /* renamed from: h, reason: collision with root package name */
    public final C1181c f13443h;

    /* renamed from: i, reason: collision with root package name */
    public final C0016e0 f13444i;
    public final x0 j;

    /* renamed from: k, reason: collision with root package name */
    public final V f13445k;

    /* renamed from: l, reason: collision with root package name */
    public final E1.h f13446l;

    /* renamed from: m, reason: collision with root package name */
    public final M4.e f13447m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13448n;

    /* renamed from: o, reason: collision with root package name */
    public final int f13449o;

    /* renamed from: p, reason: collision with root package name */
    public final C1247c f13450p;

    /* renamed from: q, reason: collision with root package name */
    public final long f13451q;

    /* renamed from: r, reason: collision with root package name */
    public final C0022h0 f13452r;

    /* renamed from: s, reason: collision with root package name */
    public C0014d0 f13453s;

    /* renamed from: t, reason: collision with root package name */
    public U f13454t;

    static {
        A1.V.a("goog.exo.hls");
    }

    public C1191m(C0022h0 c0022h0, x0 x0Var, C1181c c1181c, V v6, E1.h hVar, M4.e eVar, C1247c c1247c, long j, boolean z4, int i7) {
        C0016e0 c0016e0 = c0022h0.f367b;
        c0016e0.getClass();
        this.f13444i = c0016e0;
        this.f13452r = c0022h0;
        this.f13453s = c0022h0.f368c;
        this.j = x0Var;
        this.f13443h = c1181c;
        this.f13445k = v6;
        this.f13446l = hVar;
        this.f13447m = eVar;
        this.f13450p = c1247c;
        this.f13451q = j;
        this.f13448n = z4;
        this.f13449o = i7;
    }

    public static C1249e q(AbstractC0167z abstractC0167z, long j) {
        C1249e c1249e = null;
        for (int i7 = 0; i7 < abstractC0167z.size(); i7++) {
            C1249e c1249e2 = (C1249e) abstractC0167z.get(i7);
            long j3 = c1249e2.f13877e;
            if (j3 > j || !c1249e2.f13864C) {
                if (j3 > j) {
                    break;
                }
            } else {
                c1249e = c1249e2;
            }
        }
        return c1249e;
    }

    @Override // c2.AbstractC0795a
    public final InterfaceC0794B a(D d7, u2.r rVar, long j) {
        I i7 = new I(this.f10298c.f10181c, 0, d7, 0L);
        B1.m mVar = new B1.m((CopyOnWriteArrayList) this.f10299d.f1016d, 0, d7, 2);
        U u4 = this.f13454t;
        B1.p pVar = this.f10302g;
        AbstractC1664a.i(pVar);
        return new C1190l(this.f13443h, this.f13450p, this.j, u4, this.f13446l, mVar, this.f13447m, i7, rVar, this.f13445k, this.f13448n, this.f13449o, pVar);
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return this.f13452r;
    }

    @Override // c2.AbstractC0795a
    public final void h() {
        C1247c c1247c = this.f13450p;
        K k7 = c1247c.f13861x;
        if (k7 != null) {
            k7.c();
        }
        Uri uri = c1247c.f13851B;
        if (uri != null) {
            C1246b c1246b = (C1246b) c1247c.f13858d.get(uri);
            c1246b.f13841b.c();
            IOException iOException = c1246b.f13838A;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // c2.AbstractC0795a
    public final void j(U u4) {
        this.f13454t = u4;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        B1.p pVar = this.f10302g;
        AbstractC1664a.i(pVar);
        E1.h hVar = this.f13446l;
        hVar.c(myLooper, pVar);
        hVar.a();
        I i7 = new I(this.f10298c.f10181c, 0, null, 0L);
        Uri uri = this.f13444i.f345a;
        C1247c c1247c = this.f13450p;
        c1247c.getClass();
        c1247c.f13862y = t.m(null);
        c1247c.f13860f = i7;
        c1247c.f13863z = this;
        N n2 = new N(((InterfaceC1635l) c1247c.f13855a.f613b).a(), uri, 4, c1247c.f13856b.j());
        AbstractC1664a.h(c1247c.f13861x == null);
        K k7 = new K("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c1247c.f13861x = k7;
        M4.e eVar = c1247c.f13857c;
        int i8 = n2.f16730c;
        k7.f(n2, c1247c, eVar.u(i8));
        i7.k(new C0814u(n2.f16729b), i8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
        C1190l c1190l = (C1190l) interfaceC0794B;
        c1190l.f13435b.f13859e.remove(c1190l);
        for (C1196r c1196r : c1190l.f13430K) {
            if (c1196r.f13490U) {
                for (C1195q c1195q : c1196r.f13482M) {
                    c1195q.h();
                    C1719l1 c1719l1 = c1195q.f10275h;
                    if (c1719l1 != null) {
                        c1719l1.F(c1195q.f10272e);
                        c1195q.f10275h = null;
                        c1195q.f10274g = null;
                    }
                }
            }
            c1196r.f13470A.e(c1196r);
            c1196r.f13478I.removeCallbacksAndMessages(null);
            c1196r.f13494Y = true;
            c1196r.f13479J.clear();
        }
        c1190l.f13427H = null;
    }

    @Override // c2.AbstractC0795a
    public final void n() {
        C1247c c1247c = this.f13450p;
        c1247c.f13851B = null;
        c1247c.f13852C = null;
        c1247c.f13850A = null;
        c1247c.f13854E = -9223372036854775807L;
        c1247c.f13861x.e(null);
        c1247c.f13861x = null;
        HashMap hashMap = c1247c.f13858d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C1246b) it.next()).f13841b.e(null);
        }
        c1247c.f13862y.removeCallbacksAndMessages(null);
        c1247c.f13862y = null;
        hashMap.clear();
        this.f13446l.release();
    }

    public final void r(C1254j c1254j) {
        C1191m c1191m;
        d0 d0Var;
        C1191m c1191m2;
        long j;
        long j3;
        long j7;
        long j8;
        int i7;
        int i8;
        long j9;
        boolean z4 = c1254j.f13898p;
        long j10 = c1254j.f13891h;
        long N7 = z4 ? t.N(j10) : -9223372036854775807L;
        int i9 = c1254j.f13887d;
        long j11 = (i9 == 2 || i9 == 1) ? N7 : -9223372036854775807L;
        C1247c c1247c = this.f13450p;
        C1257m c1257m = c1247c.f13850A;
        c1257m.getClass();
        C1718l0 c1718l0 = new C1718l0(18);
        long j12 = N7;
        long j13 = j11;
        new C1248d(c1257m.f13924a, c1257m.f13925b, c1257m.f13916e, c1257m.f13917f, c1257m.f13918g, c1257m.f13919h, c1257m.f13920i, c1257m.j, c1257m.f13921k, c1257m.f13926c, c1257m.f13922l, c1257m.f13923m);
        boolean z7 = c1247c.f13853D;
        long j14 = c1254j.f13903u;
        AbstractC0167z abstractC0167z = c1254j.f13900r;
        boolean z8 = c1254j.f13890g;
        long j15 = c1254j.f13888e;
        if (z7) {
            long j16 = j10 - c1247c.f13854E;
            boolean z9 = c1254j.f13897o;
            long j17 = z9 ? j16 + j14 : -9223372036854775807L;
            if (c1254j.f13898p) {
                c1191m2 = this;
                j = t.E(t.u(c1191m2.f13451q)) - (j10 + j14);
            } else {
                c1191m2 = this;
                j = 0;
            }
            long j18 = c1191m2.f13453s.f337a;
            C1253i c1253i = c1254j.f13904v;
            if (j18 != -9223372036854775807L) {
                j7 = t.E(j18);
            } else {
                if (j15 != -9223372036854775807L) {
                    j3 = j14 - j15;
                } else {
                    long j19 = c1253i.f13885d;
                    if (j19 == -9223372036854775807L || c1254j.f13896n == -9223372036854775807L) {
                        j3 = c1253i.f13884c;
                        if (j3 == -9223372036854775807L) {
                            j3 = c1254j.f13895m * 3;
                        }
                    } else {
                        j3 = j19;
                    }
                }
                j7 = j3 + j;
            }
            long j20 = j14 + j;
            long k7 = t.k(j7, j, j20);
            C0014d0 c0014d0 = c1191m2.f13452r.f368c;
            boolean z10 = c0014d0.f340d == -3.4028235E38f && c0014d0.f341e == -3.4028235E38f && c1253i.f13884c == -9223372036854775807L && c1253i.f13885d == -9223372036854775807L;
            long N8 = t.N(k7);
            c1191m2.f13453s = new C0014d0(N8, -9223372036854775807L, -9223372036854775807L, z10 ? 1.0f : c1191m2.f13453s.f340d, z10 ? 1.0f : c1191m2.f13453s.f341e);
            if (j15 == -9223372036854775807L) {
                j15 = j20 - t.E(N8);
            }
            if (z8) {
                j9 = j15;
            } else {
                C1249e q7 = q(c1254j.f13901s, j15);
                if (q7 != null) {
                    j8 = q7.f13877e;
                } else if (abstractC0167z.isEmpty()) {
                    i7 = i9;
                    i8 = 2;
                    j9 = 0;
                    c1191m = c1191m2;
                    d0Var = new d0(j13, j12, j17, c1254j.f13903u, j16, j9, true, !z9, i7 != i8 && c1254j.f13889f, c1718l0, c1191m2.f13452r, c1191m2.f13453s);
                } else {
                    C1251g c1251g = (C1251g) abstractC0167z.get(t.d(abstractC0167z, Long.valueOf(j15), true));
                    C1249e q8 = q(c1251g.f13870D, j15);
                    j8 = q8 != null ? q8.f13877e : c1251g.f13877e;
                }
                j9 = j8;
            }
            i7 = i9;
            i8 = 2;
            if (i7 != i8) {
            }
            c1191m = c1191m2;
            d0Var = new d0(j13, j12, j17, c1254j.f13903u, j16, j9, true, !z9, i7 != i8 && c1254j.f13889f, c1718l0, c1191m2.f13452r, c1191m2.f13453s);
        } else {
            c1191m = this;
            long j21 = (j15 == -9223372036854775807L || abstractC0167z.isEmpty()) ? 0L : (z8 || j15 == j14) ? j15 : ((C1251g) abstractC0167z.get(t.d(abstractC0167z, Long.valueOf(j15), true))).f13877e;
            C0022h0 c0022h0 = c1191m.f13452r;
            long j22 = c1254j.f13903u;
            d0Var = new d0(j13, j12, j22, j22, 0L, j21, true, false, true, c1718l0, c0022h0, null);
        }
        c1191m.k(d0Var);
    }
}
