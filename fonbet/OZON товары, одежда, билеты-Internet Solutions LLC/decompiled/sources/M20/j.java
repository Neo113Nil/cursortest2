package M20;

import B4.P;
import D4.X;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f17283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(P p11) {
        super(2);
        this.f17283b = p11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e d11 = a0.d(androidx.compose.ui.e.f40358c0);
            interfaceC3967k2.o(-992781392);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = b.f17277b;
                interfaceC3967k2.x(C11);
            }
            Function1 function1 = (Function1) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-992779505);
            Object C12 = interfaceC3967k2.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = c.f17278b;
                interfaceC3967k2.x(C12);
            }
            Function1 function12 = (Function1) C12;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-992776213);
            P p11 = this.f17283b;
            boolean F11 = interfaceC3967k2.F(p11);
            Object C13 = interfaceC3967k2.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new i(p11);
                interfaceC3967k2.x(C13);
            }
            interfaceC3967k2.k();
            X.b(this.f17283b, d11, null, function1, function12, null, null, (Function1) C13, interfaceC3967k2, 1769904);
        }
        return Unit.f71690a;
    }
}
