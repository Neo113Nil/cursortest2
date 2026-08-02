package E0;

import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C2805i;
import D1.C2809k;
import D1.InterfaceC2803h;
import D1.InterfaceC2819t;
import D1.InterfaceC2821v;
import F0.AbstractC2985f;
import F0.C2980a;
import F0.C2986g;
import F0.C2990k;
import I0.j1;
import I0.k1;
import k1.C7460f;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l1.AbstractC7799Q;
import l1.C7786D;
import l1.C7807Z;
import n0.C8371L;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import xe.C10727i;

/* loaded from: classes8.dex */
public final class D0 extends AbstractC2813m implements D1.E, InterfaceC2819t, InterfaceC2803h, InterfaceC2821v, D1.E0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f6957c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6958d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Z0 f6959e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private c1 f6960f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private C2990k f6961g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private l1.K0 f6962h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6963i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private n0.d0 f6964j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private EnumC9142v f6965k;

    /* renamed from: m, reason: collision with root package name */
    private xe.B0 f6967m;

    /* renamed from: n, reason: collision with root package name */
    private K1.Q f6968n;

    /* renamed from: p, reason: collision with root package name */
    private int f6970p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final AbstractC2985f f6971q;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final G f6966l = new G();

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private C7460f f6969o = new C7460f(-1.0f, -1.0f, -1.0f, -1.0f);

    public D0(boolean z11, boolean z12, @NotNull Z0 z02, @NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull l1.K0 k02, boolean z13, @NotNull n0.d0 d0Var, @NotNull EnumC9142v enumC9142v) {
        this.f6957c = z11;
        this.f6958d = z12;
        this.f6959e = z02;
        this.f6960f = c1Var;
        this.f6961g = c2990k;
        this.f6962h = k02;
        this.f6963i = z13;
        this.f6964j = d0Var;
        this.f6965k = enumC9142v;
        AbstractC2985f c2986g = C8371L.b() ? new C2986g(this.f6960f, this.f6961g, this.f6959e, this.f6957c || this.f6958d) : new C2980a();
        I1(c2986g);
        this.f6971q = c2986g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void R1(D0 d02, Z1.d dVar, int i11, int i12, long j11, Z1.s sVar) {
        long j12;
        int i13;
        K1.K f7;
        float f11;
        d02.f6964j.o(i12 - i11);
        K1.Q q11 = d02.f6968n;
        if (q11 != null) {
            int i14 = K1.Q.f15010c;
            if (((int) (j11 & 4294967295L)) == ((int) (q11.k() & 4294967295L))) {
                K1.Q q12 = d02.f6968n;
                if (q12 != null && (i13 = (int) (j11 >> 32)) == ((int) (q12.k() >> 32))) {
                    if (i12 == d02.f6970p) {
                        i13 = -1;
                    }
                    if (i13 < 0) {
                        return;
                    } else {
                        return;
                    }
                }
                j12 = j11 >> 32;
                i13 = (int) j12;
                if (i13 < 0 || !d02.S1() || (f7 = d02.f6959e.f()) == null) {
                    return;
                }
                C7460f e11 = f7.e(kotlin.ranges.h.f(i13, new IntRange(0, f7.k().j().length(), 1)));
                C7460f a11 = C2958y0.a(dVar, e11, sVar == Z1.s.Rtl, i12);
                if (a11.n() == d02.f6969o.n() && a11.q() == d02.f6969o.q() && i12 == d02.f6970p) {
                    return;
                }
                boolean z11 = d02.f6965k == EnumC9142v.Vertical;
                float q13 = z11 ? a11.q() : a11.n();
                float h11 = z11 ? a11.h() : a11.o();
                int m11 = d02.f6964j.m();
                float f12 = m11 + i11;
                if (h11 <= f12) {
                    float f13 = m11;
                    if (q13 >= f13 || h11 - q13 <= i11) {
                        f11 = (q13 >= f13 || h11 - q13 > ((float) i11)) ? 0.0f : q13 - f13;
                        d02.f6968n = K1.Q.b(j11);
                        d02.f6969o = a11;
                        d02.f6970p = i12;
                        C10727i.c(d02.getCoroutineScope(), null, xe.O.UNDISPATCHED, new C0(d02, f11, e11, null), 1);
                        return;
                    }
                }
                f11 = h11 - f12;
                d02.f6968n = K1.Q.b(j11);
                d02.f6969o = a11;
                d02.f6970p = i12;
                C10727i.c(d02.getCoroutineScope(), null, xe.O.UNDISPATCHED, new C0(d02, f11, e11, null), 1);
                return;
            }
        }
        int i15 = K1.Q.f15010c;
        j12 = j11 & 4294967295L;
        i13 = (int) j12;
        if (i13 < 0) {
        }
    }

    private final boolean S1() {
        if (!this.f6963i) {
            return false;
        }
        if (!this.f6957c && !this.f6958d) {
            return false;
        }
        l1.K0 k02 = this.f6962h;
        int i11 = C2958y0.f7332b;
        return k02 == null || k02.a() != 16;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        B1.W z03;
        if (this.f6965k == EnumC9142v.Vertical) {
            B1.m0 a02 = u11.a0(Z1.b.c(0, 0, 0, Integer.MAX_VALUE, 7, j11));
            int min = Math.min(a02.l0(), Z1.b.j(j11));
            z03 = y11.z0(a02.u0(), min, kotlin.collections.U.c(), new A0(this, y11, min, a02));
            return z03;
        }
        B1.m0 a03 = u11.a0(Z1.b.c(0, Integer.MAX_VALUE, 0, 0, 13, j11));
        int min2 = Math.min(a03.u0(), Z1.b.k(j11));
        z02 = y11.z0(min2, a03.l0(), kotlin.collections.U.c(), new C2960z0(this, y11, min2, a03));
        return z02;
    }

    public final void T1(boolean z11, boolean z12, @NotNull Z0 z02, @NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull l1.K0 k02, boolean z13, @NotNull n0.d0 d0Var, @NotNull EnumC9142v enumC9142v) {
        boolean S12 = S1();
        boolean z14 = this.f6957c;
        c1 c1Var2 = this.f6960f;
        Z0 z03 = this.f6959e;
        C2990k c2990k2 = this.f6961g;
        n0.d0 d0Var2 = this.f6964j;
        this.f6957c = z11;
        this.f6958d = z12;
        this.f6959e = z02;
        this.f6960f = c1Var;
        this.f6961g = c2990k;
        this.f6962h = k02;
        this.f6963i = z13;
        this.f6964j = d0Var;
        this.f6965k = enumC9142v;
        this.f6971q.N1(c1Var, c2990k, z02, z11 || z12);
        if (!S1()) {
            xe.B0 b02 = this.f6967m;
            if (b02 != null) {
                ((xe.H0) b02).j(null);
            }
            this.f6967m = null;
            this.f6966l.c();
        } else if (!z14 || !Intrinsics.d(c1Var2, c1Var) || !S12) {
            this.f6967m = C10727i.c(getCoroutineScope(), null, null, new B0(this, null), 3);
        }
        if (Intrinsics.d(c1Var2, c1Var) && Intrinsics.d(z03, z02) && Intrinsics.d(c2990k2, c2990k) && Intrinsics.d(d0Var2, d0Var)) {
            return;
        }
        C2809k.f(this).u0();
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        this.f6971q.applySemantics(d11);
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        long d11;
        int h11;
        int g10;
        ((D1.J) interfaceC8410c).F0();
        D0.a j11 = this.f6960f.j();
        K1.K f7 = this.f6959e.f();
        if (f7 == null) {
            return;
        }
        Pair<D0.f, K1.Q> c11 = j11.c();
        if (c11 != null) {
            int b11 = c11.a().b();
            long k11 = c11.b().k();
            if (!K1.Q.e(k11)) {
                C7786D y11 = f7.y(K1.Q.h(k11), K1.Q.g(k11));
                if (b11 == 1) {
                    AbstractC7799Q e11 = f7.k().i().e();
                    if (e11 != null) {
                        InterfaceC8412e.x1(interfaceC8410c, y11, e11, 0.2f, null, 56);
                    } else {
                        long f11 = f7.k().i().f();
                        if (f11 == 16) {
                            f11 = C7807Z.f72248b;
                        }
                        InterfaceC8412e.X(interfaceC8410c, y11, C7807Z.o(C7807Z.q(f11) * 0.2f, f11), null, 60);
                    }
                } else {
                    InterfaceC8412e.X(interfaceC8410c, y11, ((j1) C2805i.a(this, k1.b())).a(), null, 60);
                }
            }
        }
        if (K1.Q.e(j11.d())) {
            K1.O.a(interfaceC8410c.w0().a(), f7);
            if (j11.f()) {
                float d12 = this.f6966l.d();
                if (d12 != 0.0f && S1()) {
                    C7460f L11 = this.f6961g.L();
                    interfaceC8410c.h0(this.f6962h, L11.r(), L11.i(), L11.u(), (r17 & 64) != 0 ? 1.0f : d12);
                }
            }
        } else {
            if (j11.f() && (h11 = K1.Q.h((d11 = j11.d()))) != (g10 = K1.Q.g(d11))) {
                InterfaceC8412e.X(interfaceC8410c, f7.y(h11, g10), ((j1) C2805i.a(this, k1.b())).a(), null, 60);
            }
            K1.O.a(interfaceC8410c.w0().a(), f7);
        }
        this.f6971q.draw(interfaceC8410c);
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        if (this.f6957c && S1()) {
            this.f6967m = C10727i.c(getCoroutineScope(), null, null, new B0(this, null), 3);
        }
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f6959e.l(abstractC2810k0);
        this.f6971q.s(abstractC2810k0);
    }
}
