package Ri0;

import P0.C3753m;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.layout.a0;
import bj0.C5680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f25153b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f25154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, b bVar) {
        super(2);
        this.f25153b = qVar;
        this.f25154c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(683764195);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k2.k();
            androidx.compose.ui.e e11 = a0.e(C5680b.a(54, interfaceC3967k2, androidx.compose.ui.e.f40358c0, "Button.ResetConfigs"), 1.0f);
            interfaceC3967k2.o(683772409);
            Object C12 = interfaceC3967k2.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new m(interfaceC3978p0);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            C3753m.a((Function0) C12, e11, false, null, null, null, null, a.f25118a, interfaceC3967k2, 805306374, 508);
            if (((Boolean) interfaceC3978p0.getValue()).booleanValue()) {
                interfaceC3967k2.o(683779438);
                Object C13 = interfaceC3967k2.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = new o(interfaceC3978p0);
                    interfaceC3967k2.x(C13);
                }
                Function0 function0 = (Function0) C13;
                interfaceC3967k2.k();
                interfaceC3967k2.o(683784737);
                b bVar = this.f25154c;
                boolean F11 = interfaceC3967k2.F(bVar);
                Object C14 = interfaceC3967k2.C();
                if (F11 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new n(bVar, interfaceC3978p0);
                    interfaceC3967k2.x(C14);
                }
                interfaceC3967k2.k();
                q.f(this.f25153b, function0, (Function0) C14, function0, interfaceC3967k2, 390);
            }
        }
        return Unit.f71690a;
    }
}
