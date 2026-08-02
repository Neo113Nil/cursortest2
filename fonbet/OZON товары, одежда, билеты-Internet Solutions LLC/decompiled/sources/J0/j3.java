package J0;

import B0.C2454a;
import B1.InterfaceC2552v;
import K1.C3422b;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function2;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f13251a = Z1.c.a(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final float f13252b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13253c = 12;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f13254d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13255e = 0;

    static {
        float f7 = 48;
        f13254d = androidx.compose.foundation.layout.a0.a(androidx.compose.ui.e.f40358c0, f7, f7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x020b, code lost:
    
        if (l1.C7807Z.p(r4, r7) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0229, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0227, code lost:
    
        if (l1.C7807Z.p(r4, r7) != false) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull t3 t3Var, @NotNull String str, @NotNull Function2 function2, @NotNull C2454a c2454a, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, boolean z11, boolean z12, boolean z13, @NotNull t0.o oVar, @NotNull C9915y c9915y, @NotNull A0.a aVar, @NotNull T2 t2, C4912a c4912a4, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2 function22;
        int i14;
        int i15;
        long j11;
        long j12;
        long j13;
        C3969l c3969l;
        long j14;
        C3969l u11 = interfaceC3967k.u(341783750);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(t3Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        int i16 = i11 & 384;
        int i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 == 0) {
            function22 = function2;
            i13 |= u11.F(function22) ? 256 : 128;
        } else {
            function22 = function2;
        }
        int i18 = i11 & 3072;
        int i19 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i18 == 0) {
            i13 |= u11.n(c2454a) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.F(c4912a) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 = 196608;
            i13 |= u11.F(c4912a2) ? 131072 : 65536;
        } else {
            i14 = 196608;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.F(null) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.F(c4912a3) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.p(z11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.p(z12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.p(z13) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.n(oVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.n(c9915y)) {
                i17 = 256;
            }
            i15 |= i17;
        }
        if ((i12 & 3072) == 0) {
            if (u11.n(aVar)) {
                i19 = 2048;
            }
            i15 |= i19;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.n(t2) ? 16384 : 8192;
        }
        if ((i12 & i14) == 0) {
            i15 |= u11.F(c4912a4) ? 131072 : 65536;
        }
        if ((i13 & 306783379) == 306783378 && (i15 & 74899) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            boolean z14 = ((i13 & 112) == 32) | ((i13 & 7168) == 2048);
            Object C11 = u11.C();
            if (z14 || C11 == InterfaceC3967k.a.a()) {
                C11 = c2454a.filter(new C3422b(6, str, null));
                u11.x(C11);
            }
            String h11 = ((Q1.W) C11).b().h();
            U0 u02 = ((Boolean) t0.i.a(oVar, u11, (i15 >> 3) & 14).getValue()).booleanValue() ? U0.Focused : h11.length() == 0 ? U0.UnfocusedEmpty : U0.UnfocusedNotEmpty;
            C3287e3 c3287e3 = new C3287e3(t2, z12, z13, oVar);
            D3 d32 = (D3) u11.m(E3.c());
            K1.T f7 = d32.f();
            K1.T d11 = d32.d();
            long f11 = f7.f();
            j11 = C7807Z.f72259m;
            if (C7807Z.p(f11, j11)) {
                long f12 = d11.f();
                j14 = C7807Z.f72259m;
            }
            long f13 = f7.f();
            j12 = C7807Z.f72259m;
            if (!C7807Z.p(f13, j12)) {
                long f14 = d11.f();
                j13 = C7807Z.f72259m;
            }
            boolean z15 = false;
            s3 s3Var = s3.f13398a;
            u11.o(1578865765);
            long f15 = ((D3) u11.m(E3.c())).d().f();
            if (z15) {
                u11.o(-1572851052);
                if (f15 == 16) {
                    f15 = ((C7807Z) c3287e3.invoke(u02, u11, 0)).w();
                }
            } else {
                u11.o(780548205);
            }
            u11.k();
            long j15 = f15;
            u11.k();
            u11.o(1578871879);
            long f16 = ((D3) u11.m(E3.c())).f().f();
            if (z15) {
                u11.o(-1572659596);
                if (f16 == 16) {
                    f16 = ((C7807Z) c3287e3.invoke(u02, u11, 0)).w();
                }
            } else {
                u11.o(780554381);
            }
            u11.k();
            long j16 = f16;
            u11.k();
            c3969l = u11;
            s3Var.a(u02, j15, j16, c3287e3, c4912a != null, a1.c.c(225557475, new Y2(c4912a, c4912a2, h11, t2, z12, z13, oVar, c4912a3, aVar, t3Var, function22, z11, c9915y, z15, c4912a4), u11), c3969l, 1769472);
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3282d3(t3Var, str, function2, c2454a, c4912a, c4912a2, c4912a3, z11, z12, z13, oVar, c9915y, aVar, t2, c4912a4, i11, i12));
        }
    }

    public static final void b(long j11, K1.T t2, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-399493340);
        int i14 = (u11.s(j11) ? 4 : 2) | i11;
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
        } else {
            i13 = i14 | (u11.n(t2) ? 32 : 16);
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(null) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i13 | (u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i16 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            if (i15 != 0) {
                t2 = null;
            }
            C4912a c11 = a1.c.c(494684590, new h3(j11, c4912a, null), u11);
            if (t2 != null) {
                u11.o(2115969060);
                u3.a(t2, c11, u11, ((i16 >> 3) & 14) | 48);
            } else {
                u11.o(2115970696);
                c11.invoke(u11, 6);
            }
            u11.k();
        }
        K1.T t11 = t2;
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f3(j11, t11, c4912a, i11, i12));
        }
    }

    public static final float c() {
        return f13253c;
    }

    @NotNull
    public static final androidx.compose.ui.e d() {
        return f13254d;
    }

    public static final Object e(@NotNull InterfaceC2552v interfaceC2552v) {
        Object m11 = interfaceC2552v.m();
        B1.E e11 = m11 instanceof B1.E ? (B1.E) m11 : null;
        if (e11 != null) {
            return e11.e1();
        }
        return null;
    }

    public static final float f() {
        return f13252b;
    }

    public static final long g() {
        return f13251a;
    }

    public static final int h(B1.m0 m0Var) {
        if (m0Var != null) {
            return m0Var.l0();
        }
        return 0;
    }

    public static final int i(B1.m0 m0Var) {
        if (m0Var != null) {
            return m0Var.u0();
        }
        return 0;
    }
}
