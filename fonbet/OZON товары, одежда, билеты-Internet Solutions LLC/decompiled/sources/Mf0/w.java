package Mf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class w extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f18058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.f18058b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f18058b.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
        return Unit.f71690a;
    }
}
