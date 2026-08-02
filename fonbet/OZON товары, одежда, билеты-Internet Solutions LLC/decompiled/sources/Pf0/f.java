package Pf0;

import J0.u3;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9895d;
import vf0.C10315a;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(InterfaceC3978p0 interfaceC3978p0) {
        super(3);
        this.f22520b = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d Block = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(Block, "$this$Block");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Sf0.e.a("Конфигурация", null, interfaceC3967k2, 6, 2);
            InterfaceC3978p0 interfaceC3978p0 = this.f22520b;
            u3.b("Мониторинг включен: " + ((C10315a) interfaceC3978p0.getValue()).h(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b("Отправлять аналитику: " + ((C10315a) interfaceC3978p0.getValue()).g(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b("Только мобильная сеть: " + ((C10315a) interfaceC3978p0.getValue()).k(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b(Ej.b.a(((C10315a) interfaceC3978p0.getValue()).d(), "Период пингования (сек): "), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b("Force ping: " + ((C10315a) interfaceC3978p0.getValue()).i(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b(Nk.a.b("Список extra доменов: ", C7714v.V(((C10315a) interfaceC3978p0.getValue()).c(), null, null, null, null, 63)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b("Протокол: " + ((C10315a) interfaceC3978p0.getValue()).e(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b(Ej.b.a(((C10315a) interfaceC3978p0.getValue()).a(), "Задержка пингования на старте (в мс): "), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b("Отправлять аналитику по белому домену: " + ((C10315a) interfaceC3978p0.getValue()).l(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            u3.b("Отправлять аналитику по серому домену: " + ((C10315a) interfaceC3978p0.getValue()).j(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
