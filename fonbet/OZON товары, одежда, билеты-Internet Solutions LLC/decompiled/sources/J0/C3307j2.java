package J0;

import I1.C3222a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.j2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3307j2 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3307j2(InterfaceC3295g2 interfaceC3295g2) {
        super(1);
        this.f13250b = interfaceC3295g2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.n(d12);
        d12.b(I1.k.f(), new C3222a(null, new C3303i2(this.f13250b)));
        return Unit.f71690a;
    }
}
