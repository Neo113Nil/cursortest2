package Q0;

import B0.C2454a;
import B1.E;
import B1.InterfaceC2552v;
import B1.m0;
import I1.D;
import K1.C3422b;
import K1.T;
import P0.C3776u;
import P0.k2;
import P0.n2;
import P0.u2;
import P0.v2;
import Q1.W;
import S0.C3969l;
import S0.C3996z;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6987g;
import i1.C6992l;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l0.M;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import l1.J0;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import m1.AbstractC8032c;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
public final class A {

    /* renamed from: b, reason: collision with root package name */
    private static final float f22737b;

    /* renamed from: g, reason: collision with root package name */
    private static final float f22742g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f22743h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f22744i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f22745j = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final long f22736a = Z1.c.a(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    private static final float f22738c = 12;

    /* renamed from: d, reason: collision with root package name */
    private static final float f22739d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final float f22740e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final float f22741f = 24;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22746a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22747b;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22746a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f22747b = iArr2;
        }
    }

    static final class b extends AbstractC7737t implements Function1<D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f22748b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(D d11) {
            int i11 = I1.z.f11793b;
            d11.b(I1.u.f(), this.f22748b);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<C6987g, C6992l> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J0 f22749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7813c0 f22750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(J0 j02, InterfaceC7813c0 interfaceC7813c0) {
            super(1);
            this.f22749b = j02;
            this.f22750c = interfaceC7813c0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C6992l invoke(C6987g c6987g) {
            C6987g c6987g2 = c6987g;
            return c6987g2.s(new B(this.f22749b.mo1createOutlinePq9zytI(c6987g2.i(), c6987g2.getLayoutDirection(), c6987g2), this.f22750c));
        }
    }

    static {
        float f7 = 16;
        f22737b = f7;
        f22742g = f7;
        f22743h = f7;
        float f11 = 48;
        f22744i = a0.a(androidx.compose.ui.e.f40358c0, f11, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x023c, code lost:
    
        if (l1.C7807Z.p(r6, r8) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x025a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03e3, code lost:
    
        if (r36 != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0366, code lost:
    
        if (r36 != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0336, code lost:
    
        if (r36 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0258, code lost:
    
        if (l1.C7807Z.p(r6, r8) != false) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0420  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull C c11, @NotNull String str, @NotNull Function2 function2, @NotNull C2454a c2454a, C4912a c4912a, C4912a c4912a2, boolean z11, boolean z12, @NotNull t0.o oVar, @NotNull C9915y c9915y, @NotNull k2 k2Var, @NotNull C4912a c4912a3, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        long j11;
        long j12;
        long j13;
        float f7;
        int i15;
        float f11;
        int i16;
        float f12;
        int i17;
        float f13;
        int i18;
        float f14;
        int i19;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        C3969l c3969l;
        boolean z13;
        float f15;
        C4912a c12;
        Object C13;
        Object C14;
        int i21;
        C3969l c3969l2;
        long j14;
        C4912a c4912a4 = c4912a3;
        C3969l u11 = interfaceC3967k.u(1514469103);
        if ((i11 & 6) == 0) {
            i13 = i11 | (u11.n(c11) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        int i22 = i11 & 384;
        int i23 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i22 == 0) {
            i13 |= u11.F(function2) ? 256 : 128;
        }
        int i24 = i11 & 3072;
        int i25 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i24 == 0) {
            i13 |= u11.n(c2454a) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.F(c4912a) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= u11.F(null) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.F(null) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.F(c4912a2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.F(null) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.F(null) ? 536870912 : 268435456;
        }
        int i26 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.F(null) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.p(false) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.p(z11)) {
                i23 = 256;
            }
            i14 |= i23;
        }
        if ((i12 & 3072) == 0) {
            if (u11.p(z12)) {
                i25 = 2048;
            }
            i14 |= i25;
        }
        if ((i12 & 24576) == 0) {
            i14 |= u11.n(oVar) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= u11.n(c9915y) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= u11.n(k2Var) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= u11.F(c4912a4) ? 8388608 : 4194304;
        }
        int i27 = i14;
        if ((306783379 & i26) == 306783378 && (i27 & 4793491) == 4793490 && u11.b()) {
            u11.j();
            c3969l2 = u11;
        } else {
            boolean z14 = ((i26 & 112) == 32) | ((i26 & 7168) == 2048);
            Object C15 = u11.C();
            if (z14 || C15 == InterfaceC3967k.a.a()) {
                C15 = c2454a.filter(new C3422b(6, str, null));
                u11.x(C15);
            }
            String h11 = ((W) C15).b().h();
            boolean booleanValue = ((Boolean) t0.i.a(oVar, u11, (i27 >> 12) & 14).getValue()).booleanValue();
            f fVar = booleanValue ? f.Focused : h11.length() == 0 ? f.UnfocusedEmpty : f.UnfocusedNotEmpty;
            long e11 = k2Var.e(z11, z12, booleanValue);
            u2 u2Var = (u2) u11.m(v2.a());
            T a11 = u2Var.a();
            T c13 = u2Var.c();
            long f16 = a11.f();
            int i28 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
            if (C7807Z.p(f16, j11)) {
                long f17 = c13.f();
                j14 = C7807Z.f72259m;
            }
            long f18 = a11.f();
            j12 = C7807Z.f72259m;
            if (!C7807Z.p(f18, j12)) {
                long f19 = c13.f();
                j13 = C7807Z.f72259m;
            }
            boolean z15 = false;
            long f21 = c13.f();
            if (z15 && f21 == 16) {
                f21 = e11;
            }
            long f22 = a11.f();
            long j15 = (z15 && f22 == 16) ? e11 : f22;
            boolean z16 = c4912a != null;
            D0 g10 = H0.g(fVar, "TextFieldInputState", u11, 48);
            U0 b11 = W0.b();
            f fVar2 = (f) g10.h();
            u11.o(-2036730335);
            int[] iArr = a.f22747b;
            int i29 = iArr[fVar2.ordinal()];
            float f23 = 0.0f;
            if (i29 != 1) {
                if (i29 == 2) {
                    f7 = 0.0f;
                    u11.k();
                    Float valueOf = Float.valueOf(f7);
                    f fVar3 = (f) g10.n();
                    u11.o(-2036730335);
                    i15 = iArr[fVar3.ordinal()];
                    if (i15 != 1) {
                        if (i15 == 2) {
                            f11 = 0.0f;
                            u11.k();
                            D0.d d11 = H0.d(g10, valueOf, Float.valueOf(f11), w.f22804b.invoke(g10.m(), u11, 0), b11, u11, 196608);
                            U0 b12 = W0.b();
                            f fVar4 = (f) g10.h();
                            u11.o(1435837472);
                            i16 = iArr[fVar4.ordinal()];
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 != 3) {
                                        throw new Sc.o();
                                    }
                                }
                                f12 = 0.0f;
                                u11.k();
                                Float valueOf2 = Float.valueOf(f12);
                                f fVar5 = (f) g10.n();
                                u11.o(1435837472);
                                i17 = iArr[fVar5.ordinal()];
                                if (i17 != 1) {
                                    if (i17 != 2) {
                                        if (i17 != 3) {
                                            throw new Sc.o();
                                        }
                                    }
                                    f13 = 0.0f;
                                    u11.k();
                                    D0.d d12 = H0.d(g10, valueOf2, Float.valueOf(f13), y.f22806b.invoke(g10.m(), u11, 0), b12, u11, 196608);
                                    U0 b13 = W0.b();
                                    f fVar6 = (f) g10.h();
                                    u11.o(1128033978);
                                    i18 = iArr[fVar6.ordinal()];
                                    if (i18 != 1) {
                                        if (i18 != 2) {
                                            if (i18 != 3) {
                                                throw new Sc.o();
                                            }
                                        } else if (z16) {
                                            f14 = 0.0f;
                                            u11.k();
                                            Float valueOf3 = Float.valueOf(f14);
                                            f fVar7 = (f) g10.n();
                                            u11.o(1128033978);
                                            i19 = iArr[fVar7.ordinal()];
                                            if (i19 != 1) {
                                                if (i19 != 2) {
                                                    if (i19 != 3) {
                                                        throw new Sc.o();
                                                    }
                                                }
                                            }
                                            f23 = 1.0f;
                                            u11.k();
                                            long j16 = f21;
                                            D0.d d13 = H0.d(g10, valueOf3, Float.valueOf(f23), z.f22807b.invoke(g10.m(), u11, 0), b13, u11, 196608);
                                            f fVar8 = (f) g10.n();
                                            u11.o(-107432127);
                                            long j17 = iArr[fVar8.ordinal()] != 1 ? j16 : j15;
                                            u11.k();
                                            AbstractC8032c s11 = C7807Z.s(j17);
                                            n11 = u11.n(s11);
                                            C11 = u11.C();
                                            if (!n11 || C11 == InterfaceC3967k.a.a()) {
                                                C11 = (U0) M.a().invoke(s11);
                                                u11.x(C11);
                                            }
                                            U0 u02 = (U0) C11;
                                            f fVar9 = (f) g10.h();
                                            u11.o(-107432127);
                                            long j18 = iArr[fVar9.ordinal()] != 1 ? j16 : j15;
                                            u11.k();
                                            C7807Z m11 = C7807Z.m(j18);
                                            f fVar10 = (f) g10.n();
                                            u11.o(-107432127);
                                            long j19 = iArr[fVar10.ordinal()] != 1 ? j16 : j15;
                                            u11.k();
                                            D0.d d14 = H0.d(g10, m11, C7807Z.m(j19), x.f22805b.invoke(g10.m(), u11, 0), u02, u11, 196608);
                                            u11.o(1023351670);
                                            u11.k();
                                            AbstractC8032c s12 = C7807Z.s(e11);
                                            n12 = u11.n(s12);
                                            C12 = u11.C();
                                            if (!n12 || C12 == InterfaceC3967k.a.a()) {
                                                C12 = (U0) M.a().invoke(s12);
                                                u11.x(C12);
                                            }
                                            u11.o(1023351670);
                                            u11.k();
                                            C7807Z m12 = C7807Z.m(e11);
                                            u11.o(1023351670);
                                            u11.k();
                                            D0.d d15 = H0.d(g10, m12, C7807Z.m(e11), v.f22803b.invoke(g10.m(), u11, 0), (U0) C12, u11, 196608);
                                            float floatValue = ((Number) d11.getValue()).floatValue();
                                            u11.o(-156998101);
                                            if (c4912a != null) {
                                                c3969l = u11;
                                                z13 = booleanValue;
                                                c12 = null;
                                                f15 = floatValue;
                                            } else {
                                                c3969l = u11;
                                                z13 = booleanValue;
                                                f15 = floatValue;
                                                c12 = a1.c.c(-1236585568, new o(a11, c13, f15, d15, c4912a, z15, d14), c3969l);
                                            }
                                            c3969l.k();
                                            C13 = c3969l.C();
                                            if (C13 == InterfaceC3967k.a.a()) {
                                                C13 = n1.d(n1.n(), new q(d12));
                                                c3969l.x(C13);
                                            }
                                            c3969l.o(-156965270);
                                            c3969l.k();
                                            C14 = c3969l.C();
                                            if (C14 == InterfaceC3967k.a.a()) {
                                                C14 = n1.d(n1.n(), new r(d13));
                                                c3969l.x(C14);
                                            }
                                            c3969l.o(-156940524);
                                            c3969l.k();
                                            c3969l.o(-156921964);
                                            c3969l.k();
                                            c3969l.o(-156902962);
                                            c3969l.k();
                                            long g11 = k2Var.g(z11, z12, z13);
                                            c3969l.o(-156893937);
                                            C4912a c14 = c4912a2 != null ? null : a1.c.c(2079816678, new p(g11, c4912a2), c3969l);
                                            c3969l.k();
                                            c3969l.o(-156884470);
                                            c3969l.k();
                                            i21 = a.f22746a[c11.ordinal()];
                                            if (i21 != 1) {
                                                c4912a4 = c4912a3;
                                                C3969l c3969l3 = c3969l;
                                                c3969l3.o(-568105095);
                                                n2.a(androidx.compose.ui.e.f40358c0, function2, c12, null, null, c14, null, null, f15, a1.c.c(1750327932, new n(c4912a4), c3969l3), null, c9915y, c3969l3, ((i26 >> 3) & 112) | 6 | (234881024 & (i27 << 21)), ((i27 >> 9) & 896) | 6);
                                                c3969l2 = c3969l3;
                                                c3969l2.k();
                                                Unit unit = Unit.f71690a;
                                            } else if (i21 != 2) {
                                                c3969l.o(-565271199);
                                                c3969l.k();
                                                Unit unit2 = Unit.f71690a;
                                                c4912a4 = c4912a3;
                                                c3969l2 = c3969l;
                                            } else {
                                                c3969l.o(-567018607);
                                                Object C16 = c3969l.C();
                                                if (C16 == InterfaceC3967k.a.a()) {
                                                    C16 = n1.f(C7464j.a(0L), D1.f25195a);
                                                    c3969l.x(C16);
                                                }
                                                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C16;
                                                c4912a4 = c4912a3;
                                                C4912a c15 = a1.c.c(157291737, new m(interfaceC3978p0, c9915y, c4912a4), c3969l);
                                                e.a aVar = androidx.compose.ui.e.f40358c0;
                                                boolean q11 = c3969l.q(f15);
                                                Object C17 = c3969l.C();
                                                if (q11 || C17 == InterfaceC3967k.a.a()) {
                                                    C17 = new k(interfaceC3978p0, f15);
                                                    c3969l.x(C17);
                                                }
                                                C3969l c3969l4 = c3969l;
                                                P0.W0.b(aVar, function2, null, c12, null, c14, null, null, f15, (Function1) C17, c15, null, c9915y, c3969l4, ((i26 >> 3) & 112) | 6 | ((i27 << 21) & 234881024), ((i27 >> 6) & 7168) | 48);
                                                c3969l4.k();
                                                Unit unit3 = Unit.f71690a;
                                                c3969l2 = c3969l4;
                                            }
                                        }
                                    }
                                    f14 = 1.0f;
                                    u11.k();
                                    Float valueOf32 = Float.valueOf(f14);
                                    f fVar72 = (f) g10.n();
                                    u11.o(1128033978);
                                    i19 = iArr[fVar72.ordinal()];
                                    if (i19 != 1) {
                                    }
                                    f23 = 1.0f;
                                    u11.k();
                                    long j162 = f21;
                                    D0.d d132 = H0.d(g10, valueOf32, Float.valueOf(f23), z.f22807b.invoke(g10.m(), u11, 0), b13, u11, 196608);
                                    f fVar82 = (f) g10.n();
                                    u11.o(-107432127);
                                    if (iArr[fVar82.ordinal()] != 1) {
                                    }
                                    u11.k();
                                    AbstractC8032c s112 = C7807Z.s(j17);
                                    n11 = u11.n(s112);
                                    C11 = u11.C();
                                    if (!n11) {
                                    }
                                    C11 = (U0) M.a().invoke(s112);
                                    u11.x(C11);
                                    U0 u022 = (U0) C11;
                                    f fVar92 = (f) g10.h();
                                    u11.o(-107432127);
                                    if (iArr[fVar92.ordinal()] != 1) {
                                    }
                                    u11.k();
                                    C7807Z m112 = C7807Z.m(j18);
                                    f fVar102 = (f) g10.n();
                                    u11.o(-107432127);
                                    if (iArr[fVar102.ordinal()] != 1) {
                                    }
                                    u11.k();
                                    D0.d d142 = H0.d(g10, m112, C7807Z.m(j19), x.f22805b.invoke(g10.m(), u11, 0), u022, u11, 196608);
                                    u11.o(1023351670);
                                    u11.k();
                                    AbstractC8032c s122 = C7807Z.s(e11);
                                    n12 = u11.n(s122);
                                    C12 = u11.C();
                                    if (!n12) {
                                    }
                                    C12 = (U0) M.a().invoke(s122);
                                    u11.x(C12);
                                    u11.o(1023351670);
                                    u11.k();
                                    C7807Z m122 = C7807Z.m(e11);
                                    u11.o(1023351670);
                                    u11.k();
                                    D0.d d152 = H0.d(g10, m122, C7807Z.m(e11), v.f22803b.invoke(g10.m(), u11, 0), (U0) C12, u11, 196608);
                                    float floatValue2 = ((Number) d11.getValue()).floatValue();
                                    u11.o(-156998101);
                                    if (c4912a != null) {
                                    }
                                    c3969l.k();
                                    C13 = c3969l.C();
                                    if (C13 == InterfaceC3967k.a.a()) {
                                    }
                                    c3969l.o(-156965270);
                                    c3969l.k();
                                    C14 = c3969l.C();
                                    if (C14 == InterfaceC3967k.a.a()) {
                                    }
                                    c3969l.o(-156940524);
                                    c3969l.k();
                                    c3969l.o(-156921964);
                                    c3969l.k();
                                    c3969l.o(-156902962);
                                    c3969l.k();
                                    long g112 = k2Var.g(z11, z12, z13);
                                    c3969l.o(-156893937);
                                    if (c4912a2 != null) {
                                    }
                                    c3969l.k();
                                    c3969l.o(-156884470);
                                    c3969l.k();
                                    i21 = a.f22746a[c11.ordinal()];
                                    if (i21 != 1) {
                                    }
                                }
                                f13 = 1.0f;
                                u11.k();
                                D0.d d122 = H0.d(g10, valueOf2, Float.valueOf(f13), y.f22806b.invoke(g10.m(), u11, 0), b12, u11, 196608);
                                U0 b132 = W0.b();
                                f fVar62 = (f) g10.h();
                                u11.o(1128033978);
                                i18 = iArr[fVar62.ordinal()];
                                if (i18 != 1) {
                                }
                                f14 = 1.0f;
                                u11.k();
                                Float valueOf322 = Float.valueOf(f14);
                                f fVar722 = (f) g10.n();
                                u11.o(1128033978);
                                i19 = iArr[fVar722.ordinal()];
                                if (i19 != 1) {
                                }
                                f23 = 1.0f;
                                u11.k();
                                long j1622 = f21;
                                D0.d d1322 = H0.d(g10, valueOf322, Float.valueOf(f23), z.f22807b.invoke(g10.m(), u11, 0), b132, u11, 196608);
                                f fVar822 = (f) g10.n();
                                u11.o(-107432127);
                                if (iArr[fVar822.ordinal()] != 1) {
                                }
                                u11.k();
                                AbstractC8032c s1122 = C7807Z.s(j17);
                                n11 = u11.n(s1122);
                                C11 = u11.C();
                                if (!n11) {
                                }
                                C11 = (U0) M.a().invoke(s1122);
                                u11.x(C11);
                                U0 u0222 = (U0) C11;
                                f fVar922 = (f) g10.h();
                                u11.o(-107432127);
                                if (iArr[fVar922.ordinal()] != 1) {
                                }
                                u11.k();
                                C7807Z m1122 = C7807Z.m(j18);
                                f fVar1022 = (f) g10.n();
                                u11.o(-107432127);
                                if (iArr[fVar1022.ordinal()] != 1) {
                                }
                                u11.k();
                                D0.d d1422 = H0.d(g10, m1122, C7807Z.m(j19), x.f22805b.invoke(g10.m(), u11, 0), u0222, u11, 196608);
                                u11.o(1023351670);
                                u11.k();
                                AbstractC8032c s1222 = C7807Z.s(e11);
                                n12 = u11.n(s1222);
                                C12 = u11.C();
                                if (!n12) {
                                }
                                C12 = (U0) M.a().invoke(s1222);
                                u11.x(C12);
                                u11.o(1023351670);
                                u11.k();
                                C7807Z m1222 = C7807Z.m(e11);
                                u11.o(1023351670);
                                u11.k();
                                D0.d d1522 = H0.d(g10, m1222, C7807Z.m(e11), v.f22803b.invoke(g10.m(), u11, 0), (U0) C12, u11, 196608);
                                float floatValue22 = ((Number) d11.getValue()).floatValue();
                                u11.o(-156998101);
                                if (c4912a != null) {
                                }
                                c3969l.k();
                                C13 = c3969l.C();
                                if (C13 == InterfaceC3967k.a.a()) {
                                }
                                c3969l.o(-156965270);
                                c3969l.k();
                                C14 = c3969l.C();
                                if (C14 == InterfaceC3967k.a.a()) {
                                }
                                c3969l.o(-156940524);
                                c3969l.k();
                                c3969l.o(-156921964);
                                c3969l.k();
                                c3969l.o(-156902962);
                                c3969l.k();
                                long g1122 = k2Var.g(z11, z12, z13);
                                c3969l.o(-156893937);
                                if (c4912a2 != null) {
                                }
                                c3969l.k();
                                c3969l.o(-156884470);
                                c3969l.k();
                                i21 = a.f22746a[c11.ordinal()];
                                if (i21 != 1) {
                                }
                            }
                            f12 = 1.0f;
                            u11.k();
                            Float valueOf22 = Float.valueOf(f12);
                            f fVar52 = (f) g10.n();
                            u11.o(1435837472);
                            i17 = iArr[fVar52.ordinal()];
                            if (i17 != 1) {
                            }
                            f13 = 1.0f;
                            u11.k();
                            D0.d d1222 = H0.d(g10, valueOf22, Float.valueOf(f13), y.f22806b.invoke(g10.m(), u11, 0), b12, u11, 196608);
                            U0 b1322 = W0.b();
                            f fVar622 = (f) g10.h();
                            u11.o(1128033978);
                            i18 = iArr[fVar622.ordinal()];
                            if (i18 != 1) {
                            }
                            f14 = 1.0f;
                            u11.k();
                            Float valueOf3222 = Float.valueOf(f14);
                            f fVar7222 = (f) g10.n();
                            u11.o(1128033978);
                            i19 = iArr[fVar7222.ordinal()];
                            if (i19 != 1) {
                            }
                            f23 = 1.0f;
                            u11.k();
                            long j16222 = f21;
                            D0.d d13222 = H0.d(g10, valueOf3222, Float.valueOf(f23), z.f22807b.invoke(g10.m(), u11, 0), b1322, u11, 196608);
                            f fVar8222 = (f) g10.n();
                            u11.o(-107432127);
                            if (iArr[fVar8222.ordinal()] != 1) {
                            }
                            u11.k();
                            AbstractC8032c s11222 = C7807Z.s(j17);
                            n11 = u11.n(s11222);
                            C11 = u11.C();
                            if (!n11) {
                            }
                            C11 = (U0) M.a().invoke(s11222);
                            u11.x(C11);
                            U0 u02222 = (U0) C11;
                            f fVar9222 = (f) g10.h();
                            u11.o(-107432127);
                            if (iArr[fVar9222.ordinal()] != 1) {
                            }
                            u11.k();
                            C7807Z m11222 = C7807Z.m(j18);
                            f fVar10222 = (f) g10.n();
                            u11.o(-107432127);
                            if (iArr[fVar10222.ordinal()] != 1) {
                            }
                            u11.k();
                            D0.d d14222 = H0.d(g10, m11222, C7807Z.m(j19), x.f22805b.invoke(g10.m(), u11, 0), u02222, u11, 196608);
                            u11.o(1023351670);
                            u11.k();
                            AbstractC8032c s12222 = C7807Z.s(e11);
                            n12 = u11.n(s12222);
                            C12 = u11.C();
                            if (!n12) {
                            }
                            C12 = (U0) M.a().invoke(s12222);
                            u11.x(C12);
                            u11.o(1023351670);
                            u11.k();
                            C7807Z m12222 = C7807Z.m(e11);
                            u11.o(1023351670);
                            u11.k();
                            D0.d d15222 = H0.d(g10, m12222, C7807Z.m(e11), v.f22803b.invoke(g10.m(), u11, 0), (U0) C12, u11, 196608);
                            float floatValue222 = ((Number) d11.getValue()).floatValue();
                            u11.o(-156998101);
                            if (c4912a != null) {
                            }
                            c3969l.k();
                            C13 = c3969l.C();
                            if (C13 == InterfaceC3967k.a.a()) {
                            }
                            c3969l.o(-156965270);
                            c3969l.k();
                            C14 = c3969l.C();
                            if (C14 == InterfaceC3967k.a.a()) {
                            }
                            c3969l.o(-156940524);
                            c3969l.k();
                            c3969l.o(-156921964);
                            c3969l.k();
                            c3969l.o(-156902962);
                            c3969l.k();
                            long g11222 = k2Var.g(z11, z12, z13);
                            c3969l.o(-156893937);
                            if (c4912a2 != null) {
                            }
                            c3969l.k();
                            c3969l.o(-156884470);
                            c3969l.k();
                            i21 = a.f22746a[c11.ordinal()];
                            if (i21 != 1) {
                            }
                        } else if (i15 != 3) {
                            throw new Sc.o();
                        }
                    }
                    f11 = 1.0f;
                    u11.k();
                    D0.d d112 = H0.d(g10, valueOf, Float.valueOf(f11), w.f22804b.invoke(g10.m(), u11, 0), b11, u11, 196608);
                    U0 b122 = W0.b();
                    f fVar42 = (f) g10.h();
                    u11.o(1435837472);
                    i16 = iArr[fVar42.ordinal()];
                    if (i16 != 1) {
                    }
                    f12 = 1.0f;
                    u11.k();
                    Float valueOf222 = Float.valueOf(f12);
                    f fVar522 = (f) g10.n();
                    u11.o(1435837472);
                    i17 = iArr[fVar522.ordinal()];
                    if (i17 != 1) {
                    }
                    f13 = 1.0f;
                    u11.k();
                    D0.d d12222 = H0.d(g10, valueOf222, Float.valueOf(f13), y.f22806b.invoke(g10.m(), u11, 0), b122, u11, 196608);
                    U0 b13222 = W0.b();
                    f fVar6222 = (f) g10.h();
                    u11.o(1128033978);
                    i18 = iArr[fVar6222.ordinal()];
                    if (i18 != 1) {
                    }
                    f14 = 1.0f;
                    u11.k();
                    Float valueOf32222 = Float.valueOf(f14);
                    f fVar72222 = (f) g10.n();
                    u11.o(1128033978);
                    i19 = iArr[fVar72222.ordinal()];
                    if (i19 != 1) {
                    }
                    f23 = 1.0f;
                    u11.k();
                    long j162222 = f21;
                    D0.d d132222 = H0.d(g10, valueOf32222, Float.valueOf(f23), z.f22807b.invoke(g10.m(), u11, 0), b13222, u11, 196608);
                    f fVar82222 = (f) g10.n();
                    u11.o(-107432127);
                    if (iArr[fVar82222.ordinal()] != 1) {
                    }
                    u11.k();
                    AbstractC8032c s112222 = C7807Z.s(j17);
                    n11 = u11.n(s112222);
                    C11 = u11.C();
                    if (!n11) {
                    }
                    C11 = (U0) M.a().invoke(s112222);
                    u11.x(C11);
                    U0 u022222 = (U0) C11;
                    f fVar92222 = (f) g10.h();
                    u11.o(-107432127);
                    if (iArr[fVar92222.ordinal()] != 1) {
                    }
                    u11.k();
                    C7807Z m112222 = C7807Z.m(j18);
                    f fVar102222 = (f) g10.n();
                    u11.o(-107432127);
                    if (iArr[fVar102222.ordinal()] != 1) {
                    }
                    u11.k();
                    D0.d d142222 = H0.d(g10, m112222, C7807Z.m(j19), x.f22805b.invoke(g10.m(), u11, 0), u022222, u11, 196608);
                    u11.o(1023351670);
                    u11.k();
                    AbstractC8032c s122222 = C7807Z.s(e11);
                    n12 = u11.n(s122222);
                    C12 = u11.C();
                    if (!n12) {
                    }
                    C12 = (U0) M.a().invoke(s122222);
                    u11.x(C12);
                    u11.o(1023351670);
                    u11.k();
                    C7807Z m122222 = C7807Z.m(e11);
                    u11.o(1023351670);
                    u11.k();
                    D0.d d152222 = H0.d(g10, m122222, C7807Z.m(e11), v.f22803b.invoke(g10.m(), u11, 0), (U0) C12, u11, 196608);
                    float floatValue2222 = ((Number) d112.getValue()).floatValue();
                    u11.o(-156998101);
                    if (c4912a != null) {
                    }
                    c3969l.k();
                    C13 = c3969l.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                    }
                    c3969l.o(-156965270);
                    c3969l.k();
                    C14 = c3969l.C();
                    if (C14 == InterfaceC3967k.a.a()) {
                    }
                    c3969l.o(-156940524);
                    c3969l.k();
                    c3969l.o(-156921964);
                    c3969l.k();
                    c3969l.o(-156902962);
                    c3969l.k();
                    long g112222 = k2Var.g(z11, z12, z13);
                    c3969l.o(-156893937);
                    if (c4912a2 != null) {
                    }
                    c3969l.k();
                    c3969l.o(-156884470);
                    c3969l.k();
                    i21 = a.f22746a[c11.ordinal()];
                    if (i21 != 1) {
                    }
                } else if (i29 != 3) {
                    throw new Sc.o();
                }
            }
            f7 = 1.0f;
            u11.k();
            Float valueOf4 = Float.valueOf(f7);
            f fVar32 = (f) g10.n();
            u11.o(-2036730335);
            i15 = iArr[fVar32.ordinal()];
            if (i15 != 1) {
            }
            f11 = 1.0f;
            u11.k();
            D0.d d1122 = H0.d(g10, valueOf4, Float.valueOf(f11), w.f22804b.invoke(g10.m(), u11, 0), b11, u11, 196608);
            U0 b1222 = W0.b();
            f fVar422 = (f) g10.h();
            u11.o(1435837472);
            i16 = iArr[fVar422.ordinal()];
            if (i16 != 1) {
            }
            f12 = 1.0f;
            u11.k();
            Float valueOf2222 = Float.valueOf(f12);
            f fVar5222 = (f) g10.n();
            u11.o(1435837472);
            i17 = iArr[fVar5222.ordinal()];
            if (i17 != 1) {
            }
            f13 = 1.0f;
            u11.k();
            D0.d d122222 = H0.d(g10, valueOf2222, Float.valueOf(f13), y.f22806b.invoke(g10.m(), u11, 0), b1222, u11, 196608);
            U0 b132222 = W0.b();
            f fVar62222 = (f) g10.h();
            u11.o(1128033978);
            i18 = iArr[fVar62222.ordinal()];
            if (i18 != 1) {
            }
            f14 = 1.0f;
            u11.k();
            Float valueOf322222 = Float.valueOf(f14);
            f fVar722222 = (f) g10.n();
            u11.o(1128033978);
            i19 = iArr[fVar722222.ordinal()];
            if (i19 != 1) {
            }
            f23 = 1.0f;
            u11.k();
            long j1622222 = f21;
            D0.d d1322222 = H0.d(g10, valueOf322222, Float.valueOf(f23), z.f22807b.invoke(g10.m(), u11, 0), b132222, u11, 196608);
            f fVar822222 = (f) g10.n();
            u11.o(-107432127);
            if (iArr[fVar822222.ordinal()] != 1) {
            }
            u11.k();
            AbstractC8032c s1122222 = C7807Z.s(j17);
            n11 = u11.n(s1122222);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = (U0) M.a().invoke(s1122222);
            u11.x(C11);
            U0 u0222222 = (U0) C11;
            f fVar922222 = (f) g10.h();
            u11.o(-107432127);
            if (iArr[fVar922222.ordinal()] != 1) {
            }
            u11.k();
            C7807Z m1122222 = C7807Z.m(j18);
            f fVar1022222 = (f) g10.n();
            u11.o(-107432127);
            if (iArr[fVar1022222.ordinal()] != 1) {
            }
            u11.k();
            D0.d d1422222 = H0.d(g10, m1122222, C7807Z.m(j19), x.f22805b.invoke(g10.m(), u11, 0), u0222222, u11, 196608);
            u11.o(1023351670);
            u11.k();
            AbstractC8032c s1222222 = C7807Z.s(e11);
            n12 = u11.n(s1222222);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = (U0) M.a().invoke(s1222222);
            u11.x(C12);
            u11.o(1023351670);
            u11.k();
            C7807Z m1222222 = C7807Z.m(e11);
            u11.o(1023351670);
            u11.k();
            D0.d d1522222 = H0.d(g10, m1222222, C7807Z.m(e11), v.f22803b.invoke(g10.m(), u11, 0), (U0) C12, u11, 196608);
            float floatValue22222 = ((Number) d1122.getValue()).floatValue();
            u11.o(-156998101);
            if (c4912a != null) {
            }
            c3969l.k();
            C13 = c3969l.C();
            if (C13 == InterfaceC3967k.a.a()) {
            }
            c3969l.o(-156965270);
            c3969l.k();
            C14 = c3969l.C();
            if (C14 == InterfaceC3967k.a.a()) {
            }
            c3969l.o(-156940524);
            c3969l.k();
            c3969l.o(-156921964);
            c3969l.k();
            c3969l.o(-156902962);
            c3969l.k();
            long g1122222 = k2Var.g(z11, z12, z13);
            c3969l.o(-156893937);
            if (c4912a2 != null) {
            }
            c3969l.k();
            c3969l.o(-156884470);
            c3969l.k();
            i21 = a.f22746a[c11.ordinal()];
            if (i21 != 1) {
            }
        }
        S0.J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new s(c11, str, function2, c2454a, c4912a, c4912a2, z11, z12, oVar, c9915y, k2Var, c4912a4, i11, i12));
        }
    }

    public static final void b(long j11, T t2, Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j12;
        T t11;
        Function2 function22;
        C3969l u11 = interfaceC3967k.u(1208685580);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(t2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            function22 = function2;
            t11 = t2;
            j12 = j11;
        } else {
            i.a(j11, t2, function2, u11, i12 & 1022);
            j12 = j11;
            t11 = t2;
            function22 = function2;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new t(j12, t11, function22, i11));
        }
    }

    public static final void c(long j11, Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(660142980);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C3996z.a(C3776u.a().c(C7807Z.m(j11)), function2, u11, (i12 & 112) | 8);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new u(j11, function2, i11));
        }
    }

    @NotNull
    public static final androidx.compose.ui.e d(@NotNull androidx.compose.ui.e eVar, boolean z11, @NotNull String str) {
        return z11 ? I1.o.c(eVar, false, new b(str)) : eVar;
    }

    public static final float e() {
        return f22738c;
    }

    @NotNull
    public static final androidx.compose.ui.e f() {
        return f22744i;
    }

    public static final Object g(@NotNull InterfaceC2552v interfaceC2552v) {
        Object m11 = interfaceC2552v.m();
        E e11 = m11 instanceof E ? (E) m11 : null;
        if (e11 != null) {
            return e11.e1();
        }
        return null;
    }

    public static final float h() {
        return f22742g;
    }

    public static final float i() {
        return f22743h;
    }

    public static final float j() {
        return f22741f;
    }

    public static final float k() {
        return f22740e;
    }

    public static final float l() {
        return f22739d;
    }

    public static final float m() {
        return f22737b;
    }

    public static final long n() {
        return f22736a;
    }

    public static final int o(m0 m0Var) {
        if (m0Var != null) {
            return m0Var.l0();
        }
        return 0;
    }

    @NotNull
    public static final androidx.compose.ui.e p(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC7813c0 interfaceC7813c0, @NotNull J0 j02) {
        return androidx.compose.ui.draw.c.c(eVar, new c(j02, interfaceC7813c0));
    }

    public static final int q(m0 m0Var) {
        if (m0Var != null) {
            return m0Var.u0();
        }
        return 0;
    }
}
