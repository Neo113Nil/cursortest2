package androidx.compose.ui.platform;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class u2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x2 f41026b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f41027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u2(x2 x2Var, C4912a c4912a) {
        super(2);
        this.f41026b = x2Var;
        this.f41027c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            AndroidCompositionLocals_androidKt.a(this.f41026b.x(), this.f41027c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
