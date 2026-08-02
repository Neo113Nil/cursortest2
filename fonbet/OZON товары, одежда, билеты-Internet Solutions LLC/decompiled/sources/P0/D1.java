package P0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class D1 extends AbstractC7737t implements Function1<C3791z<InterfaceC3793z1>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D1(InterfaceC3793z1 interfaceC3793z1) {
        super(1);
        this.f20610b = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C3791z<InterfaceC3793z1> c3791z) {
        return Boolean.valueOf(Intrinsics.d(c3791z.c(), this.f20610b));
    }
}
