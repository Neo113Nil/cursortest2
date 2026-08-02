package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class I2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f12848b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f12849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I2(C4912a c4912a, int i11) {
        super(2);
        this.f12848b = c4912a;
        this.f12849c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12849c | 1);
        J2.d(this.f12848b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
