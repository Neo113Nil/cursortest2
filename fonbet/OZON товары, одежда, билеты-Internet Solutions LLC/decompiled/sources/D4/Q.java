package D4;

import B4.C2581j;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B4.P f5854b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B4.L f5855c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f5856d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e1.d f5857e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5858f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5859g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5860h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5861i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f5862j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(B4.P p11, B4.L l11, androidx.compose.ui.e eVar, e1.d dVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11) {
        super(2);
        this.f5854b = p11;
        this.f5855c = l11;
        this.f5856d = eVar;
        this.f5857e = dVar;
        this.f5858f = function1;
        this.f5859g = function12;
        this.f5860h = function13;
        this.f5861i = function14;
        this.f5862j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f5862j | 1);
        Function1<l0.r<C2581j>, androidx.compose.animation.s> function1 = this.f5859g;
        Function1<l0.r<C2581j>, androidx.compose.animation.q> function12 = this.f5860h;
        X.c(this.f5854b, this.f5855c, this.f5856d, this.f5857e, this.f5858f, function1, function12, this.f5861i, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
