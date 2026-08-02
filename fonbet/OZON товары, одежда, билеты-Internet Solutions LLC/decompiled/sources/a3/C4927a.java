package a3;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4927a extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4927a(@NotNull ComponentCallbacksC5392m fragment, @NotNull String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
    }
}
