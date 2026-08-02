package Ri0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class m extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f25149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.f25149b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25149b.setValue(Boolean.TRUE);
        return Unit.f71690a;
    }
}
