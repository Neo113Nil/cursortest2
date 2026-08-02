package B1;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f2155a = new a();

    public static final class a {
        @NotNull
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<z0, Z1.b, W> f2157c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2158d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2159e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, Function2<? super z0, ? super Z1.b, ? extends W> function2, int i11, int i12) {
            super(2);
            this.f2156b = eVar;
            this.f2157c = function2;
            this.f2158d = i11;
            this.f2159e = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f2158d | 1);
            Function2<z0, Z1.b, W> function2 = this.f2157c;
            int i11 = this.f2159e;
            v0.b(this.f2156b, function2, interfaceC3967k, e11, i11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull y0 y0Var, androidx.compose.ui.e eVar, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0 function0;
        C3969l u11 = interfaceC3967k.u(-511989831);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(y0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            int I11 = u11.I();
            AbstractC3984t l11 = u11.l();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            S0.A0 d11 = u11.d();
            function0 = D1.H.f5234K;
            u11.i();
            if (u11.t()) {
                u11.H(function0);
            } else {
                u11.e();
            }
            F1.b(u11, y0Var, y0Var.g());
            F1.b(u11, l11, y0Var.e());
            F1.b(u11, function2, y0Var.f());
            InterfaceC2801g.f5440U.getClass();
            F1.b(u11, d11, InterfaceC2801g.a.g());
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            u11.f();
            if (u11.b()) {
                u11.o(-26502501);
                u11.k();
            } else {
                u11.o(-26580342);
                boolean F11 = u11.F(y0Var);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new w0(y0Var);
                    u11.x(C11);
                }
                int i13 = S0.Q.f25307b;
                u11.g((Function0) C11);
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new x0(y0Var, eVar, function2, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, @NotNull Function2<? super z0, ? super Z1.b, ? extends W> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1298353104);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.F(function2) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = androidx.compose.ui.e.f40358c0;
            }
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new y0();
                u11.x(C11);
            }
            a((y0) C11, eVar, function2, u11, (i13 << 3) & 1008);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(eVar, function2, i11, i12));
        }
    }
}
