package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Z1 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z1(InterfaceC3793z1 interfaceC3793z1) {
        super(0);
        this.f20954b = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f20954b.dismiss();
        return Unit.f71690a;
    }
}
