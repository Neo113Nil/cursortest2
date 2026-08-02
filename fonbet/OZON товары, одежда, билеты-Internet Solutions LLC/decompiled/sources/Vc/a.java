package Vc;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends e {
    /* JADX WARN: Type inference failed for: r0v3, types: [Vc.b] */
    @NotNull
    public static b a(@NotNull final Function1... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: Vc.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (Function1 function1 : selectors) {
                        int b11 = a.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                        if (b11 != 0) {
                            return b11;
                        }
                    }
                    return 0;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int c(@NotNull int[] other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i12 : other) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    @NotNull
    public static Comparable d(@NotNull Comparable a11, @NotNull Comparable b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return a11.compareTo(b11) <= 0 ? a11 : b11;
    }

    @NotNull
    public static Comparator e() {
        f fVar = f.f28532a;
        Intrinsics.g(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return fVar;
    }
}
