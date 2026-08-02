package R20;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.DebugMenuCloseButtonKt;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f24516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(u uVar) {
        super(2);
        this.f24516b = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(971131078);
            u uVar = this.f24516b;
            boolean F11 = interfaceC3967k2.F(uVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(0, uVar, u.class, "close", "close()V", 0);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DebugMenuCloseButtonKt.DebugMenuCloseButton((Function0) ((kotlin.reflect.h) C11), null, interfaceC3967k2, 0, 2);
        }
        return Unit.f71690a;
    }
}
