package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class F extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.c f55792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f55793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(eb0.c cVar, androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f55792b = cVar;
        this.f55793c = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        G.a(this.f55792b, this.f55793c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
