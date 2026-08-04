package p018c2;

import A1.C0022h0;
import A1.Q0;
import A1.R0;
import java.util.ArrayList;
import p146u2.U;
import p146u2.r;
import p151v2.a;
import p151v2.t;

/* JADX INFO: renamed from: c2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0761g extends AbstractC0764j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0755a f10350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f10354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q0 f10355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0759e f10356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0760f f10357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f10358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10359t;

    public C0761g(AbstractC0755a abstractC0755a, long j, long j3) {
        a.f(j >= 0);
        abstractC0755a.getClass();
        this.f10350k = abstractC0755a;
        this.f10351l = j;
        this.f10352m = j3;
        this.f10353n = true;
        this.f10354o = new ArrayList();
        this.f10355p = new Q0();
    }

    @Override // p018c2.AbstractC0755a
    public final B a(D d7, r rVar, long j) {
        C0758d c0758d = new C0758d(this.f10350k.a(d7, rVar, j), this.f10353n, this.f10358s, this.f10359t);
        this.f10354o.add(c0758d);
        return c0758d;
    }

    @Override // p018c2.AbstractC0755a
    public final C0022h0 g() {
        return this.f10350k.g();
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
    public final void h() throws C0760f {
        C0760f c0760f = this.f10357r;
        if (c0760f != null) {
            throw c0760f;
        }
        super.h();
    }

    @Override // p018c2.AbstractC0755a
    public final void j(U u4) {
        this.j = u4;
        this.f10366i = t.m(null);
        t(null, this.f10350k);
    }

    @Override // p018c2.AbstractC0755a
    public final void l(B b7) {
        ArrayList arrayList = this.f10354o;
        a.h(arrayList.remove(b7));
        this.f10350k.l(((C0758d) b7).f10316a);
        if (arrayList.isEmpty()) {
            C0759e c0759e = this.f10356q;
            c0759e.getClass();
            u(c0759e.f10399b);
        }
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
    public final void n() {
        super.n();
        this.f10357r = null;
        this.f10356q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c2.AbstractC0764j
    public final void s(C0769o c0769o, R0 r7) {
        if (this.f10357r != null) {
            return;
        }
        u(r7);
    }

    public final void u(R0 r7) {
        long j;
        Q0 q1 = this.f10355p;
        r7.n(0, q1);
        long j3 = q1.f210H;
        C0759e c0759e = this.f10356q;
        ArrayList arrayList = this.f10354o;
        long j7 = this.f10352m;
        if (c0759e == null || arrayList.isEmpty()) {
            j = this.f10351l;
            this.f10358s = j3 + j;
            this.f10359t = j7 != Long.MIN_VALUE ? j3 + j7 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0758d c0758d = (C0758d) arrayList.get(i7);
                long j8 = this.f10358s;
                long j9 = this.f10359t;
                c0758d.f10320e = j8;
                c0758d.f10321f = j9;
            }
        } else {
            j = this.f10358s - j3;
            j7 = j7 != Long.MIN_VALUE ? this.f10359t - j3 : Long.MIN_VALUE;
        }
        try {
            C0759e c0759e2 = new C0759e(r7, j, j7);
            this.f10356q = c0759e2;
            k(c0759e2);
        } catch (C0760f e7) {
            this.f10357r = e7;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0758d) arrayList.get(i8)).f10322x = this.f10357r;
            }
        }
    }
}
