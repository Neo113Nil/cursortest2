package androidx.compose.foundation.lazy.layout;

import B1.W;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import x0.InterfaceC10573B;

/* loaded from: classes8.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.n f39659b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39660c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f39661d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC10573B, Z1.b, W> f39662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(kotlin.reflect.n nVar, androidx.compose.ui.e eVar, o oVar, Function2 function2, int i11) {
        super(2);
        this.f39659b = nVar;
        this.f39660c = eVar;
        this.f39661d = oVar;
        this.f39662e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        n.a(this.f39659b, this.f39660c, this.f39661d, this.f39662e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
