package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class C extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.i f13695b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13696c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Unit> f13697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(a.i iVar, androidx.compose.ui.e eVar, Function1 function1, int i11) {
        super(2);
        this.f13695b = iVar;
        this.f13696c = eVar;
        this.f13697d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        Function1<Integer, Unit> function1 = this.f13697d;
        D.b(this.f13695b, this.f13696c, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
