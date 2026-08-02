package Q0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class u extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f22800b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f22801c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f22802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    u(long j11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
        super(2);
        this.f22800b = j11;
        this.f22801c = function2;
        this.f22802d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f22802d | 1);
        A.c(this.f22800b, this.f22801c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
