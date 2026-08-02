package bb0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.button.OziButtonKt;
import ru.ozon.uni.ozi.components.button.presets.style.OziButtonStyle;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
final class v extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.g f55838b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f55839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(eb0.g gVar, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(2);
        this.f55838b = gVar;
        this.f55839c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            eb0.g gVar = this.f55838b;
            gVar.getClass();
            androidx.compose.ui.e e11 = a0.e(OziTestTagsKt.oziResourceIdTestTag(aVar, "HostConfig.ResetConfigs.Button", interfaceC3967k2, 6), 1.0f);
            OziButtonStyle.NegativeSecondary negativeSecondary = OziButtonStyle.NegativeSecondary.INSTANCE;
            interfaceC3967k2.o(-770365612);
            Object C11 = interfaceC3967k2.C();
            Object a11 = InterfaceC3967k.a.a();
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f55839c;
            if (C11 == a11) {
                C11 = new s(interfaceC3978p0);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            OziButtonKt.OziButton("Reset Configs", (Function0) C11, e11, null, null, false, null, negativeSecondary, null, null, interfaceC3967k2, 12582960, 888);
            if (interfaceC3978p0.getValue().booleanValue()) {
                eb0.f a12 = gVar.a();
                interfaceC3967k2.o(-770357449);
                boolean n11 = interfaceC3967k2.n(gVar);
                Object C12 = interfaceC3967k2.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new t(gVar, interfaceC3978p0);
                    interfaceC3967k2.x(C12);
                }
                Function0 function0 = (Function0) C12;
                interfaceC3967k2.k();
                interfaceC3967k2.o(-770352355);
                Object C13 = interfaceC3967k2.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = new u(interfaceC3978p0);
                    interfaceC3967k2.x(C13);
                }
                interfaceC3967k2.k();
                x.b(a12, function0, (Function0) C13, interfaceC3967k2, 384);
            }
        }
        return Unit.f71690a;
    }
}
