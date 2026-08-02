package Ri0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f25150b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f25151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(b bVar, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.f25150b = bVar;
        this.f25151c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25151c.setValue(Boolean.FALSE);
        this.f25150b.e0(Si0.a.f26341a);
        return Unit.f71690a;
    }
}
