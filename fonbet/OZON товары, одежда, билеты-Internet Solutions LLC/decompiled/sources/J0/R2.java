package J0;

import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R2 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, l1.J0 j02, long j11, long j12, float f7, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        l1.J0 j03;
        long j13;
        long j14;
        int i14;
        float f11;
        C4912a c4912a2;
        androidx.compose.ui.e eVar3;
        float f12;
        l1.J0 j04;
        long j15;
        androidx.compose.ui.e eVar4;
        l1.J0 j05;
        long j16;
        float f13;
        int i15;
        C3969l u11 = interfaceC3967k.u(1412203386);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            j03 = j02;
            i13 |= u11.n(j03) ? 32 : 16;
            if ((i11 & 384) != 0) {
                if ((i12 & 4) == 0) {
                    j13 = j11;
                    if (u11.s(j13)) {
                        i15 = 256;
                        i13 |= i15;
                    }
                } else {
                    j13 = j11;
                }
                i15 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i13 |= i15;
            } else {
                j13 = j11;
            }
            if ((i11 & 3072) != 0) {
                j14 = j12;
                i13 |= ((i12 & 8) == 0 && u11.s(j14)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            } else {
                j14 = j12;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.n(null) ? 16384 : 8192;
            }
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                f11 = f7;
                i13 |= u11.q(f11) ? 131072 : 65536;
                if ((1572864 & i11) == 0) {
                    c4912a2 = c4912a;
                    i13 |= u11.F(c4912a2) ? 1048576 : 524288;
                } else {
                    c4912a2 = c4912a;
                }
                if ((i13 & 599187) == 599186 || !u11.b()) {
                    u11.Q0();
                    if ((i11 & 1) != 0 || u11.w0()) {
                        androidx.compose.ui.e eVar5 = i16 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                        if (i17 != 0) {
                            j03 = l1.y0.a();
                        }
                        if ((i12 & 4) != 0) {
                            j13 = ((C3339s) u11.m(C3343t.d())).l();
                        }
                        if ((i12 & 8) != 0) {
                            j14 = C3343t.b(j13, u11);
                        }
                        if (i14 != 0) {
                            eVar3 = eVar5;
                            f12 = 0;
                            j04 = j03;
                            j15 = j13;
                            u11.j0();
                            float d11 = ((Z1.h) u11.m(C3269b0.a())).d() + f12;
                            C3996z.b(new S0.H0[]{C3363y.a().c(C7807Z.m(j14)), C3269b0.a().c(Z1.h.a(d11))}, a1.c.c(-1822160838, new N2(eVar3, j04, j15, d11, f12, c4912a2), u11), u11, 56);
                            eVar4 = eVar3;
                            j05 = j04;
                            j16 = j15;
                            f13 = f12;
                        } else {
                            eVar3 = eVar5;
                        }
                    } else {
                        u11.j();
                        eVar3 = eVar2;
                    }
                    j04 = j03;
                    j15 = j13;
                    f12 = f11;
                    u11.j0();
                    float d112 = ((Z1.h) u11.m(C3269b0.a())).d() + f12;
                    C3996z.b(new S0.H0[]{C3363y.a().c(C7807Z.m(j14)), C3269b0.a().c(Z1.h.a(d112))}, a1.c.c(-1822160838, new N2(eVar3, j04, j15, d112, f12, c4912a2), u11), u11, 56);
                    eVar4 = eVar3;
                    j05 = j04;
                    j16 = j15;
                    f13 = f12;
                } else {
                    u11.j();
                    eVar4 = eVar2;
                    j05 = j03;
                    j16 = j13;
                    f13 = f11;
                }
                long j17 = j14;
                S0.J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new O2(eVar4, j05, j16, j17, f13, c4912a, i11, i12));
                    return;
                }
                return;
            }
            f11 = f7;
            if ((1572864 & i11) == 0) {
            }
            if ((i13 & 599187) == 599186) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if ((i12 & 8) != 0) {
            }
            if (i14 != 0) {
            }
        }
        j03 = j02;
        if ((i11 & 384) != 0) {
        }
        if ((i11 & 3072) != 0) {
        }
        if ((i12 & 16) == 0) {
        }
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        f11 = f7;
        if ((1572864 & i11) == 0) {
        }
        if ((i13 & 599187) == 599186) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if (i14 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, l1.J0 j02, long j11, long j12, float f7, t0.q qVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z12;
        l1.J0 j03;
        C4912a c4912a2;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(1560876237);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            z12 = z11;
            i13 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i11 & 3072) != 0) {
                j03 = j02;
                i13 |= u11.n(j03) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            } else {
                j03 = j02;
            }
            if ((i11 & 24576) == 0) {
                i13 |= u11.s(j11) ? 16384 : 8192;
            }
            if ((196608 & i11) == 0) {
                i13 |= u11.s(j12) ? 131072 : 65536;
            }
            if ((i12 & 64) == 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i13 |= u11.n(null) ? 1048576 : 524288;
            }
            if ((12582912 & i11) == 0) {
                i13 |= u11.q(f7) ? 8388608 : 4194304;
            }
            if ((100663296 & i11) == 0) {
                i13 |= u11.n(qVar) ? 67108864 : 33554432;
            }
            if ((805306368 & i11) != 0) {
                c4912a2 = c4912a;
                i13 |= u11.F(c4912a2) ? 536870912 : 268435456;
            } else {
                c4912a2 = c4912a;
            }
            if ((i13 & 306783379) == 306783378 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) == 0 && !u11.w0()) {
                    u11.j();
                } else if (i14 != 0) {
                    z12 = true;
                }
                u11.j0();
                float d11 = ((Z1.h) u11.m(C3269b0.a())).d() + f7;
                boolean z13 = z12;
                C3996z.b(new S0.H0[]{C3363y.a().c(C7807Z.m(j12)), C3269b0.a().c(Z1.h.a(d11))}, a1.c.c(2031491085, new P2(d11, f7, j11, c4912a2, eVar, function0, j03, qVar, z13), u11), u11, 56);
                z12 = z13;
            } else {
                u11.j();
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new Q2(function0, eVar, z12, j02, j11, j12, f7, qVar, c4912a, i11, i12));
                return;
            }
            return;
        }
        z12 = z11;
        if ((i11 & 3072) != 0) {
        }
        if ((i11 & 24576) == 0) {
        }
        if ((196608 & i11) == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((12582912 & i11) == 0) {
        }
        if ((100663296 & i11) == 0) {
        }
        if ((805306368 & i11) != 0) {
        }
        if ((i13 & 306783379) == 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) == 0) {
        }
        if (i14 != 0) {
        }
        u11.j0();
        float d112 = ((Z1.h) u11.m(C3269b0.a())).d() + f7;
        boolean z132 = z12;
        C3996z.b(new S0.H0[]{C3363y.a().c(C7807Z.m(j12)), C3269b0.a().c(Z1.h.a(d112))}, a1.c.c(2031491085, new P2(d112, f7, j11, c4912a2, eVar, function0, j03, qVar, z132), u11), u11, 56);
        z12 = z132;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final androidx.compose.ui.e c(float f7, long j11, androidx.compose.ui.e eVar, l1.J0 j02) {
        return C6988h.a(androidx.compose.foundation.e.b(S8.b.c(eVar, f7, j02, 24).l0(androidx.compose.ui.e.f40358c0), j11, j02), j02);
    }

    public static final long d(long j11, InterfaceC3264a0 interfaceC3264a0, float f7, InterfaceC3967k interfaceC3967k) {
        if (!C7807Z.p(j11, ((C3339s) interfaceC3967k.m(C3343t.d())).l()) || interfaceC3264a0 == null) {
            interfaceC3967k.o(1082239839);
            interfaceC3967k.k();
            return j11;
        }
        interfaceC3967k.o(1082171732);
        long a11 = interfaceC3264a0.a(j11, f7, interfaceC3967k, 0);
        interfaceC3967k.k();
        return a11;
    }
}
