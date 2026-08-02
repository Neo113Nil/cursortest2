package Mi0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f18112b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Qi0.f f18113c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, Qi0.f fVar, int i11) {
        super(2);
        this.f18112b = nVar;
        this.f18113c = fVar;
        this.f18114d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f18114d | 1);
        n.h(this.f18112b, this.f18113c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
