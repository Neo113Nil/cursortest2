package a3;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull ComponentCallbacksC5392m fragment, boolean z11) {
        super(fragment, "Attempting to set user visible hint to " + z11 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
