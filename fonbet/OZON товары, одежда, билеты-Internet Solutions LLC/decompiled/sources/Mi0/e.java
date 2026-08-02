package Mi0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f18095b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f18096c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Qi0.a f18097d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f18098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(n nVar, String str, Qi0.a aVar, int i11) {
        super(2);
        this.f18095b = nVar;
        this.f18096c = str;
        this.f18097d = aVar;
        this.f18098e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f18098e | 1);
        String str = this.f18096c;
        Qi0.a aVar = this.f18097d;
        n.f(this.f18095b, str, aVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
