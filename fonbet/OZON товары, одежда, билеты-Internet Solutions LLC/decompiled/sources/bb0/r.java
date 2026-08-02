package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.f f55830b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f55831c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f55832d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f55833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(eb0.f fVar, Function0<Unit> function0, Function0<Unit> function02, int i11) {
        super(2);
        this.f55830b = fVar;
        this.f55831c = function0;
        this.f55832d = function02;
        this.f55833e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f55833e | 1);
        Function0<Unit> function0 = this.f55831c;
        Function0<Unit> function02 = this.f55832d;
        x.b(this.f55830b, function0, function02, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
