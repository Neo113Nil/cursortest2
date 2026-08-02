package J0;

import S0.InterfaceC3972m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3313l0 extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13274b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3313l0(InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.f13274b = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f13274b.d(num.intValue());
        return Unit.f71690a;
    }
}
