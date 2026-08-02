package B1;

import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes.dex */
final class H extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<Function2<InterfaceC3967k, Integer, Unit>> f2032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    H(List<? extends Function2<? super InterfaceC3967k, ? super Integer, Unit>> list) {
        super(2);
        this.f2032b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            List<Function2<InterfaceC3967k, Integer, Unit>> list = this.f2032b;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Function2<InterfaceC3967k, Integer, Unit> function2 = list.get(i11);
                int I11 = interfaceC3967k2.I();
                InterfaceC2801g.f5440U.getClass();
                Function0 i12 = InterfaceC2801g.a.i();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(i12);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 b11 = InterfaceC2801g.a.b();
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(b11, I11, interfaceC3967k2, I11);
                }
                function2.invoke(interfaceC3967k2, 0);
                interfaceC3967k2.f();
            }
        }
        return Unit.f71690a;
    }
}
