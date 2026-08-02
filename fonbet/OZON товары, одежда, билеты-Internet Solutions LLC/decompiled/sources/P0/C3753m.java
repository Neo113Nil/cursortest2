package P0;

import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: P0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3753m {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, l1.J0 j02, C3720b c3720b, C3732f c3732f, C9915y c9915y, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function0 function02;
        int i13;
        boolean z12;
        l1.J0 j03;
        C3720b c3720b2;
        C3732f c3732f2;
        boolean z13;
        int i14;
        C9915y c9915y2;
        C3732f c3732f3;
        C3720b c3720b3;
        C3732f c3732f4;
        Object C11;
        C8006o c8006o;
        C3732f c3732f5;
        float f7;
        C3969l c3969l;
        C3720b c3720b4;
        C9915y c9915y3;
        C3732f c3732f6;
        S0.J0 m02;
        int i15;
        int i16;
        int i17;
        C3969l u11 = interfaceC3967k.u(650121315);
        if ((i11 & 6) == 0) {
            function02 = function0;
            i13 = (u11.F(function02) ? 4 : 2) | i11;
        } else {
            function02 = function0;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i18 = 4 & i12;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            z12 = z11;
            i13 |= u11.p(z12) ? 256 : 128;
            if ((i11 & 3072) != 0) {
                if ((i12 & 8) == 0) {
                    j03 = j02;
                    if (u11.n(j03)) {
                        i17 = 2048;
                        i13 |= i17;
                    }
                } else {
                    j03 = j02;
                }
                i17 = UserVerificationMethods.USER_VERIFY_ALL;
                i13 |= i17;
            } else {
                j03 = j02;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16) == 0) {
                    c3720b2 = c3720b;
                    if (u11.n(c3720b2)) {
                        i16 = 16384;
                        i13 |= i16;
                    }
                } else {
                    c3720b2 = c3720b;
                }
                i16 = 8192;
                i13 |= i16;
            } else {
                c3720b2 = c3720b;
            }
            if ((i11 & 196608) != 0) {
                c3732f2 = c3732f;
                if ((i12 & 32) == 0) {
                    z13 = true;
                    if (u11.n(c3732f2)) {
                        i15 = 131072;
                        i13 |= i15;
                    }
                } else {
                    z13 = true;
                }
                i15 = 65536;
                i13 |= i15;
            } else {
                c3732f2 = c3732f;
                z13 = true;
            }
            if ((i12 & 64) == 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i13 |= u11.n(null) ? 1048576 : 524288;
            }
            i14 = 128 & i12;
            if (i14 == 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                c9915y2 = c9915y;
                i13 |= u11.n(c9915y2) ? 8388608 : 4194304;
                if ((256 & i12) != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i13 |= u11.n(null) ? 67108864 : 33554432;
                }
                if ((805306368 & i11) == 0) {
                    i13 |= u11.F(c4912a) ? 536870912 : 268435456;
                }
                if ((306783379 & i13) == 306783378 || !u11.b()) {
                    u11.Q0();
                    if ((i11 & 1) != 0 || u11.w0()) {
                        if (i18 != 0) {
                            z12 = z13;
                        }
                        if ((i12 & 8) != 0) {
                            int i19 = C3723c.f20990e;
                            i13 &= -7169;
                            j03 = C3764p1.b(R0.e.c(), u11);
                        }
                        if ((i12 & 16) != 0) {
                            int i21 = C3723c.f20990e;
                            i13 &= -57345;
                            c3720b2 = C3723c.c((C3756n) u11.m(C3759o.d()));
                        }
                        if ((i12 & 32) != 0) {
                            int i22 = C3723c.f20990e;
                            c3732f3 = new C3732f(R0.e.b(), R0.e.j(), R0.e.g(), R0.e.h(), R0.e.e());
                            i13 &= -458753;
                        } else {
                            c3732f3 = c3732f2;
                        }
                        if (i14 != 0) {
                            c9915y2 = C3723c.b();
                        }
                        c3720b3 = c3720b2;
                        c3732f4 = c3732f3;
                    } else {
                        u11.j();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        c3732f4 = c3732f2;
                        c3720b3 = c3720b2;
                    }
                    u11.j0();
                    u11.o(-239156623);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = t0.p.a();
                        u11.x(C11);
                    }
                    t0.q qVar = (t0.q) C11;
                    u11.k();
                    long a11 = c3720b3.a(z12);
                    long b11 = c3720b3.b(z12);
                    C3720b c3720b5 = c3720b3;
                    u11.o(-239150048);
                    C8006o d11 = c3732f4 == null ? null : c3732f4.d(z12, qVar, u11, ((i13 >> 6) & 14) | ((i13 >> 9) & 896));
                    u11.k();
                    c8006o = d11;
                    if (c8006o != null) {
                        float d12 = ((Z1.h) c8006o.getValue()).d();
                        c3732f5 = c3732f4;
                        f7 = d12;
                    } else {
                        c3732f5 = c3732f4;
                        f7 = 0;
                    }
                    c3969l = u11;
                    e2.b(function02, I1.o.c(eVar, false, C3735g.f21041b), z12, j03, a11, b11, f7, qVar, a1.c.c(956488494, new C3741i(b11, c9915y2, c4912a), u11), c3969l, (i13 & 8078) | (234881024 & (i13 << 6)));
                    c3720b4 = c3720b5;
                    c9915y3 = c9915y2;
                    c3732f6 = c3732f5;
                } else {
                    u11.j();
                    c3969l = u11;
                    c3720b4 = c3720b2;
                    c9915y3 = c9915y2;
                    c3732f6 = c3732f2;
                }
                boolean z14 = z12;
                l1.J0 j04 = j03;
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new C3744j(function0, eVar, z14, j04, c3720b4, c3732f6, c9915y3, c4912a, i11, i12));
                    return;
                }
                return;
            }
            c9915y2 = c9915y;
            if ((256 & i12) != 0) {
            }
            if ((805306368 & i11) == 0) {
            }
            if ((306783379 & i13) == 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i18 != 0) {
            }
            if ((i12 & 8) != 0) {
            }
            if ((i12 & 16) != 0) {
            }
            if ((i12 & 32) != 0) {
            }
            if (i14 != 0) {
            }
            c3720b3 = c3720b2;
            c3732f4 = c3732f3;
            u11.j0();
            u11.o(-239156623);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            t0.q qVar2 = (t0.q) C11;
            u11.k();
            long a112 = c3720b3.a(z12);
            long b112 = c3720b3.b(z12);
            C3720b c3720b52 = c3720b3;
            u11.o(-239150048);
            if (c3732f4 == null) {
            }
            u11.k();
            c8006o = d11;
            if (c8006o != null) {
            }
            c3969l = u11;
            e2.b(function02, I1.o.c(eVar, false, C3735g.f21041b), z12, j03, a112, b112, f7, qVar2, a1.c.c(956488494, new C3741i(b112, c9915y2, c4912a), u11), c3969l, (i13 & 8078) | (234881024 & (i13 << 6)));
            c3720b4 = c3720b52;
            c9915y3 = c9915y2;
            c3732f6 = c3732f5;
            boolean z142 = z12;
            l1.J0 j042 = j03;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        z12 = z11;
        if ((i11 & 3072) != 0) {
        }
        if ((i11 & 24576) != 0) {
        }
        if ((i11 & 196608) != 0) {
        }
        if ((i12 & 64) == 0) {
        }
        i14 = 128 & i12;
        if (i14 == 0) {
        }
        c9915y2 = c9915y;
        if ((256 & i12) != 0) {
        }
        if ((805306368 & i11) == 0) {
        }
        if ((306783379 & i13) == 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i18 != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if ((i12 & 16) != 0) {
        }
        if ((i12 & 32) != 0) {
        }
        if (i14 != 0) {
        }
        c3720b3 = c3720b2;
        c3732f4 = c3732f3;
        u11.j0();
        u11.o(-239156623);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        t0.q qVar22 = (t0.q) C11;
        u11.k();
        long a1122 = c3720b3.a(z12);
        long b1122 = c3720b3.b(z12);
        C3720b c3720b522 = c3720b3;
        u11.o(-239150048);
        if (c3732f4 == null) {
        }
        u11.k();
        c8006o = d11;
        if (c8006o != null) {
        }
        c3969l = u11;
        e2.b(function02, I1.o.c(eVar, false, C3735g.f21041b), z12, j03, a1122, b1122, f7, qVar22, a1.c.c(956488494, new C3741i(b1122, c9915y2, c4912a), u11), c3969l, (i13 & 8078) | (234881024 & (i13 << 6)));
        c3720b4 = c3720b522;
        c9915y3 = c9915y2;
        c3732f6 = c3732f5;
        boolean z1422 = z12;
        l1.J0 j0422 = j03;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    public static final void b(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, l1.J0 j02, C3720b c3720b, C3732f c3732f, C9915y c9915y, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3732f c3732f2;
        boolean z12;
        int i13;
        C9915y b11;
        C3969l c3969l;
        boolean z13;
        C3732f c3732f3;
        C9915y c9915y2;
        C3969l u11 = interfaceC3967k.u(-1717924381);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if ((i11 & 3072) == 0) {
            i14 |= u11.n(j02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.n(c3720b) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= 65536;
        }
        int i15 = i14 | 114819072;
        if ((805306368 & i11) == 0) {
            i15 |= u11.F(c4912a) ? 536870912 : 268435456;
        }
        if ((306783379 & i15) == 306783378 && u11.b()) {
            u11.j();
            z13 = z11;
            c3732f3 = c3732f;
            c9915y2 = c9915y;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                int i16 = C3723c.f20990e;
                c3732f2 = new C3732f(R0.f.b(), R0.f.h(), R0.f.e(), R0.f.f(), 0);
                z12 = true;
                i13 = i15 & (-458753);
                b11 = C3723c.b();
            } else {
                u11.j();
                i13 = i15 & (-458753);
                z12 = z11;
                c3732f2 = c3732f;
                b11 = c9915y;
            }
            u11.j0();
            c3969l = u11;
            a(function0, eVar, z12, j02, c3720b, c3732f2, b11, c4912a, c3969l, i13 & 2147483646, 0);
            z13 = z12;
            c3732f3 = c3732f2;
            c9915y2 = b11;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3747k(function0, eVar, z13, j02, c3720b, c3732f3, c9915y2, c4912a, i11));
        }
    }

    public static final void c(@NotNull Function0 function0, e.a aVar, boolean z11, l1.J0 j02, C3720b c3720b, C9915y c9915y, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        e.a aVar2;
        C9915y f7;
        l1.J0 j03;
        boolean z12;
        int i12;
        C9915y c9915y2;
        C3969l u11 = interfaceC3967k.u(-2106428362);
        int i13 = i11 | (u11.F(function0) ? 4 : 2) | 1456 | (u11.n(c3720b) ? 16384 : 8192) | 115015680;
        if ((306783379 & i13) == 306783378 && u11.b()) {
            u11.j();
            aVar2 = aVar;
            z12 = z11;
            j03 = j02;
            c9915y2 = c9915y;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                aVar2 = androidx.compose.ui.e.f40358c0;
                int i14 = C3723c.f20990e;
                l1.J0 b11 = C3764p1.b(R0.q.a(), u11);
                f7 = C3723c.f();
                j03 = b11;
                z12 = true;
                i12 = i13 & (-7169);
            } else {
                u11.j();
                i12 = i13 & (-7169);
                aVar2 = aVar;
                z12 = z11;
                j03 = j02;
                f7 = c9915y;
            }
            u11.j0();
            a(function0, aVar2, z12, j03, c3720b, null, f7, c4912a, u11, i12 & 2147483646, 0);
            c9915y2 = f7;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3750l(function0, aVar2, z12, j03, c3720b, c9915y2, c4912a, i11));
        }
    }
}
