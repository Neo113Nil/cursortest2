package H30;

import io.sentry.W2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p {
    @NotNull
    public static final String a(long j11) {
        if (j11 >= 1024) {
            return j11 < W2.MAX_EVENT_SIZE_BYTES ? V.e.b(new Object[]{Double.valueOf(j11 / 1024.0d)}, 1, "%.1f KB", "format(...)") : V.e.b(new Object[]{Double.valueOf(j11 / 1048576.0d)}, 1, "%.1f MB", "format(...)");
        }
        return j11 + " bytes";
    }
}
