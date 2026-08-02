package u2;

import P.AbstractC0329z;
import P.C0297i0;
import P.C0299j0;
import P.C0305m0;
import a.AbstractC0444a;
import android.os.SystemClock;
import h0.C1991e;
import i0.C2006k;
import k0.C2022b;
import k0.C2023c;
import n0.AbstractC2157b;
import x0.InterfaceC2624j;
import x0.f0;
import z0.C2733I;

/* loaded from: classes.dex */
public final class t extends AbstractC2157b {

    /* renamed from: o, reason: collision with root package name */
    public AbstractC2157b f20036o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC2157b f20037p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2624j f20038q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20039r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20040s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20043v;

    /* renamed from: t, reason: collision with root package name */
    public final C0299j0 f20041t = new C0299j0(0);

    /* renamed from: u, reason: collision with root package name */
    public long f20042u = -1;

    /* renamed from: w, reason: collision with root package name */
    public final C0297i0 f20044w = new C0297i0(1.0f);

    /* renamed from: x, reason: collision with root package name */
    public final C0305m0 f20045x = AbstractC0329z.t(null);

    public t(AbstractC2157b abstractC2157b, AbstractC2157b abstractC2157b2, InterfaceC2624j interfaceC2624j, int i, boolean z3) {
        this.f20036o = abstractC2157b;
        this.f20037p = abstractC2157b2;
        this.f20038q = interfaceC2624j;
        this.f20039r = i;
        this.f20040s = z3;
    }

    @Override // n0.AbstractC2157b
    public final void b(float f) {
        this.f20044w.i(f);
    }

    @Override // n0.AbstractC2157b
    public final void d(C2006k c2006k) {
        this.f20045x.setValue(c2006k);
    }

    @Override // n0.AbstractC2157b
    public final long h() {
        AbstractC2157b abstractC2157b = this.f20036o;
        long h3 = abstractC2157b != null ? abstractC2157b.h() : 0L;
        AbstractC2157b abstractC2157b2 = this.f20037p;
        long h4 = abstractC2157b2 != null ? abstractC2157b2.h() : 0L;
        boolean z3 = h3 != 9205357640488583168L;
        boolean z5 = h4 != 9205357640488583168L;
        if (z3 && z5) {
            return AbstractC0444a.d(Math.max(C1991e.d(h3), C1991e.d(h4)), Math.max(C1991e.b(h3), C1991e.b(h4)));
        }
        return 9205357640488583168L;
    }

    @Override // n0.AbstractC2157b
    public final void i(C2733I c2733i) {
        boolean z3 = this.f20043v;
        C0297i0 c0297i0 = this.f20044w;
        AbstractC2157b abstractC2157b = this.f20037p;
        if (z3) {
            j(c2733i, abstractC2157b, c0297i0.h());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f20042u == -1) {
            this.f20042u = uptimeMillis;
        }
        float f = (uptimeMillis - this.f20042u) / this.f20039r;
        float h3 = c0297i0.h() * AbstractC0444a.s(f, 0.0f, 1.0f);
        float h4 = this.f20040s ? c0297i0.h() - h3 : c0297i0.h();
        this.f20043v = f >= 1.0f;
        j(c2733i, this.f20036o, h4);
        j(c2733i, abstractC2157b, h3);
        if (this.f20043v) {
            this.f20036o = null;
        } else {
            C0299j0 c0299j0 = this.f20041t;
            c0299j0.i(c0299j0.h() + 1);
        }
    }

    public final void j(C2733I c2733i, AbstractC2157b abstractC2157b, float f) {
        if (abstractC2157b == null || f <= 0.0f) {
            return;
        }
        long d5 = c2733i.d();
        long h3 = abstractC2157b.h();
        long j5 = (h3 == 9205357640488583168L || C1991e.e(h3) || d5 == 9205357640488583168L || C1991e.e(d5)) ? d5 : f0.j(h3, this.f20038q.a(h3, d5));
        C0305m0 c0305m0 = this.f20045x;
        if (d5 == 9205357640488583168L || C1991e.e(d5)) {
            abstractC2157b.g(c2733i, j5, f, (C2006k) c0305m0.getValue());
            return;
        }
        float f5 = 2;
        float d6 = (C1991e.d(d5) - C1991e.d(j5)) / f5;
        float b3 = (C1991e.b(d5) - C1991e.b(j5)) / f5;
        C2022b c2022b = c2733i.f21647k;
        ((C2023c) c2022b.f17540l.f20432l).v(d6, b3, d6, b3);
        abstractC2157b.g(c2733i, j5, f, (C2006k) c0305m0.getValue());
        float f6 = -d6;
        float f7 = -b3;
        ((C2023c) c2022b.f17540l.f20432l).v(f6, f7, f6, f7);
    }
}
