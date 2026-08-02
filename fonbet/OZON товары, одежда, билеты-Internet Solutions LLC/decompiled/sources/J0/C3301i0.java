package J0;

import S0.InterfaceC3967k;
import i1.C6994n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3301i0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3301i0(boolean z11) {
        super(2);
        this.f13237b = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            T0.b(N0.q.a(), "Trailing icon for exposed dropdown menu", C6994n.a(androidx.compose.ui.e.f40358c0, this.f13237b ? 180.0f : 360.0f), interfaceC3967k2, 8);
        }
        return Unit.f71690a;
    }
}
