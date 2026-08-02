package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Z0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3339s f13112b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D3 f13113c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3286e2 f13114d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f13115e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f13116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z0(C3339s c3339s, D3 d32, C3286e2 c3286e2, Function2 function2, int i11) {
        super(2);
        this.f13112b = c3339s;
        this.f13113c = d32;
        this.f13114d = c3286e2;
        this.f13115e = function2;
        this.f13116f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        C3265a1.a(this.f13112b, this.f13113c, this.f13114d, this.f13115e, interfaceC3967k, C2652m.e(this.f13116f | 1));
        return Unit.f71690a;
    }
}
