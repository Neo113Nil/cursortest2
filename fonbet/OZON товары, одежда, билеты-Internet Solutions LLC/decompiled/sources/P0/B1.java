package P0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class B1 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B1(InterfaceC3793z1 interfaceC3793z1) {
        super(0);
        this.f20599b = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f20599b.dismiss();
        return Boolean.TRUE;
    }
}
