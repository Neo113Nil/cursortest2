package bb0;

import S0.InterfaceC3967k;
import eb0.C6340a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;

/* renamed from: bb0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5621d extends AbstractC7737t implements InterfaceC6511n<OziCellCenterScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6340a f55802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5621d(C6340a c6340a) {
        super(3);
        this.f55802b = c6340a;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(OziCellCenterScope oziCellCenterScope, InterfaceC3967k interfaceC3967k, Integer num) {
        OziCellCenterScope OziCell = oziCellCenterScope;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(OziCell, "$this$OziCell");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(OziCell) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C6340a c6340a = this.f55802b;
            if (c6340a.d()) {
                interfaceC3967k2.o(-314106698);
                i.b(OziCell, c6340a, interfaceC3967k2, intValue & 14);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-314059113);
                i.d(OziCell, c6340a, interfaceC3967k2, intValue & 14);
                interfaceC3967k2.k();
            }
        }
        return Unit.f71690a;
    }
}
