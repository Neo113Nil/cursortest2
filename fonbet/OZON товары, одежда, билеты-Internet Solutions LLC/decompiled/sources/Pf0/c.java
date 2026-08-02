package Pf0;

import Ae.M0;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.o;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import e1.InterfaceC6250b;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import qf0.EnumC9053a;

/* loaded from: classes3.dex */
public final class c {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22513a;

        static {
            int[] iArr = new int[EnumC9053a.values().length];
            try {
                iArr[EnumC9053a.Available.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9053a.NotAvailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9053a.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22513a = iArr;
        }
    }

    public static final void a(Pf0.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1672773307);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 b11 = n1.b(aVar.d0(), u11);
            InterfaceC3978p0 a11 = n1.a(aVar.i0(), Boolean.FALSE, null, u11, 48, 2);
            M0<EnumC9053a> h02 = aVar.h0();
            EnumC9053a enumC9053a = EnumC9053a.Unknown;
            InterfaceC3978p0 a12 = n1.a(h02, enumC9053a, null, u11, 48, 2);
            InterfaceC3978p0 a13 = n1.a(aVar.f0(), enumC9053a, null, u11, 48, 2);
            InterfaceC3978p0 a14 = n1.a(aVar.e0(), K.f71697a, null, u11, 48, 2);
            InterfaceC3978p0 b12 = n1.b(aVar.g0(), u11);
            androidx.compose.ui.e c11 = z.c(a0.d(androidx.compose.ui.e.f40358c0), z.b(u11), 14);
            C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, c11);
            Function0 a16 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a15, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Sf0.c.a(null, a1.c.c(-2303390, new d(a11, b11, a12, a13, a14), u11), u11, 48, 1);
            Sf0.c.a(null, a1.c.c(-533197031, new e(b12), u11), u11, 48, 1);
            Sf0.c.a(null, a1.c.c(-1101169254, new f(b11), u11), u11, 48, 1);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(aVar, i11));
        }
    }

    public static final long b(EnumC9053a enumC9053a) {
        long j11;
        long j12;
        long j13;
        int i11 = a.f22513a[enumC9053a.ordinal()];
        if (i11 == 1) {
            j11 = C7807Z.f72253g;
            return j11;
        }
        if (i11 == 2) {
            j12 = C7807Z.f72252f;
            return j12;
        }
        if (i11 != 3) {
            throw new o();
        }
        j13 = C7807Z.f72250d;
        return j13;
    }
}
