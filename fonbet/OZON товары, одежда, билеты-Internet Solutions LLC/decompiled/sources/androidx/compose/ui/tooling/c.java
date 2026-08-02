package androidx.compose.ui.tooling;

import J0.O0;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object[] f41125b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f41126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(InterfaceC3972m0 interfaceC3972m0, Object[] objArr) {
        super(2);
        this.f41125b = objArr;
        this.f41126c = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C4912a c4912a = W1.b.f33190a;
            Object[] objArr = this.f41125b;
            boolean F11 = interfaceC3967k2.F(objArr);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(this.f41126c, objArr);
                interfaceC3967k2.x(C11);
            }
            O0.a((Function0) C11, null, null, 0L, 0L, null, interfaceC3967k2, 6);
        }
        return Unit.f71690a;
    }
}
