package K1;

import K1.U;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3441v {

    /* renamed from: a, reason: collision with root package name */
    private static final long f15099a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15100b = 0;

    static {
        long j11;
        int i11 = Z1.u.f35335d;
        j11 = Z1.u.f35334c;
        f15099a = j11;
    }

    @NotNull
    public static final C3440u a(@NotNull C3440u c3440u, int i11, int i12, long j11, V1.o oVar, y yVar, V1.f fVar, int i13, int i14, V1.q qVar) {
        V1.o oVar2 = oVar;
        y yVar2 = yVar;
        V1.f fVar2 = fVar;
        int i15 = i13;
        int i16 = i14;
        if ((i11 == Integer.MIN_VALUE || i11 == c3440u.g()) && ((Hj0.T.e(j11) || Z1.u.c(j11, c3440u.d())) && ((oVar2 == null || oVar.equals(c3440u.i())) && ((i12 == Integer.MIN_VALUE || i12 == c3440u.h()) && ((yVar2 == null || yVar2.equals(c3440u.f())) && ((fVar2 == null || fVar2.equals(c3440u.e())) && ((i15 == 0 || i15 == c3440u.c()) && ((i16 == Integer.MIN_VALUE || i16 == c3440u.b()) && (qVar == null || qVar.equals(c3440u.j())))))))))) {
            return c3440u;
        }
        long d11 = Hj0.T.e(j11) ? c3440u.d() : j11;
        if (oVar2 == null) {
            oVar2 = c3440u.i();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = c3440u.g();
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = c3440u.h();
        }
        if (c3440u.f() != null) {
            if (yVar2 == null) {
                yVar2 = c3440u.f();
            } else {
                c3440u.f().getClass();
            }
        }
        if (fVar2 == null) {
            fVar2 = c3440u.e();
        }
        if (i15 == 0) {
            i15 = c3440u.c();
        }
        if (i16 == Integer.MIN_VALUE) {
            i16 = c3440u.b();
        }
        return new C3440u(i11, i12, d11, oVar2, yVar2, fVar2, i15, i16, qVar == null ? c3440u.j() : qVar);
    }

    @NotNull
    public static final C3440u b(@NotNull C3440u c3440u, @NotNull Z1.s sVar) {
        int i11 = 5;
        int g10 = c3440u.g() == Integer.MIN_VALUE ? 5 : c3440u.g();
        int h11 = c3440u.h();
        if (h11 == 3) {
            int i12 = U.a.f15016a[sVar.ordinal()];
            if (i12 == 1) {
                i11 = 4;
            } else if (i12 != 2) {
                throw new Sc.o();
            }
        } else if (h11 == Integer.MIN_VALUE) {
            int i13 = U.a.f15016a[sVar.ordinal()];
            if (i13 == 1) {
                i11 = 1;
            } else {
                if (i13 != 2) {
                    throw new Sc.o();
                }
                i11 = 2;
            }
        } else {
            i11 = h11;
        }
        long d11 = Hj0.T.e(c3440u.d()) ? f15099a : c3440u.d();
        V1.o i14 = c3440u.i();
        if (i14 == null) {
            i14 = V1.o.f27926c;
        }
        y f7 = c3440u.f();
        V1.f e11 = c3440u.e();
        int c11 = c3440u.c() == 0 ? V1.e.f27904b : c3440u.c();
        int b11 = c3440u.b() == Integer.MIN_VALUE ? 1 : c3440u.b();
        V1.q j11 = c3440u.j();
        if (j11 == null) {
            j11 = V1.q.f27930c;
        }
        return new C3440u(g10, i11, d11, i14, f7, e11, c11, b11, j11);
    }
}
