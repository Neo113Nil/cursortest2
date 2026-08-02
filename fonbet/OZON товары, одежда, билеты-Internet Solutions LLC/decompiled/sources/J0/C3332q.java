package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import l1.C7807Z;
import l1.C7811b0;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: J0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3332q {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, InterfaceC3308k interfaceC3308k, A0.a aVar, InterfaceC3300i interfaceC3300i, C9915y c9915y, @NotNull InterfaceC6511n interfaceC6511n, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function0 function02;
        int i13;
        androidx.compose.ui.e eVar2;
        boolean z12;
        int i14;
        boolean z13;
        InterfaceC3308k interfaceC3308k2;
        A0.a aVar2;
        InterfaceC3300i interfaceC3300i2;
        int i15;
        C9915y c9915y2;
        androidx.compose.ui.e eVar3;
        A0.a aVar3;
        A0.a aVar4;
        int i16;
        InterfaceC3300i interfaceC3300i3;
        boolean z14;
        InterfaceC3300i interfaceC3300i4;
        Object C11;
        C8006o d11;
        C3969l c3969l;
        InterfaceC3308k interfaceC3308k3;
        boolean z15;
        A0.a aVar5;
        androidx.compose.ui.e eVar4;
        C9915y c9915y3;
        InterfaceC3300i interfaceC3300i5;
        S0.J0 m02;
        InterfaceC3300i interfaceC3300i6;
        int i17;
        InterfaceC3300i interfaceC3300i7;
        int i18;
        C3969l u11 = interfaceC3967k.u(-2116133464);
        if ((i11 & 6) == 0) {
            function02 = function0;
            i13 = (u11.F(function02) ? 4 : 2) | i11;
        } else {
            function02 = function0;
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 != 0) {
            i13 |= 48;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            if ((i11 & 48) == 0) {
                z12 = true;
                i13 |= u11.n(eVar2) ? 32 : 16;
                i14 = i12 & 4;
                if (i14 == 0) {
                    i13 |= 384;
                    z13 = z11;
                } else if ((i11 & 384) == 0) {
                    z13 = z11;
                    i13 |= u11.p(z13) ? 256 : 128;
                } else {
                    z13 = z11;
                }
                if ((i12 & 8) == 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i13 |= u11.n(null) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16) == 0) {
                        interfaceC3308k2 = interfaceC3308k;
                        if (u11.n(interfaceC3308k2)) {
                            i18 = 16384;
                            i13 |= i18;
                        }
                    } else {
                        interfaceC3308k2 = interfaceC3308k;
                    }
                    i18 = 8192;
                    i13 |= i18;
                } else {
                    interfaceC3308k2 = interfaceC3308k;
                }
                if ((i11 & 196608) != 0) {
                    aVar2 = aVar;
                    i13 |= ((i12 & 32) == 0 && u11.n(aVar2)) ? 131072 : 65536;
                } else {
                    aVar2 = aVar;
                }
                if ((i12 & 64) == 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i13 |= u11.n(null) ? 1048576 : 524288;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        InterfaceC3300i interfaceC3300i8 = interfaceC3300i;
                        boolean n11 = u11.n(interfaceC3300i8);
                        interfaceC3300i6 = interfaceC3300i8;
                        if (n11) {
                            i17 = 8388608;
                            interfaceC3300i7 = interfaceC3300i8;
                            i13 |= i17;
                            interfaceC3300i2 = interfaceC3300i7;
                        }
                    } else {
                        interfaceC3300i6 = interfaceC3300i;
                    }
                    i17 = 4194304;
                    interfaceC3300i7 = interfaceC3300i6;
                    i13 |= i17;
                    interfaceC3300i2 = interfaceC3300i7;
                } else {
                    interfaceC3300i2 = interfaceC3300i;
                }
                i15 = 256 & i12;
                if (i15 == 0) {
                    i13 |= 100663296;
                    c9915y2 = c9915y;
                } else {
                    c9915y2 = c9915y;
                    if ((i11 & 100663296) == 0) {
                        i13 |= u11.n(c9915y2) ? 67108864 : 33554432;
                    }
                }
                if ((i11 & 805306368) == 0) {
                    i13 |= u11.F(interfaceC6511n) ? 536870912 : 268435456;
                }
                if ((i13 & 306783379) == 306783378 || !u11.b()) {
                    u11.Q0();
                    if ((i11 & 1) != 0 || u11.w0()) {
                        if (i19 != 0) {
                            eVar2 = androidx.compose.ui.e.f40358c0;
                        }
                        if (i14 != 0) {
                            z13 = z12;
                        }
                        if ((i12 & 16) == 0) {
                            int i21 = C3304j.f13245e;
                            float f7 = 2;
                            float f11 = 8;
                            float f12 = 0;
                            float f13 = 4;
                            boolean q11 = u11.q(f7) | u11.q(f11) | u11.q(f12) | u11.q(f13) | u11.q(f13);
                            eVar3 = eVar2;
                            Object C12 = u11.C();
                            if (q11 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new C(f7, f11, f12, f13, f13);
                                u11.x(C12);
                            }
                            i13 &= -57345;
                            interfaceC3308k2 = (C) C12;
                        } else {
                            eVar3 = eVar2;
                        }
                        if ((i12 & 32) == 0) {
                            aVar3 = ((C3286e2) u11.m(C3291f2.a())).c();
                            i13 &= -458753;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((128 & i12) == 0) {
                            int i22 = C3304j.f13245e;
                            long h11 = ((C3339s) u11.m(C3343t.d())).h();
                            aVar4 = aVar3;
                            i16 = i15;
                            interfaceC3300i3 = new C3367z(h11, C3343t.b(h11, u11), C7811b0.f(C7807Z.o(0.12f, ((C3339s) u11.m(C3343t.d())).g()), ((C3339s) u11.m(C3343t.d())).l()), C7807Z.o(Bl0.k0.p(u11, 6), ((C3339s) u11.m(C3343t.d())).g()));
                            i13 &= -29360129;
                        } else {
                            aVar4 = aVar3;
                            i16 = i15;
                            interfaceC3300i3 = interfaceC3300i2;
                        }
                        if (i16 == 0) {
                            aVar2 = aVar4;
                            c9915y2 = C3304j.a();
                            z14 = z13;
                            interfaceC3300i4 = interfaceC3300i3;
                            eVar2 = eVar3;
                        } else {
                            eVar2 = eVar3;
                            aVar2 = aVar4;
                            c9915y2 = c9915y;
                            z14 = z13;
                            interfaceC3300i4 = interfaceC3300i3;
                        }
                    } else {
                        u11.j();
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((128 & i12) != 0) {
                            i13 &= -29360129;
                        }
                        z14 = z13;
                        interfaceC3300i4 = interfaceC3300i2;
                    }
                    u11.j0();
                    u11.o(1050577827);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = t0.p.a();
                        u11.x(C11);
                    }
                    t0.q qVar = (t0.q) C11;
                    u11.k();
                    int i23 = i13 >> 6;
                    InterfaceC3978p0 b11 = interfaceC3300i4.b(z14, u11);
                    A0.a aVar6 = aVar2;
                    androidx.compose.ui.e c11 = I1.o.c(eVar2, false, C3312l.f13273b);
                    long w11 = ((C7807Z) interfaceC3300i4.a(z14, u11).getValue()).w();
                    long o11 = C7807Z.o(1.0f, ((C7807Z) b11.getValue()).w());
                    if (interfaceC3308k2 != null) {
                        u11.o(1050984484);
                        u11.k();
                        d11 = null;
                    } else {
                        u11.o(-243191939);
                        d11 = ((C) interfaceC3308k2).d(z14, qVar, u11, i23 & 910);
                        u11.k();
                    }
                    c3969l = u11;
                    R2.b(function02, c11, z14, aVar6, w11, o11, d11 == null ? ((Z1.h) d11.getValue()).d() : 0, qVar, a1.c.c(7524271, new C3324o(b11, c9915y2, interfaceC6511n), u11), c3969l, (i23 & 7168) | (i13 & 14) | 805306368 | (i13 & 896) | (3670016 & i13), 0);
                    interfaceC3308k3 = interfaceC3308k2;
                    z15 = z14;
                    aVar5 = aVar6;
                    eVar4 = eVar2;
                    c9915y3 = c9915y2;
                    interfaceC3300i5 = interfaceC3300i4;
                } else {
                    u11.j();
                    interfaceC3308k3 = interfaceC3308k2;
                    c3969l = u11;
                    aVar5 = aVar2;
                    z15 = z13;
                    eVar4 = eVar2;
                    interfaceC3300i5 = interfaceC3300i2;
                    c9915y3 = c9915y2;
                }
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new C3328p(function0, eVar4, z15, interfaceC3308k3, aVar5, interfaceC3300i5, c9915y3, interfaceC6511n, i11, i12));
                    return;
                }
                return;
            }
        }
        z12 = true;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        if ((i11 & 24576) != 0) {
        }
        if ((i11 & 196608) != 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i11 & 12582912) != 0) {
        }
        i15 = 256 & i12;
        if (i15 == 0) {
        }
        if ((i11 & 805306368) == 0) {
        }
        if ((i13 & 306783379) == 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if ((i12 & 32) == 0) {
        }
        if ((128 & i12) == 0) {
        }
        if (i16 == 0) {
        }
        u11.j0();
        u11.o(1050577827);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        t0.q qVar2 = (t0.q) C11;
        u11.k();
        int i232 = i13 >> 6;
        InterfaceC3978p0 b112 = interfaceC3300i4.b(z14, u11);
        A0.a aVar62 = aVar2;
        androidx.compose.ui.e c112 = I1.o.c(eVar2, false, C3312l.f13273b);
        long w112 = ((C7807Z) interfaceC3300i4.a(z14, u11).getValue()).w();
        long o112 = C7807Z.o(1.0f, ((C7807Z) b112.getValue()).w());
        if (interfaceC3308k2 != null) {
        }
        c3969l = u11;
        R2.b(function02, c112, z14, aVar62, w112, o112, d11 == null ? ((Z1.h) d11.getValue()).d() : 0, qVar2, a1.c.c(7524271, new C3324o(b112, c9915y2, interfaceC6511n), u11), c3969l, (i232 & 7168) | (i13 & 14) | 805306368 | (i13 & 896) | (3670016 & i13), 0);
        interfaceC3308k3 = interfaceC3308k2;
        z15 = z14;
        aVar5 = aVar62;
        eVar4 = eVar2;
        c9915y3 = c9915y2;
        interfaceC3300i5 = interfaceC3300i4;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    public static final void b(@NotNull Function0 function0, androidx.compose.ui.e eVar, InterfaceC3300i interfaceC3300i, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 2) != 0) {
            eVar = androidx.compose.ui.e.f40358c0;
        }
        androidx.compose.ui.e eVar2 = eVar;
        A0.a c11 = ((C3286e2) interfaceC3967k.m(C3291f2.a())).c();
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            interfaceC3300i = C3304j.e(0L, interfaceC3967k, 7);
        }
        a(function0, eVar2, true, null, c11, interfaceC3300i, C3304j.d(), c4912a, interfaceC3967k, i11 & 2147483646, 0);
    }
}
