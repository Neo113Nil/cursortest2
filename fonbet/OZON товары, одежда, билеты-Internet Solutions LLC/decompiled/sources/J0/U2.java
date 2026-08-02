package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class U2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W2 f13013b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13014c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f13015d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.o f13016e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ T2 f13017f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ A0.a f13018g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f13019h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f13020i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U2(W2 w22, boolean z11, boolean z12, t0.o oVar, T2 t2, A0.a aVar, float f7, float f11, int i11) {
        super(2);
        this.f13013b = w22;
        this.f13014c = z11;
        this.f13015d = z12;
        this.f13016e = oVar;
        this.f13017f = t2;
        this.f13018g = aVar;
        this.f13019h = f7;
        this.f13020i = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(12582913);
        T2 t2 = this.f13017f;
        A0.a aVar = this.f13018g;
        this.f13013b.a(this.f13014c, this.f13015d, this.f13016e, t2, aVar, this.f13019h, this.f13020i, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
