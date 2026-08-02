package B1;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class x0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y0 f2161b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f2162c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<z0, Z1.b, W> f2163d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f2164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x0(y0 y0Var, androidx.compose.ui.e eVar, Function2 function2, int i11) {
        super(2);
        this.f2161b = y0Var;
        this.f2162c = eVar;
        this.f2163d = function2;
        this.f2164e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f2164e | 1);
        Function2<z0, Z1.b, W> function2 = this.f2163d;
        v0.a(this.f2161b, this.f2162c, function2, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
