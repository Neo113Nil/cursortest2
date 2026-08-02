package Ri0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25136b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.f25136b = function0;
        this.f25137c = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            dj0.e.a(null, null, a1.c.c(-25349481, new d(this.f25136b, this.f25137c), interfaceC3967k2), interfaceC3967k2, 384, 3);
        }
        return Unit.f71690a;
    }
}
