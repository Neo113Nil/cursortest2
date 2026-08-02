package Gf0;

import J0.AbstractC3289f0;
import J0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements InterfaceC6511n<AbstractC3289f0, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, String> f10209b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f10210c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f10211d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f10212e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Xc.a<Object> f10213f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f10214g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(Function1<Object, String> function1, Object obj, String str, InterfaceC3978p0<Boolean> interfaceC3978p0, Xc.a<Object> aVar, Function1<Object, Unit> function12) {
        super(3);
        this.f10209b = function1;
        this.f10210c = obj;
        this.f10211d = str;
        this.f10212e = interfaceC3978p0;
        this.f10213f = aVar;
        this.f10214g = function12;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(AbstractC3289f0 abstractC3289f0, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3978p0<Boolean> interfaceC3978p0;
        AbstractC3289f0 ExposedDropdownMenuBox = abstractC3289f0;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? interfaceC3967k2.n(ExposedDropdownMenuBox) : interfaceC3967k2.F(ExposedDropdownMenuBox) ? 4 : 2;
        }
        int i11 = intValue;
        if ((i11 & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            Object obj = this.f10210c;
            Function1<Object, String> function1 = this.f10209b;
            String invoke = function1.invoke(obj);
            interfaceC3967k2.o(724484873);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3108k.f10196b;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C4912a c11 = a1.c.c(362977134, new C3109l(this.f10211d), interfaceC3967k2);
            InterfaceC3978p0<Boolean> interfaceC3978p02 = this.f10212e;
            F1.b(invoke, (Function1) C11, e11, false, true, null, c11, null, a1.c.c(-2047189967, new C3110m(interfaceC3978p02), interfaceC3967k2), false, null, null, null, false, 0, 0, null, null, interfaceC3967k2, 806904240, 0, 1047976);
            boolean booleanValue = interfaceC3978p02.getValue().booleanValue();
            interfaceC3967k2.o(724493435);
            Object C12 = interfaceC3967k2.C();
            if (C12 == InterfaceC3967k.a.a()) {
                interfaceC3978p0 = interfaceC3978p02;
                C12 = new C3111n(interfaceC3978p0);
                interfaceC3967k2.x(C12);
            } else {
                interfaceC3978p0 = interfaceC3978p02;
            }
            interfaceC3967k2.k();
            ExposedDropdownMenuBox.a(booleanValue, (Function0) C12, null, null, a1.c.c(1590161943, new C3114q(this.f10213f, this.f10214g, interfaceC3978p0, function1), interfaceC3967k2), interfaceC3967k2, 24624 | ((i11 << 15) & 458752));
        }
        return Unit.f71690a;
    }
}
