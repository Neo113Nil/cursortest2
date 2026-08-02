package Ae;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ae.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C2423x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2421v f1163a = new C2421v();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C2422w f1164b = new C2422w();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull InterfaceC2395h<? extends T> interfaceC2395h) {
        return interfaceC2395h instanceof M0 ? interfaceC2395h : d(interfaceC2395h, f1163a, f1164b);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> b(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        C2421v c2421v = f1163a;
        Intrinsics.g(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        kotlin.jvm.internal.U.g(2, function2);
        return d(interfaceC2395h, c2421v, function2);
    }

    @NotNull
    public static final <T, K> InterfaceC2395h<T> c(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function1<? super T, ? extends K> function1) {
        return d(interfaceC2395h, function1, f1164b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> InterfaceC2395h<T> d(InterfaceC2395h<? extends T> interfaceC2395h, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (interfaceC2395h instanceof C2391f) {
            C2391f c2391f = (C2391f) interfaceC2395h;
            if (c2391f.f975b == function1 && c2391f.f976c == function2) {
                return interfaceC2395h;
            }
        }
        return new C2391f(interfaceC2395h, function1, function2);
    }
}
