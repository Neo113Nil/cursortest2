package x0;

import z0.InterfaceC2743a0;

/* loaded from: classes.dex */
public abstract class Y implements W0.c {

    /* renamed from: k, reason: collision with root package name */
    public boolean f20972k;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Y y5, Z z3) {
        y5.getClass();
        if (z3 instanceof InterfaceC2743a0) {
            ((InterfaceC2743a0) z3).m(y5.f20972k);
        }
    }

    public static void g(Y y5, Z z3, int i, int i5) {
        y5.getClass();
        a(y5, z3);
        z3.Z(W0.j.c((i5 & 4294967295L) | (i << 32), z3.f20977o), 0.0f, null);
    }

    public static void h(Y y5, Z z3, long j5) {
        y5.getClass();
        a(y5, z3);
        z3.Z(W0.j.c(j5, z3.f20977o), 0.0f, null);
    }

    public static void j(Y y5, Z z3, int i, int i5) {
        long j5 = (i << 32) | (i5 & 4294967295L);
        if (y5.e() == W0.m.f6016k || y5.f() == 0) {
            a(y5, z3);
            z3.Z(W0.j.c(j5, z3.f20977o), 0.0f, null);
        } else {
            int f = (y5.f() - z3.f20973k) - ((int) (j5 >> 32));
            a(y5, z3);
            z3.Z(W0.j.c((f << 32) | (((int) (j5 & 4294967295L)) & 4294967295L), z3.f20977o), 0.0f, null);
        }
    }

    public static void k(Y y5, Z z3, int i, int i5) {
        int i6 = b0.f20984b;
        a0 a0Var = a0.f20979m;
        long j5 = (i << 32) | (i5 & 4294967295L);
        if (y5.e() == W0.m.f6016k || y5.f() == 0) {
            a(y5, z3);
            z3.Z(W0.j.c(j5, z3.f20977o), 0.0f, a0Var);
        } else {
            int f = (y5.f() - z3.f20973k) - ((int) (j5 >> 32));
            a(y5, z3);
            z3.Z(W0.j.c((f << 32) | (((int) (j5 & 4294967295L)) & 4294967295L), z3.f20977o), 0.0f, a0Var);
        }
    }

    public static void l(Y y5, Z z3, i4.c cVar) {
        y5.getClass();
        long j5 = 0;
        a(y5, z3);
        z3.Z(W0.j.c((j5 & 4294967295L) | (j5 << 32), z3.f20977o), 0.0f, cVar);
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    public float b(C2630p c2630p) {
        return Float.NaN;
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    public abstract W0.m e();

    public abstract int f();

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
