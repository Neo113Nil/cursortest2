package Mf0;

import J0.Q0;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Mf0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3636s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O f18053b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3636s(O o11, InterfaceC3978p0<String> interfaceC3978p0) {
        super(2);
        this.f18053b = o11;
        this.f18054c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC3978p0<String> interfaceC3978p0 = this.f18054c;
            if (interfaceC3978p0.getValue() != null) {
                interfaceC3967k2.o(-1632451598);
                O o11 = this.f18053b;
                boolean F11 = interfaceC3967k2.F(o11) | interfaceC3967k2.n(interfaceC3978p0);
                Object C11 = interfaceC3967k2.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new r(o11, interfaceC3978p0);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                Q0.a((Function0) C11, null, false, C3619a.f18017h, interfaceC3967k2, 24576, 14);
            }
        }
        return Unit.f71690a;
    }
}
