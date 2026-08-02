package D4;

import B4.C2581j;
import D4.C2830e;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC7772p;

/* loaded from: classes8.dex */
final class L extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2581j f5828b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7772p f5829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(C2581j c2581j, InterfaceC7772p interfaceC7772p) {
        super(2);
        this.f5828b = c2581j;
        this.f5829c = interfaceC7772p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C2581j c2581j = this.f5828b;
            B4.H d11 = c2581j.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((C4912a) ((C2830e.a) d11).A()).invoke(this.f5829c, c2581j, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
