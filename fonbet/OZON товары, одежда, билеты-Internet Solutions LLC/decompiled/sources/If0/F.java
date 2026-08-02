package If0;

import J0.C3332q;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9895d;

/* loaded from: classes3.dex */
final class F extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12353b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    F(J j11, Function1<? super I, Unit> function1) {
        super(3);
        this.f12353b = j11;
        this.f12354c = function1;
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
            Sf0.e.a("Domain reachability", null, interfaceC3967k2, 6, 2);
            J j11 = this.f12353b;
            boolean e11 = j11.e();
            boolean d11 = j11.d();
            interfaceC3967k2.o(-1641817681);
            Function1<I, Unit> function1 = this.f12354c;
            boolean n11 = interfaceC3967k2.n(function1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C(function1);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            Hf0.b.a("Включить domain reachability", d11, e11, (Function1) C11, interfaceC3967k2, 6);
            boolean e12 = j11.e();
            boolean g10 = j11.g();
            interfaceC3967k2.o(-1641810693);
            boolean n12 = interfaceC3967k2.n(function1);
            Object C12 = interfaceC3967k2.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new D(function1);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            Hf0.b.a("Оптимизация с использованием ЕСК", g10, e12, (Function1) C12, interfaceC3967k2, 6);
            androidx.compose.ui.e e13 = androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            boolean e14 = j11.e();
            interfaceC3967k2.o(-1641805034);
            boolean n13 = interfaceC3967k2.n(function1);
            Object C13 = interfaceC3967k2.C();
            if (n13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new E(function1);
                interfaceC3967k2.x(C13);
            }
            interfaceC3967k2.k();
            C3332q.a((Function0) C13, e13, e14, null, null, null, null, C3237c.f12420a, interfaceC3967k2, 805306416, 504);
        }
        return Unit.f71690a;
    }
}
