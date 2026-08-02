package a3;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o extends m {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComponentCallbacksC5392m expectedParentFragment, int i11) {
        super(fragment, K00.b.e(i11, " without using parent's childFragmentManager", r0));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
        sb2.append(fragment);
        sb2.append(" within the view of parent fragment ");
        sb2.append(expectedParentFragment);
        sb2.append(" via container with ID ");
    }
}
