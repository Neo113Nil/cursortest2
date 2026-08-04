package p054h2;

import A1.C0014d0;
import A1.C0016e0;
import A1.C0022h0;
import A1.x0;
import B1.p;
import B4.V;
import E1.h;
import E3.AbstractC0167z;
import M4.e;
import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.AbstractC0755a;
import p018c2.B;
import p018c2.C0774u;
import p018c2.D;
import p018c2.I;
import p018c2.d0;
import p061i2.b;
import p061i2.c;
import p061i2.d;
import p061i2.g;
import p061i2.i;
import p061i2.j;
import p146u2.InterfaceC0953l;
import p146u2.K;
import p146u2.N;
import p146u2.U;
import p146u2.r;
import p151v2.a;
import p151v2.t;
import p155w1.C1009l0;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0755a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f13449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0016e0 f13450i;
    public final x0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V f13451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f13452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f13453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f13456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f13457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0022h0 f13458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0014d0 f13459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public U f13460t;

    static {
        A1.V.a("goog.exo.hls");
    }

    public m(C0022h0 c0022h0, x0 x0Var, c cVar, V v6, h hVar, e eVar, c cVar2, long j, boolean z4, int i7) {
        C0016e0 c0016e0 = c0022h0.f367b;
        c0016e0.getClass();
        this.f13450i = c0016e0;
        this.f13458r = c0022h0;
        this.f13459s = c0022h0.f368c;
        this.j = x0Var;
        this.f13449h = cVar;
        this.f13451k = v6;
        this.f13452l = hVar;
        this.f13453m = eVar;
        this.f13456p = cVar2;
        this.f13457q = j;
        this.f13454n = z4;
        this.f13455o = i7;
    }

    public static p061i2.e q(AbstractC0167z abstractC0167z, long j) {
        p061i2.e eVar = null;
        for (int i7 = 0; i7 < abstractC0167z.size(); i7++) {
            p061i2.e eVar2 = (p061i2.e) abstractC0167z.get(i7);
            long j3 = eVar2.f13883e;
            if (j3 > j || !eVar2.f13870C) {
                if (j3 > j) {
                    break;
                }
            } else {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    @Override // p018c2.AbstractC0755a
    public final B a(D d7, r rVar, long j) {
        I i7 = new I(this.f10298c.f10181c, 0, d7, 0L);
        B1.m mVar = new B1.m((CopyOnWriteArrayList) this.f10299d.f1016d, 0, d7, 2);
        U u4 = this.f13460t;
        p pVar = this.f10302g;
        a.i(pVar);
        return new l(this.f13449h, this.f13456p, this.j, u4, this.f13452l, mVar, this.f13453m, i7, rVar, this.f13451k, this.f13454n, this.f13455o, pVar);
    }

    @Override // p018c2.AbstractC0755a
    public final C0022h0 g() {
        return this.f13458r;
    }

    @Override // p018c2.AbstractC0755a
    public final void h() throws IOException {
        c cVar = this.f13456p;
        K k7 = cVar.f13867x;
        if (k7 != null) {
            k7.c();
        }
        Uri uri = cVar.f13857B;
        if (uri != null) {
            b bVar = (b) cVar.f13864d.get(uri);
            bVar.f13847b.c();
            IOException iOException = bVar.f13844A;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // p018c2.AbstractC0755a
    public final void j(U u4) {
        this.f13460t = u4;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        p pVar = this.f10302g;
        a.i(pVar);
        h hVar = this.f13452l;
        hVar.c(looperMyLooper, pVar);
        hVar.a();
        I i7 = new I(this.f10298c.f10181c, 0, null, 0L);
        Uri uri = this.f13450i.f345a;
        c cVar = this.f13456p;
        cVar.getClass();
        cVar.f13868y = t.m(null);
        cVar.f13866f = i7;
        cVar.f13869z = this;
        N n2 = new N(((InterfaceC0953l) cVar.f13861a.f613b).a(), uri, 4, cVar.f13862b.j());
        a.h(cVar.f13867x == null);
        K k7 = new K("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f13867x = k7;
        e eVar = cVar.f13863c;
        int i8 = n2.f16736c;
        k7.f(n2, cVar, eVar.u(i8));
        i7.k(new C0774u(n2.f16735b), i8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p018c2.AbstractC0755a
    public final void l(B b7) {
        l lVar = (l) b7;
        lVar.f13441b.f13865e.remove(lVar);
        for (r rVar : lVar.f13436K) {
            if (rVar.f13496U) {
                for (q qVar : rVar.f13488M) {
                    qVar.h();
                    C1010l1 c1010l1 = qVar.f10275h;
                    if (c1010l1 != null) {
                        c1010l1.F(qVar.f10272e);
                        qVar.f10275h = null;
                        qVar.f10274g = null;
                    }
                }
            }
            rVar.f13476A.e(rVar);
            rVar.f13484I.removeCallbacksAndMessages(null);
            rVar.f13500Y = true;
            rVar.f13485J.clear();
        }
        lVar.f13433H = null;
    }

    @Override // p018c2.AbstractC0755a
    public final void n() {
        c cVar = this.f13456p;
        cVar.f13857B = null;
        cVar.f13858C = null;
        cVar.f13856A = null;
        cVar.f13860E = -9223372036854775807L;
        cVar.f13867x.e(null);
        cVar.f13867x = null;
        HashMap map = cVar.f13864d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f13847b.e(null);
        }
        cVar.f13868y.removeCallbacksAndMessages(null);
        cVar.f13868y = null;
        map.clear();
        this.f13452l.release();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    public final void r(j jVar) {
        m mVar;
        long j;
        d0 d0Var;
        m mVar2;
        long jE;
        long j3;
        long jE2;
        long j7;
        int i7;
        long j8;
        boolean z4;
        boolean z7 = jVar.f13904p;
        long j9 = jVar.f13897h;
        long jN = z7 ? t.N(j9) : -9223372036854775807L;
        int i8 = jVar.f13893d;
        long j10 = (i8 == 2 || i8 == 1) ? jN : -9223372036854775807L;
        c cVar = this.f13456p;
        p061i2.m mVar3 = cVar.f13856A;
        mVar3.getClass();
        C1009l0 c1009l0 = new C1009l0(18);
        long j11 = jN;
        long j12 = j10;
        new d(mVar3.f13930a, mVar3.f13931b, mVar3.f13922e, mVar3.f13923f, mVar3.f13924g, mVar3.f13925h, mVar3.f13926i, mVar3.j, mVar3.f13927k, mVar3.f13932c, mVar3.f13928l, mVar3.f13929m);
        boolean z8 = cVar.f13859D;
        long j13 = jVar.f13909u;
        AbstractC0167z abstractC0167z = jVar.f13906r;
        boolean z9 = jVar.f13896g;
        long jE3 = jVar.f13894e;
        if (z8) {
            long j14 = j9 - cVar.f13860E;
            boolean z10 = jVar.f13903o;
            long j15 = z10 ? j14 + j13 : -9223372036854775807L;
            if (jVar.f13904p) {
                mVar2 = this;
                jE = t.E(t.u(mVar2.f13457q)) - (j9 + j13);
            } else {
                mVar2 = this;
                jE = 0;
            }
            long j16 = mVar2.f13459s.f337a;
            i iVar = jVar.f13910v;
            if (j16 != -9223372036854775807L) {
                jE2 = t.E(j16);
            } else {
                if (jE3 != -9223372036854775807L) {
                    j3 = j13 - jE3;
                } else {
                    long j17 = iVar.f13891d;
                    if (j17 == -9223372036854775807L || jVar.f13902n == -9223372036854775807L) {
                        j3 = iVar.f13890c;
                        if (j3 == -9223372036854775807L) {
                            j3 = jVar.f13901m * 3;
                        }
                    } else {
                        j3 = j17;
                    }
                }
                jE2 = j3 + jE;
            }
            long j18 = j13 + jE;
            long jK = t.k(jE2, jE, j18);
            C0014d0 c0014d0 = mVar2.f13458r.f368c;
            boolean z11 = c0014d0.f340d == -3.4028235E38f && c0014d0.f341e == -3.4028235E38f && iVar.f13890c == -9223372036854775807L && iVar.f13891d == -9223372036854775807L;
            long jN2 = t.N(jK);
            mVar2.f13459s = new C0014d0(jN2, -9223372036854775807L, -9223372036854775807L, z11 ? 1.0f : mVar2.f13459s.f340d, z11 ? 1.0f : mVar2.f13459s.f341e);
            if (jE3 == -9223372036854775807L) {
                jE3 = j18 - t.E(jN2);
            }
            if (z9) {
                j8 = jE3;
            } else {
                p061i2.e eVarQ = q(jVar.f13907s, jE3);
                if (eVarQ != null) {
                    j7 = eVarQ.f13883e;
                } else {
                    if (abstractC0167z.isEmpty()) {
                        i7 = 2;
                        j8 = 0;
                    } else {
                        g gVar = (g) abstractC0167z.get(t.d(abstractC0167z, Long.valueOf(jE3), true));
                        p061i2.e eVarQ2 = q(gVar.f13876D, jE3);
                        j7 = eVarQ2 != null ? eVarQ2.f13883e : gVar.f13883e;
                    }
                    if (i8 == i7 || !jVar.f13895f) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    mVar = mVar2;
                    d0Var = new d0(j12, j11, j15, jVar.f13909u, j14, j8, true, !z10, z4, c1009l0, mVar2.f13458r, mVar2.f13459s);
                }
                j8 = j7;
            }
            i7 = 2;
            if (i8 == i7) {
                z4 = false;
            } else {
                z4 = false;
            }
            mVar = mVar2;
            d0Var = new d0(j12, j11, j15, jVar.f13909u, j14, j8, true, !z10, z4, c1009l0, mVar2.f13458r, mVar2.f13459s);
        } else {
            mVar = this;
            if (jE3 == -9223372036854775807L || abstractC0167z.isEmpty()) {
                j = 0;
            } else {
                j = (z9 || jE3 == j13) ? jE3 : ((g) abstractC0167z.get(t.d(abstractC0167z, Long.valueOf(jE3), true))).f13883e;
            }
            C0022h0 c0022h0 = mVar.f13458r;
            long j19 = jVar.f13909u;
            d0Var = new d0(j12, j11, j19, j19, 0L, j, true, false, true, c1009l0, c0022h0, null);
        }
        mVar.k(d0Var);
    }
}
