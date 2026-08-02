package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import eb0.C6340a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OziCellCenterScope f55810b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6340a f55811c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f55812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(OziCellCenterScope oziCellCenterScope, C6340a c6340a, int i11) {
        super(2);
        this.f55810b = oziCellCenterScope;
        this.f55811c = c6340a;
        this.f55812d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f55812d | 1);
        i.d(this.f55810b, this.f55811c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
