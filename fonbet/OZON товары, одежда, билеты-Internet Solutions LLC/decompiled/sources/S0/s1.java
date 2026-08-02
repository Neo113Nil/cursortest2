package S0;

import Ae.InterfaceC2395h;
import S0.InterfaceC3967k;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final /* synthetic */ class s1 {
    @NotNull
    public static final InterfaceC3978p0 a(InterfaceC3967k interfaceC3967k, Object obj, @NotNull Function2 function2) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(obj, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        Unit unit = Unit.f71690a;
        boolean F11 = interfaceC3967k.F(function2);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new p1(function2, interfaceC3978p0, null);
            interfaceC3967k.x(C12);
        }
        Q.e(interfaceC3967k, unit, (Function2) C12);
        return interfaceC3978p0;
    }

    @NotNull
    public static final InterfaceC3978p0 b(Object obj, InterfaceC2395h interfaceC2395h, Object obj2, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(obj, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        boolean F11 = interfaceC3967k.F(function2);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new q1(function2, interfaceC3978p0, null);
            interfaceC3967k.x(C12);
        }
        Q.g(interfaceC2395h, obj2, (Function2) C12, interfaceC3967k);
        return interfaceC3978p0;
    }

    @NotNull
    public static final InterfaceC3978p0 c(Object obj, @NotNull Object[] objArr, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(obj, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean F11 = interfaceC3967k.F(function2);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new r1(function2, interfaceC3978p0, null);
            interfaceC3967k.x(C12);
        }
        Q.h(copyOf, (Function2) C12, interfaceC3967k);
        return interfaceC3978p0;
    }
}
