package M20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f17284b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f17285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, int i11) {
        super(2);
        this.f17284b = lVar;
        this.f17285c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f17285c | 1);
        l.t(this.f17284b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
