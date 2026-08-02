package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import eb0.C6340a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: bb0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5624g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6340a f55807b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<C6340a, Unit> f55808c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f55809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5624g(C6340a c6340a, Function1<? super C6340a, Unit> function1, int i11) {
        super(2);
        this.f55807b = c6340a;
        this.f55808c = function1;
        this.f55809d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f55809d | 1);
        i.c(this.f55807b, this.f55808c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
