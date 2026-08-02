package I0;

import B0.EnumC2526y0;
import Bl0.C2652m;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.c2;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import d2.C6054l;
import d2.EnumC6042T;
import e1.C6249a;
import e1.InterfaceC6250b;
import i1.C6987g;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7804W;
import l1.C7807Z;
import l1.C7811b0;
import l1.C7844u;
import l1.C7848y;
import l1.InterfaceC7802U;
import l1.InterfaceC7829k0;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3181f {

    /* renamed from: I0.f$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c2 f11489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f11490c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11491d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11492e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3214w f11493f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c2 c2Var, long j11, boolean z11, androidx.compose.ui.e eVar, InterfaceC3214w interfaceC3214w) {
            super(2);
            this.f11489b = c2Var;
            this.f11490c = j11;
            this.f11491d = z11;
            this.f11492e = eVar;
            this.f11493f = interfaceC3214w;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C3996z.a(androidx.compose.ui.platform.K0.r().c(this.f11489b), a1.c.c(-1426434671, new C3179e(this.f11490c, this.f11491d, this.f11492e, this.f11493f), interfaceC3967k2), interfaceC3967k2, 56);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.f$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3214w f11494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11495c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V1.g f11496d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11497e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f11498f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11499g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11500h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11501i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3214w interfaceC3214w, boolean z11, V1.g gVar, boolean z12, long j11, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f11494b = interfaceC3214w;
            this.f11495c = z11;
            this.f11496d = gVar;
            this.f11497e = z12;
            this.f11498f = j11;
            this.f11499g = eVar;
            this.f11500h = i11;
            this.f11501i = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f11500h | 1);
            boolean z11 = this.f11497e;
            C3181f.b(this.f11494b, this.f11495c, this.f11496d, z11, this.f11498f, this.f11499g, interfaceC3967k, e11, this.f11501i);
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.f$c */
    static final class c extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3214w f11502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11504d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3214w interfaceC3214w, boolean z11, boolean z12) {
            super(1);
            this.f11502b = interfaceC3214w;
            this.f11503c = z11;
            this.f11504d = z12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I1.D d11) {
            I1.D d12 = d11;
            long a11 = this.f11502b.a();
            d12.b(C3196m0.d(), new C3194l0(this.f11503c ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd, a11, this.f11504d ? EnumC3192k0.Left : EnumC3192k0.Right, P9.a.d(a11)));
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.f$d */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f11506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11507d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11508e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, Function0<Boolean> function0, boolean z11, int i11) {
            super(2);
            this.f11505b = eVar;
            this.f11506c = function0;
            this.f11507d = z11;
            this.f11508e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f11508e | 1);
            C3181f.c(this.f11507d, this.f11505b, this.f11506c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull InterfaceC3214w interfaceC3214w, @NotNull InterfaceC6250b interfaceC6250b, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(476043083);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(interfaceC3214w) : u11.F(interfaceC3214w) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(interfaceC6250b) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            boolean z11 = false;
            boolean z12 = (i12 & 112) == 32;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.n(interfaceC3214w))) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object C11 = u11.C();
            if (z13 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3203q(interfaceC6250b, interfaceC3214w);
                u11.x(C11);
            }
            C6054l.a((C3203q) C11, null, new C6041S(false, true, true, EnumC6042T.Inherit, false), c4912a, u11, ((i12 << 3) & 7168) | 384, 2);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3171a(interfaceC3214w, interfaceC6250b, c4912a, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d0, code lost:
    
        if (r21 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ec, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d6, code lost:
    
        if (r21 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ea, code lost:
    
        if (((r20 == V1.g.Ltr && !r21) || (r20 == V1.g.Rtl && r21)) == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull InterfaceC3214w interfaceC3214w, boolean z11, @NotNull V1.g gVar, boolean z12, long j11, @NotNull androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        boolean z13;
        C3969l u11 = interfaceC3967k.u(-843755800);
        if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(interfaceC3214w) : u11.F(interfaceC3214w) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.n(gVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            j12 = j11;
            i13 |= ((i12 & 16) == 0 && u11.s(j12)) ? 16384 : 8192;
        } else {
            j12 = j11;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.n(eVar) ? 131072 : 65536;
        }
        if ((74899 & i13) == 74898 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                }
            } else if ((i12 & 16) != 0) {
                i13 &= -57345;
                j12 = 9205357640488583168L;
            }
            u11.j0();
            if (z11) {
                int i14 = C3196m0.f11565d;
                if (gVar == V1.g.Ltr) {
                }
                if (gVar == V1.g.Rtl) {
                }
                z13 = false;
            } else {
                int i15 = C3196m0.f11565d;
            }
            e1.c b11 = z13 ? C6249a.b() : C6249a.a();
            int i16 = i13 & 14;
            boolean p11 = ((i13 & 112) == 32) | (i16 == 4 || ((i13 & 8) != 0 && u11.F(interfaceC3214w))) | u11.p(z13);
            Object C11 = u11.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(interfaceC3214w, z11, z13);
                u11.x(C11);
            }
            long j13 = j12;
            a(interfaceC3214w, b11, a1.c.c(280174801, new a((c2) u11.m(androidx.compose.ui.platform.K0.r()), j13, z13, I1.o.c(eVar, false, (Function1) C11), interfaceC3214w), u11), u11, i16 | 384);
            j12 = j13;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(interfaceC3214w, z11, gVar, z12, j12, eVar, i11, i12));
        }
    }

    public static final void c(boolean z11, @NotNull androidx.compose.ui.e eVar, @NotNull Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        C3969l u11 = interfaceC3967k.u(2111672474);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 | (u11.F(function0) ? 32 : 16) | (u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN)) & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            b11 = androidx.compose.ui.c.b(androidx.compose.foundation.layout.a0.o(eVar, C3196m0.c(), C3196m0.b()), C5236c1.a(), new C3187i(z11, function0));
            u0.E.a(u11, b11);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(eVar, function0, z11, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r0 > r5.getHeight()) goto L11;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC7829k0 d(@NotNull C6987g c6987g, float f7) {
        InterfaceC7802U interfaceC7802U;
        InterfaceC7829k0 interfaceC7829k0;
        long j11;
        int ceil = ((int) Math.ceil(f7)) * 2;
        InterfaceC7829k0 c11 = C3201p.c();
        InterfaceC7802U a11 = C3201p.a();
        C8408a b11 = C3201p.b();
        if (c11 != null && a11 != null) {
            C7848y c7848y = (C7848y) c11;
            if (ceil <= c7848y.getWidth()) {
                interfaceC7829k0 = c11;
                interfaceC7802U = a11;
            }
        }
        C7848y b12 = S8.a.b(ceil, ceil, 1);
        C3201p.f(b12);
        C7844u a12 = C7804W.a(b12);
        C3201p.d(a12);
        interfaceC7829k0 = b12;
        interfaceC7802U = a12;
        InterfaceC7829k0 interfaceC7829k02 = interfaceC7829k0;
        if (b11 == null) {
            b11 = new C8408a();
            C3201p.e(b11);
        }
        C8408a c8408a = b11;
        Z1.s layoutDirection = c6987g.getLayoutDirection();
        C7848y c7848y2 = (C7848y) interfaceC7829k02;
        long a13 = C7465k.a(c7848y2.getWidth(), c7848y2.getHeight());
        C8408a.C1285a t2 = c8408a.t();
        Z1.d a14 = t2.a();
        Z1.s b13 = t2.b();
        InterfaceC7802U c12 = t2.c();
        long d11 = t2.d();
        C8408a.C1285a t11 = c8408a.t();
        t11.j(c6987g);
        t11.k(layoutDirection);
        t11.i(interfaceC7802U);
        t11.l(a13);
        C7844u c7844u = (C7844u) interfaceC7802U;
        c7844u.save();
        j11 = C7807Z.f72248b;
        InterfaceC8412e.Q(c8408a, j11, 0L, c8408a.i(), 0.0f, null, 58);
        InterfaceC8412e.Q(c8408a, C7811b0.c(4278190080L), 0L, C7465k.a(f7, f7), 0.0f, null, 120);
        InterfaceC8412e.m1(c8408a, C7811b0.c(4278190080L), f7, P9.a.a(f7, f7), 120);
        c7844u.p();
        C8408a.C1285a t12 = c8408a.t();
        t12.j(a14);
        t12.k(b13);
        t12.i(c12);
        t12.l(d11);
        return interfaceC7829k02;
    }
}
