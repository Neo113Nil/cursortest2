package JZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    @NotNull
    private final String page;

    public a(@NotNull String page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.page = page;
    }
}
