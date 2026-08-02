package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8412e;

/* loaded from: classes.dex */
final class Z extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1625b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q1.K f1626c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.D f1627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(O0 o02, Q1.K k11, Q1.D d11) {
        super(1);
        this.f1625b = o02;
        this.f1626c = k11;
        this.f1627d = d11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
        O0 o02 = this.f1625b;
        R1 j11 = o02.j();
        if (j11 != null) {
            C2498o1.a(interfaceC8412e2.w0().a(), this.f1626c, o02.q(), o02.c(), this.f1627d, j11.e(), o02.f(), o02.p());
        }
        return Unit.f71690a;
    }
}
