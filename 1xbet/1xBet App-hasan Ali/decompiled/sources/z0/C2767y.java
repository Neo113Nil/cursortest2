package z0;

import i0.InterfaceC2009n;
import l0.C2041b;
import r.C2315A;
import x0.C2628n;

/* renamed from: z0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2767y extends e0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final J2.b f21870a0;

    /* renamed from: Y, reason: collision with root package name */
    public InterfaceC2765w f21871Y;

    /* renamed from: Z, reason: collision with root package name */
    public C2766x f21872Z;

    static {
        J2.b g5 = i0.F.g();
        g5.e(i0.p.f17292e);
        g5.k(1.0f);
        g5.l(1);
        f21870a0 = g5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2767y(C2731G c2731g, InterfaceC2765w interfaceC2765w) {
        super(c2731g);
        this.f21871Y = interfaceC2765w;
        this.f21872Z = c2731g.f21630q != null ? new C2766x(this) : null;
        if ((((b0.o) interfaceC2765w).f7162k.f7164m & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // z0.e0
    public final void D0() {
        if (this.f21872Z == null) {
            this.f21872Z = new C2766x(this);
        }
    }

    @Override // z0.e0
    public final AbstractC2740P G0() {
        return this.f21872Z;
    }

    @Override // z0.e0
    public final b0.o I0() {
        return ((b0.o) this.f21871Y).f7162k;
    }

    @Override // x0.N
    public final int L(int i) {
        InterfaceC2765w interfaceC2765w = this.f21871Y;
        e0 e0Var = this.f21813z;
        kotlin.jvm.internal.l.c(e0Var);
        return interfaceC2765w.h(this, e0Var, i);
    }

    @Override // x0.N
    public final int T(int i) {
        InterfaceC2765w interfaceC2765w = this.f21871Y;
        e0 e0Var = this.f21813z;
        kotlin.jvm.internal.l.c(e0Var);
        return interfaceC2765w.b(this, e0Var, i);
    }

    @Override // x0.N
    public final int U(int i) {
        InterfaceC2765w interfaceC2765w = this.f21871Y;
        e0 e0Var = this.f21813z;
        kotlin.jvm.internal.l.c(e0Var);
        return interfaceC2765w.e(this, e0Var, i);
    }

    @Override // z0.e0
    public final void X0(InterfaceC2009n interfaceC2009n, C2041b c2041b) {
        e0 e0Var;
        e0 e0Var2 = this.f21813z;
        kotlin.jvm.internal.l.c(e0Var2);
        e0Var2.B0(interfaceC2009n, c2041b);
        if (!((A0.F) AbstractC2734J.a(this.f21812y)).getShowLayoutBounds() || (e0Var = this.f21813z) == null) {
            return;
        }
        if (W0.l.a(this.f20975m, e0Var.f20975m) && W0.j.a(e0Var.J, 0L)) {
            return;
        }
        long j5 = this.f20975m;
        interfaceC2009n.t(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f21870a0);
    }

    @Override // x0.Z
    public final void Z(long j5, float f, i4.c cVar) {
        Y0(j5, f, cVar);
        if (this.f21682t) {
            return;
        }
        U0();
        q0().b();
        kotlin.jvm.internal.l.c(this.f21813z);
    }

    @Override // x0.N
    public final x0.Z e(long j5) {
        e0(j5);
        InterfaceC2765w interfaceC2765w = this.f21871Y;
        e0 e0Var = this.f21813z;
        kotlin.jvm.internal.l.c(e0Var);
        b1(interfaceC2765w.f(this, e0Var, j5));
        T0();
        return this;
    }

    @Override // x0.N
    public final int f(int i) {
        InterfaceC2765w interfaceC2765w = this.f21871Y;
        e0 e0Var = this.f21813z;
        kotlin.jvm.internal.l.c(e0Var);
        return interfaceC2765w.a(this, e0Var, i);
    }

    @Override // z0.AbstractC2739O
    public final int g0(C2628n c2628n) {
        C2766x c2766x = this.f21872Z;
        if (c2766x == null) {
            return AbstractC2749f.c(this, c2628n);
        }
        C2315A c2315a = c2766x.f21690D;
        int d5 = c2315a.d(c2628n);
        if (d5 >= 0) {
            return c2315a.f18901c[d5];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(InterfaceC2765w interfaceC2765w) {
        if (!interfaceC2765w.equals(this.f21871Y) && (((b0.o) interfaceC2765w).f7162k.f7164m & 512) != 0) {
            throw new ClassCastException();
        }
        this.f21871Y = interfaceC2765w;
    }
}
