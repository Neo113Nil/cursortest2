package Mi0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f18100b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Qi0.b f18101c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(n nVar, Qi0.b bVar, int i11) {
        super(2);
        this.f18100b = nVar;
        this.f18101c = bVar;
        this.f18102d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f18102d | 1);
        n.g(this.f18100b, this.f18101c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
