package D4;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import b1.InterfaceC5505h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5505h f5928b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f5929c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f5930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(InterfaceC5505h interfaceC5505h, C4912a c4912a, int i11) {
        super(2);
        this.f5928b = interfaceC5505h;
        this.f5929c = c4912a;
        this.f5930d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f5930d | 1);
        C2843s.b(this.f5928b, this.f5929c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
