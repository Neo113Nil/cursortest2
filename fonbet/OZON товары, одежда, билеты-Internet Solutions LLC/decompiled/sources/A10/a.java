package A10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String holder, @NotNull Exception cause) {
        super("Holder may contain measure or layout exception (if page isn't refreshed): ".concat(holder), cause);
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
