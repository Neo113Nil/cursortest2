package P0;

import I1.C3222a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class C1 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1(InterfaceC3793z1 interfaceC3793z1) {
        super(1);
        this.f20608b = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.n(d12);
        d12.b(I1.k.f(), new C3222a(null, new B1(this.f20608b)));
        return Unit.f71690a;
    }
}
