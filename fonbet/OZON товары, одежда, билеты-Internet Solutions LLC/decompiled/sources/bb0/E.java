package bb0;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.badge.OziBadgeKt;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
final class E extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.c f55791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(eb0.c cVar) {
        super(2);
        this.f55791b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            eb0.c cVar = this.f55791b;
            cVar.getClass();
            androidx.compose.ui.e e11 = a0.e(OziTestTagsKt.oziResourceIdTestTag(aVar, "HostConfig.ReloadApp.Badge", interfaceC3967k2, 6), 1.0f);
            eb0.e a11 = cVar.a();
            interfaceC3967k2.o(-1218336335);
            boolean F11 = interfaceC3967k2.F(a11);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                D d11 = new D(0, a11, eb0.e.class, "onClick", "onClick()V", 0);
                interfaceC3967k2.x(d11);
                C11 = d11;
            }
            interfaceC3967k2.k();
            OziBadgeKt.OziBadge("Требуется перезапуск приложения", (Function0) ((kotlin.reflect.h) C11), e11, null, OziBadgeStyle.WarningPrimary.INSTANCE, false, null, interfaceC3967k2, 24576, 104);
        }
        return Unit.f71690a;
    }
}
