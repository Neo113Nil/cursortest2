package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class q2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K1.T f21311b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f21312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(K1.T t2, C4912a c4912a, int i11) {
        super(2);
        this.f21311b = t2;
        this.f21312c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        C4912a c4912a = this.f21312c;
        p2.a(this.f21311b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
