package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import eb0.C6340a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;

/* renamed from: bb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5618a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OziCellCenterScope f55794b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6340a f55795c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f55796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5618a(OziCellCenterScope oziCellCenterScope, C6340a c6340a, int i11) {
        super(2);
        this.f55794b = oziCellCenterScope;
        this.f55795c = c6340a;
        this.f55796d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f55796d | 1);
        i.b(this.f55794b, this.f55795c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
