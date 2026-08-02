package A10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull IllegalStateException cause) {
        super("Frozen layout state could be caused by BrokenViewHolderException. Check this non fatal.", cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
