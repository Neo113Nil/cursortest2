package J0;

import S0.InterfaceC3972m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3333q0 extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3333q0(InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.f13362b = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f13362b.d(num.intValue());
        return Unit.f71690a;
    }
}
