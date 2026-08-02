package androidx.compose.ui.platform;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Y extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f40780b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5279r0 f40781c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f40782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(AndroidComposeView androidComposeView, C5279r0 c5279r0, C4912a c4912a) {
        super(2);
        this.f40780b = androidComposeView;
        this.f40781c = c5279r0;
        this.f40782d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            K0.a(this.f40780b, this.f40781c, this.f40782d, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
