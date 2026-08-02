package B0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2502q extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q1.K f1896b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Q1.K> f1897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2502q(Q1.K k11, InterfaceC3978p0<Q1.K> interfaceC3978p0) {
        super(0);
        this.f1896b = k11;
        this.f1897c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Q1.K k11 = this.f1896b;
        long e11 = k11.e();
        InterfaceC3978p0<Q1.K> interfaceC3978p0 = this.f1897c;
        if (!K1.Q.d(e11, interfaceC3978p0.getValue().e()) || !Intrinsics.d(k11.d(), interfaceC3978p0.getValue().d())) {
            interfaceC3978p0.setValue(k11);
        }
        return Unit.f71690a;
    }
}
