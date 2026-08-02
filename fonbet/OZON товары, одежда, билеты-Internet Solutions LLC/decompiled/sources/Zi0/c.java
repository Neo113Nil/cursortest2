package Zi0;

import P0.C3756n;
import P0.I;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3756n f36008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f36009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(C3756n c3756n, C4912a c4912a) {
        super(2);
        this.f36008b = c3756n;
        this.f36009c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            I.a(this.f36008b, null, null, a1.c.c(1868666179, new b(this.f36009c), interfaceC3967k2), interfaceC3967k2, 3072);
        }
        return Unit.f71690a;
    }
}
