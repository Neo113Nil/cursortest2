package Gf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Gf0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3107j extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f10195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3107j(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.f10195b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.f10195b.setValue(bool2);
        return Unit.f71690a;
    }
}
