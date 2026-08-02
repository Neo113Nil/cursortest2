package Pf0;

import J0.u3;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import u0.InterfaceC9895d;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(InterfaceC3978p0 interfaceC3978p0) {
        super(3);
        this.f22519b = interfaceC3978p0;
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
            Sf0.e.a("Статус сети", null, interfaceC3967k2, 6, 2);
            u3.b("Текущий статус сети: " + ((NetworkInfo) this.f22519b.getValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
