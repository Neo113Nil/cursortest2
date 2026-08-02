package P0;

import B0.C2454a;
import P0.l2;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.functions.Function2;
import l1.C7807Z;
import m0.C7990g;
import m0.C8004n;
import n0.C8385f;
import n0.C8391l;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final O0 f20735a = new O0();

    /* renamed from: b, reason: collision with root package name */
    private static final float f20736b = 56;

    /* renamed from: c, reason: collision with root package name */
    private static final float f20737c = 280;

    /* renamed from: d, reason: collision with root package name */
    private static final float f20738d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final float f20739e = 2;

    public static float c() {
        return f20736b;
    }

    public static float d() {
        return f20737c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z11, boolean z12, @NotNull t0.o oVar, e.a aVar, k2 k2Var, l1.J0 j02, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e.a aVar2;
        int i13;
        float f12;
        float f13;
        e.a aVar3;
        float f14;
        float f15;
        float f16;
        float f17;
        m0.E e11;
        int i14;
        int i15;
        C3969l c3969l;
        int i16;
        S0.A1 l11;
        S0.A1 l12;
        C3969l c3969l2;
        float f18;
        e.a aVar4;
        float f19;
        S0.J0 m02;
        int i17;
        int i18;
        C3969l u11 = interfaceC3967k.u(1035477640);
        int i19 = (u11.p(z11) ? 4 : 2) | i11 | (u11.p(z12) ? 32 : 16) | (u11.n(oVar) ? 256 : 128);
        int i21 = i12 & 8;
        if (i21 != 0) {
            i19 |= 3072;
        } else if ((i11 & 3072) == 0) {
            aVar2 = aVar;
            i19 |= u11.n(aVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i13 = i19 | (!u11.n(k2Var) ? 16384 : 8192) | (!u11.n(j02) ? 131072 : 65536);
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    f12 = f7;
                    if (u11.q(f12)) {
                        i18 = 1048576;
                        i13 |= i18;
                    }
                } else {
                    f12 = f7;
                }
                i18 = 524288;
                i13 |= i18;
            } else {
                f12 = f7;
            }
            if ((12582912 & i11) != 0) {
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    f13 = f11;
                    if (u11.q(f13)) {
                        i17 = 8388608;
                        i13 |= i17;
                    }
                } else {
                    f13 = f11;
                }
                i17 = 4194304;
                i13 |= i17;
            } else {
                f13 = f11;
            }
            if ((38347923 & i13) == 38347922 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    aVar3 = i21 == 0 ? androidx.compose.ui.e.f40358c0 : aVar2;
                    if ((i12 & 64) == 0) {
                        i13 &= -3670017;
                        f14 = f20739e;
                    } else {
                        f14 = f12;
                    }
                    if ((128 & i12) != 0) {
                        i13 &= -29360129;
                        f15 = f20738d;
                        u11.j0();
                        boolean booleanValue = ((Boolean) t0.i.a(oVar, u11, (i13 >> 6) & 14).getValue()).booleanValue();
                        int i22 = Q0.A.f22745j;
                        long d11 = k2Var.d(z11, z12, booleanValue);
                        if (z11) {
                            f16 = f15;
                            u11.o(1023053998);
                            i14 = 6;
                            i15 = 0;
                            f17 = f14;
                            e11 = null;
                            i16 = 150;
                            l11 = l0.h0.a(d11, C8004n.d(150, 0, null, 6), null, u11, 48, 12);
                            c3969l = u11;
                            c3969l.k();
                        } else {
                            f16 = f15;
                            f17 = f14;
                            e11 = null;
                            i14 = 6;
                            i15 = 0;
                            c3969l = u11;
                            i16 = 150;
                            c3969l.o(1023165505);
                            l11 = S0.n1.l(C7807Z.m(d11), c3969l);
                            c3969l.k();
                        }
                        if (z11) {
                            c3969l.o(1023269417);
                            l12 = C7990g.a(booleanValue ? f17 : f16, C8004n.d(i16, i15, e11, i14), c3969l, 48, 12);
                            c3969l.k();
                        } else {
                            c3969l.o(1023478388);
                            l12 = S0.n1.l(Z1.h.a(f16), c3969l);
                            c3969l.k();
                        }
                        InterfaceC3978p0 l13 = S0.n1.l(new C8391l(new l1.K0(((C7807Z) l11.getValue()).w()), ((Z1.h) l12.getValue()).d()), c3969l);
                        C3969l c3969l3 = c3969l;
                        S0.A1 a11 = l0.h0.a(k2Var.a(z11, z12, booleanValue), C8004n.d(150, i15, e11, 6), null, c3969l3, 48, 12);
                        c3969l2 = c3969l3;
                        C8391l c8391l = (C8391l) l13.getValue();
                        C5185h.a(Q0.A.p(C8385f.d(aVar3, c8391l.c(), c8391l.b(), j02), new l2.a(new L0(a11, S0.A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0)), j02), c3969l2, i15);
                        f18 = f16;
                        aVar4 = aVar3;
                        f19 = f17;
                    }
                } else {
                    u11.j();
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                    }
                    if ((128 & i12) != 0) {
                        i13 &= -29360129;
                    }
                    aVar3 = aVar2;
                    f14 = f12;
                }
                f15 = f13;
                u11.j0();
                boolean booleanValue2 = ((Boolean) t0.i.a(oVar, u11, (i13 >> 6) & 14).getValue()).booleanValue();
                int i222 = Q0.A.f22745j;
                long d112 = k2Var.d(z11, z12, booleanValue2);
                if (z11) {
                }
                if (z11) {
                }
                InterfaceC3978p0 l132 = S0.n1.l(new C8391l(new l1.K0(((C7807Z) l11.getValue()).w()), ((Z1.h) l12.getValue()).d()), c3969l);
                C3969l c3969l32 = c3969l;
                S0.A1 a112 = l0.h0.a(k2Var.a(z11, z12, booleanValue2), C8004n.d(150, i15, e11, 6), null, c3969l32, 48, 12);
                c3969l2 = c3969l32;
                C8391l c8391l2 = (C8391l) l132.getValue();
                C5185h.a(Q0.A.p(C8385f.d(aVar3, c8391l2.c(), c8391l2.b(), j02), new l2.a(new L0(a112, S0.A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0)), j02), c3969l2, i15);
                f18 = f16;
                aVar4 = aVar3;
                f19 = f17;
            } else {
                u11.j();
                aVar4 = aVar2;
                f19 = f12;
                f18 = f13;
                c3969l2 = u11;
            }
            m02 = c3969l2.m0();
            if (m02 == null) {
                m02.G(new M0(this, z11, z12, oVar, aVar4, k2Var, j02, f19, f18, i11, i12));
                return;
            }
            return;
        }
        aVar2 = aVar;
        i13 = i19 | (!u11.n(k2Var) ? 16384 : 8192) | (!u11.n(j02) ? 131072 : 65536);
        if ((1572864 & i11) != 0) {
        }
        if ((12582912 & i11) != 0) {
        }
        if ((38347923 & i13) == 38347922) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i21 == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((128 & i12) != 0) {
        }
        f15 = f13;
        u11.j0();
        boolean booleanValue22 = ((Boolean) t0.i.a(oVar, u11, (i13 >> 6) & 14).getValue()).booleanValue();
        int i2222 = Q0.A.f22745j;
        long d1122 = k2Var.d(z11, z12, booleanValue22);
        if (z11) {
        }
        if (z11) {
        }
        InterfaceC3978p0 l1322 = S0.n1.l(new C8391l(new l1.K0(((C7807Z) l11.getValue()).w()), ((Z1.h) l12.getValue()).d()), c3969l);
        C3969l c3969l322 = c3969l;
        S0.A1 a1122 = l0.h0.a(k2Var.a(z11, z12, booleanValue22), C8004n.d(150, i15, e11, 6), null, c3969l322, 48, 12);
        c3969l2 = c3969l322;
        C8391l c8391l22 = (C8391l) l1322.getValue();
        C5185h.a(Q0.A.p(C8385f.d(aVar3, c8391l22.c(), c8391l22.b(), j02), new l2.a(new L0(a1122, S0.A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0)), j02), c3969l2, i15);
        f18 = f16;
        aVar4 = aVar3;
        f19 = f17;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    public final void b(@NotNull String str, @NotNull Function2 function2, boolean z11, @NotNull C2454a c2454a, @NotNull t0.o oVar, boolean z12, C4912a c4912a, C4912a c4912a2, k2 k2Var, C9915y c9915y, C4912a c4912a3, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function2 function22;
        boolean z13;
        C2454a c2454a2;
        C3969l c3969l;
        int i13;
        C9915y c9915y2;
        C9915y c9915y3;
        C3969l u11 = interfaceC3967k.u(-350442135);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function22 = function2;
            i12 |= u11.F(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        if ((i11 & 384) == 0) {
            z13 = z11;
            i12 |= u11.p(z13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            z13 = z11;
        }
        int i14 = i11 & 3072;
        int i15 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i14 == 0) {
            i12 |= u11.p(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            c2454a2 = c2454a;
            i12 |= u11.n(c2454a2) ? 16384 : 8192;
        } else {
            c2454a2 = c2454a;
        }
        if ((i11 & 196608) == 0) {
            i12 |= u11.n(oVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.p(z12) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.F(c4912a) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= u11.F(null) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= u11.F(null) ? 536870912 : 268435456;
        }
        int i16 = 14155776 | (u11.F(c4912a2) ? 4 : 2) | (u11.F(null) ? 32 : 16) | (u11.F(null) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if (u11.F(null)) {
            i15 = 2048;
        }
        int i17 = i16 | i15 | (u11.n(k2Var) ? 16384 : 8192) | 65536;
        if ((306783379 & i12) == 306783378 && (4793491 & i17) == 4793490 && u11.b()) {
            u11.j();
            c9915y3 = c9915y;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                c3969l = u11;
                i13 = i17 & (-458753);
                c9915y2 = new C9915y(Q0.A.m(), Q0.A.m(), Q0.A.m(), Q0.A.m());
            } else {
                u11.j();
                i13 = i17 & (-458753);
                c9915y2 = c9915y;
                c3969l = u11;
            }
            c3969l.j0();
            int i18 = i12 << 3;
            int i19 = i12 >> 3;
            int i21 = i12 >> 9;
            int i22 = i13 << 21;
            Q0.A.a(Q0.C.Outlined, str, function22, c2454a2, c4912a, c4912a2, z13, z12, oVar, c9915y2, k2Var, c4912a3, c3969l, (i18 & 896) | (i18 & 112) | 6 | (i19 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | (i22 & 1879048192), ((i13 >> 9) & 14) | ((i12 >> 6) & 112) | (i12 & 896) | (i21 & 7168) | (i19 & 57344) | ((i13 << 6) & 3670016) | 12582912);
            c9915y3 = c9915y2;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new N0(this, str, function2, z11, c2454a, oVar, z12, c4912a, c4912a2, k2Var, c9915y3, c4912a3, i11));
        }
    }
}
