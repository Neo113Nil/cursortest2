package androidx.fragment.app;

import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i0 {
    @NotNull
    public static final ComponentCallbacksC5392m a(@NotNull ViewGroup viewGroup) {
        ComponentCallbacksC5392m i02 = G.i0(viewGroup);
        if (i02 != null) {
            return i02;
        }
        throw new IllegalStateException("View " + viewGroup + " does not have a Fragment set");
    }
}
