package If0;

import D1.InterfaceC2801g;
import If0.J;
import J0.C3332q;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.InterfaceC9895d;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12466b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    r(J j11, Function1<? super I, Unit> function1) {
        super(3);
        this.f12466b = j11;
        this.f12467c = function1;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d Block = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(Block, "$this$Block");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            J j11 = this.f12466b;
            Sf0.e.a("Подписки на домены", Sf0.d.a(aVar, j11.e(), interfaceC3967k2), interfaceC3967k2, 6, 0);
            boolean e11 = j11.e();
            androidx.compose.ui.e e12 = androidx.compose.foundation.layout.a0.e(aVar, 1.0f);
            interfaceC3967k2.o(845049443);
            Function1<I, Unit> function1 = this.f12467c;
            boolean n11 = interfaceC3967k2.n(function1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3251q(function1);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C3332q.a((Function0) C11, e12, e11, null, null, null, null, C3237c.f12424e, interfaceC3967k2, 805306416, 504);
            C5194q a11 = C5193p.a(C5179b.n(16), InterfaceC6250b.a.k(), interfaceC3967k2, 6);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c11 = J0.P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            interfaceC3967k2.o(-571199486);
            int i11 = 0;
            for (Object obj : j11.b()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                J.a aVar2 = (J.a) obj;
                interfaceC3967k2.o(-571197987);
                if (i11 != 0) {
                    J0.L.a(0.0f, 0L, 0.0f, null, interfaceC3967k2, 0);
                }
                interfaceC3967k2.k();
                C3250p.i(aVar2, j11.e(), function1, interfaceC3967k2, 0);
                i11 = i12;
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
