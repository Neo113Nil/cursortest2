package D2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String type, String str) {
        super(str != null ? str.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
