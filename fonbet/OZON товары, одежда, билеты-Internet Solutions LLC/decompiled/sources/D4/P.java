package D4;

import B4.C2581j;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class P extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B4.P f5846b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f5847c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e1.d f5848d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5849e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5850f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.q> f5851g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<l0.r<C2581j>, androidx.compose.animation.s> f5852h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<B4.M, Unit> f5853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(B4.P p11, androidx.compose.ui.e eVar, e1.d dVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i11) {
        super(2);
        this.f5846b = p11;
        this.f5847c = eVar;
        this.f5848d = dVar;
        this.f5849e = function1;
        this.f5850f = function12;
        this.f5851g = function13;
        this.f5852h = function14;
        this.f5853i = function15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1769905);
        Function1<l0.r<C2581j>, androidx.compose.animation.s> function1 = this.f5850f;
        Function1<l0.r<C2581j>, androidx.compose.animation.q> function12 = this.f5851g;
        X.b(this.f5846b, this.f5847c, this.f5848d, this.f5849e, function1, function12, this.f5852h, this.f5853i, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
