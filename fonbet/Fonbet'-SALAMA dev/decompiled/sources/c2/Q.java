package c2;

import A1.C0016e0;
import A1.C0022h0;
import android.net.Uri;
import android.os.Looper;
import d6.C0977k;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.C1643u;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class Q extends AbstractC0795a {

    /* renamed from: h, reason: collision with root package name */
    public final C0022h0 f10241h;

    /* renamed from: i, reason: collision with root package name */
    public final C0016e0 f10242i;
    public final C0977k j;

    /* renamed from: k, reason: collision with root package name */
    public final R5.F f10243k;

    /* renamed from: l, reason: collision with root package name */
    public final E1.h f10244l;

    /* renamed from: m, reason: collision with root package name */
    public final M4.e f10245m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10246n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10247o;

    /* renamed from: p, reason: collision with root package name */
    public long f10248p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10249q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10250r;

    /* renamed from: s, reason: collision with root package name */
    public u2.U f10251s;

    public Q(C0022h0 c0022h0, C0977k c0977k, R5.F f7, E1.h hVar, M4.e eVar) {
        C0016e0 c0016e0 = c0022h0.f367b;
        c0016e0.getClass();
        this.f10242i = c0016e0;
        this.f10241h = c0022h0;
        this.j = c0977k;
        this.f10243k = f7;
        this.f10244l = hVar;
        this.f10245m = eVar;
        this.f10246n = 1048576;
        this.f10247o = true;
        this.f10248p = -9223372036854775807L;
    }

    @Override // c2.AbstractC0795a
    public final InterfaceC0794B a(D d7, u2.r rVar, long j) {
        InterfaceC1636m a2 = this.j.a();
        u2.U u4 = this.f10251s;
        if (u4 != null) {
            ((C1643u) a2).x(u4);
        }
        Uri uri = this.f10242i.f345a;
        AbstractC1664a.i(this.f10302g);
        return new O(uri, a2, new C1726n0((F1.i) this.f10243k.f6075b), this.f10244l, new B1.m((CopyOnWriteArrayList) this.f10299d.f1016d, 0, d7, 2), this.f10245m, new I(this.f10298c.f10181c, 0, d7, 0L), this, rVar, this.f10246n);
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return this.f10241h;
    }

    @Override // c2.AbstractC0795a
    public final void j(u2.U u4) {
        this.f10251s = u4;
        E1.h hVar = this.f10244l;
        hVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        B1.p pVar = this.f10302g;
        AbstractC1664a.i(pVar);
        hVar.c(myLooper, pVar);
        q();
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
        O o7 = (O) interfaceC0794B;
        if (o7.f10215L) {
            for (V v6 : o7.f10212I) {
                v6.h();
                C1719l1 c1719l1 = v6.f10275h;
                if (c1719l1 != null) {
                    c1719l1.F(v6.f10272e);
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

    @Override // c2.AbstractC0795a
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

    @Override // c2.AbstractC0795a
    public final void h() {
    }
}
