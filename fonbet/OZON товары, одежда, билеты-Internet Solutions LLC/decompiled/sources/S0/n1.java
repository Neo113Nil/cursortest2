package S0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import S0.InterfaceC3967k;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n1 {
    @NotNull
    public static final InterfaceC3978p0 a(@NotNull InterfaceC2395h interfaceC2395h, Object obj, CoroutineContext coroutineContext, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 2) != 0) {
            coroutineContext = kotlin.coroutines.g.f71771a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        boolean F11 = interfaceC3967k.F(coroutineContext2) | interfaceC3967k.F(interfaceC2395h);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new t1(coroutineContext2, interfaceC2395h, null);
            interfaceC3967k.x(C11);
        }
        return s1.b(obj, interfaceC2395h, coroutineContext2, (Function2) C11, interfaceC3967k, ((i11 >> 3) & 14) | ((i11 << 3) & 112) | (i11 & 896));
    }

    @NotNull
    public static final InterfaceC3978p0 b(@NotNull Ae.M0 m02, InterfaceC3967k interfaceC3967k) {
        return a(m02, m02.getValue(), kotlin.coroutines.g.f71771a, interfaceC3967k, 0, 0);
    }

    @NotNull
    public static final U0.b<K> c() {
        return o1.b();
    }

    @NotNull
    public static final <T> A1<T> d(@NotNull l1<T> l1Var, @NotNull Function0<? extends T> function0) {
        int i11 = o1.f25498c;
        return new I(l1Var, function0);
    }

    @NotNull
    public static final <T> A1<T> e(@NotNull Function0<? extends T> function0) {
        int i11 = o1.f25498c;
        return new I(null, function0);
    }

    @NotNull
    public static final C3991w0 f(Object obj, @NotNull l1 l1Var) {
        int i11 = C3939a.f25331c;
        return new C3991w0(obj, l1Var);
    }

    @NotNull
    public static final <T> l1<T> h() {
        return C3980q0.f25505a;
    }

    @NotNull
    public static final InterfaceC3978p0 i(InterfaceC3967k interfaceC3967k, Object obj, @NotNull Function2 function2) {
        return s1.a(interfaceC3967k, obj, function2);
    }

    @NotNull
    public static final InterfaceC3978p0 j(Object obj, @NotNull Object[] objArr, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k) {
        return s1.c(obj, objArr, function2, interfaceC3967k);
    }

    @NotNull
    public static final <T> l1<T> k() {
        return S0.f25310a;
    }

    @NotNull
    public static final InterfaceC3978p0 l(Object obj, InterfaceC3967k interfaceC3967k) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = f(obj, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3978p0.setValue(obj);
        return interfaceC3978p0;
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> m(@NotNull Function0<? extends T> function0) {
        return C2399j.A(new u1(function0, null));
    }

    @NotNull
    public static final <T> l1<T> n() {
        return D1.f25195a;
    }
}
