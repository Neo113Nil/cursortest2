package p018c2;

import A1.C0016e0;
import A1.C0022h0;
import B1.m;
import B1.p;
import E1.h;
import F1.i;
import M4.e;
import R5.F;
import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import p028d6.k;
import p146u2.C0961u;
import p146u2.InterfaceC0954m;
import p146u2.U;
import p146u2.r;
import p151v2.a;
import p155w1.C1010l1;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0755a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0022h0 f10241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0016e0 f10242i;
    public final k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F f10243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f10244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f10245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public U f10251s;

    public Q(C0022h0 c0022h0, k kVar, F f7, h hVar, e eVar) {
        C0016e0 c0016e0 = c0022h0.f367b;
        c0016e0.getClass();
        this.f10242i = c0016e0;
        this.f10241h = c0022h0;
        this.j = kVar;
        this.f10243k = f7;
        this.f10244l = hVar;
        this.f10245m = eVar;
        this.f10246n = 1048576;
        this.f10247o = true;
        this.f10248p = -9223372036854775807L;
    }

    @Override // p018c2.AbstractC0755a
    public final B a(D d7, r rVar, long j) {
        InterfaceC0954m interfaceC0954mA = this.j.a();
        U u4 = this.f10251s;
        if (u4 != null) {
            ((C0961u) interfaceC0954mA).x(u4);
        }
        Uri uri = this.f10242i.f345a;
        a.i(this.f10302g);
        return new O(uri, interfaceC0954mA, new C1017n0((i) this.f10243k.f6075b), this.f10244l, new m((CopyOnWriteArrayList) this.f10299d.f1016d, 0, d7, 2), this.f10245m, new I(this.f10298c.f10181c, 0, d7, 0L), this, rVar, this.f10246n);
    }

    @Override // p018c2.AbstractC0755a
    public final C0022h0 g() {
        return this.f10241h;
    }

    @Override // p018c2.AbstractC0755a
    public final void j(U u4) {
        this.f10251s = u4;
        h hVar = this.f10244l;
        hVar.a();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        p pVar = this.f10302g;
        a.i(pVar);
        hVar.c(looperMyLooper, pVar);
        q();
    }

    @Override // p018c2.AbstractC0755a
    public final void l(B b7) {
        O o7 = (O) b7;
        if (o7.f10215L) {
            for (V v6 : o7.f10212I) {
                v6.h();
                C1010l1 c1010l1 = v6.f10275h;
                if (c1010l1 != null) {
                    c1010l1.F(v6.f10272e);
                    v6.f10275h = null;
                    v6.f10274g = null;
                }
            }
        }
        o7.f10204A.e(o7);
        o7.f10209F.removeCallbacksAndMessages(null);
        o7.f10210G = null;
        o7.f10233b0 = true;
    }

    @Override // p018c2.AbstractC0755a
    public final void n() {
        this.f10244l.release();
    }

    public final void q() {
        long j = this.f10248p;
        boolean z4 = this.f10249q;
        boolean z7 = this.f10250r;
        C0022h0 c0022h0 = this.f10241h;
        d0 d0Var = new d0(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z4, false, false, null, c0022h0, z7 ? c0022h0.f368c : null);
        k(this.f10247o ? new P(d0Var) : d0Var);
    }

    public final void r(long j, boolean z4, boolean z7) {
        if (j == -9223372036854775807L) {
            j = this.f10248p;
        }
        if (!this.f10247o && this.f10248p == j && this.f10249q == z4 && this.f10250r == z7) {
            return;
        }
        this.f10248p = j;
        this.f10249q = z4;
        this.f10250r = z7;
        this.f10247o = false;
        q();
    }

    @Override // p018c2.AbstractC0755a
    public final void h() {
    }
}
