package J0;

import B0.C2454a;
import B0.C2475h;
import Bl0.C2656q;
import D1.InterfaceC2801g;
import Q1.X;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import hd.C6915b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12773a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final long f12774b = Hj0.T.d(8);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12775c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull Q1.K k11, @NotNull Function1 function1, androidx.compose.ui.e eVar, boolean z11, K1.T t2, C4912a c4912a, C4912a c4912a2, C2454a c2454a, B0.N0 n02, B0.M0 m02, int i11, int i12, A0.a aVar, T2 t22, InterfaceC3967k interfaceC3967k, int i13) {
        int i14;
        B0.N0 n03;
        A0.a c11;
        T2 e11;
        int i15;
        int i16;
        C2454a c2454a2;
        B0.N0 n04;
        B0.M0 m03;
        int i17;
        boolean z12;
        K1.T t11;
        C3969l c3969l;
        C2454a c2454a3;
        A0.a aVar2;
        K1.T t12;
        boolean z13;
        B0.N0 n05;
        B0.M0 m04;
        int i18;
        T2 t23;
        int i19;
        C3969l u11 = interfaceC3967k.u(237745923);
        if ((i13 & 6) == 0) {
            i14 = (u11.n(k11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= u11.F(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i21 = i14 | 27648;
        if ((196608 & i13) == 0) {
            i21 = 93184 | i14;
        }
        if ((1572864 & i13) == 0) {
            i21 |= u11.F(c4912a) ? 1048576 : 524288;
        }
        int i22 = 113246208 | i21;
        if ((805306368 & i13) == 0) {
            i22 |= u11.F(c4912a2) ? 536870912 : 268435456;
        }
        if ((306783379 & i22) == 306783378 && u11.b()) {
            u11.j();
            z13 = z11;
            t12 = t2;
            c2454a3 = c2454a;
            n05 = n02;
            m04 = m02;
            i18 = i11;
            i19 = i12;
            aVar2 = aVar;
            t23 = t22;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i13 & 1) == 0 || u11.w0()) {
                K1.T t13 = (K1.T) u11.m(u3.e());
                C2454a a11 = X.a.a();
                n03 = B0.N0.f1448g;
                B0.M0 m05 = new B0.M0(null, 63);
                W2 w22 = W2.f13064a;
                c11 = ((C3286e2) u11.m(C3291f2.a())).c();
                e11 = W2.e(u11);
                i15 = 1;
                i16 = i22 & (-458753);
                c2454a2 = a11;
                n04 = n03;
                m03 = m05;
                i17 = Integer.MAX_VALUE;
                z12 = true;
                t11 = t13;
            } else {
                u11.j();
                t11 = t2;
                c2454a2 = c2454a;
                n04 = n02;
                m03 = m02;
                i17 = i11;
                i15 = i12;
                c11 = aVar;
                e11 = t22;
                i16 = i22 & (-458753);
                z12 = z11;
            }
            u11.j0();
            u11.o(-579730026);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                u11.x(C11);
            }
            t0.q qVar = (t0.q) C11;
            u11.k();
            u11.o(674040799);
            long f7 = t11.f();
            if (f7 == 16) {
                f7 = ((C7807Z) e11.g(z12, u11).getValue()).w();
            }
            long j11 = f7;
            u11.k();
            K1.T E11 = t11.E(new K1.T(j11, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
            androidx.compose.ui.e l02 = eVar.l0(c4912a != null ? androidx.compose.foundation.layout.T.j(I1.o.c(androidx.compose.ui.e.f40358c0, true, A1.f12660b), 0.0f, ((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).p(f12774b), 0.0f, 0.0f, 13) : androidx.compose.ui.e.f40358c0);
            K2.a(u11, 3);
            int i23 = j3.f13255e;
            W2 w23 = W2.f13064a;
            C2454a c2454a4 = c2454a2;
            boolean z14 = z12;
            c3969l = u11;
            C2475h.c(k11, function1, androidx.compose.foundation.layout.a0.a(l02, W2.d(), W2.c()), z14, false, E11, n04, m03, false, i17, i15, c2454a2, null, qVar, new l1.K0(((C7807Z) e11.h(false, u11).getValue()).w()), a1.c.c(-1001528775, new C1(k11, z14, c2454a4, qVar, c4912a, c4912a2, c11, e11), u11), c3969l, (i16 & 64638) | 102236160, 196662, 4096);
            c2454a3 = c2454a4;
            aVar2 = c11;
            t12 = t11;
            z13 = z14;
            n05 = n04;
            m04 = m03;
            i18 = i17;
            t23 = e11;
            i19 = i15;
        }
        S0.J0 m06 = c3969l.m0();
        if (m06 != null) {
            m06.G(new C3353v1(k11, function1, eVar, z13, t12, c4912a, c4912a2, c2454a3, n05, m04, i18, i19, aVar2, t23, i13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull String str, @NotNull Function1 function1, androidx.compose.ui.e eVar, boolean z11, boolean z12, K1.T t2, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, boolean z13, C2454a c2454a, B0.N0 n02, B0.M0 m02, boolean z14, int i11, int i12, A0.a aVar, T2 t22, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        boolean z15;
        int i16;
        C4912a c4912a4;
        int i17;
        int i18;
        int i19;
        C4912a c4912a5;
        int i21;
        int i22;
        int i23;
        int i24;
        B0.N0 n03;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        K1.T t11;
        C4912a c4912a6;
        C2454a a11;
        B0.M0 m03;
        boolean z16;
        boolean z17;
        int i31;
        int i32;
        int i33;
        int i34;
        T2 e11;
        int i35;
        A0.a aVar2;
        boolean z18;
        boolean z19;
        Object C11;
        long f7;
        t0.q qVar;
        K1.T t12;
        boolean z21;
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e eVar3;
        C3969l c3969l;
        C4912a c4912a7;
        boolean z22;
        C4912a c4912a8;
        boolean z23;
        boolean z24;
        B0.N0 n04;
        B0.M0 m04;
        boolean z25;
        int i36;
        int i37;
        C2454a c2454a2;
        C4912a c4912a9;
        A0.a aVar3;
        K1.T t13;
        T2 t23;
        S0.J0 m05;
        C3969l u11 = interfaceC3967k.u(-621914704);
        int i38 = (u11.n(str) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i38 |= u11.F(function1) ? 32 : 16;
        }
        int i39 = i38 | 3072;
        int i41 = 16 & i15;
        if (i41 != 0) {
            i39 = i38 | 27648;
        } else if ((i13 & 24576) == 0) {
            z15 = z12;
            i39 |= u11.p(z15) ? 16384 : 8192;
            int i42 = 65536 | i39;
            i16 = i15 & 64;
            if (i16 == 0) {
                i42 = 1638400 | i39;
            } else if ((1572864 & i13) == 0) {
                c4912a4 = c4912a;
                i42 |= u11.F(c4912a4) ? 1048576 : 524288;
                i17 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i17 != 0) {
                    i42 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    i42 |= u11.F(c4912a2) ? 8388608 : 4194304;
                }
                i18 = i42 | 100663296;
                i19 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i19 != 0) {
                    i18 = i42 | 905969664;
                } else if ((805306368 & i13) == 0) {
                    c4912a5 = c4912a3;
                    i18 |= u11.F(c4912a5) ? 536870912 : 268435456;
                    i21 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i21 == 0) {
                        i23 = i14 | 6;
                        i22 = 1;
                    } else {
                        i22 = 1;
                        i23 = i14 | (u11.p(z13) ? 4 : 2);
                    }
                    int i43 = i23;
                    int i44 = i43 | 48;
                    i24 = i15 & 4096;
                    if (i24 == 0) {
                        i25 = i24;
                        i26 = i43 | 432;
                        n03 = n02;
                    } else {
                        if ((i14 & 384) == 0) {
                            n03 = n02;
                            i44 |= u11.n(n03) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                        } else {
                            n03 = n02;
                        }
                        i25 = i24;
                        i26 = i44;
                    }
                    int i45 = i26 | 3072;
                    i27 = i15 & 16384;
                    if (i27 == 0) {
                        i28 = i26 | 27648;
                    } else if ((i14 & 24576) == 0) {
                        i28 = i45 | (u11.p(z14) ? 16384 : 8192);
                    } else {
                        i28 = i45;
                    }
                    i29 = i28 | 316211200;
                    if ((i18 & 306783379) != 306783378 && (i29 & 306783379) == 306783378 && u11.b()) {
                        u11.j();
                        eVar3 = eVar;
                        z23 = z11;
                        t13 = t2;
                        c4912a8 = c4912a2;
                        z22 = z13;
                        c2454a2 = c2454a;
                        z25 = z14;
                        i37 = i12;
                        aVar3 = aVar;
                        t23 = t22;
                        n04 = n03;
                        c3969l = u11;
                        z24 = z15;
                        c4912a7 = c4912a4;
                        c4912a9 = c4912a5;
                        m04 = m02;
                        i36 = i11;
                    } else {
                        u11.Q0();
                        if ((i13 & 1) != 0 || u11.w0()) {
                            if (i41 != 0) {
                                z15 = false;
                            }
                            t11 = (K1.T) u11.m(u3.e());
                            int i46 = i18 & (-458753);
                            if (i16 != 0) {
                                c4912a4 = null;
                            }
                            c4912a6 = i17 == 0 ? null : c4912a2;
                            if (i19 != 0) {
                                c4912a5 = null;
                            }
                            boolean z26 = i21 == 0 ? false : z13;
                            a11 = X.a.a();
                            if (i25 != 0) {
                                n03 = B0.N0.f1448g;
                            }
                            m03 = B0.M0.f1437b;
                            z16 = i27 == 0 ? false : z14;
                            int i47 = !z16 ? i22 : Integer.MAX_VALUE;
                            W2 w22 = W2.f13064a;
                            A0.a c11 = ((C3286e2) u11.m(C3291f2.a())).c();
                            z17 = z15;
                            i31 = 12582912;
                            i32 = i47;
                            i33 = i22;
                            i34 = i46;
                            e11 = W2.e(u11);
                            i35 = i29 & (-2114387969);
                            aVar2 = c11;
                            z18 = z26;
                            z19 = i33 == true ? 1 : 0;
                        } else {
                            u11.j();
                            z19 = z11;
                            c4912a6 = c4912a2;
                            z18 = z13;
                            a11 = c2454a;
                            m03 = m02;
                            z16 = z14;
                            i33 = i12;
                            e11 = t22;
                            i35 = i29 & (-2114387969);
                            z17 = z15;
                            i31 = 12582912;
                            i32 = i11;
                            aVar2 = aVar;
                            i34 = i18 & (-458753);
                            t11 = t2;
                        }
                        u11.j0();
                        u11.o(-589524042);
                        C11 = u11.C();
                        A0.a aVar4 = aVar2;
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = t0.p.a();
                            u11.x(C11);
                        }
                        t0.q qVar2 = (t0.q) C11;
                        u11.k();
                        u11.o(673724863);
                        f7 = t11.f();
                        if (f7 == 16) {
                            f7 = ((C7807Z) e11.g(z19, u11).getValue()).w();
                        }
                        long j11 = f7;
                        u11.k();
                        K1.T E11 = t11.E(new K1.T(j11, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
                        K1.T t14 = t11;
                        Z1.d dVar = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
                        if (c4912a4 == null) {
                            qVar = qVar2;
                            t12 = E11;
                            z21 = z16;
                            eVar2 = androidx.compose.foundation.layout.T.j(I1.o.c(androidx.compose.ui.e.f40358c0, i22, C3357w1.f13460b), 0.0f, dVar.p(f12774b), 0.0f, 0.0f, 13);
                        } else {
                            qVar = qVar2;
                            t12 = E11;
                            z21 = z16;
                            eVar2 = androidx.compose.ui.e.f40358c0;
                        }
                        eVar3 = eVar;
                        androidx.compose.ui.e l02 = eVar3.l0(eVar2);
                        String a12 = K2.a(u11, 3);
                        int i48 = j3.f13255e;
                        if (z18) {
                            l02 = I1.o.c(l02, false, new i3(a12));
                        }
                        W2 w23 = W2.f13064a;
                        boolean z27 = z18;
                        T2 t24 = e11;
                        C4912a c4912a10 = c4912a6;
                        C4912a c4912a11 = c4912a4;
                        C2454a c2454a3 = a11;
                        C4912a c4912a12 = c4912a5;
                        B0.M0 m06 = m03;
                        boolean z28 = z21;
                        int i49 = i35 << 12;
                        B0.N0 n05 = n03;
                        c3969l = u11;
                        C2475h.d(str, function1, androidx.compose.foundation.layout.a0.a(l02, W2.d(), W2.c()), z19, z17, t12, n05, m06, z28, i32, i33, c2454a3, null, qVar, new l1.K0(((C7807Z) e11.h(z18, u11).getValue()).w()), a1.c.c(1710364390, new C3365y1(str, z19, z21, c2454a3, qVar, z27, c4912a11, c4912a10, c4912a12, aVar4, t24), u11), c3969l, i31 | (i34 & 64638) | (3670016 & i49) | (234881024 & i49), 196662, 4096);
                        c4912a7 = c4912a11;
                        z22 = z27;
                        c4912a8 = c4912a10;
                        z23 = z19;
                        z24 = z17;
                        n04 = n05;
                        m04 = m06;
                        z25 = z28;
                        i36 = i32;
                        i37 = i33;
                        c2454a2 = c2454a3;
                        c4912a9 = c4912a12;
                        aVar3 = aVar4;
                        t13 = t14;
                        t23 = t24;
                    }
                    m05 = c3969l.m0();
                    if (m05 == null) {
                        m05.G(new C3369z1(str, function1, eVar3, z23, z24, t13, c4912a7, c4912a8, c4912a9, z22, c2454a2, n04, m04, z25, i36, i37, aVar3, t23, i13, i14, i15));
                        return;
                    }
                    return;
                }
                c4912a5 = c4912a3;
                i21 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i21 == 0) {
                }
                int i432 = i23;
                int i442 = i432 | 48;
                i24 = i15 & 4096;
                if (i24 == 0) {
                }
                int i452 = i26 | 3072;
                i27 = i15 & 16384;
                if (i27 == 0) {
                }
                i29 = i28 | 316211200;
                if ((i18 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i13 & 1) != 0) {
                }
                if (i41 != 0) {
                }
                t11 = (K1.T) u11.m(u3.e());
                int i462 = i18 & (-458753);
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (i19 != 0) {
                }
                if (i21 == 0) {
                }
                a11 = X.a.a();
                if (i25 != 0) {
                }
                m03 = B0.M0.f1437b;
                if (i27 == 0) {
                }
                if (!z16) {
                }
                W2 w222 = W2.f13064a;
                A0.a c112 = ((C3286e2) u11.m(C3291f2.a())).c();
                z17 = z15;
                i31 = 12582912;
                i32 = i47;
                i33 = i22;
                i34 = i462;
                e11 = W2.e(u11);
                i35 = i29 & (-2114387969);
                aVar2 = c112;
                z18 = z26;
                z19 = i33 == true ? 1 : 0;
                u11.j0();
                u11.o(-589524042);
                C11 = u11.C();
                A0.a aVar42 = aVar2;
                if (C11 == InterfaceC3967k.a.a()) {
                }
                t0.q qVar22 = (t0.q) C11;
                u11.k();
                u11.o(673724863);
                f7 = t11.f();
                if (f7 == 16) {
                }
                long j112 = f7;
                u11.k();
                K1.T E112 = t11.E(new K1.T(j112, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
                K1.T t142 = t11;
                Z1.d dVar2 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
                if (c4912a4 == null) {
                }
                eVar3 = eVar;
                androidx.compose.ui.e l022 = eVar3.l0(eVar2);
                String a122 = K2.a(u11, 3);
                int i482 = j3.f13255e;
                if (z18) {
                }
                W2 w232 = W2.f13064a;
                boolean z272 = z18;
                T2 t242 = e11;
                C4912a c4912a102 = c4912a6;
                C4912a c4912a112 = c4912a4;
                C2454a c2454a32 = a11;
                C4912a c4912a122 = c4912a5;
                B0.M0 m062 = m03;
                boolean z282 = z21;
                int i492 = i35 << 12;
                B0.N0 n052 = n03;
                c3969l = u11;
                C2475h.d(str, function1, androidx.compose.foundation.layout.a0.a(l022, W2.d(), W2.c()), z19, z17, t12, n052, m062, z282, i32, i33, c2454a32, null, qVar, new l1.K0(((C7807Z) e11.h(z18, u11).getValue()).w()), a1.c.c(1710364390, new C3365y1(str, z19, z21, c2454a32, qVar, z272, c4912a112, c4912a102, c4912a122, aVar42, t242), u11), c3969l, i31 | (i34 & 64638) | (3670016 & i492) | (234881024 & i492), 196662, 4096);
                c4912a7 = c4912a112;
                z22 = z272;
                c4912a8 = c4912a102;
                z23 = z19;
                z24 = z17;
                n04 = n052;
                m04 = m062;
                z25 = z282;
                i36 = i32;
                i37 = i33;
                c2454a2 = c2454a32;
                c4912a9 = c4912a122;
                aVar3 = aVar42;
                t13 = t142;
                t23 = t242;
                m05 = c3969l.m0();
                if (m05 == null) {
                }
            }
            c4912a4 = c4912a;
            i17 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i17 != 0) {
            }
            i18 = i42 | 100663296;
            i19 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i19 != 0) {
            }
            c4912a5 = c4912a3;
            i21 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i21 == 0) {
            }
            int i4322 = i23;
            int i4422 = i4322 | 48;
            i24 = i15 & 4096;
            if (i24 == 0) {
            }
            int i4522 = i26 | 3072;
            i27 = i15 & 16384;
            if (i27 == 0) {
            }
            i29 = i28 | 316211200;
            if ((i18 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i13 & 1) != 0) {
            }
            if (i41 != 0) {
            }
            t11 = (K1.T) u11.m(u3.e());
            int i4622 = i18 & (-458753);
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if (i19 != 0) {
            }
            if (i21 == 0) {
            }
            a11 = X.a.a();
            if (i25 != 0) {
            }
            m03 = B0.M0.f1437b;
            if (i27 == 0) {
            }
            if (!z16) {
            }
            W2 w2222 = W2.f13064a;
            A0.a c1122 = ((C3286e2) u11.m(C3291f2.a())).c();
            z17 = z15;
            i31 = 12582912;
            i32 = i47;
            i33 = i22;
            i34 = i4622;
            e11 = W2.e(u11);
            i35 = i29 & (-2114387969);
            aVar2 = c1122;
            z18 = z26;
            z19 = i33 == true ? 1 : 0;
            u11.j0();
            u11.o(-589524042);
            C11 = u11.C();
            A0.a aVar422 = aVar2;
            if (C11 == InterfaceC3967k.a.a()) {
            }
            t0.q qVar222 = (t0.q) C11;
            u11.k();
            u11.o(673724863);
            f7 = t11.f();
            if (f7 == 16) {
            }
            long j1122 = f7;
            u11.k();
            K1.T E1122 = t11.E(new K1.T(j1122, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
            K1.T t1422 = t11;
            Z1.d dVar22 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
            if (c4912a4 == null) {
            }
            eVar3 = eVar;
            androidx.compose.ui.e l0222 = eVar3.l0(eVar2);
            String a1222 = K2.a(u11, 3);
            int i4822 = j3.f13255e;
            if (z18) {
            }
            W2 w2322 = W2.f13064a;
            boolean z2722 = z18;
            T2 t2422 = e11;
            C4912a c4912a1022 = c4912a6;
            C4912a c4912a1122 = c4912a4;
            C2454a c2454a322 = a11;
            C4912a c4912a1222 = c4912a5;
            B0.M0 m0622 = m03;
            boolean z2822 = z21;
            int i4922 = i35 << 12;
            B0.N0 n0522 = n03;
            c3969l = u11;
            C2475h.d(str, function1, androidx.compose.foundation.layout.a0.a(l0222, W2.d(), W2.c()), z19, z17, t12, n0522, m0622, z2822, i32, i33, c2454a322, null, qVar, new l1.K0(((C7807Z) e11.h(z18, u11).getValue()).w()), a1.c.c(1710364390, new C3365y1(str, z19, z21, c2454a322, qVar, z2722, c4912a1122, c4912a1022, c4912a1222, aVar422, t2422), u11), c3969l, i31 | (i34 & 64638) | (3670016 & i4922) | (234881024 & i4922), 196662, 4096);
            c4912a7 = c4912a1122;
            z22 = z2722;
            c4912a8 = c4912a1022;
            z23 = z19;
            z24 = z17;
            n04 = n0522;
            m04 = m0622;
            z25 = z2822;
            i36 = i32;
            i37 = i33;
            c2454a2 = c2454a322;
            c4912a9 = c4912a1222;
            aVar3 = aVar422;
            t13 = t1422;
            t23 = t2422;
            m05 = c3969l.m0();
            if (m05 == null) {
            }
        }
        z15 = z12;
        int i422 = 65536 | i39;
        i16 = i15 & 64;
        if (i16 == 0) {
        }
        c4912a4 = c4912a;
        i17 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 != 0) {
        }
        i18 = i422 | 100663296;
        i19 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i19 != 0) {
        }
        c4912a5 = c4912a3;
        i21 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i21 == 0) {
        }
        int i43222 = i23;
        int i44222 = i43222 | 48;
        i24 = i15 & 4096;
        if (i24 == 0) {
        }
        int i45222 = i26 | 3072;
        i27 = i15 & 16384;
        if (i27 == 0) {
        }
        i29 = i28 | 316211200;
        if ((i18 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i13 & 1) != 0) {
        }
        if (i41 != 0) {
        }
        t11 = (K1.T) u11.m(u3.e());
        int i46222 = i18 & (-458753);
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i19 != 0) {
        }
        if (i21 == 0) {
        }
        a11 = X.a.a();
        if (i25 != 0) {
        }
        m03 = B0.M0.f1437b;
        if (i27 == 0) {
        }
        if (!z16) {
        }
        W2 w22222 = W2.f13064a;
        A0.a c11222 = ((C3286e2) u11.m(C3291f2.a())).c();
        z17 = z15;
        i31 = 12582912;
        i32 = i47;
        i33 = i22;
        i34 = i46222;
        e11 = W2.e(u11);
        i35 = i29 & (-2114387969);
        aVar2 = c11222;
        z18 = z26;
        z19 = i33 == true ? 1 : 0;
        u11.j0();
        u11.o(-589524042);
        C11 = u11.C();
        A0.a aVar4222 = aVar2;
        if (C11 == InterfaceC3967k.a.a()) {
        }
        t0.q qVar2222 = (t0.q) C11;
        u11.k();
        u11.o(673724863);
        f7 = t11.f();
        if (f7 == 16) {
        }
        long j11222 = f7;
        u11.k();
        K1.T E11222 = t11.E(new K1.T(j11222, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
        K1.T t14222 = t11;
        Z1.d dVar222 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
        if (c4912a4 == null) {
        }
        eVar3 = eVar;
        androidx.compose.ui.e l02222 = eVar3.l0(eVar2);
        String a12222 = K2.a(u11, 3);
        int i48222 = j3.f13255e;
        if (z18) {
        }
        W2 w23222 = W2.f13064a;
        boolean z27222 = z18;
        T2 t24222 = e11;
        C4912a c4912a10222 = c4912a6;
        C4912a c4912a11222 = c4912a4;
        C2454a c2454a3222 = a11;
        C4912a c4912a12222 = c4912a5;
        B0.M0 m06222 = m03;
        boolean z28222 = z21;
        int i49222 = i35 << 12;
        B0.N0 n05222 = n03;
        c3969l = u11;
        C2475h.d(str, function1, androidx.compose.foundation.layout.a0.a(l02222, W2.d(), W2.c()), z19, z17, t12, n05222, m06222, z28222, i32, i33, c2454a3222, null, qVar, new l1.K0(((C7807Z) e11.h(z18, u11).getValue()).w()), a1.c.c(1710364390, new C3365y1(str, z19, z21, c2454a3222, qVar, z27222, c4912a11222, c4912a10222, c4912a12222, aVar4222, t24222), u11), c3969l, i31 | (i34 & 64638) | (3670016 & i49222) | (234881024 & i49222), 196662, 4096);
        c4912a7 = c4912a11222;
        z22 = z27222;
        c4912a8 = c4912a10222;
        z23 = z19;
        z24 = z17;
        n04 = n05222;
        m04 = m06222;
        z25 = z28222;
        i36 = i32;
        i37 = i33;
        c2454a2 = c2454a3222;
        c4912a9 = c4912a12222;
        aVar3 = aVar4222;
        t13 = t14222;
        t23 = t24222;
        m05 = c3969l.m0();
        if (m05 == null) {
        }
    }

    public static final void c(@NotNull androidx.compose.ui.e eVar, @NotNull Function2 function2, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, boolean z11, float f7, @NotNull Function1 function1, @NotNull C4912a c4912a5, @NotNull C9915y c9915y, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2049536174);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(c4912a2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(c4912a3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(c4912a4) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.p(z11) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.q(f7) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= u11.F(c4912a5) ? 536870912 : 268435456;
        }
        char c11 = u11.n(c9915y) ? (char) 4 : (char) 2;
        if ((i12 & 306783379) == 306783378 && (c11 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            boolean z12 = ((234881024 & i12) == 67108864) | ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608) | ((c11 & 14) == 4);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new G1(function1, z11, f7, c9915y);
                u11.x(C11);
            }
            G1 g12 = (G1) C11;
            Z1.s sVar = (Z1.s) u11.m(androidx.compose.ui.platform.K0.k());
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            S0.F1.b(u11, g12, InterfaceC2801g.a.e());
            S0.F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            c4912a5.invoke(u11, Integer.valueOf((i12 >> 27) & 14));
            if (c4912a3 != null) {
                u11.o(-988654503);
                androidx.compose.ui.e l02 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Leading").l0(j3.d());
                B1.V f12 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I12 = u11.I();
                S0.A0 d12 = u11.d();
                androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, l02);
                Function0 a12 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                Function2 f14 = T7.E.f(u11, f12, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, u11, I12, f14);
                }
                S0.F1.b(u11, f13, InterfaceC2801g.a.f());
                c4912a3.invoke(u11, Integer.valueOf((i12 >> 12) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(-988413292);
                u11.k();
            }
            if (c4912a4 != null) {
                u11.o(-988370729);
                androidx.compose.ui.e l03 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Trailing").l0(j3.d());
                B1.V f15 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I13 = u11.I();
                S0.A0 d13 = u11.d();
                androidx.compose.ui.e f16 = androidx.compose.ui.c.f(u11, l03);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f17 = T7.E.f(u11, f15, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, f17);
                }
                S0.F1.b(u11, f16, InterfaceC2801g.a.f());
                c4912a4.invoke(u11, Integer.valueOf((i12 >> 15) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(-988127596);
                u11.k();
            }
            float d14 = androidx.compose.foundation.layout.T.d(c9915y, sVar);
            float c12 = androidx.compose.foundation.layout.T.c(c9915y, sVar);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            if (c4912a3 != null) {
                d14 -= j3.c();
                float f18 = 0;
                if (d14 < f18) {
                    d14 = f18;
                }
            }
            float f19 = d14;
            if (c4912a4 != null) {
                c12 -= j3.c();
                float f21 = 0;
                if (c12 < f21) {
                    c12 = f21;
                }
            }
            androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(aVar, f19, 0.0f, c12, 0.0f, 10);
            if (c4912a != null) {
                u11.o(-987369863);
                c4912a.invoke(androidx.compose.ui.layout.a.b(aVar, "Hint").l0(j11), u11, Integer.valueOf((i12 >> 3) & 112));
                u11.k();
            } else {
                u11.o(-987282412);
                u11.k();
            }
            androidx.compose.ui.e l04 = androidx.compose.ui.layout.a.b(aVar, "TextField").l0(j11);
            B1.V f22 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I14 = u11.I();
            S0.A0 d15 = u11.d();
            androidx.compose.ui.e f23 = androidx.compose.ui.c.f(u11, l04);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f24 = T7.E.f(u11, f22, u11, d15);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                Ep.a.d(I14, u11, I14, f24);
            }
            S0.F1.b(u11, f23, InterfaceC2801g.a.f());
            C3349u1.e((i12 >> 3) & 14, function2, u11);
            if (c4912a2 != null) {
                u11.o(-987052578);
                androidx.compose.ui.e b12 = androidx.compose.ui.layout.a.b(aVar, "Label");
                B1.V f25 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I15 = u11.I();
                S0.A0 d16 = u11.d();
                androidx.compose.ui.e f26 = androidx.compose.ui.c.f(u11, b12);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a15);
                } else {
                    u11.e();
                }
                Function2 f27 = T7.E.f(u11, f25, u11, d16);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                    Ep.a.d(I15, u11, I15, f27);
                }
                S0.F1.b(u11, f26, InterfaceC2801g.a.f());
                c4912a2.invoke(u11, Integer.valueOf((i12 >> 9) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(-986969932);
                u11.k();
            }
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new D1(eVar, function2, c4912a, c4912a2, c4912a3, c4912a4, z11, f7, function1, c4912a5, c9915y, i11));
        }
    }

    public static final int d(int i11, int i12, int i13, int i14, int i15, float f7, long j11, float f11, C9915y c9915y) {
        int max = Math.max(i13, Math.max(i15, C2656q.c(f7, i14, 0)));
        float d11 = c9915y.d() * f11;
        return Math.max(Z1.b.l(j11), Math.max(i11, Math.max(i12, C6915b.c(C2656q.b(d11, Math.max(d11, i14 / 2.0f), f7) + max + (c9915y.a() * f11)))));
    }

    public static final int e(int i11, int i12, int i13, int i14, int i15, float f7, long j11, float f11, C9915y c9915y) {
        int max = Math.max(i13, Math.max(C2656q.c(f7, i14, 0), i15)) + i11 + i12;
        Z1.s sVar = Z1.s.Ltr;
        return Math.max(max, Math.max(C6915b.c((i14 + ((c9915y.c(sVar) + c9915y.b(sVar)) * f11)) * f7), Z1.b.m(j11)));
    }
}
