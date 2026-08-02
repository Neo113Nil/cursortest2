package If0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class B extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12347b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12348c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f12349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B(J j11, Function1<? super I, Unit> function1, int i11) {
        super(2);
        this.f12347b = j11;
        this.f12348c = function1;
        this.f12349d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12349d | 1);
        C3250p.j(this.f12347b, this.f12348c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
