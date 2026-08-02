package B1;

import D1.AbstractC2810k0;
import k1.C7459e;
import k1.C7460f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D1.Y f2084a;

    public S(@NotNull D1.Y y11) {
        this.f2084a = y11;
    }

    private final long c() {
        D1.Y y11 = this.f2084a;
        D1.Y a11 = T.a(y11);
        return C7459e.j(d(a11.c1(), 0L), y11.G1().o2(a11.G1(), 0L));
    }

    @Override // B1.B
    public final boolean I() {
        return this.f2084a.G1().I();
    }

    @Override // B1.B
    @NotNull
    public final C7460f K(@NotNull B b11, boolean z11) {
        return this.f2084a.G1().K(b11, z11);
    }

    @Override // B1.B
    public final long L(long j11) {
        return C7459e.k(this.f2084a.G1().L(j11), c());
    }

    @Override // B1.B
    public final void S(@NotNull float[] fArr) {
        this.f2084a.G1().S(fArr);
    }

    @Override // B1.B
    public final long W(@NotNull B b11, long j11) {
        return d(b11, j11);
    }

    @Override // B1.B
    public final long a() {
        D1.Y y11 = this.f2084a;
        return Z1.r.a(y11.u0(), y11.l0());
    }

    @NotNull
    public final AbstractC2810k0 b() {
        return this.f2084a.G1();
    }

    public final long d(@NotNull B b11, long j11) {
        boolean z11 = b11 instanceof S;
        D1.Y y11 = this.f2084a;
        if (!z11) {
            D1.Y a11 = T.a(y11);
            long d11 = d(a11.I1(), j11);
            AbstractC2810k0 G12 = a11.G1();
            G12.getClass();
            return C7459e.k(d11, G12.o2(b11, 0L));
        }
        D1.Y y12 = ((S) b11).f2084a;
        y12.G1().p2();
        D1.Y c22 = y11.G1().W1(y12.G1()).c2();
        if (c22 != null) {
            long d12 = Z1.m.d(Z1.m.e(y12.N1(c22, false), Z1.n.b(j11)), y11.N1(c22, false));
            return P9.a.a((int) (d12 >> 32), (int) (d12 & 4294967295L));
        }
        D1.Y a12 = T.a(y12);
        long e11 = Z1.m.e(Z1.m.e(y12.N1(a12, false), a12.l1()), Z1.n.b(j11));
        D1.Y a13 = T.a(y11);
        long d13 = Z1.m.d(e11, Z1.m.e(y11.N1(a13, false), a13.l1()));
        long a14 = P9.a.a((int) (d13 >> 32), (int) (d13 & 4294967295L));
        AbstractC2810k0 g22 = a13.G1().g2();
        Intrinsics.f(g22);
        AbstractC2810k0 g23 = a12.G1().g2();
        Intrinsics.f(g23);
        return g22.o2(g23, a14);
    }

    @Override // B1.B
    public final long t(long j11) {
        return C7459e.k(this.f2084a.G1().t(j11), c());
    }

    @Override // B1.B
    public final long u(long j11) {
        return this.f2084a.G1().u(C7459e.k(j11, c()));
    }

    @Override // B1.B
    public final void v(@NotNull B b11, @NotNull float[] fArr) {
        this.f2084a.G1().v(b11, fArr);
    }

    @Override // B1.B
    public final B w() {
        D1.Y c22;
        if (!I()) {
            A1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        AbstractC2810k0 g22 = this.f2084a.G1().B0().e0().g2();
        if (g22 == null || (c22 = g22.c2()) == null) {
            return null;
        }
        return c22.c1();
    }

    @Override // B1.B
    public final long y(long j11) {
        return this.f2084a.G1().y(C7459e.k(j11, c()));
    }
}
