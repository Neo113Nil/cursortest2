package P0;

import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import u0.C9892a;
import u0.M;

/* renamed from: P0.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3752l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f21197a = 16;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(e.a aVar, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, int i11, long j11, long j12, C9892a c9892a, @NotNull C4912a c4912a5, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        C4912a c4912a6;
        int i14;
        int i15;
        C4912a c4912a7;
        e.a aVar2;
        C4912a c4912a8;
        C4912a c4912a9;
        C4912a c4912a10;
        C9892a i16;
        long j13;
        long j14;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        C3969l c3969l;
        C4912a c4912a11;
        C4912a c4912a12;
        C4912a c4912a13;
        e.a aVar3;
        C4912a c4912a14;
        long j15;
        long j16;
        int i17;
        S0.J0 m02;
        int i18 = 2;
        C3969l u11 = interfaceC3967k.u(-1219521777);
        int i19 = i12 | 6;
        int i21 = i13 & 2;
        if (i21 != 0) {
            i19 = i12 | 54;
        } else if ((i12 & 48) == 0) {
            c4912a6 = c4912a;
            i19 |= u11.F(c4912a6) ? 32 : 16;
            i14 = i19 | 384;
            i15 = i13 & 8;
            if (i15 == 0) {
                i14 = i19 | 3456;
            } else if ((i12 & 3072) == 0) {
                c4912a7 = c4912a3;
                i14 |= u11.F(c4912a7) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if (((i14 | 38494208) & 306783379) == 306783378 || !u11.b()) {
                    u11.Q0();
                    if ((i12 & 1) != 0 || u11.w0()) {
                        aVar2 = androidx.compose.ui.e.f40358c0;
                        c4912a8 = i21 != 0 ? r.f21313a : c4912a6;
                        c4912a9 = r.f21314b;
                        if (i15 != 0) {
                            c4912a7 = r.f21315c;
                        }
                        c4912a10 = r.f21316d;
                        long a11 = ((C3756n) u11.m(C3759o.d())).a();
                        long b11 = C3759o.b(a11, u11);
                        int i22 = u0.J.f99608a;
                        int i23 = u0.M.f99615y;
                        i16 = M.a.c(u11).i();
                        j13 = a11;
                        j14 = b11;
                    } else {
                        u11.j();
                        aVar2 = aVar;
                        c4912a10 = c4912a4;
                        i18 = i11;
                        j13 = j11;
                        j14 = j12;
                        i16 = c9892a;
                        c4912a8 = c4912a6;
                        c4912a9 = c4912a2;
                    }
                    u11.j0();
                    n11 = u11.n(i16);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new Q0.g(i16);
                        u11.x(C11);
                    }
                    Q0.g gVar = (Q0.g) C11;
                    n12 = u11.n(gVar) | u11.n(i16);
                    C12 = u11.C();
                    if (!n12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new C3728d1(gVar, i16);
                        u11.x(C12);
                    }
                    c3969l = u11;
                    e2.a(u0.O.c(aVar2, (Function1) C12), null, j13, j14, 0.0f, 0.0f, a1.c.c(-1979205334, new C3731e1(i18, c4912a8, c4912a5, c4912a7, c4912a10, gVar, c4912a9), u11), c3969l, 12582912, 114);
                    C4912a c4912a15 = c4912a9;
                    c4912a11 = c4912a7;
                    c4912a12 = c4912a8;
                    c4912a13 = c4912a15;
                    aVar3 = aVar2;
                    c4912a14 = c4912a10;
                    j15 = j13;
                    j16 = j14;
                    i17 = i18;
                } else {
                    u11.j();
                    C4912a c4912a16 = c4912a6;
                    c4912a11 = c4912a7;
                    c4912a12 = c4912a16;
                    c4912a13 = c4912a2;
                    c4912a14 = c4912a4;
                    i17 = i11;
                    j15 = j11;
                    j16 = j12;
                    i16 = c9892a;
                    c3969l = u11;
                    aVar3 = aVar;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new C3734f1(aVar3, c4912a12, c4912a13, c4912a11, c4912a14, i17, j15, j16, i16, c4912a5, i12, i13));
                    return;
                }
                return;
            }
            c4912a7 = c4912a3;
            if (((i14 | 38494208) & 306783379) == 306783378) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            aVar2 = androidx.compose.ui.e.f40358c0;
            if (i21 != 0) {
            }
            c4912a9 = r.f21314b;
            if (i15 != 0) {
            }
            c4912a10 = r.f21316d;
            long a112 = ((C3756n) u11.m(C3759o.d())).a();
            long b112 = C3759o.b(a112, u11);
            int i222 = u0.J.f99608a;
            int i232 = u0.M.f99615y;
            i16 = M.a.c(u11).i();
            j13 = a112;
            j14 = b112;
            u11.j0();
            n11 = u11.n(i16);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = new Q0.g(i16);
            u11.x(C11);
            Q0.g gVar2 = (Q0.g) C11;
            n12 = u11.n(gVar2) | u11.n(i16);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = new C3728d1(gVar2, i16);
            u11.x(C12);
            c3969l = u11;
            e2.a(u0.O.c(aVar2, (Function1) C12), null, j13, j14, 0.0f, 0.0f, a1.c.c(-1979205334, new C3731e1(i18, c4912a8, c4912a5, c4912a7, c4912a10, gVar2, c4912a9), u11), c3969l, 12582912, 114);
            C4912a c4912a152 = c4912a9;
            c4912a11 = c4912a7;
            c4912a12 = c4912a8;
            c4912a13 = c4912a152;
            aVar3 = aVar2;
            c4912a14 = c4912a10;
            j15 = j13;
            j16 = j14;
            i17 = i18;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        c4912a6 = c4912a;
        i14 = i19 | 384;
        i15 = i13 & 8;
        if (i15 == 0) {
        }
        c4912a7 = c4912a3;
        if (((i14 | 38494208) & 306783379) == 306783378) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        aVar2 = androidx.compose.ui.e.f40358c0;
        if (i21 != 0) {
        }
        c4912a9 = r.f21314b;
        if (i15 != 0) {
        }
        c4912a10 = r.f21316d;
        long a1122 = ((C3756n) u11.m(C3759o.d())).a();
        long b1122 = C3759o.b(a1122, u11);
        int i2222 = u0.J.f99608a;
        int i2322 = u0.M.f99615y;
        i16 = M.a.c(u11).i();
        j13 = a1122;
        j14 = b1122;
        u11.j0();
        n11 = u11.n(i16);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new Q0.g(i16);
        u11.x(C11);
        Q0.g gVar22 = (Q0.g) C11;
        n12 = u11.n(gVar22) | u11.n(i16);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = new C3728d1(gVar22, i16);
        u11.x(C12);
        c3969l = u11;
        e2.a(u0.O.c(aVar2, (Function1) C12), null, j13, j14, 0.0f, 0.0f, a1.c.c(-1979205334, new C3731e1(i18, c4912a8, c4912a5, c4912a7, c4912a10, gVar22, c4912a9), u11), c3969l, 12582912, 114);
        C4912a c4912a1522 = c4912a9;
        c4912a11 = c4912a7;
        c4912a12 = c4912a8;
        c4912a13 = c4912a1522;
        aVar3 = aVar2;
        c4912a14 = c4912a10;
        j15 = j13;
        j16 = j14;
        i17 = i18;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    public static final void b(int i11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, u0.J j11, C4912a c4912a5, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C4912a c4912a6;
        u0.J j12;
        C4912a c4912a7;
        C3969l u11 = interfaceC3967k.u(-975511942);
        if ((i12 & 6) == 0) {
            i13 = (u11.r(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            c4912a6 = c4912a2;
            i13 |= u11.F(c4912a6) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            c4912a6 = c4912a2;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.F(c4912a3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 24576) == 0) {
            i13 |= u11.F(c4912a4) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            j12 = j11;
            i13 |= u11.n(j12) ? 131072 : 65536;
        } else {
            j12 = j11;
        }
        if ((1572864 & i12) == 0) {
            c4912a7 = c4912a5;
            i13 |= u11.F(c4912a7) ? 1048576 : 524288;
        } else {
            c4912a7 = c4912a5;
        }
        if ((i13 & 599187) == 599186 && u11.b()) {
            u11.j();
        } else {
            boolean z11 = ((i13 & 896) == 256) | ((i13 & 112) == 32) | ((i13 & 7168) == 2048) | ((458752 & i13) == 131072) | ((57344 & i13) == 16384) | ((i13 & 14) == 4) | ((3670016 & i13) == 1048576);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C3746j1 c3746j1 = new C3746j1(c4912a, c4912a3, c4912a4, i11, j12, c4912a7, c4912a6);
                u11.x(c3746j1);
                C11 = c3746j1;
            }
            B1.v0.b(null, (Function2) C11, u11, 0, 1);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3749k1(i11, c4912a, c4912a2, c4912a3, c4912a4, j11, c4912a5, i12));
        }
    }
}
