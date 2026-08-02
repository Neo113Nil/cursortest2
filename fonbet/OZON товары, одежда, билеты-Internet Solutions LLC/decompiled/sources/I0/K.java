package I0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class K extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f11329b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f11330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(e.a aVar, C4912a c4912a, int i11) {
        super(2);
        this.f11329b = aVar;
        this.f11330c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        C4912a c4912a = this.f11330c;
        W.a(this.f11329b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
