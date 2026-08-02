package S0;

import De.C2862e;
import S0.InterfaceC3967k;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final N f25306a = new N();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25307b = 0;

    public static final void a(Object obj, Object obj2, Object obj3, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k) {
        boolean n11 = interfaceC3967k.n(obj) | interfaceC3967k.n(obj2) | interfaceC3967k.n(obj3);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new L(function1);
            interfaceC3967k.x(C11);
        }
    }

    public static final void b(Object obj, Object obj2, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k) {
        boolean n11 = interfaceC3967k.n(obj) | interfaceC3967k.n(obj2);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new L(function1);
            interfaceC3967k.x(C11);
        }
    }

    public static final void c(Object obj, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k) {
        boolean n11 = interfaceC3967k.n(obj);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new L(function1);
            interfaceC3967k.x(C11);
        }
    }

    public static final void d(@NotNull Object[] objArr, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k) {
        boolean z11 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z11 |= interfaceC3967k.n(obj);
        }
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            interfaceC3967k.x(new L(function1));
        }
    }

    public static final void e(InterfaceC3967k interfaceC3967k, Object obj, @NotNull Function2 function2) {
        CoroutineContext w11 = interfaceC3967k.w();
        boolean n11 = interfaceC3967k.n(obj);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3946c0(w11, function2);
            interfaceC3967k.x(C11);
        }
    }

    public static final void f(Object obj, Object obj2, Object obj3, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k) {
        CoroutineContext w11 = interfaceC3967k.w();
        boolean n11 = interfaceC3967k.n(obj) | interfaceC3967k.n(obj2) | interfaceC3967k.n(obj3);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3946c0(w11, function2);
            interfaceC3967k.x(C11);
        }
    }

    public static final void g(Object obj, Object obj2, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k) {
        CoroutineContext w11 = interfaceC3967k.w();
        boolean n11 = interfaceC3967k.n(obj) | interfaceC3967k.n(obj2);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3946c0(w11, function2);
            interfaceC3967k.x(C11);
        }
    }

    public static final void h(@NotNull Object[] objArr, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k) {
        CoroutineContext w11 = interfaceC3967k.w();
        boolean z11 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z11 |= interfaceC3967k.n(obj);
        }
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            interfaceC3967k.x(new C3946c0(w11, function2));
        }
    }

    @NotNull
    public static final C2862e j(@NotNull kotlin.coroutines.g gVar, @NotNull InterfaceC3967k interfaceC3967k) {
        B0.a key = xe.B0.f105374o0;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext w11 = interfaceC3967k.w();
        return xe.N.a(w11.plus(new xe.D0((xe.B0) w11.get(key))).plus(gVar));
    }
}
