package If0;

import If0.J;
import J0.u3;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9890C;

/* renamed from: If0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3254u extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J.a f12473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3254u(J.a aVar) {
        super(3);
        this.f12473b = aVar;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9890C TextButton = interfaceC9890C;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u3.b(this.f12473b.c() ? "Отписаться от обновлений" : "Подписаться на обновления", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
