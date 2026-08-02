package B0;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import I0.C3181f;
import I0.C3194l0;
import I0.C3196m0;
import I0.EnumC3192k0;
import I0.InterfaceC3214w;
import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2457b {

    /* renamed from: a, reason: collision with root package name */
    private static final float f1663a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f1664b;

    /* renamed from: B0.b$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f1665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, long j11) {
            super(2);
            this.f1665b = j11;
            this.f1666c = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                long j11 = this.f1665b;
                if (j11 != 9205357640488583168L) {
                    interfaceC3967k2.o(1828881000);
                    androidx.compose.ui.e l11 = androidx.compose.foundation.layout.a0.l(this.f1666c, Z1.j.c(j11), Z1.j.b(j11), 0.0f, 0.0f, 12);
                    B1.V f7 = C5185h.f(InterfaceC6250b.a.m(), false);
                    int I11 = interfaceC3967k2.I();
                    S0.A0 d11 = interfaceC3967k2.d();
                    androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, l11);
                    InterfaceC2801g.f5440U.getClass();
                    Function0 a11 = InterfaceC2801g.a.a();
                    if (interfaceC3967k2.v() == null) {
                        C8060b.c();
                        throw null;
                    }
                    interfaceC3967k2.i();
                    if (interfaceC3967k2.t()) {
                        interfaceC3967k2.H(a11);
                    } else {
                        interfaceC3967k2.e();
                    }
                    Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
                    if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                        Nk.a.d(d12, I11, interfaceC3967k2, I11);
                    }
                    S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
                    C2457b.b(null, interfaceC3967k2, 0, 1);
                    interfaceC3967k2.f();
                    interfaceC3967k2.k();
                } else {
                    interfaceC3967k2.o(1829217412);
                    C2457b.b(this.f1666c, interfaceC3967k2, 0, 0);
                    interfaceC3967k2.k();
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.b$b, reason: collision with other inner class name */
    static final class C0043b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3214w f1667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f1669d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1670e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1671f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0043b(InterfaceC3214w interfaceC3214w, androidx.compose.ui.e eVar, long j11, int i11, int i12) {
            super(2);
            this.f1667b = interfaceC3214w;
            this.f1668c = eVar;
            this.f1669d = j11;
            this.f1670e = i11;
            this.f1671f = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f1670e | 1);
            InterfaceC3214w interfaceC3214w = this.f1667b;
            C2457b.a(interfaceC3214w, this.f1668c, this.f1669d, interfaceC3967k, e11, this.f1671f);
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.b$c */
    static final class c extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3214w f1672b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3214w interfaceC3214w) {
            super(1);
            this.f1672b = interfaceC3214w;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I1.D d11) {
            d11.b(C3196m0.d(), new C3194l0(EnumC2526y0.Cursor, this.f1672b.a(), EnumC3192k0.Middle, true));
            return Unit.f71690a;
        }
    }

    static {
        float f7 = 25;
        f1663a = f7;
        f1664b = (f7 * 2.0f) / 2.4142137f;
    }

    public static final void a(@NotNull InterfaceC3214w interfaceC3214w, @NotNull androidx.compose.ui.e eVar, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        C3969l u11 = interfaceC3967k.u(1776202187);
        int i13 = (u11.n(interfaceC3214w) ? 4 : 2) | i11 | (u11.n(eVar) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i13 |= ((i12 & 4) == 0 && u11.s(j11)) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            } else if ((i12 & 4) != 0) {
                i13 &= -897;
                j11 = 9205357640488583168L;
            }
            u11.j0();
            int i14 = i13 & 14;
            boolean z11 = i14 == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(interfaceC3214w);
                u11.x(C11);
            }
            C3181f.a(interfaceC3214w, InterfaceC6250b.a.m(), a1.c.c(-1653527038, new a(I1.o.c(eVar, false, (Function1) C11), j11), u11), u11, i14 | 432);
        }
        long j12 = j11;
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C0043b(interfaceC3214w, eVar, j12, i11, i12));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        androidx.compose.ui.e b11;
        C3969l u11 = interfaceC3967k.u(694251107);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = androidx.compose.ui.e.f40358c0;
            }
            b11 = androidx.compose.ui.c.b(androidx.compose.foundation.layout.a0.o(eVar, f1664b, f1663a), C5236c1.a(), C2469f.f1709b);
            u0.E.a(u11, b11);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2460c(eVar, i11, i12));
        }
    }
}
