package R2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: R2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3909c extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3909c(String message) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3909c(@NotNull String message, Throwable th2) {
        super(message, th2);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
