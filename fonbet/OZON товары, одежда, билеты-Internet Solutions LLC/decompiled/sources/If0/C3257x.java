package If0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.InterfaceC10165e;

/* renamed from: If0.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3257x extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12480b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3257x(J j11, Function1<? super I, Unit> function1) {
        super(3);
        this.f12480b = j11;
        this.f12481c = function1;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC10165e item = interfaceC10165e;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3250p.k(this.f12480b, this.f12481c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
