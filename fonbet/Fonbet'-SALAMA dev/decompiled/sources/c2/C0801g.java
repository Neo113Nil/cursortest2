package c2;

import A1.C0022h0;
import A1.Q0;
import A1.R0;
import java.util.ArrayList;
import v2.AbstractC1664a;

/* renamed from: c2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801g extends AbstractC0804j {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0795a f10350k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10351l;

    /* renamed from: m, reason: collision with root package name */
    public final long f10352m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10353n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f10354o;

    /* renamed from: p, reason: collision with root package name */
    public final Q0 f10355p;

    /* renamed from: q, reason: collision with root package name */
    public C0799e f10356q;

    /* renamed from: r, reason: collision with root package name */
    public C0800f f10357r;

    /* renamed from: s, reason: collision with root package name */
    public long f10358s;

    /* renamed from: t, reason: collision with root package name */
    public long f10359t;

    public C0801g(AbstractC0795a abstractC0795a, long j, long j3) {
        AbstractC1664a.f(j >= 0);
        abstractC0795a.getClass();
        this.f10350k = abstractC0795a;
        this.f10351l = j;
        this.f10352m = j3;
        this.f10353n = true;
        this.f10354o = new ArrayList();
        this.f10355p = new Q0();
    }

    @Override // c2.AbstractC0795a
    public final InterfaceC0794B a(D d7, u2.r rVar, long j) {
        C0798d c0798d = new C0798d(this.f10350k.a(d7, rVar, j), this.f10353n, this.f10358s, this.f10359t);
        this.f10354o.add(c0798d);
        return c0798d;
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return this.f10350k.g();
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final void h() {
        C0800f c0800f = this.f10357r;
        if (c0800f != null) {
            throw c0800f;
        }
        super.h();
    }

    @Override // c2.AbstractC0795a
    public final void j(u2.U u4) {
        this.j = u4;
        this.f10366i = v2.t.m(null);
        t(null, this.f10350k);
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
        ArrayList arrayList = this.f10354o;
        AbstractC1664a.h(arrayList.remove(interfaceC0794B));
        this.f10350k.l(((C0798d) interfaceC0794B).f10316a);
        if (arrayList.isEmpty()) {
            C0799e c0799e = this.f10356q;
            c0799e.getClass();
            u(c0799e.f10399b);
        }
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final void n() {
        super.n();
        this.f10357r = null;
        this.f10356q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c2.AbstractC0804j
    public final void s(C0809o c0809o, R0 r02) {
        if (this.f10357r != null) {
            return;
        }
        u(r02);
    }

    public final void u(R0 r02) {
        long j;
        Q0 q02 = this.f10355p;
        r02.n(0, q02);
        long j3 = q02.f210H;
        C0799e c0799e = this.f10356q;
        ArrayList arrayList = this.f10354o;
        long j7 = this.f10352m;
        if (c0799e == null || arrayList.isEmpty()) {
            j = this.f10351l;
            this.f10358s = j3 + j;
            this.f10359t = j7 != Long.MIN_VALUE ? j3 + j7 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0798d c0798d = (C0798d) arrayList.get(i7);
                long j8 = this.f10358s;
                long j9 = this.f10359t;
                c0798d.f10320e = j8;
                c0798d.f10321f = j9;
            }
        } else {
            j = this.f10358s - j3;
            j7 = j7 != Long.MIN_VALUE ? this.f10359t - j3 : Long.MIN_VALUE;
        }
        try {
            C0799e c0799e2 = new C0799e(r02, j, j7);
            this.f10356q = c0799e2;
            k(c0799e2);
        } catch (C0800f e7) {
            this.f10357r = e7;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0798d) arrayList.get(i8)).f10322x = this.f10357r;
            }
        }
    }
}
