package Q0;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class t extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f22796b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ T f22797c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f22798d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f22799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    t(long j11, T t2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
        super(2);
        this.f22796b = j11;
        this.f22797c = t2;
        this.f22798d = function2;
        this.f22799e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f22799e | 1);
        T t2 = this.f22797c;
        Function2<InterfaceC3967k, Integer, Unit> function2 = this.f22798d;
        A.b(this.f22796b, t2, function2, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
