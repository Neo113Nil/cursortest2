package L;

import M.C0254z;
import a.AbstractC0444a;
import p4.AbstractC2282w;
import r.C2316B;
import x0.InterfaceC2637x;
import y.C2654j;
import y.C2655k;
import z0.AbstractC2749f;
import z0.C2733I;
import z0.InterfaceC2754k;
import z0.InterfaceC2757n;
import z0.InterfaceC2764v;

/* loaded from: classes.dex */
public abstract class w extends b0.o implements InterfaceC2754k, InterfaceC2757n, InterfaceC2764v {

    /* renamed from: A, reason: collision with root package name */
    public final float f2982A;

    /* renamed from: B, reason: collision with root package name */
    public final C0254z f2983B;

    /* renamed from: C, reason: collision with root package name */
    public final M.A f2984C;

    /* renamed from: D, reason: collision with root package name */
    public A.v f2985D;

    /* renamed from: E, reason: collision with root package name */
    public float f2986E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2988G;

    /* renamed from: y, reason: collision with root package name */
    public final C2654j f2990y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2991z;

    /* renamed from: F, reason: collision with root package name */
    public long f2987F = 0;

    /* renamed from: H, reason: collision with root package name */
    public final C2316B f2989H = new C2316B();

    public w(C2654j c2654j, boolean z3, float f, C0254z c0254z, M.A a5) {
        this.f2990y = c2654j;
        this.f2991z = z3;
        this.f2982A = f;
        this.f2983B = c0254z;
        this.f2984C = a5;
    }

    public final void A0(y.n nVar) {
        if (nVar instanceof y.l) {
            y0((y.l) nVar, this.f2987F, this.f2986E);
        } else if (nVar instanceof y.m) {
            B0(((y.m) nVar).f21126a);
        } else if (nVar instanceof C2655k) {
            B0(((C2655k) nVar).f21124a);
        }
    }

    public abstract void B0(y.l lVar);

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        c2733i.a();
        A.v vVar = this.f2985D;
        if (vVar != null) {
            vVar.d(c2733i, this.f2986E, this.f2983B.a());
        }
        z0(c2733i);
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // b0.o
    public final void o0() {
        AbstractC2282w.p(k0(), null, new v(this, null), 3);
    }

    @Override // z0.InterfaceC2764v
    public final void s(long j5) {
        this.f2988G = true;
        W0.c cVar = AbstractC2749f.v(this).f21607H;
        this.f2987F = AbstractC0444a.d0(j5);
        float f = this.f2982A;
        this.f2986E = Float.isNaN(f) ? q.a(cVar, this.f2991z, this.f2987F) : cVar.y(f);
        C2316B c2316b = this.f2989H;
        Object[] objArr = c2316b.f18904a;
        int i = c2316b.f18905b;
        for (int i5 = 0; i5 < i; i5++) {
            A0((y.n) objArr[i5]);
        }
        c2316b.c();
    }

    @Override // z0.InterfaceC2764v
    public final /* synthetic */ void u(InterfaceC2637x interfaceC2637x) {
    }

    public abstract void y0(y.l lVar, long j5, float f);

    public abstract void z0(C2733I c2733i);
}
