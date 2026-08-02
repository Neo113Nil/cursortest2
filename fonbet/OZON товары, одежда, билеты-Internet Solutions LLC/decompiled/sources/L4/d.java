package L4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {
    public static final void a(int i11, @NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i12 = 0; i12 < i11; i12++) {
            builder.append("?");
            if (i12 < i11 - 1) {
                builder.append(",");
            }
        }
    }
}
