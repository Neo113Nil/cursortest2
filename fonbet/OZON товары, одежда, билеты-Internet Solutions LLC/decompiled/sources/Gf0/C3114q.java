package Gf0;

import J0.C3278d;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import fd.InterfaceC6511n;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9895d;

/* renamed from: Gf0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3114q extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Xc.a<Object> f10205b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f10206c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f10207d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Object, String> f10208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3114q(Xc.a<Object> aVar, Function1<Object, Unit> function1, InterfaceC3978p0<Boolean> interfaceC3978p0, Function1<Object, String> function12) {
        super(3);
        this.f10205b = aVar;
        this.f10206c = function1;
        this.f10207d = interfaceC3978p0;
        this.f10208e = function12;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d ExposedDropdownMenu = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Iterator<E> it = this.f10205b.iterator();
            while (it.hasNext()) {
                Enum r92 = (Enum) it.next();
                interfaceC3967k2.o(825232908);
                Function1<Object, Unit> function1 = this.f10206c;
                boolean n11 = interfaceC3967k2.n(function1) | interfaceC3967k2.F(r92);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C3112o(function1, r92, this.f10207d);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                C3278d.a((Function0) C11, null, false, null, a1.c.c(-169308318, new C3113p(r92, this.f10208e), interfaceC3967k2), interfaceC3967k2, 196608);
            }
        }
        return Unit.f71690a;
    }
}
