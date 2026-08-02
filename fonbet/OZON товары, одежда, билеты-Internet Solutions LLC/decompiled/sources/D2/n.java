package D2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String type, String str) {
        super(type, str);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
