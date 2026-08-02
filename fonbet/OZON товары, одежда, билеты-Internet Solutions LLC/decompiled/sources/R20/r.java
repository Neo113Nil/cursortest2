package R20;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.T;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.C9915y;
import u0.InterfaceC9914x;
import v0.C10164d;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements InterfaceC6511n<InterfaceC9914x, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f24533b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f24534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(InterfaceC3978p0 interfaceC3978p0, u uVar) {
        super(3);
        this.f24533b = interfaceC3978p0;
        this.f24534c = uVar;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9914x interfaceC9914x, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9914x contentPadding = interfaceC9914x;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(contentPadding) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C9915y b11 = T.b(0.0f, contentPadding.d() + 8, 0.0f, 0.0f, 13);
            interfaceC3967k2.o(971140100);
            InterfaceC3978p0 interfaceC3978p0 = this.f24533b;
            boolean n11 = interfaceC3967k2.n(interfaceC3978p0);
            u uVar = this.f24534c;
            boolean F11 = n11 | interfaceC3967k2.F(uVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new q(interfaceC3978p0, uVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C10164d.a(null, null, b11, null, null, null, false, (Function1) C11, interfaceC3967k2, 0, 251);
        }
        return Unit.f71690a;
    }
}
