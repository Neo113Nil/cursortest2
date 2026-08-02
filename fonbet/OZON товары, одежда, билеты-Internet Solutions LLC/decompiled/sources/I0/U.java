package I0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class U extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f11377b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3220z f11378c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<C3220z, Unit> f11379d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f11380e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f11381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(androidx.compose.ui.e eVar, C3220z c3220z, Function1 function1, C4912a c4912a, int i11) {
        super(2);
        this.f11377b = eVar;
        this.f11378c = c3220z;
        this.f11379d = function1;
        this.f11380e = c4912a;
        this.f11381f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f11381f | 1);
        C4912a c4912a = this.f11380e;
        W.b(this.f11377b, this.f11378c, this.f11379d, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
