package S0;

import a1.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B {
    public static final <T> T a(@NotNull A0 a02, @NotNull AbstractC3992x<T> abstractC3992x) {
        Intrinsics.g(abstractC3992x, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        G1<T> g12 = (G1<T>) a02.get(abstractC3992x);
        if (g12 == null) {
            g12 = abstractC3992x.a();
        }
        return (T) g12.a(a02);
    }

    @NotNull
    public static final A0 b(@NotNull H0<?>[] h0Arr, @NotNull A0 a02, @NotNull A0 a03) {
        a1.e eVar;
        eVar = a1.e.f36181g;
        eVar.getClass();
        e.a aVar = new e.a(eVar);
        for (H0<?> h02 : h0Arr) {
            G0 g02 = (G0) h02.b();
            if (h02.a() || !a02.containsKey(g02)) {
                aVar.put(g02, g02.b(h02, (G1) a03.get(g02)));
            }
        }
        return aVar.build();
    }
}
