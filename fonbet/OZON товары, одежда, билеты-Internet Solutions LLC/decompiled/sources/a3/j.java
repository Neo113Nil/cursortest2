package a3;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComponentCallbacksC5392m targetFragment, int i11) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i11 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
