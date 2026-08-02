package Gf0;

import J0.u3;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9890C;

/* renamed from: Gf0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3113p extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, String> f10203b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f10204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3113p(Enum r12, Function1 function1) {
        super(3);
        this.f10203b = function1;
        this.f10204c = r12;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9890C DropdownMenuItem = interfaceC9890C;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u3.b(this.f10203b.invoke(this.f10204c), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
