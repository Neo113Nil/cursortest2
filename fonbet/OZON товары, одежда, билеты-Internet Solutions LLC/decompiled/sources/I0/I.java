package I0;

import B0.C2459b1;
import I0.C3220z;
import Sc.InterfaceC4008j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I {
    public static final C3220z a(InterfaceC3198n0 interfaceC3198n0, InterfaceC3191k interfaceC3191k) {
        boolean z11 = interfaceC3198n0.c() == EnumC3195m.CROSSED;
        return new C3220z(c(interfaceC3198n0.g(), z11, true, interfaceC3198n0.h(), interfaceC3191k), c(interfaceC3198n0.f(), z11, false, interfaceC3198n0.k(), interfaceC3191k), z11);
    }

    public static final C3220z.a b(InterfaceC3198n0 interfaceC3198n0, C3218y c3218y, C3220z.a aVar) {
        int f7 = interfaceC3198n0.a() ? c3218y.f() : c3218y.d();
        if ((interfaceC3198n0.a() ? interfaceC3198n0.h() : interfaceC3198n0.k()) != c3218y.h()) {
            return c3218y.a(f7);
        }
        Sc.n nVar = Sc.n.NONE;
        InterfaceC4008j a11 = Sc.k.a(nVar, new H(c3218y, f7));
        InterfaceC4008j a12 = Sc.k.a(nVar, new G(c3218y, f7, interfaceC3198n0.a() ? c3218y.d() : c3218y.f(), interfaceC3198n0, a11));
        if (c3218y.g() != aVar.d()) {
            return (C3220z.a) a12.getValue();
        }
        int e11 = c3218y.e();
        if (f7 == e11) {
            return aVar;
        }
        if (((Number) a11.getValue()).intValue() != c3218y.i().p(e11)) {
            return (C3220z.a) a12.getValue();
        }
        int c11 = aVar.c();
        long B11 = c3218y.i().B(c11);
        boolean a13 = interfaceC3198n0.a();
        if (c3218y.e() != -1) {
            if (f7 != c3218y.e()) {
                if (!(a13 ^ (c3218y.c() == EnumC3195m.CROSSED))) {
                }
            }
            return c3218y.a(f7);
        }
        int i11 = K1.Q.f15010c;
        return (c11 == ((int) (B11 >> 32)) || c11 == ((int) (B11 & 4294967295L))) ? (C3220z.a) a12.getValue() : c3218y.a(f7);
    }

    private static final C3220z.a c(C3218y c3218y, boolean z11, boolean z12, int i11, InterfaceC3191k interfaceC3191k) {
        long j11;
        int f7 = z12 ? c3218y.f() : c3218y.d();
        if (i11 != c3218y.h()) {
            return c3218y.a(f7);
        }
        long a11 = interfaceC3191k.a(c3218y, f7);
        if (z11 ^ z12) {
            int i12 = K1.Q.f15010c;
            j11 = a11 >> 32;
        } else {
            int i13 = K1.Q.f15010c;
            j11 = 4294967295L & a11;
        }
        return c3218y.a((int) j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x002b, code lost:
    
        if (r8.d().c() == r8.b().c()) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x007d  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C3220z d(@NotNull C3220z c3220z, @NotNull InterfaceC3198n0 interfaceC3198n0) {
        boolean z11;
        boolean z12 = false;
        if (c3220z != null) {
            if (c3220z.d().d() != c3220z.b().d()) {
                if ((c3220z.c() ? c3220z.d() : c3220z.b()).c() == 0) {
                    if (interfaceC3198n0.j().b().length() == (c3220z.c() ? c3220z.b() : c3220z.d()).c()) {
                        kotlin.jvm.internal.I i11 = new kotlin.jvm.internal.I();
                        i11.f71783a = true;
                        interfaceC3198n0.l(new C3204q0(i11));
                        z11 = i11.f71783a;
                        if (!z11) {
                            return c3220z;
                        }
                        String b11 = interfaceC3198n0.b().b();
                        if (interfaceC3198n0.getSize() > 1 || interfaceC3198n0.e() == null) {
                            return c3220z;
                        }
                        if (b11.length() == 0) {
                            return c3220z;
                        }
                        C3218y b12 = interfaceC3198n0.b();
                        String b13 = b12.b();
                        int f7 = b12.f();
                        int length = b13.length();
                        if (f7 == 0) {
                            int a11 = C2459b1.a(0, b13);
                            return interfaceC3198n0.a() ? C3220z.a(c3220z, C3220z.a.a(c3220z.d(), b12.i().c(a11), a11), null, true, 2) : C3220z.a(c3220z, null, C3220z.a.a(c3220z.b(), b12.i().c(a11), a11), false, 1);
                        }
                        if (f7 == length) {
                            int b14 = C2459b1.b(length, b13);
                            return interfaceC3198n0.a() ? C3220z.a(c3220z, C3220z.a.a(c3220z.d(), b12.i().c(b14), b14), null, false, 2) : C3220z.a(c3220z, null, C3220z.a.a(c3220z.b(), b12.i().c(b14), b14), true, 1);
                        }
                        C3220z e11 = interfaceC3198n0.e();
                        if (e11 != null && e11.c()) {
                            z12 = true;
                        }
                        int b15 = interfaceC3198n0.a() ^ z12 ? C2459b1.b(f7, b13) : C2459b1.a(f7, b13);
                        return interfaceC3198n0.a() ? C3220z.a(c3220z, C3220z.a.a(c3220z.d(), b12.i().c(b15), b15), null, z12, 2) : C3220z.a(c3220z, null, C3220z.a.a(c3220z.b(), b12.i().c(b15), b15), z12, 1);
                    }
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        z11 = true;
        if (!z11) {
        }
    }
}
