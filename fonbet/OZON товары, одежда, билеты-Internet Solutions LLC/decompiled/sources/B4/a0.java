package B4;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a0 {
    @NotNull
    public static final C2584m a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C2584m c2584m = (C2584m) kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.q(view, Y.f2597b), Z.f2598b));
        if (c2584m != null) {
            return c2584m;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
