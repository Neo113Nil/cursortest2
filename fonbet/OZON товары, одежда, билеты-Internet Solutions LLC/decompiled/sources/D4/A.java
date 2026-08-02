package D4;

import B4.C2581j;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B4.P f5782b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B4.L f5783c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f5784d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e1.d f5785e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5786f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5787g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5788h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5789i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(B4.P p11, B4.L l11, androidx.compose.ui.e eVar, e1.d dVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11) {
        super(2);
        this.f5782b = p11;
        this.f5783c = l11;
        this.f5784d = eVar;
        this.f5785e = dVar;
        this.f5786f = function1;
        this.f5787g = function12;
        this.f5788h = function13;
        this.f5789i = function14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        Function1<l0.r<C2581j>, androidx.compose.animation.q> function1 = this.f5788h;
        Function1<l0.r<C2581j>, androidx.compose.animation.s> function12 = this.f5789i;
        Function1<l0.r<C2581j>, androidx.compose.animation.q> function13 = this.f5786f;
        Function1<l0.r<C2581j>, androidx.compose.animation.s> function14 = this.f5787g;
        X.a(this.f5782b, this.f5783c, this.f5784d, this.f5785e, function13, function14, function1, function12, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
