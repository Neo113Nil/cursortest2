package Gf0;

import J0.C3309k0;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Gf0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3110m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f10198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3110m(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(2);
        this.f10198b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3309k0.f13256a.a(this.f10198b.getValue().booleanValue(), null, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
