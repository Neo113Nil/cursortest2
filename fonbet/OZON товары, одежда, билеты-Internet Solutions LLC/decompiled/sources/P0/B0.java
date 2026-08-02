package P0;

import Bl0.C2656q;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.ui.e;
import b1.C5503f;
import b1.C5516s;
import b1.C5517t;
import bc.C5637m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import k1.C7464j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l1.C7807Z;
import l1.InterfaceC7825i0;
import m0.C7980b;
import m0.C7984d;
import m0.C7990g;
import n0.C8392m;
import org.jetbrains.annotations.NotNull;
import r0.C9135o;
import r0.EnumC9142v;
import ru.ozon.app.android.R;
import w1.InterfaceC10406a;

/* loaded from: classes8.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f20596a = 48;

    /* renamed from: b, reason: collision with root package name */
    private static final float f20597b = 24;

    /* renamed from: c, reason: collision with root package name */
    private static final long f20598c = C5637m.a(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Function0 function0, androidx.compose.ui.e eVar, C3787x1 c3787x1, float f7, l1.J0 j02, long j11, long j12, float f11, long j13, C4912a c4912a, Function2 function2, C0 c02, @NotNull C4912a c4912a2, InterfaceC3967k interfaceC3967k, int i11) {
        long j14;
        long o11;
        int i12;
        Function2 function22;
        float f12;
        C0 a11;
        long j15;
        float f13;
        l1.J0 j03;
        Function0 function02;
        boolean z11;
        boolean z12;
        Object C11;
        Object C12;
        long j16;
        boolean z13;
        boolean F11;
        Object C13;
        C3787x1 c3787x12;
        C3969l c3969l;
        l1.J0 j04;
        Function2 function23;
        C0 c03;
        float f14;
        long j17;
        long j18;
        float f15;
        C3969l u11 = interfaceC3967k.u(2132719801);
        int i13 = i11 | (u11.F(function0) ? 4 : 2) | (u11.n(c3787x1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | 46672896;
        if ((306783379 & i13) == 306783378 && u11.b()) {
            u11.j();
            f14 = f7;
            j04 = j02;
            j18 = j12;
            f15 = f11;
            j17 = j13;
            function23 = function2;
            c03 = c02;
            c3969l = u11;
            c3787x12 = c3787x1;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                int i14 = C3717a.f20956b;
                float a12 = C3717a.a();
                l1.J0 b11 = C3764p1.b(R0.n.a(), u11);
                j14 = j11;
                long b12 = C3759o.b(j14, u11);
                o11 = C7807Z.o(0.32f, C3759o.e(R0.k.a(), u11));
                i12 = i13 & (-238608385);
                function22 = Q.f20762b;
                f12 = 0;
                a11 = M.a();
                j15 = b12;
                f13 = a12;
                j03 = b11;
            } else {
                u11.j();
                i12 = i13 & (-238608385);
                f13 = f7;
                j03 = j02;
                j14 = j11;
                j15 = j12;
                f12 = f11;
                o11 = j13;
                function22 = function2;
                a11 = c02;
            }
            u11.j0();
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a13 = ((S0.D) C14).a();
            int i15 = (i12 & 896) ^ 384;
            int i16 = i12 & 14;
            C0 c04 = a11;
            boolean F12 = (i16 == 4) | ((i15 > 256 && u11.n(c3787x1)) || (i12 & 384) == 256) | u11.F(a13);
            Object C15 = u11.C();
            if (F12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C3727d0(c3787x1, function0, a13);
                u11.x(C15);
            }
            Function0 function03 = (Function0) C15;
            boolean F13 = u11.F(a13);
            if (i15 <= 256 || !u11.n(c3787x1)) {
                function02 = function03;
                if ((i12 & 384) != 256) {
                    z11 = false;
                    z12 = F13 | z11 | (i16 != 4);
                    C11 = u11.C();
                    if (!z12 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new C3736g0(c3787x1, function0, a13);
                        u11.x(C11);
                    }
                    Function1 function1 = (Function1) C11;
                    C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = C7984d.a(0.0f);
                        u11.x(C12);
                    }
                    C7980b c7980b = (C7980b) C12;
                    if (i15 > 256 || !u11.n(c3787x1)) {
                        j16 = o11;
                        if ((i12 & 384) != 256) {
                            z13 = false;
                            F11 = (i16 == 4) | z13 | u11.F(a13) | u11.F(c7980b);
                            C13 = u11.C();
                            if (!F11 || C13 == InterfaceC3967k.a.a()) {
                                C13 = new W(c3787x1, a13, c7980b, function0);
                                u11.x(C13);
                            }
                            int i17 = i12;
                            long j19 = j16;
                            c3787x12 = c3787x1;
                            c3969l = u11;
                            K0.a((Function0) C13, c04, c7980b, a1.c.c(-314673510, new Y(j19, function02, c3787x1, c7980b, a13, function1, eVar, f13, j03, j14, j15, f12, c4912a, function22, c4912a2), u11), c3969l, 3632);
                            if (c3787x12.e()) {
                                boolean z14 = (i15 > 256 && c3969l.n(c3787x12)) || (i17 & 384) == 256;
                                Object C16 = c3969l.C();
                                if (z14 || C16 == InterfaceC3967k.a.a()) {
                                    C16 = new Z(c3787x12, null);
                                    c3969l.x(C16);
                                }
                                S0.Q.e(c3969l, c3787x12, (Function2) C16);
                            }
                            j04 = j03;
                            function23 = function22;
                            long j21 = j15;
                            c03 = c04;
                            f14 = f13;
                            j17 = j19;
                            j18 = j21;
                            f15 = f12;
                        }
                    } else {
                        j16 = o11;
                    }
                    z13 = true;
                    F11 = (i16 == 4) | z13 | u11.F(a13) | u11.F(c7980b);
                    C13 = u11.C();
                    if (!F11) {
                    }
                    C13 = new W(c3787x1, a13, c7980b, function0);
                    u11.x(C13);
                    int i172 = i12;
                    long j192 = j16;
                    c3787x12 = c3787x1;
                    c3969l = u11;
                    K0.a((Function0) C13, c04, c7980b, a1.c.c(-314673510, new Y(j192, function02, c3787x1, c7980b, a13, function1, eVar, f13, j03, j14, j15, f12, c4912a, function22, c4912a2), u11), c3969l, 3632);
                    if (c3787x12.e()) {
                    }
                    j04 = j03;
                    function23 = function22;
                    long j212 = j15;
                    c03 = c04;
                    f14 = f13;
                    j17 = j192;
                    j18 = j212;
                    f15 = f12;
                }
            } else {
                function02 = function03;
            }
            z11 = true;
            z12 = F13 | z11 | (i16 != 4);
            C11 = u11.C();
            if (!z12) {
            }
            C11 = new C3736g0(c3787x1, function0, a13);
            u11.x(C11);
            Function1 function12 = (Function1) C11;
            C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
            }
            C7980b c7980b2 = (C7980b) C12;
            if (i15 > 256) {
            }
            j16 = o11;
            if ((i12 & 384) != 256) {
            }
            z13 = true;
            F11 = (i16 == 4) | z13 | u11.F(a13) | u11.F(c7980b2);
            C13 = u11.C();
            if (!F11) {
            }
            C13 = new W(c3787x1, a13, c7980b2, function0);
            u11.x(C13);
            int i1722 = i12;
            long j1922 = j16;
            c3787x12 = c3787x1;
            c3969l = u11;
            K0.a((Function0) C13, c04, c7980b2, a1.c.c(-314673510, new Y(j1922, function02, c3787x1, c7980b2, a13, function12, eVar, f13, j03, j14, j15, f12, c4912a, function22, c4912a2), u11), c3969l, 3632);
            if (c3787x12.e()) {
            }
            j04 = j03;
            function23 = function22;
            long j2122 = j15;
            c03 = c04;
            f14 = f13;
            j17 = j1922;
            j18 = j2122;
            f15 = f12;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3718a0(function0, eVar, c3787x12, f14, j04, j11, j18, f15, j17, c4912a, function23, c03, c4912a2, i11));
        }
    }

    public static final void b(@NotNull C7980b c7980b, @NotNull xe.M m11, @NotNull Function0 function0, @NotNull Function1 function1, androidx.compose.ui.e eVar, C3787x1 c3787x1, float f7, l1.J0 j02, long j11, long j12, float f11, C4912a c4912a, Function2 function2, @NotNull C4912a c4912a2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        C5187j c5187j = C5187j.f39515a;
        C3969l u11 = interfaceC3967k.u(-1676960531);
        int i12 = i11 | (u11.F(c7980b) ? 32 : 16) | (u11.F(m11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        boolean F11 = u11.F(function0);
        int i13 = UserVerificationMethods.USER_VERIFY_ALL;
        int i14 = i12 | (F11 ? 2048 : 1024) | (u11.F(function1) ? 16384 : 8192) | (u11.n(eVar) ? 131072 : 65536) | (u11.n(c3787x1) ? 1048576 : 524288) | (u11.q(f7) ? 8388608 : 4194304) | (u11.n(j02) ? 67108864 : 33554432) | (u11.s(j11) ? 536870912 : 268435456);
        int i15 = (u11.s(j12) ? 4 : 2) | (u11.q(f11) ? 32 : 16) | (u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if (u11.F(function2)) {
            i13 = 2048;
        }
        int i16 = i15 | i13 | (u11.F(c4912a2) ? 16384 : 8192);
        if ((i14 & 306783379) == 306783378 && (i16 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            String a11 = Q0.j.a(u11, R.string.m3c_bottom_sheet_pane_title);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(androidx.compose.foundation.layout.a0.t(c5187j.a(eVar, InterfaceC6250b.a.m()), 0.0f, f7, 1), 1.0f);
            int i17 = (i14 & 3670016) ^ 1572864;
            boolean z11 = (i17 > 1048576 && u11.n(c3787x1)) || (i14 & 1572864) == 1048576;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                EnumC9142v enumC9142v = EnumC9142v.Vertical;
                int i18 = C3772s1.f21351b;
                C11 = new C3767q1(c3787x1, function1, enumC9142v);
                u11.x(C11);
            }
            androidx.compose.ui.e a12 = androidx.compose.ui.input.nestedscroll.a.a(e11, (InterfaceC10406a) C11, null);
            androidx.compose.material3.internal.p<EnumC3790y1> c11 = c3787x1.c();
            EnumC9142v enumC9142v2 = EnumC9142v.Vertical;
            boolean z12 = (i17 > 1048576 && u11.n(c3787x1)) || (i14 & 1572864) == 1048576;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C3739h0(c3787x1);
                u11.x(C12);
            }
            androidx.compose.ui.e d11 = androidx.compose.material3.internal.e.d(a12, c11, enumC9142v2, (Function2) C12);
            androidx.compose.material3.internal.l q11 = c3787x1.c().q();
            boolean j13 = c3787x1.j();
            boolean u12 = c3787x1.c().u();
            boolean z13 = (i14 & 57344) == 16384;
            Object C13 = u11.C();
            if (z13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C3745j0(function1, null);
                u11.x(C13);
            }
            androidx.compose.ui.e c12 = C9135o.c(d11, q11, enumC9142v2, j13, null, u12, (InterfaceC6511n) C13, false, 168);
            boolean n11 = u11.n(a11);
            Object C14 = u11.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new C3748k0(a11);
                u11.x(C14);
            }
            androidx.compose.ui.e c13 = I1.o.c(c12, false, (Function1) C14);
            boolean z14 = ((i14 & 112) == 32 || u11.F(c7980b)) | ((i17 > 1048576 && u11.n(c3787x1)) || (i14 & 1572864) == 1048576);
            Object C15 = u11.C();
            if (z14 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C3751l0(c3787x1, c7980b);
                u11.x(C15);
            }
            int i19 = i14 >> 21;
            int i21 = i16 << 9;
            c3969l = u11;
            e2.a(androidx.compose.ui.graphics.a.a(c13, (Function1) C15), j02, j11, j12, f11, 0.0f, a1.c.c(-692668920, new C3774t0(function2, c7980b, c4912a, c3787x1, function0, m11, c4912a2), u11), c3969l, (i19 & 896) | (i19 & 112) | 12582912 | (i21 & 7168) | (i21 & 57344), 96);
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3777u0(c7980b, m11, function0, function1, eVar, c3787x1, f7, j02, j11, j12, f11, c4912a, function2, c4912a2, i11));
        }
    }

    public static final void c(long j11, Function0 function0, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar;
        C3969l u11 = interfaceC3967k.u(951870469);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else if (j11 != 16) {
            S0.A1 b11 = C7990g.b(z11 ? 1.0f : 0.0f, new m0.T0(0, (m0.E) null, 7), null, u11, 48, 28);
            String a11 = Q0.j.a(u11, R.string.close_sheet);
            u11.o(-1785653838);
            if (z11) {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                int i13 = i12 & 112;
                boolean z12 = i13 == 32;
                Object C11 = u11.C();
                if (z12 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C3786x0(function0, null);
                    u11.x(C11);
                }
                androidx.compose.ui.e b12 = x1.L.b(aVar, function0, (Function2) C11);
                boolean n11 = (i13 == 32) | u11.n(a11);
                Object C12 = u11.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C3792z0(a11, function0);
                    u11.x(C12);
                }
                eVar = I1.o.c(b12, true, (Function1) C12);
            } else {
                eVar = androidx.compose.ui.e.f40358c0;
            }
            u11.k();
            androidx.compose.ui.e l02 = androidx.compose.foundation.layout.a0.d(androidx.compose.ui.e.f40358c0).l0(eVar);
            boolean n12 = u11.n(b11) | ((i12 & 14) == 4);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C3780v0(j11, b11);
                u11.x(C13);
            }
            C8392m.a(l02, (Function1) C13, u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3783w0(j11, function0, z11, i11));
        }
    }

    public static final float d(InterfaceC7825i0 interfaceC7825i0, float f7) {
        float f11 = C7464j.f(interfaceC7825i0.i());
        if (Float.isNaN(f11) || f11 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (C2656q.b(0.0f, Math.min(interfaceC7825i0.v1(f20596a), f11), f7) / f11);
    }

    public static final float e(InterfaceC7825i0 interfaceC7825i0, float f7) {
        float d11 = C7464j.d(interfaceC7825i0.i());
        if (Float.isNaN(d11) || d11 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (C2656q.b(0.0f, Math.min(interfaceC7825i0.v1(f20597b), d11), f7) / d11);
    }

    @NotNull
    public static final C3787x1 g(Function1 function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        boolean z11 = true;
        boolean z12 = (i12 & 1) == 0;
        if ((i12 & 2) != 0) {
            function1 = A0.f20591b;
        }
        EnumC3790y1 enumC3790y1 = EnumC3790y1.Hidden;
        int i13 = (i11 & 112) | (i11 & 14) | 384;
        int i14 = C3772s1.f21351b;
        Z1.d dVar = (Z1.d) interfaceC3967k.m(androidx.compose.ui.platform.K0.e());
        Object[] objArr = {Boolean.valueOf(z12), function1, Boolean.FALSE};
        C5517t a11 = C5516s.a(C3775t1.f21362b, new C3778u1(z12, dVar, function1));
        boolean n11 = ((((i13 & 14) ^ 6) > 4 && interfaceC3967k.p(z12)) || (i13 & 6) == 4) | interfaceC3967k.n(dVar);
        if ((((i13 & 112) ^ 48) <= 32 || !interfaceC3967k.n(function1)) && (i13 & 48) != 32) {
            z11 = false;
        }
        boolean p11 = n11 | z11 | interfaceC3967k.p(false);
        Object C11 = interfaceC3967k.C();
        if (p11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3769r1(z12, dVar, enumC3790y1, function1);
            interfaceC3967k.x(C11);
        }
        return (C3787x1) C5503f.c(objArr, a11, (Function0) C11, interfaceC3967k, 0, 4);
    }
}
