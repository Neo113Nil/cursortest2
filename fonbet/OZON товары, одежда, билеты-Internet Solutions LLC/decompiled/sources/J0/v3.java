package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class v3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K1.T f13454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13455c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v3(K1.T t2, C4912a c4912a, int i11) {
        super(2);
        this.f13454b = t2;
        this.f13455c = c4912a;
        this.f13456d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13456d | 1);
        C4912a c4912a = this.f13455c;
        u3.a(this.f13454b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
