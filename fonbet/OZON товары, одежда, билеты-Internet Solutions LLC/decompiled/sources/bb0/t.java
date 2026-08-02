package bb0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class t extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.g f55835b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f55836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(eb0.g gVar, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.f55835b = gVar;
        this.f55836c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55836c.setValue(Boolean.FALSE);
        this.f55835b.b().a();
        return Unit.f71690a;
    }
}
