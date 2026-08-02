package androidx.compose.foundation.layout;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9905n;

/* renamed from: androidx.compose.foundation.layout.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5198v extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f39566b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5198v(C4912a c4912a) {
        super(2);
        this.f39566b = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f39566b.invoke(C9905n.f99667a, interfaceC3967k2, 6);
        }
        return Unit.f71690a;
    }
}
