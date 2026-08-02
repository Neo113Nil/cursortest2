package K20;

import Bl0.C2652m;
import L20.a;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.C0310a f15158b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f15159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(a.C0310a c0310a, e.a aVar, int i11) {
        super(2);
        this.f15158b = c0310a;
        this.f15159c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        e.b(this.f15158b, this.f15159c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
