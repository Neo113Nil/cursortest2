package M00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String message, int i11) {
        super("HTTP " + i11 + " " + message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
