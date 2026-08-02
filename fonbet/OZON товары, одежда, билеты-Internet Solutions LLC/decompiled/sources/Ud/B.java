package Ud;

import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f27586a;

    static {
        Sd.c[] elements = {new Sd.c("kotlin.internal.NoInfer"), new Sd.c("kotlin.internal.Exact")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f27586a = C7705l.j0(elements);
    }

    @NotNull
    public static Set a() {
        return f27586a;
    }
}
