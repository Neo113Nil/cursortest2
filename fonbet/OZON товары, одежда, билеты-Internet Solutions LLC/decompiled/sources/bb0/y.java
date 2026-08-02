package bb0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
final class y extends AbstractC7737t implements InterfaceC6511n<OziCellCenterScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.d f55842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(eb0.d dVar) {
        super(3);
        this.f55842b = dVar;
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
            eb0.d dVar = this.f55842b;
            OziCell.m3076Default500Rx1qByU(dVar.b(), dVar.c(), OziTestTagsKt.oziResourceIdTestTag(androidx.compose.ui.e.f40358c0, dVar.a().b(), interfaceC3967k2, 6), 0, 0, 0L, 0L, 0.0f, interfaceC3967k2, (intValue << 24) & 234881024, 248);
        }
        return Unit.f71690a;
    }
}
