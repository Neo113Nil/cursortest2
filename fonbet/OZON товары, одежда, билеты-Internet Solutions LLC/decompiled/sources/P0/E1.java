package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class E1 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20619b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A<InterfaceC3793z1> f20620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E1(InterfaceC3793z1 interfaceC3793z1, A<InterfaceC3793z1> a11) {
        super(0);
        this.f20619b = interfaceC3793z1;
        this.f20620c = a11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        A<InterfaceC3793z1> a11 = this.f20620c;
        Object a12 = a11.a();
        InterfaceC3793z1 interfaceC3793z1 = this.f20619b;
        if (!Intrinsics.d(interfaceC3793z1, a12)) {
            kotlin.collections.C.h(a11.b(), new D1(interfaceC3793z1));
            S0.I0 c11 = a11.c();
            if (c11 != null) {
                c11.invalidate();
            }
        }
        return Unit.f71690a;
    }
}
