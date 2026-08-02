package B0;

import Bl0.C2652m;
import I0.C3215w0;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class J extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3215w0 f1410b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f1411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(C3215w0 c3215w0, C4912a c4912a, int i11) {
        super(2);
        this.f1410b = c3215w0;
        this.f1411c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        L.b(this.f1410b, this.f1411c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
