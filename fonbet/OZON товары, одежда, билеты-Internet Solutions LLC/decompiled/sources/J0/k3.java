package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* loaded from: classes8.dex */
final class k3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13263b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f13264c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13265d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13266e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f13267f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13268g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f13269h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f13270i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C9915y f13271j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f13272k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k3(androidx.compose.ui.e eVar, Function2 function2, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, boolean z11, float f7, C9915y c9915y, int i11) {
        super(2);
        this.f13263b = eVar;
        this.f13264c = function2;
        this.f13265d = c4912a;
        this.f13266e = c4912a2;
        this.f13267f = c4912a3;
        this.f13268g = c4912a4;
        this.f13269h = z11;
        this.f13270i = f7;
        this.f13271j = c9915y;
        this.f13272k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13272k | 1);
        C4912a c4912a = this.f13268g;
        boolean z11 = this.f13269h;
        l3.a(this.f13263b, this.f13264c, this.f13265d, this.f13266e, this.f13267f, c4912a, z11, this.f13270i, this.f13271j, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
