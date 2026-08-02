package B0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements Function1<Q1.K, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f1909b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Q1.K> f1910c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f1911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    r(Function1<? super String, Unit> function1, InterfaceC3978p0<Q1.K> interfaceC3978p0, InterfaceC3978p0<String> interfaceC3978p02) {
        super(1);
        this.f1909b = function1;
        this.f1910c = interfaceC3978p0;
        this.f1911d = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Q1.K k11) {
        Q1.K k12 = k11;
        this.f1910c.setValue(k12);
        InterfaceC3978p0<String> interfaceC3978p0 = this.f1911d;
        boolean d11 = Intrinsics.d(interfaceC3978p0.getValue(), k12.f());
        interfaceC3978p0.setValue(k12.f());
        if (!d11) {
            this.f1909b.invoke(k12.f());
        }
        return Unit.f71690a;
    }
}
